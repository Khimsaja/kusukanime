package p;

/* renamed from: p.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1763o extends AbstractC1766r {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f14083b;

    public C1763o(float f5, float f7) {
        this.a = f5;
        this.f14083b = f7;
    }

    @Override // p.AbstractC1766r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.a;
        }
        if (i7 != 1) {
            return 0.0f;
        }
        return this.f14083b;
    }

    @Override // p.AbstractC1766r
    public final int b() {
        return 2;
    }

    @Override // p.AbstractC1766r
    public final AbstractC1766r c() {
        return new C1763o(0.0f, 0.0f);
    }

    @Override // p.AbstractC1766r
    public final void d() {
        this.a = 0.0f;
        this.f14083b = 0.0f;
    }

    @Override // p.AbstractC1766r
    public final void e(float f5, int i7) {
        if (i7 == 0) {
            this.a = f5;
        } else {
            if (i7 != 1) {
                return;
            }
            this.f14083b = f5;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1763o)) {
            return false;
        }
        C1763o c1763o = (C1763o) obj;
        return c1763o.a == this.a && c1763o.f14083b == this.f14083b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14083b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.f14083b;
    }
}
