package Y;

import C2.G;
import D.C0042b;
import D.S;
import O.C0486d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m.C1504y;

/* loaded from: classes.dex */
public final class u {
    public final kotlin.jvm.internal.m a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10028c;

    /* renamed from: g, reason: collision with root package name */
    public G f10032g;

    /* renamed from: h, reason: collision with root package name */
    public t f10033h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f10027b = new AtomicReference(null);

    /* renamed from: d, reason: collision with root package name */
    public final S f10029d = new S(14, this);

    /* renamed from: e, reason: collision with root package name */
    public final C0042b f10030e = new C0042b(23, this);

    /* renamed from: f, reason: collision with root package name */
    public final Q.d f10031f = new Q.d(new t[16]);

    /* renamed from: i, reason: collision with root package name */
    public long f10034i = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public u(e4.k kVar) {
        this.a = (kotlin.jvm.internal.m) kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(u uVar) {
        boolean z7;
        Set set;
        synchronized (uVar.f10031f) {
            z7 = uVar.f10028c;
        }
        if (z7) {
            return false;
        }
        boolean z8 = false;
        while (true) {
            AtomicReference atomicReference = uVar.f10027b;
            Object obj = atomicReference.get();
            Set set2 = null;
            listSubList = null;
            List listSubList = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        C0486d.x("Unexpected notification");
                        throw null;
                    }
                    List list = (List) obj;
                    set = (Set) list.get(0);
                    if (list.size() == 2) {
                        listSubList = list.get(1);
                    } else if (list.size() > 2) {
                        listSubList = list.subList(1, list.size());
                    }
                }
                List list2 = listSubList;
                while (!atomicReference.compareAndSet(obj, list2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z8;
            }
            synchronized (uVar.f10031f) {
                Q.d dVar = uVar.f10031f;
                int i7 = dVar.f7829m;
                if (i7 > 0) {
                    Object[] objArr = dVar.f7827k;
                    int i8 = 0;
                    do {
                        z8 = ((t) objArr[i8]).b(set2) || z8;
                        i8++;
                    } while (i8 < i7);
                }
            }
        }
    }

    public final void b() {
        synchronized (this.f10031f) {
            Q.d dVar = this.f10031f;
            int i7 = dVar.f7829m;
            if (i7 > 0) {
                Object[] objArr = dVar.f7827k;
                int i8 = 0;
                do {
                    t tVar = (t) objArr[i8];
                    ((C1504y) tVar.f10019e.f741l).a();
                    tVar.f10020f.a();
                    ((C1504y) tVar.f10025k.f741l).a();
                    tVar.f10026l.clear();
                    i8++;
                } while (i8 < i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            Q.d r2 = r1.f10031f
            monitor-enter(r2)
            Q.d r3 = r1.f10031f     // Catch: java.lang.Throwable -> L93
            int r4 = r3.f7829m     // Catch: java.lang.Throwable -> L93
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L9b
            java.lang.Object[] r8 = r3.f7827k     // Catch: java.lang.Throwable -> L93
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L93
            Y.t r8 = (Y.t) r8     // Catch: java.lang.Throwable -> L93
            m.y r9 = r8.f10020f     // Catch: java.lang.Throwable -> L93
            java.lang.Object r9 = r9.g(r0)     // Catch: java.lang.Throwable -> L93
            m.v r9 = (m.C1501v) r9     // Catch: java.lang.Throwable -> L93
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.f12929b     // Catch: java.lang.Throwable -> L93
            int[] r11 = r9.f12930c     // Catch: java.lang.Throwable -> L93
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L93
            int r12 = r9.length     // Catch: java.lang.Throwable -> L93
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L93
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L93
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L93
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.32E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L93
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L93
            r8.d(r0, r1)     // Catch: java.lang.Throwable -> L93
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            m.y r1 = r8.f10020f     // Catch: java.lang.Throwable -> L93
            int r1 = r1.f12943e     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L82
            r1 = 1
            goto L83
        L82:
            r1 = 0
        L83:
            if (r1 != 0) goto L88
            int r7 = r7 + 1
            goto L95
        L88:
            if (r7 <= 0) goto L95
            java.lang.Object[] r1 = r3.f7827k     // Catch: java.lang.Throwable -> L93
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L93
            r1[r6] = r5     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r0 = move-exception
            goto La6
        L95:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L9b:
            java.lang.Object[] r0 = r3.f7827k     // Catch: java.lang.Throwable -> L93
            int r1 = r4 - r7
            P3.m.c0(r0, r1, r4)     // Catch: java.lang.Throwable -> L93
            r3.f7829m = r1     // Catch: java.lang.Throwable -> L93
            monitor-exit(r2)
            return
        La6:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.u.c(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000a, B:7:0x000d, B:13:0x001c, B:15:0x0020, B:10:0x0017), top: B:35:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r9, e4.k r10, e4.InterfaceC0821a r11) {
        /*
            r8 = this;
            Q.d r0 = r8.f10031f
            monitor-enter(r0)
            Q.d r1 = r8.f10031f     // Catch: java.lang.Throwable -> L89
            int r2 = r1.f7829m     // Catch: java.lang.Throwable -> L89
            r3 = 0
            if (r2 <= 0) goto L1b
            java.lang.Object[] r4 = r1.f7827k     // Catch: java.lang.Throwable -> L89
            r5 = 0
        Ld:
            r6 = r4[r5]     // Catch: java.lang.Throwable -> L89
            r7 = r6
            Y.t r7 = (Y.t) r7     // Catch: java.lang.Throwable -> L89
            e4.k r7 = r7.a     // Catch: java.lang.Throwable -> L89
            if (r7 != r10) goto L17
            goto L1c
        L17:
            int r5 = r5 + 1
            if (r5 < r2) goto Ld
        L1b:
            r6 = r3
        L1c:
            Y.t r6 = (Y.t) r6     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L31
            Y.t r6 = new Y.t     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>"
            kotlin.jvm.internal.l.d(r2, r10)     // Catch: java.lang.Throwable -> L89
            r2 = 1
            kotlin.jvm.internal.B.e(r2, r10)     // Catch: java.lang.Throwable -> L89
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L89
            r1.b(r6)     // Catch: java.lang.Throwable -> L89
        L31:
            monitor-exit(r0)
            Y.t r10 = r8.f10033h
            long r0 = r8.f10034i
            r4 = -1
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L71
            long r4 = O.C0486d.z()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L45
            goto L71
        L45:
            java.lang.String r9 = "Detected multithreaded access to SnapshotStateObserver: previousThreadId="
            java.lang.String r10 = "), currentThread={id="
            java.lang.StringBuilder r9 = A6.b.k(r9, r0, r10)
            long r10 = O.C0486d.z()
            r9.append(r10)
            java.lang.String r10 = ", name="
            r9.append(r10)
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            java.lang.String r10 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread."
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            O.C0486d.T(r9)
            throw r3
        L71:
            r8.f10033h = r6     // Catch: java.lang.Throwable -> L83
            long r2 = O.C0486d.z()     // Catch: java.lang.Throwable -> L83
            r8.f10034i = r2     // Catch: java.lang.Throwable -> L83
            D.b r2 = r8.f10030e     // Catch: java.lang.Throwable -> L83
            r6.a(r9, r2, r11)     // Catch: java.lang.Throwable -> L83
            r8.f10033h = r10
            r8.f10034i = r0
            return
        L83:
            r9 = move-exception
            r8.f10033h = r10
            r8.f10034i = r0
            throw r9
        L89:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.u.d(java.lang.Object, e4.k, e4.a):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    public final void e() {
        S s7 = this.f10029d;
        B2.l lVar = o.a;
        o.f(n.f10000n);
        synchronized (o.f10002b) {
            o.f10007g = P3.q.H0(o.f10007g, s7);
        }
        this.f10032g = new G(s7);
    }
}
