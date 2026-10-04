package A5;

import B1.B;
import V1.k;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: k, reason: collision with root package name */
    public final int f256k;

    /* renamed from: l, reason: collision with root package name */
    public final long f257l;

    public /* synthetic */ h(int i7, long j7) {
        this.f256k = i7;
        this.f257l = j7;
    }

    public static h a(k kVar, B b4) {
        kVar.h(b4.a, 0, 8, false);
        b4.F(0);
        return new h(b4.g(), b4.k());
    }

    @Override // A5.i
    public d m() {
        long j7 = d.f249m.f251k;
        long j8 = this.f257l;
        if (j8 >= j7 && j8 <= d.f250n.f251k) {
            return g.h(j8, this.f256k);
        }
        throw new e("The parsed date is outside the range representable by Instant (Unix epoch second " + j8 + ')', 0);
    }

    public h(long j7, int i7) {
        this.f257l = j7;
        this.f256k = i7;
    }
}
