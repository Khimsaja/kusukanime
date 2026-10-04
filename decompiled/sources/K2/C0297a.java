package K2;

/* renamed from: K2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297a {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4547b;

    /* renamed from: c, reason: collision with root package name */
    public int f4548c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C0297a)) {
                return false;
            }
            C0297a c0297a = (C0297a) obj;
            int i7 = this.a;
            if (i7 != c0297a.a) {
                return false;
            }
            if (i7 != 8 || Math.abs(this.f4548c - this.f4547b) != 1 || this.f4548c != c0297a.f4547b || this.f4547b != c0297a.f4548c) {
                return this.f4548c == c0297a.f4548c && this.f4547b == c0297a.f4547b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.f4547b) * 31) + this.f4548c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i7 = this.a;
        sb.append(i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f4547b);
        sb.append("c:");
        sb.append(this.f4548c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
