package r3;

import H5.A;
import K5.Y;
import O3.C;

/* loaded from: classes.dex */
public final class l extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public Y f14897k;

    /* renamed from: l, reason: collision with root package name */
    public int f14898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m f14899m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f14900n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f14901o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ B3.m f14902p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, String str2, B3.m mVar2, S3.c cVar) {
        super(2, cVar);
        this.f14899m = mVar;
        this.f14900n = str;
        this.f14901o = str2;
        this.f14902p = mVar2;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new l(this.f14899m, this.f14900n, this.f14901o, this.f14902p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r3.m.e(r7, r0, r14) != r6) goto L28;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            r14 = this;
            T3.a r6 = T3.a.f9048k
            int r0 = r14.f14898l
            r3.m r7 = r14.f14899m
            r8 = 3
            r9 = 2
            r1 = 1
            r10 = 0
            K5.Y r11 = r7.f14917p
            K5.Y r12 = r7.f14903b
            if (r0 == 0) goto L30
            if (r0 == r1) goto L2c
            if (r0 == r9) goto L24
            if (r0 != r8) goto L1c
            P3.r.Y(r15)     // Catch: java.lang.Throwable -> L1a
            goto L71
        L1a:
            r0 = move-exception
            goto L75
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            K5.Y r0 = r14.f14897k
            P3.r.Y(r15)     // Catch: java.lang.Throwable -> L1a
            r1 = r0
            r0 = r15
            goto L5d
        L2c:
            P3.r.Y(r15)     // Catch: java.lang.Throwable -> L1a
            goto L4b
        L30:
            P3.r.Y(r15)
            com.kusukanime.data.UserRepo r0 = r7.f14919r     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r7.f14920s     // Catch: java.lang.Throwable -> L1a
            r3 = r2
            java.lang.String r2 = r7.f14921t     // Catch: java.lang.Throwable -> L1a
            r4 = r3
            java.lang.String r3 = r14.f14900n     // Catch: java.lang.Throwable -> L1a
            r13 = r4
            java.lang.String r4 = r14.f14901o     // Catch: java.lang.Throwable -> L1a
            r14.f14898l = r1     // Catch: java.lang.Throwable -> L1a
            r5 = r14
            r1 = r13
            java.lang.Object r0 = r0.addComment(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            if (r0 != r6) goto L4b
            goto L70
        L4b:
            com.kusukanime.data.UserRepo r0 = r7.f14919r     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r7.f14920s     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = r7.f14921t     // Catch: java.lang.Throwable -> L1a
            r14.f14897k = r12     // Catch: java.lang.Throwable -> L1a
            r14.f14898l = r9     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r0.comments(r1, r2, r14)     // Catch: java.lang.Throwable -> L1a
            if (r0 != r6) goto L5c
            goto L70
        L5c:
            r1 = r12
        L5d:
            r1.h(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r12.getValue()     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L1a
            r14.f14897k = r10     // Catch: java.lang.Throwable -> L1a
            r14.f14898l = r8     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r3.m.e(r7, r0, r14)     // Catch: java.lang.Throwable -> L1a
            if (r0 != r6) goto L71
        L70:
            return r6
        L71:
            r11.h(r10)     // Catch: java.lang.Throwable -> L1a
            goto L8a
        L75:
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L82
            r1 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = z5.AbstractC2510o.I0(r1, r0)
            goto L84
        L82:
            java.lang.String r0 = "Gagal kirim komentar"
        L84:
            r11.getClass()
            r11.i(r10, r0)
        L8a:
            B3.m r0 = r14.f14902p
            r0.invoke()
            O3.C r0 = O3.C.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
