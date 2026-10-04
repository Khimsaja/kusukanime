package x6;

import O3.q;
import P3.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;
import p.I0;
import w6.AbstractC2217b;
import w6.G;
import w6.H;
import w6.n;
import w6.o;
import w6.u;
import w6.v;
import w6.y;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: o, reason: collision with root package name */
    public static final y f17530o;

    /* renamed from: l, reason: collision with root package name */
    public final ClassLoader f17531l;

    /* renamed from: m, reason: collision with root package name */
    public final o f17532m;

    /* renamed from: n, reason: collision with root package name */
    public final q f17533n;

    static {
        String str = y.f17190l;
        f17530o = I0.t("/");
    }

    public e(ClassLoader classLoader) {
        v vVar = o.f17171k;
        l.f("systemFileSystem", vVar);
        this.f17531l = classLoader;
        this.f17532m = vVar;
        this.f17533n = z1.c.C(new B3.q(17, this));
    }

    @Override // w6.o
    public final void b(y yVar) throws IOException {
        l.f("path", yVar);
        throw new IOException(this + " is read-only");
    }

    @Override // w6.o
    public final List i(y yVar) throws FileNotFoundException {
        l.f("dir", yVar);
        y yVar2 = f17530o;
        yVar2.getClass();
        String strR = c.b(yVar2, yVar, true).c(yVar2).f17191k.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z7 = false;
        for (O3.l lVar : (List) this.f17533n.getValue()) {
            o oVar = (o) lVar.f7528k;
            y yVar3 = (y) lVar.f7529l;
            try {
                List listI = oVar.i(yVar3.d(strR));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listI) {
                    if (I0.p((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y yVar4 = (y) it.next();
                    l.f("<this>", yVar4);
                    arrayList2.add(yVar2.d(AbstractC2517v.Q(AbstractC2510o.o0(yVar4.f17191k.r(), yVar3.f17191k.r()), '\\', '/')));
                }
                P3.v.e0(linkedHashSet, arrayList2);
                z7 = true;
            } catch (IOException unused) {
            }
        }
        if (z7) {
            return P3.q.S0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // w6.o
    public final n m(y yVar) {
        l.f("path", yVar);
        if (!I0.p(yVar)) {
            return null;
        }
        y yVar2 = f17530o;
        yVar2.getClass();
        String strR = c.b(yVar2, yVar, true).c(yVar2).f17191k.r();
        for (O3.l lVar : (List) this.f17533n.getValue()) {
            n nVarM = ((o) lVar.f7528k).m(((y) lVar.f7529l).d(strR));
            if (nVarM != null) {
                return nVarM;
            }
        }
        return null;
    }

    @Override // w6.o
    public final u s(y yVar) throws FileNotFoundException {
        if (!I0.p(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f17530o;
        yVar2.getClass();
        String strR = c.b(yVar2, yVar, true).c(yVar2).f17191k.r();
        for (O3.l lVar : (List) this.f17533n.getValue()) {
            try {
                return ((o) lVar.f7528k).s(((y) lVar.f7529l).d(strR));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // w6.o
    public final G v(y yVar) throws IOException {
        l.f("file", yVar);
        throw new IOException(this + " is read-only");
    }

    @Override // w6.o
    public final H x(y yVar) throws IOException {
        l.f("file", yVar);
        if (!I0.p(yVar)) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        y yVar2 = f17530o;
        yVar2.getClass();
        URL resource = this.f17531l.getResource(c.b(yVar2, yVar, false).c(yVar2).f17191k.r());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + yVar);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        l.e("getInputStream(...)", inputStream);
        return AbstractC2217b.h(inputStream);
    }
}
