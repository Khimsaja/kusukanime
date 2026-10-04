package L;

import b1.AbstractC0703b;

/* renamed from: L.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0362d2 {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5504b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5505c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5506d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5507e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5508f;

    public C0362d2(float f5, float f7, float f8, float f9, float f10, float f11) {
        this.a = f5;
        this.f5504b = f7;
        this.f5505c = f8;
        this.f5506d = f9;
        this.f5507e = f10;
        this.f5508f = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0362d2)) {
            return false;
        }
        C0362d2 c0362d2 = (C0362d2) obj;
        return T0.e.a(this.a, c0362d2.a) && T0.e.a(this.f5504b, c0362d2.f5504b) && T0.e.a(this.f5505c, c0362d2.f5505c) && T0.e.a(this.f5506d, c0362d2.f5506d) && T0.e.a(this.f5508f, c0362d2.f5508f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5508f) + AbstractC0703b.b(this.f5506d, AbstractC0703b.b(this.f5505c, AbstractC0703b.b(this.f5504b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
