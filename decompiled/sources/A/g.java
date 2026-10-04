package A;

import H5.A;
import O3.C;
import e4.InterfaceC0821a;
import e4.n;
import y0.Y;

/* loaded from: classes.dex */
public final class g extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f15k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f16l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y f17m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f18n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(k kVar, Y y7, InterfaceC0821a interfaceC0821a, S3.c cVar) {
        super(2, cVar);
        this.f16l = kVar;
        this.f17m = y7;
        this.f18n = (kotlin.jvm.internal.m) interfaceC0821a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new g(this.f16l, this.f17m, this.f18n, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Type inference failed for: r6v0, types: [e4.a, kotlin.jvm.internal.m] */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r12.f15k
            O3.C r2 = O3.C.a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            P3.r.Y(r13)
            return r2
        Lf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L17:
            P3.r.Y(r13)
            A.k r13 = r12.f16l
            s.l r1 = r13.f32x
            A.f r4 = new A.f
            y0.Y r5 = r12.f17m
            kotlin.jvm.internal.m r6 = r12.f18n
            r4.<init>(r13, r5, r6)
            r12.f15k = r3
            r1.getClass()
            java.lang.Object r13 = r4.invoke()
            g0.d r13 = (g0.d) r13
            if (r13 == 0) goto Ld1
            long r5 = r1.f15333F
            boolean r13 = r1.I0(r13, r5)
            if (r13 != 0) goto Ld1
            H5.k r13 = new H5.k
            S3.c r5 = P3.r.E(r12)
            r13.<init>(r3, r5)
            r13.r()
            s.i r5 = new s.i
            r5.<init>(r4, r13)
            s.b r6 = r1.f15329B
            r6.getClass()
            java.lang.Object r4 = r4.invoke()
            g0.d r4 = (g0.d) r4
            if (r4 != 0) goto L5e
            r13.resumeWith(r2)
            goto Lc8
        L5e:
            p.K r7 = new p.K
            r8 = 9
            r7.<init>(r8, r6, r5)
            r13.t(r7)
            k4.g r7 = new k4.g
            Q.d r6 = r6.a
            int r8 = r6.f7829m
            int r8 = r8 - r3
            r9 = 0
            r7.<init>(r9, r8, r3)
            int r7 = r7.f12673l
            if (r7 < 0) goto Lbe
        L77:
            java.lang.Object[] r8 = r6.f7827k
            r8 = r8[r7]
            s.i r8 = (s.C1918i) r8
            A.f r8 = r8.a
            java.lang.Object r8 = r8.invoke()
            g0.d r8 = (g0.d) r8
            if (r8 != 0) goto L88
            goto Lb9
        L88:
            g0.d r10 = r4.d(r8)
            boolean r11 = r10.equals(r4)
            if (r11 == 0) goto L97
            int r7 = r7 + r3
            r6.a(r7, r5)
            goto Lc1
        L97:
            boolean r8 = r10.equals(r8)
            if (r8 != 0) goto Lb9
            java.util.concurrent.CancellationException r8 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "bringIntoView call interrupted by a newer, non-overlapping call"
            r8.<init>(r10)
            int r10 = r6.f7829m
            int r10 = r10 - r3
            if (r10 > r7) goto Lb9
        La9:
            java.lang.Object[] r11 = r6.f7827k
            r11 = r11[r7]
            s.i r11 = (s.C1918i) r11
            H5.k r11 = r11.f15307b
            r11.cancel(r8)
            if (r10 == r7) goto Lb9
            int r10 = r10 + 1
            goto La9
        Lb9:
            if (r7 == 0) goto Lbe
            int r7 = r7 + (-1)
            goto L77
        Lbe:
            r6.a(r9, r5)
        Lc1:
            boolean r3 = r1.f15334G
            if (r3 != 0) goto Lc8
            r1.J0()
        Lc8:
            java.lang.Object r13 = r13.q()
            T3.a r1 = T3.a.f9048k
            if (r13 != r1) goto Ld1
            goto Ld2
        Ld1:
            r13 = r2
        Ld2:
            if (r13 != r0) goto Ld5
            return r0
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
