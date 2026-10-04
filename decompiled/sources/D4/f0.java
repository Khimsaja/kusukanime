package D4;

import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class f0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1583c;

    public f0(int i7, int i8, int i9) {
        this.a = i7;
        this.f1582b = i8;
        this.f1583c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.a == f0Var.a && this.f1582b == f0Var.f1582b && this.f1583c == f0Var.f1583c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1583c) + AbstractC1755i.a(this.f1582b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        sb.append(this.f1582b);
        sb.append('.');
        sb.append(this.f1583c);
        return sb.toString();
    }
}
