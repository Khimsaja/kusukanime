package w0;

import e5.AbstractC0832b;
import f6.AbstractC0905c;
import l4.AbstractC1420H;

/* renamed from: w0.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2171F implements r {

    /* renamed from: k, reason: collision with root package name */
    public final y0.O f16834k;

    public C2171F(y0.O o7) {
        this.f16834k = o7;
    }

    @Override // w0.r
    public final boolean B() {
        return this.f16834k.f17777v.P0().f10414w;
    }

    @Override // w0.r
    public final void C(float[] fArr) {
        this.f16834k.f17777v.C(fArr);
    }

    @Override // w0.r
    public final g0.d K(r rVar, boolean z7) {
        return this.f16834k.f17777v.K(rVar, z7);
    }

    @Override // w0.r
    public final long Q() {
        y0.O o7 = this.f16834k;
        return AbstractC1420H.a(o7.f16840k, o7.f16841l);
    }

    @Override // w0.r
    public final long S(long j7) {
        return this.f16834k.f17777v.S(g0.c.h(j7, a()));
    }

    public final long a() {
        y0.O o7 = this.f16834k;
        y0.O oG = X.g(o7);
        return g0.c.g(b(oG.f17780y, 0L), o7.f17777v.X0(oG.f17777v, 0L));
    }

    public final long b(r rVar, long j7) {
        boolean z7 = rVar instanceof C2171F;
        y0.O o7 = this.f16834k;
        if (!z7) {
            y0.O oG = X.g(o7);
            long jB = b(oG.f17780y, j7);
            y0.Y y7 = oG.f17777v;
            y7.getClass();
            return g0.c.h(jB, y7.X0(rVar, 0L));
        }
        y0.O o8 = ((C2171F) rVar).f16834k;
        o8.f17777v.Y0();
        y0.O oN0 = o7.f17777v.L0(o8.f17777v).N0();
        if (oN0 != null) {
            long jB2 = T0.h.b(T0.h.c(o8.G0(oN0, false), P3.F.U(j7)), o7.G0(oN0, false));
            return AbstractC0832b.e((int) (jB2 >> 32), (int) (jB2 & 4294967295L));
        }
        y0.O oG2 = X.g(o8);
        long jC = T0.h.c(T0.h.c(o8.G0(oG2, false), oG2.f17778w), P3.F.U(j7));
        y0.O oG3 = X.g(o7);
        long jB3 = T0.h.b(jC, T0.h.c(o7.G0(oG3, false), oG3.f17778w));
        long jE = AbstractC0832b.e((int) (jB3 >> 32), (int) (jB3 & 4294967295L));
        y0.Y y8 = oG3.f17777v.f17827x;
        kotlin.jvm.internal.l.c(y8);
        y0.Y y9 = oG2.f17777v.f17827x;
        kotlin.jvm.internal.l.c(y9);
        return y8.X0(y9, jE);
    }

    @Override // w0.r
    public final void e(r rVar, float[] fArr) {
        this.f16834k.f17777v.e(rVar, fArr);
    }

    @Override // w0.r
    public final long f(long j7) {
        return g0.c.h(this.f16834k.f17777v.f(j7), a());
    }

    @Override // w0.r
    public final long g(long j7) {
        return this.f16834k.f17777v.g(g0.c.h(j7, a()));
    }

    @Override // w0.r
    public final r i() {
        y0.O oN0;
        if (!B()) {
            AbstractC0905c.C("LayoutCoordinate operations are only valid when isAttached is true");
            throw null;
        }
        y0.Y y7 = ((y0.Y) this.f16834k.f17777v.f17825v.f17660G.f7174d).f17827x;
        if (y7 == null || (oN0 = y7.N0()) == null) {
            return null;
        }
        return oN0.f17780y;
    }

    @Override // w0.r
    public final long k(r rVar, long j7) {
        return b(rVar, j7);
    }

    @Override // w0.r
    public final long y(long j7) {
        return g0.c.h(this.f16834k.f17777v.y(j7), a());
    }
}
