package o4;

import l4.InterfaceC1441t;
import l4.InterfaceC1443v;

/* renamed from: o4.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1679f0 extends n0 implements InterfaceC1441t {

    /* renamed from: u, reason: collision with root package name */
    public final C1681g0 f13705u;

    public C1679f0(C1681g0 c1681g0) {
        kotlin.jvm.internal.l.f("property", c1681g0);
        this.f13705u = c1681g0;
    }

    @Override // l4.InterfaceC1437p
    public final InterfaceC1443v d() {
        return this.f13705u;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return this.f13705u.get(obj);
    }

    @Override // o4.l0
    public final q0 u() {
        return this.f13705u;
    }
}
