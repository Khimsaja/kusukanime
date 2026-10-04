package E;

import P3.z;
import e4.InterfaceC0821a;
import f0.EnumC0865r;
import f0.InterfaceC0850c;
import s0.C1955C;
import s0.C1963h;
import s0.EnumC1964i;
import s0.w;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.S;
import y0.AbstractC2367n;
import y0.InterfaceC2375w;
import y0.j0;

/* loaded from: classes.dex */
public final class d extends AbstractC2367n implements InterfaceC2375w, j0, InterfaceC0850c {

    /* renamed from: A, reason: collision with root package name */
    public boolean f1788A;

    /* renamed from: B, reason: collision with root package name */
    public final C1955C f1789B;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0821a f1790z;

    public d(InterfaceC0821a interfaceC0821a) {
        this.f1790z = interfaceC0821a;
        b bVar = new b(this, null);
        C1963h c1963h = w.a;
        C1955C c1955c = new C1955C(null, null, bVar);
        G0(c1955c);
        this.f1789B = c1955c;
    }

    @Override // f0.InterfaceC0850c
    public final void B(EnumC0865r enumC0865r) {
        this.f1788A = enumC0865r.a();
    }

    @Override // y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        this.f1789B.W(c1963h, enumC1964i, j7);
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        int iO = interfaceC2175J.O(androidx.compose.foundation.text.handwriting.a.a);
        int iO2 = interfaceC2175J.O(androidx.compose.foundation.text.handwriting.a.f10629b);
        int i7 = iO2 * 2;
        int i8 = iO * 2;
        S sB = interfaceC2172G.b(q0.c.H(i7, i8, j7));
        int i9 = sB.f16841l - i8;
        return interfaceC2175J.T(sB.f16840k - i7, i9, z.f7780k, new c(sB, iO2, iO, 0));
    }

    @Override // y0.j0
    public final void f0() {
        this.f1789B.f0();
    }
}
