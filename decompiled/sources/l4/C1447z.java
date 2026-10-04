package l4;

/* renamed from: l4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447z {

    /* renamed from: c, reason: collision with root package name */
    public static final C1447z f12758c = new C1447z(null, null);
    public final EnumC1413A a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1444w f12759b;

    public C1447z(EnumC1413A enumC1413A, InterfaceC1444w interfaceC1444w) {
        String str;
        this.a = enumC1413A;
        this.f12759b = interfaceC1444w;
        if ((enumC1413A == null) == (interfaceC1444w == null)) {
            return;
        }
        if (enumC1413A == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + enumC1413A + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1447z)) {
            return false;
        }
        C1447z c1447z = (C1447z) obj;
        return this.a == c1447z.a && kotlin.jvm.internal.l.a(this.f12759b, c1447z.f12759b);
    }

    public final int hashCode() {
        EnumC1413A enumC1413A = this.a;
        int iHashCode = (enumC1413A == null ? 0 : enumC1413A.hashCode()) * 31;
        InterfaceC1444w interfaceC1444w = this.f12759b;
        return iHashCode + (interfaceC1444w != null ? interfaceC1444w.hashCode() : 0);
    }

    public final String toString() {
        EnumC1413A enumC1413A = this.a;
        int i7 = enumC1413A == null ? -1 : AbstractC1446y.a[enumC1413A.ordinal()];
        if (i7 == -1) {
            return "*";
        }
        InterfaceC1444w interfaceC1444w = this.f12759b;
        if (i7 == 1) {
            return String.valueOf(interfaceC1444w);
        }
        if (i7 == 2) {
            return "in " + interfaceC1444w;
        }
        if (i7 != 3) {
            throw new D6.r();
        }
        return "out " + interfaceC1444w;
    }
}
