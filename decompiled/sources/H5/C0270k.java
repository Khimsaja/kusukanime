package H5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: H5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0270k extends L implements InterfaceC0269j, U3.d, E0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3852p = AtomicIntegerFieldUpdater.newUpdater(C0270k.class, "_decisionAndIndex$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3853q = AtomicReferenceFieldUpdater.newUpdater(C0270k.class, Object.class, "_state$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3854r = AtomicReferenceFieldUpdater.newUpdater(C0270k.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final S3.c f3855n;

    /* renamed from: o, reason: collision with root package name */
    public final S3.h f3856o;

    public C0270k(int i7, S3.c cVar) {
        super(i7);
        this.f3855n = cVar;
        this.f3856o = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0256b.a;
    }

    public static Object B(s0 s0Var, Object obj, int i7, e4.o oVar) {
        if (obj instanceof C0278t) {
            return obj;
        }
        if (i7 != 1 && i7 != 2) {
            return obj;
        }
        if (oVar != null || (s0Var instanceof InterfaceC0268i)) {
            return new C0277s(obj, s0Var instanceof InterfaceC0268i ? (InterfaceC0268i) s0Var : null, oVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void w(s0 s0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + s0Var + ", already has " + obj).toString());
    }

    public final void A(AbstractC0281w abstractC0281w) {
        O3.C c2 = O3.C.a;
        S3.c cVar = this.f3855n;
        M5.f fVar = cVar instanceof M5.f ? (M5.f) cVar : null;
        z(c2, (fVar != null ? fVar.f6578n : null) == abstractC0281w ? 4 : this.f3813m, null);
    }

    public final F2.G C(Object obj, e4.o oVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3853q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj2 instanceof s0;
            F2.G g4 = D.a;
            if (!z7) {
                boolean z8 = obj2 instanceof C0277s;
                return null;
            }
            Object objB = B((s0) obj2, obj, this.f3813m, oVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!v()) {
                n();
            }
            return g4;
        }
    }

    @Override // H5.E0
    public final void a(M5.q qVar, int i7) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f3852p;
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        u(qVar);
    }

    @Override // H5.L
    public final void b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3853q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof s0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0278t) {
                return;
            }
            if (!(obj instanceof C0277s)) {
                cancellationException2 = cancellationException;
                C0277s c0277s = new C0277s(obj, (InterfaceC0268i) null, (e4.o) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0277s)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0277s c0277s2 = (C0277s) obj;
            if (c0277s2.f3882e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0277s c0277sA = C0277s.a(c0277s2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0277sA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            InterfaceC0268i interfaceC0268i = c0277s2.f3879b;
            if (interfaceC0268i != null) {
                k(interfaceC0268i, cancellationException);
            }
            e4.o oVar = c0277s2.f3880c;
            if (oVar != null) {
                l(oVar, cancellationException, c0277s2.a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // H5.InterfaceC0269j
    public final F2.G c(Object obj, e4.o oVar) {
        return C(obj, oVar);
    }

    @Override // H5.InterfaceC0269j
    public final boolean cancel(Throwable th) {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3853q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof s0)) {
                return false;
            }
            boolean z7 = (obj instanceof InterfaceC0268i) || (obj instanceof M5.q);
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0271l c0271l = new C0271l(cancellationException, z7);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0271l)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            s0 s0Var = (s0) obj;
            if (s0Var instanceof InterfaceC0268i) {
                k((InterfaceC0268i) obj, th);
            } else if (s0Var instanceof M5.q) {
                m((M5.q) obj, th);
            }
            if (!v()) {
                n();
            }
            o(this.f3813m);
            return true;
        }
    }

    @Override // H5.L
    public final S3.c d() {
        return this.f3855n;
    }

    @Override // H5.L
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // H5.L
    public final Object f(Object obj) {
        return obj instanceof C0277s ? ((C0277s) obj).a : obj;
    }

    @Override // U3.d
    public final U3.d getCallerFrame() {
        S3.c cVar = this.f3855n;
        if (cVar instanceof U3.d) {
            return (U3.d) cVar;
        }
        return null;
    }

    @Override // S3.c
    public final S3.h getContext() {
        return this.f3856o;
    }

    @Override // H5.InterfaceC0269j
    public final void h(Object obj, e4.o oVar) throws J {
        z(obj, this.f3813m, oVar);
    }

    @Override // H5.InterfaceC0269j
    public final void i(Object obj) throws J {
        o(this.f3813m);
    }

    @Override // H5.InterfaceC0269j
    public final boolean isCancelled() {
        return f3853q.get(this) instanceof C0271l;
    }

    @Override // H5.L
    public final Object j() {
        return f3853q.get(this);
    }

    public final void k(InterfaceC0268i interfaceC0268i, Throwable th) {
        try {
            interfaceC0268i.a(th);
        } catch (Throwable th2) {
            D.s(this.f3856o, new D6.r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(e4.o oVar, Throwable th, Object obj) {
        S3.h hVar = this.f3856o;
        try {
            oVar.invoke(th, obj, hVar);
        } catch (Throwable th2) {
            D.s(hVar, new D6.r("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(M5.q qVar, Throwable th) {
        S3.h hVar = this.f3856o;
        int i7 = f3852p.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.h(i7, hVar);
        } catch (Throwable th2) {
            D.s(hVar, new D6.r("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3854r;
        N n7 = (N) atomicReferenceFieldUpdater.get(this);
        if (n7 == null) {
            return;
        }
        n7.dispose();
        atomicReferenceFieldUpdater.set(this, r0.f3878k);
    }

    public final void o(int i7) throws J {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        do {
            atomicIntegerFieldUpdater = f3852p;
            i8 = atomicIntegerFieldUpdater.get(this);
            int i9 = i8 >> 29;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                S3.c cVar = this.f3855n;
                boolean z7 = i7 == 4;
                if (!z7 && (cVar instanceof M5.f)) {
                    boolean z8 = i7 == 1 || i7 == 2;
                    int i10 = this.f3813m;
                    if (z8 == (i10 == 1 || i10 == 2)) {
                        M5.f fVar = (M5.f) cVar;
                        AbstractC0281w abstractC0281w = fVar.f6578n;
                        S3.h context = fVar.f6579o.getContext();
                        if (M5.a.j(abstractC0281w, context)) {
                            M5.a.i(abstractC0281w, context, this);
                            return;
                        }
                        W wA = w0.a();
                        if (wA.f3828l >= 4294967296L) {
                            wA.b0(this);
                            return;
                        }
                        wA.d0(true);
                        try {
                            D.A(this, cVar, true);
                            do {
                            } while (wA.f0());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                D.A(this, cVar, z7);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, 1073741824 + (536870911 & i8)));
    }

    public Throwable p(n0 n0Var) {
        return n0Var.H();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        boolean zV = v();
        do {
            atomicIntegerFieldUpdater = f3852p;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zV) {
                    y();
                }
                Object obj = f3853q.get(this);
                if (obj instanceof C0278t) {
                    throw ((C0278t) obj).a;
                }
                int i9 = this.f3813m;
                if (i9 == 1 || i9 == 2) {
                    InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) this.f3856o.get(C0263e0.f3843k);
                    if (interfaceC0265f0 != null && !interfaceC0265f0.b()) {
                        CancellationException cancellationExceptionH = interfaceC0265f0.H();
                        b(cancellationExceptionH);
                        throw cancellationExceptionH;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        if (((N) f3854r.get(this)) == null) {
            s();
        }
        if (zV) {
            y();
        }
        return T3.a.f9048k;
    }

    public final void r() {
        N nS = s();
        if (nS == null || (f3853q.get(this) instanceof s0)) {
            return;
        }
        nS.dispose();
        f3854r.set(this, r0.f3878k);
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        Throwable thA = O3.o.a(obj);
        if (thA != null) {
            obj = new C0278t(thA, false);
        }
        z(obj, this.f3813m, null);
    }

    public final N s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0265f0 interfaceC0265f0 = (InterfaceC0265f0) this.f3856o.get(C0263e0.f3843k);
        if (interfaceC0265f0 == null) {
            return null;
        }
        N nT = D.t(interfaceC0265f0, true, new C0272m(this, 0));
        do {
            atomicReferenceFieldUpdater = f3854r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, nT)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return nT;
    }

    public final void t(e4.k kVar) {
        u(new C0267h(0, kVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(x());
        sb.append('(');
        sb.append(D.D(this.f3855n));
        sb.append("){");
        Object obj = f3853q.get(this);
        sb.append(obj instanceof s0 ? "Active" : obj instanceof C0271l ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(D.p(this));
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        w(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(H5.s0 r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = H5.C0270k.f3853q
            java.lang.Object r2 = r0.get(r7)
            boolean r1 = r2 instanceof H5.C0256b
            if (r1 == 0) goto L19
        La:
            boolean r1 = r0.compareAndSet(r7, r2, r8)
            if (r1 == 0) goto L12
            goto La1
        L12:
            java.lang.Object r1 = r0.get(r7)
            if (r1 == r2) goto La
            goto L0
        L19:
            boolean r1 = r2 instanceof H5.InterfaceC0268i
            r3 = 0
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof M5.q
            if (r1 != 0) goto Laa
            boolean r1 = r2 instanceof H5.C0278t
            if (r1 == 0) goto L56
            r0 = r2
            H5.t r0 = (H5.C0278t) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = H5.C0278t.f3883b
            r5 = 0
            boolean r1 = r4.compareAndSet(r0, r5, r1)
            if (r1 == 0) goto L52
            boolean r1 = r2 instanceof H5.C0271l
            if (r1 == 0) goto La1
            if (r2 == 0) goto L3d
            goto L3e
        L3d:
            r0 = r3
        L3e:
            if (r0 == 0) goto L42
            java.lang.Throwable r3 = r0.a
        L42:
            boolean r0 = r8 instanceof H5.InterfaceC0268i
            if (r0 == 0) goto L4c
            H5.i r8 = (H5.InterfaceC0268i) r8
            r7.k(r8, r3)
            return
        L4c:
            M5.q r8 = (M5.q) r8
            r7.m(r8, r3)
            return
        L52:
            w(r8, r2)
            throw r3
        L56:
            boolean r1 = r2 instanceof H5.C0277s
            if (r1 == 0) goto L8a
            r1 = r2
            H5.s r1 = (H5.C0277s) r1
            H5.i r4 = r1.f3879b
            if (r4 != 0) goto L86
            boolean r4 = r8 instanceof M5.q
            if (r4 == 0) goto L66
            goto La1
        L66:
            r4 = r8
            H5.i r4 = (H5.InterfaceC0268i) r4
            java.lang.Throwable r5 = r1.f3882e
            if (r5 == 0) goto L71
            r7.k(r4, r5)
            return
        L71:
            r5 = 29
            H5.s r1 = H5.C0277s.a(r1, r4, r3, r5)
        L77:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto L7e
            goto La1
        L7e:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L77
            goto L0
        L86:
            w(r8, r2)
            throw r3
        L8a:
            boolean r1 = r8 instanceof M5.q
            if (r1 == 0) goto L8f
            goto La1
        L8f:
            r3 = r8
            H5.i r3 = (H5.InterfaceC0268i) r3
            H5.s r1 = new H5.s
            r4 = 0
            r5 = 0
            r6 = 28
            r1.<init>(r2, r3, r4, r5, r6)
        L9b:
            boolean r3 = r0.compareAndSet(r7, r2, r1)
            if (r3 == 0) goto La2
        La1:
            return
        La2:
            java.lang.Object r3 = r0.get(r7)
            if (r3 == r2) goto L9b
            goto L0
        Laa:
            w(r8, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.C0270k.u(H5.s0):void");
    }

    public final boolean v() {
        if (this.f3813m != 2) {
            return false;
        }
        S3.c cVar = this.f3855n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", cVar);
        return M5.f.f6577r.get((M5.f) cVar) != null;
    }

    public String x() {
        return "CancellableContinuation";
    }

    public final void y() {
        S3.c cVar = this.f3855n;
        Throwable th = null;
        M5.f fVar = cVar instanceof M5.f ? (M5.f) cVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.f.f6577r;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                F2.G g4 = M5.a.f6569c;
                if (obj == g4) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, g4, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != g4) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            cancel(th);
        }
    }

    public final void z(Object obj, int i7, e4.o oVar) throws J {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3853q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof s0) {
                Object objB = B((s0) obj2, obj, i7, oVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!v()) {
                    n();
                }
                o(i7);
                return;
            }
            if (obj2 instanceof C0271l) {
                C0271l c0271l = (C0271l) obj2;
                c0271l.getClass();
                if (C0271l.f3861c.compareAndSet(c0271l, 0, 1)) {
                    if (oVar != null) {
                        l(oVar, c0271l.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }
}
