package O3;

/* loaded from: classes.dex */
public final class s implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final byte f7541k;

    public /* synthetic */ s(byte b4) {
        this.f7541k = b4;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kotlin.jvm.internal.l.g(this.f7541k & 255, ((s) obj).f7541k & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f7541k == ((s) obj).f7541k;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f7541k);
    }

    public final String toString() {
        return String.valueOf(this.f7541k & 255);
    }
}
