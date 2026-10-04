package A;

/* loaded from: classes.dex */
public final class c {
    public final Q.d a = new Q.d(new d[16]);

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(g0.d r8, U3.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof A.b
            if (r0 == 0) goto L13
            r0 = r9
            A.b r0 = (A.b) r0
            int r1 = r0.f9q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9q = r1
            goto L18
        L13:
            A.b r0 = new A.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f7o
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f9q
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r8 = r0.f6n
            int r2 = r0.f5m
            java.lang.Object[] r4 = r0.f4l
            g0.d r5 = r0.f3k
            P3.r.Y(r9)
            r9 = r5
            goto L5d
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            P3.r.Y(r9)
            Q.d r9 = r7.a
            int r2 = r9.f7829m
            if (r2 <= 0) goto L60
            java.lang.Object[] r9 = r9.f7827k
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L48:
            r5 = r4[r8]
            A.d r5 = (A.d) r5
            r0.f3k = r9
            r0.f4l = r4
            r0.f5m = r2
            r0.f6n = r8
            r0.f9q = r3
            java.lang.Object r5 = P3.r.T(r5, r9, r0)
            if (r5 != r1) goto L5d
            return r1
        L5d:
            int r8 = r8 + r3
            if (r8 < r2) goto L48
        L60:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.c.a(g0.d, U3.c):java.lang.Object");
    }
}
