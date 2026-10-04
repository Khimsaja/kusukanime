package g0;

/* loaded from: classes.dex */
public final class b {
    public float a;

    /* renamed from: b, reason: collision with root package name */
    public float f11655b;

    /* renamed from: c, reason: collision with root package name */
    public float f11656c;

    /* renamed from: d, reason: collision with root package name */
    public float f11657d;

    public final void a(float f5, float f7, float f8, float f9) {
        this.a = Math.max(f5, this.a);
        this.f11655b = Math.max(f7, this.f11655b);
        this.f11656c = Math.min(f8, this.f11656c);
        this.f11657d = Math.min(f9, this.f11657d);
    }

    public final boolean b() {
        return this.a >= this.f11656c || this.f11655b >= this.f11657d;
    }

    public final String toString() {
        return "MutableRect(" + e3.c.K(this.a) + ", " + e3.c.K(this.f11655b) + ", " + e3.c.K(this.f11656c) + ", " + e3.c.K(this.f11657d) + ')';
    }
}
