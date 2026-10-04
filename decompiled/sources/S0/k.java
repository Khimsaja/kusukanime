package S0;

/* loaded from: classes.dex */
public final class k {
    public final int a;

    public static String a(int i7) {
        return i7 == 1 ? "Ltr" : i7 == 2 ? "Rtl" : i7 == 3 ? "Content" : i7 == 4 ? "ContentOrLtr" : i7 == 5 ? "ContentOrRtl" : i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
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
