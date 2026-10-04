package y1;

/* renamed from: y1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2397t {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18130b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18131c;

    /* renamed from: d, reason: collision with root package name */
    public final float f18132d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18133e;

    static {
        new C2396s().a();
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
        B1.K.B(4);
    }

    public C2397t(C2396s c2396s) {
        long j7 = c2396s.a;
        long j8 = c2396s.f18126b;
        long j9 = c2396s.f18127c;
        float f5 = c2396s.f18128d;
        float f7 = c2396s.f18129e;
        this.a = j7;
        this.f18130b = j8;
        this.f18131c = j9;
        this.f18132d = f5;
        this.f18133e = f7;
    }

    public final C2396s a() {
        C2396s c2396s = new C2396s();
        c2396s.a = this.a;
        c2396s.f18126b = this.f18130b;
        c2396s.f18127c = this.f18131c;
        c2396s.f18128d = this.f18132d;
        c2396s.f18129e = this.f18133e;
        return c2396s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2397t)) {
            return false;
        }
        C2397t c2397t = (C2397t) obj;
        return this.a == c2397t.a && this.f18130b == c2397t.f18130b && this.f18131c == c2397t.f18131c && this.f18132d == c2397t.f18132d && this.f18133e == c2397t.f18133e;
    }

    public final int hashCode() {
        long j7 = this.a;
        long j8 = this.f18130b;
        int i7 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j9 = this.f18131c;
        int i8 = (i7 + ((int) ((j9 >>> 32) ^ j9))) * 31;
        float f5 = this.f18132d;
        int iFloatToIntBits = (i8 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f7 = this.f18133e;
        return iFloatToIntBits + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0);
    }
}
