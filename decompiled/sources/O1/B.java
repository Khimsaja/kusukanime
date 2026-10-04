package O1;

/* loaded from: classes.dex */
public final class B {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7253c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7254d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7255e;

    public B(Object obj) {
        this(-1L, obj);
    }

    public final B a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new B(obj, this.f7252b, this.f7253c, this.f7254d, this.f7255e);
    }

    public final boolean b() {
        return this.f7252b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        return this.a.equals(b4.a) && this.f7252b == b4.f7252b && this.f7253c == b4.f7253c && this.f7254d == b4.f7254d && this.f7255e == b4.f7255e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.f7252b) * 31) + this.f7253c) * 31) + ((int) this.f7254d)) * 31) + this.f7255e;
    }

    public B(long j7, Object obj) {
        this(obj, -1, -1, j7, -1);
    }

    public B(int i7, long j7, Object obj) {
        this(obj, -1, -1, j7, i7);
    }

    public B(Object obj, int i7, int i8, long j7, int i9) {
        this.a = obj;
        this.f7252b = i7;
        this.f7253c = i8;
        this.f7254d = j7;
        this.f7255e = i9;
    }
}
