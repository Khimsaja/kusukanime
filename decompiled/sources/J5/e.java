package J5;

import F2.G;
import H5.C0270k;
import H5.D;
import H5.E0;
import H5.InterfaceC0269j;
import H5.J;
import O3.C;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.B;
import v.c0;

/* loaded from: classes.dex */
public class e implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4306l = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4307m = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4308n = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4309o = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4310p = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4311q = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4312r = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4313s = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4314t = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final int f4315k;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i7) {
        this.f4315k = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(c0.a(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        n nVar = g.a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f4308n.get(this);
        n nVar2 = new n(0L, null, this, 3);
        this.sendSegment$volatile = nVar2;
        this.receiveSegment$volatile = nVar2;
        if (s()) {
            nVar2 = g.a;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", nVar2);
        }
        this.bufferEndSegment$volatile = nVar2;
        this._closeCause$volatile = g.f4334s;
    }

    public static final n b(e eVar, long j7, n nVar) {
        Object objB;
        e eVar2;
        eVar.getClass();
        n nVar2 = g.a;
        f fVar = f.f4316k;
        loop0: while (true) {
            objB = M5.a.b(nVar, j7, fVar);
            if (!M5.a.e(objB)) {
                M5.q qVarC = M5.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4310p;
                    M5.q qVar = (M5.q) atomicReferenceFieldUpdater.get(eVar);
                    if (qVar.f6600c >= qVarC.f6600c) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, qVar, qVarC)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != qVar) {
                            if (qVarC.f()) {
                                qVarC.e();
                            }
                        }
                    }
                    if (qVar.f()) {
                        qVar.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = M5.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4307m;
        if (zE) {
            eVar.isClosedForSend();
            if (nVar.f6600c * g.f4317b < atomicLongFieldUpdater.get(eVar)) {
                nVar.b();
                return null;
            }
        } else {
            n nVar3 = (n) M5.a.c(objB);
            long j8 = nVar3.f6600c;
            if (j8 <= j7) {
                return nVar3;
            }
            long j9 = g.f4317b * j8;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4306l;
                long j10 = atomicLongFieldUpdater2.get(eVar);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j9) {
                    eVar2 = eVar;
                    break;
                }
                eVar2 = eVar;
                if (atomicLongFieldUpdater2.compareAndSet(eVar2, j10, j11 + (((int) (j10 >> 60)) << 60))) {
                    break;
                }
                eVar = eVar2;
            }
            if (j8 * g.f4317b < atomicLongFieldUpdater.get(eVar2)) {
                nVar3.b();
            }
        }
        return null;
    }

    public static final void c(e eVar, Object obj, C0270k c0270k) {
        eVar.getClass();
        c0270k.resumeWith(P3.r.r(eVar.n()));
    }

    public static final int d(e eVar, n nVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        eVar.getClass();
        nVar.n(i7, obj);
        if (z7) {
            return eVar.z(nVar, i7, obj, j7, obj2, z7);
        }
        Object objL = nVar.l(i7);
        if (objL == null) {
            if (eVar.f(j7)) {
                if (nVar.k(i7, null, g.f4319d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (nVar.k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof E0) {
            nVar.n(i7, null);
            if (eVar.w(objL, obj)) {
                nVar.o(i7, g.f4324i);
                return 0;
            }
            G g4 = g.f4326k;
            if (nVar.f4340f.getAndSet((i7 * 2) + 1, g4) == g4) {
                return 5;
            }
            nVar.m(i7, true);
            return 5;
        }
        return eVar.z(nVar, i7, obj, j7, obj2, z7);
    }

    public static void p(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4309o;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean x(Object obj) {
        if (!(obj instanceof InterfaceC0269j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", obj);
        InterfaceC0269j interfaceC0269j = (InterfaceC0269j) obj;
        n nVar = g.a;
        G gC = interfaceC0269j.c(C.a, null);
        if (gC == null) {
            return false;
        }
        interfaceC0269j.i(gC);
        return true;
    }

    public final void A(long j7) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        e eVar = this;
        if (eVar.s()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f4308n;
            if (atomicLongFieldUpdater.get(eVar) > j7) {
                break;
            } else {
                eVar = this;
            }
        }
        int i7 = g.f4318c;
        int i8 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4309o;
            if (i8 < i7) {
                long j8 = atomicLongFieldUpdater.get(eVar);
                if (j8 == (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) && j8 == atomicLongFieldUpdater.get(eVar)) {
                    return;
                } else {
                    i8++;
                }
            } else {
                while (true) {
                    long j9 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j9, (j9 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        eVar = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(eVar);
                    long j11 = atomicLongFieldUpdater2.get(eVar);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z7 = (j11 & 4611686018427387904L) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(eVar)) {
                        break;
                    }
                    if (!z7) {
                        atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + j12);
                    }
                    eVar = this;
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(eVar);
                    if (atomicLongFieldUpdater2.compareAndSet(eVar, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        eVar = this;
                    }
                }
            }
        }
    }

    @Override // J5.u
    public final Object a() {
        n nVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4307m;
        long j7 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4306l;
        long j8 = atomicLongFieldUpdater2.get(this);
        if (q(j8, true)) {
            return new k(l());
        }
        long j9 = j8 & 1152921504606846975L;
        l lVar = m.f4338b;
        if (j7 >= j9) {
            return lVar;
        }
        Object obj = g.f4326k;
        n nVar2 = (n) f4311q.get(this);
        while (!q(atomicLongFieldUpdater2.get(this), true)) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = g.f4317b;
            long j11 = andIncrement / j10;
            int i7 = (int) (andIncrement % j10);
            if (nVar2.f6600c != j11) {
                n nVarK = k(j11, nVar2);
                if (nVarK == null) {
                    continue;
                } else {
                    nVar = nVarK;
                }
            } else {
                nVar = nVar2;
            }
            Object objY = y(nVar, i7, andIncrement, obj);
            n nVar3 = nVar;
            if (objY == g.f4328m) {
                E0 e02 = obj instanceof E0 ? (E0) obj : null;
                if (e02 != null) {
                    e02.a(nVar3, i7);
                }
                A(andIncrement);
                nVar3.i();
                return lVar;
            }
            if (objY != g.f4330o) {
                if (objY == g.f4329n) {
                    throw new IllegalStateException("unexpected");
                }
                nVar3.b();
                return objY;
            }
            if (andIncrement < o()) {
                nVar3.b();
            }
            nVar2 = nVar3;
        }
        return new k(l());
    }

    @Override // J5.v
    public final boolean close(Throwable th) {
        return g(th, false);
    }

    @Override // J5.u
    public final void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(cancellationException, true);
    }

    public final boolean f(long j7) {
        return j7 < f4308n.get(this) || j7 < f4307m.get(this) + ((long) this.f4315k);
    }

    public final boolean g(Throwable th, boolean z7) {
        e eVar;
        boolean z8;
        long j7;
        long j8;
        long j9;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4306l;
        if (!z7) {
            eVar = this;
            break;
        }
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                eVar = this;
                break;
            }
            n nVar = g.a;
            eVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j11, (j11 & 1152921504606846975L) + (1 << 60)));
        G g4 = g.f4334s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4313s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g4, th)) {
                z8 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != g4) {
                z8 = false;
                break;
            }
        }
        if (z7) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j10, (3 << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j7 >> 60);
                if (i7 == 0) {
                    j8 = j7 & 1152921504606846975L;
                    j9 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j8 = j7 & 1152921504606846975L;
                    j9 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(eVar, j7, (j9 << 60) + j8));
        }
        isClosedForSend();
        if (z8) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4314t;
                obj = atomicReferenceFieldUpdater2.get(this);
                G g7 = obj == null ? g.f4332q : g.f4333r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, g7)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                B.e(1, obj);
                ((e4.k) obj).invoke(l());
                return z8;
            }
        }
        return z8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (J5.n) ((M5.b) M5.b.f6574b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final J5.n h(long r13) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.h(long):J5.n");
    }

    public final void i(long j7) {
        n nVar = (n) f4311q.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4307m;
            long j8 = atomicLongFieldUpdater.get(this);
            if (j7 < Math.max(this.f4315k + j8, f4308n.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j8, 1 + j8)) {
                long j9 = g.f4317b;
                long j10 = j8 / j9;
                int i7 = (int) (j8 % j9);
                if (nVar.f6600c != j10) {
                    n nVarK = k(j10, nVar);
                    if (nVarK != null) {
                        nVar = nVarK;
                    }
                }
                n nVar2 = nVar;
                if (y(nVar2, i7, j8, null) != g.f4330o || j8 < o()) {
                    nVar2.b();
                }
                nVar = nVar2;
            }
        }
    }

    @Override // J5.v
    public final void invokeOnClose(e4.k kVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f4314t;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, kVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            G g4 = g.f4332q;
            if (obj != g4) {
                if (obj == g.f4333r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            G g7 = g.f4333r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, g4, g7)) {
                if (atomicReferenceFieldUpdater.get(this) != g4) {
                    break;
                }
            }
            kVar.invoke(l());
            return;
        }
    }

    @Override // J5.v
    public final boolean isClosedForSend() {
        return q(f4306l.get(this), false);
    }

    @Override // J5.u
    public final d iterator() {
        return new d(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x018e, code lost:
    
        p(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0191, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.j():void");
    }

    public final n k(long j7, n nVar) {
        Object objB;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j8;
        n nVar2 = g.a;
        f fVar = f.f4316k;
        loop0: while (true) {
            objB = M5.a.b(nVar, j7, fVar);
            if (!M5.a.e(objB)) {
                M5.q qVarC = M5.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4311q;
                    M5.q qVar = (M5.q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f6600c >= qVarC.f6600c) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            if (qVarC.f()) {
                                qVarC.e();
                            }
                        }
                    }
                    if (qVar.f()) {
                        qVar.e();
                    }
                }
            } else {
                break;
            }
        }
        if (M5.a.e(objB)) {
            isClosedForSend();
            if (nVar.f6600c * g.f4317b < o()) {
                nVar.b();
                return null;
            }
        } else {
            n nVar3 = (n) M5.a.c(objB);
            boolean zS = s();
            long j9 = nVar3.f6600c;
            if (!zS && j7 <= f4308n.get(this) / g.f4317b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f4312r;
                    M5.q qVar2 = (M5.q) atomicReferenceFieldUpdater2.get(this);
                    if (qVar2.f6600c >= j9 || !nVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, qVar2, nVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != qVar2) {
                            if (nVar3.f()) {
                                nVar3.e();
                            }
                        }
                    }
                    if (qVar2.f()) {
                        qVar2.e();
                    }
                }
            }
            if (j9 <= j7) {
                return nVar3;
            }
            long j10 = j9 * g.f4317b;
            do {
                atomicLongFieldUpdater = f4307m;
                j8 = atomicLongFieldUpdater.get(this);
                if (j8 >= j10) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j10));
            if (j9 * g.f4317b < o()) {
                nVar3.b();
            }
        }
        return null;
    }

    public final Throwable l() {
        return (Throwable) f4313s.get(this);
    }

    public final Throwable m() {
        Throwable thL = l();
        return thL == null ? new p("Channel was closed") : thL;
    }

    public final Throwable n() {
        Throwable thL = l();
        return thL == null ? new q("Channel was closed") : thL;
    }

    public final long o() {
        return f4306l.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
    
        r0 = (J5.n) ((M5.b) M5.b.f6574b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(long r15, boolean r17) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.q(long, boolean):boolean");
    }

    public boolean r() {
        return false;
    }

    @Override // J5.u
    public final Object receive(S3.c cVar) throws Throwable {
        n nVarK;
        e eVar = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4311q;
        n nVar = (n) atomicReferenceFieldUpdater.get(eVar);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4306l;
            if (eVar.q(atomicLongFieldUpdater.get(eVar), true)) {
                Throwable thM = m();
                int i7 = M5.r.a;
                throw thM;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f4307m;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(eVar);
            long j7 = g.f4317b;
            long j8 = andIncrement / j7;
            int i8 = (int) (andIncrement % j7);
            if (nVar.f6600c != j8) {
                n nVarK2 = eVar.k(j8, nVar);
                if (nVarK2 == null) {
                    continue;
                } else {
                    nVar = nVarK2;
                }
            }
            Object objY = eVar.y(nVar, i8, andIncrement, null);
            G g4 = g.f4328m;
            if (objY == g4) {
                throw new IllegalStateException("unexpected");
            }
            G g7 = g.f4330o;
            if (objY != g7) {
                if (objY != g.f4329n) {
                    nVar.b();
                    return objY;
                }
                C0270k c0270kR = D.r(P3.r.E(cVar));
                e eVar2 = this;
                try {
                    Object objY2 = eVar2.y(nVar, i8, andIncrement, c0270kR);
                    if (objY2 == g4) {
                        c0270kR.a(nVar, i8);
                    } else if (objY2 == g7) {
                        if (andIncrement < eVar2.o()) {
                            nVar.b();
                        }
                        n nVar2 = (n) atomicReferenceFieldUpdater.get(eVar2);
                        while (true) {
                            if (eVar2.q(atomicLongFieldUpdater.get(eVar2), true)) {
                                c0270kR.resumeWith(P3.r.r(eVar2.m()));
                                break;
                            }
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(eVar2);
                            long j9 = g.f4317b;
                            long j10 = andIncrement2 / j9;
                            int i9 = (int) (andIncrement2 % j9);
                            if (nVar2.f6600c != j10) {
                                nVarK = eVar2.k(j10, nVar2);
                                if (nVarK == null) {
                                }
                            } else {
                                nVarK = nVar2;
                            }
                            Object objY3 = eVar2.y(nVarK, i9, andIncrement2, c0270kR);
                            if (objY3 == g.f4328m) {
                                c0270kR.a(nVarK, i9);
                                break;
                            }
                            if (objY3 == g.f4330o) {
                                if (andIncrement2 < o()) {
                                    nVarK.b();
                                }
                                eVar2 = this;
                                nVar2 = nVarK;
                            } else {
                                if (objY3 == g.f4329n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                nVarK.b();
                                c0270kR.h(objY3, null);
                            }
                        }
                    } else {
                        nVar.b();
                        c0270kR.h(objY2, null);
                    }
                    Object objQ = c0270kR.q();
                    T3.a aVar = T3.a.f9048k;
                    return objQ;
                } catch (Throwable th) {
                    c0270kR.y();
                    throw th;
                }
            }
            if (andIncrement < o()) {
                nVar.b();
            }
            eVar = this;
        }
    }

    public final boolean s() {
        long j7 = f4308n.get(this);
        return j7 == 0 || j7 == Long.MAX_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d A[RETURN] */
    @Override // J5.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object send(java.lang.Object r23, S3.c r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.send(java.lang.Object, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(long r5, J5.n r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f6600c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            M5.b r0 = r7.c()
            J5.n r0 = (J5.n) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.d()
            if (r5 == 0) goto L22
            M5.b r5 = r7.c()
            J5.n r5 = (J5.n) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = J5.e.f4312r
            java.lang.Object r6 = r5.get(r4)
            M5.q r6 = (M5.q) r6
            long r0 = r6.f6600c
            long r2 = r7.f6600c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.j()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.f()
            if (r5 == 0) goto L49
            r6.e()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.f()
            if (r5 == 0) goto L22
            r7.e()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.t(long, J5.n):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0194, code lost:
    
        r16 = r7;
        r3 = (J5.n) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x019d, code lost:
    
        if (r3 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.toString():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[SYNTHETIC] */
    @Override // J5.v
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2trySendJP2dKIU(java.lang.Object r16) {
        /*
            r15 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = J5.e.f4306l
            long r1 = r8.get(r15)
            r9 = 0
            boolean r3 = r15.q(r1, r9)
            r10 = 1
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            if (r3 == 0) goto L15
            r1 = r9
            goto L1b
        L15:
            long r1 = r1 & r11
            boolean r1 = r15.f(r1)
            r1 = r1 ^ r10
        L1b:
            J5.l r13 = J5.m.f4338b
            if (r1 == 0) goto L20
            return r13
        L20:
            F2.G r6 = J5.g.f4325j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = J5.e.f4310p
            java.lang.Object r1 = r1.get(r15)
            J5.n r1 = (J5.n) r1
        L2a:
            long r2 = r8.getAndIncrement(r15)
            long r4 = r2 & r11
            boolean r7 = r15.q(r2, r9)
            int r14 = J5.g.f4317b
            long r2 = (long) r14
            long r11 = r4 / r2
            long r2 = r4 % r2
            int r2 = (int) r2
            long r9 = r1.f6600c
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L5d
            J5.n r3 = b(r15, r11, r1)
            if (r3 != 0) goto L5c
            if (r7 == 0) goto L54
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        L54:
            r9 = 0
            r10 = 1
        L56:
            r11 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            goto L2a
        L5c:
            r1 = r3
        L5d:
            r0 = r15
            r3 = r16
            int r9 = d(r0, r1, r2, r3, r4, r6, r7)
            O3.C r3 = O3.C.a
            if (r9 == 0) goto Lbe
            r10 = 1
            if (r9 == r10) goto Lbd
            r3 = 2
            if (r9 == r3) goto L9c
            r2 = 3
            if (r9 == r2) goto L94
            r2 = 4
            if (r9 == r2) goto L7d
            r2 = 5
            if (r9 == r2) goto L78
            goto L7b
        L78:
            r1.b()
        L7b:
            r9 = 0
            goto L56
        L7d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = J5.e.f4307m
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r1.b()
        L8a:
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L9c:
            if (r7 == 0) goto Lab
            r1.i()
            java.lang.Throwable r1 = r15.n()
            J5.k r2 = new J5.k
            r2.<init>(r1)
            return r2
        Lab:
            boolean r3 = r6 instanceof H5.E0
            if (r3 == 0) goto Lb2
            H5.E0 r6 = (H5.E0) r6
            goto Lb3
        Lb2:
            r6 = 0
        Lb3:
            if (r6 == 0) goto Lb9
            int r2 = r2 + r14
            r6.a(r1, r2)
        Lb9:
            r1.i()
            return r13
        Lbd:
            return r3
        Lbe:
            r1.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.e.mo2trySendJP2dKIU(java.lang.Object):java.lang.Object");
    }

    public final Object u(S3.c cVar, Object obj) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        c0270k.resumeWith(P3.r.r(n()));
        Object objQ = c0270k.q();
        return objQ == T3.a.f9048k ? objQ : C.a;
    }

    public final void v(E0 e02, boolean z7) {
        if (e02 instanceof InterfaceC0269j) {
            ((S3.c) e02).resumeWith(P3.r.r(z7 ? m() : n()));
            return;
        }
        if (!(e02 instanceof d)) {
            throw new IllegalStateException(("Unexpected waiter: " + e02).toString());
        }
        d dVar = (d) e02;
        C0270k c0270k = dVar.f4304l;
        kotlin.jvm.internal.l.c(c0270k);
        dVar.f4304l = null;
        dVar.f4303k = g.f4327l;
        Throwable thL = dVar.f4305m.l();
        if (thL == null) {
            c0270k.resumeWith(Boolean.FALSE);
        } else {
            c0270k.resumeWith(P3.r.r(thL));
        }
    }

    public final boolean w(Object obj, Object obj2) throws J {
        if (!(obj instanceof d)) {
            if (!(obj instanceof InterfaceC0269j)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
            InterfaceC0269j interfaceC0269j = (InterfaceC0269j) obj;
            n nVar = g.a;
            G gC = interfaceC0269j.c(obj2, null);
            if (gC == null) {
                return false;
            }
            interfaceC0269j.i(gC);
            return true;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
        d dVar = (d) obj;
        C0270k c0270k = dVar.f4304l;
        kotlin.jvm.internal.l.c(c0270k);
        dVar.f4304l = null;
        dVar.f4303k = obj2;
        Boolean bool = Boolean.TRUE;
        dVar.f4305m.getClass();
        n nVar2 = g.a;
        G gC2 = c0270k.c(bool, null);
        if (gC2 == null) {
            return false;
        }
        c0270k.i(gC2);
        return true;
    }

    public final Object y(n nVar, int i7, long j7, Object obj) {
        Object objL = nVar.l(i7);
        AtomicReferenceArray atomicReferenceArray = nVar.f4340f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f4306l;
        if (objL == null) {
            if (j7 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.f4329n;
                }
                if (nVar.k(i7, objL, obj)) {
                    j();
                    return g.f4328m;
                }
            }
        } else if (objL == g.f4319d && nVar.k(i7, objL, g.f4324i)) {
            j();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            nVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object objL2 = nVar.l(i7);
            if (objL2 == null || objL2 == g.f4320e) {
                if (j7 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (nVar.k(i7, objL2, g.f4323h)) {
                        j();
                        return g.f4330o;
                    }
                } else {
                    if (obj == null) {
                        return g.f4329n;
                    }
                    if (nVar.k(i7, objL2, obj)) {
                        j();
                        return g.f4328m;
                    }
                }
            } else if (objL2 != g.f4319d) {
                G g4 = g.f4325j;
                if (objL2 == g4) {
                    return g.f4330o;
                }
                if (objL2 == g.f4323h) {
                    return g.f4330o;
                }
                if (objL2 == g.f4327l) {
                    j();
                    return g.f4330o;
                }
                if (objL2 != g.f4322g && nVar.k(i7, objL2, g.f4321f)) {
                    boolean z7 = objL2 instanceof w;
                    if (z7) {
                        objL2 = ((w) objL2).a;
                    }
                    if (x(objL2)) {
                        nVar.o(i7, g.f4324i);
                        j();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        nVar.n(i7, null);
                        return obj3;
                    }
                    nVar.o(i7, g4);
                    nVar.i();
                    if (z7) {
                        j();
                    }
                    return g.f4330o;
                }
            } else if (nVar.k(i7, objL2, g.f4324i)) {
                j();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                nVar.n(i7, null);
                return obj4;
            }
        }
    }

    public final int z(n nVar, int i7, Object obj, long j7, Object obj2, boolean z7) {
        while (true) {
            Object objL = nVar.l(i7);
            if (objL == null) {
                if (!f(j7) || z7) {
                    if (z7) {
                        if (nVar.k(i7, null, g.f4325j)) {
                            nVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (nVar.k(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (nVar.k(i7, null, g.f4319d)) {
                    break;
                }
            } else {
                if (objL != g.f4320e) {
                    G g4 = g.f4326k;
                    if (objL == g4) {
                        nVar.n(i7, null);
                        return 5;
                    }
                    if (objL == g.f4323h) {
                        nVar.n(i7, null);
                        return 5;
                    }
                    if (objL == g.f4327l) {
                        nVar.n(i7, null);
                        isClosedForSend();
                        return 4;
                    }
                    nVar.n(i7, null);
                    if (objL instanceof w) {
                        objL = ((w) objL).a;
                    }
                    if (w(objL, obj)) {
                        nVar.o(i7, g.f4324i);
                        return 0;
                    }
                    if (nVar.f4340f.getAndSet((i7 * 2) + 1, g4) != g4) {
                        nVar.m(i7, true);
                    }
                    return 5;
                }
                if (nVar.k(i7, objL, g.f4319d)) {
                    break;
                }
            }
        }
        return 1;
    }
}
