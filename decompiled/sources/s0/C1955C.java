package s0;

import H5.C0270k;
import H5.D;
import H5.u0;
import java.util.ArrayList;
import o.C1622t;
import y0.AbstractC2359f;
import y0.j0;

/* renamed from: s0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1955C extends a0.p implements T0.b, j0 {

    /* renamed from: A, reason: collision with root package name */
    public u0 f15431A;

    /* renamed from: E, reason: collision with root package name */
    public C1963h f15435E;

    /* renamed from: x, reason: collision with root package name */
    public Object f15437x;

    /* renamed from: y, reason: collision with root package name */
    public Object f15438y;

    /* renamed from: z, reason: collision with root package name */
    public e4.n f15439z;

    /* renamed from: B, reason: collision with root package name */
    public C1963h f15432B = w.a;

    /* renamed from: C, reason: collision with root package name */
    public final Q.d f15433C = new Q.d(new C1953A[16]);

    /* renamed from: D, reason: collision with root package name */
    public final Q.d f15434D = new Q.d(new C1953A[16]);

    /* renamed from: F, reason: collision with root package name */
    public long f15436F = 0;

    public C1955C(Object obj, Object obj2, e4.n nVar) {
        this.f15437x = obj;
        this.f15438y = obj2;
        this.f15439z = nVar;
    }

    public final Object G0(e4.n nVar, S3.c cVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        C1953A c1953a = new C1953A(this, c0270k);
        synchronized (this.f15433C) {
            this.f15433C.b(c1953a);
            new S3.j(P3.r.E(P3.r.q(c1953a, c1953a, nVar)), T3.a.f9048k).resumeWith(O3.C.a);
        }
        c0270k.t(new C1622t(9, c1953a));
        return c0270k.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003c A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:6:0x000d, B:13:0x001b, B:15:0x0021, B:16:0x0024, B:18:0x002c, B:20:0x0030, B:21:0x0035, B:26:0x003c, B:28:0x0042, B:29:0x0045, B:31:0x004d, B:33:0x0051), top: B:45:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H0(s0.C1963h r7, s0.EnumC1964i r8) {
        /*
            r6 = this;
            Q.d r0 = r6.f15433C
            monitor-enter(r0)
            Q.d r1 = r6.f15434D     // Catch: java.lang.Throwable -> L66
            Q.d r2 = r6.f15433C     // Catch: java.lang.Throwable -> L66
            int r3 = r1.f7829m     // Catch: java.lang.Throwable -> L66
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L66
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L3a
            r1 = 0
            if (r0 == 0) goto L3c
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto L3c
            goto L5a
        L1b:
            Q.d r0 = r6.f15434D     // Catch: java.lang.Throwable -> L3a
            int r3 = r0.f7829m     // Catch: java.lang.Throwable -> L3a
            if (r3 <= 0) goto L5a
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.f7827k     // Catch: java.lang.Throwable -> L3a
        L24:
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L3a
            s0.A r2 = (s0.C1953A) r2     // Catch: java.lang.Throwable -> L3a
            s0.i r4 = r2.f15427n     // Catch: java.lang.Throwable -> L3a
            if (r8 != r4) goto L35
            H5.k r4 = r2.f15426m     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L35
            r2.f15426m = r1     // Catch: java.lang.Throwable -> L3a
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L3a
        L35:
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L24
            goto L5a
        L3a:
            r7 = move-exception
            goto L60
        L3c:
            Q.d r0 = r6.f15434D     // Catch: java.lang.Throwable -> L3a
            int r2 = r0.f7829m     // Catch: java.lang.Throwable -> L3a
            if (r2 <= 0) goto L5a
            java.lang.Object[] r0 = r0.f7827k     // Catch: java.lang.Throwable -> L3a
            r3 = 0
        L45:
            r4 = r0[r3]     // Catch: java.lang.Throwable -> L3a
            s0.A r4 = (s0.C1953A) r4     // Catch: java.lang.Throwable -> L3a
            s0.i r5 = r4.f15427n     // Catch: java.lang.Throwable -> L3a
            if (r8 != r5) goto L56
            H5.k r5 = r4.f15426m     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L56
            r4.f15426m = r1     // Catch: java.lang.Throwable -> L3a
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L3a
        L56:
            int r3 = r3 + 1
            if (r3 < r2) goto L45
        L5a:
            Q.d r7 = r6.f15434D
            r7.g()
            return
        L60:
            Q.d r8 = r6.f15434D
            r8.g()
            throw r7
        L66:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.C1955C.H0(s0.h, s0.i):void");
    }

    public final void I0() {
        u0 u0Var = this.f15431A;
        if (u0Var != null) {
            u0Var.n(new L5.o("Pointer input was reset", 5));
            this.f15431A = null;
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.List] */
    @Override // y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        this.f15436F = j7;
        if (enumC1964i == EnumC1964i.f15461k) {
            this.f15432B = c1963h;
        }
        if (this.f15431A == null) {
            H5.A aU0 = u0();
            H5.B b4 = H5.B.f3790k;
            this.f15431A = D.x(aU0, null, new C1954B(this, null), 1);
        }
        H0(c1963h, enumC1964i);
        ?? r52 = c1963h.a;
        int size = r52.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c1963h = null;
                break;
            } else if (!AbstractC1971p.c((r) r52.get(i7))) {
                break;
            } else {
                i7++;
            }
        }
        this.f15435E = c1963h;
    }

    @Override // T0.b
    public final float a() {
        return AbstractC2359f.v(this).f17655B.a();
    }

    @Override // y0.j0
    public final void c0() {
        I0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // y0.j0
    public final void f0() {
        C1963h c1963h = this.f15435E;
        if (c1963h == null) {
            return;
        }
        ?? r12 = c1963h.a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((r) r12.get(i7)).f15471d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    r rVar = (r) r12.get(i8);
                    long j7 = rVar.a;
                    boolean z7 = rVar.f15471d;
                    long j8 = rVar.f15469b;
                    long j9 = rVar.f15470c;
                    arrayList.add(new r(j7, j8, j9, false, rVar.f15472e, j8, j9, z7, z7, 1, 0L));
                }
                C1963h c1963h2 = new C1963h(arrayList, null);
                this.f15432B = c1963h2;
                H0(c1963h2, EnumC1964i.f15461k);
                H0(c1963h2, EnumC1964i.f15462l);
                H0(c1963h2, EnumC1964i.f15463m);
                this.f15435E = null;
                return;
            }
        }
    }

    @Override // y0.j0
    public final void k() {
        I0();
    }

    @Override // T0.b
    public final float n() {
        return AbstractC2359f.v(this).f17655B.n();
    }

    @Override // a0.p
    public final void z0() {
        I0();
    }
}
