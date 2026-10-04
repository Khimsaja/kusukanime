package S0;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    public static String a(int i7) {
        return i7 == 1 ? "Left" : i7 == 2 ? "Right" : i7 == 3 ? "Center" : i7 == 4 ? "Justify" : i7 == 5 ? "Start" : i7 == 6 ? "End" : i7 == Integer.MIN_VALUE ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.a == ((i) obj).a;
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
