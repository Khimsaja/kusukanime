package o4;

import b1.AbstractC0703b;
import f6.AbstractC0915m;
import java.util.List;
import l4.EnumC1413A;
import l4.InterfaceC1443v;
import l4.InterfaceC1445x;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class w0 implements InterfaceC1445x, InterfaceC1650D {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13773n;

    /* renamed from: k, reason: collision with root package name */
    public final u4.Q f13774k;

    /* renamed from: l, reason: collision with root package name */
    public final z0 f13775l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f13776m;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(w0.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f13773n = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(w0.class, "container", "getContainer()Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", 0, zVar)};
    }

    public w0(x0 x0Var, u4.Q q6) {
        kotlin.jvm.internal.l.f("descriptor", q6);
        this.f13774k = q6;
        this.f13775l = AbstractC0915m.D(null, new H4.u(23, this));
        this.f13776m = AbstractC0915m.D(null, new A3.q(15, x0Var, this));
    }

    public static C1649C b(InterfaceC2099e interfaceC2099e) {
        Class clsJ = F0.j(interfaceC2099e);
        C1649C c1649c = (C1649C) (clsJ != null ? n6.m.I(clsJ) : null);
        if (c1649c != null) {
            return c1649c;
        }
        throw new H5.C("Type parameter container is not resolved: " + interfaceC2099e.k());
    }

    public final x0 a() {
        InterfaceC1443v interfaceC1443v = f13773n[1];
        Object objInvoke = this.f13776m.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (x0) objInvoke;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return a().equals(w0Var.a()) && getName().equals(w0Var.getName());
    }

    @Override // o4.InterfaceC1650D
    public final InterfaceC2102h getDescriptor() {
        return this.f13774k;
    }

    @Override // l4.InterfaceC1445x
    public final String getName() {
        String strB = this.f13774k.getName().b();
        kotlin.jvm.internal.l.e("asString(...)", strB);
        return strB;
    }

    @Override // l4.InterfaceC1445x
    public final List getUpperBounds() {
        InterfaceC1443v interfaceC1443v = f13773n[0];
        Object objInvoke = this.f13775l.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (List) objInvoke;
    }

    public final int hashCode() {
        return getName().hashCode() + (a().hashCode() * 31);
    }

    public final String toString() {
        EnumC1413A enumC1413A;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.f13774k.R().ordinal();
        if (iOrdinal == 0) {
            enumC1413A = EnumC1413A.f12731k;
        } else if (iOrdinal == 1) {
            enumC1413A = EnumC1413A.f12732l;
        } else {
            if (iOrdinal != 2) {
                throw new D6.r();
            }
            enumC1413A = EnumC1413A.f12733m;
        }
        int iOrdinal2 = enumC1413A.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal2 != 2) {
                    throw new D6.r();
                }
                sb.append("out ");
            }
        }
        sb.append(getName());
        return sb.toString();
    }
}
