package a0;

import P3.F;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class i implements d {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f10397b;

    public i(float f5, float f7) {
        this.a = f5;
        this.f10397b = f7;
    }

    @Override // a0.d
    public final long a(long j7, long j8, T0.k kVar) {
        float f5 = (((int) (j8 >> 32)) - ((int) (j7 >> 32))) / 2.0f;
        float f7 = (((int) (j8 & 4294967295L)) - ((int) (j7 & 4294967295L))) / 2.0f;
        T0.k kVar2 = T0.k.f8844k;
        float f8 = this.a;
        if (kVar != kVar2) {
            f8 *= -1;
        }
        float f9 = 1;
        return F.b(Math.round((f8 + f9) * f5), Math.round((f9 + this.f10397b) * f7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Float.compare(this.a, iVar.a) == 0 && Float.compare(this.f10397b, iVar.f10397b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10397b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return AbstractC0703b.k(sb, this.f10397b, ')');
    }
}
