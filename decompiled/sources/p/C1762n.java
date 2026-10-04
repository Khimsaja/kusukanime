package p;

/* renamed from: p.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1762n extends AbstractC1766r {
    public float a;

    public C1762n(float f5) {
        this.a = f5;
    }

    @Override // p.AbstractC1766r
    public final float a(int i7) {
        if (i7 == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // p.AbstractC1766r
    public final int b() {
        return 1;
    }

    @Override // p.AbstractC1766r
    public final AbstractC1766r c() {
        return new C1762n(0.0f);
    }

    @Override // p.AbstractC1766r
    public final void d() {
        this.a = 0.0f;
    }

    @Override // p.AbstractC1766r
    public final void e(float f5, int i7) {
        if (i7 == 0) {
            this.a = f5;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1762n) && ((C1762n) obj).a == this.a;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
