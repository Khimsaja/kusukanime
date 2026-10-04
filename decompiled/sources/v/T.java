package v;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class T {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16411c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16412d;

    public T(int i7, int i8, int i9, int i10) {
        this.a = i7;
        this.f16410b = i8;
        this.f16411c = i9;
        this.f16412d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t7 = (T) obj;
        return this.a == t7.a && this.f16410b == t7.f16410b && this.f16411c == t7.f16411c && this.f16412d == t7.f16412d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f16410b) * 31) + this.f16411c) * 31) + this.f16412d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsValues(left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.f16410b);
        sb.append(", right=");
        sb.append(this.f16411c);
        sb.append(", bottom=");
        return AbstractC0703b.l(sb, this.f16412d, ')');
    }
}
