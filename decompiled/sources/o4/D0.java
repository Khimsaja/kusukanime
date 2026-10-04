package o4;

import R4.C0583n;
import X4.AbstractC0605b;
import X4.C0611h;
import X4.C0617n;
import f.AbstractC0847h;
import f1.AbstractC0870c;
import io.ktor.http.ContentDisposition;
import java.lang.reflect.Method;
import l5.C1465r;
import l5.InterfaceC1449b;
import l5.InterfaceC1459l;
import r4.AbstractC1887p;
import t4.C2050a;
import u4.InterfaceC2099e;
import u4.InterfaceC2104j;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import x4.AbstractC2287n;
import x4.C2264J;
import x4.C2265K;
import z4.C2495g;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public abstract class D0 {
    public static final W4.b a;

    static {
        W4.c cVar = new W4.c("java.lang.Void");
        a = new W4.b(cVar.b(), cVar.a.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C1686l a(InterfaceC2112s interfaceC2112s) {
        String strV = z1.c.v(interfaceC2112s);
        if (strV == null) {
            if (interfaceC2112s instanceof C2264J) {
                String strB = d5.e.k(interfaceC2112s).getName().b();
                kotlin.jvm.internal.l.e("asString(...)", strB);
                strV = H4.w.a(strB);
            } else if (interfaceC2112s instanceof C2265K) {
                String strB2 = d5.e.k(interfaceC2112s).getName().b();
                kotlin.jvm.internal.l.e("asString(...)", strB2);
                strV = H4.w.b(strB2);
            } else {
                strV = ((AbstractC2287n) interfaceC2112s).getName().b();
                kotlin.jvm.internal.l.e("asString(...)", strV);
            }
        }
        return new C1686l(new V4.e(strV, P3.F.j(interfaceC2112s, 1)));
    }

    public static AbstractC0870c b(u4.K k7) {
        kotlin.jvm.internal.l.f("possiblyOverriddenProperty", k7);
        u4.K kA = ((u4.K) Z4.e.s(k7)).a();
        kotlin.jvm.internal.l.e("getOriginal(...)", kA);
        if (kA instanceof C1465r) {
            C1465r c1465r = (C1465r) kA;
            C0617n c0617n = U4.j.f9300d;
            kotlin.jvm.internal.l.e("propertySignature", c0617n);
            R4.J j7 = c1465r.f12822K;
            U4.d dVar = (U4.d) android.support.v4.media.session.b.w(j7, c0617n);
            if (dVar != null) {
                return new C1689o(kA, j7, dVar, c1465r.f12823L, c1465r.f12824M);
            }
        } else if (kA instanceof J4.g) {
            J4.g gVar = (J4.g) kA;
            u4.M mL = gVar.l();
            C2495g c2495g = mL instanceof C2495g ? (C2495g) mL : null;
            A4.t tVar = c2495g != null ? c2495g.f19035k : null;
            if (tVar instanceof A4.v) {
                return new C1687m(((A4.v) tVar).a);
            }
            if (!(tVar instanceof A4.y)) {
                throw new H5.C("Incorrect resolution sequence for Java field " + kA + " (source = " + tVar + ')');
            }
            Method method = ((A4.y) tVar).a;
            C2265K c2265k = gVar.f17383H;
            u4.M mL2 = c2265k != null ? c2265k.l() : null;
            C2495g c2495g2 = mL2 instanceof C2495g ? (C2495g) mL2 : null;
            A4.t tVar2 = c2495g2 != null ? c2495g2.f19035k : null;
            A4.y yVar = tVar2 instanceof A4.y ? (A4.y) tVar2 : null;
            return new C1688n(method, yVar != null ? yVar.a : null);
        }
        C2264J getter = kA.getGetter();
        kotlin.jvm.internal.l.c(getter);
        C1686l c1686lA = a(getter);
        C2265K setter = kA.getSetter();
        return new C1690p(c1686lA, setter != null ? a(setter) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0847h c(InterfaceC2112s interfaceC2112s) {
        Method method;
        kotlin.jvm.internal.l.f("possiblySubstitutedFunction", interfaceC2112s);
        InterfaceC2112s interfaceC2112sA = ((InterfaceC2112s) Z4.e.s(interfaceC2112s)).a();
        kotlin.jvm.internal.l.e("getOriginal(...)", interfaceC2112sA);
        if (!(interfaceC2112sA instanceof InterfaceC1449b)) {
            if (interfaceC2112sA instanceof J4.f) {
                u4.M mL = ((J4.f) interfaceC2112sA).l();
                C2495g c2495g = mL instanceof C2495g ? (C2495g) mL : null;
                A4.t tVar = c2495g != null ? c2495g.f19035k : null;
                A4.y yVar = tVar instanceof A4.y ? (A4.y) tVar : null;
                if (yVar != null && (method = yVar.a) != null) {
                    return new C1684j(method);
                }
                throw new H5.C("Incorrect resolution sequence for Java method " + interfaceC2112sA);
            }
            if (!(interfaceC2112sA instanceof J4.b)) {
                AbstractC2287n abstractC2287n = (AbstractC2287n) interfaceC2112sA;
                if ((abstractC2287n.getName().equals(AbstractC1887p.f15020c) && Z4.l.n(interfaceC2112sA)) || ((abstractC2287n.getName().equals(AbstractC1887p.a) && Z4.l.n(interfaceC2112sA)) || (kotlin.jvm.internal.l.a(abstractC2287n.getName(), C2050a.f16034e) && interfaceC2112sA.m0().isEmpty()))) {
                    return a(interfaceC2112sA);
                }
                throw new H5.C("Unknown origin of " + interfaceC2112sA + " (" + interfaceC2112sA.getClass() + ')');
            }
            u4.M mL2 = ((J4.b) interfaceC2112sA).l();
            C2495g c2495g2 = mL2 instanceof C2495g ? (C2495g) mL2 : null;
            Object obj = c2495g2 != null ? c2495g2.f19035k : null;
            if (obj instanceof A4.s) {
                return new C1683i(((A4.s) obj).a);
            }
            if (obj instanceof A4.p) {
                A4.p pVar = (A4.p) obj;
                if (pVar.a.isAnnotation()) {
                    return new C1682h(pVar.a);
                }
            }
            throw new H5.C("Incorrect resolution sequence for Java constructor " + interfaceC2112sA + " (" + obj + ')');
        }
        InterfaceC1459l interfaceC1459l = (InterfaceC1459l) interfaceC2112sA;
        AbstractC0605b abstractC0605bH = interfaceC1459l.H();
        if (abstractC0605bH instanceof R4.B) {
            C0611h c0611h = V4.g.a;
            V4.e eVarC = V4.g.c((R4.B) abstractC0605bH, interfaceC1459l.n0(), interfaceC1459l.d0());
            if (eVarC != null) {
                return new C1686l(eVarC);
            }
        }
        if (abstractC0605bH instanceof C0583n) {
            C0611h c0611h2 = V4.g.a;
            V4.e eVarA = V4.g.a((C0583n) abstractC0605bH, interfaceC1459l.n0(), interfaceC1459l.d0());
            if (eVarA != null) {
                InterfaceC2105k interfaceC2105kK = interfaceC2112s.k();
                kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK);
                if (Z4.g.b(interfaceC2105kK)) {
                    return new C1686l(eVarA);
                }
                InterfaceC2105k interfaceC2105kK2 = interfaceC2112s.k();
                kotlin.jvm.internal.l.e("getContainingDeclaration(...)", interfaceC2105kK2);
                if (!Z4.g.c(interfaceC2105kK2)) {
                    return new C1685k(eVarA);
                }
                InterfaceC2104j interfaceC2104j = (InterfaceC2104j) interfaceC2112s;
                boolean zB = interfaceC2104j.B();
                String str = eVarA.f9484h;
                String str2 = eVarA.f9485i;
                if (zB) {
                    if (!kotlin.jvm.internal.l.a(str, "constructor-impl") || !AbstractC2517v.L(str2, ")V", false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                } else {
                    if (!kotlin.jvm.internal.l.a(str, "constructor-impl")) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                    InterfaceC2099e interfaceC2099eC = interfaceC2104j.C();
                    kotlin.jvm.internal.l.e("getConstructedClass(...)", interfaceC2099eC);
                    W4.b bVarF = d5.e.f(interfaceC2099eC);
                    kotlin.jvm.internal.l.c(bVarF);
                    String strB = V4.b.b(bVarF.b());
                    if (AbstractC2517v.L(str2, ")V", false)) {
                        String str3 = AbstractC2510o.p0(str2, "V") + strB;
                        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
                        kotlin.jvm.internal.l.f("desc", str3);
                        eVarA = new V4.e(str, str3);
                    } else if (!AbstractC2517v.L(str2, strB, false)) {
                        throw new IllegalArgumentException(("Invalid signature: " + eVarA).toString());
                    }
                }
                return new C1686l(eVarA);
            }
        }
        return a(interfaceC2112sA);
    }
}
