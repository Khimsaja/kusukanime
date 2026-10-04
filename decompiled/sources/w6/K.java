package w6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import p.I0;

/* loaded from: classes.dex */
public final class K extends o {

    /* renamed from: o, reason: collision with root package name */
    public static final y f17129o;

    /* renamed from: l, reason: collision with root package name */
    public final y f17130l;

    /* renamed from: m, reason: collision with root package name */
    public final o f17131m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashMap f17132n;

    static {
        String str = y.f17190l;
        f17129o = I0.t("/");
    }

    public K(y yVar, o oVar, LinkedHashMap linkedHashMap) {
        this.f17130l = yVar;
        this.f17131m = oVar;
        this.f17132n = linkedHashMap;
    }

    @Override // w6.o
    public final void b(y yVar) throws IOException {
        kotlin.jvm.internal.l.f("path", yVar);
        throw new IOException("zip file systems are read-only");
    }

    @Override // w6.o
    public final List i(y yVar) throws IOException {
        kotlin.jvm.internal.l.f("dir", yVar);
        y yVar2 = f17129o;
        yVar2.getClass();
        x6.g gVar = (x6.g) this.f17132n.get(x6.c.b(yVar2, yVar, true));
        if (gVar != null) {
            return P3.q.S0(gVar.f17550q);
        }
        throw new IOException("not a directory: " + yVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0125  */
    @Override // w6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w6.n m(w6.y r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.K.m(w6.y):w6.n");
    }

    @Override // w6.o
    public final u s(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // w6.o
    public final G v(y yVar) throws IOException {
        kotlin.jvm.internal.l.f("file", yVar);
        throw new IOException("zip file systems are read-only");
    }

    @Override // w6.o
    public final H x(y yVar) throws Throwable {
        Throwable th;
        C c2;
        kotlin.jvm.internal.l.f("file", yVar);
        y yVar2 = f17129o;
        yVar2.getClass();
        x6.g gVar = (x6.g) this.f17132n.get(x6.c.b(yVar2, yVar, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + yVar);
        }
        u uVarS = this.f17131m.s(this.f17130l);
        try {
            c2 = AbstractC2217b.c(uVarS.e(gVar.f17541h));
            try {
                uVarS.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (uVarS != null) {
                try {
                    uVarS.close();
                } catch (Throwable th4) {
                    q0.c.j(th3, th4);
                }
            }
            th = th3;
            c2 = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.l.f("<this>", c2);
        x6.b.g(c2, null);
        int i7 = gVar.f17540g;
        long j7 = gVar.f17539f;
        if (i7 == 0) {
            return new x6.d(c2, j7, true);
        }
        return new x6.d(new t(AbstractC2217b.c(new x6.d(c2, gVar.f17538e, true)), new Inflater(true)), j7, false);
    }
}
