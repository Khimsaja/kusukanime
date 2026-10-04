package p;

import b1.AbstractC0703b;

/* renamed from: p.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1764p extends AbstractC1766r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f14088b;

    /* renamed from: c, reason: collision with root package name */
    public float f14089c;

    public C1764p(float f5, float f7, float f8) {
        this.a = f5;
        this.f14088b = f7;
        this.f14089c = f8;
    }

    @Override // p.AbstractC1766r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.a;
        }
        if (i7 == 1) {
            return this.f14088b;
        }
        if (i7 != 2) {
            return 0.0f;
        }
        return this.f14089c;
    }

    @Override // p.AbstractC1766r
    public final int b() {
        return 3;
    }

    @Override // p.AbstractC1766r
    public final AbstractC1766r c() {
        return new C1764p(0.0f, 0.0f, 0.0f);
    }

    @Override // p.AbstractC1766r
    public final void d() {
        this.a = 0.0f;
        this.f14088b = 0.0f;
        this.f14089c = 0.0f;
    }

    @Override // p.AbstractC1766r
    public final void e(float f5, int i7) {
        if (i7 == 0) {
            this.a = f5;
        } else if (i7 == 1) {
            this.f14088b = f5;
        } else {
            if (i7 != 2) {
                return;
            }
            this.f14089c = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1764p)) {
            return false;
        }
        C1764p c1764p = (C1764p) obj;
        return c1764p.a == this.a && c1764p.f14088b == this.f14088b && c1764p.f14089c == this.f14089c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14089c) + AbstractC0703b.b(this.f14088b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.f14088b + ", v3 = " + this.f14089c;
    }
}
