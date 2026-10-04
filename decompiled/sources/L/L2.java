package L;

import D.C0046d;
import p.C1743c;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class L2 extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public C1743c f5193A;

    /* renamed from: B, reason: collision with root package name */
    public C1743c f5194B;

    /* renamed from: C, reason: collision with root package name */
    public float f5195C;

    /* renamed from: D, reason: collision with root package name */
    public float f5196D;

    /* renamed from: x, reason: collision with root package name */
    public u.k f5197x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5198y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5199z;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        boolean z7 = false;
        float fX = interfaceC2175J.x(this.f5199z ? N.r.a : ((interfaceC2172G.c(T0.a.h(j7)) != 0 && interfaceC2172G.Y(T0.a.g(j7)) != 0) || this.f5198y) ? androidx.compose.material3.a.a : androidx.compose.material3.a.f10639b);
        C1743c c1743c = this.f5194B;
        int iFloatValue = (int) (c1743c != null ? ((Number) c1743c.d()).floatValue() : fX);
        if (iFloatValue >= 0 && iFloatValue >= 0) {
            z7 = true;
        }
        if (!z7) {
            android.support.v4.media.session.b.H("width(" + iFloatValue + ") and height(" + iFloatValue + ") must be >= 0");
            throw null;
        }
        w0.S sB = interfaceC2172G.b(q0.c.x(iFloatValue, iFloatValue, iFloatValue, iFloatValue));
        float fX2 = interfaceC2175J.x((androidx.compose.material3.a.f10641d - interfaceC2175J.r0(fX)) / 2.0f);
        float fX3 = interfaceC2175J.x((androidx.compose.material3.a.f10640c - androidx.compose.material3.a.a) - androidx.compose.material3.a.f10642e);
        boolean z8 = this.f5199z;
        if (z8 && this.f5198y) {
            fX2 = fX3 - interfaceC2175J.x(N.r.f6753e);
        } else if (z8 && !this.f5198y) {
            fX2 = interfaceC2175J.x(N.r.f6753e);
        } else if (this.f5198y) {
            fX2 = fX3;
        }
        C1743c c1743c2 = this.f5194B;
        Float f5 = c1743c2 != null ? (Float) c1743c2.f13960e.getValue() : null;
        if (f5 == null || f5.floatValue() != fX) {
            H5.D.x(u0(), null, new I2(this, fX, null), 3);
        }
        C1743c c1743c3 = this.f5193A;
        Float f7 = c1743c3 != null ? (Float) c1743c3.f13960e.getValue() : null;
        if (f7 == null || f7.floatValue() != fX2) {
            H5.D.x(u0(), null, new J2(this, fX2, null), 3);
        }
        if (Float.isNaN(this.f5196D) && Float.isNaN(this.f5195C)) {
            this.f5196D = fX;
            this.f5195C = fX2;
        }
        return interfaceC2175J.T(iFloatValue, iFloatValue, P3.z.f7780k, new C0046d(sB, this, fX2));
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }

    @Override // a0.p
    public final void y0() {
        H5.D.x(u0(), null, new K2(this, null), 3);
    }
}
