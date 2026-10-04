package M0;

/* loaded from: classes.dex */
public final class q {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.a == ((q) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i7 = this.a;
        return i7 == 0 ? "Normal" : i7 == 1 ? "Italic" : "Invalid";
    }
}
