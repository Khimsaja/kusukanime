package v3;

import C.e;
import H0.I;
import L.E;
import L.E0;
import L.H2;
import L.N;
import L.P;
import L.q2;
import M0.u;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.Z;
import O3.C;
import Z5.A;
import a0.n;
import a0.q;
import b1.AbstractC0703b;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.ScheduleDay;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.l;
import s3.U;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.r;
import w.C2160a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements e4.p {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16534k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f16535l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f16536m;

    public /* synthetic */ d(int i7, Object obj, Object obj2) {
        this.f16534k = i7;
        this.f16535l = obj;
        this.f16536m = obj2;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long j7;
        switch (this.f16534k) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                C0510p c0510p = (C0510p) obj3;
                ((Integer) obj4).getClass();
                kotlin.jvm.internal.l.f("$this$HorizontalPager", (z.w) obj);
                AnimeItem animeItem = (AnimeItem) ((List) this.f16535l).get(iIntValue);
                C.d dVarB = C.e.b(20);
                E eK = E0.k(0, 62);
                a0.q qVarD = androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f);
                e4.k kVar = (e4.k) this.f16536m;
                boolean zF = c0510p.f(kVar) | c0510p.f(animeItem);
                Object objH = c0510p.H();
                if (zF || objH == C0502l.a) {
                    objH = new A(9, kVar, animeItem);
                    c0510p.b0(objH);
                }
                E0.d((InterfaceC0821a) objH, qVarD, false, dVarB, null, eK, W.f.b(206612809, new A3.g(6, animeItem), c0510p), c0510p, 100663344, 212);
                break;
            default:
                final int iIntValue2 = ((Integer) obj2).intValue();
                C0510p c0510p2 = (C0510p) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.l.f("$this$items", (C2160a) obj);
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= c0510p2.d(iIntValue2) ? 32 : 16;
                }
                if ((iIntValue3 & 145) == 144 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    Z z7 = (Z) this.f16535l;
                    final boolean z8 = iIntValue2 == ((Number) z7.getValue()).intValue();
                    C.d dVarB2 = C.e.b(16);
                    if (z8) {
                        c0510p2.R(-1212776237);
                        j7 = ((N) c0510p2.k(P.a)).a;
                        c0510p2.p(false);
                    } else {
                        c0510p2.R(-1212774080);
                        j7 = ((N) c0510p2.k(P.a)).f5230G;
                        c0510p2.p(false);
                    }
                    a0.n nVar = a0.n.a;
                    boolean z9 = (iIntValue3 & 112) == 32;
                    Object objH2 = c0510p2.H();
                    if (z9 || objH2 == C0502l.a) {
                        objH2 = new U(iIntValue2, z7);
                        c0510p2.b0(objH2);
                    }
                    a0.q qVarE = androidx.compose.foundation.a.e(nVar, false, null, (InterfaceC0821a) objH2, 7);
                    final Z z10 = (Z) this.f16536m;
                    q2.a(qVarE, dVarB2, j7, 0L, 0.0f, 0.0f, W.f.b(1563394193, new e4.n() { // from class: z3.a
                        @Override // e4.n
                        public final Object invoke(Object obj5, Object obj6) {
                            long j8;
                            I i7;
                            long j9;
                            C0510p c0510p3 = (C0510p) obj5;
                            if ((((Integer) obj6).intValue() & 3) == 2 && c0510p3.y()) {
                                c0510p3.M();
                            } else {
                                n nVar2 = n.a;
                                q qVarI = androidx.compose.foundation.layout.a.i(nVar2, 14, 8);
                                C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10394x, c0510p3, 48);
                                int i8 = c0510p3.f7128P;
                                InterfaceC0501k0 interfaceC0501k0M = c0510p3.m();
                                q qVarC = a0.a.c(c0510p3, qVarI);
                                InterfaceC2364k.f17877j.getClass();
                                C2362i c2362i = C2363j.f17871b;
                                c0510p3.V();
                                if (c0510p3.f7127O) {
                                    c0510p3.l(c2362i);
                                } else {
                                    c0510p3.e0();
                                }
                                C0486d.R(c0510p3, C2363j.f17875f, c2140tA);
                                C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M);
                                C2361h c2361h = C2363j.f17876g;
                                if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i8))) {
                                    AbstractC0703b.u(i8, c0510p3, i8, c2361h);
                                }
                                C0486d.R(c0510p3, C2363j.f17873d, qVarC);
                                List list = (List) z10.getValue();
                                int i9 = iIntValue2;
                                String upperCase = AbstractC2510o.I0(3, ((ScheduleDay) list.get(i9)).getDay()).toUpperCase(Locale.ROOT);
                                l.e("toUpperCase(...)", upperCase);
                                I i10 = E0.o(c0510p3).f5223o;
                                boolean z11 = z8;
                                if (z11) {
                                    c0510p3.R(113227376);
                                    j8 = E0.l(c0510p3).f5243b;
                                    c0510p3.p(false);
                                } else {
                                    c0510p3.R(113229847);
                                    j8 = E0.l(c0510p3).f5260s;
                                    c0510p3.p(false);
                                }
                                H2.b(upperCase, null, j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, i10, c0510p3, 0, 0, 65530);
                                String strValueOf = String.valueOf(i9 + 1);
                                if (z11) {
                                    c0510p3.R(113236722);
                                    i7 = E0.o(c0510p3).f5216h;
                                    c0510p3.p(false);
                                } else {
                                    c0510p3.R(113239217);
                                    i7 = E0.o(c0510p3).f5219k;
                                    c0510p3.p(false);
                                }
                                I i11 = i7;
                                u uVar = z11 ? u.f6418r : u.f6415o;
                                if (z11) {
                                    c0510p3.R(113245264);
                                    j9 = E0.l(c0510p3).f5243b;
                                    c0510p3.p(false);
                                } else {
                                    c0510p3.R(113247728);
                                    j9 = E0.l(c0510p3).f5258q;
                                    c0510p3.p(false);
                                }
                                H2.b(strValueOf, null, j9, 0L, uVar, 0L, null, 0L, 0, false, 0, 0, i11, c0510p3, 0, 0, 65498);
                                if (z11) {
                                    c0510p3.R(-784191781);
                                    AbstractC2136o.a(androidx.compose.foundation.a.b(q0.c.o(androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.a.l(nVar2, 0.0f, 3, 0.0f, 0.0f, 13), 5), e.a), E0.l(c0510p3).f5243b, AbstractC0968M.a), c0510p3, 0);
                                } else {
                                    c0510p3.R(-791482981);
                                }
                                c0510p3.p(false);
                                c0510p3.p(true);
                            }
                            return C.a;
                        }
                    }, c0510p2), c0510p2, 12582912, 120);
                }
                break;
        }
        return C.a;
    }
}
