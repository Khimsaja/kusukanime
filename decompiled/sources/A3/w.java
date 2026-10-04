package A3;

import L.E;
import L.E0;
import L.N;
import L.P;
import L.q2;
import O.C0502l;
import O.C0510p;
import O3.C;
import com.kusukanime.data.AnimeItem;
import com.kusukanime.data.AzItem;
import com.kusukanime.data.BookmarkRow;
import com.kusukanime.data.FeedItem;
import com.kusukanime.data.GenreItem;
import com.kusukanime.data.HistoryRow;
import com.kusukanime.data.ScheduleItem;
import e4.InterfaceC0821a;
import f.AbstractC0847h;
import io.ktor.util.GzipHeaderFlags;
import java.util.List;
import q3.C1852c;
import t3.AbstractC2048f;
import u3.C2079d;
import u3.C2081f;
import w.C2160a;
import x.C2235i;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements e4.p {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f197m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e4.k f198n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(List list, e4.k kVar, int i7) {
        super(4);
        this.f196l = i7;
        this.f197m = list;
        this.f198n = kVar;
    }

    @Override // e4.p
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        switch (this.f196l) {
            case 0:
                C2160a c2160a = (C2160a) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0510p c0510p = (C0510p) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i7 = (c0510p.f(c2160a) ? 4 : 2) | iIntValue2;
                } else {
                    i7 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i7 |= c0510p.d(iIntValue) ? 32 : 16;
                }
                if ((i7 & 147) == 146 && c0510p.y()) {
                    c0510p.M();
                } else {
                    O3.l lVar = (O3.l) this.f197m.get(iIntValue);
                    c0510p.R(-2095393561);
                    String str = (String) lVar.f7528k;
                    String str2 = (String) lVar.f7529l;
                    C.d dVarA = C.e.a();
                    long j7 = ((N) c0510p.k(P.a)).I;
                    a0.n nVar = a0.n.a;
                    e4.k kVar = this.f198n;
                    boolean zF = c0510p.f(kVar) | c0510p.f(str);
                    Object objH = c0510p.H();
                    if (zF || objH == C0502l.a) {
                        objH = new q(1, kVar, str);
                        c0510p.b0(objH);
                    }
                    q2.a(androidx.compose.foundation.a.e(nVar, false, null, (InterfaceC0821a) objH, 7), dVarA, j7, 0L, 0.0f, 0.0f, W.f.b(363689654, new r(0, str2), c0510p), c0510p, 12582912, 120);
                    c0510p.p(false);
                }
                break;
            case 1:
                C2160a c2160a2 = (C2160a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C0510p c0510p2 = (C0510p) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i8 = (c0510p2.f(c2160a2) ? 4 : 2) | iIntValue4;
                } else {
                    i8 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i8 |= c0510p2.d(iIntValue3) ? 32 : 16;
                }
                if ((i8 & 147) == 146 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    BookmarkRow bookmarkRow = (BookmarkRow) this.f197m.get(iIntValue3);
                    c0510p2.R(1487004914);
                    a0.q qVarD = androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f);
                    C.d dVarB = C.e.b(16);
                    L.B bJ = E0.j(((N) c0510p2.k(P.a)).I, c0510p2);
                    E eK = E0.k(0, 62);
                    e4.k kVar2 = this.f198n;
                    boolean zF2 = c0510p2.f(kVar2) | c0510p2.f(bookmarkRow);
                    Object objH2 = c0510p2.H();
                    if (zF2 || objH2 == C0502l.a) {
                        objH2 = new q(18, kVar2, bookmarkRow);
                        c0510p2.b0(objH2);
                    }
                    E0.d((InterfaceC0821a) objH2, qVarD, false, dVarB, bJ, eK, W.f.b(-774220287, new C1852c(0, bookmarkRow), c0510p2), c0510p2, 100663344, 196);
                    c0510p2.p(false);
                }
                break;
            case 2:
                C2160a c2160a3 = (C2160a) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C0510p c0510p3 = (C0510p) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i9 = (c0510p3.f(c2160a3) ? 4 : 2) | iIntValue6;
                } else {
                    i9 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i9 |= c0510p3.d(iIntValue5) ? 32 : 16;
                }
                if ((i9 & 147) == 146 && c0510p3.y()) {
                    c0510p3.M();
                } else {
                    AzItem azItem = (AzItem) this.f197m.get(iIntValue5);
                    c0510p3.R(1023072760);
                    e4.k kVar3 = this.f198n;
                    boolean zF3 = c0510p3.f(kVar3) | c0510p3.f(azItem);
                    Object objH3 = c0510p3.H();
                    if (zF3 || objH3 == C0502l.a) {
                        objH3 = new q(20, kVar3, azItem);
                        c0510p3.b0(objH3);
                    }
                    AbstractC2048f.a(azItem, (InterfaceC0821a) objH3, c0510p3, 0);
                    c0510p3.p(false);
                }
                break;
            case 3:
                Object obj5 = (C2235i) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C0510p c0510p4 = (C0510p) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                if ((iIntValue8 & 6) == 0) {
                    i10 = (c0510p4.f(obj5) ? 4 : 2) | iIntValue8;
                } else {
                    i10 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i10 |= c0510p4.d(iIntValue7) ? 32 : 16;
                }
                if ((i10 & 147) == 146 && c0510p4.y()) {
                    c0510p4.M();
                } else {
                    AnimeItem animeItem = (AnimeItem) this.f197m.get(iIntValue7);
                    c0510p4.R(2065759799);
                    String title = animeItem.getTitle();
                    String cover = animeItem.getCover();
                    String meta = animeItem.getMeta();
                    e4.k kVar4 = this.f198n;
                    boolean zF4 = c0510p4.f(kVar4) | c0510p4.f(animeItem);
                    Object objH4 = c0510p4.H();
                    if (zF4 || objH4 == C0502l.a) {
                        objH4 = new t3.m(kVar4, animeItem, 0);
                        c0510p4.b0(objH4);
                    }
                    D3.f.i(title, cover, (InterfaceC0821a) objH4, null, meta, c0510p4, 0);
                    c0510p4.p(false);
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                Object obj6 = (C2160a) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                C0510p c0510p5 = (C0510p) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i11 = (c0510p5.f(obj6) ? 4 : 2) | iIntValue10;
                } else {
                    i11 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i11 |= c0510p5.d(iIntValue9) ? 32 : 16;
                }
                if ((i11 & 147) == 146 && c0510p5.y()) {
                    c0510p5.M();
                } else {
                    HistoryRow historyRow = (HistoryRow) this.f197m.get(iIntValue9);
                    c0510p5.R(240807964);
                    a0.q qVarD2 = androidx.compose.foundation.layout.c.d(a0.n.a, 1.0f);
                    C.d dVarB2 = C.e.b(16);
                    L.B bJ2 = E0.j(((N) c0510p5.k(P.a)).I, c0510p5);
                    E eK2 = E0.k(0, 62);
                    e4.k kVar5 = this.f198n;
                    boolean zF5 = c0510p5.f(kVar5) | c0510p5.f(historyRow);
                    Object objH5 = c0510p5.H();
                    if (zF5 || objH5 == C0502l.a) {
                        objH5 = new C2079d(kVar5, historyRow, 0);
                        c0510p5.b0(objH5);
                    }
                    E0.d((InterfaceC0821a) objH5, qVarD2, false, dVarB2, bJ2, eK2, W.f.b(-730653565, new C2081f(historyRow, 0), c0510p5), c0510p5, 100663344, 196);
                    c0510p5.p(false);
                }
                break;
            case 5:
                Object obj7 = (C2160a) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                C0510p c0510p6 = (C0510p) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                if ((iIntValue12 & 6) == 0) {
                    i12 = (c0510p6.f(obj7) ? 4 : 2) | iIntValue12;
                } else {
                    i12 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i12 |= c0510p6.d(iIntValue11) ? 32 : 16;
                }
                if ((i12 & 147) == 146 && c0510p6.y()) {
                    c0510p6.M();
                } else {
                    ScheduleItem scheduleItem = (ScheduleItem) this.f197m.get(iIntValue11);
                    c0510p6.R(110362711);
                    C.d dVarB3 = C.e.b(16);
                    L.B bJ3 = E0.j(((N) c0510p6.k(P.a)).I, c0510p6);
                    E eK3 = E0.k(0, 62);
                    a0.q qVarN = androidx.compose.foundation.layout.c.n(240);
                    e4.k kVar6 = this.f198n;
                    boolean zF6 = c0510p6.f(kVar6) | c0510p6.f(scheduleItem);
                    Object objH6 = c0510p6.H();
                    if (zF6 || objH6 == C0502l.a) {
                        objH6 = new v3.h(kVar6, scheduleItem, 0);
                        c0510p6.b0(objH6);
                    }
                    E0.d((InterfaceC0821a) objH6, qVarN, false, dVarB3, bJ3, eK3, W.f.b(-105588683, new C1852c(1, scheduleItem), c0510p6), c0510p6, 100663344, 196);
                    c0510p6.p(false);
                }
                break;
            case 6:
                Object obj8 = (C2160a) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                C0510p c0510p7 = (C0510p) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i13 = (c0510p7.f(obj8) ? 4 : 2) | iIntValue14;
                } else {
                    i13 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i13 |= c0510p7.d(iIntValue13) ? 32 : 16;
                }
                if ((i13 & 147) == 146 && c0510p7.y()) {
                    c0510p7.M();
                } else {
                    HistoryRow historyRow2 = (HistoryRow) this.f197m.get(iIntValue13);
                    c0510p7.R(1679984549);
                    C.d dVarB4 = C.e.b(16);
                    L.B bJ4 = E0.j(((N) c0510p7.k(P.a)).I, c0510p7);
                    E eK4 = E0.k(0, 62);
                    a0.q qVarN2 = androidx.compose.foundation.layout.c.n(200);
                    e4.k kVar7 = this.f198n;
                    boolean zF7 = c0510p7.f(kVar7) | c0510p7.f(historyRow2);
                    Object objH7 = c0510p7.H();
                    if (zF7 || objH7 == C0502l.a) {
                        objH7 = new C2079d(kVar7, historyRow2, 1);
                        c0510p7.b0(objH7);
                    }
                    E0.d((InterfaceC0821a) objH7, qVarN2, false, dVarB4, bJ4, eK4, W.f.b(-1616616326, new C2081f(historyRow2, 1), c0510p7), c0510p7, 100663344, 196);
                    c0510p7.p(false);
                }
                break;
            case 7:
                C2160a c2160a4 = (C2160a) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                C0510p c0510p8 = (C0510p) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i14 = (c0510p8.f(c2160a4) ? 4 : 2) | iIntValue16;
                } else {
                    i14 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i14 |= c0510p8.d(iIntValue15) ? 32 : 16;
                }
                if ((i14 & 147) == 146 && c0510p8.y()) {
                    c0510p8.M();
                } else {
                    GenreItem genreItem = (GenreItem) this.f197m.get(iIntValue15);
                    c0510p8.R(85516780);
                    C.d dVarA2 = C.e.a();
                    long j8 = ((N) c0510p8.k(P.a)).f5230G;
                    a0.n nVar2 = a0.n.a;
                    e4.k kVar8 = this.f198n;
                    boolean zF8 = c0510p8.f(kVar8) | c0510p8.f(genreItem);
                    Object objH8 = c0510p8.H();
                    if (zF8 || objH8 == C0502l.a) {
                        objH8 = new q(25, kVar8, genreItem);
                        c0510p8.b0(objH8);
                    }
                    q2.a(androidx.compose.foundation.a.e(nVar2, false, null, (InterfaceC0821a) objH8, 7), dVarA2, j8, 0L, 0.0f, 0.0f, W.f.b(-253879160, new t3.j(genreItem, 1), c0510p8), c0510p8, 12582912, 120);
                    c0510p8.p(false);
                }
                break;
            case 8:
                Object obj9 = (C2235i) obj;
                int iIntValue17 = ((Number) obj2).intValue();
                C0510p c0510p9 = (C0510p) obj3;
                int iIntValue18 = ((Number) obj4).intValue();
                if ((iIntValue18 & 6) == 0) {
                    i15 = (c0510p9.f(obj9) ? 4 : 2) | iIntValue18;
                } else {
                    i15 = iIntValue18;
                }
                if ((iIntValue18 & 48) == 0) {
                    i15 |= c0510p9.d(iIntValue17) ? 32 : 16;
                }
                if ((i15 & 147) == 146 && c0510p9.y()) {
                    c0510p9.M();
                } else {
                    AnimeItem animeItem2 = (AnimeItem) this.f197m.get(iIntValue17);
                    c0510p9.R(1592986044);
                    String title2 = animeItem2.getTitle();
                    String cover2 = animeItem2.getCover();
                    String meta2 = animeItem2.getMeta();
                    e4.k kVar9 = this.f198n;
                    boolean zF9 = c0510p9.f(kVar9) | c0510p9.f(animeItem2);
                    Object objH9 = c0510p9.H();
                    if (zF9 || objH9 == C0502l.a) {
                        objH9 = new t3.m(kVar9, animeItem2, 1);
                        c0510p9.b0(objH9);
                    }
                    D3.f.i(title2, cover2, (InterfaceC0821a) objH9, null, meta2, c0510p9, 0);
                    c0510p9.p(false);
                }
                break;
            case 9:
                C2160a c2160a5 = (C2160a) obj;
                int iIntValue19 = ((Number) obj2).intValue();
                C0510p c0510p10 = (C0510p) obj3;
                int iIntValue20 = ((Number) obj4).intValue();
                if ((iIntValue20 & 6) == 0) {
                    i16 = (c0510p10.f(c2160a5) ? 4 : 2) | iIntValue20;
                } else {
                    i16 = iIntValue20;
                }
                if ((iIntValue20 & 48) == 0) {
                    i16 |= c0510p10.d(iIntValue19) ? 32 : 16;
                }
                if ((i16 & 147) == 146 && c0510p10.y()) {
                    c0510p10.M();
                } else {
                    FeedItem feedItem = (FeedItem) this.f197m.get(iIntValue19);
                    c0510p10.R(1374996102);
                    C.d dVarB5 = C.e.b(16);
                    L.B bJ5 = E0.j(((N) c0510p10.k(P.a)).I, c0510p10);
                    E eK5 = E0.k(0, 62);
                    a0.q qVarN3 = androidx.compose.foundation.layout.c.n(250);
                    e4.k kVar10 = this.f198n;
                    boolean zF10 = c0510p10.f(kVar10) | c0510p10.f(feedItem);
                    Object objH10 = c0510p10.H();
                    if (zF10 || objH10 == C0502l.a) {
                        objH10 = new q(26, kVar10, feedItem);
                        c0510p10.b0(objH10);
                    }
                    E0.d((InterfaceC0821a) objH10, qVarN3, false, dVarB5, bJ5, eK5, W.f.b(-587181811, new C1852c(2, feedItem), c0510p10), c0510p10, 100663344, 196);
                    c0510p10.p(false);
                }
                break;
            default:
                Object obj10 = (C2160a) obj;
                int iIntValue21 = ((Number) obj2).intValue();
                C0510p c0510p11 = (C0510p) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 6) == 0) {
                    i17 = (c0510p11.f(obj10) ? 4 : 2) | iIntValue22;
                } else {
                    i17 = iIntValue22;
                }
                if ((iIntValue22 & 48) == 0) {
                    i17 |= c0510p11.d(iIntValue21) ? 32 : 16;
                }
                if ((i17 & 147) == 146 && c0510p11.y()) {
                    c0510p11.M();
                } else {
                    ScheduleItem scheduleItem2 = (ScheduleItem) this.f197m.get(iIntValue21);
                    c0510p11.R(-1931742579);
                    String title3 = scheduleItem2.getTitle();
                    String meta3 = scheduleItem2.getMeta();
                    String cover3 = scheduleItem2.getCover();
                    e4.k kVar11 = this.f198n;
                    boolean zF11 = c0510p11.f(kVar11) | c0510p11.f(scheduleItem2);
                    Object objH11 = c0510p11.H();
                    if (zF11 || objH11 == C0502l.a) {
                        objH11 = new v3.h(kVar11, scheduleItem2, 1);
                        c0510p11.b0(objH11);
                    }
                    AbstractC0847h.d(title3, meta3, cover3, (InterfaceC0821a) objH11, c0510p11, 0);
                    c0510p11.p(false);
                }
                break;
        }
        return C.a;
    }
}
