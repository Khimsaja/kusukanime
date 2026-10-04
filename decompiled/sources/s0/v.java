package s0;

/* loaded from: classes.dex */
public final class v {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.a == ((v) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.a + ')';
    }
}
