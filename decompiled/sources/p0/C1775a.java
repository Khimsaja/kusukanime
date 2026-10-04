package p0;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775a {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C1775a) {
            return this.a == ((C1775a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i7 = this.a;
        return i7 == 1 ? "Touch" : i7 == 2 ? "Keyboard" : "Error";
    }
}
