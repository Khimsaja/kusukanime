package T0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class l implements U0.a {
    public final float a;

    public l(float f5) {
        this.a = f5;
    }

    @Override // U0.a
    public final float a(float f5) {
        return f5 / this.a;
    }

    @Override // U0.a
    public final float b(float f5) {
        return f5 * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Float.compare(this.a, ((l) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
