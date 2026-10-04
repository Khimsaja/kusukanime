package H2;

import G2.C0174k;
import O3.C;
import p.C1746d0;
import p.u0;

/* loaded from: classes.dex */
public final class w extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3657k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3658l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f3659m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0174k f3660n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0 f3661o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C1746d0 c1746d0, C0174k c0174k, u0 u0Var, S3.c cVar) {
        super(2, cVar);
        this.f3659m = c1746d0;
        this.f3660n = c0174k;
        this.f3661o = u0Var;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        w wVar = new w(this.f3659m, this.f3660n, this.f3661o, cVar);
        wVar.f3658l = obj;
        return wVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            T3.a r6 = T3.a.f9048k
            int r0 = r14.f3657k
            O3.C r7 = O3.C.a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            P3.r.Y(r15)
            return r7
        L12:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1a:
            P3.r.Y(r15)
            return r7
        L1e:
            P3.r.Y(r15)
            java.lang.Object r0 = r14.f3658l
            H5.A r0 = (H5.A) r0
            p.d0 r3 = r14.f3659m
            O.g0 r5 = r3.f13983m
            java.lang.Object r5 = r5.getValue()
            G2.k r8 = r14.f3660n
            boolean r5 = kotlin.jvm.internal.l.a(r5, r8)
            r9 = 0
            if (r5 != 0) goto L4f
            r14.f3657k = r2
            p.u0 r0 = r3.f13985o
            if (r0 != 0) goto L3d
            goto L4b
        L3d:
            p.V r1 = new p.V
            r1.<init>(r9, r8, r3, r0)
            p.Q r0 = r3.f13991u
            java.lang.Object r0 = p.C1730Q.a(r0, r1, r14)
            if (r0 != r6) goto L4b
            goto L4c
        L4b:
            r0 = r7
        L4c:
            if (r0 != r6) goto L89
            goto L88
        L4f:
            p.u0 r2 = r14.f3661o
            O.E r2 = r2.f14144l
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r10 = r2.longValue()
            r2 = 1000000(0xf4240, float:1.401298E-39)
            long r12 = (long) r2
            long r10 = r10 / r12
            O.c0 r2 = r3.f13988r
            float r5 = r2.f()
            float r2 = r2.f()
            float r10 = (float) r10
            float r2 = r2 * r10
            int r2 = (int) r2
            r10 = 0
            r11 = 6
            p.A0 r2 = p.AbstractC1745d.q(r2, r10, r9, r11)
            D.K r9 = new D.K
            r10 = 2
            r9.<init>(r0, r3, r8, r10)
            r14.f3657k = r1
            r1 = 0
            r0 = r5
            r5 = 4
            r4 = r14
            r3 = r9
            java.lang.Object r0 = p.AbstractC1745d.e(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L89
        L88:
            return r6
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
