package v;

import D.L0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class U extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public int f16413x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16414y;

    @Override // y0.InterfaceC2375w
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f16413x == 1 ? interfaceC2172G.W(i7) : interfaceC2172G.Y(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.c(i7);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iW = this.f16413x == 1 ? interfaceC2172G.W(T0.a.g(j7)) : interfaceC2172G.Y(T0.a.g(j7));
        if (iW < 0) {
            iW = 0;
        }
        if (iW >= 0) {
            long jX = q0.c.x(iW, iW, 0, Integer.MAX_VALUE);
            if (this.f16414y) {
                jX = q0.c.t(j7, jX);
            }
            w0.S sB = interfaceC2172G.b(jX);
            return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new L0(sB, 11));
        }
        android.support.v4.media.session.b.H("width(" + iW + ") must be >= 0");
        throw null;
    }

    @Override // y0.InterfaceC2375w
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.b0(i7);
    }

    @Override // y0.InterfaceC2375w
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return this.f16413x == 1 ? interfaceC2172G.W(i7) : interfaceC2172G.Y(i7);
    }
}
