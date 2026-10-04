package o4;

import f6.AbstractC0915m;
import l4.InterfaceC1438q;
import l4.InterfaceC1443v;
import p4.InterfaceC1801g;
import u4.InterfaceC2094J;
import u4.InterfaceC2097c;
import x4.C2264J;

/* loaded from: classes.dex */
public abstract class n0 extends l0 implements InterfaceC1438q {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13720t = {kotlin.jvm.internal.y.a.h(new kotlin.jvm.internal.r(n0.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};

    /* renamed from: r, reason: collision with root package name */
    public final z0 f13721r = AbstractC0915m.D(null, new m0(this, 0));

    /* renamed from: s, reason: collision with root package name */
    public final Object f13722s = z1.c.B(O3.j.f7525k, new m0(this, 1));

    public final boolean equals(Object obj) {
        return (obj instanceof n0) && kotlin.jvm.internal.l.a(u(), ((n0) obj).u());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O3.i, java.lang.Object] */
    @Override // o4.AbstractC1694t
    public final InterfaceC1801g f() {
        return (InterfaceC1801g) this.f13722s.getValue();
    }

    @Override // l4.InterfaceC1424c
    public final String getName() {
        return A6.b.j(new StringBuilder("<get-"), u().f13738s, '>');
    }

    public final int hashCode() {
        return u().hashCode();
    }

    @Override // o4.AbstractC1694t
    public final InterfaceC2097c p() {
        InterfaceC1443v interfaceC1443v = f13720t[0];
        Object objInvoke = this.f13721r.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (C2264J) objInvoke;
    }

    @Override // o4.l0
    public final InterfaceC2094J t() {
        InterfaceC1443v interfaceC1443v = f13720t[0];
        Object objInvoke = this.f13721r.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (C2264J) objInvoke;
    }

    public final String toString() {
        return "getter of " + u();
    }
}
