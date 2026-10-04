package K5;

/* renamed from: K5.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0336o implements InterfaceC0329h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0329h f4837k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U3.j f4838l;

    /* JADX WARN: Multi-variable type inference failed */
    public C0336o(InterfaceC0329h interfaceC0329h, e4.o oVar) {
        this.f4837k = interfaceC0329h;
        this.f4838l = (U3.j) oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v4, types: [U3.j, e4.o] */
    /* JADX WARN: Type inference failed for: r9v6, types: [U3.j, e4.o] */
    @Override // K5.InterfaceC0329h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(K5.InterfaceC0330i r9, S3.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof K5.C0335n
            if (r0 == 0) goto L13
            r0 = r10
            K5.n r0 = (K5.C0335n) r0
            int r1 = r0.f4833l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4833l = r1
            goto L18
        L13:
            K5.n r0 = new K5.n
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f4832k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f4833l
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r9 = r0.f4835n
            L5.t r9 = (L5.t) r9
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r10 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.f4835n
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            P3.r.Y(r10)
            goto La0
        L44:
            K5.i r9 = r0.f4836o
            java.lang.Object r2 = r0.f4835n
            K5.o r2 = (K5.C0336o) r2
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L4e
            goto L63
        L4e:
            r9 = move-exception
            goto L8c
        L50:
            P3.r.Y(r10)
            K5.h r10 = r8.f4837k     // Catch: java.lang.Throwable -> L8a
            r0.f4835n = r8     // Catch: java.lang.Throwable -> L8a
            r0.f4836o = r9     // Catch: java.lang.Throwable -> L8a
            r0.f4833l = r5     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L8a
            if (r10 != r1) goto L62
            goto L9f
        L62:
            r2 = r8
        L63:
            L5.t r10 = new L5.t
            S3.h r4 = r0.getContext()
            r10.<init>(r9, r4)
            U3.j r9 = r2.f4838l     // Catch: java.lang.Throwable -> L82
            r0.f4835n = r10     // Catch: java.lang.Throwable -> L82
            r0.f4836o = r6     // Catch: java.lang.Throwable -> L82
            r0.f4833l = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L82
            if (r9 != r1) goto L7b
            goto L9f
        L7b:
            r9 = r10
        L7c:
            r9.releaseIntercepted()
            O3.C r9 = O3.C.a
            return r9
        L82:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L86:
            r9.releaseIntercepted()
            throw r10
        L8a:
            r9 = move-exception
            r2 = r8
        L8c:
            K5.a0 r10 = new K5.a0
            r10.<init>(r9)
            U3.j r2 = r2.f4838l
            r0.f4835n = r9
            r0.f4836o = r6
            r0.f4833l = r4
            java.lang.Object r10 = K5.N.c(r10, r2, r9, r0)
            if (r10 != r1) goto La0
        L9f:
            return r1
        La0:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.C0336o.collect(K5.i, S3.c):java.lang.Object");
    }
}
