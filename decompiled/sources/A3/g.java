package A3;

import H0.I;
import L.AbstractC0384j0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O3.C;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.SearchSuggestion;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0998u;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.C2141u;
import v.c0;
import v.e0;
import v.f0;
import v.g0;
import v3.AbstractC2152b;
import w.C2160a;
import w0.InterfaceC2173H;
import x.C2235i;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f144k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f145l;

    public /* synthetic */ g(int i7, Object obj) {
        this.f144k = i7;
        this.f145l = obj;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) throws IOException {
        int i7;
        boolean z7;
        boolean z8;
        C2361h c2361h;
        switch (this.f144k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Card", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    a0.n nVar = a0.n.a;
                    a0.q qVarH = androidx.compose.foundation.layout.a.h(nVar, 8);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 48);
                    int i8 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    a0.q qVarC = a0.a.c(c0510p, qVarH);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C2361h c2361h2 = C2363j.f17875f;
                    C0486d.R(c0510p, c2361h2, f0VarB);
                    C2361h c2361h3 = C2363j.f17874e;
                    C0486d.R(c0510p, c2361h3, interfaceC0501k0M);
                    C2361h c2361h4 = C2363j.f17876g;
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p, i8, c2361h4);
                    }
                    C2361h c2361h5 = C2363j.f17873d;
                    C0486d.R(c0510p, c2361h5, qVarC);
                    a0.q qVarO = q0.c.o(androidx.compose.foundation.layout.c.k(nVar, 52, 70), C.e.b(10));
                    S0 s02 = P.a;
                    a0.q qVarB = androidx.compose.foundation.a.b(qVarO, ((N) c0510p.k(s02)).f5231H, AbstractC0968M.a);
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                    int i9 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                    a0.q qVarC2 = a0.a.c(c0510p, qVarB);
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, c2361h2, interfaceC2173HE);
                    C0486d.R(c0510p, c2361h3, interfaceC0501k0M2);
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p, i9, c2361h4);
                    }
                    C0486d.R(c0510p, c2361h5, qVarC2);
                    SearchSuggestion searchSuggestion = (SearchSuggestion) this.f145l;
                    String cover = searchSuggestion.getCover();
                    if (cover == null || AbstractC2510o.g0(cover)) {
                        c0510p.R(-1002523377);
                        AbstractC0384j0.a(n6.m.J(), null, androidx.compose.foundation.layout.c.j(nVar, 20), ((N) c0510p.k(s02)).f5260s, c0510p, 432, 0);
                        c0510p.p(false);
                    } else {
                        c0510p.R(-1002246485);
                        T2.q.b(searchSuggestion.getCover(), searchSuggestion.getTitle(), androidx.compose.foundation.layout.c.f10591c, c0510p, 1573248);
                        c0510p.p(false);
                    }
                    c0510p.p(true);
                    AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(12));
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
                    int i10 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
                    a0.q qVarC3 = a0.a.c(c0510p, layoutWeightElement);
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, c2361h2, c2140tA);
                    C0486d.R(c0510p, c2361h3, interfaceC0501k0M3);
                    if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p, i10, c2361h4);
                    }
                    C0486d.R(c0510p, c2361h5, qVarC3);
                    H2.b(searchSuggestion.getTitle(), null, 0L, 0L, M0.u.f6417q, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p.k(N2.a)).f5218j, c0510p, 196608, 3120, 55262);
                    C0510p c0510p2 = c0510p;
                    List listI = P3.r.I(searchSuggestion.getType(), searchSuggestion.getStatus(), searchSuggestion.getYear());
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : listI) {
                        if (!AbstractC2510o.g0((String) obj4)) {
                            arrayList.add(obj4);
                        }
                    }
                    if (arrayList.isEmpty() && AbstractC2510o.g0(searchSuggestion.getScore())) {
                        c0510p2.R(284685117);
                        c0510p2.p(false);
                        z7 = true;
                    } else {
                        c0510p2.R(302521556);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 5));
                        f0 f0VarB2 = e0.b(AbstractC2130i.g(6), a0.b.f10390t, c0510p2, 6);
                        int i11 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M4 = c0510p2.m();
                        a0.q qVarC4 = a0.a.c(c0510p2, nVar);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i2 = C2363j.f17871b;
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i2);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, C2363j.f17875f, f0VarB2);
                        C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M4);
                        C2361h c2361h6 = C2363j.f17876g;
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                            AbstractC0703b.u(i11, c0510p2, i11, c2361h6);
                        }
                        C0486d.R(c0510p2, C2363j.f17873d, qVarC4);
                        if (arrayList.isEmpty()) {
                            i7 = -265707170;
                            c0510p2.R(-265707170);
                            c0510p2.p(false);
                        } else {
                            c0510p2.R(-247684607);
                            H2.b(P3.q.y0(arrayList, " · ", null, null, null, 62), null, ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p2, 0, 0, 65530);
                            c0510p2 = c0510p2;
                            c0510p2.p(false);
                            i7 = -265707170;
                        }
                        if (AbstractC2510o.g0(searchSuggestion.getScore())) {
                            c0510p2.R(i7);
                        } else {
                            c0510p2.R(-247325007);
                            C0510p c0510p3 = c0510p2;
                            H2.b(AbstractC0703b.i("★ ", searchSuggestion.getScore()), null, ((N) c0510p2.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p3, 0, 0, 65530);
                            c0510p2 = c0510p3;
                        }
                        c0510p2.p(false);
                        z7 = true;
                        c0510p2.p(true);
                        c0510p2.p(false);
                    }
                    if (searchSuggestion.getCover_pending()) {
                        c0510p2.R(303410853);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 3));
                        C0510p c0510p4 = c0510p2;
                        z8 = z7;
                        H2.b("poster sedang disiapkan", null, ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p4, 6, 0, 65530);
                        c0510p2 = c0510p4;
                    } else {
                        z8 = z7;
                        c0510p2.R(284685117);
                    }
                    c0510p2.p(false);
                    c0510p2.p(z8);
                    c0510p2.p(z8);
                }
                return C.a;
            case 1:
                C0510p c0510p5 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue2 & 17) == 16 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    a0.n nVar2 = a0.n.a;
                    float f5 = 8;
                    a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 4, f5);
                    f0 f0VarB3 = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p5, 48);
                    int i12 = c0510p5.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M5 = c0510p5.m();
                    a0.q qVarC5 = a0.a.c(c0510p5, qVarI);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i3 = C2363j.f17871b;
                    c0510p5.V();
                    if (c0510p5.f7127O) {
                        c0510p5.l(c2362i3);
                    } else {
                        c0510p5.e0();
                    }
                    C0486d.R(c0510p5, C2363j.f17875f, f0VarB3);
                    C0486d.R(c0510p5, C2363j.f17874e, interfaceC0501k0M5);
                    C2361h c2361h7 = C2363j.f17876g;
                    if (c0510p5.f7127O || !kotlin.jvm.internal.l.a(c0510p5.H(), Integer.valueOf(i12))) {
                        AbstractC0703b.u(i12, c0510p5, i12, c2361h7);
                    }
                    C0486d.R(c0510p5, C2363j.f17873d, qVarC5);
                    S0 s03 = N2.a;
                    I i13 = ((M2) c0510p5.k(s03)).f5222n;
                    S0 s04 = P.a;
                    long j7 = ((N) c0510p5.k(s04)).f5260s;
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    H2.b("PENCARIAN TERAKHIR", new LayoutWeightElement(1.0f, true), j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, i13, c0510p5, 6, 0, 65528);
                    I i14 = ((M2) c0510p5.k(s03)).f5222n;
                    long j8 = ((N) c0510p5.k(s04)).f5264w;
                    B b4 = (B) this.f145l;
                    boolean zH = c0510p5.h(b4);
                    Object objH = c0510p5.H();
                    if (zH || objH == C0502l.a) {
                        objH = new f(b4, 0);
                        c0510p5.b0(objH);
                    }
                    H2.b("Hapus semua", androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.e(nVar2, false, null, (InterfaceC0821a) objH, 7), f5, 6), j8, 0L, null, 0L, null, 0L, 0, false, 0, 0, i14, c0510p5, 6, 0, 65528);
                    c0510p5.p(true);
                }
                return C.a;
            case 2:
                C0510p c0510p6 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (g0) obj);
                if ((iIntValue3 & 17) == 16 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    H2.b((String) this.f145l, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p6, 0, 0, 131070);
                }
                return C.a;
            case 3:
                ((I5.d) this.f145l).invoke((Throwable) obj);
                return C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                ((R5.h) this.f145l).b();
                return C.a;
            case 5:
                C0510p c0510p7 = (C0510p) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue4 & 17) == 16 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    D3.f.j(c0.a(((List) this.f145l).size(), "Daftar Episode (", ")"), null, null, c0510p7, 0, 6);
                }
                return C.a;
            case 6:
                C0510p c0510p8 = (C0510p) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Card", (C2141u) obj);
                if ((iIntValue5 & 17) == 16 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    a0.n nVar3 = a0.n.a;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10381k, false);
                    int i15 = c0510p8.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M6 = c0510p8.m();
                    a0.q qVarC6 = a0.a.c(c0510p8, fillElement);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i4 = C2363j.f17871b;
                    c0510p8.V();
                    if (c0510p8.f7127O) {
                        c0510p8.l(c2362i4);
                    } else {
                        c0510p8.e0();
                    }
                    C2361h c2361h8 = C2363j.f17875f;
                    C0486d.R(c0510p8, c2361h8, interfaceC2173HE2);
                    C2361h c2361h9 = C2363j.f17874e;
                    C0486d.R(c0510p8, c2361h9, interfaceC0501k0M6);
                    C2361h c2361h10 = C2363j.f17876g;
                    if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i15))) {
                        AbstractC0703b.u(i15, c0510p8, i15, c2361h10);
                    }
                    C2361h c2361h11 = C2363j.f17873d;
                    C0486d.R(c0510p8, c2361h11, qVarC6);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                    AnimeItem animeItem = (AnimeItem) this.f145l;
                    T2.q.b(animeItem.getCover(), animeItem.getTitle(), fillElement, c0510p8, 1573248);
                    Float fValueOf = Float.valueOf(0.0f);
                    long j9 = C0998u.f11829b;
                    AbstractC2136o.a(androidx.compose.foundation.a.a(fillElement, R1.i.u(new O3.l[]{new O3.l(fValueOf, new C0998u(C0998u.b(0.15f, j9))), new O3.l(Float.valueOf(0.45f), new C0998u(C0998u.f11833f)), new O3.l(Float.valueOf(1.0f), new C0998u(C0998u.b(0.92f, j9)))})), c0510p8, 6);
                    a0.q qVarH2 = androidx.compose.foundation.layout.a.h(bVar.a(nVar3, a0.b.f10387q), 14);
                    C2140t c2140tA2 = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p8, 0);
                    int i16 = c0510p8.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M7 = c0510p8.m();
                    a0.q qVarC7 = a0.a.c(c0510p8, qVarH2);
                    c0510p8.V();
                    if (c0510p8.f7127O) {
                        c0510p8.l(c2362i4);
                    } else {
                        c0510p8.e0();
                    }
                    C0486d.R(c0510p8, c2361h8, c2140tA2);
                    C0486d.R(c0510p8, c2361h9, interfaceC0501k0M7);
                    if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i16))) {
                        c2361h = c2361h10;
                        AbstractC0703b.u(i16, c0510p8, i16, c2361h);
                    } else {
                        c2361h = c2361h10;
                    }
                    C0486d.R(c0510p8, c2361h11, qVarC7);
                    C2361h c2361h12 = c2361h;
                    H2.b(animeItem.getTitle(), null, C0998u.f11830c, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p8.k(N2.a)).f5216h, c0510p8, 384, 3120, 55290);
                    String meta = animeItem.getMeta();
                    if (meta == null || AbstractC2510o.g0(meta)) {
                        meta = null;
                    }
                    if (meta == null) {
                        c0510p8.R(155739442);
                    } else {
                        c0510p8.R(155739443);
                        float f7 = 6;
                        AbstractC2123b.a(c0510p8, androidx.compose.foundation.layout.c.e(nVar3, f7));
                        f0 f0VarB4 = e0.b(AbstractC2130i.g(f7), a0.b.f10390t, c0510p8, 6);
                        int i17 = c0510p8.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M8 = c0510p8.m();
                        a0.q qVarC8 = a0.a.c(c0510p8, nVar3);
                        c0510p8.V();
                        if (c0510p8.f7127O) {
                            c0510p8.l(c2362i4);
                        } else {
                            c0510p8.e0();
                        }
                        C0486d.R(c0510p8, c2361h8, f0VarB4);
                        C0486d.R(c0510p8, c2361h9, interfaceC0501k0M8);
                        if (c0510p8.f7127O || !kotlin.jvm.internal.l.a(c0510p8.H(), Integer.valueOf(i17))) {
                            AbstractC0703b.u(i17, c0510p8, i17, c2361h12);
                        }
                        C0486d.R(c0510p8, c2361h11, qVarC8);
                        c0510p8.R(988319111);
                        List listU0 = AbstractC2510o.u0(meta, new String[]{"·"}, 0, 6);
                        ArrayList arrayList2 = new ArrayList(P3.r.p(listU0, 10));
                        Iterator it = listU0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(AbstractC2510o.J0((String) it.next()).toString());
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((String) next).length() > 0) {
                                arrayList3.add(next);
                            }
                        }
                        Iterator it3 = P3.q.P0(arrayList3, 3).iterator();
                        while (it3.hasNext()) {
                            D3.f.h((String) it3.next(), null, c0510p8, 0);
                        }
                        c0510p8.p(false);
                        c0510p8.p(true);
                    }
                    c0510p8.p(false);
                    AbstractC2123b.a(c0510p8, androidx.compose.foundation.layout.c.e(nVar3, 8));
                    q2.a(null, C.e.a(), ((N) c0510p8.k(P.a)).a, 0L, 0.0f, 0.0f, AbstractC2152b.f16529b, c0510p8, 12582912, 121);
                    c0510p8.p(true);
                    c0510p8.p(true);
                }
                return C.a;
            default:
                C0510p c0510p9 = (C0510p) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2235i) obj);
                if ((iIntValue6 & 17) == 16 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    ((W.a) this.f145l).invoke(c0510p9, 0);
                }
                return C.a;
        }
    }
}
