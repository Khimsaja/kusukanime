package H;

import D.C0042b;
import D.F0;
import G2.C0174k;
import L.AbstractC0374g2;
import L.AbstractC0379i;
import L.AbstractC0412r0;
import L.AbstractC0414s;
import L.AbstractC0422u1;
import L.C0391l;
import L.C0392l0;
import L.C0393l1;
import M.AbstractC0461t;
import M.C0458p;
import M.C0460s;
import O.A0;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.R0;
import P.C0556a;
import P.C0557b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.AbstractC0703b;
import com.kusukanime.R;
import f.AbstractC0841b;
import f6.AbstractC0905c;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import o.C1609g;
import o.C1622t;
import r.C1859a;
import s.C1939t;
import s.InterfaceC1911e0;
import t0.C2033c;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.e0;
import v.f0;
import v.h0;
import v.p0;
import w0.C2203v;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import y.C2315O;
import y.C2337r;
import y.C2338s;
import y.C2343x;
import y.InterfaceC2339t;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.C2471u;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2897l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2898m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f2899n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i7, int i8, Object obj, Object obj2) {
        super(2);
        this.f2897l = i8;
        this.f2898m = obj;
        this.f2899n = obj2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        h0 h0Var = h0.a;
        int i7 = 4;
        int i8 = 12;
        O.T t7 = C0502l.a;
        a0.n nVar = a0.n.a;
        O3.C c2 = O3.C.a;
        Object obj3 = this.f2899n;
        Object obj4 = this.f2898m;
        switch (this.f2897l) {
            case 0:
                ((Number) obj2).intValue();
                z1.c.d((a0.q) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(49));
                return c2;
            case 1:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    ((H2.o) obj4).f3633t.invoke((C0174k) obj3, c0510p, 0);
                }
                return c2;
            case 2:
                ((Number) obj2).intValue();
                n6.m.f((Y.r) obj4, (List) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
            case 3:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    q0.c.e((X.g) obj4, (W.a) obj3, c0510p2, 0);
                }
                return c2;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    C0174k c0174k = (C0174k) obj4;
                    G2.y yVar = c0174k.f2703l;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                    ((H2.h) yVar).f3613s.invoke((C1609g) obj3, c0174k, c0510p3, 0);
                }
                return c2;
            case 5:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    String strB = AbstractC0461t.b(R.string.m3c_dialog, c0510p4);
                    a0.q qVarM = androidx.compose.foundation.layout.c.m((a0.n) obj4, AbstractC0379i.a, AbstractC0379i.f5598b, 10);
                    boolean zF = c0510p4.f(strB);
                    Object objH = c0510p4.H();
                    if (zF || objH == t7) {
                        objH = new F0.l(strB, i);
                        c0510p4.b0(objH);
                    }
                    a0.q qVarK = qVarM.k(F0.k.a(nVar, false, (e4.k) objH));
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, true);
                    int i9 = c0510p4.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p4.m();
                    a0.q qVarC = a0.a.c(c0510p4, qVarK);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p4.V();
                    if (c0510p4.f7127O) {
                        c0510p4.l(c2362i);
                    } else {
                        c0510p4.e0();
                    }
                    C0486d.R(c0510p4, C2363j.f17875f, interfaceC2173HE);
                    C0486d.R(c0510p4, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p4, i9, c2361h);
                    }
                    C0486d.R(c0510p4, C2363j.f17873d, qVarC);
                    ((W.a) obj3).invoke(c0510p4, 0);
                    c0510p4.p(true);
                }
                return c2;
            case 6:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    a0.q qVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.a(nVar, AbstractC0414s.f5779c, AbstractC0414s.f5780d), (v.Z) obj4);
                    f0 f0VarB = e0.b(AbstractC2130i.f16446d, a0.b.f10391u, c0510p5, 54);
                    int i10 = c0510p5.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p5.m();
                    a0.q qVarC2 = a0.a.c(c0510p5, qVarG);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p5.V();
                    if (c0510p5.f7127O) {
                        c0510p5.l(c2362i2);
                    } else {
                        c0510p5.e0();
                    }
                    C0486d.R(c0510p5, C2363j.f17875f, f0VarB);
                    C0486d.R(c0510p5, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p5.f7127O || !kotlin.jvm.internal.l.a(c0510p5.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p5, i10, c2361h2);
                    }
                    C0486d.R(c0510p5, C2363j.f17873d, qVarC2);
                    ((e4.o) obj3).invoke(h0Var, c0510p5, 6);
                    c0510p5.p(true);
                }
                return c2;
            case 7:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    AbstractC0412r0.c(((C0392l0) obj4).f5640b, N.j.f6687e, (W.a) obj3, c0510p6, 48);
                }
                return c2;
            case 8:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    a0.q qVarA = F0.k.a(androidx.compose.foundation.layout.c.b(p0.a(androidx.compose.foundation.layout.c.d(nVar, 1.0f), (v.W) obj4), 0.0f, AbstractC0422u1.a, 1), false, B.a.f261l);
                    v.M m7 = AbstractC2130i.a;
                    f0 f0VarB2 = e0.b(AbstractC2130i.g(AbstractC0422u1.f5859b), a0.b.f10391u, c0510p7, 54);
                    int i11 = c0510p7.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p7.m();
                    a0.q qVarC3 = a0.a.c(c0510p7, qVarA);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i3 = C2363j.f17871b;
                    c0510p7.V();
                    if (c0510p7.f7127O) {
                        c0510p7.l(c2362i3);
                    } else {
                        c0510p7.e0();
                    }
                    C0486d.R(c0510p7, C2363j.f17875f, f0VarB2);
                    C0486d.R(c0510p7, C2363j.f17874e, interfaceC0501k0M3);
                    C2361h c2361h3 = C2363j.f17876g;
                    if (c0510p7.f7127O || !kotlin.jvm.internal.l.a(c0510p7.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p7, i11, c2361h3);
                    }
                    C0486d.R(c0510p7, C2363j.f17873d, qVarC3);
                    ((W.a) obj3).invoke(h0Var, c0510p7, 6);
                    c0510p7.p(true);
                }
                return c2;
            case 9:
                C0510p c0510p8 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    a0.q qVarC4 = androidx.compose.ui.layout.a.c(nVar, "indicator");
                    R0 r02 = (R0) obj4;
                    boolean zF2 = c0510p8.f(r02);
                    Object objH2 = c0510p8.H();
                    if (zF2 || objH2 == t7) {
                        objH2 = new C0042b(i8, r02);
                        c0510p8.b0(objH2);
                    }
                    a0.q qVarA2 = androidx.compose.ui.graphics.a.a(qVarC4, (e4.k) objH2);
                    float f5 = N.l.a;
                    AbstractC2136o.a(androidx.compose.foundation.a.b(qVarA2, ((C0393l1) obj3).f5644c, AbstractC0374g2.a(5, c0510p8)), c0510p8, 0);
                }
                return c2;
            case 10:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                C0460s c0460s = ((C0458p) obj4).a;
                c0460s.f6340j.g(fFloatValue);
                c0460s.f6341k.g(fFloatValue2);
                ((kotlin.jvm.internal.u) obj3).f12717k = fFloatValue;
                return c2;
            case 11:
                C0510p c0510p9 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    a0.q qVarA3 = F0.k.a(nVar, false, X0.b.f9697p);
                    X0.v vVar = (X0.v) obj4;
                    boolean zH = c0510p9.h(vVar);
                    Object objH3 = c0510p9.H();
                    if (zH || objH3 == t7) {
                        objH3 = new X0.h(vVar, 1);
                        c0510p9.b0(objH3);
                    }
                    a0.q qVarE = androidx.compose.ui.layout.a.e(qVarA3, (e4.k) objH3);
                    float f7 = vVar.getCanCalculatePosition() ? 1.0f : 0.0f;
                    if (f7 != 1.0f) {
                        qVarE = androidx.compose.ui.graphics.a.b(qVarE, f7, 0.0f, null, true, 126971);
                    }
                    a0.q qVar = qVarE;
                    W.a aVarB = W.f.b(606497925, new C0391l(i7, (O.Z) obj3), c0510p9);
                    X0.d dVar = X0.d.f9706c;
                    int i12 = c0510p9.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M4 = c0510p9.m();
                    a0.q qVarC5 = a0.a.c(c0510p9, qVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i4 = C2363j.f17871b;
                    c0510p9.V();
                    if (c0510p9.f7127O) {
                        c0510p9.l(c2362i4);
                    } else {
                        c0510p9.e0();
                    }
                    C0486d.R(c0510p9, C2363j.f17875f, dVar);
                    C0486d.R(c0510p9, C2363j.f17874e, interfaceC0501k0M4);
                    C2361h c2361h4 = C2363j.f17876g;
                    if (c0510p9.f7127O || !kotlin.jvm.internal.l.a(c0510p9.H(), Integer.valueOf(i12))) {
                        AbstractC0703b.u(i12, c0510p9, i12, c2361h4);
                    }
                    C0486d.R(c0510p9, C2363j.f17873d, qVarC5);
                    AbstractC0703b.v(6, aVarB, c0510p9, true);
                }
                return c2;
            case 12:
                ((Number) obj2).intValue();
                AbstractC0841b.a((a0.q) obj4, (e4.k) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
            case 13:
                ((Number) obj2).intValue();
                ((r.g) obj4).a((C1859a) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
            case 14:
                ((Number) obj2).intValue();
                r.n.a((C1859a) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(385));
                return c2;
            case 15:
                C0510p c0510p10 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p10.y()) {
                    c0510p10.M();
                } else {
                    C1859a c1859a = (C1859a) obj4;
                    r.n.a(c1859a, W.f.b(1156688164, new F0(i7, (A3.t) obj3, c1859a), c0510p10), c0510p10, 384);
                }
                return c2;
            case 16:
                long j7 = ((g0.c) obj2).a;
                AbstractC0905c.d((C2033c) obj4, (s0.r) obj);
                J5.e eVar = ((s.P) obj3).f15195D;
                if (eVar != null) {
                    eVar.mo2trySendJP2dKIU(new C1939t(j7));
                }
                return c2;
            case 17:
                C0510p c0510p11 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p11.y()) {
                    c0510p11.M();
                } else {
                    Boolean bool = (Boolean) ((C2203v) obj4).f16883f.getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    c0510p11.U(bool);
                    boolean zG = c0510p11.g(zBooleanValue);
                    c0510p11.R(-869707859);
                    if (zBooleanValue) {
                        ((e4.n) obj3).invoke(c0510p11, 0);
                    } else {
                        if ((c0510p11.f7138k != 0 ? 0 : 1) == 0) {
                            C0486d.w("No nodes can be emitted before calling dactivateToEndGroup");
                            throw null;
                        }
                        if (!c0510p11.f7127O) {
                            if (zG) {
                                A0 a02 = c0510p11.f7120F;
                                int i13 = a02.f6935g;
                                int i14 = a02.f6936h;
                                C0557b c0557b = c0510p11.f7124L;
                                c0557b.getClass();
                                c0557b.d(false);
                                C0556a c0556a = c0557b.f7652b;
                                c0556a.getClass();
                                c0556a.f7651i.f0(P.f.f7667c);
                                C0486d.q(c0510p11.f7145r, i13, i14);
                                c0510p11.f7120F.m();
                            } else {
                                c0510p11.L();
                            }
                        }
                    }
                    c0510p11.p(false);
                    if (c0510p11.f7151x && c0510p11.f7120F.f6937i == c0510p11.f7152y) {
                        c0510p11.f7152y = -1;
                        c0510p11.f7151x = false;
                    }
                    c0510p11.p(false);
                }
                return c2;
            case 18:
                ((Number) obj2).intValue();
                w0.X.b((a0.n) obj4, (e4.n) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
            case 19:
                C0510p c0510p12 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p12.y()) {
                    c0510p12.M();
                } else {
                    C2338s c2338s = (C2338s) obj4;
                    InterfaceC2339t interfaceC2339t = (InterfaceC2339t) c2338s.f17640b.invoke();
                    C2337r c2337r = (C2337r) obj3;
                    int iA = c2337r.f17637c;
                    int iB = interfaceC2339t.b();
                    Object obj5 = c2337r.a;
                    if ((iA >= iB || !interfaceC2339t.c(iA).equals(obj5)) && (iA = interfaceC2339t.a(obj5)) != -1) {
                        c2337r.f17637c = iA;
                    }
                    if (iA != -1) {
                        c0510p12.R(-660479623);
                        AbstractC0905c.c(interfaceC2339t, c2338s.a, iA, c2337r.a, c0510p12, 0);
                        c0510p12.p(false);
                    } else {
                        c0510p12.R(-660272047);
                        c0510p12.p(false);
                    }
                    boolean zH2 = c0510p12.h(c2337r);
                    Object objH4 = c0510p12.H();
                    if (zH2 || objH4 == t7) {
                        objH4 = new C1622t(i8, c2337r);
                        c0510p12.b0(objH4);
                    }
                    C0486d.c(obj5, (e4.k) objH4, c0510p12);
                }
                return c2;
            case 20:
                return (InterfaceC2174I) ((e4.n) obj3).invoke(new C2343x((C2338s) obj4, (w0.b0) obj), new T0.a(((T0.a) obj2).a));
            case 21:
                C0510p c0510p13 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p13.y()) {
                    c0510p13.M();
                } else {
                    C2315O c2315o = (C2315O) obj4;
                    c2315o.f17596b.setValue(P3.r.S(c0510p13));
                    ((W.a) obj3).invoke(c2315o, c0510p13, 0);
                }
                return c2;
            case 22:
                float fFloatValue3 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) obj4;
                uVar.f12717k += ((InterfaceC1911e0) obj3).a(fFloatValue3 - uVar.f12717k);
                return c2;
            default:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((C2471u) obj4, (W.a) obj3, (C0510p) obj, C0486d.V(1));
                return c2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i7, Object obj, Object obj2) {
        super(2);
        this.f2897l = i7;
        this.f2898m = obj;
        this.f2899n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C1859a c1859a, A3.t tVar) {
        super(2);
        this.f2897l = 15;
        this.f2898m = c1859a;
        this.f2899n = tVar;
    }
}
