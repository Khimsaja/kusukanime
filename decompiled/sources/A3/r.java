package A3;

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
import com.kusukanime.data.BookmarkRow;
import com.kusukanime.data.EpisodeRef;
import com.kusukanime.data.ScheduleItem;
import io.ktor.sse.ServerSentEventKt;
import java.util.Locale;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class r implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f181k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f182l;

    public /* synthetic */ r(int i7, Object obj) {
        this.f181k = i7;
        this.f182l = obj;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f181k) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    H2.b((String) this.f182l, androidx.compose.foundation.layout.a.i(a0.n.a, 14, 9), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((M2) c0510p.k(N2.a)).f5221m, c0510p, 48, 0, 65532);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    String strR = AbstractC2517v.R(((BookmarkRow) this.f182l).getAnime_slug(), "-", ServerSentEventKt.SPACE);
                    if (strR.length() > 0) {
                        StringBuilder sb = new StringBuilder();
                        String strValueOf = String.valueOf(strR.charAt(0));
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.String", strValueOf);
                        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                        kotlin.jvm.internal.l.e("toUpperCase(...)", upperCase);
                        sb.append((Object) upperCase);
                        String strSubstring = strR.substring(1);
                        kotlin.jvm.internal.l.e("substring(...)", strSubstring);
                        sb.append(strSubstring);
                        strR = sb.toString();
                    }
                    H2.b(strR, null, 0L, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p2.k(N2.a)).f5219k, c0510p2, 0, 3120, 55294);
                }
                break;
            case 2:
                C0510p c0510p3 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    EpisodeRef episodeRef = (EpisodeRef) this.f182l;
                    H2.b(episodeRef.getN() > 0 ? AbstractC0703b.g(episodeRef.getN(), "EP ") : AbstractC2510o.I0(8, episodeRef.getTitle()), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c0510p3, 0, 0, 131070);
                }
                break;
            default:
                C0510p c0510p4 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    ScheduleItem scheduleItem = (ScheduleItem) this.f182l;
                    String cover = scheduleItem.getCover();
                    a0.n nVar = a0.n.a;
                    if (cover == null || AbstractC2510o.g0(cover)) {
                        c0510p4.R(74207548);
                        a0.q qVarJ = androidx.compose.foundation.layout.c.j(nVar, 56);
                        InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, false);
                        int i7 = c0510p4.f7128P;
                        InterfaceC0501k0 interfaceC0501k0M = c0510p4.m();
                        a0.q qVarC = a0.a.c(c0510p4, qVarJ);
                        InterfaceC2364k.f17877j.getClass();
                        C2362i c2362i = C2363j.f17871b;
                        c0510p4.V();
                        if (c0510p4.f7127O) {
                            c0510p4.l(c2362i);
                        } else {
                            c0510p4.e0();
                        }
                        C0486d.R(c0510p4, C2363j.f17875f, interfaceC2173HE);
                        C0486d.R(c0510p4, C2363j.f17874e, interfaceC0501k0M);
                        C2361h c2361h = C2363j.f17876g;
                        if (c0510p4.f7127O || !kotlin.jvm.internal.l.a(c0510p4.H(), Integer.valueOf(i7))) {
                            AbstractC0703b.u(i7, c0510p4, i7, c2361h);
                        }
                        C0486d.R(c0510p4, C2363j.f17873d, qVarC);
                        AbstractC0384j0.a(P3.r.A(), null, null, ((N) c0510p4.k(P.a)).f5260s, c0510p4, 48, 4);
                        c0510p4.p(true);
                        c0510p4.p(false);
                    } else {
                        c0510p4.R(74641455);
                        T2.q.b(scheduleItem.getCover(), scheduleItem.getTitle(), q0.c.o(androidx.compose.foundation.layout.c.j(nVar, 56), C.e.b(10)), c0510p4, 1572864);
                        c0510p4.p(false);
                    }
                }
                break;
        }
        return C.a;
    }
}
