package O5;

import D6.r;
import F2.G;
import H5.D;
import M5.o;
import b1.AbstractC0703b;
import io.ktor.util.date.GMTDateParser;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import v.c0;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7612r = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7613s = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7614t = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: u, reason: collision with root package name */
    public static final G f7615u = new G("NOT_IN_STACK", 1);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f7616k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7617l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7618m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7619n;

    /* renamed from: o, reason: collision with root package name */
    public final f f7620o;

    /* renamed from: p, reason: collision with root package name */
    public final f f7621p;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: q, reason: collision with root package name */
    public final o f7622q;

    public c(int i7, int i8, long j7, String str) {
        this.f7616k = i7;
        this.f7617l = i8;
        this.f7618m = j7;
        this.f7619n = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(c0.a(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(A6.b.e(i8, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(c0.a(i8, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f7620o = new f();
        this.f7621p = new f();
        this.f7622q = new o((i7 + 1) * 2);
        this.controlState$volatile = i7 << 42;
    }

    public static /* synthetic */ void g(c cVar, Runnable runnable, int i7) {
        cVar.e(runnable, false, (i7 & 4) == 0);
    }

    public final int b() {
        synchronized (this.f7622q) {
            try {
                if (f7614t.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f7613s;
                long j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 & 2097151);
                int i8 = i7 - ((int) ((j7 & 4398044413952L) >> 21));
                if (i8 < 0) {
                    i8 = 0;
                }
                if (i8 >= this.f7616k) {
                    return 0;
                }
                if (i7 >= this.f7617l) {
                    return 0;
                }
                int i9 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i9 <= 0 || this.f7622q.b(i9) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i9);
                this.f7622q.c(i9, aVar);
                if (i9 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i10 = i8 + 1;
                aVar.start();
                return i10;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = O5.c.f7614t
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof O5.a
            r3 = 0
            if (r1 == 0) goto L17
            O5.a r0 = (O5.a) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L23
            O5.c r1 = r0.f7605r
            boolean r1 = kotlin.jvm.internal.l.a(r1, r8)
            if (r1 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            M5.o r1 = r8.f7622q
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = O5.c.f7613s     // Catch: java.lang.Throwable -> Lc3
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc3
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L78
            r1 = r2
        L36:
            M5.o r5 = r8.f7622q
            java.lang.Object r5 = r5.b(r1)
            kotlin.jvm.internal.l.c(r5)
            O5.a r5 = (O5.a) r5
            if (r5 == r0) goto L73
        L43:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L54
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L43
        L54:
            O5.m r5 = r5.f7598k
            O5.f r6 = r8.f7621p
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = O5.m.f7636b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            O5.i r7 = (O5.i) r7
            if (r7 == 0) goto L68
            r6.a(r7)
        L68:
            O5.i r7 = r5.b()
            if (r7 != 0) goto L6f
            goto L73
        L6f:
            r6.a(r7)
            goto L68
        L73:
            if (r1 == r4) goto L78
            int r1 = r1 + 1
            goto L36
        L78:
            O5.f r1 = r8.f7621p
            r1.b()
            O5.f r1 = r8.f7620o
            r1.b()
        L82:
            if (r0 == 0) goto L8a
            O5.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb2
        L8a:
            O5.f r1 = r8.f7620o
            java.lang.Object r1 = r1.d()
            O5.i r1 = (O5.i) r1
            if (r1 != 0) goto Lb2
            O5.f r1 = r8.f7621p
            java.lang.Object r1 = r1.d()
            O5.i r1 = (O5.i) r1
            if (r1 != 0) goto Lb2
            if (r0 == 0) goto La5
            O5.b r1 = O5.b.f7610o
            r0.h(r1)
        La5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.c.f7612r
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.c.f7613s
            r0.set(r8, r1)
            return
        Lb2:
            r1.run()     // Catch: java.lang.Throwable -> Lb6
            goto L82
        Lb6:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L82
        Lc3:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.c.close():void");
    }

    public final void e(Runnable runnable, boolean z7, boolean z8) {
        i jVar;
        b bVar;
        k.f7634f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f7627k = jNanoTime;
            jVar.f7628l = z7;
        } else {
            jVar = new j(runnable, jNanoTime, z7);
        }
        boolean z9 = jVar.f7628l;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7613s;
        long jAddAndGet = z9 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.l.a(aVar.f7605r, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f7600m) != b.f7610o && (jVar.f7628l || bVar != b.f7607l)) {
            aVar.f7604q = true;
            m mVar = aVar.f7598k;
            if (z8) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f7636b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f7628l ? this.f7621p.a(jVar) : this.f7620o.a(jVar))) {
                throw new RejectedExecutionException(AbstractC0703b.m(new StringBuilder(), this.f7619n, " was terminated"));
            }
        }
        if (z9) {
            if (m() || j(jAddAndGet)) {
                return;
            }
            m();
            return;
        }
        if (m() || j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, 6);
    }

    public final void i(a aVar, int i7, int i8) {
        while (true) {
            long j7 = f7612r.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                if (i8 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f7615u) {
                            i9 = -1;
                            break;
                        }
                        if (objC == null) {
                            i9 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i9 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i9 = i8;
                }
            }
            if (i9 >= 0) {
                if (f7612r.compareAndSet(this, j7, i9 | j8)) {
                    return;
                }
            }
        }
    }

    public final boolean j(long j7) {
        int i7 = ((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = this.f7616k;
        if (i7 < i8) {
            int iB = b();
            if (iB == 1 && i8 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        G g4;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7612r;
            long j7 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f7622q.b((int) (2097151 & j7));
            if (aVar == null) {
                aVar = null;
            } else {
                long j8 = (2097152 + j7) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    g4 = f7615u;
                    if (objC == g4) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j7, j8 | iB)) {
                    aVar.g(g4);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f7597s.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.f7622q;
        int iA = oVar.a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < iA; i12++) {
            a aVar = (a) oVar.b(i12);
            if (aVar != null) {
                m mVar = aVar.f7598k;
                mVar.getClass();
                int i13 = m.f7636b.get(mVar) != null ? (m.f7637c.get(mVar) - m.f7638d.get(mVar)) + 1 : m.f7637c.get(mVar) - m.f7638d.get(mVar);
                int iOrdinal = aVar.f7600m.ordinal();
                if (iOrdinal == 0) {
                    i7++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i13);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i8++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i13);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i9++;
                } else if (iOrdinal == 3) {
                    i10++;
                    if (i13 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i13);
                        sb3.append(GMTDateParser.DAY_OF_MONTH);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new r();
                    }
                    i11++;
                }
            }
        }
        long j7 = f7613s.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f7619n);
        sb4.append('@');
        sb4.append(D.p(this));
        sb4.append("[Pool Size {core = ");
        int i14 = this.f7616k;
        sb4.append(i14);
        sb4.append(", max = ");
        sb4.append(this.f7617l);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i7);
        sb4.append(", blocking = ");
        sb4.append(i8);
        sb4.append(", parked = ");
        sb4.append(i9);
        sb4.append(", dormant = ");
        sb4.append(i10);
        sb4.append(", terminated = ");
        sb4.append(i11);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f7620o.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f7621p.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j7));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j7) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i14 - ((int) ((j7 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
