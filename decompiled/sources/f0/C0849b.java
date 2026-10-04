package f0;

/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849b {
    public final int a;

    public static String a(int i7) {
        return i7 == 1 ? "Next" : i7 == 2 ? "Previous" : i7 == 3 ? "Left" : i7 == 4 ? "Right" : i7 == 5 ? "Up" : i7 == 6 ? "Down" : i7 == 7 ? "Enter" : i7 == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0849b) {
            return this.a == ((C0849b) obj).a;
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
