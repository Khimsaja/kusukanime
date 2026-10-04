package p5;

import H4.o;
import b1.AbstractC0703b;
import java.util.Collection;
import u4.EnumC2117x;
import u4.InterfaceC2095a;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.M;
import u4.r;
import x4.AbstractC2294u;
import x4.C2266L;

/* loaded from: classes.dex */
public final class c extends C2266L {
    @Override // x4.AbstractC2294u
    /* renamed from: O0 */
    public final C2266L z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, o oVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2099e);
        kotlin.jvm.internal.l.f("visibility", oVar);
        AbstractC0703b.w(2, "kind");
        return this;
    }

    @Override // x4.C2266L, x4.AbstractC2294u
    public final AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        kotlin.jvm.internal.l.f("newOwner", interfaceC2105k);
        AbstractC0703b.w(i7, "kind");
        kotlin.jvm.internal.l.f("annotations", hVar);
        return this;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c
    public final void W(Collection collection) {
        kotlin.jvm.internal.l.f("overriddenDescriptors", collection);
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2096b
    public final Object a0(InterfaceC2095a interfaceC2095a) {
        return null;
    }

    @Override // x4.C2266L, x4.AbstractC2294u, u4.InterfaceC2112s
    public final r f0() {
        return new p2.l(1, this);
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2112s
    public final boolean isSuspend() {
        return false;
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2097c
    public final /* bridge */ /* synthetic */ InterfaceC2097c z(InterfaceC2099e interfaceC2099e, EnumC2117x enumC2117x, o oVar) {
        z(interfaceC2099e, enumC2117x, oVar);
        return this;
    }
}
