package p;

import b1.AbstractC0703b;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1765q extends AbstractC1766r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f14092b;

    /* renamed from: c, reason: collision with root package name */
    public float f14093c;

    /* renamed from: d, reason: collision with root package name */
    public float f14094d;

    public C1765q(float f5, float f7, float f8, float f9) {
        this.a = f5;
        this.f14092b = f7;
        this.f14093c = f8;
        this.f14094d = f9;
    }

    @Override // p.AbstractC1766r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.a;
        }
        if (i7 == 1) {
            return this.f14092b;
        }
        if (i7 == 2) {
            return this.f14093c;
        }
        if (i7 != 3) {
            return 0.0f;
        }
        return this.f14094d;
    }

    @Override // p.AbstractC1766r
    public final int b() {
        return 4;
    }

    @Override // p.AbstractC1766r
    public final AbstractC1766r c() {
        return new C1765q(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p.AbstractC1766r
    public final void d() {
        this.a = 0.0f;
        this.f14092b = 0.0f;
        this.f14093c = 0.0f;
        this.f14094d = 0.0f;
    }

    @Override // p.AbstractC1766r
    public final void e(float f5, int i7) {
        if (i7 == 0) {
            this.a = f5;
            return;
        }
        if (i7 == 1) {
            this.f14092b = f5;
        } else if (i7 == 2) {
            this.f14093c = f5;
        } else {
            if (i7 != 3) {
                return;
            }
            this.f14094d = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1765q)) {
            return false;
        }
        C1765q c1765q = (C1765q) obj;
        return c1765q.a == this.a && c1765q.f14092b == this.f14092b && c1765q.f14093c == this.f14093c && c1765q.f14094d == this.f14094d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14094d) + AbstractC0703b.b(this.f14093c, AbstractC0703b.b(this.f14092b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.f14092b + ", v3 = " + this.f14093c + ", v4 = " + this.f14094d;
    }
}
