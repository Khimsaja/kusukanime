package s3;

/* loaded from: classes.dex */
public final class M extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f15597k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ N f15598l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f15599m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(N n7, String str, S3.c cVar) {
        super(2, cVar);
        this.f15598l = n7;
        this.f15599m = str;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new M(this.f15598l, this.f15599m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r12 == r0) goto L21;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r11.f15597k
            O3.C r2 = O3.C.a
            r3 = 2
            r4 = 1
            s3.N r5 = r11.f15598l
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            P3.r.Y(r12)     // Catch: java.lang.Throwable -> Lce
            goto L45
        L14:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1c:
            P3.r.Y(r12)     // Catch: java.lang.Throwable -> Lce
            goto L2e
        L20:
            P3.r.Y(r12)
            com.kusukanime.data.SessionGate r12 = com.kusukanime.data.SessionGate.INSTANCE     // Catch: java.lang.Throwable -> Lce
            r11.f15597k = r4     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r12 = r12.ensure(r11)     // Catch: java.lang.Throwable -> Lce
            if (r12 != r0) goto L2e
            goto L44
        L2e:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> Lce
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> Lce
            if (r12 != 0) goto L38
            goto Lce
        L38:
            com.kusukanime.data.UserRepo r12 = r5.f15607i     // Catch: java.lang.Throwable -> Lce
            r11.f15597k = r3     // Catch: java.lang.Throwable -> Lce
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.Object r12 = r12.history(r1, r11)     // Catch: java.lang.Throwable -> Lce
            if (r12 != r0) goto L45
        L44:
            return r0
        L45:
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r11.f15599m     // Catch: java.lang.Throwable -> Lce
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lce
            r1.<init>()     // Catch: java.lang.Throwable -> Lce
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> Lce
        L52:
            boolean r3 = r12.hasNext()     // Catch: java.lang.Throwable -> Lce
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r12.next()     // Catch: java.lang.Throwable -> Lce
            r4 = r3
            com.kusukanime.data.HistoryRow r4 = (com.kusukanime.data.HistoryRow) r4     // Catch: java.lang.Throwable -> Lce
            java.lang.String r4 = r4.getAnime_slug()     // Catch: java.lang.Throwable -> Lce
            boolean r4 = kotlin.jvm.internal.l.a(r4, r0)     // Catch: java.lang.Throwable -> Lce
            if (r4 == 0) goto L52
            r1.add(r3)     // Catch: java.lang.Throwable -> Lce
            goto L52
        L6d:
            K5.Y r12 = r5.f15608j     // Catch: java.lang.Throwable -> Lce
            r0 = 10
            int r0 = P3.r.p(r1, r0)     // Catch: java.lang.Throwable -> Lce
            int r0 = P3.F.I(r0)     // Catch: java.lang.Throwable -> Lce
            r3 = 16
            if (r0 >= r3) goto L7e
            r0 = r3
        L7e:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lce
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lce
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> Lce
        L87:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> Lce
            if (r4 == 0) goto Lb6
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> Lce
            com.kusukanime.data.HistoryRow r4 = (com.kusukanime.data.HistoryRow) r4     // Catch: java.lang.Throwable -> Lce
            long r6 = r4.getDuration_ms()     // Catch: java.lang.Throwable -> Lce
            float r6 = (float) r6     // Catch: java.lang.Throwable -> Lce
            java.lang.String r7 = r4.getEpisode_slug()     // Catch: java.lang.Throwable -> Lce
            r8 = 0
            int r9 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r9 <= 0) goto Lad
            long r9 = r4.getPosition_ms()     // Catch: java.lang.Throwable -> Lce
            float r4 = (float) r9     // Catch: java.lang.Throwable -> Lce
            float r4 = r4 / r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r8 = e3.c.j(r4, r8, r6)     // Catch: java.lang.Throwable -> Lce
        Lad:
            java.lang.Float r4 = new java.lang.Float     // Catch: java.lang.Throwable -> Lce
            r4.<init>(r8)     // Catch: java.lang.Throwable -> Lce
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> Lce
            goto L87
        Lb6:
            r12.getClass()     // Catch: java.lang.Throwable -> Lce
            r0 = 0
            r12.i(r0, r3)     // Catch: java.lang.Throwable -> Lce
            K5.Y r12 = r5.f15610l     // Catch: java.lang.Throwable -> Lce
            java.lang.Object r1 = P3.q.t0(r1)     // Catch: java.lang.Throwable -> Lce
            com.kusukanime.data.HistoryRow r1 = (com.kusukanime.data.HistoryRow) r1     // Catch: java.lang.Throwable -> Lce
            if (r1 == 0) goto Lcb
            java.lang.String r0 = r1.getEpisode_slug()     // Catch: java.lang.Throwable -> Lce
        Lcb:
            r12.h(r0)     // Catch: java.lang.Throwable -> Lce
        Lce:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
