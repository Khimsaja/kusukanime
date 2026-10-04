package L;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import b1.AbstractC0703b;
import p.C1743c;
import p.C1761m;
import u.C2063b;

/* loaded from: classes.dex */
public final class E {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5039b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5040c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5041d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5042e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5043f;

    public E(float f5, float f7, float f8, float f9, float f10, float f11) {
        this.a = f5;
        this.f5039b = f7;
        this.f5040c = f8;
        this.f5041d = f9;
        this.f5042e = f10;
        this.f5043f = f11;
    }

    public final O.R0 a(boolean z7, u.k kVar, C0510p c0510p, int i7) {
        C1743c c1743c;
        c0510p.R(-1763481333);
        c0510p.R(-734838460);
        Object obj = C0502l.a;
        float f5 = this.a;
        if (kVar == null) {
            Object objH = c0510p.H();
            if (objH == obj) {
                objH = C0486d.K(new T0.e(f5), O.T.f7049p);
                c0510p.b0(objH);
            }
            O.Z z8 = (O.Z) objH;
            c0510p.p(false);
            c0510p.p(false);
            return z8;
        }
        c0510p.p(false);
        Object objH2 = c0510p.H();
        if (objH2 == obj) {
            objH2 = new Y.r();
            c0510p.b0(objH2);
        }
        Y.r rVar = (Y.r) objH2;
        boolean z9 = true;
        boolean z10 = (((i7 & 112) ^ 48) > 32 && c0510p.f(kVar)) || (i7 & 48) == 32;
        Object objH3 = c0510p.H();
        if (z10 || objH3 == obj) {
            objH3 = new C(kVar, rVar, null);
            c0510p.b0(objH3);
        }
        C0486d.e(c0510p, (e4.n) objH3, kVar);
        u.i iVar = (u.i) P3.q.B0(rVar);
        if (!z7) {
            f5 = this.f5043f;
        } else if (iVar instanceof u.m) {
            f5 = this.f5039b;
        } else if (iVar instanceof u.g) {
            f5 = this.f5041d;
        } else if (iVar instanceof u.d) {
            f5 = this.f5040c;
        } else if (iVar instanceof C2063b) {
            f5 = this.f5042e;
        }
        Object objH4 = c0510p.H();
        if (objH4 == obj) {
            objH4 = new C1743c(new T0.e(f5), p.C0.f13840c, null, 12);
            c0510p.b0(objH4);
        }
        C1743c c1743c2 = (C1743c) objH4;
        T0.e eVar = new T0.e(f5);
        boolean zH = c0510p.h(c1743c2) | c0510p.c(f5) | ((((i7 & 14) ^ 6) > 4 && c0510p.g(z7)) || (i7 & 6) == 4);
        if ((((i7 & 896) ^ 384) <= 256 || !c0510p.f(this)) && (i7 & 384) != 256) {
            z9 = false;
        }
        boolean zH2 = zH | z9 | c0510p.h(iVar);
        Object objH5 = c0510p.H();
        if (zH2 || objH5 == obj) {
            c1743c = c1743c2;
            Object d4 = new D(c1743c, f5, z7, this, iVar, null);
            c0510p.b0(d4);
            objH5 = d4;
        } else {
            c1743c = c1743c2;
        }
        C0486d.e(c0510p, (e4.n) objH5, eVar);
        C1761m c1761m = c1743c.f13958c;
        c0510p.p(false);
        return c1761m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return T0.e.a(this.a, e7.a) && T0.e.a(this.f5039b, e7.f5039b) && T0.e.a(this.f5040c, e7.f5040c) && T0.e.a(this.f5041d, e7.f5041d) && T0.e.a(this.f5043f, e7.f5043f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5043f) + AbstractC0703b.b(this.f5041d, AbstractC0703b.b(this.f5040c, AbstractC0703b.b(this.f5039b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
