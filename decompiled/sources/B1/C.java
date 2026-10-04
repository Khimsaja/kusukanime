package B1;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: c, reason: collision with root package name */
    public static final C f290c = new C(-1, -1);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f291b;

    static {
        new C(0, 0);
    }

    public C(int i7, int i8) {
        AbstractC0015b.c((i7 == -1 || i7 >= 0) && (i8 == -1 || i8 >= 0));
        this.a = i7;
        this.f291b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C) {
            C c2 = (C) obj;
            if (this.a == c2.a && this.f291b == c2.f291b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.a;
        return ((i7 >>> 16) | (i7 << 16)) ^ this.f291b;
    }

    public final String toString() {
        return this.a + "x" + this.f291b;
    }
}
