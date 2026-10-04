package O;

import C2.C0034g;
import P.C0556a;
import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m.C1471A;
import m.C1472B;
import m.C1496q;
import m.C1501v;
import m.C1504y;

/* renamed from: O.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519u implements InterfaceC0512q {

    /* renamed from: A, reason: collision with root package name */
    public final C0510p f7189A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f7190B;

    /* renamed from: k, reason: collision with root package name */
    public final r f7191k;

    /* renamed from: l, reason: collision with root package name */
    public final B2.l f7192l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReference f7193m = new AtomicReference(null);

    /* renamed from: n, reason: collision with root package name */
    public final Object f7194n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public final C1471A f7195o;

    /* renamed from: p, reason: collision with root package name */
    public final B0 f7196p;

    /* renamed from: q, reason: collision with root package name */
    public final C0034g f7197q;

    /* renamed from: r, reason: collision with root package name */
    public final C1472B f7198r;

    /* renamed from: s, reason: collision with root package name */
    public final C1472B f7199s;

    /* renamed from: t, reason: collision with root package name */
    public final C0034g f7200t;

    /* renamed from: u, reason: collision with root package name */
    public final C0556a f7201u;

    /* renamed from: v, reason: collision with root package name */
    public final C0556a f7202v;

    /* renamed from: w, reason: collision with root package name */
    public final C0034g f7203w;

    /* renamed from: x, reason: collision with root package name */
    public C0034g f7204x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7205y;

    /* renamed from: z, reason: collision with root package name */
    public final T f7206z;

    public C0519u(r rVar, B2.l lVar) {
        this.f7191k = rVar;
        this.f7192l = lVar;
        C1471A c1471a = new C1471A(new C1472B());
        this.f7195o = c1471a;
        B0 b02 = new B0();
        if (rVar.c()) {
            b02.f6955t = new C1496q();
        }
        if (rVar.e()) {
            b02.h();
        }
        this.f7196p = b02;
        this.f7197q = new C0034g(27);
        this.f7198r = new C1472B();
        this.f7199s = new C1472B();
        this.f7200t = new C0034g(27);
        C0556a c0556a = new C0556a();
        this.f7201u = c0556a;
        C0556a c0556a2 = new C0556a();
        this.f7202v = c0556a2;
        this.f7203w = new C0034g(27);
        this.f7204x = new C0034g(27);
        this.f7206z = new T(6);
        C0510p c0510p = new C0510p(lVar, rVar, b02, c1471a, c0556a, c0556a2, this);
        rVar.k(c0510p);
        this.f7189A = c0510p;
        boolean z7 = rVar instanceof C0522v0;
        W.a aVar = AbstractC0496i.a;
    }

    public final void a() {
        this.f7193m.set(null);
        this.f7201u.f7651i.a0();
        this.f7202v.f7651i.a0();
        C1471A c1471a = this.f7195o;
        if (c1471a.f12862k.g()) {
            return;
        }
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        if (c1471a.f12862k.g()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = c1471a.iterator();
            while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                ((U.c) it).remove();
                w0Var.b();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            C2.g r2 = r0.f7197q
            java.lang.Object r2 = r2.f741l
            m.y r2 = (m.C1504y) r2
            java.lang.Object r2 = r2.e(r1)
            if (r2 == 0) goto L9f
            boolean r3 = r2 instanceof m.C1472B
            r4 = 1
            m.B r5 = r0.f7198r
            m.B r6 = r0.f7199s
            C2.g r7 = r0.f7203w
            if (r3 == 0) goto L84
            m.B r2 = (m.C1472B) r2
            java.lang.Object[] r3 = r2.f12864b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9f
            r10 = 0
        L27:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7f
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L41:
            if (r15 >= r13) goto L7c
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L73
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r3[r16]
            r9 = r16
            O.o0 r9 = (O.C0509o0) r9
            boolean r16 = r7.t(r1, r9)
            if (r16 != 0) goto L73
            r16 = r14
            int r14 = r9.c(r1)
            if (r14 == r4) goto L75
            m.y r14 = r9.f7114g
            if (r14 == 0) goto L6f
            if (r22 != 0) goto L6f
            r6.a(r9)
            goto L75
        L6f:
            r5.a(r9)
            goto L75
        L73:
            r16 = r14
        L75:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
            goto L41
        L7c:
            r9 = r14
            if (r13 != r9) goto L9f
        L7f:
            if (r10 == r8) goto L9f
            int r10 = r10 + 1
            goto L27
        L84:
            O.o0 r2 = (O.C0509o0) r2
            boolean r3 = r7.t(r1, r2)
            if (r3 != 0) goto L9f
            int r1 = r2.c(r1)
            if (r1 == r4) goto L9f
            m.y r1 = r2.f7114g
            if (r1 == 0) goto L9c
            if (r22 != 0) goto L9c
            r6.a(r2)
            return
        L9c:
            r5.a(r2)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.b(java.lang.Object, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018b A[EDGE_INSN: B:73:0x018b->B:224:0x0126 BREAK  A[LOOP:13: B:63:0x0159->B:74:0x018d]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.util.Set r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.c(java.util.Set, boolean):void");
    }

    public final void d() {
        synchronized (this.f7194n) {
            try {
                e(this.f7201u);
                n();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7195o.f12862k.g()) {
                            C1471A c1471a = this.f7195o;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c1471a.f12862k.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c1471a.iterator();
                                    while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                        w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                        ((U.c) it).remove();
                                        w0Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(P.C0556a r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.e(P.a):void");
    }

    public final void f() {
        synchronized (this.f7194n) {
            try {
                if (this.f7202v.f7651i.d0()) {
                    e(this.f7202v);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7195o.f12862k.g()) {
                            C1471A c1471a = this.f7195o;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c1471a.f12862k.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c1471a.iterator();
                                    while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                        w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                        ((U.c) it).remove();
                                        w0Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public final void g() {
        synchronized (this.f7194n) {
            try {
                this.f7189A.f7148u = null;
                if (!this.f7195o.f12862k.g()) {
                    C1471A c1471a = this.f7195o;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c1471a.f12862k.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c1471a.iterator();
                            while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                ((U.c) it).remove();
                                w0Var.b();
                            }
                            Trace.endSection();
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f7195o.f12862k.g()) {
                            C1471A c1471a2 = this.f7195o;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c1471a2.f12862k.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it2 = c1471a2.iterator();
                                    while (((y5.i) ((U.c) it2).f9127m).hasNext()) {
                                        w0 w0Var2 = (w0) ((y5.i) ((U.c) it2).f9127m).next();
                                        ((U.c) it2).remove();
                                        w0Var2.b();
                                    }
                                    Trace.endSection();
                                } finally {
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e7) {
                        a();
                        throw e7;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.h():void");
    }

    public final void i(W.a aVar) throws Exception {
        try {
            synchronized (this.f7194n) {
                m();
                C0034g c0034g = this.f7204x;
                this.f7204x = new C0034g(27);
                try {
                    this.f7206z.getClass();
                    this.f7191k.getClass();
                    C0510p c0510p = this.f7189A;
                    if (!c0510p.f7132e.f7651i.c0()) {
                        C0486d.w("Expected applyChanges() to have been called");
                        throw null;
                    }
                    c0510p.n(c0034g, aVar);
                } catch (Exception e7) {
                    this.f7204x = c0034g;
                    throw e7;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f7195o.f12862k.g()) {
                    C1471A c1471a = this.f7195o;
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c1471a.f12862k.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c1471a.iterator();
                            while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                ((U.c) it).remove();
                                w0Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                }
                throw th;
            } catch (Exception e8) {
                a();
                throw e8;
            }
        }
    }

    public final void j(W.a aVar) {
        if (this.f7190B) {
            C0486d.U("The composition is disposed");
            throw null;
        }
        this.f7191k.a(this, aVar);
    }

    public final void k() {
        synchronized (this.f7194n) {
            try {
                boolean z7 = this.f7196p.f6947l > 0;
                if (z7 || !this.f7195o.f12862k.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        C0517t c0517t = new C0517t(this.f7195o);
                        if (z7) {
                            D0 d0M = this.f7196p.m();
                            try {
                                C0486d.A(d0M, c0517t);
                                d0M.e(true);
                                this.f7192l.I();
                                c0517t.e();
                            } catch (Throwable th) {
                                d0M.e(false);
                                throw th;
                            }
                        }
                        c0517t.d();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                ((C1504y) this.f7197q.f741l).a();
                ((C1504y) this.f7200t.f741l).a();
                ((C1504y) this.f7204x.f741l).a();
                this.f7201u.f7651i.a0();
                this.f7202v.f7651i.a0();
                C0510p c0510p = this.f7189A;
                c0510p.f7118D.f1530k.clear();
                c0510p.f7145r.clear();
                c0510p.f7132e.f7651i.a0();
                c0510p.f7148u = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f7194n) {
            try {
                C0510p c0510p = this.f7189A;
                if (c0510p.f7119E) {
                    C0486d.U("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f7190B) {
                    this.f7190B = true;
                    W.a aVar = AbstractC0496i.f7084b;
                    C0556a c0556a = c0510p.f7123K;
                    if (c0556a != null) {
                        e(c0556a);
                    }
                    boolean z7 = this.f7196p.f6947l > 0;
                    if (z7 || !this.f7195o.f12862k.g()) {
                        C0517t c0517t = new C0517t(this.f7195o);
                        if (z7) {
                            D0 d0M = this.f7196p.m();
                            try {
                                C0486d.O(d0M, c0517t);
                                d0M.e(true);
                                this.f7192l.l();
                                this.f7192l.I();
                                c0517t.e();
                            } catch (Throwable th) {
                                d0M.e(false);
                                throw th;
                            }
                        }
                        c0517t.d();
                    }
                    C0510p c0510p2 = this.f7189A;
                    c0510p2.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        c0510p2.f7129b.n(c0510p2);
                        c0510p2.f7118D.f1530k.clear();
                        c0510p2.f7145r.clear();
                        c0510p2.f7132e.f7651i.a0();
                        c0510p2.f7148u = null;
                        c0510p2.a.l();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f7191k.o(this);
    }

    public final void m() {
        AtomicReference atomicReference = this.f7193m;
        Object obj = C0486d.f7063g;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                C0486d.x("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                c((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                C0486d.x("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                c(set, true);
            }
        }
    }

    public final void n() {
        AtomicReference atomicReference = this.f7193m;
        Object andSet = atomicReference.getAndSet(null);
        if (kotlin.jvm.internal.l.a(andSet, C0486d.f7063g)) {
            return;
        }
        if (andSet instanceof Set) {
            c((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                c(set, false);
            }
            return;
        }
        if (andSet == null) {
            C0486d.x("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        C0486d.x("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final void o(ArrayList arrayList) throws Exception {
        if (arrayList.size() > 0) {
            ((X) ((O3.l) arrayList.get(0)).f7528k).getClass();
            throw null;
        }
        C0486d.P(true);
        try {
            C0510p c0510p = this.f7189A;
            c0510p.getClass();
            try {
                c0510p.z(arrayList);
                c0510p.i();
            } catch (Throwable th) {
                c0510p.a();
                throw th;
            }
        } catch (Throwable th2) {
            C1471A c1471a = this.f7195o;
            try {
                if (!c1471a.f12862k.g()) {
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    new ArrayList();
                    if (!c1471a.f12862k.g()) {
                        Trace.beginSection("Compose:abandons");
                        try {
                            Iterator it = c1471a.iterator();
                            while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                ((U.c) it).remove();
                                w0Var.b();
                            }
                            Trace.endSection();
                        } catch (Throwable th3) {
                            Trace.endSection();
                            throw th3;
                        }
                    }
                }
                throw th2;
            } catch (Exception e7) {
                a();
                throw e7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f2 A[Catch: all -> 0x0081, EDGE_INSN: B:80:0x00f2->B:68:0x00f2 BREAK  A[LOOP:0: B:52:0x00af->B:64:0x00e9], EDGE_INSN: B:81:0x00f2->B:68:0x00f2 BREAK  A[LOOP:0: B:52:0x00af->B:64:0x00e9], TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:28:0x0052, B:30:0x0059, B:37:0x0068, B:39:0x0074, B:42:0x0084, B:44:0x0088, B:45:0x0094, B:47:0x00a0, B:49:0x00a4, B:52:0x00af, B:54:0x00bf, B:56:0x00cb, B:58:0x00d5, B:61:0x00e0, B:64:0x00e9, B:65:0x00ed, B:68:0x00f2), top: B:78:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int p(O.C0509o0 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.p(O.o0, java.lang.Object):int");
    }

    public final void q() {
        C0519u c0519u;
        synchronized (this.f7194n) {
            try {
                for (Object obj : this.f7196p.f6948m) {
                    C0509o0 c0509o0 = obj instanceof C0509o0 ? (C0509o0) obj : null;
                    if (c0509o0 != null && (c0519u = c0509o0.f7109b) != null) {
                        c0519u.p(c0509o0, null);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(Object obj) {
        Object objE = ((C1504y) this.f7197q.f741l).e(obj);
        if (objE == null) {
            return;
        }
        boolean z7 = objE instanceof C1472B;
        C0034g c0034g = this.f7203w;
        if (!z7) {
            C0509o0 c0509o0 = (C0509o0) objE;
            if (c0509o0.c(obj) == 4) {
                c0034g.d(obj, c0509o0);
                return;
            }
            return;
        }
        C1472B c1472b = (C1472B) objE;
        Object[] objArr = c1472b.f12864b;
        long[] jArr = c1472b.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j7 = jArr[i7];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = 8 - ((~(i7 - length)) >>> 31);
                for (int i9 = 0; i9 < i8; i9++) {
                    if ((255 & j7) < 128) {
                        C0509o0 c0509o02 = (C0509o0) objArr[(i7 << 3) + i9];
                        if (c0509o02.c(obj) == 4) {
                            c0034g.d(obj, c0509o02);
                        }
                    }
                    j7 >>= 8;
                }
                if (i8 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof Q.f
            C2.g r3 = r0.f7200t
            C2.g r4 = r0.f7197q
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L66
            Q.f r1 = (Q.f) r1
            m.B r1 = r1.f7840k
            java.lang.Object[] r2 = r1.f12864b
            long[] r1 = r1.a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L61
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.32E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5b
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            java.lang.Object r15 = r4.f741l
            m.y r15 = (m.C1504y) r15
            boolean r15 = r15.b(r14)
            if (r15 != 0) goto L5a
            java.lang.Object r15 = r3.f741l
            m.y r15 = (m.C1504y) r15
            boolean r14 = r15.b(r14)
            if (r14 == 0) goto L5b
        L5a:
            return r6
        L5b:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5f:
            if (r11 != r12) goto L8b
        L61:
            if (r8 == r7) goto L8b
            int r8 = r8 + 1
            goto L1c
        L66:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            java.lang.Object r7 = r4.f741l
            m.y r7 = (m.C1504y) r7
            boolean r7 = r7.b(r2)
            if (r7 != 0) goto L8a
            java.lang.Object r7 = r3.f741l
            m.y r7 = (m.C1504y) r7
            boolean r2 = r7.b(r2)
            if (r2 == 0) goto L6c
        L8a:
            return r6
        L8b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.s(java.util.Set):boolean");
    }

    public final boolean t() {
        boolean zC;
        synchronized (this.f7194n) {
            try {
                m();
                try {
                    C0034g c0034g = this.f7204x;
                    this.f7204x = new C0034g(27);
                    try {
                        this.f7206z.getClass();
                        this.f7191k.getClass();
                        zC = this.f7189A.C(c0034g);
                        if (!zC) {
                            n();
                        }
                    } catch (Exception e7) {
                        this.f7204x = c0034g;
                        throw e7;
                    }
                } catch (Throwable th) {
                    try {
                        if (!this.f7195o.f12862k.g()) {
                            C1471A c1471a = this.f7195o;
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            new ArrayList();
                            if (!c1471a.f12862k.g()) {
                                Trace.beginSection("Compose:abandons");
                                try {
                                    Iterator it = c1471a.iterator();
                                    while (((y5.i) ((U.c) it).f9127m).hasNext()) {
                                        w0 w0Var = (w0) ((y5.i) ((U.c) it).f9127m).next();
                                        ((U.c) it).remove();
                                        w0Var.b();
                                    }
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    Trace.endSection();
                                    throw th2;
                                }
                            }
                        }
                        throw th;
                    } catch (Exception e8) {
                        a();
                        throw e8;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Set[]] */
    public final void u(Q.f fVar) {
        Q.f fVar2;
        while (true) {
            Object obj = this.f7193m.get();
            if (obj == null ? true : obj.equals(C0486d.f7063g)) {
                fVar2 = fVar;
            } else if (obj instanceof Set) {
                fVar2 = new Set[]{obj, fVar};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f7193m).toString());
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>", obj);
                Set[] setArr = (Set[]) obj;
                kotlin.jvm.internal.l.f("<this>", setArr);
                int length = setArr.length;
                ?? CopyOf = Arrays.copyOf(setArr, length + 1);
                CopyOf[length] = fVar;
                fVar2 = CopyOf;
            }
            AtomicReference atomicReference = this.f7193m;
            while (!atomicReference.compareAndSet(obj, fVar2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.f7194n) {
                    n();
                }
                return;
            }
            return;
        }
    }

    public final void v(Object obj) {
        C0509o0 c0509o0W;
        boolean z7;
        boolean z8;
        int i7;
        int i8;
        C0510p c0510p = this.f7189A;
        if (c0510p.f7153z <= 0 && (c0509o0W = c0510p.w()) != null) {
            boolean z9 = true;
            int i9 = c0509o0W.a | 1;
            c0509o0W.a = i9;
            if ((i9 & 32) == 0) {
                C1501v c1501v = c0509o0W.f7113f;
                if (c1501v == null) {
                    c1501v = new C1501v();
                    c0509o0W.f7113f = c1501v;
                }
                int i10 = c0509o0W.f7112e;
                int iB = c1501v.b(obj);
                if (iB < 0) {
                    iB = ~iB;
                    i8 = -1;
                } else {
                    i8 = c1501v.f12930c[iB];
                }
                c1501v.f12929b[iB] = obj;
                c1501v.f12930c[iB] = i10;
                if (i8 == c0509o0W.f7112e) {
                    return;
                }
            }
            if (obj instanceof Y.w) {
                ((Y.w) obj).e(1);
            }
            this.f7197q.d(obj, c0509o0W);
            if (obj instanceof E) {
                E e7 = (E) obj;
                D dG = e7.g();
                C0034g c0034g = this.f7200t;
                c0034g.u(obj);
                C1501v c1501v2 = dG.f6964e;
                Object[] objArr = c1501v2.f12929b;
                long[] jArr = c1501v2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j7 = jArr[i11];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8;
                            int i13 = 8 - ((~(i11 - length)) >>> 31);
                            int i14 = 0;
                            while (i14 < i13) {
                                if ((j7 & 255) < 128) {
                                    i7 = i12;
                                    Y.v vVar = (Y.v) objArr[(i11 << 3) + i14];
                                    if (vVar instanceof Y.w) {
                                        z8 = true;
                                        ((Y.w) vVar).e(1);
                                    } else {
                                        z8 = true;
                                    }
                                    c0034g.d(vVar, obj);
                                } else {
                                    z8 = z9;
                                    i7 = i12;
                                }
                                j7 >>= i7;
                                i14++;
                                z9 = z8;
                                i12 = i7;
                            }
                            z7 = z9;
                            if (i13 != i12) {
                                break;
                            }
                        } else {
                            z7 = z9;
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                        z9 = z7;
                    }
                }
                Object obj2 = dG.f6965f;
                C1504y c1504y = c0509o0W.f7114g;
                if (c1504y == null) {
                    c1504y = new C1504y();
                    c0509o0W.f7114g = c1504y;
                }
                c1504y.i(e7, obj2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f7194n
            monitor-enter(r0)
            r14.r(r15)     // Catch: java.lang.Throwable -> L53
            C2.g r1 = r14.f7200t     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.f741l     // Catch: java.lang.Throwable -> L53
            m.y r1 = (m.C1504y) r1     // Catch: java.lang.Throwable -> L53
            java.lang.Object r15 = r1.e(r15)     // Catch: java.lang.Throwable -> L53
            if (r15 == 0) goto L65
            boolean r1 = r15 instanceof m.C1472B     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L60
            m.B r15 = (m.C1472B) r15     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r1 = r15.f12864b     // Catch: java.lang.Throwable -> L53
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L53
            int r2 = r15.length     // Catch: java.lang.Throwable -> L53
            int r2 = r2 + (-2)
            if (r2 < 0) goto L65
            r3 = 0
            r4 = r3
        L23:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L53
            long r7 = ~r5     // Catch: java.lang.Throwable -> L53
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L5b
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L53
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L3d:
            if (r9 >= r7) goto L59
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L55
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L53
            O.E r10 = (O.E) r10     // Catch: java.lang.Throwable -> L53
            r14.r(r10)     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r15 = move-exception
            goto L67
        L55:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L3d
        L59:
            if (r7 != r8) goto L65
        L5b:
            if (r4 == r2) goto L65
            int r4 = r4 + 1
            goto L23
        L60:
            O.E r15 = (O.E) r15     // Catch: java.lang.Throwable -> L53
            r14.r(r15)     // Catch: java.lang.Throwable -> L53
        L65:
            monitor-exit(r0)
            return
        L67:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0519u.w(java.lang.Object):void");
    }
}
