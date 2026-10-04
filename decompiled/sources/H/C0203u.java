package H;

import C2.C0034g;
import D.InterfaceC0071p0;
import s0.C1953A;

/* renamed from: H.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203u extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f3013k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3014l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0034g f3015m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2.H f3016n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f3017o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0203u(C0034g c0034g, C2.H h7, InterfaceC0071p0 interfaceC0071p0, S3.c cVar) {
        super(2, cVar);
        this.f3015m = c0034g;
        this.f3016n = h7;
        this.f3017o = interfaceC0071p0;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        C0203u c0203u = new C0203u(this.f3015m, this.f3016n, this.f3017o, cVar);
        c0203u.f3014l = obj;
        return c0203u;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0203u) create((C1953A) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (n6.d.l(r1, r9.f3015m, r9.f3016n, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (n6.d.q(r1, r9.f3017o, r10, r9) == r0) goto L32;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r9.f3013k
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 == r4) goto L18
            if (r1 != r3) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L18:
            P3.r.Y(r10)
            goto L81
        L1c:
            java.lang.Object r1 = r9.f3014l
            s0.A r1 = (s0.C1953A) r1
            P3.r.Y(r10)
            goto L37
        L24:
            P3.r.Y(r10)
            java.lang.Object r10 = r9.f3014l
            r1 = r10
            s0.A r1 = (s0.C1953A) r1
            r9.f3014l = r1
            r9.f3013k = r2
            java.lang.Object r10 = n6.d.c(r1, r9)
            if (r10 != r0) goto L37
            goto L80
        L37:
            s0.h r10 = (s0.C1963h) r10
            boolean r2 = n6.d.L(r10)
            r5 = 0
            if (r2 == 0) goto L6e
            int r2 = r10.f15459c
            r2 = r2 & 33
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r10.a
            int r6 = r2.size()
            r7 = 0
        L4d:
            if (r7 >= r6) goto L5f
            java.lang.Object r8 = r2.get(r7)
            s0.r r8 = (s0.r) r8
            boolean r8 = r8.b()
            if (r8 == 0) goto L5c
            goto L6e
        L5c:
            int r7 = r7 + 1
            goto L4d
        L5f:
            r9.f3014l = r5
            r9.f3013k = r4
            C2.H r2 = r9.f3016n
            C2.g r3 = r9.f3015m
            java.lang.Object r10 = n6.d.l(r1, r3, r2, r10, r9)
            if (r10 != r0) goto L81
            goto L80
        L6e:
            boolean r2 = n6.d.L(r10)
            if (r2 != 0) goto L81
            r9.f3014l = r5
            r9.f3013k = r3
            D.p0 r2 = r9.f3017o
            java.lang.Object r10 = n6.d.q(r1, r2, r10, r9)
            if (r10 != r0) goto L81
        L80:
            return r0
        L81:
            O3.C r10 = O3.C.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: H.C0203u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
