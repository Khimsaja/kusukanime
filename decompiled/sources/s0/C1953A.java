package s0;

import H5.C0270k;
import f1.AbstractC0870c;
import y0.AbstractC2359f;
import z0.S0;

/* renamed from: s0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1953A implements T0.b, S3.c {

    /* renamed from: k, reason: collision with root package name */
    public final C0270k f15424k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1955C f15425l;

    /* renamed from: m, reason: collision with root package name */
    public C0270k f15426m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC1964i f15427n = EnumC1964i.f15462l;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1955C f15428o;

    public C1953A(C1955C c1955c, C0270k c0270k) {
        this.f15428o = c1955c;
        this.f15424k = c0270k;
        this.f15425l = c1955c;
    }

    @Override // T0.b
    public final int H(long j7) {
        return this.f15425l.H(j7);
    }

    @Override // T0.b
    public final float I(long j7) {
        return this.f15425l.I(j7);
    }

    @Override // T0.b
    public final int O(float f5) {
        return this.f15425l.O(f5);
    }

    @Override // T0.b
    public final float a() {
        return this.f15425l.a();
    }

    @Override // T0.b
    public final long a0(long j7) {
        return this.f15425l.a0(j7);
    }

    public final Object b(EnumC1964i enumC1964i, U3.a aVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(aVar));
        c0270k.r();
        this.f15427n = enumC1964i;
        this.f15426m = c0270k;
        Object objQ = c0270k.q();
        T3.a aVar2 = T3.a.f9048k;
        return objQ;
    }

    @Override // T0.b
    public final float d0(long j7) {
        return this.f15425l.d0(j7);
    }

    public final long e() {
        C1955C c1955c = this.f15428o;
        c1955c.getClass();
        long jA0 = c1955c.a0(AbstractC2359f.v(c1955c).f17657D.g());
        long j7 = c1955c.f15436F;
        return AbstractC0870c.F(Math.max(0.0f, g0.f.d(jA0) - ((int) (j7 >> 32))) / 2.0f, Math.max(0.0f, g0.f.b(jA0) - ((int) (j7 & 4294967295L))) / 2.0f);
    }

    public final S0 f() {
        C1955C c1955c = this.f15428o;
        c1955c.getClass();
        return AbstractC2359f.v(c1955c).f17657D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [long] */
    /* JADX WARN: Type inference failed for: r7v1, types: [H5.f0] */
    /* JADX WARN: Type inference failed for: r7v4, types: [H5.f0] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [e4.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(long r7, e4.n r9, U3.a r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof s0.x
            if (r0 == 0) goto L13
            r0 = r10
            s0.x r0 = (s0.x) r0
            int r1 = r0.f15499n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15499n = r1
            goto L18
        L13:
            s0.x r0 = new s0.x
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f15497l
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15499n
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            H5.u0 r7 = r0.f15496k
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L29
            goto L68
        L29:
            r8 = move-exception
            goto L6e
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            P3.r.Y(r10)
            r4 = 0
            int r10 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r10 > 0) goto L4c
            H5.k r10 = r6.f15426m
            if (r10 == 0) goto L4c
            s0.j r2 = new s0.j
            r2.<init>(r7)
            O3.n r2 = P3.r.r(r2)
            r10.resumeWith(r2)
        L4c:
            s0.C r10 = r6.f15428o
            H5.A r10 = r10.u0()
            s0.y r2 = new s0.y
            r4 = 0
            r2.<init>(r7, r6, r4)
            r7 = 3
            H5.u0 r7 = H5.D.x(r10, r4, r2, r7)
            r0.f15496k = r7     // Catch: java.lang.Throwable -> L29
            r0.f15499n = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r10 = r9.invoke(r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r10 != r1) goto L68
            return r1
        L68:
            s0.b r8 = s0.C1957b.f15441k
            r7.e(r8)
            return r10
        L6e:
            s0.b r9 = s0.C1957b.f15441k
            r7.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C1953A.g(long, e4.n, U3.a):java.lang.Object");
    }

    @Override // S3.c
    public final S3.h getContext() {
        return S3.i.f8767k;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(long r5, s.F0 r7, U3.a r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof s0.z
            if (r0 == 0) goto L13
            r0 = r8
            s0.z r0 = (s0.z) r0
            int r1 = r0.f15505m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15505m = r1
            goto L18
        L13:
            s0.z r0 = new s0.z
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f15503k
            T3.a r1 = T3.a.f9048k
            int r2 = r0.f15505m
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r8)     // Catch: s0.C1965j -> L3c
            return r8
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r8)
            r0.f15505m = r3     // Catch: s0.C1965j -> L3c
            java.lang.Object r5 = r4.g(r5, r7, r0)     // Catch: s0.C1965j -> L3c
            if (r5 != r1) goto L3b
            return r1
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C1953A.j(long, s.F0, U3.a):java.lang.Object");
    }

    @Override // T0.b
    public final long k0(float f5) {
        return this.f15425l.k0(f5);
    }

    @Override // T0.b
    public final float n() {
        return this.f15425l.n();
    }

    @Override // T0.b
    public final float q0(int i7) {
        return this.f15425l.q0(i7);
    }

    @Override // T0.b
    public final float r0(float f5) {
        return f5 / this.f15425l.a();
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        C1955C c1955c = this.f15428o;
        synchronized (c1955c.f15433C) {
            c1955c.f15433C.m(this);
        }
        this.f15424k.resumeWith(obj);
    }

    @Override // T0.b
    public final long v(float f5) {
        return this.f15425l.v(f5);
    }

    @Override // T0.b
    public final long w(long j7) {
        return this.f15425l.w(j7);
    }

    @Override // T0.b
    public final float x(float f5) {
        return this.f15425l.a() * f5;
    }
}
