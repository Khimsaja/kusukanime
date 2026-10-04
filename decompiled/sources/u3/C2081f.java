package u3;

import L.AbstractC0384j0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.Q1;
import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O3.C;
import P3.r;
import a0.n;
import a0.q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import com.kusukanime.data.HistoryRow;
import e4.InterfaceC0821a;
import e4.o;
import h0.AbstractC0968M;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import kotlin.jvm.internal.l;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2124c;
import v.C2140t;
import v.C2141u;
import v.e0;
import v.f0;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2517v;

/* renamed from: u3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2081f implements o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16266k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HistoryRow f16267l;

    public /* synthetic */ C2081f(HistoryRow historyRow, int i7) {
        this.f16266k = i7;
        this.f16267l = historyRow;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z7;
        boolean z8;
        switch (this.f16266k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                l.f("$this$Card", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    n nVar = n.a;
                    float f5 = 12;
                    q qVarH = androidx.compose.foundation.layout.a.h(nVar, f5);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 48);
                    int i7 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                    q qVarC = a0.a.c(c0510p, qVarH);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C2361h c2361h = C2363j.f17875f;
                    C0486d.R(c0510p, c2361h, f0VarB);
                    C2361h c2361h2 = C2363j.f17874e;
                    C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
                    C2361h c2361h3 = C2363j.f17876g;
                    if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p, i7, c2361h3);
                    }
                    C2361h c2361h4 = C2363j.f17873d;
                    C0486d.R(c0510p, c2361h4, qVarC);
                    q qVarO = q0.c.o(androidx.compose.foundation.layout.c.j(nVar, 48), C.e.b(f5));
                    S0 s02 = P.a;
                    q qVarB = androidx.compose.foundation.a.b(qVarO, ((N) c0510p.k(s02)).f5230G, AbstractC0968M.a);
                    InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                    int i8 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                    q qVarC2 = a0.a.c(c0510p, qVarB);
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, c2361h, interfaceC2173HE);
                    C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
                    if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p, i8, c2361h3);
                    }
                    C0486d.R(c0510p, c2361h4, qVarC2);
                    AbstractC0384j0.a(r.A(), null, null, ((N) c0510p.k(s02)).a, c0510p, 48, 4);
                    c0510p.p(true);
                    AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(f5));
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
                    int i9 = c0510p.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
                    q qVarC3 = a0.a.c(c0510p, layoutWeightElement);
                    c0510p.V();
                    if (c0510p.f7127O) {
                        c0510p.l(c2362i);
                    } else {
                        c0510p.e0();
                    }
                    C0486d.R(c0510p, c2361h, c2140tA);
                    C0486d.R(c0510p, c2361h2, interfaceC0501k0M3);
                    if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p, i9, c2361h3);
                    }
                    C0486d.R(c0510p, c2361h4, qVarC3);
                    HistoryRow historyRow = this.f16267l;
                    String strR = AbstractC2517v.R(historyRow.getEpisode_slug(), "-", ServerSentEventKt.SPACE);
                    if (strR.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(strR.charAt(0));
                        l.d("null cannot be cast to non-null type java.lang.String", strValueOf);
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        l.e("toUpperCase(...)", upperCase);
                        sb.append((Object) upperCase);
                        String strSubstring = strR.substring(1);
                        l.e("substring(...)", strSubstring);
                        sb.append(strSubstring);
                        strR = sb.toString();
                    }
                    S0 s03 = N2.a;
                    H2.b(strR, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p.k(s03)).f5219k, c0510p, 0, 3120, 55294);
                    C0510p c0510p2 = c0510p;
                    if (historyRow.getDuration_ms() > 0) {
                        c0510p2.R(-80401036);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 6));
                        boolean zF = c0510p2.f(historyRow);
                        Object objH = c0510p2.H();
                        if (zF || objH == C0502l.a) {
                            objH = new C2080e(historyRow, 0);
                            c0510p2.b0(objH);
                        }
                        Q1.b((InterfaceC0821a) objH, androidx.compose.foundation.layout.c.d(nVar, 1.0f), ((N) c0510p2.k(s02)).a, ((N) c0510p2.k(s02)).f5231H, 0, 0.0f, null, c0510p2, 48, 112);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 4));
                        H2.b(AbstractC2077b.b(historyRow.getPosition_ms()) + " / " + AbstractC2077b.b(historyRow.getDuration_ms()), null, ((N) c0510p2.k(s02)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s03)).f5223o, c0510p2, 0, 0, 65530);
                        c0510p2 = c0510p2;
                        z7 = false;
                    } else {
                        z7 = false;
                        c0510p2.R(-89442279);
                    }
                    c0510p2.p(z7);
                    c0510p2.p(true);
                    c0510p2.p(true);
                }
                return C.a;
            default:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                l.f("$this$Card", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    n nVar2 = n.a;
                    C2124c c2124c = AbstractC2130i.f16445c;
                    a0.g gVar = a0.b.f10393w;
                    C2140t c2140tA2 = v.r.a(c2124c, gVar, c0510p3, 0);
                    int i10 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M4 = c0510p3.m();
                    q qVarC4 = a0.a.c(c0510p3, nVar2);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(c2362i2);
                    } else {
                        c0510p3.e0();
                    }
                    C2361h c2361h5 = C2363j.f17875f;
                    C0486d.R(c0510p3, c2361h5, c2140tA2);
                    C2361h c2361h6 = C2363j.f17874e;
                    C0486d.R(c0510p3, c2361h6, interfaceC0501k0M4);
                    C2361h c2361h7 = C2363j.f17876g;
                    if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i10))) {
                        AbstractC0703b.u(i10, c0510p3, i10, c2361h7);
                    }
                    C2361h c2361h8 = C2363j.f17873d;
                    C0486d.R(c0510p3, c2361h8, qVarC4);
                    q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 104);
                    S0 s04 = P.a;
                    q qVarB2 = androidx.compose.foundation.a.b(qVarE, ((N) c0510p3.k(s04)).f5230G, AbstractC0968M.a);
                    InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10385o, false);
                    int i11 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M5 = c0510p3.m();
                    q qVarC5 = a0.a.c(c0510p3, qVarB2);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(c2362i2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h5, interfaceC2173HE2);
                    C0486d.R(c0510p3, c2361h6, interfaceC0501k0M5);
                    if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i11))) {
                        AbstractC0703b.u(i11, c0510p3, i11, c2361h7);
                    }
                    C0486d.R(c0510p3, c2361h8, qVarC5);
                    AbstractC0384j0.a(r.A(), null, androidx.compose.foundation.layout.c.j(nVar2, 32), ((N) c0510p3.k(s04)).a, c0510p3, 432, 0);
                    c0510p3.p(true);
                    q qVarH2 = androidx.compose.foundation.layout.a.h(nVar2, 10);
                    C2140t c2140tA3 = v.r.a(c2124c, gVar, c0510p3, 0);
                    int i12 = c0510p3.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M6 = c0510p3.m();
                    q qVarC6 = a0.a.c(c0510p3, qVarH2);
                    c0510p3.V();
                    if (c0510p3.f7127O) {
                        c0510p3.l(c2362i2);
                    } else {
                        c0510p3.e0();
                    }
                    C0486d.R(c0510p3, c2361h5, c2140tA3);
                    C0486d.R(c0510p3, c2361h6, interfaceC0501k0M6);
                    if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i12))) {
                        AbstractC0703b.u(i12, c0510p3, i12, c2361h7);
                    }
                    C0486d.R(c0510p3, c2361h8, qVarC6);
                    HistoryRow historyRow2 = this.f16267l;
                    String strR2 = AbstractC2517v.R(historyRow2.getEpisode_slug(), "-", ServerSentEventKt.SPACE);
                    if (strR2.length() > 0) {
                        StringBuilder sb2 = new StringBuilder();
                        z8 = false;
                        String strValueOf2 = String.valueOf(strR2.charAt(0));
                        l.d("null cannot be cast to non-null type java.lang.String", strValueOf2);
                        String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                        l.e("toUpperCase(...)", upperCase2);
                        sb2.append((Object) upperCase2);
                        String strSubstring2 = strR2.substring(1);
                        l.e("substring(...)", strSubstring2);
                        sb2.append(strSubstring2);
                        strR2 = sb2.toString();
                    } else {
                        z8 = false;
                    }
                    boolean z9 = z8;
                    H2.b(strR2, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p3.k(N2.a)).f5221m, c0510p3, 0, 3120, 55294);
                    C0510p c0510p4 = c0510p3;
                    if (historyRow2.getDuration_ms() > 0) {
                        c0510p4.R(1865157559);
                        AbstractC2123b.a(c0510p4, androidx.compose.foundation.layout.c.e(nVar2, 8));
                        boolean zF2 = c0510p4.f(historyRow2);
                        Object objH2 = c0510p4.H();
                        if (zF2 || objH2 == C0502l.a) {
                            objH2 = new C2080e(historyRow2, 1);
                            c0510p4.b0(objH2);
                        }
                        Q1.b((InterfaceC0821a) objH2, androidx.compose.foundation.layout.c.d(nVar2, 1.0f), ((N) c0510p4.k(s04)).a, ((N) c0510p4.k(s04)).f5231H, 0, 0.0f, null, c0510p4, 48, 112);
                        c0510p4 = c0510p4;
                    } else {
                        c0510p4.R(1835242652);
                    }
                    c0510p4.p(z9);
                    c0510p4.p(true);
                    c0510p4.p(true);
                }
                return C.a;
        }
    }
}
