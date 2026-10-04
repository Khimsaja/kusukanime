package h0;

import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import y0.InterfaceC2375w;

/* renamed from: h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0992o extends a0.p implements InterfaceC2375w {

    /* renamed from: x, reason: collision with root package name */
    public e4.k f11827x;

    public C0992o(e4.k kVar) {
        this.f11827x = kVar;
    }

    @Override // y0.InterfaceC2375w
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        w0.S sB = interfaceC2172G.b(j7);
        return interfaceC2175J.T(sB.f16840k, sB.f16841l, P3.z.f7780k, new A3.t(26, sB, this));
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f11827x + ')';
    }

    @Override // a0.p
    public final boolean v0() {
        return false;
    }
}
