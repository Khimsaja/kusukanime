package v3;

import L.AbstractC0384j0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import O3.C;
import b1.AbstractC0703b;
import com.kusukanime.data.FeedItem;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class r implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16586k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeedItem f16587l;

    public /* synthetic */ r(FeedItem feedItem, int i7) {
        this.f16586k = i7;
        this.f16587l = feedItem;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16586k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    FeedItem feedItem = this.f16587l;
                    String cover = feedItem.getCover();
                    a0.n nVar = a0.n.a;
                    if (cover == null || AbstractC2510o.g0(cover)) {
                        c0510p.R(290889096);
                        a0.q qVarK = androidx.compose.foundation.layout.c.k(nVar, 56, 72);
                        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                        int i7 = c0510p.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                        a0.q qVarC = a0.a.c(c0510p, qVarK);
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
                        if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                            AbstractC0703b.u(i7, c0510p, i7, c2361h);
                        }
                        C0486d.R(c0510p, C2363j.f17873d, qVarC);
                        AbstractC0384j0.a(n6.m.J(), null, null, ((N) c0510p.k(P.a)).f5260s, c0510p, 48, 4);
                        c0510p.p(true);
                        c0510p.p(false);
                    } else {
                        c0510p.R(291296095);
                        T2.q.b(feedItem.getCover(), feedItem.getAnime_title(), q0.c.o(androidx.compose.foundation.layout.c.k(nVar, 56, 72), C.e.b(10)), c0510p, 1572864);
                        c0510p.p(false);
                    }
                }
                break;
            default:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    H2.b(AbstractC0703b.g(this.f16587l.getEpisode_n(), "EP "), androidx.compose.foundation.layout.a.i(a0.n.a, 5, 2), ((N) c0510p2.k(P.a)).f5243b, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p2.k(N2.a)).f5223o, c0510p2, 48, 0, 65528);
                }
                break;
        }
        return C.a;
    }
}
