package y3;

import D.z0;
import H1.G;
import L.E0;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.H;
import O.InterfaceC0501k0;
import O.T;
import O.Z;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.exoplayer.ExoPlayer;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.AbstractC0968M;
import h0.C0998u;
import io.ktor.utils.io.ByteChannelKt;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import o.AbstractC1628z;
import o.InterfaceC1619q;
import s3.C2002i;
import s3.C2007n;
import v.AbstractC2136o;
import v.M;
import v.n0;
import v.p0;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;
import z5.C2508m;
import z5.EnumC2509n;

/* loaded from: classes.dex */
public abstract class C {
    public static final C2508m a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2508m f18243b;

    static {
        EnumC2509n[] enumC2509nArr = EnumC2509n.f19062k;
        a = new C2508m("\\.(mp4|m3u8|mkv|webm)(\\?|$)|/video/|/file/|/stream/|/hls/|/playlist", 0);
        f18243b = new C2508m("vast|vpaid|doubleclick|googlesyndication|adsystem|adservice|/ads/|banner|popunder|propeller|exoclick|juicyads|trafficjunky|clickadu|adsterra", 0);
    }

    public static final void a(final ExoPlayer exoPlayer, final Context context, final String str, final Map map, final long j7, final int i7, final int i8, e4.n nVar, final InterfaceC0821a interfaceC0821a, C0510p c0510p, final int i9) {
        int i10;
        int i11;
        Z z7;
        long j8;
        String str2;
        Map map2;
        Object obj;
        int i12;
        Z z8;
        final e4.n nVar2;
        final ExoPlayer exoPlayer2 = exoPlayer;
        kotlin.jvm.internal.l.f("player", exoPlayer2);
        kotlin.jvm.internal.l.f("ctx", context);
        kotlin.jvm.internal.l.f("url", str);
        kotlin.jvm.internal.l.f("headers", map);
        kotlin.jvm.internal.l.f("onProgress", nVar);
        kotlin.jvm.internal.l.f("onFallback", interfaceC0821a);
        c0510p.T(287949481);
        int i13 = i9 | (c0510p.h(exoPlayer2) ? 4 : 2) | (c0510p.h(context) ? 32 : 16) | (c0510p.f(str) ? 256 : 128) | (c0510p.h(map) ? 2048 : 1024) | (c0510p.e(j7) ? 16384 : 8192) | (c0510p.h(nVar) ? 8388608 : 4194304) | (c0510p.h(interfaceC0821a) ? 67108864 : 33554432) | 805306368;
        if ((306783379 & i13) == 306783378 && c0510p.y()) {
            c0510p.M();
            nVar2 = nVar;
        } else {
            boolean zF = c0510p.f(exoPlayer2);
            Object objH = c0510p.H();
            Object obj2 = C0502l.a;
            T t7 = T.f7049p;
            if (zF || objH == obj2) {
                objH = C0486d.K(0L, t7);
                c0510p.b0(objH);
            }
            Z z9 = (Z) objH;
            int i14 = i13 & 896;
            boolean z10 = i14 == 256;
            Object objH2 = c0510p.H();
            if (z10 || objH2 == obj2) {
                objH2 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH2);
            }
            final Z z11 = (Z) objH2;
            boolean z12 = i14 == 256;
            Object objH3 = c0510p.H();
            if (z12 || objH3 == obj2) {
                objH3 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH3);
            }
            final Z z13 = (Z) objH3;
            long jLongValue = ((Number) z9.getValue()).longValue();
            boolean zH = c0510p.h(map) | (i14 == 256) | c0510p.h(context) | c0510p.h(exoPlayer2);
            Object objH4 = c0510p.H();
            if (zH || objH4 == obj2) {
                i10 = i13;
                i11 = i14;
                z7 = z9;
                j8 = jLongValue;
                str2 = str;
                objH4 = new p(map, str2, context, exoPlayer2, null);
                map2 = map;
                exoPlayer2 = exoPlayer2;
                c0510p.b0(objH4);
            } else {
                str2 = str;
                map2 = map;
                i10 = i13;
                i11 = i14;
                j8 = jLongValue;
                z7 = z9;
            }
            C0486d.f(str2, map2, (e4.n) objH4, c0510p);
            boolean z14 = i11 == 256;
            Object objH5 = c0510p.H();
            if (z14 || objH5 == obj2) {
                objH5 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH5);
            }
            final Z z15 = (Z) objH5;
            boolean z16 = i11 == 256;
            Object objH6 = c0510p.H();
            if (z16 || objH6 == obj2) {
                objH6 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH6);
            }
            Z z17 = (Z) objH6;
            boolean z18 = i11 == 256;
            Object objH7 = c0510p.H();
            if (z18 || objH7 == obj2) {
                objH7 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH7);
            }
            final Z z19 = (Z) objH7;
            boolean zF2 = c0510p.f(z19) | ((234881024 & i10) == 67108864) | c0510p.f(z7) | c0510p.h(exoPlayer2) | c0510p.f(z13) | c0510p.f(z15) | c0510p.f(z11) | c0510p.e(j8) | ((i10 & 57344) == 16384);
            Object objH8 = c0510p.H();
            if (zF2 || objH8 == obj2) {
                final Z z20 = z7;
                i12 = i10;
                final long j9 = j8;
                z8 = z17;
                obj = new e4.k() { // from class: y3.h
                    @Override // e4.k
                    public final Object invoke(Object obj3) {
                        kotlin.jvm.internal.l.f("$this$DisposableEffect", (H) obj3);
                        Z z21 = z20;
                        Z z22 = z15;
                        Z z23 = z11;
                        InterfaceC0821a interfaceC0821a2 = interfaceC0821a;
                        Z z24 = z19;
                        ExoPlayer exoPlayer3 = exoPlayer;
                        q qVar = new q(i7, j9, j7, z24, z21, z13, z22, z23, exoPlayer3, interfaceC0821a2);
                        G g4 = (G) exoPlayer3;
                        g4.getClass();
                        g4.f3272w.a(qVar);
                        return new z0(13, exoPlayer3, qVar);
                    }
                };
                exoPlayer2 = exoPlayer;
                c0510p.b0(obj);
            } else {
                obj = objH8;
                z8 = z17;
                i12 = i10;
                exoPlayer2 = exoPlayer;
            }
            C0486d.c(exoPlayer2, (e4.k) obj, c0510p);
            int i15 = i12 & 29360128;
            boolean zH2 = c0510p.h(exoPlayer2) | c0510p.f(z8) | (i15 == 8388608);
            Object objH9 = c0510p.H();
            if (zH2 || objH9 == obj2) {
                Object rVar = new r(exoPlayer2, i8, nVar, z8, null);
                nVar2 = nVar;
                c0510p.b0(rVar);
                objH9 = rVar;
            } else {
                nVar2 = nVar;
            }
            C0486d.e(c0510p, (e4.n) objH9, exoPlayer2);
            boolean zH3 = c0510p.h(exoPlayer2) | (i15 == 8388608);
            Object objH10 = c0510p.H();
            if (zH3 || objH10 == obj2) {
                objH10 = new I5.d(10, exoPlayer2, nVar2);
                c0510p.b0(objH10);
            }
            C0486d.c(exoPlayer2, (e4.k) objH10, c0510p);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n(context, str, map, j7, i7, i8, nVar2, interfaceC0821a, i9) { // from class: y3.i

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ Context f18279l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ String f18280m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ Map f18281n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ long f18282o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f18283p;

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ int f18284q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ e4.n f18285r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f18286s;

                @Override // e4.n
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iV = C0486d.V(1769473);
                    e4.n nVar3 = this.f18285r;
                    InterfaceC0821a interfaceC0821a2 = this.f18286s;
                    C.a(this.f18278k, this.f18279l, this.f18280m, this.f18281n, this.f18282o, this.f18283p, this.f18284q, nVar3, interfaceC0821a2, (C0510p) obj3, iV);
                    return O3.C.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r28, e4.InterfaceC0821a r29, final java.util.Map r30, a0.q r31, e4.k r32, e4.InterfaceC0821a r33, O.C0510p r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C.b(java.lang.String, e4.a, java.util.Map, a0.q, e4.k, e4.a, O.p, int, int):void");
    }

    public static final void c(final String str, C0510p c0510p, final int i7) {
        int i8;
        c0510p.T(5416055);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(str) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i8 & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            Object objH = c0510p.H();
            T t7 = C0502l.a;
            if (objH == t7) {
                objH = C0486d.K(Boolean.TRUE, T.f7049p);
                c0510p.b0(objH);
            }
            Z z7 = (Z) objH;
            Object objH2 = c0510p.H();
            if (objH2 == t7) {
                objH2 = new v(z7, null);
                c0510p.b0(objH2);
            }
            C0486d.e(c0510p, (e4.n) objH2, str);
            if (!((Boolean) z7.getValue()).booleanValue()) {
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    final int i9 = 0;
                    c0509o0S.f7111d = new e4.n() { // from class: y3.o
                        @Override // e4.n
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = i9;
                            C0510p c0510p2 = (C0510p) obj;
                            ((Integer) obj2).intValue();
                            switch (i10) {
                                case 0:
                                    C.c(str, c0510p2, C0486d.V(i7 | 1));
                                    break;
                                default:
                                    C.c(str, c0510p2, C0486d.V(i7 | 1));
                                    break;
                            }
                            return O3.C.a;
                        }
                    };
                    return;
                }
                return;
            }
            a0.n nVar = a0.n.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i10 = c0510p.f7128P;
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
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p, i10, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            q2.a(androidx.compose.foundation.layout.a.h(nVar, 16), C.e.b(8), C0998u.b(0.6f, C0998u.f11829b), 0L, 0.0f, 0.0f, W.f.b(-396658792, new D3.e(str, 2), c0510p), c0510p, 12583302, 120);
            c0510p.p(true);
        }
        C0509o0 c0509o0S2 = c0510p.s();
        if (c0509o0S2 != null) {
            final int i11 = 1;
            c0509o0S2.f7111d = new e4.n() { // from class: y3.o
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    int i102 = i11;
                    C0510p c0510p2 = (C0510p) obj;
                    ((Integer) obj2).intValue();
                    switch (i102) {
                        case 0:
                            C.c(str, c0510p2, C0486d.V(i7 | 1));
                            break;
                        default:
                            C.c(str, c0510p2, C0486d.V(i7 | 1));
                            break;
                    }
                    return O3.C.a;
                }
            };
        }
    }

    public static final void d(final ExoPlayer exoPlayer, final String str, final boolean z7, final String str2, final boolean z8, final InterfaceC0821a interfaceC0821a, final List list, final e4.k kVar, final Map map, e4.k kVar2, InterfaceC0821a interfaceC0821a2, final InterfaceC0821a interfaceC0821a3, a0.q qVar, C0510p c0510p, final int i7, final int i8) {
        e4.k kVar3;
        int i9;
        InterfaceC0821a interfaceC0821a4;
        int i10;
        final e4.k kVar4;
        final InterfaceC0821a interfaceC0821a5;
        final a0.q qVar2;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("player", exoPlayer);
        kotlin.jvm.internal.l.f("url", str);
        kotlin.jvm.internal.l.f("overlayTitle", str2);
        kotlin.jvm.internal.l.f("onToggleFullscreen", interfaceC0821a);
        c0510p2.T(-1968373952);
        int i11 = (c0510p2.h(exoPlayer) ? 4 : 2) | i7 | (c0510p2.f(str) ? 32 : 16);
        if ((i7 & 384) == 0) {
            i11 |= c0510p2.g(z7) ? 256 : 128;
        }
        int i12 = i11 | (c0510p2.f(str2) ? 2048 : 1024) | (c0510p2.h(interfaceC0821a) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | (c0510p2.h(list) ? 8388608 : 4194304) | (c0510p2.h(kVar) ? 67108864 : 33554432) | (c0510p2.h(map) ? 536870912 : 268435456);
        int i13 = i8 & 1024;
        if (i13 != 0) {
            i9 = 6;
            kVar3 = kVar2;
        } else {
            kVar3 = kVar2;
            i9 = c0510p2.h(kVar3) ? 4 : 2;
        }
        int i14 = i8 & 2048;
        if (i14 != 0) {
            i10 = i9 | 48;
            interfaceC0821a4 = interfaceC0821a2;
        } else {
            interfaceC0821a4 = interfaceC0821a2;
            i10 = i9 | (c0510p2.h(interfaceC0821a4) ? 32 : 16);
        }
        int i15 = i10 | (c0510p2.h(interfaceC0821a3) ? 256 : 128) | 3072;
        if ((i12 & 306783379) == 306783378 && (i15 & 1171) == 1170 && c0510p2.y()) {
            c0510p2.M();
            qVar2 = qVar;
            kVar4 = kVar3;
            interfaceC0821a5 = interfaceC0821a4;
        } else {
            if (i13 != 0) {
                kVar3 = null;
            }
            InterfaceC0821a interfaceC0821a6 = i14 == 0 ? interfaceC0821a4 : null;
            a0.n nVar = a0.n.a;
            a0.i iVar = a0.b.f10381k;
            R1.i iVar2 = AbstractC0968M.a;
            if (z7) {
                c0510p2.R(-639311892);
                final InterfaceC0821a interfaceC0821a7 = interfaceC0821a6;
                a0.q qVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 1.7777778f), C0998u.f11829b, iVar2);
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                int i16 = c0510p2.f7128P;
                InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                a0.q qVarC = a0.a.c(c0510p2, qVarB);
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
                if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i16))) {
                    AbstractC0703b.u(i16, c0510p2, i16, c2361h);
                }
                C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                int i17 = i15 << 12;
                final e4.k kVar5 = kVar3;
                b(str, interfaceC0821a, map, androidx.compose.foundation.layout.c.f10591c, kVar5, interfaceC0821a7, c0510p2, ((i12 >> 3) & 14) | 3072 | ((i12 >> 15) & 112) | ((i12 >> 21) & 896) | (57344 & i17) | (i17 & 458752), 0);
                c0510p2.p(true);
                c0510p2.p(false);
                C0509o0 c0509o0S = c0510p2.s();
                if (c0509o0S != null) {
                    c0509o0S.f7111d = new e4.n() { // from class: y3.e
                        @Override // e4.n
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iV = C0486d.V(i7 | 1);
                            a0.n nVar2 = a0.n.a;
                            int i18 = i8;
                            C.d(exoPlayer, str, z7, str2, z8, interfaceC0821a, list, kVar, map, kVar5, interfaceC0821a7, interfaceC0821a3, nVar2, (C0510p) obj, iV, i18);
                            return O3.C.a;
                        }
                    };
                    return;
                }
                return;
            }
            InterfaceC0821a interfaceC0821a8 = interfaceC0821a6;
            e4.k kVar6 = kVar3;
            c0510p2.R(-693754526);
            c0510p2.p(false);
            a0.q qVarB2 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 1.7777778f), C0998u.f11829b, iVar2);
            InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
            int i18 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, qVarB2);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i2 = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i2);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, C2363j.f17875f, interfaceC2173HE2);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M2);
            C2361h c2361h2 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i18))) {
                AbstractC0703b.u(i18, c0510p2, i18, c2361h2);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC2);
            int i19 = i12 >> 3;
            f(exoPlayer, str, str2, z8, false, interfaceC0821a, list, kVar, interfaceC0821a3, c0510p2, (i12 & 126) | (i19 & 896) | 27648 | (i19 & 458752) | (3670016 & i19) | (i19 & 29360128) | ((i15 << 18) & 234881024), 0);
            c0510p2 = c0510p2;
            c0510p2.p(true);
            kVar4 = kVar6;
            interfaceC0821a5 = interfaceC0821a8;
            qVar2 = nVar;
        }
        C0509o0 c0509o0S2 = c0510p2.s();
        if (c0509o0S2 != null) {
            c0509o0S2.f7111d = new e4.n() { // from class: y3.j
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(i7 | 1);
                    a0.q qVar3 = qVar2;
                    int i20 = i8;
                    C.d(exoPlayer, str, z7, str2, z8, interfaceC0821a, list, kVar, map, kVar4, interfaceC0821a5, interfaceC0821a3, qVar3, (C0510p) obj, iV, i20);
                    return O3.C.a;
                }
            };
        }
    }

    public static final void e(ExoPlayer exoPlayer, String str, List list, e4.k kVar, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        int i8;
        String str2;
        List list2;
        c0510p.T(787815271);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(exoPlayer) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            str2 = str;
            i8 |= c0510p.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i7 & 384) == 0) {
            list2 = list;
            i8 |= c0510p.h(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(kVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 16384 : 8192;
        }
        int i9 = i8;
        if ((i9 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
        } else {
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                G g4 = (G) exoPlayer;
                g4.u1();
                objH = C0486d.K(Float.valueOf(g4.f3264q0.f3439o.a), T.f7049p);
                c0510p.b0(objH);
            }
            E0.a(interfaceC0821a, W.f.b(-561403361, new D3.c(8, interfaceC0821a), c0510p), null, null, AbstractC2412a.f18245c, W.f.b(-721838278, new D3.l(list2, str2, kVar, (Z) objH, exoPlayer), c0510p), null, 0L, 0L, 0L, 0L, 0.0f, null, c0510p, ((i9 >> 12) & 14) | 1769520, 16284);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2007n(exoPlayer, str, list, kVar, interfaceC0821a, i7, 1);
        }
    }

    public static final void f(final ExoPlayer exoPlayer, final String str, final String str2, final boolean z7, final boolean z8, final InterfaceC0821a interfaceC0821a, final List list, final e4.k kVar, InterfaceC0821a interfaceC0821a2, C0510p c0510p, final int i7, final int i8) {
        int i9;
        Z z9;
        Object obj;
        Object objK;
        Z z10;
        Z z11;
        FillElement fillElement;
        a0.q qVar;
        Object obj2;
        Z z12;
        ExoPlayer exoPlayer2;
        Z z13;
        Z z14;
        Z z15;
        boolean z16;
        FillElement fillElement2;
        C2361h c2361h;
        C0510p c0510p2;
        boolean z17;
        int i10;
        C2361h c2361h2;
        boolean z18;
        final InterfaceC0821a interfaceC0821a3;
        kotlin.jvm.internal.l.f("player", exoPlayer);
        kotlin.jvm.internal.l.f("url", str);
        kotlin.jvm.internal.l.f("overlayTitle", str2);
        kotlin.jvm.internal.l.f("qualities", list);
        kotlin.jvm.internal.l.f("onQualityPick", kVar);
        c0510p.T(-335818015);
        if ((i7 & 6) == 0) {
            i9 = (c0510p.h(exoPlayer) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0510p.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0510p.f(str2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c0510p.g(z7) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0510p.g(z8) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= c0510p.h(interfaceC0821a) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i9 |= c0510p.h(list) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((12582912 & i7) == 0) {
            i9 |= c0510p.h(kVar) ? 8388608 : 4194304;
        }
        int i11 = i9;
        if ((i11 & 4793491) == 4793490 && c0510p.y()) {
            c0510p.M();
            interfaceC0821a3 = interfaceC0821a2;
            c0510p2 = c0510p;
        } else {
            InterfaceC0821a interfaceC0821a4 = (i8 & 256) != 0 ? null : interfaceC0821a2;
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            Object objH = c0510p.H();
            Object obj3 = C0502l.a;
            T t7 = T.f7049p;
            if (objH == obj3) {
                objH = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH);
            }
            Z z19 = (Z) objH;
            Object objH2 = c0510p.H();
            if (objH2 == obj3) {
                objH2 = C0486d.K(Boolean.TRUE, t7);
                c0510p.b0(objH2);
            }
            Z z20 = (Z) objH2;
            Object objH3 = c0510p.H();
            if (objH3 == obj3) {
                z9 = z20;
                obj = null;
                objK = C0486d.K(null, t7);
                c0510p.b0(objK);
            } else {
                z9 = z20;
                obj = null;
                objK = objH3;
            }
            Z z21 = (Z) objK;
            Object objH4 = c0510p.H();
            if (objH4 == obj3) {
                objH4 = C0486d.K(obj, t7);
                c0510p.b0(objH4);
            }
            Z z22 = (Z) objH4;
            Object objH5 = c0510p.H();
            if (objH5 == obj3) {
                objH5 = C0486d.K(obj, t7);
                c0510p.b0(objH5);
            }
            Z z23 = (Z) objH5;
            Integer num = (Integer) z21.getValue();
            Object objH6 = c0510p.H();
            if (objH6 == obj3) {
                objH6 = new w(z21, null);
                c0510p.b0(objH6);
            }
            C0486d.e(c0510p, (e4.n) objH6, num);
            Float f5 = (Float) z22.getValue();
            Object objH7 = c0510p.H();
            if (objH7 == obj3) {
                objH7 = new x(z22, null);
                c0510p.b0(objH7);
            }
            C0486d.e(c0510p, (e4.n) objH7, f5);
            Float f7 = (Float) z23.getValue();
            Object objH8 = c0510p.H();
            if (objH8 == obj3) {
                objH8 = new y(z23, null);
                c0510p.b0(objH8);
            }
            C0486d.e(c0510p, (e4.n) objH8, f7);
            a0.n nVar = a0.n.a;
            FillElement fillElement3 = androidx.compose.foundation.layout.c.f10591c;
            boolean zH = c0510p.h(exoPlayer);
            Object objH9 = c0510p.H();
            if (zH || objH9 == obj3) {
                z10 = z22;
                objH9 = new z(exoPlayer, z21, null);
                c0510p.b0(objH9);
            } else {
                z10 = z22;
            }
            a0.q qVarA = s0.w.a(fillElement3, exoPlayer, (e4.n) objH9);
            O3.C c2 = O3.C.a;
            boolean zH2 = c0510p.h(context) | c0510p.h(exoPlayer);
            Object objH10 = c0510p.H();
            if (zH2 || objH10 == obj3) {
                z11 = z19;
                fillElement = fillElement3;
                qVar = qVarA;
                obj2 = obj3;
                z12 = z9;
                Z z24 = z10;
                Object b4 = new B(context, exoPlayer, z21, z24, z23, null);
                exoPlayer2 = exoPlayer;
                z13 = z21;
                z14 = z24;
                z15 = z23;
                c0510p.b0(b4);
                objH10 = b4;
            } else {
                z11 = z19;
                fillElement = fillElement3;
                qVar = qVarA;
                z13 = z21;
                obj2 = obj3;
                z15 = z23;
                z12 = z9;
                z14 = z10;
                exoPlayer2 = exoPlayer;
            }
            a0.q qVarA2 = s0.w.a(qVar, c2, (e4.n) objH10);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i12 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarA2);
            InterfaceC2364k.f17877j.getClass();
            InterfaceC0821a interfaceC0821a5 = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(interfaceC0821a5);
            } else {
                c0510p.e0();
            }
            C2361h c2361h3 = C2363j.f17875f;
            C0486d.R(c0510p, c2361h3, interfaceC2173HE);
            C2361h c2361h4 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h4, interfaceC0501k0M);
            C2361h c2361h5 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p, i12, c2361h5);
            }
            C2361h c2361h6 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h6, qVarC);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            boolean zH3 = c0510p.h(exoPlayer2);
            Object objH11 = c0510p.H();
            if (zH3 || objH11 == obj2) {
                objH11 = new I5.d(11, exoPlayer2, z12);
                c0510p.b0(objH11);
            }
            e4.k kVar2 = (e4.k) objH11;
            boolean zH4 = c0510p.h(exoPlayer2);
            Object objH12 = c0510p.H();
            if (zH4 || objH12 == obj2) {
                objH12 = new C2002i(exoPlayer2, 1);
                c0510p.b0(objH12);
            }
            FillElement fillElement4 = fillElement;
            androidx.compose.ui.viewinterop.a.b(kVar2, fillElement4, (e4.k) objH12, c0510p, 48, 0);
            if (z7 && !AbstractC2510o.g0(str2) && ((Boolean) z12.getValue()).booleanValue()) {
                c0510p.R(2062163298);
                c(str2, c0510p, (i11 >> 6) & 14);
                z16 = false;
            } else {
                z16 = false;
                c0510p.R(2028149819);
            }
            c0510p.p(z16);
            Object obj4 = obj2;
            androidx.compose.animation.a.b(((Boolean) z12.getValue()).booleanValue(), null, AbstractC1628z.a(null, 3), AbstractC1628z.b(null, 3), null, W.f.b(-2066480321, new B3.l(5, z11), c0510p), c0510p, 200064, 18);
            C0510p c0510p3 = c0510p;
            if (interfaceC0821a == null) {
                c0510p3.R(2063394400);
                c0510p3.p(false);
            } else {
                c0510p3.R(2063394401);
                androidx.compose.animation.a.b(((Boolean) z12.getValue()).booleanValue(), bVar.a(nVar, a0.b.f10383m), AbstractC1628z.a(null, 3), AbstractC1628z.b(null, 3), null, W.f.b(671783346, new e4.o() { // from class: y3.k
                    @Override // e4.o
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        C0510p c0510p4 = (C0510p) obj6;
                        ((Integer) obj7).getClass();
                        kotlin.jvm.internal.l.f("$this$AnimatedVisibility", (InterfaceC1619q) obj5);
                        a0.n nVar2 = a0.n.a;
                        WeakHashMap weakHashMap = n0.f16470v;
                        E0.f(interfaceC0821a, androidx.compose.foundation.layout.a.h(p0.a(nVar2, M.e(c0510p4).f16471b), 4), false, null, W.f.b(-1483725169, new D3.u(z8), c0510p4), c0510p4, 196608, 28);
                        return O3.C.a;
                    }
                }, c0510p3), c0510p3, 200064, 16);
                c0510p3 = c0510p3;
                c0510p3.p(false);
            }
            if (((Boolean) z11.getValue()).booleanValue()) {
                c0510p3.R(2064287325);
                boolean z25 = (i11 & 29360128) == 8388608;
                Object objH13 = c0510p3.H();
                if (z25 || objH13 == obj4) {
                    objH13 = new A3.i(kVar, z11, 5);
                    c0510p3.b0(objH13);
                }
                e4.k kVar3 = (e4.k) objH13;
                Object objH14 = c0510p3.H();
                if (objH14 == obj4) {
                    objH14 = new w3.m(9, z11);
                    c0510p3.b0(objH14);
                }
                C0510p c0510p4 = c0510p3;
                c2361h2 = c2361h3;
                c0510p2 = c0510p4;
                fillElement2 = fillElement4;
                c2361h = c2361h4;
                i10 = 2028149819;
                e(exoPlayer2, str, list, kVar3, (InterfaceC0821a) objH14, c0510p2, (i11 & 14) | 24576 | (i11 & 112) | ((i11 >> 12) & 896));
                z17 = false;
            } else {
                fillElement2 = fillElement4;
                c2361h = c2361h4;
                c0510p2 = c0510p3;
                z17 = false;
                i10 = 2028149819;
                c2361h2 = c2361h3;
                c0510p2.R(2028149819);
            }
            c0510p2.p(z17);
            Integer num2 = (Integer) z13.getValue();
            Float f8 = (Float) z14.getValue();
            Float f9 = (Float) z15.getValue();
            if (num2 == null && f8 == null && f9 == null) {
                c0510p2.R(i10);
                c0510p2.p(false);
                z18 = true;
            } else {
                c0510p2.R(2065065208);
                long j7 = C0998u.f11829b;
                a0.q qVarB = androidx.compose.foundation.a.b(fillElement2, C0998u.b(0.25f, j7), AbstractC0968M.a);
                InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(a0.b.f10385o, false);
                int i13 = c0510p2.f7128P;
                InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                a0.q qVarC2 = a0.a.c(c0510p2, qVarB);
                c0510p2.V();
                if (c0510p2.f7127O) {
                    c0510p2.l(interfaceC0821a5);
                } else {
                    c0510p2.e0();
                }
                C0486d.R(c0510p2, c2361h2, interfaceC2173HE2);
                C0486d.R(c0510p2, c2361h, interfaceC0501k0M2);
                if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i13))) {
                    AbstractC0703b.u(i13, c0510p2, i13, c2361h5);
                }
                C0486d.R(c0510p2, c2361h6, qVarC2);
                q2.a(null, C.e.a(), C0998u.b(0.75f, j7), 0L, 0.0f, 0.0f, W.f.b(-1645782693, new A3.l(num2, f8, f9, 12), c0510p2), c0510p2, 12583296, 121);
                z18 = true;
                c0510p2.p(true);
                c0510p2.p(false);
            }
            c0510p2.p(z18);
            interfaceC0821a3 = interfaceC0821a4;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n() { // from class: y3.l
                @Override // e4.n
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iV = C0486d.V(i7 | 1);
                    InterfaceC0821a interfaceC0821a6 = interfaceC0821a3;
                    C.f(exoPlayer, str, str2, z7, z8, interfaceC0821a, list, kVar, interfaceC0821a6, (C0510p) obj5, iV, i8);
                    return O3.C.a;
                }
            };
        }
    }
}
