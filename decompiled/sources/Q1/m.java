package Q1;

import H1.AbstractC0225f;
import j3.AbstractC1338y;
import j3.G;
import j3.V;
import j3.W;
import j3.X;
import y1.Q;

/* loaded from: classes.dex */
public final class m extends o implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final int f7900o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7901p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7902q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7903r;

    /* renamed from: s, reason: collision with root package name */
    public final int f7904s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7905t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7906u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7907v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7908w;

    public m(int i7, Q q6, int i8, j jVar, int i9, String str, String str2) {
        int iB;
        super(i7, q6, i8);
        int i10 = 0;
        this.f7901p = AbstractC0225f.m(i9, false);
        int i11 = this.f7912n.f18103e & (~jVar.f18009r);
        this.f7902q = (i11 & 1) != 0;
        this.f7903r = (i11 & 2) != 0;
        X x7 = jVar.f18007p;
        X xW = str2 != null ? G.w(str2) : x7.isEmpty() ? G.w("") : x7;
        int i12 = 0;
        while (true) {
            if (i12 >= xW.f12306n) {
                iB = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iB = q.b(this.f7912n, (String) xW.get(i12), false);
                if (iB > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f7904s = i12;
        this.f7905t = iB;
        int i13 = str2 != null ? 1088 : 0;
        int i14 = this.f7912n.f18104f;
        W w7 = q.f7931i;
        int iBitCount = (i14 == 0 || i14 != i13) ? Integer.bitCount(i13 & i14) : Integer.MAX_VALUE;
        this.f7906u = iBitCount;
        this.f7908w = (this.f7912n.f18104f & 1088) != 0;
        int iB2 = q.b(this.f7912n, str, q.e(str) == null);
        this.f7907v = iB2;
        boolean z7 = iB > 0 || (x7.isEmpty() && iBitCount > 0) || this.f7902q || (this.f7903r && iB2 > 0);
        if (AbstractC0225f.m(i9, jVar.f7899z) && z7) {
            i10 = 1;
        }
        this.f7900o = i10;
    }

    @Override // Q1.o
    public final int a() {
        return this.f7900o;
    }

    @Override // Q1.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(m mVar) {
        AbstractC1338y abstractC1338yC = AbstractC1338y.a.c(this.f7901p, mVar.f7901p);
        Integer numValueOf = Integer.valueOf(this.f7904s);
        Integer numValueOf2 = Integer.valueOf(mVar.f7904s);
        V v5 = V.f12302m;
        AbstractC1338y abstractC1338yB = abstractC1338yC.b(numValueOf, numValueOf2, v5);
        int i7 = this.f7905t;
        AbstractC1338y abstractC1338yA = abstractC1338yB.a(i7, mVar.f7905t);
        int i8 = this.f7906u;
        AbstractC1338y abstractC1338yC2 = abstractC1338yA.a(i8, mVar.f7906u).c(this.f7902q, mVar.f7902q);
        Boolean boolValueOf = Boolean.valueOf(this.f7903r);
        Boolean boolValueOf2 = Boolean.valueOf(mVar.f7903r);
        if (i7 == 0) {
            v5 = V.f12301l;
        }
        AbstractC1338y abstractC1338yA2 = abstractC1338yC2.b(boolValueOf, boolValueOf2, v5).a(this.f7907v, mVar.f7907v);
        if (i8 == 0) {
            abstractC1338yA2 = abstractC1338yA2.d(this.f7908w, mVar.f7908w);
        }
        return abstractC1338yA2.e();
    }
}
