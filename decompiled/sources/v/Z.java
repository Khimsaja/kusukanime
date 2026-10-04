package v;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class Z implements Y {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16423b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16424c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16425d;

    public Z(float f5, float f7, float f8, float f9) {
        this.a = f5;
        this.f16423b = f7;
        this.f16424c = f8;
        this.f16425d = f9;
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Start padding must be non-negative");
        }
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Top padding must be non-negative");
        }
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("End padding must be non-negative");
        }
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("Bottom padding must be non-negative");
        }
    }

    @Override // v.Y
    public final float a() {
        return this.f16425d;
    }

    @Override // v.Y
    public final float b(T0.k kVar) {
        return kVar == T0.k.f8844k ? this.a : this.f16424c;
    }

    @Override // v.Y
    public final float c() {
        return this.f16423b;
    }

    @Override // v.Y
    public final float d(T0.k kVar) {
        return kVar == T0.k.f8844k ? this.f16424c : this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z7 = (Z) obj;
        return T0.e.a(this.a, z7.a) && T0.e.a(this.f16423b, z7.f16423b) && T0.e.a(this.f16424c, z7.f16424c) && T0.e.a(this.f16425d, z7.f16425d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16425d) + AbstractC0703b.b(this.f16424c, AbstractC0703b.b(this.f16423b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) T0.e.b(this.a)) + ", top=" + ((Object) T0.e.b(this.f16423b)) + ", end=" + ((Object) T0.e.b(this.f16424c)) + ", bottom=" + ((Object) T0.e.b(this.f16425d)) + ')';
    }
}
