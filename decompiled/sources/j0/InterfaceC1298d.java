package j0;

import H1.e0;
import T0.k;
import android.graphics.Paint;
import f1.AbstractC0870c;
import h0.AbstractC0968M;
import h0.AbstractC0993p;
import h0.C0975U;
import h0.C0985h;
import h0.C0987j;
import h0.C0990m;
import h0.InterfaceC0967L;
import h0.InterfaceC0995r;
import kotlin.jvm.internal.l;
import y0.C2351F;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1298d extends T0.b {
    static void A(InterfaceC1298d interfaceC1298d, C0985h c0985h, long j7, long j8, float f5, C0990m c0990m, int i7, int i8) {
        interfaceC1298d.t0(c0985h, 0L, j7, (i8 & 16) != 0 ? j7 : j8, (i8 & 32) != 0 ? 1.0f : f5, c0990m, (i8 & 512) != 0 ? 1 : i7);
    }

    static void F(C2351F c2351f, C0975U c0975u, long j7, long j8, float f5, float f7, int i7) {
        if ((i7 & 64) != 0) {
            f7 = 1.0f;
        }
        C1296b c1296b = c2351f.f17696k;
        InterfaceC0995r interfaceC0995r = c1296b.f12204k.f12202c;
        e0 e0VarG = c1296b.f12207n;
        if (e0VarG == null) {
            e0VarG = AbstractC0968M.g();
            e0VarG.m(1);
            c1296b.f12207n = e0VarG;
        }
        c0975u.a(f7, c1296b.d(), e0VarG);
        if (!l.a((C0990m) e0VarG.f3454d, null)) {
            e0VarG.g(null);
        }
        if (e0VarG.a != 3) {
            e0VarG.e(3);
        }
        Paint paint = (Paint) e0VarG.f3452b;
        if (paint.getStrokeWidth() != f5) {
            e0VarG.l(f5);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) e0VarG.f3452b).setStrokeMiter(4.0f);
        }
        if (e0VarG.a() != 0) {
            e0VarG.j(0);
        }
        if (e0VarG.b() != 0) {
            e0VarG.k(0);
        }
        if (!paint.isFilterBitmap()) {
            e0VarG.h(1);
        }
        interfaceC0995r.q(j7, j8, e0VarG);
    }

    static /* synthetic */ void R(InterfaceC1298d interfaceC1298d, long j7, long j8, long j9, float f5, int i7) {
        if ((i7 & 2) != 0) {
            j8 = 0;
        }
        long j10 = j8;
        interfaceC1298d.g0(j7, j10, (i7 & 4) != 0 ? s0(interfaceC1298d.d(), j10) : j9, (i7 & 8) != 0 ? 1.0f : f5, (i7 & 64) != 0 ? 3 : 0);
    }

    static void Z(C2351F c2351f, C0975U c0975u, long j7, long j8, long j9, AbstractC1299e abstractC1299e, int i7) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        long j10 = j7;
        c2351f.f(c0975u, j10, (i7 & 4) != 0 ? s0(c2351f.f17696k.d(), j10) : j8, j9, 1.0f, (i7 & 32) != 0 ? g.a : abstractC1299e);
    }

    static /* synthetic */ void e0(InterfaceC1298d interfaceC1298d, InterfaceC0967L interfaceC0967L, AbstractC0993p abstractC0993p, float f5, h hVar, int i7) {
        if ((i7 & 4) != 0) {
            f5 = 1.0f;
        }
        float f7 = f5;
        AbstractC1299e abstractC1299e = hVar;
        if ((i7 & 8) != 0) {
            abstractC1299e = g.a;
        }
        interfaceC1298d.N(interfaceC0967L, abstractC0993p, f7, abstractC1299e, (i7 & 32) != 0 ? 3 : 0);
    }

    static void o0(C2351F c2351f, AbstractC0993p abstractC0993p, long j7, long j8, float f5, AbstractC1299e abstractC1299e, int i7) {
        if ((i7 & 2) != 0) {
            j7 = 0;
        }
        long j9 = j7;
        if ((i7 & 4) != 0) {
            j8 = s0(c2351f.f17696k.d(), j9);
        }
        c2351f.e(abstractC0993p, j9, j8, (i7 & 8) != 0 ? 1.0f : f5, (i7 & 16) != 0 ? g.a : abstractC1299e);
    }

    static long s0(long j7, long j8) {
        return AbstractC0870c.F(g0.f.d(j7) - g0.c.d(j8), g0.f.b(j7) - g0.c.e(j8));
    }

    static /* synthetic */ void u(InterfaceC1298d interfaceC1298d, long j7, float f5, long j8, int i7) {
        if ((i7 & 4) != 0) {
            j8 = interfaceC1298d.V();
        }
        interfaceC1298d.q(f5, j7, j8);
    }

    B2.l D();

    void G(long j7, float f5, float f7, long j8, long j9, AbstractC1299e abstractC1299e);

    void J(C0987j c0987j, long j7, AbstractC1299e abstractC1299e);

    void N(InterfaceC0967L interfaceC0967L, AbstractC0993p abstractC0993p, float f5, AbstractC1299e abstractC1299e, int i7);

    void U(long j7, long j8, long j9, float f5, int i7);

    default long V() {
        return AbstractC0870c.Q(D().A());
    }

    default long d() {
        return D().A();
    }

    void g0(long j7, long j8, long j9, float f5, int i7);

    k getLayoutDirection();

    void q(float f5, long j7, long j8);

    void t(long j7, long j8, long j9, long j10);

    void t0(C0985h c0985h, long j7, long j8, long j9, float f5, C0990m c0990m, int i7);
}
