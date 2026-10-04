package A3;

import B3.AbstractC0025a;
import B3.C;
import B3.C0026b;
import G2.E;
import L.AbstractC0364e0;
import L.AbstractC0384j0;
import L.AbstractC0422u1;
import L.E0;
import L.H2;
import L.M;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.Z;
import android.content.Context;
import b1.AbstractC0703b;
import com.kusukanime.data.OtaCheck;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import n0.C1538e;
import o3.C1643j;
import q3.AbstractC1856g;
import q3.C1855f;
import s3.AbstractC1994a;
import u3.AbstractC2077b;
import u3.C2084i;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v.c0;
import v.e0;
import v.f0;
import w3.AbstractC2210a;
import x3.AbstractC2254a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z3.C2488d;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f162k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f163l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f164m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f165n;

    public /* synthetic */ l(InterfaceC0821a interfaceC0821a, e4.k kVar, C c2, int i7) {
        this.f162k = 2;
        this.f164m = interfaceC0821a;
        this.f163l = kVar;
        this.f165n = c2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        C0510p c0510p;
        int i7 = 7;
        int i8 = 12;
        int i9 = 4;
        a0.n nVar = a0.n.a;
        int i10 = 0;
        Object obj3 = C0502l.a;
        O3.C c2 = O3.C.a;
        Object obj4 = this.f163l;
        Object obj5 = this.f165n;
        Object obj6 = this.f164m;
        switch (this.f162k) {
            case 0:
                ((Integer) obj2).getClass();
                c.a((e4.k) obj4, (e4.k) obj6, (B) obj5, (C0510p) obj, C0486d.V(1));
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p2.y()) {
                    Context context = (Context) obj4;
                    C c4 = (C) obj6;
                    boolean zH = c0510p2.h(context) | c0510p2.h(c4);
                    Object objH = c0510p2.H();
                    if (zH || objH == obj3) {
                        objH = new B3.m(context, c4, (Z) obj5);
                        c0510p2.b0(objH);
                    }
                    E0.h((InterfaceC0821a) objH, null, false, null, null, null, null, AbstractC0025a.f453s, c0510p2, 805306368, 510);
                    break;
                } else {
                    c0510p2.M();
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0025a.b((InterfaceC0821a) obj6, (e4.k) obj4, (C) obj5, (C0510p) obj, C0486d.V(1));
                break;
            case 3:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p3.y()) {
                    C c6 = (C) obj4;
                    InterfaceC0821a interfaceC0821a = (InterfaceC0821a) obj6;
                    boolean zH2 = c0510p3.h(c6) | c0510p3.f(interfaceC0821a);
                    Object objH2 = c0510p3.H();
                    if (zH2 || objH2 == obj3) {
                        objH2 = new B3.m(c6, (Z) obj5, interfaceC0821a, i10);
                        c0510p3.b0(objH2);
                    }
                    E0.b((InterfaceC0821a) objH2, null, false, null, null, null, null, null, AbstractC0025a.f448n, c0510p3, 805306368, 510);
                    break;
                } else {
                    c0510p3.M();
                    break;
                }
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((Integer) obj2).getClass();
                D3.f.f((String) obj4, (String) obj6, (a0.n) obj5, (C0510p) obj, C0486d.V(7));
                break;
            case 5:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p4.y()) {
                    if (((Boolean) ((Z) obj6).getValue()).booleanValue() || (str = (String) obj4) == null || AbstractC2517v.T(str, "player", false)) {
                        c0510p4.R(-1214329324);
                    } else {
                        c0510p4.R(-1201672737);
                        AbstractC0422u1.a(null, ((N) c0510p4.k(P.a)).f5229F, 0L, 0, null, W.f.b(672095376, new C1643j(str, (E) obj5), c0510p4), c0510p4, 199680);
                    }
                    c0510p4.p(false);
                    break;
                } else {
                    c0510p4.M();
                    break;
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC1856g.a((e4.k) obj4, (InterfaceC0821a) obj6, (C1855f) obj5, (C0510p) obj, C0486d.V(1));
                break;
            case 7:
                C0510p c0510p5 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p5.y()) {
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p5, 48);
                    int i11 = c0510p5.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p5.m();
                    a0.q qVarC = a0.a.c(c0510p5, nVar);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p5.V();
                    if (c0510p5.f7127O) {
                        c0510p5.l(c2362i);
                    } else {
                        c0510p5.e0();
                    }
                    C0486d.R(c0510p5, C2363j.f17875f, f0VarB);
                    C0486d.R(c0510p5, C2363j.f17874e, interfaceC0501k0M);
                    C2361h c2361h = C2363j.f17876g;
                    if (c0510p5.f7127O || !kotlin.jvm.internal.l.a(c0510p5.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p5, i11, c2361h);
                    }
                    C0486d.R(c0510p5, C2363j.f17873d, qVarC);
                    List list = (List) obj4;
                    if (list.size() > 1) {
                        c0510p5.R(-2052774953);
                        Z z7 = (Z) obj6;
                        boolean zBooleanValue = ((Boolean) z7.getValue()).booleanValue();
                        boolean zF = c0510p5.f(z7);
                        Object objH3 = c0510p5.H();
                        if (zF || objH3 == obj3) {
                            objH3 = new B3.i(23, z7);
                            c0510p5.b0(objH3);
                        }
                        W.a aVarB = W.f.b(1985777251, new C0026b(i7, z7), c0510p5);
                        W.a aVar = AbstractC1994a.a;
                        C.d dVarA = C.e.a();
                        float f5 = AbstractC0364e0.a;
                        M.a(zBooleanValue, (InterfaceC0821a) objH3, aVarB, null, false, aVar, dVarA, AbstractC0364e0.a(((N) c0510p5.k(P.a)).f5230G, 0L, 0L, c0510p5, 4094), null, null, c0510p5, 196992, 6, 2648);
                        c0510p = c0510p5;
                        AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(6));
                    } else {
                        c0510p = c0510p5;
                        c0510p.R(-2062933715);
                    }
                    c0510p.p(false);
                    if (list.size() > 12) {
                        c0510p.R(-2051371459);
                        Z z8 = (Z) obj5;
                        boolean zF2 = c0510p.f(z8);
                        Object objH4 = c0510p.H();
                        if (zF2 || objH4 == obj3) {
                            objH4 = new B3.i(24, z8);
                            c0510p.b0(objH4);
                        }
                        E0.i((InterfaceC0821a) objH4, null, false, null, null, null, AbstractC1994a.f15639b, c0510p, 805306368, 510);
                    } else {
                        c0510p.R(-2062933715);
                    }
                    c0510p.p(false);
                    c0510p.p(true);
                    break;
                } else {
                    c0510p5.M();
                    break;
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC2077b.a((e4.k) obj4, (InterfaceC0821a) obj6, (C2084i) obj5, (C0510p) obj, C0486d.V(1));
                break;
            case 9:
                C0510p c0510p6 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p6.y()) {
                    w3.y yVar = (w3.y) obj4;
                    InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) obj6;
                    boolean zH3 = c0510p6.h(yVar) | c0510p6.f(interfaceC0821a2);
                    Object objH5 = c0510p6.H();
                    if (zH3 || objH5 == obj3) {
                        objH5 = new B3.m(yVar, (Z) obj5, interfaceC0821a2, 5);
                        c0510p6.b0(objH5);
                    }
                    E0.b((InterfaceC0821a) objH5, null, false, null, null, null, null, null, AbstractC2210a.f16944p, c0510p6, 805306368, 510);
                    break;
                } else {
                    c0510p6.M();
                    break;
                }
                break;
            case 10:
                C0510p c0510p7 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p7.y()) {
                    Context context2 = (Context) obj4;
                    w3.y yVar2 = (w3.y) obj6;
                    boolean zH4 = c0510p7.h(context2) | c0510p7.h(yVar2);
                    Object objH6 = c0510p7.H();
                    if (zH4 || objH6 == obj3) {
                        objH6 = new B3.m(context2, yVar2, (Z) obj5, i9);
                        c0510p7.b0(objH6);
                    }
                    E0.h((InterfaceC0821a) objH6, null, false, null, null, null, null, AbstractC2210a.f16953y, c0510p7, 805306368, 510);
                    break;
                } else {
                    c0510p7.M();
                    break;
                }
            case 11:
                C0510p c0510p8 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p8.y()) {
                    OtaCheck otaCheck = (OtaCheck) ((Z) obj5).getValue();
                    if (otaCheck == null || !otaCheck.getForce()) {
                        c0510p8.R(-1832774901);
                        x3.h hVar = (x3.h) obj4;
                        Context context3 = (Context) obj6;
                        boolean zH5 = c0510p8.h(hVar) | c0510p8.h(context3);
                        Object objH7 = c0510p8.H();
                        if (zH5 || objH7 == obj3) {
                            objH7 = new Z5.A(i8, hVar, context3);
                            c0510p8.b0(objH7);
                        }
                        E0.h((InterfaceC0821a) objH7, null, false, null, null, null, null, AbstractC2254a.f17311b, c0510p8, 805306368, 510);
                    } else {
                        c0510p8.R(-1842146976);
                    }
                    c0510p8.p(false);
                    break;
                } else {
                    c0510p8.M();
                    break;
                }
                break;
            case 12:
                C0510p c0510p9 = (C0510p) obj;
                if ((((Integer) obj2).intValue() & 3) != 2 || !c0510p9.y()) {
                    a0.q qVarI = androidx.compose.foundation.layout.a.i(nVar, 20, 14);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10394x, c0510p9, 48);
                    int i12 = c0510p9.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p9.m();
                    a0.q qVarC2 = a0.a.c(c0510p9, qVarI);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p9.V();
                    if (c0510p9.f7127O) {
                        c0510p9.l(c2362i2);
                    } else {
                        c0510p9.e0();
                    }
                    C0486d.R(c0510p9, C2363j.f17875f, c2140tA);
                    C0486d.R(c0510p9, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p9.f7127O || !kotlin.jvm.internal.l.a(c0510p9.H(), Integer.valueOf(i12))) {
                        AbstractC0703b.u(i12, c0510p9, i12, c2361h2);
                    }
                    C0486d.R(c0510p9, C2363j.f17873d, qVarC2);
                    Integer num = (Integer) obj4;
                    if (num != null) {
                        c0510p9.R(-658613619);
                        C1538e c1538eZ = num.intValue() < 0 ? android.support.v4.media.session.b.z() : P3.r.A();
                        long j7 = C0998u.f11830c;
                        AbstractC0384j0.a(c1538eZ, null, androidx.compose.foundation.layout.c.j(nVar, 28), j7, c0510p9, 3504, 0);
                        AbstractC2123b.a(c0510p9, androidx.compose.foundation.layout.c.e(nVar, 4));
                        H2.b((num.intValue() < 0 ? "-" : "+").concat("10 detik"), null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p9.k(N2.a)).f5221m, c0510p9, 384, 0, 65530);
                        c0510p9.p(false);
                    } else {
                        Float f7 = (Float) obj6;
                        if (f7 != null) {
                            c0510p9.R(-657768156);
                            H2.b(c0.a((int) (f7.floatValue() * 100), "☀ ", "%"), null, C0998u.f11830c, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p9.k(N2.a)).f5216h, c0510p9, 384, 0, 65530);
                            c0510p9.p(false);
                        } else {
                            Float f8 = (Float) obj5;
                            if (f8 != null) {
                                c0510p9.R(-657410106);
                                H2.b(c0.a((int) (f8.floatValue() * 100), "🔊 ", "%"), null, C0998u.f11830c, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p9.k(N2.a)).f5216h, c0510p9, 384, 0, 65530);
                            } else {
                                c0510p9.R(-696093859);
                            }
                            c0510p9.p(false);
                        }
                    }
                    c0510p9.p(true);
                    break;
                } else {
                    c0510p9.M();
                    break;
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0847h.e((e4.k) obj4, (e4.k) obj6, (C2488d) obj5, (C0510p) obj, C0486d.V(1));
                break;
        }
        return c2;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7) {
        this.f162k = i7;
        this.f163l = obj;
        this.f164m = obj2;
        this.f165n = obj3;
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i7, int i8) {
        this.f162k = i8;
        this.f163l = obj;
        this.f164m = obj2;
        this.f165n = obj3;
    }
}
