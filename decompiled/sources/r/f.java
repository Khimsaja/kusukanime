package r;

import P3.F;
import X0.y;
import f.AbstractC0847h;

/* loaded from: classes.dex */
public final class f implements y {
    public final long a;

    public f(long j7) {
        this.a = j7;
    }

    @Override // X0.y
    public final long a(T0.i iVar, long j7, T0.k kVar, long j8) {
        int i7 = iVar.a;
        long j9 = this.a;
        return F.b(AbstractC0847h.f(i7 + ((int) (j9 >> 32)), (int) (j8 >> 32), (int) (j7 >> 32), kVar == T0.k.f8844k), AbstractC0847h.f(iVar.f8841b + ((int) (j9 & 4294967295L)), (int) (j8 & 4294967295L), (int) (j7 & 4294967295L), true));
    }
}
