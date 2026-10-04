package o4;

import A4.AbstractC0011d;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f6.AbstractC0905c;
import f6.AbstractC0915m;
import io.ktor.http.LinkHeader;
import java.lang.reflect.Array;
import java.util.List;
import l4.InterfaceC1426e;
import l4.InterfaceC1443v;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import u4.C2087C;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class v0 extends AbstractC1668a {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f13765p;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC1586x f13766k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f13767l;

    /* renamed from: m, reason: collision with root package name */
    public final z0 f13768m;

    /* renamed from: n, reason: collision with root package name */
    public final z0 f13769n;

    /* renamed from: o, reason: collision with root package name */
    public final z0 f13770o;

    static {
        kotlin.jvm.internal.r rVar = new kotlin.jvm.internal.r(v0.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f13765p = new InterfaceC1443v[]{zVar.h(rVar), AbstractC0703b.r(v0.class, "arguments", "getArguments()Ljava/util/List;", 0, zVar)};
    }

    public v0(AbstractC1586x abstractC1586x, InterfaceC0821a interfaceC0821a, boolean z7) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
        this.f13766k = abstractC1586x;
        this.f13767l = z7;
        z0 z0Var = interfaceC0821a instanceof z0 ? (z0) interfaceC0821a : null;
        this.f13768m = z0Var == null ? interfaceC0821a != null ? AbstractC0915m.D(null, interfaceC0821a) : null : z0Var;
        this.f13769n = AbstractC0915m.D(null, new u0(this, 0));
        this.f13770o = AbstractC0915m.D(null, new A3.q(14, this, interfaceC0821a));
    }

    @Override // l4.InterfaceC1444w
    public final List a() {
        InterfaceC1443v interfaceC1443v = f13765p[1];
        Object objInvoke = this.f13770o.invoke();
        kotlin.jvm.internal.l.e("getValue(...)", objInvoke);
        return (List) objInvoke;
    }

    @Override // l4.InterfaceC1444w
    public final boolean b() {
        return this.f13766k.u0();
    }

    @Override // l4.InterfaceC1444w
    public final InterfaceC1426e c() {
        InterfaceC1443v interfaceC1443v = f13765p[0];
        return (InterfaceC1426e) this.f13769n.invoke();
    }

    public final InterfaceC1426e d(AbstractC1586x abstractC1586x) {
        AbstractC1586x abstractC1586xB;
        if (this.f13767l) {
            InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
            C2087C c2087c = interfaceC2102hF instanceof C2087C ? (C2087C) interfaceC2102hF : null;
            if (c2087c != null) {
                return new t0(d5.e.g(c2087c));
            }
        }
        InterfaceC2102h interfaceC2102hF2 = abstractC1586x.t0().f();
        if (interfaceC2102hF2 instanceof InterfaceC2099e) {
            Class clsJ = F0.j((InterfaceC2099e) interfaceC2102hF2);
            if (clsJ != null) {
                if (!AbstractC1880i.y(abstractC1586x)) {
                    if (n5.Y.e(abstractC1586x)) {
                        return new C1649C(clsJ);
                    }
                    Class cls = (Class) AbstractC0011d.f219b.get(clsJ);
                    if (cls != null) {
                        clsJ = cls;
                    }
                    return new C1649C(clsJ);
                }
                n5.Q q6 = (n5.Q) P3.q.M0(abstractC1586x.q0());
                if (q6 == null || (abstractC1586xB = q6.b()) == null) {
                    return new C1649C(clsJ);
                }
                InterfaceC1426e interfaceC1426eD = d(AbstractC0905c.v(abstractC1586xB));
                if (interfaceC1426eD != null) {
                    return new C1649C(Array.newInstance((Class<?>) n6.m.F(AbstractC0905c.o(interfaceC1426eD)), 0).getClass());
                }
                throw new H5.C("Cannot determine classifier for array element type: " + this);
            }
        } else if (interfaceC2102hF2 instanceof u4.Q) {
            return new w0(null, (u4.Q) interfaceC2102hF2);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.l.a(this.f13766k, v0Var.f13766k) && kotlin.jvm.internal.l.a(c(), v0Var.c()) && a().equals(v0Var.a());
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        return F0.d(this.f13766k);
    }

    public final int hashCode() {
        int iHashCode = this.f13766k.hashCode() * 31;
        InterfaceC1426e interfaceC1426eC = c();
        return a().hashCode() + ((iHashCode + (interfaceC1426eC != null ? interfaceC1426eC.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return e3.c.E(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(AbstractC1586x abstractC1586x, InterfaceC0821a interfaceC0821a) {
        this(abstractC1586x, interfaceC0821a, false);
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
    }
}
