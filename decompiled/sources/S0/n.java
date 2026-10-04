package S0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: c, reason: collision with root package name */
    public static final n f8718c = new n(1.0f, 0.0f);
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8719b;

    public n(float f5, float f7) {
        this.a = f5;
        this.f8719b = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.a == nVar.a && this.f8719b == nVar.f8719b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8719b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return AbstractC0703b.k(sb, this.f8719b, ')');
    }
}
