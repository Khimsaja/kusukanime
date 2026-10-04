package T0;

import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: k, reason: collision with root package name */
    public final float f8836k;

    /* renamed from: l, reason: collision with root package name */
    public final float f8837l;

    /* renamed from: m, reason: collision with root package name */
    public final U0.a f8838m;

    public d(float f5, float f7, U0.a aVar) {
        this.f8836k = f5;
        this.f8837l = f7;
        this.f8838m = aVar;
    }

    @Override // T0.b
    public final float I(long j7) {
        if (n.a(m.b(j7), 4294967296L)) {
            return this.f8838m.b(m.c(j7));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // T0.b
    public final float a() {
        return this.f8836k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8836k, dVar.f8836k) == 0 && Float.compare(this.f8837l, dVar.f8837l) == 0 && kotlin.jvm.internal.l.a(this.f8838m, dVar.f8838m);
    }

    public final int hashCode() {
        return this.f8838m.hashCode() + AbstractC0703b.b(this.f8837l, Float.hashCode(this.f8836k) * 31, 31);
    }

    @Override // T0.b
    public final float n() {
        return this.f8837l;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f8836k + ", fontScale=" + this.f8837l + ", converter=" + this.f8838m + ')';
    }

    @Override // T0.b
    public final long v(float f5) {
        return n6.d.T(this.f8838m.a(f5), 4294967296L);
    }
}
