package O5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.x;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7597s = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    private volatile int indexInArray;

    /* renamed from: k, reason: collision with root package name */
    public final m f7598k;

    /* renamed from: l, reason: collision with root package name */
    public final x f7599l;

    /* renamed from: m, reason: collision with root package name */
    public b f7600m;

    /* renamed from: n, reason: collision with root package name */
    public long f7601n;
    private volatile Object nextParkedWorker;

    /* renamed from: o, reason: collision with root package name */
    public long f7602o;

    /* renamed from: p, reason: collision with root package name */
    public int f7603p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7604q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f7605r;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i7) {
        this.f7605r = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f7598k = new m();
        this.f7599l = new x();
        this.f7600m = b.f7609n;
        this.nextParkedWorker = c.f7615u;
        int iNanoTime = (int) System.nanoTime();
        this.f7603p = iNanoTime == 0 ? 42 : iNanoTime;
        f(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = O5.m.f7638d.get(r3);
        r0 = O5.m.f7637c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (O5.m.f7639e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O5.i a(boolean r13) {
        /*
            r12 = this;
            O5.b r0 = r12.f7600m
            O5.b r1 = O5.b.f7606k
            r2 = 0
            O5.m r3 = r12.f7598k
            r4 = 1
            O5.c r5 = r12.f7605r
            if (r0 != r1) goto Le
            goto L88
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = O5.c.f7613s
        L10:
            O5.c r7 = r12.f7605r
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r1 = 42
            long r10 = r10 >> r1
            int r1 = (int) r10
            if (r1 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = O5.m.f7636b
            java.lang.Object r0 = r13.get(r3)
            O5.i r0 = (O5.i) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f7628l
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = O5.m.f7638d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = O5.m.f7637c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = O5.m.f7639e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            O5.i r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            O5.f r13 = r5.f7621p
            java.lang.Object r13 = r13.d()
            O5.i r13 = (O5.i) r13
            if (r13 != 0) goto L73
            O5.i r13 = r12.i(r4)
        L73:
            return r13
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = O5.c.f7613s
            boolean r1 = r6.compareAndSet(r7, r8, r10)
            if (r1 == 0) goto L10
            O5.b r0 = O5.b.f7606k
            r12.f7600m = r0
        L88:
            if (r13 == 0) goto Lbc
            int r13 = r5.f7616k
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L95
            goto L96
        L95:
            r4 = 0
        L96:
            if (r4 == 0) goto L9f
            O5.i r13 = r12.e()
            if (r13 == 0) goto L9f
            return r13
        L9f:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = O5.m.f7636b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            O5.i r13 = (O5.i) r13
            if (r13 != 0) goto Lb0
            O5.i r13 = r3.b()
        Lb0:
            if (r13 == 0) goto Lb3
            return r13
        Lb3:
            if (r4 != 0) goto Lc3
            O5.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            return r13
        Lbc:
            O5.i r13 = r12.e()
            if (r13 == 0) goto Lc3
            return r13
        Lc3:
            r13 = 3
            O5.i r13 = r12.i(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.a.a(boolean):O5.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i8 = this.f7603p;
        int i9 = i8 ^ (i8 << 13);
        int i10 = i9 ^ (i9 >> 17);
        int i11 = i10 ^ (i10 << 5);
        this.f7603p = i11;
        int i12 = i7 - 1;
        return (i12 & i7) == 0 ? i11 & i12 : (i11 & Integer.MAX_VALUE) % i7;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f7605r;
        if (iD == 0) {
            i iVar = (i) cVar.f7620o.d();
            return iVar != null ? iVar : (i) cVar.f7621p.d();
        }
        i iVar2 = (i) cVar.f7621p.d();
        return iVar2 != null ? iVar2 : (i) cVar.f7620o.d();
    }

    public final void f(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7605r.f7619n);
        sb.append("-worker-");
        sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f7600m;
        boolean z7 = bVar2 == b.f7606k;
        if (z7) {
            c.f7613s.addAndGet(this.f7605r, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f7600m = bVar;
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r7 = -2;
        r23 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final O5.i i(int r26) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.a.i(int):O5.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O5.a.run():void");
    }
}
