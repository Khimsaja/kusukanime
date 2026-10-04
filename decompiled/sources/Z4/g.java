package Z4;

import P3.F;
import n5.AbstractC1586x;
import n5.B;
import n5.Y;
import u4.C2113t;
import u4.C2119z;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2105k;
import u4.K;
import u4.S;
import u4.U;
import x4.C2264J;

/* loaded from: classes.dex */
public abstract class g {
    public static final /* synthetic */ int a = 0;

    static {
        W4.c cVar = new W4.c("kotlin.jvm.JvmInline");
        cVar.b();
        W4.e eVarG = cVar.a.g();
        W4.c cVar2 = W4.c.f9618c;
        F.g0(eVarG).a.c();
        new W4.c("kotlin.jvm.JvmName");
    }

    public static final boolean a(InterfaceC2097c interfaceC2097c) {
        S sZ;
        kotlin.jvm.internal.l.f("<this>", interfaceC2097c);
        if (!(interfaceC2097c instanceof C2264J)) {
            return false;
        }
        K kN0 = ((C2264J) interfaceC2097c).N0();
        kotlin.jvm.internal.l.e("getCorrespondingProperty(...)", kN0);
        if (kN0.D() != null) {
            return false;
        }
        InterfaceC2105k interfaceC2105kK = kN0.k();
        InterfaceC2099e interfaceC2099e = interfaceC2105kK instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105kK : null;
        if (interfaceC2099e == null || (sZ = interfaceC2099e.Z()) == null) {
            return false;
        }
        W4.e name = kN0.getName();
        kotlin.jvm.internal.l.e("getName(...)", name);
        return sZ.a(name);
    }

    public static final boolean b(InterfaceC2105k interfaceC2105k) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2105k);
        return (interfaceC2105k instanceof InterfaceC2099e) && (((InterfaceC2099e) interfaceC2105k).Z() instanceof C2113t);
    }

    public static final boolean c(InterfaceC2105k interfaceC2105k) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2105k);
        return (interfaceC2105k instanceof InterfaceC2099e) && (((InterfaceC2099e) interfaceC2105k).Z() instanceof C2119z);
    }

    public static final boolean d(U u5) {
        if (u5.D() != null) {
            return false;
        }
        InterfaceC2105k interfaceC2105kK = u5.k();
        W4.e eVar = null;
        InterfaceC2099e interfaceC2099e = interfaceC2105kK instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2105kK : null;
        if (interfaceC2099e != null) {
            int i7 = d5.e.a;
            S sZ = interfaceC2099e.Z();
            C2113t c2113t = sZ instanceof C2113t ? (C2113t) sZ : null;
            if (c2113t != null) {
                eVar = c2113t.a;
            }
        }
        return kotlin.jvm.internal.l.a(eVar, u5.getName());
    }

    public static final boolean e(InterfaceC2105k interfaceC2105k) {
        kotlin.jvm.internal.l.f("<this>", interfaceC2105k);
        return b(interfaceC2105k) || c(interfaceC2105k);
    }

    public static final boolean f(AbstractC1586x abstractC1586x) {
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        if (interfaceC2102hF != null) {
            return e(interfaceC2102hF);
        }
        return false;
    }

    public static final boolean g(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        return (interfaceC2102hF == null || !c(interfaceC2102hF) || Y.e(abstractC1586x)) ? false : true;
    }

    public static final B h(AbstractC1586x abstractC1586x) {
        kotlin.jvm.internal.l.f("<this>", abstractC1586x);
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
        if (interfaceC2099e != null) {
            int i7 = d5.e.a;
            S sZ = interfaceC2099e.Z();
            C2113t c2113t = sZ instanceof C2113t ? (C2113t) sZ : null;
            if (c2113t != null) {
                return (B) c2113t.f16340b;
            }
        }
        return null;
    }
}
