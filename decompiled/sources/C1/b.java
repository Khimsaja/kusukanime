package C1;

import y1.B;

/* loaded from: classes.dex */
public final class b implements B {
    public final int a;

    public b(int i7) {
        this.a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a == ((b) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Mp4AlternateGroup: " + this.a;
    }
}
