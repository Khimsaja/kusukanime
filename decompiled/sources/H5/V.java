package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class V extends W implements I {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3824p = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_queue$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3825q = AtomicReferenceFieldUpdater.newUpdater(V.class, Object.class, "_delayed$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3826r = AtomicIntegerFieldUpdater.newUpdater(V.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        i0(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // H5.W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e0() {
        /*
            r10 = this;
            boolean r0 = r10.f0()
            r1 = 0
            if (r0 == 0) goto La
            goto Lb1
        La:
            r10.j0()
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = H5.V.f3824p
            java.lang.Object r3 = r0.get(r10)
            F2.G r4 = H5.D.f3798c
            r5 = 0
            if (r3 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r3 instanceof M5.l
            if (r6 == 0) goto L3e
            r6 = r3
            M5.l r6 = (M5.l) r6
            java.lang.Object r7 = r6.d()
            F2.G r8 = M5.l.f6594g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            M5.l r6 = r6.c()
        L30:
            boolean r4 = r0.compareAndSet(r10, r3, r6)
            if (r4 == 0) goto L37
            goto Ld
        L37:
            java.lang.Object r4 = r0.get(r10)
            if (r4 == r3) goto L30
            goto Ld
        L3e:
            if (r3 != r4) goto L41
            goto L18
        L41:
            boolean r6 = r0.compareAndSet(r10, r3, r5)
            if (r6 == 0) goto Lb7
            r7 = r3
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r1
        L50:
            P3.l r3 = r10.f3830n
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L62
            goto L59
        L62:
            r8 = r1
        L63:
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 != 0) goto L68
            goto Lb1
        L68:
            java.lang.Object r0 = r0.get(r10)
            if (r0 == 0) goto L90
            boolean r3 = r0 instanceof M5.l
            if (r3 == 0) goto L8d
            M5.l r0 = (M5.l) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = M5.l.f6593f
            long r3 = r3.get(r0)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r3
            int r0 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r8
            r8 = 30
            long r3 = r3 >> r8
            int r3 = (int) r3
            if (r0 != r3) goto L8c
            goto L90
        L8c:
            return r1
        L8d:
            if (r0 != r4) goto Lb1
            goto Lb6
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = H5.V.f3825q
            java.lang.Object r0 = r0.get(r10)
            H5.U r0 = (H5.U) r0
            if (r0 == 0) goto Lb6
            monitor-enter(r0)
            H5.T[] r3 = r0.a     // Catch: java.lang.Throwable -> Lb3
            if (r3 == 0) goto La2
            r4 = 0
            r5 = r3[r4]     // Catch: java.lang.Throwable -> Lb3
        La2:
            monitor-exit(r0)
            if (r5 != 0) goto La6
            goto Lb6
        La6:
            long r3 = r5.f3821k
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r3
        Lb3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        Lb6:
            return r6
        Lb7:
            java.lang.Object r6 = r0.get(r10)
            if (r6 == r3) goto L41
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.V.e0():long");
    }

    @Override // H5.W
    public void h0() {
        T tB;
        w0.a.set(null);
        f3826r.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3824p;
            Object obj = atomicReferenceFieldUpdater.get(this);
            F2.G g4 = D.f3798c;
            if (obj != null) {
                if (!(obj instanceof M5.l)) {
                    if (obj != g4) {
                        M5.l lVar = new M5.l(8, true);
                        lVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((M5.l) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, g4)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (e0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            U u5 = (U) f3825q.get(this);
            if (u5 == null) {
                return;
            }
            synchronized (u5) {
                tB = M5.t.f6601b.get(u5) > 0 ? u5.b(0) : null;
            }
            if (tB == null) {
                return;
            } else {
                g0(jNanoTime, tB);
            }
        }
    }

    @Override // H5.I
    public final void i(long j7, C0270k c0270k) {
        long j8 = j7 > 0 ? j7 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j7 : 0L;
        if (j8 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            Q q6 = new Q(this, j8 + jNanoTime, c0270k);
            m0(jNanoTime, q6);
            c0270k.u(new C0267h(1, q6));
        }
    }

    public void i0(Runnable runnable) {
        j0();
        if (!k0(runnable)) {
            E.f3807s.i0(runnable);
            return;
        }
        Thread threadC0 = c0();
        if (Thread.currentThread() != threadC0) {
            LockSupport.unpark(threadC0);
        }
    }

    public final void j0() {
        T tB;
        U u5 = (U) f3825q.get(this);
        if (u5 == null || M5.t.f6601b.get(u5) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (u5) {
                try {
                    T[] tArr = u5.a;
                    T t7 = tArr != null ? tArr[0] : null;
                    if (t7 != null) {
                        tB = ((jNanoTime - t7.f3821k) > 0L ? 1 : ((jNanoTime - t7.f3821k) == 0L ? 0 : -1)) >= 0 ? k0(t7) : false ? u5.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (tB != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0050, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k0(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = H5.V.f3824p
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = H5.V.f3826r
            int r2 = r2.get(r6)
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L12
            r2 = r4
            goto L13
        L12:
            r2 = r3
        L13:
            if (r2 == 0) goto L16
            goto L50
        L16:
            if (r1 != 0) goto L27
        L18:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L20
            goto L67
        L20:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L18
            goto L0
        L27:
            boolean r2 = r1 instanceof M5.l
            if (r2 == 0) goto L4c
            r2 = r1
            M5.l r2 = (M5.l) r2
            int r5 = r2.a(r7)
            if (r5 == 0) goto L67
            if (r5 == r4) goto L3a
            r0 = 2
            if (r5 == r0) goto L50
            goto L0
        L3a:
            M5.l r2 = r2.c()
        L3e:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L45
            goto L0
        L45:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L3e
            goto L0
        L4c:
            F2.G r2 = H5.D.f3798c
            if (r1 != r2) goto L51
        L50:
            return r3
        L51:
            M5.l r2 = new M5.l
            r3 = 8
            r2.<init>(r3, r4)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r7)
        L61:
            boolean r3 = r0.compareAndSet(r6, r1, r2)
            if (r3 == 0) goto L68
        L67:
            return r4
        L68:
            java.lang.Object r3 = r0.get(r6)
            if (r3 == r1) goto L61
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.V.k0(java.lang.Runnable):boolean");
    }

    public final boolean l0() {
        U u5;
        P3.l lVar = this.f3830n;
        if (!(lVar != null ? lVar.isEmpty() : true) || ((u5 = (U) f3825q.get(this)) != null && M5.t.f6601b.get(u5) != 0)) {
            return false;
        }
        Object obj = f3824p.get(this);
        if (obj != null) {
            if (obj instanceof M5.l) {
                long j7 = M5.l.f6593f.get((M5.l) obj);
                return ((int) (1073741823 & j7)) == ((int) ((j7 & 1152921503533105152L) >> 30));
            }
            if (obj != D.f3798c) {
                return false;
            }
        }
        return true;
    }

    public final void m0(long j7, T t7) {
        int iA;
        Thread threadC0;
        boolean z7 = f3826r.get(this) == 1;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3825q;
        if (z7) {
            iA = 1;
        } else {
            U u5 = (U) atomicReferenceFieldUpdater.get(this);
            if (u5 == null) {
                U u7 = new U();
                u7.f3823c = j7;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, u7) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.l.c(obj);
                u5 = (U) obj;
            }
            iA = t7.a(j7, u5, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                g0(j7, t7);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        U u8 = (U) atomicReferenceFieldUpdater.get(this);
        if (u8 != null) {
            synchronized (u8) {
                T[] tArr = u8.a;
                t = tArr != null ? tArr[0] : null;
            }
        }
        if (t != t7 || Thread.currentThread() == (threadC0 = c0())) {
            return;
        }
        LockSupport.unpark(threadC0);
    }

    public N v(long j7, z0 z0Var, S3.h hVar) {
        return F.a.v(j7, z0Var, hVar);
    }
}
