package v;

import D.L0;
import l4.AbstractC1420H;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2131j extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public float f16453x;

    public final long G0(long j7, boolean z7) {
        int iRound;
        int iG = T0.a.g(j7);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.f16453x)) <= 0) {
            return 0L;
        }
        long jA = AbstractC1420H.a(iRound, iG);
        if (!z7 || q0.c.E(j7, jA)) {
            return jA;
        }
        return 0L;
    }

    public final long H0(long j7, boolean z7) {
        int iRound;
        int iH = T0.a.h(j7);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.f16453x)) <= 0) {
            return 0L;
        }
        long jA = AbstractC1420H.a(iH, iRound);
        if (!z7 || q0.c.E(j7, jA)) {
            return jA;
        }
        return 0L;
    }

    public final long I0(long j7, boolean z7) {
        int i7 = T0.a.i(j7);
        int iRound = Math.round(i7 * this.f16453x);
        if (iRound <= 0) {
            return 0L;
        }
        long jA = AbstractC1420H.a(iRound, i7);
        if (!z7 || q0.c.E(j7, jA)) {
            return jA;
        }
        return 0L;
    }

    public final long J0(long j7, boolean z7) {
        int iJ = T0.a.j(j7);
        int iRound = Math.round(iJ / this.f16453x);
        if (iRound <= 0) {
            return 0L;
        }
        long jA = AbstractC1420H.a(iJ, iRound);
        if (!z7 || q0.c.E(j7, jA)) {
            return jA;
        }
        return 0L;
    }

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f16453x) : interfaceC2172G.W(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f16453x) : interfaceC2172G.c(i7);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        long jH0 = H0(j7, true);
        if (T0.j.a(jH0, 0L)) {
            jH0 = G0(j7, true);
            if (T0.j.a(jH0, 0L)) {
                jH0 = J0(j7, true);
                if (T0.j.a(jH0, 0L)) {
                    jH0 = I0(j7, true);
                    if (T0.j.a(jH0, 0L)) {
                        jH0 = H0(j7, false);
                        if (T0.j.a(jH0, 0L)) {
                            jH0 = G0(j7, false);
                            if (T0.j.a(jH0, 0L)) {
                                jH0 = J0(j7, false);
                                if (T0.j.a(jH0, 0L)) {
                                    jH0 = I0(j7, false);
                                    if (T0.j.a(jH0, 0L)) {
                                        jH0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!T0.j.a(jH0, 0L)) {
            int i7 = (int) (jH0 >> 32);
            int i8 = (int) (jH0 & 4294967295L);
            if (i7 < 0 || i8 < 0) {
                android.support.v4.media.session.b.H("width(" + i7 + ") and height(" + i8 + ") must be >= 0");
                throw null;
            }
            j7 = q0.c.x(i7, i7, i8, i8);
        }
        w0.S sB = interfaceC2172G.b(j7);
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 9));
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 / this.f16453x) : interfaceC2172G.b0(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return i7 != Integer.MAX_VALUE ? Math.round(i7 * this.f16453x) : interfaceC2172G.Y(i7);
    }
}
