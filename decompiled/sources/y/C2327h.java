package y;

import b1.AbstractC0703b;

/* renamed from: y.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2327h {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17623b;

    public C2327h(int i7, int i8) {
        this.a = i7;
        this.f17623b = i8;
        if (i7 < 0) {
            throw new IllegalArgumentException("negative start index");
        }
        if (i8 < i7) {
            throw new IllegalArgumentException("end index greater than start");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2327h)) {
            return false;
        }
        C2327h c2327h = (C2327h) obj;
        return this.a == c2327h.a && this.f17623b == c2327h.f17623b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17623b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.a);
        sb.append(", end=");
        return AbstractC0703b.l(sb, this.f17623b, ')');
    }
}
