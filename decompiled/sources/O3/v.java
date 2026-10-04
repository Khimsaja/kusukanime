package O3;

/* loaded from: classes.dex */
public final class v implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f7546k;

    public /* synthetic */ v(int i7) {
        this.f7546k = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.g(this.f7546k ^ Integer.MIN_VALUE, ((v) obj).f7546k ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f7546k == ((v) obj).f7546k;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7546k);
    }

    public final String toString() {
        return String.valueOf(this.f7546k & 4294967295L);
    }
}
