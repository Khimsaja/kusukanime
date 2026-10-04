package D;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.C0524x;
import O.R0;
import android.graphics.Typeface;
import android.text.Spannable;
import e4.InterfaceC0821a;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import io.ktor.util.GzipHeaderFlags;
import p.C1743c;
import p.C1761m;
import r.C1859a;
import s.C1941u;
import s.EnumC1903a0;
import t0.C2033c;
import w.C2164e;
import z.C2425d;

/* loaded from: classes.dex */
public final class F0 extends kotlin.jvm.internal.m implements e4.o {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1026l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1027m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1028n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(int i7, Object obj, Object obj2) {
        super(3);
        this.f1026l = i7;
        this.f1027m = obj;
        this.f1028n = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        boolean zJ0;
        switch (this.f1026l) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p.R(-102778667);
                Object objH = c0510p.H();
                O.T t7 = C0502l.a;
                if (objH == t7) {
                    C0524x c0524x = new C0524x(C0486d.y(c0510p));
                    c0510p.b0(c0524x);
                    objH = c0524x;
                }
                M5.c cVar = ((C0524x) objH).f7242k;
                Object objH2 = c0510p.H();
                if (objH2 == t7) {
                    objH2 = C0486d.K(null, O.T.f7049p);
                    c0510p.b0(objH2);
                }
                O.Z z7 = (O.Z) objH2;
                O.Z zN = C0486d.N((e4.k) this.f1027m, c0510p);
                u.k kVar = (u.k) this.f1028n;
                boolean zF = c0510p.f(kVar);
                Object objH3 = c0510p.H();
                if (zF || objH3 == t7) {
                    objH3 = new A3.t(4, z7, kVar);
                    c0510p.b0(objH3);
                }
                C0486d.c(kVar, (e4.k) objH3, c0510p);
                a0.n nVar = a0.n.a;
                boolean zH = c0510p.h(cVar) | c0510p.f(kVar) | c0510p.f(zN);
                Object objH4 = c0510p.H();
                if (zH || objH4 == t7) {
                    E0 e02 = new E0(cVar, z7, (u.k) this.f1028n, zN, null);
                    c0510p.b0(e02);
                    objH4 = e02;
                }
                a0.q qVarA = s0.w.a(nVar, kVar, (e4.n) objH4);
                c0510p.p(false);
                return qVarA;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p2.R(759876635);
                Object objH5 = c0510p2.H();
                O.T t8 = C0502l.a;
                if (objH5 == t8) {
                    objH5 = C0486d.D((InterfaceC0821a) this.f1028n);
                    c0510p2.b0(objH5);
                }
                R0 r02 = (R0) objH5;
                Object objH6 = c0510p2.H();
                if (objH6 == t8) {
                    objH6 = new C1743c(new g0.c(((g0.c) r02.getValue()).a), H.H.f2889b, new g0.c(H.H.f2890c), 8);
                    c0510p2.b0(objH6);
                }
                C1743c c1743c = (C1743c) objH6;
                O3.C c2 = O3.C.a;
                boolean zH2 = c0510p2.h(c1743c);
                Object objH7 = c0510p2.H();
                if (zH2 || objH7 == t8) {
                    objH7 = new H.G(r02, c1743c, null);
                    c0510p2.b0(objH7);
                }
                C0486d.e(c0510p2, (e4.n) objH7, c2);
                C1761m c1761m = c1743c.f13958c;
                boolean zF2 = c0510p2.f(c1761m);
                Object objH8 = c0510p2.H();
                if (zF2 || objH8 == t8) {
                    objH8 = new H.C(c1761m, 0);
                    c0510p2.b0(objH8);
                }
                a0.q qVar = (a0.q) ((e4.k) this.f1027m).invoke((InterfaceC0821a) objH8);
                c0510p2.p(false);
                return qVar;
            case 2:
                H0.B b4 = (H0.B) obj;
                int iIntValue = ((Number) obj2).intValue();
                int iIntValue2 = ((Number) obj3).intValue();
                M0.j jVar = b4.f3059f;
                M0.u uVar = b4.f3056c;
                if (uVar == null) {
                    uVar = M0.u.f6415o;
                }
                M0.q qVar2 = b4.f3057d;
                int i7 = qVar2 != null ? qVar2.a : 0;
                M0.r rVar = b4.f3058e;
                int i8 = rVar != null ? rVar.a : 1;
                P0.c cVar2 = (P0.c) ((C2164e) this.f1028n).f16696m;
                M0.H hB = ((M0.k) cVar2.f7696o).b(jVar, uVar, i7, i8);
                if (hB instanceof M0.G) {
                    Object obj4 = ((M0.G) hB).f6382k;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj4);
                    typeface = (Typeface) obj4;
                } else {
                    B2.l lVar = new B2.l(hB, cVar2.f7701t);
                    cVar2.f7701t = lVar;
                    Object obj5 = lVar.f418n;
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
                    typeface = (Typeface) obj5;
                }
                ((Spannable) this.f1027m).setSpan(new K0.b(1, typeface), iIntValue, iIntValue2, 33);
                return O3.C.a;
            case 3:
                C0510p c0510p3 = (C0510p) obj2;
                ((Number) obj3).intValue();
                c0510p3.R(-353972293);
                q.N nA = ((q.M) this.f1027m).a((u.j) this.f1028n, c0510p3);
                boolean zF3 = c0510p3.f(nA);
                Object objH9 = c0510p3.H();
                if (zF3 || objH9 == C0502l.a) {
                    objH9 = new q.P(nA);
                    c0510p3.b0(objH9);
                }
                q.P p7 = (q.P) objH9;
                c0510p3.p(false);
                return p7;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p4 = (C0510p) obj2;
                if ((((Number) obj3).intValue() & 17) == 16 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    Object objH10 = c0510p4.H();
                    if (objH10 == C0502l.a) {
                        objH10 = new r.g();
                        c0510p4.b0(objH10);
                    }
                    r.g gVar = (r.g) objH10;
                    gVar.a.clear();
                    ((A3.t) this.f1027m).invoke(gVar);
                    gVar.a((C1859a) this.f1028n, c0510p4, 0);
                }
                return O3.C.a;
            case 5:
                s0.r rVar2 = (s0.r) obj;
                s0.r rVar3 = (s0.r) obj2;
                long j7 = ((g0.c) obj3).a;
                s.P p8 = (s.P) this.f1027m;
                if (((Boolean) p8.f15192A.invoke(rVar2)).booleanValue()) {
                    if (!p8.f15197F) {
                        if (p8.f15195D == null) {
                            p8.f15195D = P3.F.a(Integer.MAX_VALUE, 6, null);
                        }
                        p8.f15197F = true;
                        H5.D.x(p8.u0(), null, new s.O(p8, null), 3);
                    }
                    AbstractC0905c.d((C2033c) this.f1028n, rVar2);
                    long jG = g0.c.g(rVar3.f15470c, j7);
                    J5.e eVar = p8.f15195D;
                    if (eVar != null) {
                        eVar.mo2trySendJP2dKIU(new C1941u(jG));
                    }
                }
                return O3.C.a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                float fFloatValue3 = ((Number) obj3).floatValue();
                C2425d c2425d = (C2425d) this.f1027m;
                if (c2425d.k().f18523e == EnumC1903a0.f15259k) {
                    zJ0 = AbstractC0871d.j0(c2425d);
                } else {
                    zJ0 = ((T0.k) this.f1028n) == T0.k.f8844k ? AbstractC0871d.j0(c2425d) : !AbstractC0871d.j0(c2425d);
                }
                int i9 = c2425d.k().f18520b;
                float fP = i9 == 0 ? 0.0f : AbstractC0871d.P(c2425d) / i9;
                float f5 = fP - ((int) fP);
                char c4 = Math.abs(fFloatValue) >= c2425d.f18418p.x(t.k.a) ? fFloatValue > 0.0f ? (char) 1 : (char) 2 : (char) 0;
                if (c4 == 0) {
                    if (Math.abs(f5) <= 0.5f) {
                        fFloatValue2 = fFloatValue3;
                        break;
                    } else {
                        fFloatValue2 = fFloatValue3;
                    }
                } else if (c4 == 1) {
                    fFloatValue2 = fFloatValue3;
                } else if (c4 != 2) {
                    fFloatValue2 = 0.0f;
                }
                return Float.valueOf(fFloatValue2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(InterfaceC0821a interfaceC0821a, e4.k kVar) {
        super(3);
        this.f1026l = 1;
        this.f1028n = interfaceC0821a;
        this.f1027m = kVar;
    }
}
