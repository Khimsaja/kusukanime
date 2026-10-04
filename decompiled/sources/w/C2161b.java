package w;

import O.C0485c0;
import O3.C;
import P3.F;
import l4.AbstractC1420H;
import q.X;
import s.EnumC1903a0;
import s.InterfaceC1946w0;
import w0.InterfaceC2174I;
import y.C2311K;
import y.InterfaceC2308H;
import z.C2420A;
import z.C2425d;
import z.G;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2161b implements InterfaceC2308H {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1946w0 f16692c;

    public /* synthetic */ C2161b(InterfaceC1946w0 interfaceC1946w0, boolean z7, int i7) {
        this.a = i7;
        this.f16692c = interfaceC1946w0;
        this.f16691b = z7;
    }

    @Override // y.InterfaceC2308H
    public final int a() {
        long jA;
        switch (this.a) {
            case 0:
                u uVar = (u) this.f16692c;
                if (uVar.g().f16751n == EnumC1903a0.f15259k) {
                    InterfaceC2174I interfaceC2174I = uVar.g().f16754q;
                    jA = AbstractC1420H.a(interfaceC2174I.l(), interfaceC2174I.e()) & 4294967295L;
                } else {
                    InterfaceC2174I interfaceC2174I2 = uVar.g().f16754q;
                    jA = AbstractC1420H.a(interfaceC2174I2.l(), interfaceC2174I2.e()) >> 32;
                }
                return (int) jA;
            default:
                C2425d c2425d = (C2425d) this.f16692c;
                return (int) (c2425d.k().f18523e == EnumC1903a0.f15259k ? c2425d.k().a() & 4294967295L : c2425d.k().a() >> 32);
        }
    }

    @Override // y.InterfaceC2308H
    public final float b() {
        switch (this.a) {
            case 0:
                u uVar = (u) this.f16692c;
                return (uVar.f16793d.f16771b.f() * 500) + uVar.f16793d.f16772c.f();
            default:
                C2425d c2425d = (C2425d) this.f16692c;
                return F.X(((C0485c0) c2425d.f18405c.f7470d).f() * c2425d.n()) + (c2425d.j() * c2425d.n());
        }
    }

    @Override // y.InterfaceC2308H
    public final F0.b c() {
        switch (this.a) {
            case 0:
                return this.f16691b ? new F0.b(-1, 1) : new F0.b(1, -1);
            default:
                C2425d c2425d = (C2425d) this.f16692c;
                return this.f16691b ? new F0.b(c2425d.l(), 1) : new F0.b(1, c2425d.l());
        }
    }

    @Override // y.InterfaceC2308H
    public final Object d(int i7, C2311K c2311k) throws Throwable {
        C c2 = C.a;
        X x7 = X.f14513k;
        InterfaceC1946w0 interfaceC1946w0 = this.f16692c;
        switch (this.a) {
            case 0:
                L2.e eVar = u.f16790w;
                u uVar = (u) interfaceC1946w0;
                uVar.getClass();
                Object objE = uVar.e(x7, new r(uVar, i7, null), c2311k);
                T3.a aVar = T3.a.f9048k;
                if (objE != aVar) {
                    objE = c2;
                }
                return objE == aVar ? objE : c2;
            default:
                C2425d c2425d = (C2425d) interfaceC1946w0;
                Object objE2 = c2425d.e(x7, new C2420A(c2425d, i7, null), c2311k);
                T3.a aVar2 = T3.a.f9048k;
                if (objE2 != aVar2) {
                    objE2 = c2;
                }
                return objE2 == aVar2 ? objE2 : c2;
        }
    }

    @Override // y.InterfaceC2308H
    public final int e() {
        switch (this.a) {
            case 0:
                u uVar = (u) this.f16692c;
                return (-uVar.g().f16748k) + uVar.g().f16752o;
            default:
                C2425d c2425d = (C2425d) this.f16692c;
                return (-c2425d.k().f18524f) + c2425d.k().f18522d;
        }
    }

    @Override // y.InterfaceC2308H
    public final float f() {
        switch (this.a) {
            case 0:
                u uVar = (u) this.f16692c;
                int iF = uVar.f16793d.f16771b.f();
                int iF2 = uVar.f16793d.f16772c.f();
                return uVar.c() ? (iF * 500) + iF2 + 100 : (iF * 500) + iF2;
            default:
                C2425d c2425d = (C2425d) this.f16692c;
                return G.a(c2425d.k(), c2425d.l());
        }
    }
}
