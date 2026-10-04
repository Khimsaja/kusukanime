package B3;

import L.AbstractC0384j0;
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
import O.T;
import O.Z;
import android.content.Context;
import b1.AbstractC0703b;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;
import e4.InterfaceC0821a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.C1538e;
import s3.AbstractC1994a;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v.C2141u;
import v.c0;
import v.e0;
import v.f0;
import w.C2160a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f478k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f479l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f480m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f481n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f482o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f483p;

    public /* synthetic */ g(AnimeDetail animeDetail, EpisodeRef episodeRef, EpisodeRef episodeRef2, e4.k kVar, InterfaceC0821a interfaceC0821a) {
        this.f478k = 3;
        this.f482o = animeDetail;
        this.f479l = episodeRef;
        this.f480m = episodeRef2;
        this.f483p = kVar;
        this.f481n = interfaceC0821a;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC0821a interfaceC0821a;
        int i7;
        boolean z7;
        C0510p c0510p;
        String str;
        Object obj4;
        int i8;
        switch (this.f478k) {
            case 0:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    C1538e c1538eZ = android.support.v4.media.session.b.z();
                    Z z8 = (Z) this.f480m;
                    String str2 = ((Boolean) z8.getValue()).booleanValue() ? "Memeriksa..." : "Periksa pembaruan";
                    boolean zBooleanValue = ((Boolean) z8.getValue()).booleanValue();
                    T t7 = C0502l.a;
                    if (zBooleanValue) {
                        c0510p2.R(70693254);
                        c0510p2.p(false);
                        interfaceC0821a = null;
                    } else {
                        c0510p2.R(70705066);
                        C c2 = (C) this.f482o;
                        boolean zH = c0510p2.h(c2);
                        Object objH = c0510p2.H();
                        Object obj5 = objH;
                        if (zH || objH == t7) {
                            q qVar = new q(0, c2);
                            c0510p2.b0(qVar);
                            obj5 = qVar;
                        }
                        interfaceC0821a = (InterfaceC0821a) obj5;
                        c0510p2.p(false);
                    }
                    boolean z9 = !((Boolean) z8.getValue()).booleanValue();
                    Z z10 = (Z) this.f479l;
                    D3.t.f(c1538eZ, str2, "Versi terpasang 0.0.27", interfaceC0821a, W.f.b(1422830327, new r(z8, z10, 0), c0510p2), 0L, 0L, z9, c0510p2, 24576, 96);
                    OtaCheck otaCheck = (OtaCheck) z10.getValue();
                    OtaInfo latest = otaCheck != null ? otaCheck.getLatest() : null;
                    OtaCheck otaCheck2 = (OtaCheck) z10.getValue();
                    if (otaCheck2 == null || !otaCheck2.getUpdate() || latest == null) {
                        i7 = 57169195;
                        z7 = false;
                        c0510p2.R(57169195);
                    } else {
                        c0510p2.R(71843541);
                        D3.t.a(0, c0510p2);
                        C1538e c1538eD = n6.m.D();
                        String strJ = AbstractC0703b.j("Versi ", latest.getVersion_name(), " tersedia");
                        String changelog = latest.getChangelog();
                        if (AbstractC2510o.g0(changelog)) {
                            changelog = "Perbaikan bug + peningkatan.";
                        }
                        e4.k kVar = (e4.k) this.f483p;
                        boolean zF = c0510p2.f(kVar) | c0510p2.f(z10);
                        Object objH2 = c0510p2.H();
                        Object obj6 = objH2;
                        if (zF || objH2 == t7) {
                            s sVar = new s(kVar, z10, 0);
                            c0510p2.b0(sVar);
                            obj6 = sVar;
                        }
                        i7 = 57169195;
                        D3.t.f(c1538eD, strJ, changelog, (InterfaceC0821a) obj6, AbstractC0025a.f440f, 0L, 0L, false, c0510p2, 24576, 224);
                        z7 = false;
                    }
                    c0510p2.p(z7);
                    Z z11 = (Z) this.f481n;
                    if (((String) z11.getValue()) != null) {
                        c0510p2.R(72274255);
                        D3.t.a(z7 ? 1 : 0, c0510p2);
                        a0.q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 16);
                        f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p2, z7 ? 1 : 0);
                        int i9 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                        a0.q qVarC = a0.a.c(c0510p2, qVarH);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i = C2363j.f17871b;
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, C2363j.f17875f, f0VarB);
                        C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
                        C2361h c2361h = C2363j.f17876g;
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                            AbstractC0703b.u(i9, c0510p2, i9, c2361h);
                        }
                        C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                        String str3 = (String) z11.getValue();
                        kotlin.jvm.internal.l.c(str3);
                        H2.b(str3, null, ((N) c0510p2.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5220l, c0510p2, 0, 0, 65530);
                        C0510p c0510p3 = c0510p2;
                        c0510p3.p(true);
                        z7 = false;
                        c0510p = c0510p3;
                    } else {
                        c0510p2.R(i7);
                        c0510p = c0510p2;
                    }
                    c0510p.p(z7);
                }
                break;
            case 1:
                C0510p c0510p4 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    C1538e c1538e = D3.g.f1444e;
                    Z z12 = (Z) this.f479l;
                    if (((Number) z12.getValue()).intValue() > 0) {
                        str = ((Number) z12.getValue()).intValue() + " catatan tersimpan";
                    } else {
                        str = "Belum ada crash tercatat";
                    }
                    String str4 = str;
                    M5.c cVar = (M5.c) this.f482o;
                    boolean zH2 = c0510p4.h(cVar);
                    Context context = (Context) this.f483p;
                    boolean zH3 = zH2 | c0510p4.h(context);
                    Object objH3 = c0510p4.H();
                    if (zH3 || objH3 == C0502l.a) {
                        j jVar = new j(cVar, context, (Z) this.f480m, (Z) this.f481n, 1);
                        c0510p4.b0(jVar);
                        objH3 = jVar;
                    }
                    D3.t.f(c1538e, "Log crash", str4, (InterfaceC0821a) objH3, AbstractC0025a.f441g, 0L, 0L, false, c0510p4, 24624, 224);
                }
                break;
            case 2:
                C0510p c0510p5 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$ModalBottomSheet", (C2141u) obj);
                if ((iIntValue3 & 17) == 16 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    a0.n nVar = a0.n.a;
                    a0.q qVarD = androidx.compose.foundation.layout.c.d(nVar, 1.0f);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p5, 0);
                    int i10 = c0510p5.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p5.m();
                    a0.q qVarC2 = a0.a.c(c0510p5, qVarD);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p5.V();
                    if (c0510p5.f7127O) {
                        c0510p5.l(c2362i2);
                    } else {
                        c0510p5.e0();
                    }
                    C2361h c2361h2 = C2363j.f17875f;
                    C0486d.R(c0510p5, c2361h2, c2140tA);
                    C2361h c2361h3 = C2363j.f17874e;
                    C0486d.R(c0510p5, c2361h3, interfaceC0501k0M2);
                    C2361h c2361h4 = C2363j.f17876g;
                    if (c0510p5.f7127O || !kotlin.jvm.internal.l.a(c0510p5.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p5, i10, c2361h4);
                    }
                    C2361h c2361h5 = C2363j.f17873d;
                    C0486d.R(c0510p5, c2361h5, qVarC2);
                    a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 16, 6);
                    f0 f0VarB2 = e0.b(AbstractC2130i.f16447e, a0.b.f10391u, c0510p5, 54);
                    int i11 = c0510p5.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p5.m();
                    a0.q qVarC3 = a0.a.c(c0510p5, qVarI);
                    c0510p5.V();
                    if (c0510p5.f7127O) {
                        c0510p5.l(c2362i2);
                    } else {
                        c0510p5.e0();
                    }
                    C0486d.R(c0510p5, c2361h2, f0VarB2);
                    C0486d.R(c0510p5, c2361h3, interfaceC0501k0M3);
                    if (c0510p5.f7127O || !kotlin.jvm.internal.l.a(c0510p5.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p5, i11, c2361h4);
                    }
                    C0486d.R(c0510p5, c2361h5, qVarC3);
                    List list = (List) this.f482o;
                    H2.b(c0.a(list.size(), "Semua episode (", ")"), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p5.k(N2.a)).f5216h, c0510p5, 0, 0, 65534);
                    Z z13 = (Z) this.f480m;
                    boolean zBooleanValue2 = ((Boolean) z13.getValue()).booleanValue();
                    boolean zF2 = c0510p5.f(z13);
                    Object objH4 = c0510p5.H();
                    T t8 = C0502l.a;
                    Object obj7 = objH4;
                    if (zF2 || objH4 == t8) {
                        i iVar = new i(17, z13);
                        c0510p5.b0(iVar);
                        obj7 = iVar;
                    }
                    M.a(zBooleanValue2, (InterfaceC0821a) obj7, W.f.b(-1090790121, new C0026b(6, z13), c0510p5), null, false, null, C.e.a(), null, null, null, c0510p5, 384, 6, 2936);
                    c0510p5.p(true);
                    Z z14 = (Z) this.f479l;
                    boolean zF3 = c0510p5.f(z14);
                    e4.k kVar2 = (e4.k) this.f483p;
                    boolean zF4 = zF3 | c0510p5.f(kVar2);
                    Object objH5 = c0510p5.H();
                    Object obj8 = objH5;
                    if (zF4 || objH5 == t8) {
                        A3.i iVar2 = new A3.i(kVar2, z14, 2);
                        c0510p5.b0(iVar2);
                        obj8 = iVar2;
                    }
                    AbstractC1994a.g(list, (e4.k) obj8, (Map) ((Z) this.f481n).getValue(), 0, false, null, c0510p5, 24576);
                    c0510p5.p(true);
                }
                break;
            case 3:
                C0510p c0510p6 = (C0510p) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue4 & 17) == 16 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    AbstractC1994a.d((AnimeDetail) this.f482o, (EpisodeRef) this.f479l, (EpisodeRef) this.f480m, (e4.k) this.f483p, (InterfaceC0821a) this.f481n, c0510p6, AnimeDetail.$stable);
                }
                break;
            default:
                C0510p c0510p7 = (C0510p) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$FlowRow", (v.N) obj);
                if ((iIntValue5 & 17) == 16 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    String str5 = (String) this.f482o;
                    String str6 = (str5 == null || AbstractC2510o.g0(str5) || str5.equals("?")) ? null : str5;
                    if (str6 == null) {
                        c0510p7.R(1161236247);
                        c0510p7.p(false);
                        obj4 = "?";
                        i8 = 0;
                    } else {
                        c0510p7.R(1161236248);
                        a0.h hVar = a0.b.f10391u;
                        a0.n nVar2 = a0.n.a;
                        f0 f0VarB3 = e0.b(AbstractC2130i.a, hVar, c0510p7, 48);
                        int i12 = c0510p7.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M4 = c0510p7.m();
                        a0.q qVarC4 = a0.a.c(c0510p7, nVar2);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i3 = C2363j.f17871b;
                        c0510p7.V();
                        if (c0510p7.f7127O) {
                            c0510p7.l(c2362i3);
                        } else {
                            c0510p7.e0();
                        }
                        C0486d.R(c0510p7, C2363j.f17875f, f0VarB3);
                        C0486d.R(c0510p7, C2363j.f17874e, interfaceC0501k0M4);
                        C2361h c2361h6 = C2363j.f17876g;
                        if (c0510p7.f7127O || !kotlin.jvm.internal.l.a(c0510p7.H(), Integer.valueOf(i12))) {
                            AbstractC0703b.u(i12, c0510p7, i12, c2361h6);
                        }
                        C0486d.R(c0510p7, C2363j.f17873d, qVarC4);
                        AbstractC0384j0.a(n6.m.N(), null, androidx.compose.foundation.layout.c.j(nVar2, 14), ((N) c0510p7.k(P.a)).f5247f, c0510p7, 432, 0);
                        AbstractC2123b.a(c0510p7, androidx.compose.foundation.layout.c.n(3));
                        obj4 = "?";
                        i8 = 0;
                        H2.b(str6, null, 0L, 0L, M0.u.f6417q, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p7.k(N2.a)).f5221m, c0510p7, 196608, 0, 65502);
                        c0510p7 = c0510p7;
                        c0510p7.p(true);
                        c0510p7.p(false);
                    }
                    ArrayList arrayListG0 = P3.m.g0(new String[]{(String) this.f483p, (String) this.f479l, (String) this.f480m, (String) this.f481n});
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListG0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        String str7 = (String) next;
                        Object obj9 = obj4;
                        if (!AbstractC2510o.g0(str7) && !str7.equals(obj9)) {
                            arrayList.add(next);
                        }
                        obj4 = obj9;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        D3.f.h((String) it2.next(), null, c0510p7, i8);
                    }
                }
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f478k = i7;
        this.f482o = obj;
        this.f483p = obj2;
        this.f479l = obj3;
        this.f480m = obj4;
        this.f481n = obj5;
    }

    public /* synthetic */ g(List list, Z z7, e4.k kVar, Z z8, Z z9) {
        this.f478k = 2;
        this.f482o = list;
        this.f479l = z7;
        this.f483p = kVar;
        this.f480m = z8;
        this.f481n = z9;
    }
}
