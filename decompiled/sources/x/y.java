package x;

import O3.C;
import l4.AbstractC1420H;
import q.X;
import s.EnumC1903a0;
import w0.InterfaceC2174I;
import y.C2311K;
import y.InterfaceC2308H;

/* loaded from: classes.dex */
public final class y implements InterfaceC2308H {
    public final /* synthetic */ v a;

    public y(v vVar) {
        this.a = vVar;
    }

    @Override // y.InterfaceC2308H
    public final int a() {
        long jA;
        v vVar = this.a;
        if (vVar.g().f17234k == EnumC1903a0.f15259k) {
            InterfaceC2174I interfaceC2174I = vVar.g().f17237n;
            jA = AbstractC1420H.a(interfaceC2174I.l(), interfaceC2174I.e()) & 4294967295L;
        } else {
            InterfaceC2174I interfaceC2174I2 = vVar.g().f17237n;
            jA = AbstractC1420H.a(interfaceC2174I2.l(), interfaceC2174I2.e()) >> 32;
        }
        return (int) jA;
    }

    @Override // y.InterfaceC2308H
    public final float b() {
        v vVar = this.a;
        return (vVar.f17279b.f16771b.f() * 500) + vVar.f17279b.f16772c.f();
    }

    @Override // y.InterfaceC2308H
    public final F0.b c() {
        return new F0.b(-1, -1);
    }

    @Override // y.InterfaceC2308H
    public final Object d(int i7, C2311K c2311k) throws Throwable {
        L2.e eVar = v.f17278t;
        v vVar = this.a;
        vVar.getClass();
        Object objE = vVar.e(X.f14513k, new u(vVar, i7, null), c2311k);
        T3.a aVar = T3.a.f9048k;
        C c2 = C.a;
        if (objE != aVar) {
            objE = c2;
        }
        return objE == aVar ? objE : c2;
    }

    @Override // y.InterfaceC2308H
    public final int e() {
        v vVar = this.a;
        return (-vVar.g().f17231h) + vVar.g().f17235l;
    }

    @Override // y.InterfaceC2308H
    public final float f() {
        v vVar = this.a;
        int iF = vVar.f17279b.f16771b.f();
        int iF2 = vVar.f17279b.f16772c.f();
        return vVar.c() ? (iF * 500) + iF2 + 100 : (iF * 500) + iF2;
    }
}
