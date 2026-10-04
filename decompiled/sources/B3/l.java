package B3;

import L.AbstractC0384j0;
import L.E0;
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
import O.Z;
import b1.AbstractC0703b;
import com.kusukanime.data.StreamItem;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.C1538e;
import o.InterfaceC1619q;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.M;
import v.e0;
import v.f0;
import v.g0;
import v.n0;
import v.p0;
import w.C2160a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import y3.AbstractC2412a;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f499k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z f500l;

    public /* synthetic */ l(int i7, Z z7) {
        this.f499k = i7;
        this.f500l = z7;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        a0.n nVar = a0.n.a;
        O3.C c2 = O3.C.a;
        Z z7 = this.f500l;
        switch (this.f499k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$SettingsRow", (g0) obj);
                if ((iIntValue & 17) != 16 || !c0510p.y()) {
                    long jLongValue = ((Number) z7.getValue()).longValue();
                    if (jLongValue <= 0) {
                        str = "0 MB";
                    } else if (jLongValue < 1048576) {
                        str = (jLongValue / 1024) + " KB";
                    } else {
                        str = jLongValue < 1073741824 ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / 1048576.0d)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(jLongValue / 1.073741824E9d)}, 1));
                    }
                    H2.b(str, null, ((N) c0510p.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5223o, c0510p, 0, 0, 65530);
                    break;
                } else {
                    c0510p.M();
                    break;
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue2 & 17) != 16 || !c0510p2.y()) {
                    StreamItem streamItem = (StreamItem) z7.getValue();
                    if (streamItem != null) {
                        c0510p2.R(1765938760);
                        a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 16, 2);
                        f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
                        int i7 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                        a0.q qVarC = a0.a.c(c0510p2, qVarI);
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
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i7))) {
                            AbstractC0703b.u(i7, c0510p2, i7, c2361h);
                        }
                        C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                        C1538e c1538eD = n6.d.D();
                        S0 s02 = P.a;
                        AbstractC0384j0.a(c1538eD, null, androidx.compose.foundation.layout.c.j(nVar, 13), ((N) c0510p2.k(s02)).f5260s, c0510p2, 432, 0);
                        float f5 = 6;
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(f5));
                        String resolution = streamItem.getResolution();
                        if (AbstractC2510o.g0(resolution)) {
                            resolution = "Auto";
                        }
                        H2.b("Kualitas " + ((Object) resolution) + " · ubah lewat gear di player", null, ((N) c0510p2.k(s02)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p2, 0, 0, 65530);
                        c0510p2.p(true);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, f5));
                        c0510p2.p(false);
                        break;
                    } else {
                        c0510p2.R(1765938759);
                        c0510p2.p(false);
                        break;
                    }
                } else {
                    c0510p2.M();
                    break;
                }
                break;
            case 2:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (g0) obj);
                if ((iIntValue3 & 17) != 16 || !c0510p3.y()) {
                    if (!((Boolean) z7.getValue()).booleanValue()) {
                        c0510p3.R(-1849089314);
                        H2.b("Simpan", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p3, 6, 0, 131070);
                        c0510p3.p(false);
                        break;
                    } else {
                        c0510p3.R(-1849427524);
                        Q1.a(androidx.compose.foundation.layout.c.j(nVar, 18), ((N) c0510p3.k(P.a)).f5243b, 2, 0L, 0, c0510p3, 390, 24);
                        AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.j(nVar, 8));
                        H2.b("Menyimpan…", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p3, 6, 0, 131070);
                        c0510p3.p(false);
                        break;
                    }
                } else {
                    c0510p3.M();
                    break;
                }
                break;
            case 3:
                C0510p c0510p4 = (C0510p) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$item", (C2160a) obj);
                if ((iIntValue4 & 17) != 16 || !c0510p4.y()) {
                    D3.t.d("Saya", ((Boolean) z7.getValue()).booleanValue() ? null : "Masuk buat sinkron bookmark & riwayat", androidx.compose.foundation.layout.a.l(a0.n.a, 8, 4, 0.0f, 12, 4), c0510p4, 390);
                    break;
                } else {
                    c0510p4.M();
                    break;
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C0510p c0510p5 = (C0510p) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$Button", (g0) obj);
                if ((iIntValue5 & 17) != 16 || !c0510p5.y()) {
                    H2.b(((Boolean) z7.getValue()).booleanValue() ? "Download..." : "Download", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p5, 0, 0, 131070);
                    break;
                } else {
                    c0510p5.M();
                    break;
                }
                break;
            default:
                C0510p c0510p6 = (C0510p) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.l.f("$this$AnimatedVisibility", (InterfaceC1619q) obj);
                Object objH = c0510p6.H();
                if (objH == C0502l.a) {
                    objH = new w3.m(10, z7);
                    c0510p6.b0(objH);
                }
                InterfaceC0821a interfaceC0821a = (InterfaceC0821a) objH;
                a0.q qVarA = androidx.compose.foundation.layout.b.a.a(nVar, a0.b.f10381k);
                WeakHashMap weakHashMap = n0.f16470v;
                E0.f(interfaceC0821a, androidx.compose.foundation.layout.a.h(p0.a(qVarA, M.e(c0510p6).f16471b), 4), false, null, AbstractC2412a.a, c0510p6, 196614, 28);
                break;
        }
        return c2;
    }
}
