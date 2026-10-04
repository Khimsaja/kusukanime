package v;

import D.C0056i;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* loaded from: classes.dex */
public final class X extends a0.p implements InterfaceC2375w {

    /* renamed from: A, reason: collision with root package name */
    public float f16418A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f16419B;

    /* renamed from: x, reason: collision with root package name */
    public float f16420x;

    /* renamed from: y, reason: collision with root package name */
    public float f16421y;

    /* renamed from: z, reason: collision with root package name */
    public float f16422z;

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iO = interfaceC2175J.O(this.f16422z) + interfaceC2175J.O(this.f16420x);
        int iO2 = interfaceC2175J.O(this.f16418A) + interfaceC2175J.O(this.f16421y);
        w0.S sB = interfaceC2172G.b(q0.c.H(-iO, -iO2, j7));
        return interfaceC2175J.T(q0.c.v(sB.f16840k + iO, j7), q0.c.u(sB.f16841l + iO2, j7), P3.z.f7780k, new C0056i(this, sB, interfaceC2175J, 17));
    }
}
