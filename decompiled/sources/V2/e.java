package V2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import w6.G;
import w6.H;
import w6.n;
import w6.o;
import w6.u;
import w6.v;
import w6.y;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: l, reason: collision with root package name */
    public final v f9457l;

    public e(v vVar) {
        l.f("delegate", vVar);
        this.f9457l = vVar;
    }

    public final void H(y yVar, y yVar2) {
        l.f("source", yVar);
        l.f("target", yVar2);
        this.f9457l.H(yVar, yVar2);
    }

    @Override // w6.o
    public final void b(y yVar) {
        l.f("path", yVar);
        this.f9457l.b(yVar);
    }

    @Override // w6.o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9457l.getClass();
    }

    @Override // w6.o
    public final List i(y yVar) {
        l.f("dir", yVar);
        List listI = this.f9457l.i(yVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) listI).iterator();
        while (it.hasNext()) {
            y yVar2 = (y) it.next();
            l.f("path", yVar2);
            arrayList.add(yVar2);
        }
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    @Override // w6.o
    public final n m(y yVar) {
        l.f("path", yVar);
        n nVarM = this.f9457l.m(yVar);
        if (nVarM == null) {
            return null;
        }
        y yVar2 = nVarM.f17165c;
        if (yVar2 == null) {
            return nVarM;
        }
        Map map = nVarM.f17170h;
        l.f("extras", map);
        return new n(nVarM.a, nVarM.f17164b, yVar2, nVarM.f17166d, nVarM.f17167e, nVarM.f17168f, nVarM.f17169g, map);
    }

    @Override // w6.o
    public final u s(y yVar) {
        return this.f9457l.s(yVar);
    }

    public final String toString() {
        return kotlin.jvm.internal.y.a.b(e.class).n() + '(' + this.f9457l + ')';
    }

    @Override // w6.o
    public final G v(y yVar) throws IOException {
        n nVarM;
        y yVarB = yVar.b();
        if (yVarB != null) {
            P3.l lVar = new P3.l();
            while (yVarB != null && !g(yVarB)) {
                lVar.addFirst(yVarB);
                yVarB = yVarB.b();
            }
            Iterator<E> it = lVar.iterator();
            while (it.hasNext()) {
                y yVar2 = (y) it.next();
                l.f("dir", yVar2);
                v vVar = this.f9457l;
                vVar.getClass();
                if (!yVar2.e().mkdir() && ((nVarM = vVar.m(yVar2)) == null || !nVarM.f17164b)) {
                    throw new IOException("failed to create directory: " + yVar2);
                }
            }
        }
        return this.f9457l.v(yVar);
    }

    @Override // w6.o
    public final H x(y yVar) {
        l.f("file", yVar);
        return this.f9457l.x(yVar);
    }
}
