package o;

import D.C0042b;
import O.Z;
import l4.AbstractC1420H;
import p.p0;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;
import w0.S;

/* renamed from: o.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1612j implements InterfaceC2201t {
    public final p0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f13506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1613k f13507c;

    public C1612j(C1613k c1613k, p0 p0Var, Z z7) {
        this.f13507c = c1613k;
        this.a = p0Var;
        this.f13506b = z7;
    }

    @Override // w0.InterfaceC2201t
    public final int b(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.W(i7);
    }

    @Override // w0.InterfaceC2201t
    public final int c(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.c(i7);
    }

    @Override // w0.InterfaceC2201t
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        S sB = interfaceC2172G.b(j7);
        C1613k c1613k = this.f13507c;
        long jA = interfaceC2175J.s() ? AbstractC1420H.a(sB.f16840k, sB.f16841l) : ((T0.j) this.a.a(new A3.t(29, c1613k, this), new C0042b(29, c1613k)).getValue()).a;
        return interfaceC2175J.T((int) (jA >> 32), (int) (4294967295L & jA), P3.z.f7780k, new C1611i(c1613k, sB, jA));
    }

    @Override // w0.InterfaceC2201t
    public final int g(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.b0(i7);
    }

    @Override // w0.InterfaceC2201t
    public final int i(y0.N n7, InterfaceC2172G interfaceC2172G, int i7) {
        return interfaceC2172G.Y(i7);
    }
}
