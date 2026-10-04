package w3;

import L.H2;
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
import O3.C;
import b1.AbstractC0703b;
import com.kusukanime.data.OtaCheck;
import com.kusukanime.data.OtaInfo;
import e4.InterfaceC0821a;
import n0.C1538e;
import v.AbstractC2130i;
import v.C2141u;
import v.e0;
import v.f0;
import w.C2160a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17038k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y f17039l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e4.k f17040m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f17041n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z f17042o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z f17043p;

    public /* synthetic */ p(y yVar, e4.k kVar, Z z7, Z z8, Z z9, int i7) {
        this.f17038k = i7;
        this.f17039l = yVar;
        this.f17040m = kVar;
        this.f17041n = z7;
        this.f17042o = z8;
        this.f17043p = z9;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC0821a interfaceC0821a;
        int i7;
        boolean z7;
        C0510p c0510p;
        switch (this.f17038k) {
            case 0:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    D3.t.e("Pembaruan", null, null, W.f.b(-1707137887, new p(this.f17039l, this.f17040m, this.f17041n, this.f17042o, this.f17043p, 1), c0510p2), c0510p2, 3078, 6);
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    C1538e c1538eZ = android.support.v4.media.session.b.z();
                    Z z8 = this.f17042o;
                    String str = ((Boolean) z8.getValue()).booleanValue() ? "Memeriksa..." : "Periksa pembaruan";
                    boolean zBooleanValue = ((Boolean) z8.getValue()).booleanValue();
                    T t7 = C0502l.a;
                    if (zBooleanValue) {
                        c0510p3.R(-636731044);
                        c0510p3.p(false);
                        interfaceC0821a = null;
                    } else {
                        c0510p3.R(-636719232);
                        y yVar = this.f17039l;
                        boolean zH = c0510p3.h(yVar);
                        Object objH = c0510p3.H();
                        Object obj4 = objH;
                        if (zH || objH == t7) {
                            B3.q qVar = new B3.q(16, yVar);
                            c0510p3.b0(qVar);
                            obj4 = qVar;
                        }
                        interfaceC0821a = (InterfaceC0821a) obj4;
                        c0510p3.p(false);
                    }
                    boolean z9 = !((Boolean) z8.getValue()).booleanValue();
                    Z z10 = this.f17041n;
                    D3.t.f(c1538eZ, str, "Kusukanime 0.0.27 (30)", interfaceC0821a, W.f.b(1262376257, new B3.r(z8, z10, 2), c0510p3), 0L, 0L, z9, c0510p3, 24576, 96);
                    OtaCheck otaCheck = (OtaCheck) z10.getValue();
                    OtaInfo latest = otaCheck != null ? otaCheck.getLatest() : null;
                    OtaCheck otaCheck2 = (OtaCheck) z10.getValue();
                    if (otaCheck2 == null || !otaCheck2.getUpdate() || latest == null) {
                        i7 = -651428639;
                        z7 = false;
                        c0510p3.R(-651428639);
                    } else {
                        c0510p3.R(-635484409);
                        D3.t.a(0, c0510p3);
                        C1538e c1538eD = n6.m.D();
                        String strJ = AbstractC0703b.j("Versi ", latest.getVersion_name(), " tersedia");
                        String changelog = latest.getChangelog();
                        if (AbstractC2510o.g0(changelog)) {
                            changelog = "Perbaikan bug + peningkatan.";
                        }
                        e4.k kVar = this.f17040m;
                        boolean zF = c0510p3.f(kVar) | c0510p3.f(z10);
                        Object objH2 = c0510p3.H();
                        Object obj5 = objH2;
                        if (zF || objH2 == t7) {
                            B3.s sVar = new B3.s(kVar, z10, 1);
                            c0510p3.b0(sVar);
                            obj5 = sVar;
                        }
                        i7 = -651428639;
                        D3.t.f(c1538eD, strJ, changelog, (InterfaceC0821a) obj5, AbstractC2210a.f16941m, 0L, 0L, false, c0510p3, 24576, 224);
                        z7 = false;
                    }
                    c0510p3.p(z7);
                    Z z11 = this.f17043p;
                    if (((String) z11.getValue()) != null) {
                        c0510p3.R(-635010946);
                        D3.t.a(z7 ? 1 : 0, c0510p3);
                        a0.q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 16);
                        f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p3, z7 ? 1 : 0);
                        int i8 = c0510p3.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p3.m();
                        a0.q qVarC = a0.a.c(c0510p3, qVarH);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i = C2363j.f17871b;
                        c0510p3.V();
                        if (c0510p3.f7127O) {
                            c0510p3.l(c2362i);
                        } else {
                            c0510p3.e0();
                        }
                        C0486d.R(c0510p3, C2363j.f17875f, f0VarB);
                        C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M);
                        C2361h c2361h = C2363j.f17876g;
                        if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i8))) {
                            AbstractC0703b.u(i8, c0510p3, i8, c2361h);
                        }
                        C0486d.R(c0510p3, C2363j.f17873d, qVarC);
                        String str2 = (String) z11.getValue();
                        kotlin.jvm.internal.l.c(str2);
                        H2.b(str2, null, ((N) c0510p3.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(N2.a)).f5220l, c0510p3, 0, 0, 65530);
                        C0510p c0510p4 = c0510p3;
                        c0510p4.p(true);
                        z7 = false;
                        c0510p = c0510p4;
                    } else {
                        c0510p3.R(i7);
                        c0510p = c0510p3;
                    }
                    c0510p.p(z7);
                }
                break;
        }
        return C.a;
    }
}
