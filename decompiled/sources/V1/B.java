package V1;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: c, reason: collision with root package name */
    public static final B f9311c = new B(0, 0);
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9312b;

    public B(long j7, long j8) {
        this.a = j7;
        this.f9312b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && B.class == obj.getClass()) {
            B b4 = (B) obj;
            if (this.a == b4.a && this.f9312b == b4.f9312b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f9312b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return A6.b.f(this.f9312b, "]", sb);
    }
}
