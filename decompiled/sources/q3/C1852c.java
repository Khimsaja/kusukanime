package q3;

import A3.r;
import L.AbstractC0396m0;
import L.AbstractC0412r0;
import L.C0392l0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.q2;
import M0.u;
import N.j;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O3.C;
import a0.i;
import a0.n;
import a0.q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import com.kusukanime.data.BookmarkRow;
import com.kusukanime.data.FeedItem;
import com.kusukanime.data.ScheduleItem;
import e4.o;
import h0.C0998u;
import kotlin.jvm.internal.l;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.AbstractC2136o;
import v.C2140t;
import v.C2141u;
import v.e0;
import v.f0;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* renamed from: q3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1852c implements o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14728k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f14729l;

    public /* synthetic */ C1852c(int i7, Object obj) {
        this.f14728k = i7;
        this.f14729l = obj;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z7;
        boolean z8;
        n nVar = n.a;
        C c2 = C.a;
        Object obj4 = this.f14729l;
        switch (this.f14728k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Number) obj3).intValue();
                l.f("$this$Card", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    W.a aVarB = W.f.b(-1419342753, new r(1, (BookmarkRow) obj4), c0510p);
                    W.a aVar = AbstractC1856g.a;
                    W.a aVar2 = AbstractC1856g.f14743b;
                    float f5 = AbstractC0396m0.a;
                    long jD = C0998u.f11833f;
                    if ((510 & 1) != 0) {
                        float f7 = j.a;
                        jD = P.d(35, c0510p);
                    }
                    AbstractC0412r0.a(aVarB, null, aVar, aVar2, new C0392l0(jD, P.d(j.f6696n, c0510p), P.d(j.f6697o, c0510p), P.d(j.f6698p, c0510p), P.d(j.f6699q, c0510p), P.d(j.f6700r, c0510p), C0998u.b(j.f6684b, P.d(j.f6693k, c0510p)), C0998u.b(j.f6685c, P.d(j.f6694l, c0510p)), C0998u.b(j.f6686d, P.d(j.f6695m, c0510p))), 0.0f, 0.0f, c0510p, 221190);
                }
                return c2;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                l.f("$this$Card", (C2141u) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    q qVarH = androidx.compose.foundation.layout.a.h(nVar, 8);
                    f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p2, 48);
                    int i7 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M = c0510p2.m();
                    q qVarC = a0.a.c(c0510p2, qVarH);
                    InterfaceC2364k.f17877j.getClass();
                    C2362i c2362i = C2363j.f17871b;
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i);
                    } else {
                        c0510p2.e0();
                    }
                    C2361h c2361h = C2363j.f17875f;
                    C0486d.R(c0510p2, c2361h, f0VarB);
                    C2361h c2361h2 = C2363j.f17874e;
                    C0486d.R(c0510p2, c2361h2, interfaceC0501k0M);
                    C2361h c2361h3 = C2363j.f17876g;
                    if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i7))) {
                        AbstractC0703b.u(i7, c0510p2, i7, c2361h3);
                    }
                    C2361h c2361h4 = C2363j.f17873d;
                    C0486d.R(c0510p2, c2361h4, qVarC);
                    float f8 = 10;
                    C.d dVarB = C.e.b(f8);
                    S0 s02 = P.a;
                    ScheduleItem scheduleItem = (ScheduleItem) obj4;
                    q2.a(null, dVarB, ((N) c0510p2.k(s02)).f5231H, 0L, 0.0f, 0.0f, W.f.b(-846707690, new r(3, scheduleItem), c0510p2), c0510p2, 12582912, 121);
                    AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.n(f8));
                    if (1.0f <= 0.0d) {
                        throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    C2140t c2140tA = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p2, 0);
                    int i8 = c0510p2.f7128P;
                    InterfaceC0501k0 interfaceC0501k0M2 = c0510p2.m();
                    q qVarC2 = a0.a.c(c0510p2, layoutWeightElement);
                    c0510p2.V();
                    if (c0510p2.f7127O) {
                        c0510p2.l(c2362i);
                    } else {
                        c0510p2.e0();
                    }
                    C0486d.R(c0510p2, c2361h, c2140tA);
                    C0486d.R(c0510p2, c2361h2, interfaceC0501k0M2);
                    if (c0510p2.f7127O || !l.a(c0510p2.H(), Integer.valueOf(i8))) {
                        AbstractC0703b.u(i8, c0510p2, i8, c2361h3);
                    }
                    C0486d.R(c0510p2, c2361h4, qVarC2);
                    String title = scheduleItem.getTitle();
                    S0 s03 = N2.a;
                    H2.b(title, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p2.k(s03)).f5221m, c0510p2, 0, 3120, 55294);
                    String meta = scheduleItem.getMeta();
                    String str = (meta == null || AbstractC2510o.g0(meta)) ? null : meta;
                    if (str == null) {
                        c0510p2.R(-1769657803);
                        z7 = false;
                    } else {
                        c0510p2.R(-1769657802);
                        AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 2));
                        H2.b(str, null, ((N) c0510p2.k(s02)).f5260s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p2.k(s03)).f5223o, c0510p2, 0, 3120, 55290);
                        z7 = false;
                    }
                    c0510p2.p(z7);
                    c0510p2.p(true);
                    c0510p2.p(true);
                }
                return c2;
            default:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                l.f("$this$Card", (C2141u) obj);
                if ((iIntValue3 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                    return c2;
                }
                float f9 = 8;
                q qVarH2 = androidx.compose.foundation.layout.a.h(nVar, f9);
                f0 f0VarB2 = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p3, 48);
                int i9 = c0510p3.f7128P;
                InterfaceC0501k0 interfaceC0501k0M3 = c0510p3.m();
                q qVarC3 = a0.a.c(c0510p3, qVarH2);
                InterfaceC2364k.f17877j.getClass();
                C2362i c2362i2 = C2363j.f17871b;
                c0510p3.V();
                if (c0510p3.f7127O) {
                    c0510p3.l(c2362i2);
                } else {
                    c0510p3.e0();
                }
                C2361h c2361h5 = C2363j.f17875f;
                C0486d.R(c0510p3, c2361h5, f0VarB2);
                C2361h c2361h6 = C2363j.f17874e;
                C0486d.R(c0510p3, c2361h6, interfaceC0501k0M3);
                C2361h c2361h7 = C2363j.f17876g;
                if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i9))) {
                    AbstractC0703b.u(i9, c0510p3, i9, c2361h7);
                }
                C2361h c2361h8 = C2363j.f17873d;
                C0486d.R(c0510p3, c2361h8, qVarC3);
                i iVar = a0.b.f10381k;
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                int i10 = c0510p3.f7128P;
                InterfaceC0501k0 interfaceC0501k0M4 = c0510p3.m();
                q qVarC4 = a0.a.c(c0510p3, nVar);
                c0510p3.V();
                if (c0510p3.f7127O) {
                    c0510p3.l(c2362i2);
                } else {
                    c0510p3.e0();
                }
                C0486d.R(c0510p3, c2361h5, interfaceC2173HE);
                C0486d.R(c0510p3, c2361h6, interfaceC0501k0M4);
                if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i10))) {
                    AbstractC0703b.u(i10, c0510p3, i10, c2361h7);
                }
                C0486d.R(c0510p3, c2361h8, qVarC4);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                float f10 = 10;
                C.d dVarB2 = C.e.b(f10);
                S0 s04 = P.a;
                FeedItem feedItem = (FeedItem) obj4;
                q2.a(null, dVarB2, ((N) c0510p3.k(s04)).f5231H, 0L, 0.0f, 0.0f, W.f.b(1031113320, new v3.r(feedItem, 0), c0510p3), c0510p3, 12582912, 121);
                if (feedItem.getEpisode_n() > 0) {
                    c0510p3.R(1346036246);
                    q2.a(bVar.a(nVar, iVar), C.e.c(f9, 0.0f, f10, 10), ((N) c0510p3.k(s04)).a, 0L, 0.0f, 0.0f, W.f.b(-968964883, new v3.r(feedItem, 1), c0510p3), c0510p3, 12582912, 120);
                    z8 = false;
                } else {
                    z8 = false;
                    c0510p3.R(1305682399);
                }
                c0510p3.p(z8);
                c0510p3.p(true);
                AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.n(f10));
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
                C2140t c2140tA2 = v.r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p3, 0);
                int i11 = c0510p3.f7128P;
                InterfaceC0501k0 interfaceC0501k0M5 = c0510p3.m();
                q qVarC5 = a0.a.c(c0510p3, layoutWeightElement2);
                c0510p3.V();
                if (c0510p3.f7127O) {
                    c0510p3.l(c2362i2);
                } else {
                    c0510p3.e0();
                }
                C0486d.R(c0510p3, c2361h5, c2140tA2);
                C0486d.R(c0510p3, c2361h6, interfaceC0501k0M5);
                if (c0510p3.f7127O || !l.a(c0510p3.H(), Integer.valueOf(i11))) {
                    AbstractC0703b.u(i11, c0510p3, i11, c2361h7);
                }
                C0486d.R(c0510p3, c2361h8, qVarC5);
                String anime_title = feedItem.getAnime_title();
                if (AbstractC2510o.g0(anime_title)) {
                    anime_title = feedItem.getTitle();
                }
                String str2 = anime_title;
                S0 s05 = N2.a;
                H2.b(str2, null, 0L, 0L, u.f6417q, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p3.k(s05)).f5219k, c0510p3, 196608, 3120, 55262);
                AbstractC2123b.a(c0510p3, androidx.compose.foundation.layout.c.e(nVar, 4));
                H2.b("Episode terbaru", null, ((N) c0510p3.k(s04)).f5260s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p3.k(s05)).f5223o, c0510p3, 6, 0, 65530);
                c0510p3.p(true);
                c0510p3.p(true);
                return c2;
        }
    }
}
