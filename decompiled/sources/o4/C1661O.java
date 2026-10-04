package o4;

import l4.InterfaceC1443v;

/* renamed from: o4.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661O extends p0 implements e4.o {

    /* renamed from: u, reason: collision with root package name */
    public final C1662P f13651u;

    public C1661O(C1662P c1662p) {
        kotlin.jvm.internal.l.f("property", c1662p);
        this.f13651u = c1662p;
    }

    @Override // l4.InterfaceC1437p
    public final InterfaceC1443v d() {
        return this.f13651u;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws J1.n {
        ((C1661O) this.f13651u.f13652z.getValue()).call(obj, obj2, obj3);
        return O3.C.a;
    }

    @Override // o4.l0
    public final q0 u() {
        return this.f13651u;
    }
}
