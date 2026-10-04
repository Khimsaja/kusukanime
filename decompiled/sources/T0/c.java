package T0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: k, reason: collision with root package name */
    public final float f8834k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8835l;

    public c(float f5, float f7) {
        this.f8834k = f5;
        this.f8835l = f7;
    }

    @Override // T0.b
    public final float a() {
        return this.f8834k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f8834k, cVar.f8834k) == 0 && Float.compare(this.f8835l, cVar.f8835l) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8835l) + (Float.hashCode(this.f8834k) * 31);
    }

    @Override // T0.b
    public final float n() {
        return this.f8835l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.f8834k);
        sb.append(", fontScale=");
        return AbstractC0703b.k(sb, this.f8835l, ')');
    }
}
