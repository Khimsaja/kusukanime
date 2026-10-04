package H5;

/* renamed from: H5.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284z extends S3.a {

    /* renamed from: l, reason: collision with root package name */
    public static final C0263e0 f3892l = new C0263e0();

    /* renamed from: k, reason: collision with root package name */
    public final String f3893k;

    public C0284z(String str) {
        super(f3892l);
        this.f3893k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0284z) && kotlin.jvm.internal.l.a(this.f3893k, ((C0284z) obj).f3893k);
    }

    public final int hashCode() {
        return this.f3893k.hashCode();
    }

    public final String toString() {
        return A6.b.j(new StringBuilder("CoroutineName("), this.f3893k, ')');
    }
}
