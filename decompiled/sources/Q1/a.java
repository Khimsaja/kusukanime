package Q1;

/* loaded from: classes.dex */
public final class a {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7841b;

    public a(long j7, long j8) {
        this.a = j7;
        this.f7841b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.f7841b == aVar.f7841b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.f7841b);
    }
}
