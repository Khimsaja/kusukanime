package a0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class h {
    public final float a;

    public h(float f5) {
        this.a = f5;
    }

    public final int a(int i7, int i8) {
        return AbstractC0703b.a(1, this.a, (i8 - i7) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Float.compare(this.a, ((h) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("Vertical(bias="), this.a, ')');
    }
}
