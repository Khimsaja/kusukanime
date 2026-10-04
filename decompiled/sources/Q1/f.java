package Q1;

import android.text.TextUtils;
import j3.AbstractC1338y;
import j3.V;
import j3.W;
import java.util.Objects;
import y1.C2393o;

/* loaded from: classes.dex */
public final class f extends o implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f7857A;

    /* renamed from: B, reason: collision with root package name */
    public final int f7858B;

    /* renamed from: C, reason: collision with root package name */
    public final int f7859C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7860D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7861E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f7862F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f7863G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f7864H;

    /* renamed from: o, reason: collision with root package name */
    public final int f7865o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7866p;

    /* renamed from: q, reason: collision with root package name */
    public final String f7867q;

    /* renamed from: r, reason: collision with root package name */
    public final j f7868r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7869s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7870t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7871u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7872v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f7873w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f7874x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7875y;

    /* renamed from: z, reason: collision with root package name */
    public final int f7876z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r14, y1.Q r15, int r16, Q1.j r17, int r18, boolean r19, Q1.e r20, int r21) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.f.<init>(int, y1.Q, int, Q1.j, int, boolean, Q1.e, int):void");
    }

    @Override // Q1.o
    public final int a() {
        return this.f7865o;
    }

    @Override // Q1.o
    public final boolean b(o oVar) {
        int i7;
        String str;
        f fVar = (f) oVar;
        this.f7868r.getClass();
        C2393o c2393o = this.f7912n;
        int i8 = c2393o.f18091D;
        if (i8 == -1) {
            return false;
        }
        C2393o c2393o2 = fVar.f7912n;
        if (i8 != c2393o2.f18091D) {
            return false;
        }
        if ((this.f7873w || ((str = c2393o.f18112n) != null && TextUtils.equals(str, c2393o2.f18112n))) && (i7 = c2393o.f18092E) != -1 && i7 == c2393o2.f18092E) {
            return this.f7862F == fVar.f7862F && this.f7863G == fVar.f7863G;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z7 = this.f7869s;
        boolean z8 = this.f7866p;
        W wA = (z8 && z7) ? q.f7931i : q.f7931i.a();
        AbstractC1338y abstractC1338yC = AbstractC1338y.a.c(z7, fVar.f7869s);
        Integer numValueOf = Integer.valueOf(this.f7871u);
        Integer numValueOf2 = Integer.valueOf(fVar.f7871u);
        V v5 = V.f12302m;
        AbstractC1338y abstractC1338yB = abstractC1338yC.b(numValueOf, numValueOf2, v5).a(this.f7870t, fVar.f7870t).a(this.f7872v, fVar.f7872v).c(this.f7857A, fVar.f7857A).c(this.f7874x, fVar.f7874x).b(Integer.valueOf(this.f7875y), Integer.valueOf(fVar.f7875y), v5).a(this.f7876z, fVar.f7876z).c(z8, fVar.f7866p).b(Integer.valueOf(this.f7861E), Integer.valueOf(fVar.f7861E), v5);
        this.f7868r.getClass();
        AbstractC1338y abstractC1338yB2 = abstractC1338yB.c(this.f7862F, fVar.f7862F).c(this.f7863G, fVar.f7863G).c(this.f7864H, fVar.f7864H).b(Integer.valueOf(this.f7858B), Integer.valueOf(fVar.f7858B), wA).b(Integer.valueOf(this.f7859C), Integer.valueOf(fVar.f7859C), wA);
        if (Objects.equals(this.f7867q, fVar.f7867q)) {
            abstractC1338yB2 = abstractC1338yB2.b(Integer.valueOf(this.f7860D), Integer.valueOf(fVar.f7860D), wA);
        }
        return abstractC1338yB2.e();
    }
}
