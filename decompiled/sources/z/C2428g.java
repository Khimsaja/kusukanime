package z;

import s0.C1953A;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2428g extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public s0.r f18464k;

    /* renamed from: l, reason: collision with root package name */
    public s0.r f18465l;

    /* renamed from: m, reason: collision with root package name */
    public int f18466m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f18467n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2425d f18468o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2428g(C2425d c2425d, S3.c cVar) {
        super(2, cVar);
        this.f18468o = c2425d;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C2428g c2428g = new C2428g(this.f18468o, cVar);
        c2428g.f18467n = obj;
        return c2428g;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2428g) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (r13 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r13 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.f18466m
            z.d r2 = r12.f18468o
            s0.i r3 = s0.EnumC1964i.f15461k
            r4 = 1
            O.g0 r2 = r2.a
            r5 = 2
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r4) goto L27
            if (r1 != r5) goto L1f
            s0.r r1 = r12.f18465l
            s0.r r4 = r12.f18464k
            java.lang.Object r7 = r12.f18467n
            s0.A r7 = (s0.C1953A) r7
            P3.r.Y(r13)
            goto L63
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            java.lang.Object r1 = r12.f18467n
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r13)
            goto L42
        L2f:
            P3.r.Y(r13)
            java.lang.Object r13 = r12.f18467n
            r1 = r13
            s0.A r1 = (s0.C1953A) r1
            r12.f18467n = r1
            r12.f18466m = r4
            java.lang.Object r13 = s.c1.b(r1, r6, r3, r12)
            if (r13 != r0) goto L42
            goto L62
        L42:
            s0.r r13 = (s0.r) r13
            g0.c r4 = new g0.c
            r7 = 0
            r4.<init>(r7)
            r2.setValue(r4)
            r4 = 0
            r7 = r1
            r1 = r4
            r4 = r13
        L52:
            if (r1 != 0) goto L88
            r12.f18467n = r7
            r12.f18464k = r4
            r12.f18465l = r1
            r12.f18466m = r5
            java.lang.Object r13 = r7.b(r3, r12)
            if (r13 != r0) goto L63
        L62:
            return r0
        L63:
            s0.h r13 = (s0.C1963h) r13
            java.lang.Object r8 = r13.a
            int r9 = r8.size()
            r10 = r6
        L6c:
            if (r10 >= r9) goto L7e
            java.lang.Object r11 = r8.get(r10)
            s0.r r11 = (s0.r) r11
            boolean r11 = s0.AbstractC1971p.b(r11)
            if (r11 != 0) goto L7b
            goto L52
        L7b:
            int r10 = r10 + 1
            goto L6c
        L7e:
            java.lang.Object r13 = r13.a
            java.lang.Object r13 = r13.get(r6)
            r1 = r13
            s0.r r1 = (s0.r) r1
            goto L52
        L88:
            long r3 = r4.f15470c
            long r0 = r1.f15470c
            long r0 = g0.c.g(r0, r3)
            g0.c r13 = new g0.c
            r13.<init>(r0)
            r2.setValue(r13)
            O3.C r13 = O3.C.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2428g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
