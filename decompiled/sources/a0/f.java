package a0;

import P3.F;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class f implements d {
    public final float a;

    public f(float f5) {
        this.a = f5;
    }

    @Override // a0.d
    public final long a(long j7, long j8, T0.k kVar) {
        long jA = AbstractC1420H.a(((int) (j8 >> 32)) - ((int) (j7 >> 32)), ((int) (j8 & 4294967295L)) - ((int) (j7 & 4294967295L)));
        float f5 = 1;
        return F.b(Math.round((this.a + f5) * (((int) (jA >> 32)) / 2.0f)), Math.round((f5 - 1.0f) * (((int) (jA & 4294967295L)) / 2.0f)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            return Float.compare(this.a, ((f) obj).a) == 0 && Float.compare(-1.0f, -1.0f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(-1.0f) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BiasAbsoluteAlignment(horizontalBias=" + this.a + ", verticalBias=-1.0)";
    }
}
