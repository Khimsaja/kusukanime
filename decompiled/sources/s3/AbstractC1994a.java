package s3;

import A3.C0007b;
import B1.AbstractC0015b;
import B3.C0027c;
import H1.C0230k;
import H1.C0235p;
import L.AbstractC0381i1;
import L.AbstractC0384j0;
import L.C0390k2;
import L.E0;
import L.H2;
import L.M2;
import L.N2;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.C0524x;
import O.InterfaceC0501k0;
import O.S0;
import O.Z;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0684k;
import androidx.lifecycle.W;
import androidx.media3.exoplayer.ExoPlayer;
import b1.AbstractC0703b;
import com.kusukanime.data.AnimeDetail;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.PlaybackPrefs;
import com.kusukanime.data.StreamItem;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import h0.AbstractC0968M;
import h0.C0975U;
import h0.C0998u;
import io.ktor.client.utils.CIOKt;
import io.ktor.utils.io.ByteChannelKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import n0.AbstractC1530A;
import n0.C1537d;
import n0.C1538e;
import o.AbstractC1599K;
import o3.C1638e;
import q3.C1853d;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2124c;
import v.C2127f;
import v.C2140t;
import v.C2141u;
import v.e0;
import v.f0;
import v.n0;
import v.p0;
import v1.C2147a;
import w.C2165f;
import w0.InterfaceC2173H;
import w1.AbstractC2208a;
import x.C2227a;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import y3.AbstractC2412a;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2508m;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1994a {
    public static final W.a a = new W.a(false, 880375782, new io.ktor.http.cio.b(17));

    /* renamed from: b, reason: collision with root package name */
    public static final W.a f15639b = new W.a(false, -1052208220, new C0007b(25));

    /* renamed from: c, reason: collision with root package name */
    public static final W.a f15640c = new W.a(false, 546364483, new io.ktor.http.cio.b(18));

    /* renamed from: d, reason: collision with root package name */
    public static final W.a f15641d = new W.a(false, -1300679617, new C0007b(26));

    /* renamed from: e, reason: collision with root package name */
    public static final W.a f15642e = new W.a(false, -461046915, new io.ktor.http.cio.b(19));

    /* renamed from: f, reason: collision with root package name */
    public static final W.a f15643f = new W.a(false, 19331547, new C0007b(27));

    /* renamed from: g, reason: collision with root package name */
    public static final W.a f15644g = new W.a(false, 944969911, new C0007b(28));

    public static final void a(final C1538e c1538e, final String str, boolean z7, InterfaceC0821a interfaceC0821a, a0.q qVar, C0998u c0998u, C0998u c0998u2, C0510p c0510p, int i7) {
        long j7;
        final long j8;
        c0510p.T(2075270191);
        int i8 = i7 | (c0510p.f(c1538e) ? 4 : 2) | (c0510p.f(str) ? 32 : 16) | (c0510p.g(z7) ? 256 : 128) | (c0510p.h(interfaceC0821a) ? 2048 : 1024) | (c0510p.f(qVar) ? 16384 : 8192) | (c0510p.f(c0998u) ? 131072 : 65536) | (c0510p.f(c0998u2) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288);
        if ((599187 & i8) == 599186 && c0510p.y()) {
            c0510p.M();
        } else {
            if (z7) {
                c0510p.R(-1679637702);
                if (c0998u == null) {
                    c0510p.R(1469840063);
                    j7 = ((L.N) c0510p.k(L.P.a)).f5244c;
                    c0510p.p(false);
                } else {
                    c0510p.R(1469838792);
                    c0510p.p(false);
                    j7 = c0998u.a;
                }
                c0510p.p(false);
            } else {
                c0510p.R(1469841763);
                j7 = ((L.N) c0510p.k(L.P.a)).f5230G;
                c0510p.p(false);
            }
            if (z7) {
                c0510p.R(-1679497706);
                if (c0998u2 == null) {
                    c0510p.R(1469844641);
                    j8 = ((L.N) c0510p.k(L.P.a)).f5245d;
                    c0510p.p(false);
                } else {
                    c0510p.R(1469843308);
                    c0510p.p(false);
                    j8 = c0998u2.a;
                }
                c0510p.p(false);
            } else {
                c0510p.R(1469846399);
                j8 = ((L.N) c0510p.k(L.P.a)).f5260s;
                c0510p.p(false);
            }
            C.d dVarA = C.e.a();
            boolean z8 = (i8 & 7168) == 2048;
            Object objH = c0510p.H();
            if (z8 || objH == C0502l.a) {
                objH = new B3.u(interfaceC0821a, 7);
                c0510p.b0(objH);
            }
            q2.a(androidx.compose.foundation.a.e(qVar, false, null, (InterfaceC0821a) objH, 7), dVarA, j7, 0L, 0.0f, 0.0f, W.f.b(-1505232076, new e4.n() { // from class: s3.V
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    C0510p c0510p2 = (C0510p) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                        c0510p2.M();
                    } else {
                        a0.n nVar = a0.n.a;
                        a0.q qVarI = androidx.compose.foundation.layout.a.i(nVar, 10, 8);
                        f0 f0VarB = e0.b(AbstractC2130i.f16446d, a0.b.f10391u, c0510p2, 54);
                        int i9 = c0510p2.f7128P;
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
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                            AbstractC0703b.u(i9, c0510p2, i9, c2361h);
                        }
                        C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                        a0.q qVarJ = androidx.compose.foundation.layout.c.j(nVar, 16);
                        C1538e c1538e2 = c1538e;
                        long j9 = j8;
                        AbstractC0384j0.a(c1538e2, null, qVarJ, j9, c0510p2, 432, 0);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(6));
                        H2.b(str, null, j9, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p2.k(N2.a)).f5222n, c0510p2, 0, 3120, 55290);
                        c0510p2.p(true);
                    }
                    return O3.C.a;
                }
            }, c0510p), c0510p, 12582912, 120);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2000g(c1538e, str, z7, interfaceC0821a, qVar, c0998u, c0998u2, i7);
        }
    }

    public static final void b(String str, final InterfaceC0821a interfaceC0821a, UserRepo userRepo, C0510p c0510p, int i7) {
        int i8;
        int i9;
        UserRepo userRepo2;
        Object c2014v;
        final Z z7;
        final UserRepo userRepo3;
        final Z z8;
        UserRepo userRepo4;
        String str2 = str;
        c0510p.T(-666149527);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(str2) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
            userRepo4 = userRepo;
        } else {
            c0510p.O();
            int i10 = i7 & 1;
            Object obj = C0502l.a;
            if (i10 == 0 || c0510p.x()) {
                W wA = AbstractC2208a.a(c0510p);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i9 = i8 & (-897);
                userRepo2 = ((C1853d) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(C1853d.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p)).f14730b;
            } else {
                c0510p.M();
                i9 = i8 & (-897);
                userRepo2 = userRepo;
            }
            c0510p.q();
            Object objH = c0510p.H();
            if (objH == obj) {
                Object c0524x = new C0524x(C0486d.y(c0510p));
                c0510p.b0(c0524x);
                objH = c0524x;
            }
            final M5.c cVar = ((C0524x) objH).f7242k;
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            boolean zF = c0510p.f(context);
            Object objH2 = c0510p.H();
            if (zF || objH2 == obj) {
                objH2 = new com.kusukanime.data.a(context, 2);
                c0510p.b0(objH2);
            }
            final InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH2;
            int i11 = i9 & 14;
            boolean z9 = i11 == 4;
            Object objH3 = c0510p.H();
            O.T t7 = O.T.f7049p;
            if (z9 || objH3 == obj) {
                objH3 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH3);
            }
            Z z10 = (Z) objH3;
            boolean z11 = i11 == 4;
            Object objH4 = c0510p.H();
            if (z11 || objH4 == obj) {
                objH4 = C0486d.K(Boolean.FALSE, t7);
                c0510p.b0(objH4);
            }
            Z z12 = (Z) objH4;
            boolean zF2 = c0510p.f(z12) | c0510p.f(z10) | c0510p.f(userRepo2) | (i11 == 4);
            Object objH5 = c0510p.H();
            if (zF2 || objH5 == obj) {
                UserRepo userRepo5 = userRepo2;
                z7 = z12;
                c2014v = new C2014v(userRepo5, z7, str2, z10, null);
                userRepo3 = userRepo5;
                str2 = str2;
                z8 = z10;
                c0510p.b0(c2014v);
            } else {
                c2014v = objH5;
                userRepo3 = userRepo2;
                z8 = z10;
                z7 = z12;
            }
            C0486d.e(c0510p, (e4.n) c2014v, str2);
            final String str3 = str2;
            q2.a(null, C.e.a(), ((L.N) c0510p.k(L.P.a)).f5244c, 0L, 0.0f, 0.0f, W.f.b(1542473092, new e4.n() { // from class: s3.f
                @Override // e4.n
                public final Object invoke(Object obj2, Object obj3) {
                    C1538e c1538eB;
                    C0510p c0510p2 = (C0510p) obj2;
                    if ((((Integer) obj3).intValue() & 3) == 2 && c0510p2.y()) {
                        c0510p2.M();
                    } else {
                        a0.n nVar = a0.n.a;
                        Z z13 = z7;
                        boolean zF3 = c0510p2.f(z13);
                        InterfaceC0821a interfaceC0821a3 = interfaceC0821a;
                        boolean zF4 = zF3 | c0510p2.f(interfaceC0821a3);
                        InterfaceC0821a interfaceC0821a4 = interfaceC0821a2;
                        boolean zF5 = zF4 | c0510p2.f(interfaceC0821a4);
                        M5.c cVar2 = cVar;
                        boolean zH = zF5 | c0510p2.h(cVar2);
                        Z z14 = z8;
                        boolean zF6 = zH | c0510p2.f(z14);
                        UserRepo userRepo6 = userRepo3;
                        boolean zF7 = zF6 | c0510p2.f(userRepo6);
                        String str4 = str3;
                        boolean zF8 = zF7 | c0510p2.f(str4);
                        Object objH6 = c0510p2.H();
                        if (zF8 || objH6 == C0502l.a) {
                            C2009p c2009p = new C2009p(cVar2, z13, z14, userRepo6, interfaceC0821a3, interfaceC0821a4, str4);
                            c0510p2.b0(c2009p);
                            objH6 = c2009p;
                        }
                        a0.q qVarI = androidx.compose.foundation.layout.a.i(androidx.compose.foundation.a.e(nVar, false, null, (InterfaceC0821a) objH6, 7), 14, 8);
                        f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
                        int i12 = c0510p2.f7128P;
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
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                            AbstractC0703b.u(i12, c0510p2, i12, c2361h);
                        }
                        C0486d.R(c0510p2, C2363j.f17873d, qVarC);
                        if (((Boolean) z14.getValue()).booleanValue()) {
                            c1538eB = z1.c.u();
                        } else {
                            C1538e c1538e = q0.c.a;
                            if (c1538e != null) {
                                c1538eB = c1538e;
                            } else {
                                C1537d c1537d = new C1537d("Filled.BookmarkBorder", false);
                                int i13 = AbstractC1530A.a;
                                C0975U c0975u = new C0975U(C0998u.f11829b);
                                D4.S s7 = new D4.S(7, false);
                                s7.u(17.0f, 3.0f);
                                s7.s(7.0f, 3.0f);
                                s7.o(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                                s7.s(5.0f, 21.0f);
                                s7.t(7.0f, -3.0f);
                                s7.t(7.0f, 3.0f);
                                s7.s(19.0f, 5.0f);
                                s7.o(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                s7.m();
                                s7.u(17.0f, 18.0f);
                                s7.t(-5.0f, -2.18f);
                                s7.s(7.0f, 18.0f);
                                s7.s(7.0f, 5.0f);
                                s7.r(10.0f);
                                s7.A(13.0f);
                                s7.m();
                                C1537d.a(c1537d, s7.f1530k, c0975u);
                                c1538eB = c1537d.b();
                                q0.c.a = c1538eB;
                            }
                        }
                        a0.q qVarJ = androidx.compose.foundation.layout.c.j(nVar, 18);
                        S0 s02 = L.P.a;
                        AbstractC0384j0.a(c1538eB, null, qVarJ, ((L.N) c0510p2.k(s02)).f5245d, c0510p2, 432, 0);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(6));
                        H2.b(((Boolean) z14.getValue()).booleanValue() ? "Tersimpan" : "Simpan", null, ((L.N) c0510p2.k(s02)).f5245d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5221m, c0510p2, 0, 0, 65530);
                        c0510p2.p(true);
                    }
                    return O3.C.a;
                }
            }, c0510p), c0510p, 12582912, 121);
            userRepo4 = userRepo3;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D3.b(str, interfaceC0821a, userRepo4, i7, 2);
        }
    }

    public static final void c(final EpisodeRef episodeRef, final float f5, final InterfaceC0821a interfaceC0821a, C0510p c0510p, final int i7) {
        c0510p.T(-556582011);
        int i8 = (c0510p.f(episodeRef) ? 4 : 2) | i7 | (c0510p.c(f5) ? 32 : 16) | (c0510p.h(interfaceC0821a) ? 256 : 128);
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            E0.d(interfaceC0821a, androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f), 16, 10), false, C.e.b(14), E0.j(((L.N) c0510p.k(L.P.a)).f5244c, c0510p), E0.k(0, 62), W.f.b(37818224, new e4.o() { // from class: s3.s
                @Override // e4.o
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C2361h c2361h;
                    C0510p c0510p2 = (C0510p) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kotlin.jvm.internal.l.f("$this$Card", (C2141u) obj);
                    if ((iIntValue & 17) == 16 && c0510p2.y()) {
                        c0510p2.M();
                    } else {
                        a0.n nVar = a0.n.a;
                        a0.q qVarH = androidx.compose.foundation.layout.a.h(nVar, 14);
                        C2124c c2124c = AbstractC2130i.f16445c;
                        a0.g gVar = a0.b.f10393w;
                        C2140t c2140tA = v.r.a(c2124c, gVar, c0510p2, 0);
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
                        C2361h c2361h2 = C2363j.f17875f;
                        C0486d.R(c0510p2, c2361h2, c2140tA);
                        C2361h c2361h3 = C2363j.f17874e;
                        C0486d.R(c0510p2, c2361h3, interfaceC0501k0M);
                        C2361h c2361h4 = C2363j.f17876g;
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                            AbstractC0703b.u(i9, c0510p2, i9, c2361h4);
                        }
                        C2361h c2361h5 = C2363j.f17873d;
                        C0486d.R(c0510p2, c2361h5, qVarC);
                        f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
                        int i10 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                        a0.q qVarC2 = a0.a.c(c0510p2, nVar);
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, c2361h2, f0VarB);
                        C0486d.R(c0510p2, c2361h3, interfaceC0501k0M2);
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                            AbstractC0703b.u(i10, c0510p2, i10, c2361h4);
                        }
                        C0486d.R(c0510p2, c2361h5, qVarC2);
                        AbstractC0384j0.a(P3.r.A(), null, androidx.compose.foundation.layout.c.j(nVar, 18), E0.l(c0510p2).f5245d, c0510p2, 432, 0);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(8));
                        if (1.0f <= 0.0d) {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        C2140t c2140tA2 = v.r.a(c2124c, gVar, c0510p2, 0);
                        int i11 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M3 = c0510p2.m();
                        a0.q qVarC3 = a0.a.c(c0510p2, layoutWeightElement);
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, c2361h2, c2140tA2);
                        C0486d.R(c0510p2, c2361h3, interfaceC0501k0M3);
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                            c2361h = c2361h4;
                            AbstractC0703b.u(i11, c0510p2, i11, c2361h);
                        } else {
                            c2361h = c2361h4;
                        }
                        C0486d.R(c0510p2, c2361h5, qVarC3);
                        C2361h c2361h6 = c2361h;
                        H2.b("Lanjutkan menonton", null, E0.l(c0510p2).f5245d, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p2).f5223o, c0510p2, 6, 0, 65530);
                        H2.b(AbstractC0703b.g(episodeRef.getN(), "Episode "), null, E0.l(c0510p2).f5245d, 0L, M0.u.f6417q, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p2).f5217i, c0510p2, 196608, 0, 65498);
                        c0510p2.p(true);
                        float f7 = f5;
                        H2.b(((int) (100 * f7)) + "%", null, E0.l(c0510p2).f5245d, 0L, null, 0L, null, 0L, 0, false, 0, 0, E0.o(c0510p2).f5222n, c0510p2, 0, 0, 65530);
                        c0510p2.p(true);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, (float) 10));
                        float f8 = (float) 4;
                        a0.q qVarO = q0.c.o(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), f8), C.e.a());
                        long jB = C0998u.b(0.25f, E0.l(c0510p2).f5245d);
                        R1.i iVar = AbstractC0968M.a;
                        a0.q qVarB = androidx.compose.foundation.a.b(qVarO, jB, iVar);
                        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                        int i12 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M4 = c0510p2.m();
                        a0.q qVarC4 = a0.a.c(c0510p2, qVarB);
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, c2361h2, interfaceC2173HE);
                        C0486d.R(c0510p2, c2361h3, interfaceC0501k0M4);
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                            AbstractC0703b.u(i12, c0510p2, i12, c2361h6);
                        }
                        C0486d.R(c0510p2, c2361h5, qVarC4);
                        AbstractC2136o.a(androidx.compose.foundation.a.b(q0.c.o(androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, e3.c.j(f7, 0.0f, 1.0f)), f8), C.e.a()), E0.l(c0510p2).a, iVar), c0510p2, 0);
                        c0510p2.p(true);
                        c0510p2.p(true);
                    }
                    return O3.C.a;
                }
            }, c0510p), c0510p, ((i8 >> 6) & 14) | 100663344, 196);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n(f5, interfaceC0821a, i7) { // from class: s3.t

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ float f15783l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f15784m;

                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(1);
                    float f7 = this.f15783l;
                    InterfaceC0821a interfaceC0821a2 = this.f15784m;
                    AbstractC1994a.c(this.f15782k, f7, interfaceC0821a2, (C0510p) obj, iV);
                    return O3.C.a;
                }
            };
        }
    }

    public static final void d(AnimeDetail animeDetail, EpisodeRef episodeRef, EpisodeRef episodeRef2, e4.k kVar, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        int i8;
        C2361h c2361h;
        e4.k kVar2;
        C2361h c2361h2;
        C2361h c2361h3;
        C2361h c2361h4;
        C2361h c2361h5;
        boolean z7;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-653409459);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? c0510p2.f(animeDetail) : c0510p2.h(animeDetail) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p2.f(episodeRef) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p2.f(episodeRef2) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p2.h(kVar) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p2.h(interfaceC0821a) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && c0510p2.y()) {
            c0510p2.M();
            kVar2 = kVar;
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarE = androidx.compose.foundation.layout.c.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 280);
            a0.i iVar = a0.b.f10381k;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
            int i9 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
            a0.q qVarC = a0.a.c(c0510p2, qVarE);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C2361h c2361h6 = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h6, interfaceC2173HE);
            C2361h c2361h7 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h7, interfaceC0501k0M);
            C2361h c2361h8 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p2, i9, c2361h8);
            }
            C2361h c2361h9 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h9, qVarC);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            int i10 = i8;
            long j7 = E0.l(c0510p2).f5231H;
            R1.i iVar2 = AbstractC0968M.a;
            a0.q qVarB = androidx.compose.foundation.a.b(fillElement, j7, iVar2);
            a0.i iVar3 = a0.b.f10385o;
            InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar3, false);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, qVarB);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h6, interfaceC2173HE2);
            C0486d.R(c0510p2, c2361h7, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h8);
            }
            C0486d.R(c0510p2, c2361h9, qVarC2);
            AbstractC0384j0.a(n6.m.J(), null, androidx.compose.foundation.layout.c.j(nVar, 36), E0.l(c0510p2).f5260s, c0510p2, 432, 0);
            c0510p2.p(true);
            T2.q.b(animeDetail.getCover(), null, fillElement, c0510p2, 1573296);
            Float fValueOf = Float.valueOf(0.0f);
            long j8 = C0998u.f11829b;
            AbstractC2136o.a(androidx.compose.foundation.a.a(fillElement, R1.i.u(new O3.l[]{new O3.l(fValueOf, new C0998u(C0998u.b(0.55f, j8))), new O3.l(Float.valueOf(0.3f), new C0998u(C0998u.f11833f)), new O3.l(Float.valueOf(0.55f), new C0998u(C0998u.b(0.55f, E0.l(c0510p2).f5255n))), new O3.l(Float.valueOf(1.0f), new C0998u(E0.l(c0510p2).f5255n))})), c0510p2, 0);
            a0.q qVarA = bVar.a(nVar, iVar);
            WeakHashMap weakHashMap = n0.f16470v;
            a0.q qVarJ = androidx.compose.foundation.layout.c.j(androidx.compose.foundation.layout.a.h(p0.a(qVarA, v.M.e(c0510p2).f16475f), 8), 40);
            C.d dVar = C.e.a;
            a0.q qVarE2 = androidx.compose.foundation.a.e(androidx.compose.foundation.a.b(q0.c.o(qVarJ, dVar), C0998u.b(0.45f, j8), iVar2), false, null, interfaceC0821a, 7);
            InterfaceC2173H interfaceC2173HE3 = AbstractC2136o.e(iVar3, false);
            int i12 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M3 = c0510p2.m();
            a0.q qVarC3 = a0.a.c(c0510p2, qVarE2);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h6, interfaceC2173HE3);
            C0486d.R(c0510p2, c2361h7, interfaceC0501k0M3);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i12))) {
                c2361h = c2361h8;
                AbstractC0703b.u(i12, c0510p2, i12, c2361h);
            } else {
                c2361h = c2361h8;
            }
            C0486d.R(c0510p2, c2361h9, qVarC3);
            C1538e c1538eB = android.support.v4.media.session.b.a;
            if (c1538eB == null) {
                C1537d c1537d = new C1537d("AutoMirrored.Filled.ArrowBack", true);
                int i13 = AbstractC1530A.a;
                int i14 = C0998u.f11835h;
                C0975U c0975u = new C0975U(j8);
                D4.S s7 = new D4.S(7, false);
                s7.u(20.0f, 11.0f);
                s7.q(7.83f);
                s7.t(5.59f, -5.59f);
                s7.s(12.0f, 4.0f);
                s7.t(-8.0f, 8.0f);
                s7.t(8.0f, 8.0f);
                s7.t(1.41f, -1.41f);
                s7.s(7.83f, 13.0f);
                s7.q(20.0f);
                s7.A(-2.0f);
                s7.m();
                C1537d.a(c1537d, s7.f1530k, c0975u);
                c1538eB = c1537d.b();
                android.support.v4.media.session.b.a = c1538eB;
            }
            C2361h c2361h10 = c2361h;
            AbstractC0384j0.a(c1538eB, "Kembali", androidx.compose.foundation.layout.c.j(nVar, 20), C0998u.f11830c, c0510p2, 3504, 0);
            c0510p2.p(true);
            a0.q qVarH = androidx.compose.foundation.layout.a.h(bVar.a(nVar, a0.b.f10387q), 16);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10392v, c0510p2, 48);
            int i15 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M4 = c0510p2.m();
            a0.q qVarC4 = a0.a.c(c0510p2, qVarH);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h6, f0VarB);
            C0486d.R(c0510p2, c2361h7, interfaceC0501k0M4);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i15))) {
                AbstractC0703b.u(i15, c0510p2, i15, c2361h10);
            }
            C0486d.R(c0510p2, c2361h9, qVarC4);
            InterfaceC2173H interfaceC2173HE4 = AbstractC2136o.e(iVar, false);
            int i16 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M5 = c0510p2.m();
            a0.q qVarC5 = a0.a.c(c0510p2, nVar);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h6, interfaceC2173HE4);
            C0486d.R(c0510p2, c2361h7, interfaceC0501k0M5);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i16))) {
                AbstractC0703b.u(i16, c0510p2, i16, c2361h10);
            }
            C0486d.R(c0510p2, c2361h9, qVarC5);
            float f5 = 14;
            q2.a(null, C.e.b(f5), E0.l(c0510p2).f5231H, 0L, 0.0f, 0.0f, W.f.b(1069535384, new D3.c(5, animeDetail), c0510p2), c0510p, 12582912, 121);
            EpisodeRef episodeRef3 = episodeRef == null ? episodeRef2 : episodeRef;
            if (episodeRef3 != null) {
                c0510p.R(382097397);
                a0.q qVarB2 = androidx.compose.foundation.a.b(q0.c.o(androidx.compose.foundation.layout.c.j(bVar.a(nVar, iVar3), 44), dVar), C0998u.b(0.92f, E0.l(c0510p).a), iVar2);
                boolean zF = c0510p.f(episodeRef3) | ((i10 & 7168) == 2048);
                Object objH = c0510p.H();
                if (zF || objH == C0502l.a) {
                    kVar2 = kVar;
                    objH = new C2004k(kVar2, episodeRef3, 1);
                    c0510p.b0(objH);
                } else {
                    kVar2 = kVar;
                }
                a0.q qVarE3 = androidx.compose.foundation.a.e(qVarB2, false, null, (InterfaceC0821a) objH, 7);
                InterfaceC2173H interfaceC2173HE5 = AbstractC2136o.e(iVar3, false);
                int i17 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M6 = c0510p.m();
                a0.q qVarC6 = a0.a.c(c0510p, qVarE3);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                c2361h3 = c2361h6;
                C0486d.R(c0510p, c2361h3, interfaceC2173HE5);
                c2361h2 = c2361h7;
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M6);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i17))) {
                    c2361h4 = c2361h10;
                    AbstractC0703b.u(i17, c0510p, i17, c2361h4);
                } else {
                    c2361h4 = c2361h10;
                }
                C0486d.R(c0510p, c2361h9, qVarC6);
                c2361h5 = c2361h9;
                AbstractC0384j0.a(P3.r.A(), "Putar", androidx.compose.foundation.layout.c.j(nVar, 26), E0.l(c0510p).f5243b, c0510p, 432, 0);
                z7 = true;
                c0510p.p(true);
            } else {
                kVar2 = kVar;
                c2361h2 = c2361h7;
                c2361h3 = c2361h6;
                c2361h4 = c2361h10;
                c2361h5 = c2361h9;
                z7 = true;
                c0510p.R(364521637);
            }
            c0510p.p(false);
            c0510p.p(z7);
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(f5));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z7);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i18 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M7 = c0510p.m();
            a0.q qVarC7 = a0.a.c(c0510p, layoutWeightElement);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h3, c2140tA);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M7);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i18))) {
                AbstractC0703b.u(i18, c0510p, i18, c2361h4);
            }
            C0486d.R(c0510p, c2361h5, qVarC7);
            H2.b(animeDetail.getTitle(), null, 0L, 0L, M0.u.f6417q, 0L, null, 0L, 2, false, 3, 0, E0.o(c0510p).f5214f, c0510p, 196608, 3120, 55262);
            c0510p2 = c0510p;
            if (animeDetail.getAlt_titles().isEmpty()) {
                c0510p2.R(-1530789803);
            } else {
                c0510p2.R(-1511688719);
                AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 4));
                H2.b(P3.q.y0(animeDetail.getAlt_titles(), " · ", null, null, null, 62), null, E0.l(c0510p2).f5260s, 0L, null, 0L, null, 0L, 2, false, 2, 0, E0.o(c0510p2).f5223o, c0510p, 0, 3120, 55290);
                c0510p2 = c0510p;
            }
            c0510p2.p(false);
            c0510p2.p(true);
            c0510p2.p(true);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2007n(animeDetail, episodeRef, episodeRef2, kVar2, interfaceC0821a, i7, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    public static final void e(final String str, final e4.k kVar, final InterfaceC0821a interfaceC0821a, final InterfaceC0821a interfaceC0821a2, N n7, C0510p c0510p, final int i7) {
        N n8;
        int i8;
        Object xVar;
        int i9;
        int i10;
        ?? r10;
        boolean z7;
        final String str2;
        N n9;
        boolean z8;
        C0510p c0510p2;
        Object obj;
        int i11;
        boolean z9;
        List list;
        Z z10;
        Z z11;
        Z z12;
        int i12;
        Object obj2;
        boolean z13;
        AnimeDetail animeDetail;
        C0510p c0510p3;
        boolean z14;
        C0510p c0510p4;
        C0510p c0510p5;
        final N n10;
        C0510p c0510p6;
        kotlin.jvm.internal.l.f("onPlay", kVar);
        c0510p.T(-1518511742);
        int i13 = i7 | (c0510p.f(str) ? 4 : 2) | (c0510p.h(kVar) ? 32 : 16) | (c0510p.h(interfaceC0821a) ? 256 : 128) | (c0510p.h(interfaceC0821a2) ? 2048 : 1024) | 8192;
        if ((i13 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
            n10 = n7;
            c0510p6 = c0510p;
        } else {
            c0510p.O();
            int i14 = i7 & 1;
            Object obj3 = C0502l.a;
            if (i14 == 0 || c0510p.x()) {
                W wA = AbstractC2208a.a(c0510p);
                if (wA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                n8 = (N) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(N.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p);
                i8 = i13 & (-57345);
            } else {
                c0510p.M();
                i8 = i13 & (-57345);
                n8 = n7;
            }
            c0510p.q();
            Context context = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            int i15 = i8 & 14;
            boolean z15 = i15 == 4;
            Object objH = c0510p.H();
            if (z15 || objH == obj3) {
                Pattern patternCompile = Pattern.compile("-episode-\\d+$");
                kotlin.jvm.internal.l.e("compile(...)", patternCompile);
                objH = Boolean.valueOf(patternCompile.matcher(str).find());
                c0510p.b0(objH);
            }
            Boolean bool = (Boolean) objH;
            boolean zBooleanValue = bool.booleanValue();
            boolean zG = c0510p.g(zBooleanValue) | c0510p.h(n8) | c0510p.h(context) | (i15 == 4);
            Object objH2 = c0510p.H();
            if (zG || objH2 == obj3) {
                i9 = i15;
                i10 = i8;
                r10 = 0;
                xVar = new x(zBooleanValue, n8, context, str, null);
                z7 = zBooleanValue;
                str2 = str;
                c0510p.b0(xVar);
            } else {
                i10 = i8;
                z7 = zBooleanValue;
                i9 = i15;
                xVar = objH2;
                r10 = 0;
                str2 = str;
            }
            C0486d.f(str2, bool, (e4.n) xVar, c0510p);
            Z zV = C0486d.v(n8.f15601c, c0510p);
            Z zV2 = C0486d.v(n8.f15603e, c0510p);
            Z zV3 = C0486d.v(n8.f15605g, c0510p);
            final Z zV4 = C0486d.v(n8.f15609k, c0510p);
            Z zV5 = C0486d.v(n8.f15611m, c0510p);
            final AnimeDetail animeDetail2 = (AnimeDetail) zV.getValue();
            if (z7) {
                c0510p.R(908210601);
                i(str2, interfaceC0821a, kVar, c0510p, ((i10 >> 3) & 112) | i9 | ((i10 << 3) & 896));
                c0510p.p(r10);
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    final int i16 = 1;
                    final N n11 = n8;
                    c0509o0S.f7111d = new e4.n(str2, kVar, interfaceC0821a, interfaceC0821a2, n11, i7, i16) { // from class: s3.c

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ int f15647k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ String f15648l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ e4.k f15649m;

                        /* renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f15650n;

                        /* renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC0821a f15651o;

                        /* renamed from: p, reason: collision with root package name */
                        public final /* synthetic */ N f15652p;

                        {
                            this.f15647k = i16;
                        }

                        @Override // e4.n
                        public final Object invoke(Object obj4, Object obj5) {
                            switch (this.f15647k) {
                                case 0:
                                    ((Integer) obj5).getClass();
                                    int iV = C0486d.V(1);
                                    String str3 = this.f15648l;
                                    InterfaceC0821a interfaceC0821a3 = this.f15651o;
                                    N n12 = this.f15652p;
                                    AbstractC1994a.e(str3, this.f15649m, this.f15650n, interfaceC0821a3, n12, (C0510p) obj4, iV);
                                    break;
                                default:
                                    ((Integer) obj5).getClass();
                                    int iV2 = C0486d.V(1);
                                    String str4 = this.f15648l;
                                    N n13 = this.f15652p;
                                    AbstractC1994a.e(str4, this.f15649m, this.f15650n, this.f15651o, n13, (C0510p) obj4, iV2);
                                    break;
                            }
                            return O3.C.a;
                        }
                    };
                    return;
                }
                return;
            }
            c0510p.R(900580416);
            c0510p.p(r10);
            if (((Boolean) zV2.getValue()).booleanValue()) {
                c0510p.R(999134160);
                D3.f.g(null, c0510p, r10);
                c0510p.p(r10);
            } else if (((String) zV3.getValue()) != null) {
                c0510p.R(999135474);
                String str3 = (String) zV3.getValue();
                kotlin.jvm.internal.l.c(str3);
                boolean zH = c0510p.h(n8) | (i9 == 4 ? true : r10);
                Object objH3 = c0510p.H();
                if (zH || objH3 == obj3) {
                    objH3 = new Z5.A(7, n8, str2);
                    c0510p.b0(objH3);
                }
                D3.f.d(str3, (InterfaceC0821a) objH3, null, c0510p, r10);
                c0510p.p(r10);
            } else {
                if (animeDetail2 != null) {
                    c0510p.R(908699750);
                    boolean z16 = i9 == 4 ? true : r10;
                    Object objH4 = c0510p.H();
                    O.T t7 = O.T.f7049p;
                    if (z16 || objH4 == obj3) {
                        objH4 = C0486d.K(Boolean.FALSE, t7);
                        c0510p.b0(objH4);
                    }
                    final Z z17 = (Z) objH4;
                    boolean zF = c0510p.f(animeDetail2.getEpisodes()) | c0510p.g(f(z17));
                    Object objH5 = c0510p.H();
                    if (zF || objH5 == obj3) {
                        List<EpisodeRef> episodes = animeDetail2.getEpisodes();
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : episodes) {
                            EpisodeRef episodeRef = (EpisodeRef) obj4;
                            String slug = episodeRef.getSlug();
                            if (AbstractC2510o.g0(slug)) {
                                slug = String.valueOf(episodeRef.getN());
                            }
                            if (hashSet.add(slug)) {
                                arrayList.add(obj4);
                            }
                        }
                        List listI0 = arrayList;
                        if (((Boolean) z17.getValue()).booleanValue()) {
                            listI0 = P3.q.I0(arrayList);
                        }
                        objH5 = listI0;
                        c0510p.b0(objH5);
                    }
                    final List list2 = (List) objH5;
                    boolean zF2 = c0510p.f((String) zV5.getValue()) | c0510p.f(animeDetail2.getEpisodes());
                    Object objH6 = c0510p.H();
                    if (zF2 || objH6 == obj3) {
                        Iterator<T> it = animeDetail2.getEpisodes().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next = it.next();
                            if (kotlin.jvm.internal.l.a(((EpisodeRef) next).getSlug(), (String) zV5.getValue())) {
                                obj = next;
                                break;
                            }
                        }
                        objH6 = (EpisodeRef) obj;
                        c0510p.b0(objH6);
                    }
                    final EpisodeRef episodeRef2 = (EpisodeRef) objH6;
                    final EpisodeRef episodeRef3 = (EpisodeRef) P3.q.t0(animeDetail2.getEpisodes());
                    boolean z18 = i9 == 4;
                    Object objH7 = c0510p.H();
                    if (z18 || objH7 == obj3) {
                        objH7 = C0486d.K(Boolean.FALSE, t7);
                        c0510p.b0(objH7);
                    }
                    final Z z19 = (Z) objH7;
                    boolean z20 = i9 == 4;
                    Object objH8 = c0510p.H();
                    if (z20 || objH8 == obj3) {
                        objH8 = C0486d.K(Boolean.FALSE, t7);
                        c0510p.b0(objH8);
                    }
                    final Z z21 = (Z) objH8;
                    FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
                    v.Z zC = androidx.compose.foundation.layout.a.c(24);
                    boolean zH2 = ((i10 & 112) == 32) | c0510p.h(animeDetail2) | c0510p.f(episodeRef2) | c0510p.f(episodeRef3) | ((i10 & 7168) == 2048) | (i9 == 4) | ((i10 & 896) == 256) | c0510p.f(z21) | c0510p.f(zV4) | c0510p.h(list2) | c0510p.f(z17) | c0510p.f(z19);
                    Object objH9 = c0510p.H();
                    if (zH2 || objH9 == obj3) {
                        n9 = n8;
                        i11 = 900580416;
                        z9 = false;
                        final String str4 = str2;
                        e4.k kVar2 = new e4.k() { // from class: s3.u
                            @Override // e4.k
                            public final Object invoke(Object obj5) {
                                C2165f c2165f = (C2165f) obj5;
                                kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f);
                                AnimeDetail animeDetail3 = animeDetail2;
                                InterfaceC0821a interfaceC0821a3 = interfaceC0821a2;
                                EpisodeRef episodeRef4 = episodeRef2;
                                EpisodeRef episodeRef5 = episodeRef3;
                                e4.k kVar3 = kVar;
                                C2165f.w0(c2165f, new W.a(true, -1776855378, new B3.g(animeDetail3, episodeRef4, episodeRef5, kVar3, interfaceC0821a3)));
                                String str5 = str4;
                                Z z22 = z21;
                                InterfaceC0821a interfaceC0821a4 = interfaceC0821a;
                                C2165f.w0(c2165f, new W.a(true, -1496797545, new C1998e(animeDetail3, str5, interfaceC0821a4, z22)));
                                Z z23 = zV4;
                                if (episodeRef4 != null) {
                                    C2165f.w0(c2165f, new W.a(true, -328280077, new C0027c((Object) episodeRef4, kVar3, z23, 3)));
                                }
                                Z z24 = z17;
                                Z z25 = z19;
                                List list3 = list2;
                                C2165f.w0(c2165f, new W.a(true, 213853302, new C0027c(list3, z24, z25, 4)));
                                C2165f.w0(c2165f, new W.a(true, 1924504149, new C0027c((Object) list3, kVar3, z23, 5)));
                                C2165f.w0(c2165f, new W.a(true, -659812300, new B3.d(2, str5, interfaceC0821a4)));
                                return O3.C.a;
                            }
                        };
                        list = list2;
                        z10 = z19;
                        z11 = z17;
                        z12 = zV4;
                        c0510p.b0(kVar2);
                        objH9 = kVar2;
                    } else {
                        n9 = n8;
                        z10 = z19;
                        list = list2;
                        z11 = z17;
                        z12 = zV4;
                        i11 = 900580416;
                        z9 = false;
                    }
                    C0510p c0510p7 = c0510p;
                    Z z22 = z10;
                    AbstractC0847h.a(fillElement, null, zC, null, null, null, false, (e4.k) objH9, c0510p7, 390, 250);
                    if (((Boolean) z22.getValue()).booleanValue()) {
                        c0510p7.R(912976851);
                        C0390k2 c0390k2F = AbstractC0381i1.f(c0510p7, 6, 2);
                        boolean zF3 = c0510p7.f(z22);
                        Object objH10 = c0510p7.H();
                        if (zF3 || objH10 == obj3) {
                            objH10 = new B3.i(25, z22);
                            c0510p7.b0(objH10);
                        }
                        obj2 = obj3;
                        animeDetail = animeDetail2;
                        AbstractC0381i1.a((InterfaceC0821a) objH10, null, c0390k2F, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, W.f.b(198996426, new B3.g(list, z22, kVar, z11, z12), c0510p7), c0510p, 0);
                        C0510p c0510p8 = c0510p;
                        z13 = false;
                        c0510p8.p(false);
                        i12 = 900580416;
                        c0510p3 = c0510p8;
                    } else {
                        i12 = i11;
                        obj2 = obj3;
                        z13 = z9;
                        animeDetail = animeDetail2;
                        c0510p7.R(i12);
                        c0510p7.p(z13);
                        c0510p3 = c0510p7;
                    }
                    if (((Boolean) z21.getValue()).booleanValue()) {
                        c0510p3.R(914533671);
                        C0390k2 c0390k2F2 = AbstractC0381i1.f(c0510p3, 6, 2);
                        boolean zF4 = c0510p3.f(z21);
                        Object objH11 = c0510p3.H();
                        if (zF4 || objH11 == obj2) {
                            objH11 = new B3.i(14, z21);
                            c0510p3.b0(objH11);
                        }
                        AbstractC0381i1.a((InterfaceC0821a) objH11, null, c0390k2F2, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, W.f.b(-553459533, new C1995b(animeDetail, 0), c0510p3), c0510p, 0);
                        c0510p4 = c0510p;
                        z14 = false;
                    } else {
                        z14 = z13;
                        c0510p3.R(i12);
                        c0510p4 = c0510p3;
                    }
                    c0510p4.p(z14);
                    c0510p2 = c0510p4;
                    z8 = z14;
                } else {
                    n9 = n8;
                    C0510p c0510p9 = c0510p;
                    c0510p9.R(900580416);
                    c0510p2 = c0510p9;
                    z8 = r10;
                }
                c0510p2.p(z8);
                c0510p5 = c0510p2;
                n10 = n9;
                c0510p6 = c0510p5;
            }
            n9 = n8;
            c0510p5 = c0510p;
            n10 = n9;
            c0510p6 = c0510p5;
        }
        C0509o0 c0509o0S2 = c0510p6.s();
        if (c0509o0S2 != null) {
            final int i17 = 0;
            c0509o0S2.f7111d = new e4.n(str, kVar, interfaceC0821a, interfaceC0821a2, n10, i7, i17) { // from class: s3.c

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f15647k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ String f15648l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e4.k f15649m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f15650n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f15651o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ N f15652p;

                {
                    this.f15647k = i17;
                }

                @Override // e4.n
                public final Object invoke(Object obj42, Object obj5) {
                    switch (this.f15647k) {
                        case 0:
                            ((Integer) obj5).getClass();
                            int iV = C0486d.V(1);
                            String str32 = this.f15648l;
                            InterfaceC0821a interfaceC0821a3 = this.f15651o;
                            N n12 = this.f15652p;
                            AbstractC1994a.e(str32, this.f15649m, this.f15650n, interfaceC0821a3, n12, (C0510p) obj42, iV);
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            int iV2 = C0486d.V(1);
                            String str42 = this.f15648l;
                            N n13 = this.f15652p;
                            AbstractC1994a.e(str42, this.f15649m, this.f15650n, this.f15651o, n13, (C0510p) obj42, iV2);
                            break;
                    }
                    return O3.C.a;
                }
            };
        }
    }

    public static final boolean f(Z z7) {
        return ((Boolean) z7.getValue()).booleanValue();
    }

    public static final void g(final List list, final e4.k kVar, final Map map, int i7, final boolean z7, a0.n nVar, C0510p c0510p, final int i8) {
        a0.n nVar2;
        int i9;
        final a0.n nVar3;
        final int i10;
        C0510p c0510p2 = c0510p;
        kotlin.jvm.internal.l.f("episodes", list);
        kotlin.jvm.internal.l.f("onPlay", kVar);
        c0510p2.T(1489198216);
        int i11 = (c0510p2.h(list) ? 4 : 2) | i8 | (c0510p2.h(kVar) ? 32 : 16) | (c0510p2.h(map) ? 256 : 128) | 3072;
        if ((i8 & 24576) == 0) {
            i11 |= c0510p2.g(z7) ? 16384 : 8192;
        }
        int i12 = i11 | 196608;
        if ((74899 & i12) == 74898 && c0510p2.y()) {
            c0510p2.M();
            i10 = i7;
            nVar3 = nVar;
        } else {
            a0.n nVar4 = a0.n.a;
            boolean zF = ((57344 & i12) == 16384) | c0510p2.f(list);
            Object objH = c0510p2.H();
            O.T t7 = C0502l.a;
            if (zF || objH == t7) {
                objH = z7 ? P3.q.P0(list, 12) : list;
                c0510p2.b0(objH);
            }
            final List list2 = (List) objH;
            if (z7) {
                c0510p2.R(1987696046);
                float f5 = 8;
                float f7 = 16;
                float f8 = 2;
                final float f9 = ((((Configuration) c0510p2.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp - (f7 * f8)) - (3 * f5)) / 4;
                nVar2 = nVar4;
                v.G.a(androidx.compose.foundation.layout.a.i(androidx.compose.foundation.layout.c.d(nVar4, 1.0f), f7, f8), AbstractC2130i.g(f5), AbstractC2130i.g(f5), 4, 0, null, W.f.b(799148808, new e4.o() { // from class: s3.Q
                    @Override // e4.o
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        C0510p c0510p3 = (C0510p) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        kotlin.jvm.internal.l.f("$this$FlowRow", (v.N) obj);
                        if ((iIntValue & 17) == 16 && c0510p3.y()) {
                            c0510p3.M();
                        } else {
                            for (EpisodeRef episodeRef : list2) {
                                int n7 = episodeRef.getN();
                                String slug = episodeRef.getSlug();
                                Map map2 = map;
                                boolean zContainsKey = map2.containsKey(slug);
                                Float f10 = (Float) map2.get(episodeRef.getSlug());
                                float fFloatValue = f10 != null ? f10.floatValue() : 0.0f;
                                e4.k kVar2 = kVar;
                                boolean zF2 = c0510p3.f(kVar2) | c0510p3.f(episodeRef);
                                Object objH2 = c0510p3.H();
                                if (zF2 || objH2 == C0502l.a) {
                                    objH2 = new C2004k(kVar2, episodeRef, 4);
                                    c0510p3.b0(objH2);
                                }
                                AbstractC1994a.h(n7, zContainsKey, fFloatValue, (InterfaceC0821a) objH2, androidx.compose.foundation.layout.c.n(f9), c0510p3, 0, 0);
                            }
                        }
                        return O3.C.a;
                    }
                }, c0510p2), c0510p2, 1576368, 48);
                c0510p2.p(false);
                i9 = 4;
            } else {
                c0510p2.R(1988825965);
                C2227a c2227a = new C2227a(4);
                a0.q qVarG = androidx.compose.foundation.layout.c.g(androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar4, 1.0f), 16, 0.0f, 2), 0.0f, 520, 1);
                float f10 = 8;
                C2127f c2127fG = AbstractC2130i.g(f10);
                C2127f c2127fG2 = AbstractC2130i.g(f10);
                boolean zH = ((i12 & 112) == 32) | c0510p2.h(list2) | c0510p2.h(map);
                Object objH2 = c0510p2.H();
                if (zH || objH2 == t7) {
                    objH2 = new io.github.jan.supabase.auth.d(list2, map, kVar);
                    c0510p2.b0(objH2);
                }
                nVar2 = nVar4;
                i9 = 4;
                AbstractC0905c.b(c2227a, qVarG, null, null, c2127fG2, c2127fG, null, false, (e4.k) objH2, c0510p, 1769472, 412);
                c0510p2 = c0510p;
                c0510p2.p(false);
            }
            nVar3 = nVar2;
            i10 = i9;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n() { // from class: s3.S
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(i8 | 1);
                    boolean z8 = z7;
                    a0.n nVar5 = nVar3;
                    AbstractC1994a.g(list, kVar, map, i10, z8, nVar5, (C0510p) obj, iV);
                    return O3.C.a;
                }
            };
        }
    }

    public static final void h(final int i7, final boolean z7, final float f5, final InterfaceC0821a interfaceC0821a, a0.q qVar, C0510p c0510p, final int i8, final int i9) {
        a0.q qVar2;
        int i10;
        long j7;
        final a0.q qVar3;
        kotlin.jvm.internal.l.f("onClick", interfaceC0821a);
        c0510p.T(-2065814048);
        int i11 = i8 | (c0510p.d(i7) ? 4 : 2) | (c0510p.g(z7) ? 32 : 16) | (c0510p.c(f5) ? 256 : 128) | (c0510p.h(interfaceC0821a) ? 2048 : 1024);
        int i12 = i9 & 16;
        if (i12 != 0) {
            i10 = i11 | 24576;
            qVar2 = qVar;
        } else {
            qVar2 = qVar;
            i10 = i11 | (c0510p.f(qVar2) ? 16384 : 8192);
        }
        if ((i10 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
            qVar3 = qVar2;
        } else {
            a0.q qVar4 = i12 != 0 ? a0.n.a : qVar2;
            if (z7) {
                c0510p.R(-972401520);
                j7 = ((L.N) c0510p.k(L.P.a)).f5244c;
                c0510p.p(false);
            } else {
                c0510p.R(-972399725);
                j7 = ((L.N) c0510p.k(L.P.a)).I;
                c0510p.p(false);
            }
            q2.b(interfaceC0821a, androidx.compose.foundation.layout.c.g(qVar4, 48, 0.0f, 2), false, C.e.b(10), ((C0998u) AbstractC1599K.a(j7, null, c0510p, 384, 10).getValue()).a, 0L, 0.0f, null, null, W.f.b(-2093751179, new e4.n() { // from class: s3.O
                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    FillElement fillElement;
                    long j8;
                    C0510p c0510p2 = (C0510p) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                        c0510p2.M();
                    } else {
                        a0.n nVar = a0.n.a;
                        FillElement fillElement2 = androidx.compose.foundation.layout.c.f10591c;
                        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
                        int i13 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                        a0.q qVarC = a0.a.c(c0510p2, fillElement2);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i = C2363j.f17871b;
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C2361h c2361h = C2363j.f17875f;
                        C0486d.R(c0510p2, c2361h, interfaceC2173HE);
                        C2361h c2361h2 = C2363j.f17874e;
                        C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
                        C2361h c2361h3 = C2363j.f17876g;
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i13))) {
                            AbstractC0703b.u(i13, c0510p2, i13, c2361h3);
                        }
                        C2361h c2361h4 = C2363j.f17873d;
                        C0486d.R(c0510p2, c2361h4, qVarC);
                        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                        float f7 = f5;
                        if (f7 <= 0.01f || f7 >= 0.99f) {
                            fillElement = fillElement2;
                            c0510p2.R(-1159322797);
                        } else {
                            c0510p2.R(-1156100874);
                            fillElement = fillElement2;
                            AbstractC2136o.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.c.c(androidx.compose.foundation.layout.c.d(bVar.a(nVar, a0.b.f10387q), 1.0f), f7), C0998u.b(0.22f, ((L.N) c0510p2.k(L.P.a)).a), AbstractC0968M.a), c0510p2, 0);
                        }
                        c0510p2.p(false);
                        a0.q qVarJ = androidx.compose.foundation.layout.a.j(fillElement, 6, 0.0f, 2);
                        f0 f0VarB = e0.b(AbstractC2130i.f16446d, a0.b.f10391u, c0510p2, 54);
                        int i14 = c0510p2.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                        a0.q qVarC2 = a0.a.c(c0510p2, qVarJ);
                        c0510p2.V();
                        if (c0510p2.f7127O) {
                            c0510p2.l(c2362i);
                        } else {
                            c0510p2.e0();
                        }
                        C0486d.R(c0510p2, c2361h, f0VarB);
                        C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
                        if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i14))) {
                            AbstractC0703b.u(i14, c0510p2, i14, c2361h3);
                        }
                        C0486d.R(c0510p2, c2361h4, qVarC2);
                        boolean z8 = z7;
                        if (!z8 || f7 < 0.99f) {
                            c0510p2.R(-1507441545);
                        } else {
                            c0510p2.R(-1503632699);
                            AbstractC0384j0.a(P3.r.A(), null, androidx.compose.foundation.layout.c.j(nVar, 12), ((L.N) c0510p2.k(L.P.a)).a, c0510p2, 432, 0);
                            AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(3));
                        }
                        c0510p2.p(false);
                        String strValueOf = String.valueOf(i7);
                        H0.I i15 = ((M2) c0510p2.k(N2.a)).f5221m;
                        M0.u uVar = M0.u.f6416p;
                        if (z8) {
                            c0510p2.R(1752630834);
                            j8 = ((L.N) c0510p2.k(L.P.a)).a;
                            c0510p2.p(false);
                        } else {
                            c0510p2.R(1752632724);
                            j8 = ((L.N) c0510p2.k(L.P.a)).f5258q;
                            c0510p2.p(false);
                        }
                        H2.b(strValueOf, null, j8, 0L, uVar, 0L, new S0.i(3), 0L, 0, false, 0, 0, i15, c0510p2, 196608, 0, 64986);
                        c0510p2.p(true);
                        c0510p2.p(true);
                    }
                    return O3.C.a;
                }
            }, c0510p), c0510p, (i10 >> 9) & 14, 996);
            qVar3 = qVar4;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new e4.n(i7, z7, f5, interfaceC0821a, qVar3, i8, i9) { // from class: s3.P

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f15615k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ boolean f15616l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ float f15617m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ InterfaceC0821a f15618n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ a0.q f15619o;

                /* renamed from: p, reason: collision with root package name */
                public final /* synthetic */ int f15620p;

                {
                    this.f15620p = i9;
                }

                @Override // e4.n
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iV = C0486d.V(1);
                    a0.q qVar5 = this.f15619o;
                    int i13 = this.f15620p;
                    AbstractC1994a.h(this.f15615k, this.f15616l, this.f15617m, this.f15618n, qVar5, (C0510p) obj, iV, i13);
                    return O3.C.a;
                }
            };
        }
    }

    public static final void i(final String str, final InterfaceC0821a interfaceC0821a, final e4.k kVar, C0510p c0510p, int i7) {
        Object c1988e;
        Context context;
        Object obj;
        Z z7;
        int i8;
        Object obj2;
        M5.c cVar;
        String str2;
        String str3;
        Z z8;
        Z z9;
        Z z10;
        Z z11;
        Z z12;
        Object next;
        Z z13;
        O.T t7;
        List list;
        Z z14;
        Z z15;
        Z z16;
        Z z17;
        Z z18;
        String str4;
        Z z19;
        InterfaceC0821a interfaceC0821a2;
        O.T t8;
        Z z20;
        Context context2;
        String str5;
        Object obj3;
        List<EpisodeRef> episodes;
        boolean z21;
        ExoPlayer exoPlayer;
        P3.A a7;
        EpisodeRef episodeRef;
        Z z22;
        Z z23;
        Z z24;
        Z z25;
        List list2;
        EpisodeRef episodeRef2;
        Z z26;
        Z z27;
        Z z28;
        Z z29;
        String str6;
        Z z30;
        Z z31;
        String str7;
        String str8;
        Z z32;
        UserRepo userRepo;
        Context context3;
        Z z33;
        Z z34;
        final List list3;
        final Z z35;
        Z z36;
        UserRepo userRepo2;
        Z z37;
        Z z38;
        C0510p c0510p2;
        String str9;
        Context context4;
        e4.k kVar2;
        int i9;
        Z z39;
        M5.c cVar2;
        Z z40;
        InterfaceC0821a interfaceC0821a3;
        boolean z41;
        Activity activity;
        int i10;
        Activity activity2;
        final List list4;
        Z z42;
        final String str10;
        final ExoPlayer exoPlayer2;
        boolean z43;
        boolean z44;
        C0510p c0510p3;
        M5.c cVar3;
        String str11;
        Z z45;
        c0510p.T(-588215686);
        int i11 = (i7 & 6) == 0 ? (c0510p.f(str) ? 4 : 2) | i7 : i7;
        if ((i7 & 48) == 0) {
            i11 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i11 |= c0510p.h(kVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            Object obj4 = C0502l.a;
            Context context5 = (Context) c0510p.k(AndroidCompositionLocals_androidKt.f10669b);
            Object objH = c0510p.H();
            if (objH == obj4) {
                Object c0524x = new C0524x(C0486d.y(c0510p));
                c0510p.b0(c0524x);
                objH = c0524x;
            }
            M5.c cVar4 = ((C0524x) objH).f7242k;
            boolean zH = c0510p.h(context5);
            Object objH2 = c0510p.H();
            if (zH || objH2 == obj4) {
                objH2 = new A3.d(25, context5);
                c0510p.b0(objH2);
            }
            e4.k kVar3 = (e4.k) objH2;
            W wA = AbstractC2208a.a(c0510p);
            if (wA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            C1853d c1853d = (C1853d) AbstractC0871d.v0(kotlin.jvm.internal.y.a.b(C1853d.class), wA, wA instanceof InterfaceC0684k ? ((InterfaceC0684k) wA).d() : C2147a.f16519b, c0510p);
            int i12 = i11 & 14;
            boolean z46 = i12 == 4;
            Object objH3 = c0510p.H();
            Object obj5 = P3.y.f7779k;
            O.T t9 = O.T.f7049p;
            if (z46 || objH3 == obj4) {
                objH3 = C0486d.K(obj5, t9);
                c0510p.b0(objH3);
            }
            Z z47 = (Z) objH3;
            boolean z48 = i12 == 4;
            Object objH4 = c0510p.H();
            if (z48 || objH4 == obj4) {
                objH4 = C0486d.K("", t9);
                c0510p.b0(objH4);
            }
            Z z49 = (Z) objH4;
            int i13 = i11;
            boolean z50 = i12 == 4;
            Object objH5 = c0510p.H();
            if (z50 || objH5 == obj4) {
                objH5 = C0486d.K(null, t9);
                c0510p.b0(objH5);
            }
            Z z51 = (Z) objH5;
            boolean z52 = i12 == 4;
            Object objH6 = c0510p.H();
            if (z52 || objH6 == obj4) {
                objH6 = C0486d.K(Boolean.FALSE, t9);
                c0510p.b0(objH6);
            }
            Z z53 = (Z) objH6;
            boolean zH2 = (i12 == 4) | c0510p.h(context5) | c0510p.f(z47) | c0510p.f(z49) | c0510p.f(z51) | c0510p.f(z53);
            Object objH7 = c0510p.H();
            if (zH2 || objH7 == obj4) {
                context = context5;
                obj = obj5;
                z7 = z47;
                i8 = i13;
                obj2 = obj4;
                cVar = cVar4;
                str2 = "";
                str3 = str;
                c1988e = new C1988E(context, str3, z7, z49, z51, z53, null);
                z8 = z49;
                z9 = z53;
                z10 = z51;
                c0510p.b0(c1988e);
            } else {
                str3 = str;
                obj = obj5;
                z7 = z47;
                i8 = i13;
                cVar = cVar4;
                obj2 = obj4;
                z9 = z53;
                context = context5;
                z10 = z51;
                c1988e = objH7;
                z8 = z49;
                str2 = "";
            }
            C0486d.e(c0510p, (e4.n) c1988e, str3);
            boolean zF = c0510p.f((List) z7.getValue());
            Object objH8 = c0510p.H();
            if (zF || objH8 == obj2) {
                List list5 = (List) z7.getValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    Object next2 = it2.next();
                    String resolution = ((StreamItem) next2).getResolution();
                    if (AbstractC2510o.g0(resolution)) {
                        resolution = "unknown";
                    }
                    Z z54 = z9;
                    String str12 = resolution;
                    Object obj6 = linkedHashMap.get(str12);
                    if (obj6 == null) {
                        z13 = z10;
                        ArrayList arrayList = new ArrayList();
                        linkedHashMap.put(str12, arrayList);
                        obj6 = arrayList;
                    } else {
                        z13 = z10;
                    }
                    ((List) obj6).add(next2);
                    it = it2;
                    z9 = z54;
                    z10 = z13;
                }
                z11 = z9;
                z12 = z10;
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    List list6 = (List) ((Map.Entry) it3.next()).getValue();
                    Iterator it4 = list6.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next = it4.next();
                            if (((StreamItem) next).is_raw()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    StreamItem streamItem = (StreamItem) next;
                    if (streamItem == null) {
                        streamItem = (StreamItem) P3.q.r0(list6);
                    }
                    arrayList2.add(streamItem);
                }
                objH8 = P3.q.O0(arrayList2, new G3.q(3));
                c0510p.b0(objH8);
            } else {
                z11 = z9;
                z12 = z10;
            }
            List list7 = (List) objH8;
            boolean z55 = i12 == 4;
            Object objH9 = c0510p.H();
            if (z55 || objH9 == obj2) {
                objH9 = C0486d.K(P3.q.t0(list7), t9);
                c0510p.b0(objH9);
            }
            Z z56 = (Z) objH9;
            boolean z57 = i12 == 4;
            Object objH10 = c0510p.H();
            if (z57 || objH10 == obj2) {
                objH10 = C0486d.K(null, t9);
                c0510p.b0(objH10);
            }
            Z z58 = (Z) objH10;
            boolean z59 = i12 == 4;
            Object objH11 = c0510p.H();
            P3.A a8 = P3.A.f7737k;
            if (z59 || objH11 == obj2) {
                objH11 = C0486d.K(a8, t9);
                c0510p.b0(objH11);
            }
            Z z60 = (Z) objH11;
            boolean z61 = i12 == 4;
            Object objH12 = c0510p.H();
            if (z61 || objH12 == obj2) {
                objH12 = C0486d.K(Boolean.FALSE, t9);
                c0510p.b0(objH12);
            }
            Z z62 = (Z) objH12;
            Z z63 = z8;
            boolean z64 = i12 == 4;
            Object objH13 = c0510p.H();
            if (z64 || objH13 == obj2) {
                objH13 = C0486d.K(Boolean.FALSE, t9);
                c0510p.b0(objH13);
            }
            Z z65 = (Z) objH13;
            Object objH14 = c0510p.H();
            if (objH14 == obj2) {
                objH14 = PlaybackPrefs.INSTANCE.quality(context);
                c0510p.b0(objH14);
            }
            String str13 = (String) objH14;
            M5.c cVar5 = cVar;
            List list8 = (List) z7.getValue();
            boolean zF2 = c0510p.f(z56) | c0510p.h(list7);
            Object objH15 = c0510p.H();
            if (zF2 || objH15 == obj2) {
                t7 = t9;
                objH15 = new C1989F(list7, z56, str13, null);
                c0510p.b0(objH15);
            } else {
                t7 = t9;
            }
            C0486d.f(list8, str13, (e4.n) objH15, c0510p);
            boolean zF3 = c0510p.f(z56) | c0510p.f(z62) | c0510p.f(z7) | c0510p.f(z60) | c0510p.h(list7) | c0510p.f(z65);
            Object objH16 = c0510p.H();
            if (zF3 || objH16 == obj2) {
                Z z66 = z7;
                objH16 = new B3.n(list7, z56, z62, z66, z60, z65);
                list = list7;
                z14 = z56;
                z15 = z66;
                z16 = z60;
                z17 = z65;
                c0510p.b0(objH16);
            } else {
                z16 = z60;
                z14 = z56;
                list = list7;
                z17 = z65;
                z15 = z7;
            }
            InterfaceC0821a interfaceC0821a4 = (InterfaceC0821a) objH16;
            StreamItem streamItem2 = (StreamItem) z14.getValue();
            String url = streamItem2 != null ? streamItem2.getUrl() : null;
            boolean zF4 = c0510p.f(z14) | c0510p.f(z17) | c0510p.f(z62);
            Object objH17 = c0510p.H();
            if (zF4 || objH17 == obj2) {
                objH17 = new C1990G(z14, z17, z62, null);
                c0510p.b0(objH17);
            }
            C0486d.e(c0510p, (e4.n) objH17, url);
            boolean z67 = i12 == 4;
            Object objH18 = c0510p.H();
            if (z67 || objH18 == obj2) {
                C2508m c2508m = y3.C.a;
                kotlin.jvm.internal.l.f("ctx", context);
                z18 = z17;
                str4 = "ctx";
                C0230k.a(CIOKt.DEFAULT_HTTP_POOL_SIZE, 0, "bufferForPlaybackMs", "0");
                z19 = z62;
                C0230k.a(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
                interfaceC0821a2 = interfaceC0821a4;
                C0230k.a(2000, CIOKt.DEFAULT_HTTP_POOL_SIZE, "minBufferMs", "bufferForPlaybackMs");
                C0230k.a(2000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
                C0230k.a(45000, 2000, "maxBufferMs", "minBufferMs");
                C0230k.a(30000, 0, "backBufferDurationMs", "0");
                C0230k c0230k = new C0230k(new R1.f(), 2000, 45000, true, 30000);
                H1.r rVar = new H1.r(context);
                AbstractC0015b.h(!rVar.f3577u);
                rVar.f3562f = new C0235p(0, c0230k);
                AbstractC0015b.h(!rVar.f3577u);
                rVar.f3577u = true;
                objH18 = new H1.G(rVar);
                c0510p.b0(objH18);
            } else {
                z18 = z17;
                str4 = "ctx";
                z19 = z62;
                interfaceC0821a2 = interfaceC0821a4;
            }
            ExoPlayer exoPlayer3 = (ExoPlayer) objH18;
            boolean zH3 = c0510p.h(exoPlayer3);
            Object objH19 = c0510p.H();
            if (zH3 || objH19 == obj2) {
                objH19 = new C2002i(exoPlayer3, 0);
                c0510p.b0(objH19);
            }
            C0486d.c(exoPlayer3, (e4.k) objH19, c0510p);
            Object objH20 = c0510p.H();
            if (objH20 == obj2) {
                objH20 = Integer.valueOf(PlaybackPrefs.INSTANCE.introSec(context));
                c0510p.b0(objH20);
            }
            int iIntValue = ((Number) objH20).intValue();
            Object objH21 = c0510p.H();
            if (objH21 == obj2) {
                objH21 = Integer.valueOf(PlaybackPrefs.INSTANCE.outroSec(context));
                c0510p.b0(objH21);
            }
            int iIntValue2 = ((Number) objH21).intValue();
            Object objH22 = c0510p.H();
            if (objH22 == obj2) {
                objH22 = Boolean.valueOf(PlaybackPrefs.INSTANCE.showInfoOverlay(context));
                c0510p.b0(objH22);
            }
            boolean zBooleanValue = ((Boolean) objH22).booleanValue();
            Object objH23 = c0510p.H();
            if (objH23 == obj2) {
                objH23 = Boolean.valueOf(PlaybackPrefs.INSTANCE.autoplay(context));
                c0510p.b0(objH23);
            }
            final boolean zBooleanValue2 = ((Boolean) objH23).booleanValue();
            boolean z68 = i12 == 4;
            Object objH24 = c0510p.H();
            if (z68 || objH24 == obj2) {
                C2508m c2508m2 = y3.C.a;
                Pattern patternCompile = Pattern.compile("-episode-\\d+$");
                kotlin.jvm.internal.l.e("compile(...)", patternCompile);
                objH24 = patternCompile.matcher(str3).replaceAll(str2);
                kotlin.jvm.internal.l.e("replaceAll(...)", objH24);
                c0510p.b0(objH24);
            }
            String str14 = (String) objH24;
            boolean zF5 = c0510p.f(str14);
            Object objH25 = c0510p.H();
            if (zF5 || objH25 == obj2) {
                t8 = t7;
                objH25 = C0486d.K(null, t8);
                c0510p.b0(objH25);
            } else {
                t8 = t7;
            }
            Z z69 = (Z) objH25;
            boolean zF6 = c0510p.f(z69) | c0510p.h(context) | c0510p.f(str14) | (i12 == 4);
            Object objH26 = c0510p.H();
            if (zF6 || objH26 == obj2) {
                String str15 = str3;
                Object c1991h = new C1991H(context, str14, str15, z69, null);
                str14 = str14;
                str3 = str15;
                c0510p.b0(c1991h);
                objH26 = c1991h;
            }
            C0486d.f(str14, str3, (e4.n) objH26, c0510p);
            boolean z70 = i12 == 4;
            Object objH27 = c0510p.H();
            if (z70 || objH27 == obj2) {
                objH27 = C0486d.K(Boolean.FALSE, t8);
                c0510p.b0(objH27);
            }
            Z z71 = (Z) objH27;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) z71.getValue()).booleanValue());
            boolean zF7 = c0510p.f(z71);
            Object objH28 = c0510p.H();
            if (zF7 || objH28 == obj2) {
                objH28 = new C1992I(z71, null);
                c0510p.b0(objH28);
            }
            C0486d.e(c0510p, (e4.n) objH28, boolValueOf);
            O3.C c2 = O3.C.a;
            Object objH29 = c0510p.H();
            if (objH29 == obj2) {
                objH29 = new io.ktor.network.sockets.b(27);
                c0510p.b0(objH29);
            }
            C0486d.c(c2, (e4.k) objH29, c0510p);
            boolean z72 = i12 == 4;
            Object objH30 = c0510p.H();
            if (z72 || objH30 == obj2) {
                objH30 = C0486d.K(null, t8);
                c0510p.b0(objH30);
            }
            Z z73 = (Z) objH30;
            boolean zF8 = c0510p.f(z73) | c0510p.h(context) | c0510p.f(str14);
            Object objH31 = c0510p.H();
            if (zF8 || objH31 == obj2) {
                objH31 = new y(context, str14, z73, null);
                c0510p.b0(objH31);
            }
            C0486d.e(c0510p, (e4.n) objH31, str3);
            boolean zF9 = c0510p.f((AnimeDetail) z73.getValue());
            Object objH32 = c0510p.H();
            if (zF9 || objH32 == obj2) {
                AnimeDetail animeDetail = (AnimeDetail) z73.getValue();
                if (animeDetail == null || (episodes = animeDetail.getEpisodes()) == null) {
                    z20 = z71;
                    context2 = context;
                    str5 = str14;
                    obj3 = obj;
                } else {
                    HashSet hashSet = new HashSet();
                    z20 = z71;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj7 : episodes) {
                        Context context6 = context;
                        EpisodeRef episodeRef3 = (EpisodeRef) obj7;
                        String slug = episodeRef3.getSlug();
                        if (AbstractC2510o.g0(slug)) {
                            slug = String.valueOf(episodeRef3.getN());
                        }
                        String str16 = str14;
                        if (hashSet.add(slug)) {
                            arrayList3.add(obj7);
                        }
                        context = context6;
                        str14 = str16;
                    }
                    context2 = context;
                    str5 = str14;
                    obj3 = arrayList3;
                }
                c0510p.b0(obj3);
                objH32 = obj3;
            } else {
                z20 = z71;
                context2 = context;
                str5 = str14;
            }
            List list9 = (List) objH32;
            boolean zF10 = c0510p.f(list9) | (i12 == 4);
            Object objH33 = c0510p.H();
            if (zF10 || objH33 == obj2) {
                Iterator it5 = list9.iterator();
                int i14 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (kotlin.jvm.internal.l.a(((EpisodeRef) it5.next()).getSlug(), str3)) {
                        break;
                    } else {
                        i14++;
                    }
                }
                Object objValueOf = Integer.valueOf(i14);
                if (i14 < 0) {
                    objValueOf = null;
                }
                c0510p.b0(objValueOf);
                objH33 = objValueOf;
            }
            Integer num = (Integer) objH33;
            boolean zF11 = c0510p.f(list9) | c0510p.f(num);
            Object objH34 = c0510p.H();
            if (zF11 || objH34 == obj2) {
                Object obj8 = (num == null || num.intValue() <= 0) ? null : (EpisodeRef) list9.get(num.intValue() - 1);
                c0510p.b0(obj8);
                objH34 = obj8;
            }
            EpisodeRef episodeRef4 = (EpisodeRef) objH34;
            boolean zF12 = c0510p.f(list9) | c0510p.f(num);
            Object objH35 = c0510p.H();
            if (zF12 || objH35 == obj2) {
                if (num != null) {
                    z21 = true;
                    Object obj9 = num.intValue() < list9.size() + (-1) ? (EpisodeRef) list9.get(num.intValue() + 1) : null;
                    c0510p.b0(obj9);
                    objH35 = obj9;
                } else {
                    z21 = true;
                }
                c0510p.b0(obj9);
                objH35 = obj9;
            } else {
                z21 = true;
            }
            EpisodeRef episodeRef5 = (EpisodeRef) objH35;
            boolean z74 = i12 == 4 ? z21 : false;
            Object objH36 = c0510p.H();
            if (z74 || objH36 == obj2) {
                objH36 = C0486d.K(Boolean.FALSE, t8);
                c0510p.b0(objH36);
            }
            Z z75 = (Z) objH36;
            boolean zF13 = c0510p.f(z75);
            Object objH37 = c0510p.H();
            if (zF13 || objH37 == obj2) {
                objH37 = new z(z75, null);
                c0510p.b0(objH37);
            }
            C0486d.e(c0510p, (e4.n) objH37, str3);
            boolean z76 = i12 == 4 ? z21 : false;
            Object objH38 = c0510p.H();
            if (z76 || objH38 == obj2) {
                objH38 = C0486d.K(0, t8);
                c0510p.b0(objH38);
            }
            Z z77 = (Z) objH38;
            boolean z78 = i12 == 4 ? z21 : false;
            Object objH39 = c0510p.H();
            if (z78 || objH39 == obj2) {
                objH39 = C0486d.K(0, t8);
                c0510p.b0(objH39);
            }
            Z z79 = (Z) objH39;
            boolean z80 = i12 == 4 ? z21 : false;
            Object objH40 = c0510p.H();
            if (z80 || objH40 == obj2) {
                objH40 = C0486d.K(0, t8);
                c0510p.b0(objH40);
            }
            Z z81 = (Z) objH40;
            UserRepo userRepo3 = c1853d.f14730b;
            boolean zF14 = c0510p.f(userRepo3) | (i12 == 4 ? z21 : false) | c0510p.f(z77) | c0510p.f(z79) | c0510p.f(z81);
            Object objH41 = c0510p.H();
            if (zF14 || objH41 == obj2) {
                exoPlayer = exoPlayer3;
                a7 = a8;
                episodeRef = episodeRef5;
                z22 = z75;
                z23 = z73;
                z24 = z69;
                z25 = z19;
                list2 = list9;
                episodeRef2 = episodeRef4;
                z26 = z11;
                z27 = z12;
                z28 = z58;
                z29 = z79;
                str6 = str;
                z30 = z81;
                z31 = z16;
                str7 = str4;
                str8 = str5;
                z32 = z18;
                userRepo = userRepo3;
                context3 = context2;
                objH41 = new C1984A(userRepo, str6, z77, z29, z30, null);
                z33 = z77;
                c0510p.b0(objH41);
            } else {
                exoPlayer = exoPlayer3;
                a7 = a8;
                str6 = str;
                z22 = z75;
                z23 = z73;
                episodeRef = episodeRef5;
                z24 = z69;
                z25 = z19;
                list2 = list9;
                episodeRef2 = episodeRef4;
                z26 = z11;
                z27 = z12;
                z28 = z58;
                z29 = z79;
                z33 = z77;
                z31 = z16;
                str7 = str4;
                str8 = str5;
                z32 = z18;
                z30 = z81;
                context3 = context2;
                userRepo = userRepo3;
            }
            C0486d.e(c0510p, (e4.n) objH41, str6);
            boolean zF15 = c0510p.f((String) z63.getValue());
            Object objH42 = c0510p.H();
            if (zF15 || objH42 == obj2) {
                objH42 = AbstractC2510o.p0(AbstractC2510o.p0((String) z63.getValue(), " Subtitle Indonesia"), " - AnimeSail");
                c0510p.b0(objH42);
            }
            String str17 = (String) objH42;
            boolean z82 = i12 == 4 ? z21 : false;
            Object objH43 = c0510p.H();
            if (z82 || objH43 == obj2) {
                objH43 = C0486d.K(0L, t8);
                c0510p.b0(objH43);
            }
            Z z83 = (Z) objH43;
            boolean zF16 = c0510p.f(userRepo) | (i12 == 4 ? z21 : false) | c0510p.f(z83);
            Object objH44 = c0510p.H();
            if (zF16 || objH44 == obj2) {
                z34 = z30;
                objH44 = new C1985B(userRepo, str6, z83, null);
                c0510p.b0(objH44);
            } else {
                z34 = z30;
            }
            C0486d.e(c0510p, (e4.n) objH44, str6);
            boolean z84 = i12 == 4 ? z21 : false;
            Object objH45 = c0510p.H();
            if (z84 || objH45 == obj2) {
                objH45 = C0486d.K(a7, t8);
                c0510p.b0(objH45);
            }
            final Z z85 = (Z) objH45;
            boolean z86 = i12 == 4 ? z21 : false;
            Object objH46 = c0510p.H();
            if (z86 || objH46 == obj2) {
                objH46 = C0486d.K(Boolean.FALSE, t8);
                c0510p.b0(objH46);
            }
            final Z z87 = (Z) objH46;
            boolean zF17 = c0510p.f(z14) | c0510p.f(z87) | c0510p.f(z85) | c0510p.f(z15) | c0510p.h(list);
            Object objH47 = c0510p.H();
            if (zF17 || objH47 == obj2) {
                final Z z88 = z15;
                list3 = list;
                z35 = z14;
                objH47 = new InterfaceC0821a() { // from class: s3.j
                    @Override // e4.InterfaceC0821a
                    public final Object invoke() {
                        Object obj10;
                        Object next3;
                        Z z89 = z35;
                        StreamItem streamItem3 = (StreamItem) z89.getValue();
                        Z z90 = z87;
                        if (streamItem3 == null) {
                            z90.setValue(Boolean.TRUE);
                        } else {
                            Z z91 = z85;
                            LinkedHashSet linkedHashSetU = P3.J.U((Set) z91.getValue(), streamItem3.getUrl());
                            z91.setValue(linkedHashSetU);
                            List list10 = (List) z88.getValue();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj11 : list10) {
                                StreamItem streamItem4 = (StreamItem) obj11;
                                if (kotlin.jvm.internal.l.a(streamItem4.getResolution(), streamItem3.getResolution()) && !linkedHashSetU.contains(streamItem4.getUrl())) {
                                    arrayList4.add(obj11);
                                }
                            }
                            Iterator it6 = arrayList4.iterator();
                            while (true) {
                                obj10 = null;
                                if (!it6.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it6.next();
                                if (((StreamItem) next3).is_raw()) {
                                    break;
                                }
                            }
                            StreamItem streamItem5 = (StreamItem) next3;
                            if (streamItem5 == null && (streamItem5 = (StreamItem) P3.q.t0(arrayList4)) == null) {
                                Iterator it7 = list3.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        break;
                                    }
                                    Object next4 = it7.next();
                                    if (!linkedHashSetU.contains(((StreamItem) next4).getUrl())) {
                                        obj10 = next4;
                                        break;
                                    }
                                }
                                streamItem5 = (StreamItem) obj10;
                            }
                            if (streamItem5 != null) {
                                z89.setValue(streamItem5);
                            } else {
                                z90.setValue(Boolean.TRUE);
                            }
                        }
                        return O3.C.a;
                    }
                };
                z36 = z88;
                c0510p.b0(objH47);
            } else {
                list3 = list;
                z35 = z14;
                z36 = z15;
            }
            InterfaceC0821a interfaceC0821a5 = (InterfaceC0821a) objH47;
            if (((StreamItem) z35.getValue()) != null) {
                c0510p.R(-53062312);
                StreamItem streamItem3 = (StreamItem) z35.getValue();
                kotlin.jvm.internal.l.c(streamItem3);
                String url2 = streamItem3.getUrl();
                StreamItem streamItem4 = (StreamItem) z35.getValue();
                kotlin.jvm.internal.l.c(streamItem4);
                Map<String, String> headers = streamItem4.getHeaders();
                long jLongValue = ((Number) z83.getValue()).longValue();
                boolean zH4 = c0510p.h(cVar5) | c0510p.f(userRepo) | c0510p.f(str8) | (i12 == 4 ? z21 : false);
                Object objH48 = c0510p.H();
                if (zH4 || objH48 == obj2) {
                    cVar3 = cVar5;
                    str11 = str8;
                    z40 = z34;
                    activity = null;
                    z45 = z29;
                    String str18 = str6;
                    UserRepo userRepo4 = userRepo;
                    Object hVar = new B3.h(cVar3, userRepo4, str11, str18, 2);
                    userRepo = userRepo4;
                    c0510p.b0(hVar);
                    objH48 = hVar;
                } else {
                    cVar3 = cVar5;
                    str11 = str8;
                    z40 = z34;
                    activity = null;
                    z45 = z29;
                }
                userRepo2 = userRepo;
                str9 = str11;
                z38 = z33;
                z37 = z45;
                context4 = context3;
                kVar2 = kVar3;
                i9 = i8;
                z39 = z63;
                cVar2 = cVar3;
                interfaceC0821a3 = interfaceC0821a2;
                i10 = -94851800;
                y3.C.a(exoPlayer, context4, url2, headers, jLongValue, iIntValue, iIntValue2, (e4.n) objH48, interfaceC0821a5, c0510p, 1769472);
                c0510p2 = c0510p;
                z41 = false;
            } else {
                userRepo2 = userRepo;
                z37 = z29;
                z38 = z33;
                c0510p2 = c0510p;
                str9 = str8;
                context4 = context3;
                kVar2 = kVar3;
                i9 = i8;
                z39 = z63;
                cVar2 = cVar5;
                z40 = z34;
                interfaceC0821a3 = interfaceC0821a2;
                z41 = false;
                activity = null;
                i10 = -94851800;
                c0510p2.R(-94851800);
            }
            c0510p2.p(z41);
            C2508m c2508m3 = y3.C.a;
            kotlin.jvm.internal.l.f(str7, context4);
            Context baseContext = context4;
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity2 = activity;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        activity2 = (Activity) baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            Boolean bool = (Boolean) z20.getValue();
            bool.getClass();
            final Z z89 = z20;
            boolean zH5 = c0510p2.h(activity2) | c0510p2.f(z89);
            Object objH49 = c0510p2.H();
            if (zH5 || objH49 == obj2) {
                objH49 = new C1638e(activity2, z89, 1);
                c0510p2.b0(objH49);
            }
            C0486d.c(bool, (e4.k) objH49, c0510p2);
            StreamItem streamItem5 = (StreamItem) z35.getValue();
            if (!((Boolean) z89.getValue()).booleanValue() || streamItem5 == null) {
                list4 = list3;
                z42 = z35;
                str10 = str17;
                exoPlayer2 = exoPlayer;
                z43 = zBooleanValue;
                z44 = false;
                c0510p2.R(i10);
            } else {
                c0510p2.R(-51658632);
                if (streamItem5.is_raw()) {
                    c0510p2.R(-51647751);
                    boolean zF18 = c0510p2.f(z89);
                    Object objH50 = c0510p2.H();
                    if (zF18 || objH50 == obj2) {
                        objH50 = new B3.i(16, z89);
                        c0510p2.b0(objH50);
                    }
                    str10 = str17;
                    List list10 = list3;
                    Z z90 = z35;
                    z43 = zBooleanValue;
                    exoPlayer2 = exoPlayer;
                    list4 = list10;
                    z42 = z90;
                    AbstractC2412a.a((InterfaceC0821a) objH50, W.f.b(-769701317, new C2000g(exoPlayer, streamItem5, str10, z43, z89, list10, z90), c0510p2), c0510p2, 48);
                    c0510p2.p(false);
                    z44 = false;
                } else {
                    list4 = list3;
                    z42 = z35;
                    str10 = str17;
                    exoPlayer2 = exoPlayer;
                    z43 = zBooleanValue;
                    c0510p2.R(-51024558);
                    boolean zF19 = c0510p2.f(z89);
                    Object objH51 = c0510p2.H();
                    if (zF19 || objH51 == obj2) {
                        objH51 = new B3.i(15, z89);
                        c0510p2.b0(objH51);
                    }
                    AbstractC2412a.a((InterfaceC0821a) objH51, W.f.b(-677998574, new A3.h(5, streamItem5, z89), c0510p2), c0510p2, 48);
                    z44 = false;
                    c0510p2.p(false);
                }
            }
            c0510p2.p(z44);
            FillElement fillElement = androidx.compose.foundation.layout.c.f10591c;
            v.Z zC = androidx.compose.foundation.layout.a.c(24);
            final Z z91 = z28;
            final Z z92 = z32;
            final Z z93 = z31;
            final Z z94 = z24;
            boolean zF20 = c0510p2.f(z42) | c0510p2.f(z91) | c0510p2.f(z92) | c0510p2.f(z93) | c0510p2.h(list4) | c0510p2.f(z89) | c0510p2.h(exoPlayer2) | c0510p2.f(str10) | c0510p2.f(z94);
            final Z z95 = z42;
            int i15 = i9;
            final InterfaceC0821a interfaceC0821a6 = interfaceC0821a3;
            boolean zF21 = ((i15 & 896) == 256) | zF20 | c0510p2.f(interfaceC0821a6);
            final Z z96 = z25;
            boolean zF22 = zF21 | c0510p2.f(z96) | c0510p2.f(z27);
            final M5.c cVar6 = cVar2;
            boolean zH6 = zF22 | c0510p2.h(cVar6) | c0510p2.h(context4);
            final Context context7 = context4;
            boolean z97 = i12 == 4;
            final Z z98 = z39;
            boolean zF23 = zH6 | z97 | c0510p2.f(z36) | c0510p2.f(z98);
            final Z z99 = z26;
            boolean zF24 = zF23 | c0510p2.f(z99);
            final EpisodeRef episodeRef6 = episodeRef2;
            boolean zF25 = zF24 | c0510p2.f(episodeRef6) | c0510p2.f(episodeRef);
            final List list11 = list2;
            boolean zH7 = zF25 | c0510p2.h(list11) | c0510p2.f(z23) | c0510p2.f(z40) | c0510p2.f(z38) | c0510p2.f(z37) | c0510p2.f(z22);
            boolean z100 = (i15 & 112) == 32;
            final e4.k kVar4 = kVar2;
            final UserRepo userRepo5 = userRepo2;
            boolean zF26 = zH7 | z100 | c0510p2.f(kVar4) | c0510p2.f(userRepo5);
            final String str19 = str9;
            boolean zF27 = zF26 | c0510p2.f(str19);
            Object objH52 = c0510p.H();
            if (zF27 || objH52 == obj2) {
                final Z z101 = z37;
                final Z z102 = z27;
                final Z z103 = z23;
                final EpisodeRef episodeRef7 = episodeRef;
                final Z z104 = z22;
                final Z z105 = z40;
                final Z z106 = z38;
                final Z z107 = z36;
                final boolean z108 = z43;
                objH52 = new e4.k() { // from class: s3.h
                    @Override // e4.k
                    public final Object invoke(Object obj10) {
                        C2165f c2165f = (C2165f) obj10;
                        kotlin.jvm.internal.l.f("$this$LazyColumn", c2165f);
                        final Z z109 = z95;
                        final Z z110 = z89;
                        final Context context8 = context7;
                        final String str20 = str;
                        final Z z111 = z107;
                        final Z z112 = z98;
                        final Z z113 = z99;
                        final Z z114 = z91;
                        final Z z115 = z92;
                        final Z z116 = z93;
                        final List list12 = list4;
                        final ExoPlayer exoPlayer4 = exoPlayer2;
                        final String str21 = str10;
                        final boolean z117 = z108;
                        final Z z118 = z94;
                        final e4.k kVar5 = kVar;
                        final boolean z119 = zBooleanValue2;
                        final InterfaceC0821a interfaceC0821a7 = interfaceC0821a6;
                        final Z z120 = z96;
                        final Z z121 = z102;
                        final H5.A a9 = cVar6;
                        C2165f.w0(c2165f, new W.a(true, -575718810, new e4.o() { // from class: s3.l
                            /* JADX WARN: Removed duplicated region for block: B:102:0x03fc  */
                            /* JADX WARN: Removed duplicated region for block: B:105:0x0440  */
                            /* JADX WARN: Removed duplicated region for block: B:119:0x04c3  */
                            /* JADX WARN: Removed duplicated region for block: B:88:0x03a3  */
                            /* JADX WARN: Removed duplicated region for block: B:92:0x03bb  */
                            /* JADX WARN: Removed duplicated region for block: B:98:0x03de  */
                            @Override // e4.o
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r54, java.lang.Object r55, java.lang.Object r56) {
                                /*
                                    Method dump skipped, instructions count: 2132
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: s3.C2005l.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }));
                        EpisodeRef episodeRef8 = episodeRef6;
                        EpisodeRef episodeRef9 = episodeRef7;
                        if (episodeRef8 != null || episodeRef9 != null) {
                            C2165f.w0(c2165f, new W.a(true, 1129632363, new C0027c(episodeRef8, kVar5, episodeRef9, 6)));
                        }
                        final Z z122 = z103;
                        final List list13 = list11;
                        final Z z123 = z104;
                        final InterfaceC0821a interfaceC0821a8 = interfaceC0821a;
                        final Z z124 = z105;
                        final Z z125 = z106;
                        final Z z126 = z101;
                        final e4.k kVar6 = kVar4;
                        final UserRepo userRepo6 = userRepo5;
                        C2165f.w0(c2165f, new W.a(true, -992796657, new e4.o() { // from class: s3.m
                            /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
                            /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
                            /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
                            /* JADX WARN: Removed duplicated region for block: B:46:0x0155  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x0170  */
                            /* JADX WARN: Removed duplicated region for block: B:54:0x0180  */
                            /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
                            /* JADX WARN: Removed duplicated region for block: B:58:0x01ac  */
                            /* JADX WARN: Removed duplicated region for block: B:91:0x037c  */
                            @Override // e4.o
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
                                /*
                                    Method dump skipped, instructions count: 901
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: s3.C2006m.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }));
                        if (!list13.isEmpty()) {
                            C2165f.w0(c2165f, new W.a(true, 1467140820, new A3.g(5, list13)));
                            C2165f.w0(c2165f, new W.a(true, 1265007357, new C0027c((Object) list13, (Object) str20, (Object) kVar5, 7)));
                        }
                        C2165f.w0(c2165f, new W.a(true, -1975790034, new B3.l(1, z109)));
                        C2165f.w0(c2165f, new W.a(true, 1336183885, new C0027c((Object) str19, (Object) str20, (O3.e) interfaceC0821a8, 8)));
                        return O3.C.a;
                    }
                };
                c0510p3 = c0510p;
                c0510p3.b0(objH52);
            } else {
                c0510p3 = c0510p;
            }
            AbstractC0847h.a(fillElement, null, zC, null, null, null, false, (e4.k) objH52, c0510p3, 390, 250);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new D3.b(str, interfaceC0821a, kVar, i7, 1);
        }
    }

    public static final void j(Z z7, boolean z8) {
        z7.setValue(Boolean.valueOf(z8));
    }

    public static final void k(AnimeDetail animeDetail, C0510p c0510p, int i7) {
        a0.n nVar;
        boolean z7;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-709496324);
        if ((((i7 & 6) == 0 ? i7 | ((i7 & 8) == 0 ? c0510p2.f(animeDetail) : c0510p2.h(animeDetail) ? 4 : 2) : i7) & 3) == 2 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.n nVar2 = a0.n.a;
            a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar2, 1.0f), 16, 0.0f, 2);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i8 = c0510p2.f7128P;
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
            C0486d.R(c0510p2, C2363j.f17875f, c2140tA);
            C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p2, i8, c2361h);
            }
            C0486d.R(c0510p2, C2363j.f17873d, qVarC);
            a0.n nVar3 = nVar2;
            H2.b("Informasi", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5216h, c0510p, 6, 0, 65534);
            c0510p2 = c0510p;
            AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar3, 10));
            boolean zF = c0510p2.f(animeDetail.getInfo());
            Object objH = c0510p2.H();
            if (zF || objH == C0502l.a) {
                Set<Map.Entry<String, String>> setEntrySet = animeDetail.getInfo().entrySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setEntrySet) {
                    String str = (String) ((Map.Entry) obj).getValue();
                    if ((AbstractC2510o.g0(str) || str.equals("?") || str.equals("-")) ? false : true) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(P3.r.p(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    arrayList2.add(new O3.l((String) entry.getKey(), (String) entry.getValue()));
                }
                c0510p2.b0(arrayList2);
                objH = arrayList2;
            }
            List<O3.l> list = (List) objH;
            if (list.isEmpty()) {
                c0510p2.R(1504731577);
                H2.b("Tidak ada informasi tambahan.", null, ((L.N) c0510p2.k(L.P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5220l, c0510p, 6, 0, 65530);
                c0510p2 = c0510p;
                c0510p2.p(false);
                nVar = nVar3;
                z7 = true;
            } else {
                c0510p2.R(1504961101);
                for (O3.l lVar : list) {
                    String str2 = (String) lVar.f7528k;
                    String str3 = (String) lVar.f7529l;
                    a0.q qVarJ2 = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar3, 1.0f), 0.0f, 7, 1);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10390t, c0510p2, 48);
                    int i9 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                    a0.q qVarC2 = a0.a.c(c0510p2, qVarJ2);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i2 = C2363j.f17871b;
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i2);
                    } else {
                        c0510p2.e0();
                    }
                    C0486d.R(c0510p2, C2363j.f17875f, f0VarB);
                    C0486d.R(c0510p2, C2363j.f17874e, interfaceC0501k0M2);
                    C2361h c2361h2 = C2363j.f17876g;
                    if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i9))) {
                        AbstractC0703b.u(i9, c0510p2, i9, c2361h2);
                    }
                    C0486d.R(c0510p2, C2363j.f17873d, qVarC2);
                    a0.q qVarN = androidx.compose.foundation.layout.c.n(112);
                    S0 s02 = N2.a;
                    a0.n nVar4 = nVar3;
                    H2.b(str2, qVarN, ((L.N) c0510p2.k(L.P.a)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(s02)).f5220l, c0510p, 48, 0, 65528);
                    String strR = AbstractC2517v.R(AbstractC2517v.R(str3, ", ,, ", ", "), ", ,,", ", ");
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    H2.b(strR, new LayoutWeightElement(1.0f, true), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(s02)).f5219k, c0510p, 0, 0, 65532);
                    c0510p2 = c0510p;
                    c0510p2.p(true);
                    nVar3 = nVar4;
                }
                nVar = nVar3;
                z7 = true;
                c0510p2.p(false);
            }
            AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 18));
            c0510p2.p(z7);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C1997d(animeDetail, i7, 0);
        }
    }

    public static final void l(AnimeDetail animeDetail, String str, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, C0510p c0510p, int i7) {
        int i8;
        C0510p c0510p2 = c0510p;
        c0510p2.T(-667170338);
        if ((i7 & 6) == 0) {
            i8 = ((i7 & 8) == 0 ? c0510p2.f(animeDetail) : c0510p2.h(animeDetail) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p2.f(str) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p2.h(interfaceC0821a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p2.h(interfaceC0821a2) ? 2048 : 1024;
        }
        int i9 = i8;
        if ((i9 & 1171) == 1170 && c0510p2.y()) {
            c0510p2.M();
        } else {
            a0.n nVar = a0.n.a;
            a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.layout.c.d(nVar, 1.0f), 16, 0.0f, 2);
            C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
            int i10 = c0510p2.f7128P;
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
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p2, c2361h, c2140tA);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p2, i10, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p2, c2361h4, qVarC);
            float f5 = 8;
            float f7 = 6;
            v.G.a(null, AbstractC2130i.g(f5), AbstractC2130i.g(f7), 0, 0, null, W.f.b(1081890361, new B3.g(animeDetail.getInfo().get("Skor Anime"), animeDetail.getInfo().get("Tipe"), animeDetail.getInfo().get("Status"), animeDetail.getInfo().get("Dirilis"), animeDetail.getInfo().get("Jumlah Episode"), 4), c0510p2), c0510p2, 1573296, 57);
            if (animeDetail.getGenres().isEmpty()) {
                c0510p2.R(139985326);
            } else {
                c0510p2.R(161131232);
                AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 10));
                v.G.a(null, AbstractC2130i.g(f7), AbstractC2130i.g(f7), 0, 0, null, W.f.b(-320129836, new C1995b(animeDetail, 1), c0510p2), c0510p2, 1573296, 57);
            }
            c0510p2.p(false);
            AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 12));
            f0 f0VarB = e0.b(AbstractC2130i.g(f5), a0.b.f10391u, c0510p2, 54);
            int i11 = c0510p2.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
            a0.q qVarC2 = a0.a.c(c0510p2, nVar);
            c0510p2.V();
            if (c0510p2.f7127O) {
                c0510p2.l(c2362i);
            } else {
                c0510p2.e0();
            }
            C0486d.R(c0510p2, c2361h, f0VarB);
            C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
            if (c0510p2.f7127O || !kotlin.jvm.internal.l.a(c0510p2.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p2, i11, c2361h3);
            }
            C0486d.R(c0510p2, c2361h4, qVarC2);
            b(str, interfaceC0821a, null, c0510p2, (i9 >> 3) & 126);
            q2.b(interfaceC0821a2, null, false, C.e.a(), ((L.N) c0510p2.k(L.P.a)).f5230G, 0L, 0.0f, null, null, f15640c, c0510p, (i9 >> 9) & 14, 998);
            c0510p2 = c0510p;
            c0510p2.p(true);
            c0510p2.p(true);
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new r3.g(animeDetail, str, interfaceC0821a, interfaceC0821a2, i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x06e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(int r38, java.lang.Integer r39, java.lang.Integer r40, e4.k r41, O.C0510p r42, int r43) {
        /*
            Method dump skipped, instructions count: 1919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.AbstractC1994a.m(int, java.lang.Integer, java.lang.Integer, e4.k, O.p, int):void");
    }

    public static final void n(AnimeDetail animeDetail, C0510p c0510p, int i7) {
        int i8;
        C0510p c0510p2;
        c0510p.T(-1654463135);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(animeDetail) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i8 & 3) == 2 && c0510p.y()) {
            c0510p.M();
            c0510p2 = c0510p;
        } else {
            if (animeDetail == null) {
                C0509o0 c0509o0S = c0510p.s();
                if (c0509o0S != null) {
                    c0509o0S.f7111d = new C1997d(animeDetail, i7, 1);
                    return;
                }
                return;
            }
            c0510p2 = c0510p;
            v.G.a(null, AbstractC2130i.g(6), null, 0, 0, null, W.f.b(1627236316, new C1995b(animeDetail, 2), c0510p), c0510p2, 1572912, 61);
        }
        C0509o0 c0509o0S2 = c0510p2.s();
        if (c0509o0S2 != null) {
            c0509o0S2.f7111d = new C1997d(animeDetail, i7, 2);
        }
    }
}
