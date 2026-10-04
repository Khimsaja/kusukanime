package o4;

import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class i0 extends n0 implements e4.n {

    /* renamed from: u, reason: collision with root package name */
    public final j0 f13711u;

    public i0(j0 j0Var) {
        kotlin.jvm.internal.l.f("property", j0Var);
        this.f13711u = j0Var;
    }

    @Override // l4.InterfaceC1437p
    public final InterfaceC1443v d() {
        return this.f13711u;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) this.f13711u.f13712y.getValue()).call(obj, obj2);
    }

    @Override // o4.l0
    public final q0 u() {
        return this.f13711u;
    }
}
