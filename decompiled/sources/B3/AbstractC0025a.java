package B3;

import A3.C0006a;
import A3.C0007b;
import D4.S;
import L.AbstractC0384j0;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.C0524x;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.SocialPrefs;
import e4.InterfaceC0821a;
import f1.AbstractC0870c;
import f1.AbstractC0871d;
import h0.C0975U;
import h0.C0998u;
import java.util.Iterator;
import java.util.List;
import l4.AbstractC1420H;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v.C2141u;
import v.M;
import v.e0;
import v.f0;
import v1.C2147a;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: B3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0025a {
    public static final W.a a = new W.a(false, -1197150119, new C0007b(2));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f436b = new W.a(false, -2056089739, new C0007b(3));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f437c = new W.a(false, -1409470690, new C0007b(4));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f438d = new W.a(false, 1830853942, new C0007b(5));

    /* renamed from: e, reason: collision with root package name */
    public static final W.a f439e = new W.a(false, -630097544, new C0006a(5));

    /* renamed from: f, reason: collision with root package name */
    public static final W.a f440f = new W.a(false, -162508036, new C0007b(6));

    /* renamed from: g, reason: collision with root package name */
    public static final W.a f441g = new W.a(false, 606783097, new C0007b(7));

    /* renamed from: h, reason: collision with root package name */
    public static final W.a f442h = new W.a(false, 1953839244, new C0007b(8));

    /* renamed from: i, reason: collision with root package name */
    public static final W.a f443i = new W.a(false, -1029618952, new C0006a(6));

    /* renamed from: j, reason: collision with root package name */
    public static final W.a f444j = new W.a(false, 1469054211, new C0007b(9));

    /* renamed from: k, reason: collision with root package name */
    public static final W.a f445k = new W.a(false, -891085713, new C0006a(7));

    /* renamed from: l, reason: collision with root package name */
    public static final W.a f446l = new W.a(false, 1386349698, new C0007b(10));

    /* renamed from: m, reason: collision with root package name */
    public static final W.a f447m = new W.a(false, -492136917, new C0007b(11));

    /* renamed from: n, reason: collision with root package name */
    public static final W.a f448n = new W.a(false, -895682236, new C0007b(12));

    /* renamed from: o, reason: collision with root package name */
    public static final W.a f449o = new W.a(false, 1698344896, new C0007b(13));

    /* renamed from: p, reason: collision with root package name */
    public static final W.a f450p = new W.a(false, 1039145136, new C0006a(8));

    /* renamed from: q, reason: collision with root package name */
    public static final W.a f451q = new W.a(false, -617861105, new C0006a(9));

    /* renamed from: r, reason: collision with root package name */
    public static final W.a f452r = new W.a(false, 1034548613, new C0007b(14));

    /* renamed from: s, reason: collision with root package name */
    public static final W.a f453s = new W.a(false, -666391551, new C0007b(15));

    /* renamed from: t, reason: collision with root package name */
    public static final W.a f454t = new W.a(false, -1325591311, new C0006a(4));

    public static final void a(String str, boolean z7, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        boolean z8;
        String str2;
        boolean z9;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-939642322);
        int i8 = i7 | (c0510p2.f(str) ? 4 : 2) | (c0510p2.g(z7) ? 32 : 16) | (c0510p2.h(interfaceC0821a) ? 256 : 128);
        if ((i8 & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
            str2 = str;
            z8 = z7;
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), false, null, interfaceC0821a, 7), 0.0f, 12, 1);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarJ);
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
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            H2.b(str, new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5219k, c0510p, i8 & 14, 0, 65532);
            z8 = z7;
            str2 = str;
            c0510p2 = c0510p;
            if (z8) {
                c0510p2.R(481540102);
                AbstractC0384j0.a(n6.m.D(), "Dipilih", androidx.compose.foundation.layout.c.j(nVar, 20), ((N) c0510p2.k(P.a)).a, c0510p2, 432, 0);
                z9 = false;
            } else {
                z9 = false;
                c0510p2.R(458235480);
            }
            c0510p2.p(z9);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new t(str2, z8, interfaceC0821a, i7);
        }
    }

    public static final void b(InterfaceC0821a interfaceC0821a, e4.k kVar, C c2, C0510p c0510p, int i7) {
        C c4;
        Z z7;
        int i8;
        Z z8;
        Object obj;
        Context context;
        Z z9;
        Z z10;
        boolean z11;
        C c6;
        Context context2;
        Object obj2;
        C c7;
        Object obj3;
        C c8;
        C c9;
        Z z12;
        Z z13;
        Z z14;
        C0510p c0510p2 = c0510p;
        c0510p2.T(303115881);
        if (((i7 | (c0510p2.h(interfaceC0821a) ? 4 : 2) | (c0510p2.h(kVar) ? 32 : 16) | 128) & 147) == 146 && c0510p2.y()) {
            c0510p2.M();
            c9 = c2;
        } else {
            c0510p2.O();
            int i9 = i7 & 1;
            Object obj4 = C0502l.a;
            if (i9 == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                c4 = (C) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(C.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                c4 = c2;
            }
            c0510p2.q();
            final Context context3 = (Context) c0510p2.k(AndroidCompositionLocals_androidKt.f10669b);
            O3.C c10 = O3.C.a;
            boolean zH = c0510p2.h(c4) | c0510p2.h(context3);
            Object objH = c0510p2.H();
            if (zH || objH == obj4) {
                objH = new w(c4, context3, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (e4.n) objH, c10);
            Z zV = C0486d.v(c4.f426c, c0510p2);
            Z zV2 = C0486d.v(c4.f428e, c0510p2);
            Z zV3 = C0486d.v(c4.f430g, c0510p2);
            Z zV4 = C0486d.v(c4.f432i, c0510p2);
            Z zV5 = C0486d.v(c4.f434k, c0510p2);
            Object objH2 = c0510p2.H();
            if (objH2 == obj4) {
                C0524x c0524x = new C0524x(C0486d.y(c0510p2));
                c0510p2.b0(c0524x);
                objH2 = c0524x;
            }
            M5.c cVar = ((C0524x) objH2).f7242k;
            Object objH3 = c0510p2.H();
            T t7 = T.f7049p;
            if (objH3 == obj4) {
                objH3 = C0486d.K(Boolean.valueOf(context3.getSharedPreferences("kusu_settings", 0).getBoolean("dark", true)), t7);
                c0510p2.b0(objH3);
            }
            Z z15 = (Z) objH3;
            Object objH4 = c0510p2.H();
            if (objH4 == obj4) {
                objH4 = C0486d.K(Boolean.valueOf(context3.getSharedPreferences("kusu_settings", 0).getBoolean("notif_update", true)), t7);
                c0510p2.b0(objH4);
            }
            final Z z16 = (Z) objH4;
            Object objH5 = c0510p2.H();
            if (objH5 == obj4) {
                objH5 = C0486d.K(Boolean.valueOf(PlaybackPrefs.INSTANCE.autoplay(context3)), t7);
                c0510p2.b0(objH5);
            }
            final Z z17 = (Z) objH5;
            Object objH6 = c0510p2.H();
            if (objH6 == obj4) {
                objH6 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH6);
            }
            Z z18 = (Z) objH6;
            Object objH7 = c0510p2.H();
            if (objH7 == obj4) {
                objH7 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH7);
            }
            Z z19 = (Z) objH7;
            Object objH8 = c0510p2.H();
            if (objH8 == obj4) {
                objH8 = C0486d.K("", t7);
                c0510p2.b0(objH8);
            }
            Z z20 = (Z) objH8;
            Object objH9 = c0510p2.H();
            if (objH9 == obj4) {
                objH9 = C0486d.K(PlaybackPrefs.INSTANCE.quality(context3), t7);
                c0510p2.b0(objH9);
            }
            final Z z21 = (Z) objH9;
            Object objH10 = c0510p2.H();
            if (objH10 == obj4) {
                objH10 = C0486d.K(PlaybackPrefs.INSTANCE.introPreset(context3), t7);
                c0510p2.b0(objH10);
            }
            final Z z22 = (Z) objH10;
            Object objH11 = c0510p2.H();
            if (objH11 == obj4) {
                objH11 = C0486d.K(Integer.valueOf(PlaybackPrefs.INSTANCE.introSec(context3)), t7);
                c0510p2.b0(objH11);
            }
            final Z z23 = (Z) objH11;
            Object objH12 = c0510p2.H();
            if (objH12 == obj4) {
                objH12 = C0486d.K(Integer.valueOf(PlaybackPrefs.INSTANCE.outroSec(context3)), t7);
                c0510p2.b0(objH12);
            }
            final Z z24 = (Z) objH12;
            Object objH13 = c0510p2.H();
            if (objH13 == obj4) {
                objH13 = C0486d.K(Boolean.valueOf(PlaybackPrefs.INSTANCE.showInfoOverlay(context3)), t7);
                c0510p2.b0(objH13);
            }
            final Z z25 = (Z) objH13;
            Object objH14 = c0510p2.H();
            if (objH14 == obj4) {
                objH14 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH14);
            }
            final Z z26 = (Z) objH14;
            Object objH15 = c0510p2.H();
            if (objH15 == obj4) {
                objH15 = C0486d.K(0L, t7);
                c0510p2.b0(objH15);
            }
            final Z z27 = (Z) objH15;
            Object objH16 = c0510p2.H();
            if (objH16 == obj4) {
                objH16 = C0486d.K(Boolean.valueOf(SocialPrefs.INSTANCE.promoEnabled(context3)), t7);
                c0510p2.b0(objH16);
            }
            final Z z28 = (Z) objH16;
            Object objH17 = c0510p2.H();
            if (objH17 == obj4) {
                objH17 = C0486d.K(null, t7);
                c0510p2.b0(objH17);
            }
            final Z z29 = (Z) objH17;
            C c11 = c4;
            Object objH18 = c0510p2.H();
            if (objH18 == obj4) {
                objH18 = C0486d.K(null, t7);
                c0510p2.b0(objH18);
            }
            Z z30 = (Z) objH18;
            boolean zH2 = c0510p2.h(context3);
            Object objH19 = c0510p2.H();
            if (zH2 || objH19 == obj4) {
                z7 = z30;
                objH19 = new x(context3, z27, null);
                c0510p2.b0(objH19);
            } else {
                z7 = z30;
            }
            C0486d.e(c0510p2, (e4.n) objH19, c10);
            Object objH20 = c0510p2.H();
            if (objH20 == obj4) {
                objH20 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH20);
            }
            final Z z31 = (Z) objH20;
            a0.n nVar = a0.n.a;
            float f5 = 12;
            a0.q qVarK = androidx.compose.foundation.layout.a.k(AbstractC0870c.i0(androidx.compose.foundation.layout.c.f10591c, AbstractC0870c.c0(c0510p2)), f5, f5, f5, 28);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i10 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarK);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            D3.t.d("Pengaturan", "Kusukanime 0.0.27 (30)", androidx.compose.foundation.layout.a.l(nVar, 8, 0.0f, 0.0f, 16, 6), c0510p2, 390);
            D3.t.e("Akun", null, null, W.f.b(1749490909, new C0027c(interfaceC0821a, zV4, z18, 0), c0510p2), c0510p2, 3078, 6);
            D3.t.e("Tampilan", null, null, W.f.b(-1083116, new d(0, context3, z15), c0510p2), c0510p2, 3078, 6);
            D3.t.e("Putar", null, null, W.f.b(-409106731, new e4.o() { // from class: B3.e
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
                @Override // e4.o
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
                    /*
                        Method dump skipped, instructions count: 434
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: B3.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, c0510p2), c0510p2, 3078, 6);
            final int i11 = 0;
            D3.t.e("Komunitas", null, null, W.f.b(-817130346, new e4.o() { // from class: B3.f
                @Override // e4.o
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    boolean z32;
                    int i12;
                    boolean z33;
                    O3.C c12 = O3.C.a;
                    a0.n nVar2 = a0.n.a;
                    Z z34 = z28;
                    T t8 = C0502l.a;
                    Z z35 = z29;
                    Context context4 = context3;
                    switch (i11) {
                        case 0:
                            C0510p c0510p3 = (C0510p) obj6;
                            int iIntValue = ((Integer) obj7).intValue();
                            kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj5);
                            if ((iIntValue & 17) != 16 || !c0510p3.y()) {
                                C1538e c1538eB = AbstractC1420H.B();
                                String str = SocialPrefs.INSTANCE.joined(context4) ? "Sudah bergabung — @kusukanime" : "Info update terbaru di @kusukanime";
                                boolean zH3 = c0510p3.h(context4);
                                Object objH21 = c0510p3.H();
                                if (zH3 || objH21 == t8) {
                                    objH21 = new k(context4, z35, 1);
                                    c0510p3.b0(objH21);
                                }
                                D3.t.f(c1538eB, "Channel Telegram", str, (InterfaceC0821a) objH21, AbstractC0025a.f438d, 0L, 0L, false, c0510p3, 24624, 224);
                                D3.t.a(0, c0510p3);
                                C1538e c1538eC = q0.c.C();
                                boolean zBooleanValue = ((Boolean) z34.getValue()).booleanValue();
                                boolean zH4 = c0510p3.h(context4);
                                Object objH22 = c0510p3.H();
                                if (zH4 || objH22 == t8) {
                                    objH22 = new p(context4, z34, 0);
                                    c0510p3.b0(objH22);
                                }
                                D3.t.g(c1538eC, "Ajakan bergabung di Beranda", "Tampilkan popup channel Telegram saat membuka app", zBooleanValue, (e4.k) objH22, false, c0510p3, 432);
                                if (((String) z35.getValue()) != null) {
                                    c0510p3.R(745833725);
                                    D3.t.a(0, c0510p3);
                                    a0.q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 16);
                                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p3, 0);
                                    int i13 = c0510p3.f7128P;
                                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p3.m();
                                    a0.q qVarC2 = a0.a.c(c0510p3, qVarH);
                                    InterfaceC2364k.f17877j.getClass();
                                    C2362i c2362i2 = C2363j.f17871b;
                                    c0510p3.V();
                                    if (c0510p3.f7127O) {
                                        c0510p3.l(c2362i2);
                                    } else {
                                        c0510p3.e0();
                                    }
                                    C0486d.R(c0510p3, C2363j.f17875f, f0VarB);
                                    C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M2);
                                    C2361h c2361h2 = C2363j.f17876g;
                                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i13))) {
                                        AbstractC0703b.u(i13, c0510p3, i13, c2361h2);
                                    }
                                    C0486d.R(c0510p3, C2363j.f17873d, qVarC2);
                                    String str2 = (String) z35.getValue();
                                    kotlin.jvm.internal.l.c(str2);
                                    H2.b(str2, null, ((N) c0510p3.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(N2.a)).f5220l, c0510p3, 0, 0, 65530);
                                    c0510p3.p(true);
                                    z32 = false;
                                } else {
                                    z32 = false;
                                    c0510p3.R(732931308);
                                }
                                c0510p3.p(z32);
                                break;
                            } else {
                                c0510p3.M();
                                break;
                            }
                            break;
                        default:
                            C0510p c0510p4 = (C0510p) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj5);
                            if ((iIntValue2 & 17) != 16 || !c0510p4.y()) {
                                C1538e c1538eB2 = q0.c.f14674e;
                                if (c1538eB2 == null) {
                                    C1537d c1537d = new C1537d("Filled.Storage", false);
                                    int i14 = AbstractC1530A.a;
                                    C0975U c0975u = new C0975U(C0998u.f11829b);
                                    S s7 = new S(7, false);
                                    s7.u(2.0f, 20.0f);
                                    s7.r(20.0f);
                                    s7.A(-4.0f);
                                    s7.s(2.0f, 16.0f);
                                    s7.A(4.0f);
                                    s7.m();
                                    s7.u(4.0f, 17.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.s(4.0f, 19.0f);
                                    s7.A(-2.0f);
                                    s7.m();
                                    s7.u(2.0f, 4.0f);
                                    s7.A(4.0f);
                                    s7.r(20.0f);
                                    s7.s(22.0f, 4.0f);
                                    s7.s(2.0f, 4.0f);
                                    s7.m();
                                    s7.u(6.0f, 7.0f);
                                    s7.s(4.0f, 7.0f);
                                    s7.s(4.0f, 5.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.m();
                                    s7.u(2.0f, 14.0f);
                                    s7.r(20.0f);
                                    s7.A(-4.0f);
                                    s7.s(2.0f, 10.0f);
                                    s7.A(4.0f);
                                    s7.m();
                                    s7.u(4.0f, 11.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.s(4.0f, 13.0f);
                                    s7.A(-2.0f);
                                    s7.m();
                                    C1537d.a(c1537d, s7.f1530k, c0975u);
                                    c1538eB2 = c1537d.b();
                                    q0.c.f14674e = c1538eB2;
                                }
                                boolean zH5 = c0510p4.h(context4);
                                Object objH23 = c0510p4.H();
                                if (zH5 || objH23 == t8) {
                                    i12 = 0;
                                    objH23 = new k(context4, z35, 0);
                                    c0510p4.b0(objH23);
                                } else {
                                    i12 = 0;
                                }
                                D3.t.f(c1538eB2, "Cache tontonan", "Streaming tersimpan di perangkat (bisa dibersihkan)", (InterfaceC0821a) objH23, W.f.b(1014806712, new l(i12, z34), c0510p4), 0L, 0L, false, c0510p4, 25008, 224);
                                if (((String) z35.getValue()) != null) {
                                    c0510p4.R(-603033832);
                                    D3.t.a(0, c0510p4);
                                    a0.q qVarH2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 16);
                                    f0 f0VarB2 = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p4, 0);
                                    int i15 = c0510p4.f7128P;
                                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p4.m();
                                    a0.q qVarC3 = a0.a.c(c0510p4, qVarH2);
                                    InterfaceC2364k.f17877j.getClass();
                                    C2362i c2362i3 = C2363j.f17871b;
                                    c0510p4.V();
                                    if (c0510p4.f7127O) {
                                        c0510p4.l(c2362i3);
                                    } else {
                                        c0510p4.e0();
                                    }
                                    C0486d.R(c0510p4, C2363j.f17875f, f0VarB2);
                                    C0486d.R(c0510p4, C2363j.f17874e, interfaceC0501k0M3);
                                    C2361h c2361h3 = C2363j.f17876g;
                                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i15))) {
                                        AbstractC0703b.u(i15, c0510p4, i15, c2361h3);
                                    }
                                    C0486d.R(c0510p4, C2363j.f17873d, qVarC3);
                                    String str3 = (String) z35.getValue();
                                    kotlin.jvm.internal.l.c(str3);
                                    H2.b(str3, null, ((N) c0510p4.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p4.k(N2.a)).f5220l, c0510p4, 0, 0, 65530);
                                    c0510p4.p(true);
                                    z33 = false;
                                } else {
                                    z33 = false;
                                    c0510p4.R(-619178198);
                                }
                                c0510p4.p(z33);
                                break;
                            } else {
                                c0510p4.M();
                                break;
                            }
                            break;
                    }
                    return c12;
                }
            }, c0510p2), c0510p2, 3078, 6);
            final Z z32 = z7;
            D3.t.e("Pembaruan", null, null, W.f.b(-1225153961, new g(c11, kVar, zV, zV2, zV3, 0), c0510p2), c0510p2, 3078, 6);
            final int i12 = 1;
            D3.t.e("Penyimpanan", null, null, W.f.b(-1633177576, new e4.o() { // from class: B3.f
                @Override // e4.o
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    boolean z322;
                    int i122;
                    boolean z33;
                    O3.C c12 = O3.C.a;
                    a0.n nVar2 = a0.n.a;
                    Z z34 = z27;
                    T t8 = C0502l.a;
                    Z z35 = z32;
                    Context context4 = context3;
                    switch (i12) {
                        case 0:
                            C0510p c0510p3 = (C0510p) obj6;
                            int iIntValue = ((Integer) obj7).intValue();
                            kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj5);
                            if ((iIntValue & 17) != 16 || !c0510p3.y()) {
                                C1538e c1538eB = AbstractC1420H.B();
                                String str = SocialPrefs.INSTANCE.joined(context4) ? "Sudah bergabung — @kusukanime" : "Info update terbaru di @kusukanime";
                                boolean zH3 = c0510p3.h(context4);
                                Object objH21 = c0510p3.H();
                                if (zH3 || objH21 == t8) {
                                    objH21 = new k(context4, z35, 1);
                                    c0510p3.b0(objH21);
                                }
                                D3.t.f(c1538eB, "Channel Telegram", str, (InterfaceC0821a) objH21, AbstractC0025a.f438d, 0L, 0L, false, c0510p3, 24624, 224);
                                D3.t.a(0, c0510p3);
                                C1538e c1538eC = q0.c.C();
                                boolean zBooleanValue = ((Boolean) z34.getValue()).booleanValue();
                                boolean zH4 = c0510p3.h(context4);
                                Object objH22 = c0510p3.H();
                                if (zH4 || objH22 == t8) {
                                    objH22 = new p(context4, z34, 0);
                                    c0510p3.b0(objH22);
                                }
                                D3.t.g(c1538eC, "Ajakan bergabung di Beranda", "Tampilkan popup channel Telegram saat membuka app", zBooleanValue, (e4.k) objH22, false, c0510p3, 432);
                                if (((String) z35.getValue()) != null) {
                                    c0510p3.R(745833725);
                                    D3.t.a(0, c0510p3);
                                    a0.q qVarH = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 16);
                                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p3, 0);
                                    int i13 = c0510p3.f7128P;
                                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p3.m();
                                    a0.q qVarC2 = a0.a.c(c0510p3, qVarH);
                                    InterfaceC2364k.f17877j.getClass();
                                    C2362i c2362i2 = C2363j.f17871b;
                                    c0510p3.V();
                                    if (c0510p3.f7127O) {
                                        c0510p3.l(c2362i2);
                                    } else {
                                        c0510p3.e0();
                                    }
                                    C0486d.R(c0510p3, C2363j.f17875f, f0VarB);
                                    C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M2);
                                    C2361h c2361h2 = C2363j.f17876g;
                                    if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i13))) {
                                        AbstractC0703b.u(i13, c0510p3, i13, c2361h2);
                                    }
                                    C0486d.R(c0510p3, C2363j.f17873d, qVarC2);
                                    String str2 = (String) z35.getValue();
                                    kotlin.jvm.internal.l.c(str2);
                                    H2.b(str2, null, ((N) c0510p3.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(N2.a)).f5220l, c0510p3, 0, 0, 65530);
                                    c0510p3.p(true);
                                    z322 = false;
                                } else {
                                    z322 = false;
                                    c0510p3.R(732931308);
                                }
                                c0510p3.p(z322);
                                break;
                            } else {
                                c0510p3.M();
                                break;
                            }
                            break;
                        default:
                            C0510p c0510p4 = (C0510p) obj6;
                            int iIntValue2 = ((Integer) obj7).intValue();
                            kotlin.jvm.internal.l.f("$this$SettingsGroup", (C2141u) obj5);
                            if ((iIntValue2 & 17) != 16 || !c0510p4.y()) {
                                C1538e c1538eB2 = q0.c.f14674e;
                                if (c1538eB2 == null) {
                                    C1537d c1537d = new C1537d("Filled.Storage", false);
                                    int i14 = AbstractC1530A.a;
                                    C0975U c0975u = new C0975U(C0998u.f11829b);
                                    S s7 = new S(7, false);
                                    s7.u(2.0f, 20.0f);
                                    s7.r(20.0f);
                                    s7.A(-4.0f);
                                    s7.s(2.0f, 16.0f);
                                    s7.A(4.0f);
                                    s7.m();
                                    s7.u(4.0f, 17.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.s(4.0f, 19.0f);
                                    s7.A(-2.0f);
                                    s7.m();
                                    s7.u(2.0f, 4.0f);
                                    s7.A(4.0f);
                                    s7.r(20.0f);
                                    s7.s(22.0f, 4.0f);
                                    s7.s(2.0f, 4.0f);
                                    s7.m();
                                    s7.u(6.0f, 7.0f);
                                    s7.s(4.0f, 7.0f);
                                    s7.s(4.0f, 5.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.m();
                                    s7.u(2.0f, 14.0f);
                                    s7.r(20.0f);
                                    s7.A(-4.0f);
                                    s7.s(2.0f, 10.0f);
                                    s7.A(4.0f);
                                    s7.m();
                                    s7.u(4.0f, 11.0f);
                                    s7.r(2.0f);
                                    s7.A(2.0f);
                                    s7.s(4.0f, 13.0f);
                                    s7.A(-2.0f);
                                    s7.m();
                                    C1537d.a(c1537d, s7.f1530k, c0975u);
                                    c1538eB2 = c1537d.b();
                                    q0.c.f14674e = c1538eB2;
                                }
                                boolean zH5 = c0510p4.h(context4);
                                Object objH23 = c0510p4.H();
                                if (zH5 || objH23 == t8) {
                                    i122 = 0;
                                    objH23 = new k(context4, z35, 0);
                                    c0510p4.b0(objH23);
                                } else {
                                    i122 = 0;
                                }
                                D3.t.f(c1538eB2, "Cache tontonan", "Streaming tersimpan di perangkat (bisa dibersihkan)", (InterfaceC0821a) objH23, W.f.b(1014806712, new l(i122, z34), c0510p4), 0L, 0L, false, c0510p4, 25008, 224);
                                if (((String) z35.getValue()) != null) {
                                    c0510p4.R(-603033832);
                                    D3.t.a(0, c0510p4);
                                    a0.q qVarH2 = androidx.compose.foundation.layout.a.h(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 16);
                                    f0 f0VarB2 = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p4, 0);
                                    int i15 = c0510p4.f7128P;
                                    InterfaceC0501k0 interfaceC0501k0M3 = c0510p4.m();
                                    a0.q qVarC3 = a0.a.c(c0510p4, qVarH2);
                                    InterfaceC2364k.f17877j.getClass();
                                    C2362i c2362i3 = C2363j.f17871b;
                                    c0510p4.V();
                                    if (c0510p4.f7127O) {
                                        c0510p4.l(c2362i3);
                                    } else {
                                        c0510p4.e0();
                                    }
                                    C0486d.R(c0510p4, C2363j.f17875f, f0VarB2);
                                    C0486d.R(c0510p4, C2363j.f17874e, interfaceC0501k0M3);
                                    C2361h c2361h3 = C2363j.f17876g;
                                    if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i15))) {
                                        AbstractC0703b.u(i15, c0510p4, i15, c2361h3);
                                    }
                                    C0486d.R(c0510p4, C2363j.f17873d, qVarC3);
                                    String str3 = (String) z35.getValue();
                                    kotlin.jvm.internal.l.c(str3);
                                    H2.b(str3, null, ((N) c0510p4.k(P.a)).a, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p4.k(N2.a)).f5220l, c0510p4, 0, 0, 65530);
                                    c0510p4.p(true);
                                    z33 = false;
                                } else {
                                    z33 = false;
                                    c0510p4.R(-619178198);
                                }
                                c0510p4.p(z33);
                                break;
                            } else {
                                c0510p4.M();
                                break;
                            }
                            break;
                    }
                    return c12;
                }
            }, c0510p2), c0510p2, 3078, 6);
            D3.t.e("Diagnostik", null, null, W.f.b(-2041201191, new g(cVar, context3, zV5, z20, z19, 1), c0510p2), c0510p2, 3078, 6);
            c0510p2.p(true);
            if (((Boolean) z26.getValue()).booleanValue()) {
                c0510p2.R(2115565979);
                List listI = P3.r.I(new O3.l("", "Auto (Rekomendasi)"), new O3.l("1080p", "1080p"), new O3.l("720p", "720p"), new O3.l("480p", "480p"), new O3.l("360p", "360p"));
                Object objH21 = c0510p2.H();
                if (objH21 == obj4) {
                    objH21 = new i(0, z26);
                    c0510p2.b0(objH21);
                }
                context = context3;
                obj = obj4;
                z10 = z19;
                z8 = z18;
                z9 = z20;
                z11 = false;
                c6 = c11;
                E0.a((InterfaceC0821a) objH21, W.f.b(192919164, new C0026b(0, z26), c0510p2), null, null, f443i, W.f.b(-1335253481, new h(listI, context3, z21, z26, 0), c0510p2), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1769526, 16284);
                c0510p2 = c0510p;
                c0510p2.p(false);
                i8 = 2098307225;
            } else {
                c0510p2 = c0510p2;
                i8 = 2098307225;
                z8 = z18;
                obj = obj4;
                context = context3;
                z9 = z20;
                z10 = z19;
                z11 = false;
                c6 = c11;
                c0510p2.R(2098307225);
                c0510p2.p(false);
            }
            if (((Boolean) z31.getValue()).booleanValue()) {
                c0510p2.R(2116973255);
                final List listI2 = P3.r.I(new O3.l("off", "Nonaktif"), new O3.l("std1", "Standar Anime 1 — Intro 90d, Outro 90d"), new O3.l("std2", "Standar Anime 2 — Intro 85d, Outro 90d"));
                Object objH22 = c0510p2.H();
                Object obj5 = obj;
                if (objH22 == obj5) {
                    z14 = z31;
                    objH22 = new i(4, z14);
                    c0510p2.b0(objH22);
                } else {
                    z14 = z31;
                }
                final Z z33 = z14;
                final Context context4 = context;
                context2 = context;
                obj2 = obj5;
                E0.a((InterfaceC0821a) objH22, W.f.b(1441971955, new C0026b(2, z14), c0510p2), null, null, f445k, W.f.b(1746875342, new e4.n() { // from class: B3.v
                    @Override // e4.n
                    public final Object invoke(Object obj6, Object obj7) {
                        Object obj8;
                        Context context5;
                        Z z34;
                        Z z35;
                        Z z36;
                        Z z37;
                        C0510p c0510p3 = (C0510p) obj6;
                        if ((((Integer) obj7).intValue() & 3) == 2 && c0510p3.y()) {
                            c0510p3.M();
                        } else {
                            a0.n nVar2 = a0.n.a;
                            C2140t c2140tA2 = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p3, 0);
                            int i13 = c0510p3.f7128P;
                            InterfaceC0501k0 interfaceC0501k0M2 = c0510p3.m();
                            a0.q qVarC2 = a0.a.c(c0510p3, nVar2);
                            InterfaceC2364k.f17877j.getClass();
                            InterfaceC0821a interfaceC0821a2 = C2363j.f17871b;
                            c0510p3.V();
                            if (c0510p3.f7127O) {
                                c0510p3.l(interfaceC0821a2);
                            } else {
                                c0510p3.e0();
                            }
                            C0486d.R(c0510p3, C2363j.f17875f, c2140tA2);
                            C0486d.R(c0510p3, C2363j.f17874e, interfaceC0501k0M2);
                            C2361h c2361h2 = C2363j.f17876g;
                            if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i13))) {
                                AbstractC0703b.u(i13, c0510p3, i13, c2361h2);
                            }
                            C0486d.R(c0510p3, C2363j.f17873d, qVarC2);
                            c0510p3.R(-799213715);
                            Iterator it = listI2.iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                obj8 = C0502l.a;
                                context5 = context4;
                                z34 = z22;
                                z35 = z23;
                                z36 = z24;
                                if (!zHasNext) {
                                    break;
                                }
                                O3.l lVar = (O3.l) it.next();
                                Object obj9 = (String) lVar.f7528k;
                                String str = (String) lVar.f7529l;
                                boolean zA = kotlin.jvm.internal.l.a((String) z34.getValue(), obj9);
                                boolean zF = c0510p3.f(obj9) | c0510p3.h(context5);
                                Object objH23 = c0510p3.H();
                                if (zF || objH23 == obj8) {
                                    Object nVar3 = new n(obj9, context5, z34, z35, z36, z33, 0);
                                    c0510p3.b0(nVar3);
                                    objH23 = nVar3;
                                }
                                AbstractC0025a.a(str, zA, (InterfaceC0821a) objH23, c0510p3, 0);
                            }
                            c0510p3.p(false);
                            AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.j(nVar2, 8));
                            H2.b("Kustom: intro " + ((Number) z35.getValue()).intValue() + "d, outro " + ((Number) z36.getValue()).intValue() + "d (ubah di bawah)", null, ((N) c0510p3.k(P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(N2.a)).f5220l, c0510p3, 0, 0, 65530);
                            AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.j(nVar2, (float) 4));
                            a0.h hVar = a0.b.f10391u;
                            M m7 = AbstractC2130i.a;
                            f0 f0VarB = e0.b(m7, hVar, c0510p3, 48);
                            int i14 = c0510p3.f7128P;
                            InterfaceC0501k0 interfaceC0501k0M3 = c0510p3.m();
                            a0.q qVarC3 = a0.a.c(c0510p3, nVar2);
                            InterfaceC2364k.f17877j.getClass();
                            InterfaceC0821a interfaceC0821a3 = C2363j.f17871b;
                            c0510p3.V();
                            if (c0510p3.f7127O) {
                                c0510p3.l(interfaceC0821a3);
                            } else {
                                c0510p3.e0();
                            }
                            C2361h c2361h3 = C2363j.f17875f;
                            C0486d.R(c0510p3, c2361h3, f0VarB);
                            C2361h c2361h4 = C2363j.f17874e;
                            C0486d.R(c0510p3, c2361h4, interfaceC0501k0M3);
                            C2361h c2361h5 = C2363j.f17876g;
                            if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i14))) {
                                AbstractC0703b.u(i14, c0510p3, i14, c2361h5);
                            }
                            C2361h c2361h6 = C2363j.f17873d;
                            C0486d.R(c0510p3, c2361h6, qVarC3);
                            if (1.0f <= 0.0d) {
                                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                            }
                            H2.b("Intro", new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p3, 6, 0, 131068);
                            boolean zH3 = c0510p3.h(context5);
                            Object objH24 = c0510p3.H();
                            if (zH3 || objH24 == obj8) {
                                z37 = z34;
                                objH24 = new o(context5, z35, z37, 0);
                                c0510p3.b0(objH24);
                            } else {
                                z37 = z34;
                            }
                            E0.h((InterfaceC0821a) objH24, null, false, null, null, null, null, AbstractC0025a.f446l, c0510p3, 805306368, 510);
                            c0510p3.p(true);
                            f0 f0VarB2 = e0.b(m7, hVar, c0510p3, 48);
                            int i15 = c0510p3.f7128P;
                            InterfaceC0501k0 interfaceC0501k0M4 = c0510p3.m();
                            a0.q qVarC4 = a0.a.c(c0510p3, nVar2);
                            c0510p3.V();
                            if (c0510p3.f7127O) {
                                c0510p3.l(interfaceC0821a3);
                            } else {
                                c0510p3.e0();
                            }
                            C0486d.R(c0510p3, c2361h3, f0VarB2);
                            C0486d.R(c0510p3, c2361h4, interfaceC0501k0M4);
                            if (c0510p3.f7127O || !kotlin.jvm.internal.l.a(c0510p3.H(), Integer.valueOf(i15))) {
                                AbstractC0703b.u(i15, c0510p3, i15, c2361h5);
                            }
                            C0486d.R(c0510p3, c2361h6, qVarC4);
                            if (1.0f <= 0.0d) {
                                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                            }
                            Z z38 = z37;
                            H2.b("Outro", new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p3, 6, 0, 131068);
                            boolean zH4 = c0510p3.h(context5);
                            Object objH25 = c0510p3.H();
                            if (zH4 || objH25 == obj8) {
                                objH25 = new o(context5, z36, z38, 1);
                                c0510p3.b0(objH25);
                            }
                            E0.h((InterfaceC0821a) objH25, null, false, null, null, null, null, AbstractC0025a.f447m, c0510p3, 805306368, 510);
                            c0510p3.p(true);
                            c0510p3.p(true);
                        }
                        return O3.C.a;
                    }
                }, c0510p2), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1769526, 16284);
                c0510p2 = c0510p;
                c0510p2.p(z11);
                i8 = 2098307225;
            } else {
                context2 = context;
                obj2 = obj;
                c0510p2.R(i8);
                c0510p2.p(z11);
            }
            if (((Boolean) z8.getValue()).booleanValue()) {
                c0510p2.R(2119835051);
                Object objH23 = c0510p2.H();
                Object obj6 = obj2;
                if (objH23 == obj6) {
                    z13 = z8;
                    objH23 = new i(9, z13);
                    c0510p2.b0(objH23);
                } else {
                    z13 = z8;
                }
                C c12 = c6;
                obj3 = obj6;
                c7 = c12;
                E0.a((InterfaceC0821a) objH23, W.f.b(-922764492, new A3.l(c12, interfaceC0821a, z13, 3), c0510p2), null, W.f.b(58190322, new C0026b(3, z13), c0510p2), f450p, f451q, null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772598, 16276);
                c0510p2 = c0510p;
                c0510p2.p(z11);
                i8 = 2098307225;
            } else {
                c7 = c6;
                obj3 = obj2;
                c0510p2.R(i8);
                c0510p2.p(z11);
            }
            if (((Boolean) z10.getValue()).booleanValue()) {
                c0510p2.R(2120420362);
                Object objH24 = c0510p2.H();
                if (objH24 == obj3) {
                    z12 = z10;
                    objH24 = new i(10, z12);
                    c0510p2.b0(objH24);
                } else {
                    z12 = z10;
                }
                C c13 = c7;
                c8 = c13;
                E0.a((InterfaceC0821a) objH24, W.f.b(1007466357, new C0026b(4, z12), c0510p2), null, W.f.b(1988421171, new A3.l(context2, c13, z12, 1), c0510p2), f454t, W.f.b(1312369744, new C0026b(1, z9), c0510p2), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772598, 16276);
                c0510p2 = c0510p;
            } else {
                c8 = c7;
                c0510p2.R(i8);
            }
            c0510p2.p(z11);
            c9 = c8;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new A3.l(interfaceC0821a, kVar, c9, i7);
        }
    }
}
