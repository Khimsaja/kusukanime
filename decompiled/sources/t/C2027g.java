package t;

import n5.P;
import p.C1752g0;
import p.C1772x;
import s.C1912f;
import s.C1915g0;
import s.C1950y0;
import s.X;

/* renamed from: t.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2027g implements X {
    public final P a;

    /* renamed from: b, reason: collision with root package name */
    public final C1772x f15861b;

    /* renamed from: c, reason: collision with root package name */
    public final C1752g0 f15862c;

    /* renamed from: d, reason: collision with root package name */
    public final C1915g0 f15863d = androidx.compose.foundation.gestures.a.f10576b;

    public C2027g(P p7, C1772x c1772x, C1752g0 c1752g0) {
        this.a = p7;
        this.f15861b = c1772x;
        this.f15862c = c1752g0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(t.C2027g r10, s.C1950y0 r11, float r12, float r13, t.C2023c r14, U3.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C2027g.b(t.g, s.y0, float, float, t.c, U3.c):java.lang.Object");
    }

    @Override // s.X
    public Object a(C1950y0 c1950y0, float f5, S3.c cVar) {
        return d(c1950y0, f5, C1912f.f15301p, (U3.c) cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(s.C1950y0 r11, float r12, e4.k r13, U3.c r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof t.C2022b
            if (r0 == 0) goto L13
            r0 = r14
            t.b r0 = (t.C2022b) r0
            int r1 = r0.f15845n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15845n = r1
            goto L18
        L13:
            t.b r0 = new t.b
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f15843l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15845n
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e4.k r13 = r0.f15842k
            P3.r.Y(r14)
            goto L4c
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            P3.r.Y(r14)
            s.g0 r14 = r10.f15863d
            t.d r4 = new t.d
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f15842k = r7
            r0.f15845n = r3
            java.lang.Object r14 = H5.D.G(r14, r4, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            r13 = r7
        L4c:
            t.a r14 = (t.C2021a) r14
            java.lang.Float r11 = new java.lang.Float
            r12 = 0
            r11.<init>(r12)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C2027g.c(s.y0, float, e4.k, U3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(s.C1950y0 r5, float r6, e4.k r7, U3.c r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof t.C2025e
            if (r0 == 0) goto L13
            r0 = r8
            t.e r0 = (t.C2025e) r0
            int r1 = r0.f15857m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15857m = r1
            goto L18
        L13:
            t.e r0 = new t.e
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f15855k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15857m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r8)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r8)
            r0.f15857m = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3b
            return r1
        L3b:
            t.a r8 = (t.C2021a) r8
            java.lang.Float r5 = r8.a
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L49
            goto L55
        L49:
            p.m r5 = r8.f15841b
            java.lang.Object r5 = r5.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L55:
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C2027g.d(s.y0, float, e4.k, U3.c):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2027g)) {
            return false;
        }
        C2027g c2027g = (C2027g) obj;
        return c2027g.f15862c.equals(this.f15862c) && kotlin.jvm.internal.l.a(c2027g.f15861b, this.f15861b) && c2027g.a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.f15861b.hashCode() + (this.f15862c.hashCode() * 31)) * 31);
    }
}
