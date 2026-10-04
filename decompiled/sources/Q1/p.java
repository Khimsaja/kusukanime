package Q1;

import j3.AbstractC1338y;
import j3.V;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends o {

    /* renamed from: A, reason: collision with root package name */
    public final int f7913A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f7914B;

    /* renamed from: C, reason: collision with root package name */
    public final int f7915C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f7916D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f7917E;

    /* renamed from: F, reason: collision with root package name */
    public final int f7918F;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7919o;

    /* renamed from: p, reason: collision with root package name */
    public final j f7920p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f7921q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f7922r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f7923s;

    /* renamed from: t, reason: collision with root package name */
    public final int f7924t;

    /* renamed from: u, reason: collision with root package name */
    public final int f7925u;

    /* renamed from: v, reason: collision with root package name */
    public final int f7926v;

    /* renamed from: w, reason: collision with root package name */
    public final int f7927w;

    /* renamed from: x, reason: collision with root package name */
    public final int f7928x;

    /* renamed from: y, reason: collision with root package name */
    public final int f7929y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f7930z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(int r14, y1.Q r15, int r16, Q1.j r17, int r18, java.lang.String r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.p.<init>(int, y1.Q, int, Q1.j, int, java.lang.String, int, boolean):void");
    }

    public static int c(p pVar, p pVar2) {
        AbstractC1338y abstractC1338yC = AbstractC1338y.a.c(pVar.f7922r, pVar2.f7922r);
        Integer numValueOf = Integer.valueOf(pVar.f7927w);
        Integer numValueOf2 = Integer.valueOf(pVar2.f7927w);
        V v5 = V.f12302m;
        AbstractC1338y abstractC1338yB = abstractC1338yC.b(numValueOf, numValueOf2, v5).a(pVar.f7928x, pVar2.f7928x).a(pVar.f7929y, pVar2.f7929y).c(pVar.f7930z, pVar2.f7930z).a(pVar.f7913A, pVar2.f7913A).c(pVar.f7923s, pVar2.f7923s).c(pVar.f7919o, pVar2.f7919o).c(pVar.f7921q, pVar2.f7921q).b(Integer.valueOf(pVar.f7926v), Integer.valueOf(pVar2.f7926v), v5);
        boolean z7 = pVar2.f7916D;
        boolean z8 = pVar.f7916D;
        AbstractC1338y abstractC1338yC2 = abstractC1338yB.c(z8, z7);
        boolean z9 = pVar2.f7917E;
        boolean z10 = pVar.f7917E;
        AbstractC1338y abstractC1338yC3 = abstractC1338yC2.c(z10, z9);
        if (z8 && z10) {
            abstractC1338yC3 = abstractC1338yC3.a(pVar.f7918F, pVar2.f7918F);
        }
        return abstractC1338yC3.e();
    }

    @Override // Q1.o
    public final int a() {
        return this.f7915C;
    }

    @Override // Q1.o
    public final boolean b(o oVar) {
        p pVar = (p) oVar;
        if (!this.f7914B && !Objects.equals(this.f7912n.f18112n, pVar.f7912n.f18112n)) {
            return false;
        }
        this.f7920p.getClass();
        return this.f7916D == pVar.f7916D && this.f7917E == pVar.f7917E;
    }
}
