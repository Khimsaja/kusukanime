package n0;

import b1.AbstractC0703b;

/* renamed from: n0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1544k extends AbstractC1555v {

    /* renamed from: b, reason: collision with root package name */
    public final float f13183b;

    /* renamed from: c, reason: collision with root package name */
    public final float f13184c;

    public C1544k(float f5, float f7) {
        super(3);
        this.f13183b = f5;
        this.f13184c = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1544k)) {
            return false;
        }
        C1544k c1544k = (C1544k) obj;
        return Float.compare(this.f13183b, c1544k.f13183b) == 0 && Float.compare(this.f13184c, c1544k.f13184c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f13184c) + (Float.hashCode(this.f13183b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f13183b);
        sb.append(", y=");
        return AbstractC0703b.k(sb, this.f13184c, ')');
    }
}
