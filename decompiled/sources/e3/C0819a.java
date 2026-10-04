package e3;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819a extends c {
    public final int a;

    public C0819a(int i7) {
        this.a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0819a) {
            return this.a == ((C0819a) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
