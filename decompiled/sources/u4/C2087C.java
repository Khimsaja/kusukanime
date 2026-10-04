package u4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l4.AbstractC1420H;
import m5.C1523l;
import n5.C1572i;
import o5.C1706f;
import v4.C2159g;
import x4.AbstractC2284k;
import x4.C2270P;
import x4.C2283j;

/* renamed from: u4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2087C extends AbstractC2284k {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f16286q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f16287r;

    /* renamed from: s, reason: collision with root package name */
    public final C1572i f16288s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2087C(C1523l c1523l, InterfaceC2101g interfaceC2101g, W4.e eVar, boolean z7, int i7) {
        super(c1523l, interfaceC2101g, eVar, M.f16295i);
        kotlin.jvm.internal.l.f("container", interfaceC2101g);
        this.f16286q = z7;
        k4.g gVarL = e3.c.L(0, i7);
        ArrayList arrayList = new ArrayList(P3.r.p(gVarL, 10));
        k4.f it = gVarL.iterator();
        while (it.f12677m) {
            int iA = it.a();
            arrayList.add(C2270P.Q0(this, n5.b0.f13390m, W4.e.e("T" + iA), iA, c1523l));
        }
        this.f16287r = arrayList;
        this.f16288s = new C1572i(this, AbstractC2115v.c(this), AbstractC1420H.K(d5.e.j(this).d().e()), c1523l);
    }

    @Override // u4.InterfaceC2099e
    public final boolean E() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean Q() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final S Z() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final C2283j b0() {
        return null;
    }

    @Override // u4.InterfaceC2099e
    public final EnumC2100f c() {
        return EnumC2100f.f16311k;
    }

    @Override // u4.InterfaceC2099e
    public final /* bridge */ /* synthetic */ g5.o c0() {
        return g5.n.f11759b;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w
    public final EnumC2117x e() {
        return EnumC2117x.f16342l;
    }

    @Override // v4.InterfaceC2153a
    public final v4.h getAnnotations() {
        return C2159g.a;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2116w, u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16322e;
        kotlin.jvm.internal.l.e("PUBLIC", oVar);
        return oVar;
    }

    @Override // u4.InterfaceC2099e
    public final boolean i() {
        return false;
    }

    @Override // u4.InterfaceC2116w
    public final boolean i0() {
        return false;
    }

    @Override // x4.AbstractC2284k, u4.InterfaceC2116w
    public final boolean isExternal() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final boolean isInline() {
        return false;
    }

    @Override // u4.InterfaceC2103i
    public final boolean j() {
        return this.f16286q;
    }

    @Override // u4.InterfaceC2099e, u4.InterfaceC2103i
    public final List n() {
        return this.f16287r;
    }

    @Override // u4.InterfaceC2099e
    public final boolean p0() {
        return false;
    }

    @Override // x4.AbstractC2299z
    public final g5.o q(C1706f c1706f) {
        return g5.n.f11759b;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }

    @Override // u4.InterfaceC2102h
    public final n5.M v() {
        return this.f16288s;
    }

    @Override // u4.InterfaceC2099e
    public final boolean x() {
        return false;
    }

    @Override // u4.InterfaceC2099e
    public final Collection y() {
        return P3.A.f7737k;
    }
}
