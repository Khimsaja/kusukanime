package s;

import s0.C1953A;

/* loaded from: classes.dex */
public final class Z extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15244k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f15245l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S3.h f15246m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U3.i f15247n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Z(S3.h hVar, e4.n nVar, S3.c cVar) {
        super(2, cVar);
        this.f15246m = hVar;
        this.f15247n = (U3.i) nVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.i, e4.n] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        Z z7 = new Z(this.f15246m, this.f15247n, cVar);
        z7.f15245l = obj;
        return z7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r9 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006c, code lost:
    
        if (r9 == r0) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, s0.A] */
    /* JADX WARN: Type inference failed for: r1v7, types: [U3.i, e4.n] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0057 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006c -> B:12:0x0028). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r8.f15244k
            S3.h r2 = r8.f15246m
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f15245l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f15245l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            java.lang.Object r1 = r8.f15245l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            P3.r.Y(r9)
            java.lang.Object r9 = r8.f15245l
            s0.A r9 = (s0.C1953A) r9
        L3b:
            boolean r1 = H5.D.v(r2)
            if (r1 == 0) goto L70
            U3.i r1 = r8.f15247n     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f15245l = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f15244k = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            goto L6e
        L4e:
            r1 = r9
        L4f:
            r8.f15245l = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f15244k = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = f6.AbstractC0915m.e(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            goto L6e
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = H5.D.v(r2)
            if (r6 == 0) goto L6f
            r8.f15245l = r1
            r8.f15244k = r3
            java.lang.Object r9 = f6.AbstractC0915m.e(r1, r8)
            if (r9 != r0) goto L28
        L6e:
            return r0
        L6f:
            throw r9
        L70:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s.Z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
