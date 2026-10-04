package a0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class g implements c {
    public final float a;

    public g(float f5) {
        this.a = f5;
    }

    @Override // a0.c
    public final int a(int i7, int i8, T0.k kVar) {
        float f5 = (i8 - i7) / 2.0f;
        T0.k kVar2 = T0.k.f8844k;
        float f7 = this.a;
        if (kVar != kVar2) {
            f7 *= -1;
        }
        return AbstractC0703b.a(1, f7, f5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Float.compare(this.a, ((g) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return AbstractC0703b.k(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
