package j0;

import B2.l;
import D6.r;
import H1.e0;
import T0.k;
import android.graphics.Paint;
import android.graphics.Shader;
import g0.AbstractC0932a;
import h0.AbstractC0968M;
import h0.AbstractC0993p;
import h0.C0985h;
import h0.C0987j;
import h0.C0990m;
import h0.C0998u;
import h0.InterfaceC0967L;
import h0.InterfaceC0995r;

/* renamed from: j0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296b implements InterfaceC1298d {

    /* renamed from: k, reason: collision with root package name */
    public final C1295a f12204k;

    /* renamed from: l, reason: collision with root package name */
    public final l f12205l;

    /* renamed from: m, reason: collision with root package name */
    public e0 f12206m;

    /* renamed from: n, reason: collision with root package name */
    public e0 f12207n;

    public C1296b() {
        T0.c cVar = AbstractC1297c.a;
        k kVar = k.f8844k;
        f fVar = new f();
        C1295a c1295a = new C1295a();
        c1295a.a = cVar;
        c1295a.f12201b = kVar;
        c1295a.f12202c = fVar;
        c1295a.f12203d = 0L;
        this.f12204k = c1295a;
        this.f12205l = new l(this);
    }

    public static e0 b(C1296b c1296b, long j7, AbstractC1299e abstractC1299e, float f5, int i7) {
        e0 e0VarF = c1296b.f(abstractC1299e);
        if (f5 != 1.0f) {
            j7 = C0998u.b(C0998u.d(j7) * f5, j7);
        }
        if (!C0998u.c(AbstractC0968M.c(((Paint) e0VarF.f3452b).getColor()), j7)) {
            e0VarF.f(j7);
        }
        if (((Shader) e0VarF.f3453c) != null) {
            e0VarF.i(null);
        }
        if (!kotlin.jvm.internal.l.a((C0990m) e0VarF.f3454d, null)) {
            e0VarF.g(null);
        }
        if (e0VarF.a != i7) {
            e0VarF.e(i7);
        }
        if (((Paint) e0VarF.f3452b).isFilterBitmap()) {
            return e0VarF;
        }
        e0VarF.h(1);
        return e0VarF;
    }

    @Override // j0.InterfaceC1298d
    public final l D() {
        return this.f12205l;
    }

    @Override // j0.InterfaceC1298d
    public final void G(long j7, float f5, float f7, long j8, long j9, AbstractC1299e abstractC1299e) {
        this.f12204k.f12202c.n(g0.c.d(j8), g0.c.e(j8), g0.f.d(j9) + g0.c.d(j8), g0.f.b(j9) + g0.c.e(j8), f5, f7, b(this, j7, abstractC1299e, 1.0f, 3));
    }

    @Override // j0.InterfaceC1298d
    public final void J(C0987j c0987j, long j7, AbstractC1299e abstractC1299e) {
        this.f12204k.f12202c.c(c0987j, b(this, j7, abstractC1299e, 1.0f, 3));
    }

    @Override // j0.InterfaceC1298d
    public final void N(InterfaceC0967L interfaceC0967L, AbstractC0993p abstractC0993p, float f5, AbstractC1299e abstractC1299e, int i7) {
        this.f12204k.f12202c.c(interfaceC0967L, c(abstractC0993p, abstractC1299e, f5, null, i7, 1));
    }

    @Override // j0.InterfaceC1298d
    public final void U(long j7, long j8, long j9, float f5, int i7) {
        InterfaceC0995r interfaceC0995r = this.f12204k.f12202c;
        e0 e0VarG = this.f12207n;
        if (e0VarG == null) {
            e0VarG = AbstractC0968M.g();
            e0VarG.m(1);
            this.f12207n = e0VarG;
        }
        if (!C0998u.c(AbstractC0968M.c(((Paint) e0VarG.f3452b).getColor()), j7)) {
            e0VarG.f(j7);
        }
        if (((Shader) e0VarG.f3453c) != null) {
            e0VarG.i(null);
        }
        if (!kotlin.jvm.internal.l.a((C0990m) e0VarG.f3454d, null)) {
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
        if (e0VarG.a() != i7) {
            e0VarG.j(i7);
        }
        if (e0VarG.b() != 0) {
            e0VarG.k(0);
        }
        if (!paint.isFilterBitmap()) {
            e0VarG.h(1);
        }
        interfaceC0995r.q(j8, j9, e0VarG);
    }

    @Override // T0.b
    public final float a() {
        return this.f12204k.a.a();
    }

    public final e0 c(AbstractC0993p abstractC0993p, AbstractC1299e abstractC1299e, float f5, C0990m c0990m, int i7, int i8) {
        e0 e0VarF = f(abstractC1299e);
        if (abstractC0993p != null) {
            abstractC0993p.a(f5, d(), e0VarF);
        } else {
            if (((Shader) e0VarF.f3453c) != null) {
                e0VarF.i(null);
            }
            long jC = AbstractC0968M.c(((Paint) e0VarF.f3452b).getColor());
            long j7 = C0998u.f11829b;
            if (!C0998u.c(jC, j7)) {
                e0VarF.f(j7);
            }
            if (((Paint) e0VarF.f3452b).getAlpha() / 255.0f != f5) {
                e0VarF.d(f5);
            }
        }
        if (!kotlin.jvm.internal.l.a((C0990m) e0VarF.f3454d, c0990m)) {
            e0VarF.g(c0990m);
        }
        if (e0VarF.a != i7) {
            e0VarF.e(i7);
        }
        if (((Paint) e0VarF.f3452b).isFilterBitmap() == i8) {
            return e0VarF;
        }
        e0VarF.h(i8);
        return e0VarF;
    }

    public final void e(C0985h c0985h, C0990m c0990m) {
        this.f12204k.f12202c.t(c0985h, c(null, g.a, 1.0f, c0990m, 3, 1));
    }

    public final e0 f(AbstractC1299e abstractC1299e) {
        if (kotlin.jvm.internal.l.a(abstractC1299e, g.a)) {
            e0 e0Var = this.f12206m;
            if (e0Var != null) {
                return e0Var;
            }
            e0 e0VarG = AbstractC0968M.g();
            e0VarG.m(0);
            this.f12206m = e0VarG;
            return e0VarG;
        }
        if (!(abstractC1299e instanceof h)) {
            throw new r();
        }
        e0 e0VarG2 = this.f12207n;
        if (e0VarG2 == null) {
            e0VarG2 = AbstractC0968M.g();
            e0VarG2.m(1);
            this.f12207n = e0VarG2;
        }
        Paint paint = (Paint) e0VarG2.f3452b;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) abstractC1299e;
        float f5 = hVar.a;
        if (strokeWidth != f5) {
            e0VarG2.l(f5);
        }
        int iA = e0VarG2.a();
        int i7 = hVar.f12209c;
        if (iA != i7) {
            e0VarG2.j(i7);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f7 = hVar.f12208b;
        if (strokeMiter != f7) {
            ((Paint) e0VarG2.f3452b).setStrokeMiter(f7);
        }
        int iB = e0VarG2.b();
        int i8 = hVar.f12210d;
        if (iB == i8) {
            return e0VarG2;
        }
        e0VarG2.k(i8);
        return e0VarG2;
    }

    @Override // j0.InterfaceC1298d
    public final void g0(long j7, long j8, long j9, float f5, int i7) {
        g gVar = g.a;
        this.f12204k.f12202c.d(g0.c.d(j8), g0.c.e(j8), g0.f.d(j9) + g0.c.d(j8), g0.f.b(j9) + g0.c.e(j8), b(this, j7, gVar, f5, i7));
    }

    @Override // j0.InterfaceC1298d
    public final k getLayoutDirection() {
        return this.f12204k.f12201b;
    }

    @Override // T0.b
    public final float n() {
        return this.f12204k.a.n();
    }

    @Override // j0.InterfaceC1298d
    public final void q(float f5, long j7, long j8) {
        this.f12204k.f12202c.h(f5, j8, b(this, j7, g.a, 1.0f, 3));
    }

    @Override // j0.InterfaceC1298d
    public final void t(long j7, long j8, long j9, long j10) {
        g gVar = g.a;
        this.f12204k.f12202c.j(g0.c.d(j8), g0.c.e(j8), g0.f.d(j9) + g0.c.d(j8), g0.f.b(j9) + g0.c.e(j8), AbstractC0932a.b(j10), AbstractC0932a.c(j10), b(this, j7, gVar, 1.0f, 3));
    }

    @Override // j0.InterfaceC1298d
    public final void t0(C0985h c0985h, long j7, long j8, long j9, float f5, C0990m c0990m, int i7) {
        this.f12204k.f12202c.k(c0985h, j7, j8, j9, c(null, g.a, f5, c0990m, 3, i7));
    }
}
