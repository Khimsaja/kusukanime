package s;

import r0.InterfaceC1860a;

/* renamed from: s.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1927m0 implements InterfaceC1860a {

    /* renamed from: k, reason: collision with root package name */
    public final D0 f15348k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15349l;

    public C1927m0(D0 d02, boolean z7) {
        this.f15348k = d02;
        this.f15349l = z7;
    }

    @Override // r0.InterfaceC1860a
    public final long M(int i7, long j7, long j8) {
        if (!this.f15349l) {
            return 0L;
        }
        D0 d02 = this.f15348k;
        if (d02.a.b()) {
            return 0L;
        }
        return d02.g(d02.c(d02.a.d(d02.c(d02.f(j8)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r0.InterfaceC1860a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(long r3, long r5, S3.c r7) throws java.lang.Throwable {
        /*
            r2 = this;
            boolean r3 = r7 instanceof s.C1925l0
            if (r3 == 0) goto L13
            r3 = r7
            s.l0 r3 = (s.C1925l0) r3
            int r4 = r3.f15341n
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f15341n = r4
            goto L1a
        L13:
            s.l0 r3 = new s.l0
            U3.c r7 = (U3.c) r7
            r3.<init>(r2, r7)
        L1a:
            java.lang.Object r4 = r3.f15339l
            T3.a r7 = T3.a.f9048k
            int r0 = r3.f15341n
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2b
            long r5 = r3.f15338k
            P3.r.Y(r4)
            goto L47
        L2b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L33:
            P3.r.Y(r4)
            boolean r4 = r2.f15349l
            if (r4 == 0) goto L50
            r3.f15338k = r5
            r3.f15341n = r1
            s.D0 r4 = r2.f15348k
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L47
            return r7
        L47:
            T0.o r4 = (T0.o) r4
            long r3 = r4.a
            long r3 = T0.o.d(r5, r3)
            goto L52
        L50:
            r3 = 0
        L52:
            T0.o r5 = new T0.o
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1927m0.Y(long, long, S3.c):java.lang.Object");
    }
}
