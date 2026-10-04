package H2;

import G2.C0174k;
import O3.C;
import p.C1746d0;

/* loaded from: classes.dex */
public final class v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3653k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f3654l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1746d0 f3655m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0174k f3656n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(float f5, C1746d0 c1746d0, C0174k c0174k, S3.c cVar) {
        super(2, cVar);
        this.f3654l = f5;
        this.f3655m = c1746d0;
        this.f3656n = c0174k;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new v(this.f3654l, this.f3655m, this.f3656n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[RETURN] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f3653k
            O3.C r2 = O3.C.a
            p.d0 r3 = r8.f3655m
            r4 = 0
            float r5 = r8.f3654l
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L23
            if (r1 == r7) goto L1f
            if (r1 != r6) goto L17
            P3.r.Y(r9)
            return r2
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            P3.r.Y(r9)
            goto L39
        L23:
            P3.r.Y(r9)
            int r9 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r9 <= 0) goto L39
            r8.f3653k = r7
            O.g0 r9 = r3.f13982l
            java.lang.Object r9 = r9.getValue()
            java.lang.Object r9 = r3.S0(r5, r9, r8)
            if (r9 != r0) goto L39
            goto L70
        L39:
            int r9 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r9 != 0) goto L71
            r8.f3653k = r6
            p.u0 r9 = r3.f13985o
            if (r9 != 0) goto L45
        L43:
            r9 = r2
            goto L6e
        L45:
            O.g0 r1 = r3.f13983m
            java.lang.Object r1 = r1.getValue()
            G2.k r4 = r8.f3656n
            boolean r1 = kotlin.jvm.internal.l.a(r1, r4)
            if (r1 == 0) goto L60
            O.g0 r1 = r3.f13982l
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.l.a(r1, r4)
            if (r1 == 0) goto L60
            goto L43
        L60:
            p.a0 r1 = new p.a0
            r5 = 0
            r1.<init>(r5, r4, r3, r9)
            p.Q r9 = r3.f13991u
            java.lang.Object r9 = p.C1730Q.a(r9, r1, r8)
            if (r9 != r0) goto L43
        L6e:
            if (r9 != r0) goto L71
        L70:
            return r0
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
