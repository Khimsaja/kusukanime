package q;

import s0.C1953A;

/* renamed from: q.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1829k extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f14568k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f14569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1831m f14570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829k(C1831m c1831m, S3.c cVar) {
        super(2, cVar);
        this.f14570m = c1831m;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C1829k c1829k = new C1829k(this.f14570m, cVar);
        c1829k.f14569l = obj;
        return c1829k;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1829k) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0057 -> B:17:0x005a). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.f14568k
            r2 = 2
            r3 = 1
            q.m r4 = r12.f14570m
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r1 = r12.f14569l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r13)
            goto L5a
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            java.lang.Object r1 = r12.f14569l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r13)
            goto L39
        L26:
            P3.r.Y(r13)
            java.lang.Object r13 = r12.f14569l
            r1 = r13
            s0.A r1 = (s0.C1953A) r1
            r12.f14569l = r1
            r12.f14568k = r3
            java.lang.Object r13 = s.c1.c(r1, r12, r2)
            if (r13 != r0) goto L39
            goto L59
        L39:
            s0.r r13 = (s0.r) r13
            long r5 = r13.a
            s0.q r3 = new s0.q
            r3.<init>(r5)
            r4.f14584q = r3
            g0.c r3 = new g0.c
            long r5 = r13.f15470c
            r3.<init>(r5)
            r4.f14578k = r3
        L4d:
            r12.f14569l = r1
            r12.f14568k = r2
            s0.i r13 = s0.EnumC1964i.f15462l
            java.lang.Object r13 = r1.b(r13, r12)
            if (r13 != r0) goto L5a
        L59:
            return r0
        L5a:
            s0.h r13 = (s0.C1963h) r13
            java.lang.Object r13 = r13.a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r13.size()
            r3.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L6d:
            if (r7 >= r5) goto L80
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            s0.r r9 = (s0.r) r9
            boolean r9 = r9.f15471d
            if (r9 == 0) goto L7d
            r3.add(r8)
        L7d:
            int r7 = r7 + 1
            goto L6d
        L80:
            int r13 = r3.size()
        L84:
            r5 = 0
            if (r6 >= r13) goto L9e
            java.lang.Object r7 = r3.get(r6)
            r8 = r7
            s0.r r8 = (s0.r) r8
            long r8 = r8.a
            s0.q r10 = r4.f14584q
            if (r10 != 0) goto L95
            goto L9b
        L95:
            long r10 = r10.a
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L9f
        L9b:
            int r6 = r6 + 1
            goto L84
        L9e:
            r7 = r5
        L9f:
            s0.r r7 = (s0.r) r7
            if (r7 != 0) goto Laa
            java.lang.Object r13 = P3.q.t0(r3)
            r7 = r13
            s0.r r7 = (s0.r) r7
        Laa:
            if (r7 == 0) goto Lbe
            s0.q r13 = new s0.q
            long r8 = r7.a
            r13.<init>(r8)
            r4.f14584q = r13
            g0.c r13 = new g0.c
            long r6 = r7.f15470c
            r13.<init>(r6)
            r4.f14578k = r13
        Lbe:
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L4d
            r4.f14584q = r5
            O3.C r13 = O3.C.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1829k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
