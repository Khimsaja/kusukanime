package F0;

/* loaded from: classes.dex */
public final class f {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.a == ((f) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i7 = this.a;
        return i7 == 0 ? "Button" : i7 == 1 ? "Checkbox" : i7 == 2 ? "Switch" : i7 == 3 ? "RadioButton" : i7 == 4 ? "Tab" : i7 == 5 ? "Image" : i7 == 6 ? "DropdownList" : "Unknown";
    }
}
