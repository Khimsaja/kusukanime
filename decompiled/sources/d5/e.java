package d5;

import P3.m;
import P3.q;
import P3.r;
import java.util.Collection;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import o5.AbstractC1707g;
import r4.AbstractC1880i;
import u4.InterfaceC2088D;
import u4.InterfaceC2094J;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2103i;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;
import u4.InterfaceC2118y;
import u4.K;
import v4.InterfaceC2154b;
import w5.k;
import x4.AbstractC2257C;
import x4.AbstractC2261G;
import x4.C2272S;
import y5.g;
import y5.h;

/* loaded from: classes.dex */
public abstract class e {
    public static final /* synthetic */ int a = 0;

    static {
        W4.e.e("value");
    }

    public static final boolean a(C2272S c2272s) {
        Boolean boolG = k.g(r.H(c2272s), C0805a.f11324b, C0807c.f11327k);
        l.e("ifAny(...)", boolG);
        return boolG.booleanValue();
    }

    public static InterfaceC2097c b(InterfaceC2097c interfaceC2097c, e4.k kVar) {
        l.f("<this>", interfaceC2097c);
        return (InterfaceC2097c) k.e(r.H(interfaceC2097c), new C0805a(1), new d(new x(), kVar));
    }

    public static final W4.c c(InterfaceC2106l interfaceC2106l) {
        l.f("<this>", interfaceC2106l);
        W4.d dVarH = h(interfaceC2106l);
        if (!dVarH.d()) {
            dVarH = null;
        }
        if (dVarH != null) {
            return dVarH.i();
        }
        return null;
    }

    public static final InterfaceC2099e d(InterfaceC2154b interfaceC2154b) {
        l.f("<this>", interfaceC2154b);
        InterfaceC2102h interfaceC2102hF = interfaceC2154b.getType().t0().f();
        if (interfaceC2102hF instanceof InterfaceC2099e) {
            return (InterfaceC2099e) interfaceC2102hF;
        }
        return null;
    }

    public static final AbstractC1880i e(InterfaceC2105k interfaceC2105k) {
        l.f("<this>", interfaceC2105k);
        return j(interfaceC2105k).d();
    }

    public static final W4.b f(InterfaceC2102h interfaceC2102h) {
        InterfaceC2105k interfaceC2105kK;
        W4.b bVarF;
        if (interfaceC2102h == null || (interfaceC2105kK = interfaceC2102h.k()) == null) {
            return null;
        }
        if (interfaceC2105kK instanceof InterfaceC2088D) {
            W4.e name = interfaceC2102h.getName();
            l.e("getName(...)", name);
            return new W4.b(((AbstractC2257C) ((InterfaceC2088D) interfaceC2105kK)).f17354o, name);
        }
        if (!(interfaceC2105kK instanceof InterfaceC2103i) || (bVarF = f((InterfaceC2102h) interfaceC2105kK)) == null) {
            return null;
        }
        W4.e name2 = interfaceC2102h.getName();
        l.e("getName(...)", name2);
        return bVarF.d(name2);
    }

    public static final W4.c g(InterfaceC2105k interfaceC2105k) {
        l.f("<this>", interfaceC2105k);
        W4.c cVarH = Z4.e.h(interfaceC2105k);
        return cVarH != null ? cVarH : Z4.e.g(interfaceC2105k.k()).a(interfaceC2105k.getName()).i();
    }

    public static final W4.d h(InterfaceC2105k interfaceC2105k) {
        l.f("<this>", interfaceC2105k);
        W4.d dVarG = Z4.e.g(interfaceC2105k);
        l.e("getFqName(...)", dVarG);
        return dVarG;
    }

    public static final void i(InterfaceC2118y interfaceC2118y) {
        l.f("<this>", interfaceC2118y);
        if (interfaceC2118y.o0(AbstractC1707g.a) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC2118y j(InterfaceC2105k interfaceC2105k) {
        l.f("<this>", interfaceC2105k);
        InterfaceC2118y interfaceC2118yD = Z4.e.d(interfaceC2105k);
        l.e("getContainingModule(...)", interfaceC2118yD);
        return interfaceC2118yD;
    }

    public static final InterfaceC2097c k(InterfaceC2097c interfaceC2097c) {
        l.f("<this>", interfaceC2097c);
        if (!(interfaceC2097c instanceof InterfaceC2094J)) {
            return interfaceC2097c;
        }
        K kN0 = ((AbstractC2261G) ((InterfaceC2094J) interfaceC2097c)).N0();
        l.e("getCorrespondingProperty(...)", kN0);
        return kN0;
    }

    public static final g l(InterfaceC2097c interfaceC2097c) {
        l.f("<this>", interfaceC2097c);
        h hVarQ = m.Q(new InterfaceC2097c[]{interfaceC2097c});
        Collection collectionM = interfaceC2097c.m();
        l.e("getOverriddenDescriptors(...)", collectionM);
        return y5.k.Q(m.Q(new h[]{hVarQ, new g(q.l0(collectionM), new C0806b(1), y5.m.f18389k)}));
    }
}
