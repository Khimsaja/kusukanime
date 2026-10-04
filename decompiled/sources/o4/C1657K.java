package o4;

import l4.InterfaceC1430i;
import l4.InterfaceC1443v;

/* renamed from: o4.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1657K extends p0 implements InterfaceC1430i {

    /* renamed from: u, reason: collision with root package name */
    public final C1658L f13647u;

    public C1657K(C1658L c1658l) {
        kotlin.jvm.internal.l.f("property", c1658l);
        this.f13647u = c1658l;
    }

    @Override // l4.InterfaceC1437p
    public final InterfaceC1443v d() {
        return this.f13647u;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    @Override // e4.k
    public final Object invoke(Object obj) throws J1.n {
        ((C1657K) this.f13647u.f13648z.getValue()).call(obj);
        return O3.C.a;
    }

    @Override // o4.l0
    public final q0 u() {
        return this.f13647u;
    }
}
