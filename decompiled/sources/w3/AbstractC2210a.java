package w3;

import B3.C0026b;
import B3.C0027c;
import L.E0;
import L.N;
import L.P;
import L.Q1;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import O3.C;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC0690q;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.W;
import b1.AbstractC0703b;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.ProfileRow;
import com.kusukanime.data.SessionGate;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import io.ktor.utils.io.ByteChannelKt;
import java.util.List;
import s3.C1998e;
import t1.AbstractC2034a;
import u3.C2076a;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2127f;
import v1.C2147a;
import v3.C2151a;
import w.C2165f;
import w0.InterfaceC2173H;
import w1.AbstractC2208a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: w3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2210a {
    public static final W.a a = new W.a(false, -1924404252, new C2151a(3));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f16930b = new W.a(false, -1990547563, new C2076a(1));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f16931c = new W.a(false, -2015441859, new C2151a(4));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f16932d = new W.a(false, -28305204, new C2151a(5));

    /* renamed from: e, reason: collision with root package name */
    public static final W.a f16933e = new W.a(false, -775314124, new C2151a(6));

    /* renamed from: f, reason: collision with root package name */
    public static final W.a f16934f = new W.a(false, -1815605963, new C2151a(7));

    /* renamed from: g, reason: collision with root package name */
    public static final W.a f16935g = new W.a(false, -1222117292, new C2151a(8));

    /* renamed from: h, reason: collision with root package name */
    public static final W.a f16936h = new W.a(false, -1224210576, new C2076a(2));

    /* renamed from: i, reason: collision with root package name */
    public static final W.a f16937i = new W.a(false, 486128703, new C2076a(3));

    /* renamed from: j, reason: collision with root package name */
    public static final W.a f16938j = new W.a(false, -1639152088, new C2076a(5));

    /* renamed from: k, reason: collision with root package name */
    public static final W.a f16939k = new W.a(false, -782501945, new C2076a(6));

    /* renamed from: l, reason: collision with root package name */
    public static final W.a f16940l = new W.a(false, -1938095102, new C2151a(9));

    /* renamed from: m, reason: collision with root package name */
    public static final W.a f16941m = new W.a(false, 1888042630, new C2076a(7));

    /* renamed from: n, reason: collision with root package name */
    public static final W.a f16942n = new W.a(false, -496983614, new C2076a(8));

    /* renamed from: o, reason: collision with root package name */
    public static final W.a f16943o = new W.a(false, -191578715, new C2076a(9));

    /* renamed from: p, reason: collision with root package name */
    public static final W.a f16944p = new W.a(false, -222123665, new C2076a(10));

    /* renamed from: q, reason: collision with root package name */
    public static final W.a f16945q = new W.a(false, 411554283, new C2076a(11));

    /* renamed from: r, reason: collision with root package name */
    public static final W.a f16946r = new W.a(false, 369066715, new C2151a(10));

    /* renamed from: s, reason: collision with root package name */
    public static final W.a f16947s = new W.a(false, 612603578, new C2151a(11));

    /* renamed from: t, reason: collision with root package name */
    public static final W.a f16948t = new W.a(false, 27154736, new C2076a(12));

    /* renamed from: u, reason: collision with root package name */
    public static final W.a f16949u = new W.a(false, 660832684, new C2076a(13));

    /* renamed from: v, reason: collision with root package name */
    public static final W.a f16950v = new W.a(false, 618345116, new C2151a(12));

    /* renamed from: w, reason: collision with root package name */
    public static final W.a f16951w = new W.a(false, 861881979, new C2151a(13));

    /* renamed from: x, reason: collision with root package name */
    public static final W.a f16952x = new W.a(false, 276433137, new C2076a(14));

    /* renamed from: y, reason: collision with root package name */
    public static final W.a f16953y = new W.a(false, 910111085, new C2076a(15));

    /* renamed from: z, reason: collision with root package name */
    public static final W.a f16954z = new W.a(false, 867623517, new C2151a(14));

    /* renamed from: A, reason: collision with root package name */
    public static final W.a f16928A = new W.a(false, 830897698, new C2076a(16));

    /* renamed from: B, reason: collision with root package name */
    public static final W.a f16929B = new W.a(false, 1361036755, new C2076a(4));

    public static final void a(final InterfaceC0821a interfaceC0821a, final e4.k kVar, C0510p c0510p, final int i7) {
        kotlin.jvm.internal.l.f("onBack", interfaceC0821a);
        c0510p.T(717126919);
        int i8 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7 | (c0510p.h(kVar) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            T t7 = C0502l.a;
            Object objH = c0510p.H();
            T t8 = T.f7049p;
            if (objH == t7) {
                objH = C0486d.K(null, t8);
                c0510p.b0(objH);
            }
            Z z7 = (Z) objH;
            Object objH2 = c0510p.H();
            if (objH2 == t7) {
                objH2 = C0486d.K(Boolean.TRUE, t8);
                c0510p.b0(objH2);
            }
            Z z8 = (Z) objH2;
            C c2 = C.a;
            Object objH3 = c0510p.H();
            if (objH3 == t7) {
                objH3 = new d(z7, z8, null);
                c0510p.b0(objH3);
            }
            C0486d.e(c0510p, (e4.n) objH3, c2);
            if (((Boolean) z8.getValue()).booleanValue()) {
                c0510p.R(761290103);
                FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                int i9 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                a0.q qVarC = a0.a.c(c0510p, fillElement);
                InterfaceC2364k.f17877j.getClass();
                C2362i c2362i = C2363j.f17871b;
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
                C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                C2361h c2361h = C2363j.f17876g;
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                    AbstractC0703b.u(i9, c0510p, i9, c2361h);
                }
                C0486d.R(c0510p, C2363j.f17873d, qVarC);
                Q1.a(null, 0L, 0.0f, 0L, 0, c0510p, 0, 31);
                c0510p.p(true);
                c0510p.p(false);
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    final int i10 = 0;
                    c0509o0S.f7111d = new e4.n(interfaceC0821a, kVar, i7, i10) { // from class: w3.b

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f16955k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f16956l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ e4.k f16957m;

                        {
                            this.f16955k = i10;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj, Object obj2) {
                            int i11 = this.f16955k;
                            C0510p c0510p2 = (C0510p) obj;
                            ((Integer) obj2).getClass();
                            switch (i11) {
                                case 0:
                                    AbstractC2210a.a(this.f16956l, this.f16957m, c0510p2, C0486d.V(1));
                                    break;
                                default:
                                    AbstractC2210a.a(this.f16956l, this.f16957m, c0510p2, C0486d.V(1));
                                    break;
                            }
                            return C.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0510p.R(743540123);
            c0510p.p(false);
            b((ProfileRow) z7.getValue(), interfaceC0821a, kVar, null, c0510p, (i8 << 3) & 1008);
        }
        C0509o0 c0509o0S2 = c0510p.s();
        if (c0509o0S2 != null) {
            final int i11 = 1;
            c0509o0S2.f7111d = new e4.n(interfaceC0821a, kVar, i7, i11) { // from class: w3.b

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f16955k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f16956l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e4.k f16957m;

                {
                    this.f16955k = i11;
                }

                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    int i112 = this.f16955k;
                    C0510p c0510p2 = (C0510p) obj;
                    ((Integer) obj2).getClass();
                    switch (i112) {
                        case 0:
                            AbstractC2210a.a(this.f16956l, this.f16957m, c0510p2, C0486d.V(1));
                            break;
                        default:
                            AbstractC2210a.a(this.f16956l, this.f16957m, c0510p2, C0486d.V(1));
                            break;
                    }
                    return C.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0982  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x09c9  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x09f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x09f7  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a7c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0c79  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.kusukanime.data.ProfileRow r77, e4.InterfaceC0821a r78, e4.k r79, w3.j r80, O.C0510p r81, int r82) {
        /*
            Method dump skipped, instructions count: 3216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.AbstractC2210a.b(com.kusukanime.data.ProfileRow, e4.a, e4.k, w3.j, O.p, int):void");
    }

    public static final void c(final InterfaceC0821a interfaceC0821a, final e4.k kVar, final e4.k kVar2, final e4.k kVar3, final InterfaceC0821a interfaceC0821a2, final InterfaceC0821a interfaceC0821a3, final InterfaceC0821a interfaceC0821a4, final InterfaceC0821a interfaceC0821a5, y yVar, C0510p c0510p, final int i7) {
        int i8;
        y yVar2;
        Z z7;
        Object obj;
        v.Z z8;
        Object obj2;
        final Z z9;
        final Z z10;
        Context context;
        y yVar3;
        Z z11;
        InterfaceC0821a interfaceC0821a6;
        Z z12;
        y yVar4;
        Context context2;
        Z z13;
        Object obj3;
        boolean z14;
        int i9;
        Object obj4;
        y yVar5;
        y yVar6;
        final y yVar7;
        Z z15;
        Z z16;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("onLogin", interfaceC0821a);
        kotlin.jvm.internal.l.f("onOpenAnime", kVar);
        kotlin.jvm.internal.l.f("onPlayEpisode", kVar2);
        kotlin.jvm.internal.l.f("onUpdateClick", kVar3);
        c0510p2.T(891133909);
        int i10 = i7 | (c0510p2.h(interfaceC0821a) ? 4 : 2) | (c0510p2.h(kVar2) ? 256 : 128) | (c0510p2.h(kVar3) ? 2048 : 1024) | (c0510p2.h(interfaceC0821a2) ? 16384 : 8192) | (c0510p2.h(interfaceC0821a3) ? 131072 : 65536) | (c0510p2.h(interfaceC0821a4) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | (c0510p2.h(interfaceC0821a5) ? 8388608 : 4194304) | 33554432;
        if ((i10 & 38347907) == 38347906 && c0510p2.y()) {
            c0510p2.M();
            yVar7 = yVar;
        } else {
            c0510p2.O();
            int i11 = i7 & 1;
            Object obj5 = C0502l.a;
            if (i11 == 0 || c0510p2.x()) {
                W wA = AbstractC2208a.a(c0510p2);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i8 = i10 & (-234881025);
                yVar2 = (y) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(y.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p2);
            } else {
                c0510p2.M();
                i8 = i10 & (-234881025);
                yVar2 = yVar;
            }
            c0510p2.q();
            final Context context3 = (Context) c0510p2.k(AndroidCompositionLocals_androidKt.f10669b);
            C c2 = C.a;
            boolean zH = c0510p2.h(yVar2) | c0510p2.h(context3);
            Object objH = c0510p2.H();
            if (zH || objH == obj5) {
                objH = new s(yVar2, context3, null);
                c0510p2.b0(objH);
            }
            C0486d.e(c0510p2, (e4.n) objH, c2);
            Z zV = C0486d.v(SessionGate.INSTANCE.getLoggedIn(), c0510p2);
            Boolean bool = (Boolean) zV.getValue();
            boolean zF = c0510p2.f(zV) | c0510p2.h(yVar2);
            Object objH2 = c0510p2.H();
            if (zF || objH2 == obj5) {
                objH2 = new t(yVar2, zV, null);
                c0510p2.b0(objH2);
            }
            C0486d.e(c0510p2, (e4.n) objH2, bool);
            AbstractC0690q abstractC0690qF = ((InterfaceC0694v) c0510p2.k(AbstractC2034a.a)).f();
            boolean zH2 = c0510p2.h(yVar2) | c0510p2.h(abstractC0690qF);
            Object objH3 = c0510p2.H();
            if (zH2 || objH3 == obj5) {
                objH3 = new I5.d(9, abstractC0690qF, yVar2);
                c0510p2.b0(objH3);
            }
            C0486d.c(abstractC0690qF, (e4.k) objH3, c0510p2);
            final Z zV2 = C0486d.v(yVar2.f17075c, c0510p2);
            final Z zV3 = C0486d.v(yVar2.f17077e, c0510p2);
            final Z zV4 = C0486d.v(yVar2.f17079g, c0510p2);
            Z zV5 = C0486d.v(yVar2.f17081i, c0510p2);
            final Z zV6 = C0486d.v(yVar2.f17083k, c0510p2);
            final Z zV7 = C0486d.v(yVar2.f17085m, c0510p2);
            final Z zV8 = C0486d.v(yVar2.f17087o, c0510p2);
            final Z zV9 = C0486d.v(yVar2.f17089q, c0510p2);
            final y yVar8 = yVar2;
            Object objH4 = c0510p2.H();
            T t7 = T.f7049p;
            if (objH4 == obj5) {
                objH4 = C0486d.K(Boolean.valueOf(context3.getSharedPreferences("kusu_settings", 0).getBoolean("dark", true)), t7);
                c0510p2.b0(objH4);
            }
            Z z17 = (Z) objH4;
            Object objH5 = c0510p2.H();
            if (objH5 == obj5) {
                objH5 = C0486d.K(Boolean.valueOf(PlaybackPrefs.INSTANCE.autoplay(context3)), t7);
                c0510p2.b0(objH5);
            }
            final Z z18 = (Z) objH5;
            Object objH6 = c0510p2.H();
            if (objH6 == obj5) {
                z7 = z17;
                objH6 = C0486d.K(Boolean.valueOf(context3.getSharedPreferences("kusu_settings", 0).getBoolean("notif_update", true)), t7);
                c0510p2.b0(objH6);
            } else {
                z7 = z17;
            }
            final Z z19 = (Z) objH6;
            Object objH7 = c0510p2.H();
            if (objH7 == obj5) {
                objH7 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH7);
            }
            final Z z20 = (Z) objH7;
            Object objH8 = c0510p2.H();
            if (objH8 == obj5) {
                objH8 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH8);
            }
            final Z z21 = (Z) objH8;
            Object objH9 = c0510p2.H();
            if (objH9 == obj5) {
                objH9 = C0486d.K(Boolean.FALSE, t7);
                c0510p2.b0(objH9);
            }
            Z z22 = (Z) objH9;
            Object objH10 = c0510p2.H();
            if (objH10 == obj5) {
                objH10 = C0486d.K("", t7);
                c0510p2.b0(objH10);
            }
            Z z23 = (Z) objH10;
            if (((Boolean) zV5.getValue()).booleanValue()) {
                c0510p2.R(579587610);
                FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                int i12 = c0510p2.f7128P;
                InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                a0.q qVarC = a0.a.c(c0510p2, fillElement);
                InterfaceC2364k.f17877j.getClass();
                C2362i c2362i = C2363j.f17871b;
                c0510p2.V();
                if (c0510p2.f7127O) {
                    c0510p2.l(c2362i);
                } else {
                    c0510p2.e0();
                }
                C0486d.R(c0510p2, C2363j.f17875f, interfaceC2173HE);
                C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
                C2361h c2361h = C2363j.f17876g;
                if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                    AbstractC0703b.u(i12, c0510p2, i12, c2361h);
                }
                C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                Q1.a(null, 0L, 0.0f, 0L, 0, c0510p, 0, 31);
                c0510p.p(true);
                c0510p.p(false);
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    final int i13 = 0;
                    c0509o0S.f7111d = new e4.n(interfaceC0821a, kVar, kVar2, kVar3, interfaceC0821a2, interfaceC0821a3, interfaceC0821a4, interfaceC0821a5, yVar8, i7, i13) { // from class: w3.k

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f16992k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f16993l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ e4.k f16994m;

                        /* renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ e4.k f16995n;

                        /* renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ e4.k f16996o;

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f16997p;

                        /* renamed from: q, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f16998q;

                        /* renamed from: r, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f16999r;

                        /* renamed from: s, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f17000s;

                        /* renamed from: t, reason: collision with root package name */
                        public final /* synthetic */ y f17001t;

                        {
                            this.f16992k = i13;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj6, Object obj7) {
                            switch (this.f16992k) {
                                case 0:
                                    ((Integer) obj7).getClass();
                                    int iV = C0486d.V(1);
                                    y yVar9 = this.f17001t;
                                    AbstractC2210a.c(this.f16993l, this.f16994m, this.f16995n, this.f16996o, this.f16997p, this.f16998q, this.f16999r, this.f17000s, yVar9, (C0510p) obj6, iV);
                                    break;
                                default:
                                    ((Integer) obj7).getClass();
                                    int iV2 = C0486d.V(1);
                                    InterfaceC0821a interfaceC0821a7 = this.f17000s;
                                    y yVar10 = this.f17001t;
                                    AbstractC2210a.c(this.f16993l, this.f16994m, this.f16995n, this.f16996o, this.f16997p, this.f16998q, this.f16999r, interfaceC0821a7, yVar10, (C0510p) obj6, iV2);
                                    break;
                            }
                            return C.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0510p2.R(570179885);
            c0510p2.p(false);
            FillElement fillElement2 = androidx.compose.foundation.layout.c.f10591c;
            float f5 = 12;
            v.Z z24 = new v.Z(f5, 8, f5, 24);
            C2127f c2127fG = AbstractC2130i.g(0);
            boolean zF2 = ((i8 & 14) == 4) | c0510p2.f(zV3) | c0510p2.f(zV2) | ((57344 & i8) == 16384) | c0510p2.f(zV4) | ((i8 & 896) == 256) | ((3670016 & i8) == 1048576) | ((458752 & i8) == 131072) | ((29360128 & i8) == 8388608) | c0510p2.h(context3) | c0510p2.f(zV7) | c0510p2.h(yVar8) | c0510p2.f(zV6) | ((i8 & 7168) == 2048) | c0510p2.f(zV8) | c0510p2.f(zV9);
            Object objH11 = c0510p2.H();
            if (zF2 || objH11 == obj5) {
                z8 = z24;
                obj2 = obj5;
                final Z z25 = z7;
                z9 = z22;
                z10 = z23;
                obj = new e4.k() { // from class: w3.l
                    @Override // e4.k
                    public final Object invoke(Object obj6) {
                        C2165f c2165f = (C2165f) obj6;
                        kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f);
                        Z z26 = zV3;
                        C2165f.w0(c2165f, new W.a(true, -1214729111, new B3.l(3, z26)));
                        C2165f.w0(c2165f, new W.a(true, 15286048, new C1998e(interfaceC0821a, interfaceC0821a2, z26, zV2)));
                        boolean zBooleanValue = ((Boolean) z26.getValue()).booleanValue();
                        Z z27 = zV4;
                        if (zBooleanValue && !((List) z27.getValue()).isEmpty()) {
                            C2165f.w0(c2165f, new W.a(true, 1241656132, new C0027c((Object) z21, (Object) z27, (O3.e) kVar2, 9)));
                        }
                        C2165f.w0(c2165f, new W.a(true, -1744073823, new n(interfaceC0821a4, interfaceC0821a3, interfaceC0821a5, z26, z27, 0)));
                        Z z28 = z18;
                        Z z29 = z19;
                        Context context4 = context3;
                        C2165f.w0(c2165f, new W.a(true, 791533602, new o(context4, z25, z28, z29, 0)));
                        C2165f.w0(c2165f, new W.a(true, -967826269, new p(yVar8, kVar3, zV6, zV7, zV8, 0)));
                        C2165f.w0(c2165f, new W.a(true, 1567781156, new q(context4, zV9, z10, z9, z26, z20, 0)));
                        C2165f.w0(c2165f, AbstractC2210a.f16943o);
                        return C.a;
                    }
                };
                c0510p2 = c0510p;
                context = context3;
                yVar3 = yVar8;
                z11 = z20;
                interfaceC0821a6 = interfaceC0821a;
                z12 = z21;
                c0510p2.b0(obj);
            } else {
                z8 = z24;
                obj = objH11;
                context = context3;
                obj2 = obj5;
                yVar3 = yVar8;
                z11 = z20;
                z9 = z22;
                z10 = z23;
                c0510p2 = c0510p2;
                z12 = z21;
                interfaceC0821a6 = interfaceC0821a;
            }
            Z z26 = z10;
            Z z27 = z9;
            AbstractC0847h.a(fillElement2, null, z8, c2127fG, null, null, false, (e4.k) obj, c0510p2, 24582, 234);
            if (((Boolean) z11.getValue()).booleanValue()) {
                c0510p2.R(588861446);
                Object objH12 = c0510p2.H();
                Object obj6 = obj2;
                if (objH12 == obj6) {
                    objH12 = new m(0, z11);
                    c0510p2.b0(objH12);
                }
                z13 = z12;
                context2 = context;
                yVar4 = yVar3;
                obj3 = obj6;
                E0.a((InterfaceC0821a) objH12, W.f.b(-605080737, new A3.l(yVar3, interfaceC0821a6, z11, 9), c0510p2), null, W.f.b(-118007011, new C0026b(12, z11), c0510p2), f16946r, f16947s, null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772598, 16276);
                c0510p2 = c0510p;
                z14 = false;
                c0510p2.p(false);
                i9 = 570179885;
            } else {
                yVar4 = yVar3;
                context2 = context;
                z13 = z12;
                obj3 = obj2;
                z14 = false;
                i9 = 570179885;
                c0510p2.R(570179885);
                c0510p2.p(false);
            }
            if (((Boolean) z13.getValue()).booleanValue()) {
                c0510p2.R(589435876);
                Object objH13 = c0510p2.H();
                Object obj7 = obj3;
                if (objH13 == obj7) {
                    z16 = z13;
                    objH13 = new m(2, z16);
                    c0510p2.b0(objH13);
                } else {
                    z16 = z13;
                }
                y yVar9 = yVar4;
                obj4 = obj7;
                yVar5 = yVar9;
                E0.a((InterfaceC0821a) objH13, W.f.b(-355802336, new A3.h(9, yVar9, z16), c0510p2), null, W.f.b(131271390, new C0026b(14, z16), c0510p2), f16950v, f16951w, null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772598, 16276);
                c0510p2 = c0510p;
                z14 = false;
                c0510p2.p(false);
                i9 = 570179885;
            } else {
                obj4 = obj3;
                yVar5 = yVar4;
                c0510p2.R(i9);
                c0510p2.p(z14);
            }
            if (((Boolean) z27.getValue()).booleanValue()) {
                c0510p2.R(590005408);
                Object objH14 = c0510p2.H();
                if (objH14 == obj4) {
                    z15 = z27;
                    objH14 = new m(7, z15);
                    c0510p2.b0(objH14);
                } else {
                    z15 = z27;
                }
                y yVar10 = yVar5;
                yVar6 = yVar10;
                E0.a((InterfaceC0821a) objH14, W.f.b(-106523935, new C0026b(15, z15), c0510p2), null, W.f.b(380549791, new A3.l(context2, yVar10, z15, 10), c0510p2), f16954z, W.f.b(1111160380, new C0026b(16, z26), c0510p2), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, 1772598, 16276);
                c0510p2 = c0510p;
                z14 = false;
            } else {
                yVar6 = yVar5;
                c0510p2.R(i9);
            }
            c0510p2.p(z14);
            yVar7 = yVar6;
        }
        C0509o0 c0509o0S2 = c0510p2.s();
        if (c0509o0S2 != null) {
            final int i14 = 1;
            c0509o0S2.f7111d = new e4.n(interfaceC0821a, kVar, kVar2, kVar3, interfaceC0821a2, interfaceC0821a3, interfaceC0821a4, interfaceC0821a5, yVar7, i7, i14) { // from class: w3.k

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f16992k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f16993l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e4.k f16994m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e4.k f16995n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e4.k f16996o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f16997p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f16998q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f16999r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f17000s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ y f17001t;

                {
                    this.f16992k = i14;
                }

                @Override // e4.n
                public final Object invoke(Object obj62, Object obj72) {
                    switch (this.f16992k) {
                        case 0:
                            ((Integer) obj72).getClass();
                            int iV = C0486d.V(1);
                            y yVar92 = this.f17001t;
                            AbstractC2210a.c(this.f16993l, this.f16994m, this.f16995n, this.f16996o, this.f16997p, this.f16998q, this.f16999r, this.f17000s, yVar92, (C0510p) obj62, iV);
                            break;
                        default:
                            ((Integer) obj72).getClass();
                            int iV2 = C0486d.V(1);
                            InterfaceC0821a interfaceC0821a7 = this.f17000s;
                            y yVar102 = this.f17001t;
                            AbstractC2210a.c(this.f16993l, this.f16994m, this.f16995n, this.f16996o, this.f16997p, this.f16998q, this.f16999r, interfaceC0821a7, yVar102, (C0510p) obj62, iV2);
                            break;
                    }
                    return C.a;
                }
            };
        }
    }

    public static final void d(boolean z7, ProfileRow profileRow, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, C0510p c0510p, int i7) {
        c0510p.T(366091310);
        if (((i7 | (c0510p.g(z7) ? 4 : 2) | (c0510p.f(profileRow) ? 32 : 16) | (c0510p.h(interfaceC0821a) ? 256 : 128) | (c0510p.h(interfaceC0821a2) ? 2048 : 1024)) & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            q2.a(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), C.e.b(24), ((N) c0510p.k(P.a)).I, 0L, 0.0f, 0.0f, W.f.b(439897865, new r(z7, interfaceC0821a, profileRow, interfaceC0821a2), c0510p), c0510p, 12582918, 120);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new r(z7, profileRow, interfaceC0821a, interfaceC0821a2, i7);
        }
    }
}
