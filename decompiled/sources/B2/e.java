package B2;

import F0.t;
import F2.H;
import O.N;
import Q1.m;
import Q1.p;
import Q1.q;
import R1.n;
import io.ktor.util.GzipHeaderFlags;
import j3.AbstractC1338y;
import j3.C1336w;
import j3.W;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import t2.C2038d;
import y0.C2349D;
import y1.C2393o;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f394k;

    public /* synthetic */ e(int i7) {
        this.f394k = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f394k) {
            case 0:
                return Integer.compare(((f) obj).a.f397b, ((f) obj2).a.f397b);
            case 1:
                return Long.compare(((d) obj).f392b, ((d) obj2).f392b);
            case 2:
                H h7 = (H) obj;
                H h8 = (H) obj2;
                int iCompare = Integer.compare(h8.f2265b, h7.f2265b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = h7.f2266c.compareTo(h8.f2266c);
                return iCompareTo != 0 ? iCompareTo : h7.f2267d.compareTo(h8.f2267d);
            case 3:
                H h9 = (H) obj;
                H h10 = (H) obj2;
                int iCompare2 = Integer.compare(h10.a, h9.a);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo2 = h10.f2266c.compareTo(h9.f2266c);
                return iCompareTo2 != 0 ? iCompareTo2 : h10.f2267d.compareTo(h9.f2267d);
            case GzipHeaderFlags.EXTRA /* 4 */:
                O3.l lVar = (O3.l) obj;
                O3.l lVar2 = (O3.l) obj2;
                return (((Number) lVar.f7529l).intValue() - ((Number) lVar.f7528k).intValue()) - (((Number) lVar2.f7529l).intValue() - ((Number) lVar2.f7528k).intValue());
            case 5:
                return kotlin.jvm.internal.l.g(((N) obj).f7018b, ((N) obj2).f7018b);
            case 6:
                return ((C2393o) obj2).f18108j - ((C2393o) obj).f18108j;
            case 7:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 8:
                return Integer.compare(((Q1.g) ((List) obj).get(0)).f7878p, ((Q1.g) ((List) obj2).get(0)).f7878p);
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C1336w.f(p.c((p) Collections.max(list, new e(12)), (p) Collections.max(list2, new e(12)))).a(list.size(), list2.size()).b((p) Collections.max(list, new e(13)), (p) Collections.max(list2, new e(13)), new e(13)).e();
            case 10:
                return ((Q1.f) Collections.max((List) obj)).compareTo((Q1.f) Collections.max((List) obj2));
            case 11:
                return ((m) ((List) obj).get(0)).compareTo((m) ((List) obj2).get(0));
            case 12:
                return p.c((p) obj, (p) obj2);
            case 13:
                p pVar = (p) obj;
                p pVar2 = (p) obj2;
                W wA = (pVar.f7919o && pVar.f7922r) ? q.f7931i : q.f7931i.a();
                C1336w c1336w = AbstractC1338y.a;
                pVar.f7920p.getClass();
                return c1336w.b(Integer.valueOf(pVar.f7925u), Integer.valueOf(pVar2.f7925u), wA).b(Integer.valueOf(pVar.f7924t), Integer.valueOf(pVar2.f7924t), wA).e();
            case 14:
                return ((n) obj).a - ((n) obj2).a;
            case 15:
                return Float.compare(((n) obj).f8079c, ((n) obj2).f8079c);
            case 16:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i7 = 0; i7 < bArr.length; i7++) {
                    byte b4 = bArr[i7];
                    byte b7 = bArr2[i7];
                    if (b4 != b7) {
                        return b4 - b7;
                    }
                }
                return 0;
            case 17:
                return Integer.compare(((C2038d) obj2).f15924b, ((C2038d) obj).f15924b);
            case 18:
                C2349D c2349d = (C2349D) obj;
                C2349D c2349d2 = (C2349D) obj2;
                float f5 = c2349d.f17661H.f17761r.I;
                float f7 = c2349d2.f17661H.f17761r.I;
                return f5 == f7 ? kotlin.jvm.internal.l.g(c2349d.t(), c2349d2.t()) : Float.compare(f5, f7);
            default:
                F0.n nVar = (F0.n) obj2;
                F0.i iVar = ((F0.n) obj).f2104d;
                t tVar = F0.q.f2141n;
                Object objValueOf = iVar.f2096k.get(tVar);
                if (objValueOf == null) {
                    objValueOf = Float.valueOf(0.0f);
                }
                float fFloatValue = ((Number) objValueOf).floatValue();
                Object objValueOf2 = nVar.f2104d.f2096k.get(tVar);
                if (objValueOf2 == null) {
                    objValueOf2 = Float.valueOf(0.0f);
                }
                return Float.compare(fFloatValue, ((Number) objValueOf2).floatValue());
        }
    }
}
