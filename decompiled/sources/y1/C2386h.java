package y1;

/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2386h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f18042c = 0;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18043b;

    static {
        new C2386h(new Y());
        B1.K.B(0);
        B1.K.B(1);
        B1.K.B(2);
        B1.K.B(3);
    }

    public C2386h(Y y7) {
        y7.getClass();
        this.a = 0;
        this.f18043b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2386h)) {
            return false;
        }
        C2386h c2386h = (C2386h) obj;
        c2386h.getClass();
        return this.a == c2386h.a && this.f18043b == c2386h.f18043b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.f18043b) * 31;
    }
}
