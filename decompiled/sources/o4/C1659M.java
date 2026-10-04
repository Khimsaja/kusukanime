package o4;

import l4.InterfaceC1432k;
import l4.InterfaceC1443v;

/* renamed from: o4.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1659M extends p0 implements InterfaceC1432k {

    /* renamed from: u, reason: collision with root package name */
    public final C1660N f13649u;

    public C1659M(C1660N c1660n) {
        kotlin.jvm.internal.l.f("property", c1660n);
        this.f13649u = c1660n;
    }

    @Override // l4.InterfaceC1437p
    public final InterfaceC1443v d() {
        return this.f13649u;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        this.f13649u.set(obj, obj2);
        return O3.C.a;
    }

    @Override // o4.l0
    public final q0 u() {
        return this.f13649u;
    }
}
