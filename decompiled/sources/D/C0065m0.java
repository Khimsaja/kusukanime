package D;

import s0.C1953A;

/* renamed from: D.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0065m0 extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public s0.r f1224k;

    /* renamed from: l, reason: collision with root package name */
    public int f1225l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f1226m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1227n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0065m0(InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f1227n = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0065m0 c0065m0 = new C0065m0(this.f1227n, cVar);
        c0065m0.f1226m = obj;
        return c0065m0;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0065m0) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r13 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0050 -> B:17:0x0053). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.f1225l
            r2 = 1
            r3 = 2
            D.p0 r4 = r12.f1227n
            if (r1 == 0) goto L28
            if (r1 == r2) goto L20
            if (r1 != r3) goto L18
            s0.r r1 = r12.f1224k
            java.lang.Object r2 = r12.f1226m
            s0.A r2 = (s0.C1953A) r2
            P3.r.Y(r13)
            goto L53
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            java.lang.Object r1 = r12.f1226m
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r13)
            goto L3b
        L28:
            P3.r.Y(r13)
            java.lang.Object r13 = r12.f1226m
            r1 = r13
            s0.A r1 = (s0.C1953A) r1
            r12.f1226m = r1
            r12.f1225l = r2
            java.lang.Object r13 = s.c1.c(r1, r12, r3)
            if (r13 != r0) goto L3b
            goto L52
        L3b:
            s0.r r13 = (s0.r) r13
            long r5 = r13.f15470c
            r4.d()
            r2 = r1
            r1 = r13
        L44:
            r12.f1226m = r2
            r12.f1224k = r1
            r12.f1225l = r3
            s0.i r13 = s0.EnumC1964i.f15462l
            java.lang.Object r13 = r2.b(r13, r12)
            if (r13 != r0) goto L53
        L52:
            return r0
        L53:
            s0.h r13 = (s0.C1963h) r13
            java.lang.Object r13 = r13.a
            int r5 = r13.size()
            r6 = 0
        L5c:
            if (r6 >= r5) goto L76
            java.lang.Object r7 = r13.get(r6)
            s0.r r7 = (s0.r) r7
            long r8 = r7.a
            long r10 = r1.a
            boolean r8 = s0.q.a(r8, r10)
            if (r8 == 0) goto L73
            boolean r7 = r7.f15471d
            if (r7 == 0) goto L73
            goto L44
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r4.b()
            O3.C r13 = O3.C.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0065m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
