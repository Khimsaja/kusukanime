package x;

/* renamed from: x.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2228b {
    public final long a;

    public final boolean equals(Object obj) {
        if (obj instanceof C2228b) {
            return this.a == ((C2228b) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=" + this.a + ')';
    }
}
