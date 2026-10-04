package i0;

import b1.AbstractC0703b;

/* renamed from: i0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1035s {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11932b;

    public C1035s(float f5, float f7) {
        this.a = f5;
        this.f11932b = f7;
    }

    public final float[] a() {
        float f5 = this.a;
        float f7 = this.f11932b;
        return new float[]{f5 / f7, 1.0f, ((1.0f - f5) - f7) / f7};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1035s)) {
            return false;
        }
        C1035s c1035s = (C1035s) obj;
        return Float.compare(this.a, c1035s.a) == 0 && Float.compare(this.f11932b, c1035s.f11932b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11932b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhitePoint(x=");
        sb.append(this.a);
        sb.append(", y=");
        return AbstractC0703b.k(sb, this.f11932b, ')');
    }
}
