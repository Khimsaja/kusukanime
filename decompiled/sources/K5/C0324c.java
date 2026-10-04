package K5;

/* renamed from: K5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324c extends L5.g {

    /* renamed from: n, reason: collision with root package name */
    public final U3.j f4803n;

    /* renamed from: o, reason: collision with root package name */
    public final U3.j f4804o;

    /* JADX WARN: Multi-variable type inference failed */
    public C0324c(e4.n nVar, S3.h hVar, int i7, J5.c cVar) {
        super(hVar, i7, cVar);
        U3.j jVar = (U3.j) nVar;
        this.f4803n = jVar;
        this.f4804o = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [J5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7, types: [J5.t] */
    /* JADX WARN: Type inference failed for: r7v3, types: [U3.j, e4.n] */
    @Override // L5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(J5.t r6, S3.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof K5.C0323b
            if (r0 == 0) goto L13
            r0 = r7
            K5.b r0 = (K5.C0323b) r0
            int r1 = r0.f4802n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4802n = r1
            goto L1a
        L13:
            K5.b r0 = new K5.b
            U3.c r7 = (U3.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.f4800l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4802n
            O3.C r3 = O3.C.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            J5.t r6 = r0.f4799k
            P3.r.Y(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            P3.r.Y(r7)
            r0.f4799k = r6
            r0.f4802n = r4
            U3.j r7 = r5.f4803n
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            J5.j r6 = (J5.j) r6
            J5.e r6 = r6.f4337n
            boolean r6 = r6.isClosedForSend()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.C0324c.d(J5.t, S3.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [U3.j, e4.n] */
    @Override // L5.g
    public final L5.g e(S3.h hVar, int i7, J5.c cVar) {
        return new C0324c(this.f4804o, hVar, i7, cVar);
    }

    @Override // L5.g
    public final String toString() {
        return "block[" + this.f4803n + "] -> " + super.toString();
    }
}
