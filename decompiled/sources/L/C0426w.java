package L;

import b1.AbstractC0703b;

/* renamed from: L.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0426w {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5881b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5882c;

    /* renamed from: d, reason: collision with root package name */
    public final float f5883d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5884e;

    public C0426w(float f5, float f7, float f8, float f9, float f10) {
        this.a = f5;
        this.f5881b = f7;
        this.f5882c = f8;
        this.f5883d = f9;
        this.f5884e = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0426w)) {
            return false;
        }
        C0426w c0426w = (C0426w) obj;
        return T0.e.a(this.a, c0426w.a) && T0.e.a(this.f5881b, c0426w.f5881b) && T0.e.a(this.f5882c, c0426w.f5882c) && T0.e.a(this.f5883d, c0426w.f5883d) && T0.e.a(this.f5884e, c0426w.f5884e);
    }

    public final int hashCode() {
        return Float.hashCode(this.f5884e) + AbstractC0703b.b(this.f5883d, AbstractC0703b.b(this.f5882c, AbstractC0703b.b(this.f5881b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
