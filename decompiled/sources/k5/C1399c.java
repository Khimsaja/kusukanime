package k5;

import A4.j;
import H4.u;
import R4.F;
import R4.H;
import R4.N;
import R4.O;
import T4.h;
import d5.e;
import g5.o;
import j5.C1354i;
import kotlin.jvm.internal.l;
import l5.C1464q;
import m5.C1523l;
import u4.InterfaceC2088D;
import u4.InterfaceC2118y;
import x4.AbstractC2257C;

/* renamed from: k5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1399c extends AbstractC2257C implements InterfaceC2088D {

    /* renamed from: q, reason: collision with root package name */
    public final S4.a f12690q;

    /* renamed from: r, reason: collision with root package name */
    public final h f12691r;

    /* renamed from: s, reason: collision with root package name */
    public final A2.b f12692s;

    /* renamed from: t, reason: collision with root package name */
    public H f12693t;

    /* renamed from: u, reason: collision with root package name */
    public C1464q f12694u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1399c(W4.c cVar, C1523l c1523l, InterfaceC2118y interfaceC2118y, H h7, S4.a aVar) {
        super(interfaceC2118y, cVar);
        l.f("fqName", cVar);
        l.f("module", interfaceC2118y);
        this.f12690q = aVar;
        O o7 = h7.f8172n;
        l.e("getStrings(...)", o7);
        N n7 = h7.f8173o;
        l.e("getQualifiedNames(...)", n7);
        h hVar = new h(o7, n7);
        this.f12691r = hVar;
        this.f12692s = new A2.b(h7, hVar, aVar, new j(18, this));
        this.f12693t = h7;
    }

    public final void O0(C1354i c1354i) {
        l.f("components", c1354i);
        H h7 = this.f12693t;
        if (h7 == null) {
            throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this.f12693t = null;
        F f5 = h7.f8174p;
        l.e("getPackage(...)", f5);
        this.f12694u = new C1464q(this, f5, this.f12691r, this.f12690q, null, c1354i, "scope of " + this, new u(10, this));
    }

    @Override // u4.InterfaceC2088D
    public final o k0() {
        C1464q c1464q = this.f12694u;
        if (c1464q != null) {
            return c1464q;
        }
        l.l("_memberScope");
        throw null;
    }

    @Override // x4.AbstractC2257C, x4.AbstractC2287n
    public final String toString() {
        return "builtins package fragment for " + this.f17354o + " from " + e.j(this);
    }
}
