package M0;

/* loaded from: classes.dex */
public final class r {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.a == ((r) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i7 = this.a;
        return i7 == 0 ? "None" : i7 == 1 ? "All" : i7 == 2 ? "Weight" : i7 == 3 ? "Style" : "Invalid";
    }
}
