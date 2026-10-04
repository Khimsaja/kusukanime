package L;

import p.C1743c;

/* renamed from: L.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358c2 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f5475k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1743c f5476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f5477m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5478n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u.i f5479o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ O.Z f5480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0358c2(C1743c c1743c, float f5, boolean z7, u.i iVar, O.Z z8, S3.c cVar) {
        super(2, cVar);
        this.f5476l = c1743c;
        this.f5477m = f5;
        this.f5478n = z7;
        this.f5479o = iVar;
        this.f5480p = z8;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C0358c2(this.f5476l, this.f5477m, this.f5478n, this.f5479o, this.f5480p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0358c2) create((H5.A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r8.e(r7, r1) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (M.AbstractC0464w.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
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
            int r1 = r7.f5475k
            u.i r2 = r7.f5479o
            O.Z r3 = r7.f5480p
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            P3.r.Y(r8)
            goto L55
        L1d:
            P3.r.Y(r8)
            p.c r8 = r7.f5476l
            O.g0 r1 = r8.f13960e
            java.lang.Object r1 = r1.getValue()
            T0.e r1 = (T0.e) r1
            float r1 = r1.f8839k
            float r6 = r7.f5477m
            boolean r1 = T0.e.a(r1, r6)
            if (r1 != 0) goto L58
            boolean r1 = r7.f5478n
            if (r1 != 0) goto L46
            T0.e r1 = new T0.e
            r1.<init>(r6)
            r7.f5475k = r5
            java.lang.Object r8 = r8.e(r7, r1)
            if (r8 != r0) goto L55
            goto L54
        L46:
            java.lang.Object r1 = r3.getValue()
            u.i r1 = (u.i) r1
            r7.f5475k = r4
            java.lang.Object r8 = M.AbstractC0464w.a(r8, r6, r1, r2, r7)
            if (r8 != r0) goto L55
        L54:
            return r0
        L55:
            r3.setValue(r2)
        L58:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L.C0358c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
