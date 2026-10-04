package h0;

/* renamed from: h0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960E {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof C0960E) {
            return this.a == ((C0960E) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i7 = this.a;
        return i7 == 0 ? "Argb8888" : i7 == 1 ? "Alpha8" : i7 == 2 ? "Rgb565" : i7 == 3 ? "F16" : i7 == 4 ? "Gpu" : "Unknown";
    }
}
