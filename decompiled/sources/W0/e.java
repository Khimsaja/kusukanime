package W0;

import H5.A;
import O3.C;

/* loaded from: classes.dex */
public final class e extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f9525k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f9526l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f9527m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9528n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z7, i iVar, long j7, S3.c cVar) {
        super(2, cVar);
        this.f9526l = z7;
        this.f9527m = iVar;
        this.f9528n = j7;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new e(this.f9526l, this.f9527m, this.f9528n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r11.f9544k.a(0, r10.f9528n, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r11.f9544k.a(r10.f9528n, 0, r10) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        return r0;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r10.f9525k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            P3.r.Y(r11)
            goto L47
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            P3.r.Y(r11)
            r6 = r10
            goto L47
        L1d:
            P3.r.Y(r11)
            W0.i r11 = r10.f9527m
            boolean r1 = r10.f9526l
            if (r1 != 0) goto L37
            r10.f9525k = r3
            r5 = 0
            long r7 = r10.f9528n
            r0.e r4 = r11.f9544k
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            r6 = r9
            if (r11 != r0) goto L47
            goto L46
        L37:
            r6 = r10
            r6.f9525k = r2
            long r2 = r6.f9528n
            r4 = 0
            r0.e r1 = r11.f9544k
            java.lang.Object r11 = r1.a(r2, r4, r6)
            if (r11 != r0) goto L47
        L46:
            return r0
        L47:
            O3.C r11 = O3.C.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
