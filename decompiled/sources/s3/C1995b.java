package s3;

import O.C0502l;
import O.C0510p;
import com.kusukanime.data.AnimeDetail;
import io.ktor.sse.ServerSentEventKt;
import java.util.Iterator;
import java.util.List;
import v.C2141u;
import z5.AbstractC2510o;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1995b implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15645k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AnimeDetail f15646l;

    public /* synthetic */ C1995b(AnimeDetail animeDetail, int i7) {
        this.f15645k = i7;
        this.f15646l = animeDetail;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f15645k) {
            case 0:
                C0510p c0510p = (C0510p) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$ModalBottomSheet", (C2141u) obj);
                if ((iIntValue & 17) == 16 && c0510p.y()) {
                    c0510p.M();
                } else {
                    AbstractC1994a.k(this.f15646l, c0510p, AnimeDetail.$stable);
                }
                break;
            case 1:
                C0510p c0510p2 = (C0510p) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$FlowRow", (v.N) obj);
                if ((iIntValue2 & 17) == 16 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    Iterator<T> it = this.f15646l.getGenres().iterator();
                    while (it.hasNext()) {
                        List listU0 = AbstractC2510o.u0((String) it.next(), new String[]{"-"}, 0, 6);
                        Object objH = c0510p2.H();
                        if (objH == C0502l.a) {
                            objH = new io.ktor.network.sockets.b(28);
                            c0510p2.b0(objH);
                        }
                        D3.f.h(P3.q.y0(listU0, ServerSentEventKt.SPACE, null, null, (e4.k) objH, 30), null, c0510p2, 0);
                    }
                }
                break;
            default:
                C0510p c0510p3 = (C0510p) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.l.f("$this$FlowRow", (v.N) obj);
                if ((iIntValue3 & 17) == 16 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    String[] strArr = new String[4];
                    AnimeDetail animeDetail = this.f15646l;
                    strArr[0] = animeDetail.getInfo().get("Tipe");
                    strArr[1] = animeDetail.getInfo().get("Status");
                    String str = animeDetail.getInfo().get("Skor Anime");
                    strArr[2] = str != null ? "★ ".concat(str) : null;
                    strArr[3] = animeDetail.getInfo().get("Dirilis");
                    Iterator it2 = P3.m.g0(strArr).iterator();
                    while (it2.hasNext()) {
                        D3.f.h((String) it2.next(), null, c0510p3, 0);
                    }
                }
                break;
        }
        return O3.C.a;
    }
}
