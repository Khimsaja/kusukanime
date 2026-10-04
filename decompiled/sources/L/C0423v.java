package L;

import p.C1743c;

/* renamed from: L.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423v extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5869k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5870l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5871m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5872n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0426w f5873o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ u.i f5874p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0423v(C1743c c1743c, float f5, boolean z7, C0426w c0426w, u.i iVar, S3.c cVar) {
        super(2, cVar);
        this.f5870l = c1743c;
        this.f5871m = f5;
        this.f5872n = z7;
        this.f5873o = c0426w;
        this.f5874p = iVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0423v(this.f5870l, this.f5871m, this.f5872n, this.f5873o, this.f5874p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0423v) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r8.e(r7, r1) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (M.AbstractC0464w.a(r8, r4, r1, r7.f5874p, r7) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        return r0;
     */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r7.f5869k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            P3.r.Y(r8)
            goto L86
        L19:
            P3.r.Y(r8)
            p.c r8 = r7.f5870l
            O.g0 r1 = r8.f13960e
            java.lang.Object r1 = r1.getValue()
            T0.e r1 = (T0.e) r1
            float r1 = r1.f8839k
            float r4 = r7.f5871m
            boolean r1 = T0.e.a(r1, r4)
            if (r1 != 0) goto L86
            boolean r1 = r7.f5872n
            if (r1 != 0) goto L42
            T0.e r1 = new T0.e
            r1.<init>(r4)
            r7.f5869k = r3
            java.lang.Object r8 = r8.e(r7, r1)
            if (r8 != r0) goto L86
            goto L85
        L42:
            O.g0 r1 = r8.f13960e
            java.lang.Object r1 = r1.getValue()
            T0.e r1 = (T0.e) r1
            float r1 = r1.f8839k
            L.w r3 = r7.f5873o
            float r5 = r3.f5881b
            boolean r5 = T0.e.a(r1, r5)
            if (r5 == 0) goto L5e
            u.m r1 = new u.m
            r5 = 0
            r1.<init>(r5)
            goto L7b
        L5e:
            float r5 = r3.f5883d
            boolean r5 = T0.e.a(r1, r5)
            if (r5 == 0) goto L6c
            u.g r1 = new u.g
            r1.<init>()
            goto L7b
        L6c:
            float r3 = r3.f5882c
            boolean r1 = T0.e.a(r1, r3)
            if (r1 == 0) goto L7a
            u.d r1 = new u.d
            r1.<init>()
            goto L7b
        L7a:
            r1 = 0
        L7b:
            r7.f5869k = r2
            u.i r2 = r7.f5874p
            java.lang.Object r8 = M.AbstractC0464w.a(r8, r4, r1, r2, r7)
            if (r8 != r0) goto L86
        L85:
            return r0
        L86:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L.C0423v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
