package O3;

/* loaded from: classes.dex */
public final class A implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final short f7509k;

    public /* synthetic */ A(short s7) {
        this.f7509k = s7;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.g(this.f7509k & 65535, ((A) obj).f7509k & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A) {
            return this.f7509k == ((A) obj).f7509k;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f7509k);
    }

    public final String toString() {
        return String.valueOf(65535 & this.f7509k);
    }
}
