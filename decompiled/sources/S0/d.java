package S0;

/* loaded from: classes.dex */
public final class d {
    public final int a;

    public static String a(int i7) {
        return i7 == 1 ? "Hyphens.None" : i7 == 2 ? "Hyphens.Auto" : i7 == Integer.MIN_VALUE ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.a == ((d) obj).a;
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
