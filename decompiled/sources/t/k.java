package t;

/* loaded from: classes.dex */
public abstract class k {
    public static final float a = 400;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(s.C1950y0 r5, float r6, p.C1761m r7, p.C1772x r8, t.C2023c r9, U3.c r10) {
        /*
            boolean r0 = r10 instanceof t.C2028h
            if (r0 == 0) goto L13
            r0 = r10
            t.h r0 = (t.C2028h) r0
            int r1 = r0.f15868o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15868o = r1
            goto L18
        L13:
            t.h r0 = new t.h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f15867n
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15868o
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r6 = r0.f15864k
            kotlin.jvm.internal.u r5 = r0.f15866m
            p.m r7 = r0.f15865l
            P3.r.Y(r10)
            goto L65
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            P3.r.Y(r10)
            kotlin.jvm.internal.u r10 = new kotlin.jvm.internal.u
            r10.<init>()
            java.lang.Object r2 = r7.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L4e
            r2 = r3
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r2 = r2 ^ r3
            t.i r4 = new t.i
            r4.<init>(r6, r10, r5, r9)
            r0.f15865l = r7
            r0.f15866m = r10
            r0.f15864k = r6
            r0.f15868o = r3
            java.lang.Object r5 = p.AbstractC1745d.f(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            r5 = r10
        L65:
            t.a r8 = new t.a
            float r5 = r5.f12717k
            float r6 = r6 - r5
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.a(s.y0, float, p.m, p.x, t.c, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(s.C1950y0 r9, float r10, float r11, p.C1761m r12, p.C1752g0 r13, e4.k r14, U3.c r15) {
        /*
            boolean r0 = r15 instanceof t.C2030j
            if (r0 == 0) goto L14
            r0 = r15
            t.j r0 = (t.C2030j) r0
            int r1 = r0.f15879p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f15879p = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t.j r0 = new t.j
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f15878o
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f15879p
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            float r9 = r6.f15875l
            float r10 = r6.f15874k
            kotlin.jvm.internal.u r11 = r6.f15877n
            p.m r12 = r6.f15876m
            P3.r.Y(r15)
            goto L80
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            P3.r.Y(r15)
            kotlin.jvm.internal.u r15 = new kotlin.jvm.internal.u
            r15.<init>()
            java.lang.Object r1 = r12.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            r1 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            java.lang.Object r3 = r12.a()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L62
            r3 = r1
            goto L63
        L62:
            r3 = 0
        L63:
            r4 = r3 ^ 1
            t.i r5 = new t.i
            r5.<init>(r11, r15, r9, r14)
            r6.f15876m = r12
            r6.f15877n = r15
            r6.f15874k = r10
            r6.f15875l = r8
            r6.f15879p = r1
            r1 = r12
            r3 = r13
            java.lang.Object r9 = p.AbstractC1745d.h(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            r11 = r15
            r12 = r1
            r9 = r8
        L80:
            java.lang.Object r13 = r12.a()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = c(r13, r9)
            t.a r13 = new t.a
            float r11 = r11.f12717k
            float r10 = r10 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r10)
            r10 = 29
            p.m r9 = p.AbstractC1745d.l(r12, r7, r9, r10)
            r13.<init>(r11, r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: t.k.b(s.y0, float, float, p.m, p.g0, e4.k, U3.c):java.lang.Object");
    }

    public static final float c(float f5, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        return (f7 <= 0.0f ? f5 >= f7 : f5 <= f7) ? f5 : f7;
    }
}
