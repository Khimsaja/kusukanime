package z0;

/* renamed from: z0.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2468s0 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public J5.u f18835k;

    /* renamed from: l, reason: collision with root package name */
    public J5.d f18836l;

    /* renamed from: m, reason: collision with root package name */
    public int f18837m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J5.e f18838n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2468s0(J5.e eVar, S3.c cVar) {
        super(2, cVar);
        this.f18838n = eVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2468s0(this.f18838n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2468s0) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[Catch: all -> 0x0011, TryCatch #1 {all -> 0x0011, blocks: (B:6:0x000d, B:17:0x0033, B:19:0x003b, B:20:0x0049, B:28:0x0060, B:14:0x0026, B:30:0x0063, B:31:0x0067, B:32:0x0068, B:13:0x0020, B:21:0x004a, B:23:0x0056), top: B:41:0x0005, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Type inference failed for: r3v4, types: [J5.u] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:17:0x0033). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f18837m
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            J5.d r1 = r6.f18836l
            J5.u r3 = r6.f18835k
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L11
            goto L33
        L11:
            r7 = move-exception
            goto L70
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            P3.r.Y(r7)
            J5.e r3 = r6.f18838n
            J5.d r7 = new J5.d     // Catch: java.lang.Throwable -> L11
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L11
            r1 = r7
        L26:
            r6.f18835k = r3     // Catch: java.lang.Throwable -> L11
            r6.f18836l = r1     // Catch: java.lang.Throwable -> L11
            r6.f18837m = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = r1.b(r6)     // Catch: java.lang.Throwable -> L11
            if (r7 != r0) goto L33
            return r0
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L11
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L11
            if (r7 == 0) goto L69
            java.lang.Object r7 = r1.c()     // Catch: java.lang.Throwable -> L11
            O3.C r7 = (O3.C) r7     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicBoolean r7 = z0.AbstractC2470t0.f18842b     // Catch: java.lang.Throwable -> L11
            r4 = 0
            r7.set(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r7 = Y.o.f10002b     // Catch: java.lang.Throwable -> L11
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L11
            java.util.concurrent.atomic.AtomicReference r5 = Y.o.f10009i     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L5e
            Y.c r5 = (Y.c) r5     // Catch: java.lang.Throwable -> L5e
            m.B r5 = r5.f9968h     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L60
            boolean r5 = r5.h()     // Catch: java.lang.Throwable -> L5e
            if (r5 != r2) goto L60
            r4 = r2
            goto L60
        L5e:
            r0 = move-exception
            goto L67
        L60:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L26
            Y.o.a()     // Catch: java.lang.Throwable -> L11
            goto L26
        L67:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L69:
            r7 = 0
            r3.e(r7)
            O3.C r7 = O3.C.a
            return r7
        L70:
            throw r7     // Catch: java.lang.Throwable -> L71
        L71:
            r0 = move-exception
            l4.AbstractC1420H.l(r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.C2468s0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
