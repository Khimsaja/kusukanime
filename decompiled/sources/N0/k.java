package N0;

/* loaded from: classes.dex */
public final class k {
    public final int a;

    public static String a(int i7) {
        return i7 == -1 ? "Unspecified" : i7 == 0 ? "None" : i7 == 1 ? "Default" : i7 == 2 ? "Go" : i7 == 3 ? "Search" : i7 == 4 ? "Send" : i7 == 5 ? "Previous" : i7 == 6 ? "Next" : i7 == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.a == ((k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
