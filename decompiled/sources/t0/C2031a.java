package t0;

import b1.AbstractC0703b;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2031a {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public float f15880b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2031a)) {
            return false;
        }
        C2031a c2031a = (C2031a) obj;
        return this.a == c2031a.a && Float.compare(this.f15880b, c2031a.f15880b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15880b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.a);
        sb.append(", dataPoint=");
        return AbstractC0703b.k(sb, this.f15880b, ')');
    }
}
