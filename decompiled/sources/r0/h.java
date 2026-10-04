package r0;

import H5.A;
import a0.p;
import y0.AbstractC2359f;
import y0.o0;

/* loaded from: classes.dex */
public final class h extends p implements o0, InterfaceC1860a {

    /* renamed from: x, reason: collision with root package name */
    public InterfaceC1860a f14804x;

    /* renamed from: y, reason: collision with root package name */
    public e f14805y;

    /* renamed from: z, reason: collision with root package name */
    public final String f14806z;

    public h(InterfaceC1860a interfaceC1860a, e eVar) {
        this.f14804x = interfaceC1860a;
        this.f14805y = eVar == null ? new e() : eVar;
        this.f14806z = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    public final A G0() {
        h hVar = this.f10414w ? (h) AbstractC2359f.k(this) : null;
        if (hVar != null) {
            return hVar.G0();
        }
        A a = this.f14805y.f14792c;
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // r0.InterfaceC1860a
    public final long M(int i7, long j7, long j8) {
        long jM = this.f14804x.M(i7, j7, j8);
        boolean z7 = this.f10414w;
        h hVar = null;
        if (z7 && z7) {
            hVar = (h) AbstractC2359f.k(this);
        }
        h hVar2 = hVar;
        return g0.c.h(jM, hVar2 != null ? hVar2.M(i7, g0.c.h(j7, jM), g0.c.g(j8, jM)) : 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // r0.InterfaceC1860a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(long r11, long r13, S3.c r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof r0.f
            if (r0 == 0) goto L14
            r0 = r15
            r0.f r0 = (r0.f) r0
            int r1 = r0.f14798p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14798p = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            r0.f r0 = new r0.f
            U3.c r15 = (U3.c) r15
            r0.<init>(r10, r15)
            goto L12
        L1c:
            java.lang.Object r15 = r6.f14796n
            T3.a r0 = T3.a.f9048k
            int r1 = r6.f14798p
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.f14794l
            P3.r.Y(r15)
            goto L88
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.f14795m
            long r11 = r6.f14794l
            r0.h r1 = r6.f14793k
            P3.r.Y(r15)
            goto L5b
        L42:
            P3.r.Y(r15)
            r0.a r1 = r10.f14804x
            r6.f14793k = r10
            r6.f14794l = r11
            r6.f14795m = r13
            r6.f14798p = r2
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.Y(r2, r4, r6)
            if (r15 != r0) goto L58
            goto L86
        L58:
            r1 = r10
            r11 = r2
            r13 = r4
        L5b:
            T0.o r15 = (T0.o) r15
            long r8 = r15.a
            boolean r15 = r1.f10414w
            r2 = 0
            if (r15 == 0) goto L6e
            if (r15 == 0) goto L6e
            y0.o0 r15 = y0.AbstractC2359f.k(r1)
            r0.h r15 = (r0.h) r15
            r1 = r15
            goto L6f
        L6e:
            r1 = r2
        L6f:
            if (r1 == 0) goto L8e
            long r11 = T0.o.e(r11, r8)
            long r4 = T0.o.d(r13, r8)
            r6.f14793k = r2
            r6.f14794l = r8
            r6.f14798p = r7
            r2 = r11
            java.lang.Object r15 = r1.Y(r2, r4, r6)
            if (r15 != r0) goto L87
        L86:
            return r0
        L87:
            r11 = r8
        L88:
            T0.o r15 = (T0.o) r15
            long r13 = r15.a
            r8 = r11
            goto L90
        L8e:
            r13 = 0
        L90:
            long r11 = T0.o.e(r8, r13)
            T0.o r13 = new T0.o
            r13.<init>(r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h.Y(long, long, S3.c):java.lang.Object");
    }

    @Override // r0.InterfaceC1860a
    public final long l0(int i7, long j7) {
        boolean z7 = this.f10414w;
        h hVar = null;
        if (z7 && z7) {
            hVar = (h) AbstractC2359f.k(this);
        }
        long jL0 = hVar != null ? hVar.l0(i7, j7) : 0L;
        return g0.c.h(jL0, this.f14804x.l0(i7, g0.c.g(j7, jL0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r12 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // r0.InterfaceC1860a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(long r10, S3.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof r0.g
            if (r0 == 0) goto L13
            r0 = r12
            r0.g r0 = (r0.g) r0
            int r1 = r0.f14803o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14803o = r1
            goto L1a
        L13:
            r0.g r0 = new r0.g
            U3.c r12 = (U3.c) r12
            r0.<init>(r9, r12)
        L1a:
            java.lang.Object r12 = r0.f14801m
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f14803o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            long r10 = r0.f14800l
            P3.r.Y(r12)
            goto L7f
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            long r10 = r0.f14800l
            r0.h r2 = r0.f14799k
            P3.r.Y(r12)
            goto L60
        L3f:
            P3.r.Y(r12)
            boolean r12 = r9.f10414w
            if (r12 == 0) goto L4f
            if (r12 == 0) goto L4f
            y0.o0 r12 = y0.AbstractC2359f.k(r9)
            r0.h r12 = (r0.h) r12
            goto L50
        L4f:
            r12 = r3
        L50:
            if (r12 == 0) goto L68
            r0.f14799k = r9
            r0.f14800l = r10
            r0.f14803o = r5
            java.lang.Object r12 = r12.m(r10, r0)
            if (r12 != r1) goto L5f
            goto L7e
        L5f:
            r2 = r9
        L60:
            T0.o r12 = (T0.o) r12
            long r5 = r12.a
        L64:
            r7 = r5
            r5 = r10
            r10 = r7
            goto L6c
        L68:
            r5 = 0
            r2 = r9
            goto L64
        L6c:
            r0.a r12 = r2.f14804x
            long r5 = T0.o.d(r5, r10)
            r0.f14799k = r3
            r0.f14800l = r10
            r0.f14803o = r4
            java.lang.Object r12 = r12.m(r5, r0)
            if (r12 != r1) goto L7f
        L7e:
            return r1
        L7f:
            T0.o r12 = (T0.o) r12
            long r0 = r12.a
            long r10 = T0.o.e(r10, r0)
            T0.o r12 = new T0.o
            r12.<init>(r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.h.m(long, S3.c):java.lang.Object");
    }

    @Override // y0.o0
    public final Object p() {
        return this.f14806z;
    }

    @Override // a0.p
    public final void y0() {
        e eVar = this.f14805y;
        eVar.a = this;
        eVar.f14791b = new C1861b(1, this);
        eVar.f14792c = u0();
    }

    @Override // a0.p
    public final void z0() {
        e eVar = this.f14805y;
        if (eVar.a == this) {
            eVar.a = null;
        }
    }
}
