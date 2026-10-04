package H5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class n0 implements InterfaceC0265f0, t0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3873k = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3874l = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public n0(boolean z7) {
        this._state$volatile = z7 ? D.f3805j : D.f3804i;
    }

    public static C0274o K(M5.i iVar) {
        while (iVar.h()) {
            M5.i iVarD = iVar.d();
            if (iVarD == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M5.i.f6590l;
                Object obj = atomicReferenceFieldUpdater.get(iVar);
                while (true) {
                    iVar = (M5.i) obj;
                    if (!iVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(iVar);
                }
            } else {
                iVar = iVarD;
            }
        }
        while (true) {
            iVar = iVar.g();
            if (!iVar.h()) {
                if (iVar instanceof C0274o) {
                    return (C0274o) iVar;
                }
                if (iVar instanceof p0) {
                    return null;
                }
            }
        }
    }

    public static String W(Object obj) {
        if (!(obj instanceof l0)) {
            return obj instanceof InterfaceC0255a0 ? ((InterfaceC0255a0) obj).b() ? "Active" : "New" : obj instanceof C0278t ? "Cancelled" : "Completed";
        }
        l0 l0Var = (l0) obj;
        return l0Var.e() ? "Cancelling" : l0.f3862l.get(l0Var) == 1 ? "Completing" : "Active";
    }

    public boolean A(Throwable th) {
        return false;
    }

    public final void C(InterfaceC0265f0 interfaceC0265f0) {
        r0 r0Var = r0.f3878k;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3874l;
        if (interfaceC0265f0 == null) {
            atomicReferenceFieldUpdater.set(this, r0Var);
            return;
        }
        interfaceC0265f0.start();
        InterfaceC0273n interfaceC0273nG = interfaceC0265f0.g(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0273nG);
        if (J()) {
            interfaceC0273nG.dispose();
            atomicReferenceFieldUpdater.set(this, r0Var);
        }
    }

    public final N D(boolean z7, i0 i0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        r0 r0Var;
        boolean z8;
        boolean zA;
        i0Var.f3850n = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f3873k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z9 = obj instanceof P;
            r0Var = r0.f3878k;
            z8 = true;
            if (!z9) {
                if (!(obj instanceof InterfaceC0255a0)) {
                    z8 = false;
                    break;
                }
                InterfaceC0255a0 interfaceC0255a0 = (InterfaceC0255a0) obj;
                p0 p0VarC = interfaceC0255a0.c();
                if (p0VarC == null) {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.JobNode", obj);
                    U((i0) obj);
                } else {
                    if (i0Var.j()) {
                        l0 l0Var = interfaceC0255a0 instanceof l0 ? (l0) interfaceC0255a0 : null;
                        Throwable thD = l0Var != null ? l0Var.d() : null;
                        if (thD == null) {
                            zA = p0VarC.a(i0Var, 5);
                        } else if (z7) {
                            i0Var.k(thD);
                            return r0Var;
                        }
                    } else {
                        zA = p0VarC.a(i0Var, 1);
                    }
                    if (zA) {
                        break;
                    }
                }
            } else {
                P p7 = (P) obj;
                if (p7.f3817k) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                S(p7);
            }
        }
        if (z8) {
            return i0Var;
        }
        if (z7) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0278t c0278t = obj2 instanceof C0278t ? (C0278t) obj2 : null;
            i0Var.k(c0278t != null ? c0278t.a : null);
        }
        return r0Var;
    }

    public boolean E() {
        return this instanceof C0264f;
    }

    public final boolean F(Object obj) {
        Object objX;
        do {
            objX = X(f3873k.get(this), obj);
            if (objX == D.f3799d) {
                return false;
            }
            if (objX == D.f3800e) {
                return true;
            }
        } while (objX == D.f3801f);
        d(objX);
        return true;
    }

    public final Object G(Object obj) {
        Object objX;
        do {
            objX = X(f3873k.get(this), obj);
            if (objX == D.f3799d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0278t c0278t = obj instanceof C0278t ? (C0278t) obj : null;
                throw new IllegalStateException(str, c0278t != null ? c0278t.a : null);
            }
        } while (objX == D.f3801f);
        return objX;
    }

    @Override // H5.InterfaceC0265f0
    public final CancellationException H() {
        CancellationException g0Var;
        Object obj = f3873k.get(this);
        if (!(obj instanceof l0)) {
            if (obj instanceof InterfaceC0255a0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0278t)) {
                return new g0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0278t) obj).a;
            g0Var = th instanceof CancellationException ? (CancellationException) th : null;
            return g0Var == null ? new g0(p(), th, this) : g0Var;
        }
        Throwable thD = ((l0) obj).d();
        if (thD == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        g0Var = thD instanceof CancellationException ? (CancellationException) thD : null;
        if (g0Var == null) {
            if (strConcat == null) {
                strConcat = p();
            }
            g0Var = new g0(strConcat, thD, this);
        }
        return g0Var;
    }

    public String I() {
        return getClass().getSimpleName();
    }

    @Override // H5.InterfaceC0265f0
    public final boolean J() {
        return !(f3873k.get(this) instanceof InterfaceC0255a0);
    }

    @Override // H5.InterfaceC0265f0
    public final N L(boolean z7, boolean z8, e4.k kVar) {
        return D(z8, z7 ? new C0261d0(kVar) : new O(1, kVar));
    }

    public final void M(p0 p0Var, Throwable th) {
        N(th);
        p0Var.a(new M5.h(4), 4);
        Object obj = M5.i.f6589k.get(p0Var);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        D6.r rVar = null;
        for (M5.i iVarG = (M5.i) obj; !iVarG.equals(p0Var); iVarG = iVarG.g()) {
            if ((iVarG instanceof i0) && ((i0) iVarG).j()) {
                try {
                    ((i0) iVarG).k(th);
                } catch (Throwable th2) {
                    if (rVar != null) {
                        q0.c.j(rVar, th2);
                    } else {
                        rVar = new D6.r("Exception in completion handler " + iVarG + " for " + this, th2);
                    }
                }
            }
        }
        if (rVar != null) {
            B(rVar);
        }
        o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [H5.Z] */
    public final void S(P p7) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p0 p0Var = new p0();
        if (!p7.f3817k) {
            p0Var = new Z(p0Var);
        }
        do {
            atomicReferenceFieldUpdater = f3873k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p7, p0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p7);
    }

    public final void U(i0 i0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p0 p0Var = new p0();
        i0Var.getClass();
        M5.i.f6590l.set(p0Var, i0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M5.i.f6589k;
        atomicReferenceFieldUpdater2.set(p0Var, i0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(i0Var) == i0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(i0Var, i0Var, p0Var)) {
                    if (atomicReferenceFieldUpdater2.get(i0Var) != i0Var) {
                        break;
                    }
                }
                p0Var.f(i0Var);
                break loop0;
            }
            break;
        }
        M5.i iVarG = i0Var.g();
        do {
            atomicReferenceFieldUpdater = f3873k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, i0Var, iVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == i0Var);
    }

    public final int V(Object obj) {
        boolean z7 = obj instanceof P;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3873k;
        if (z7) {
            if (((P) obj).f3817k) {
                return 0;
            }
            P p7 = D.f3805j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p7)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            R();
            return 1;
        }
        if (!(obj instanceof Z)) {
            return 0;
        }
        p0 p0Var = ((Z) obj).f3832k;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        R();
        return 1;
    }

    public final Object X(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0255a0)) {
            return D.f3799d;
        }
        if (((obj instanceof P) || (obj instanceof i0)) && !(obj instanceof C0274o) && !(obj2 instanceof C0278t)) {
            InterfaceC0255a0 interfaceC0255a0 = (InterfaceC0255a0) obj;
            Object c0257b0 = obj2 instanceof InterfaceC0255a0 ? new C0257b0((InterfaceC0255a0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f3873k;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0255a0, c0257b0)) {
                    N(null);
                    Q(obj2);
                    r(interfaceC0255a0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0255a0);
            return D.f3801f;
        }
        InterfaceC0255a0 interfaceC0255a02 = (InterfaceC0255a0) obj;
        p0 p0VarZ = z(interfaceC0255a02);
        if (p0VarZ == null) {
            return D.f3801f;
        }
        l0 l0Var = interfaceC0255a02 instanceof l0 ? (l0) interfaceC0255a02 : null;
        if (l0Var == null) {
            l0Var = new l0(p0VarZ, null);
        }
        synchronized (l0Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l0.f3862l;
                if (atomicIntegerFieldUpdater.get(l0Var) == 1) {
                    return D.f3799d;
                }
                atomicIntegerFieldUpdater.set(l0Var, 1);
                if (l0Var != interfaceC0255a02) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3873k;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0255a02, l0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != interfaceC0255a02) {
                            return D.f3801f;
                        }
                    }
                }
                boolean zE = l0Var.e();
                C0278t c0278t = obj2 instanceof C0278t ? (C0278t) obj2 : null;
                if (c0278t != null) {
                    l0Var.a(c0278t.a);
                }
                Throwable thD = zE ? null : l0Var.d();
                if (thD != null) {
                    M(p0VarZ, thD);
                }
                C0274o c0274oK = K(p0VarZ);
                if (c0274oK != null && Y(l0Var, c0274oK, obj2)) {
                    return D.f3800e;
                }
                p0VarZ.a(new M5.h(2), 2);
                C0274o c0274oK2 = K(p0VarZ);
                return (c0274oK2 == null || !Y(l0Var, c0274oK2, obj2)) ? u(l0Var, obj2) : D.f3800e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean Y(l0 l0Var, C0274o c0274o, Object obj) {
        while (D.t(c0274o.f3875o, false, new k0(this, l0Var, c0274o, obj)) == r0.f3878k) {
            c0274o = K(c0274o);
            if (c0274o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // H5.InterfaceC0265f0
    public boolean b() {
        Object obj = f3873k.get(this);
        return (obj instanceof InterfaceC0255a0) && ((InterfaceC0255a0) obj).b();
    }

    @Override // H5.InterfaceC0265f0
    public void e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new g0(p(), null, this);
        }
        n(cancellationException);
    }

    public void f(Object obj) {
        d(obj);
    }

    @Override // S3.h
    public final Object fold(Object obj, e4.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // H5.InterfaceC0265f0
    public final InterfaceC0273n g(n0 n0Var) {
        C0274o c0274o = new C0274o(n0Var);
        c0274o.f3850n = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3873k;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof P) {
                P p7 = (P) obj;
                if (p7.f3817k) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0274o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                S(p7);
            } else {
                boolean z7 = obj instanceof InterfaceC0255a0;
                r0 r0Var = r0.f3878k;
                if (!z7) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0278t c0278t = obj2 instanceof C0278t ? (C0278t) obj2 : null;
                    c0274o.k(c0278t != null ? c0278t.a : null);
                    return r0Var;
                }
                p0 p0VarC = ((InterfaceC0255a0) obj).c();
                if (p0VarC == null) {
                    kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.JobNode", obj);
                    U((i0) obj);
                } else if (!p0VarC.a(c0274o, 7)) {
                    boolean zA = p0VarC.a(c0274o, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof l0) {
                        thD = ((l0) obj3).d();
                    } else {
                        C0278t c0278t2 = obj3 instanceof C0278t ? (C0278t) obj3 : null;
                        if (c0278t2 != null) {
                            thD = c0278t2.a;
                        }
                    }
                    c0274o.k(thD);
                    if (zA) {
                        break loop0;
                    }
                    return r0Var;
                }
            }
        }
        return c0274o;
    }

    @Override // S3.h
    public final S3.f get(S3.g gVar) {
        return P3.F.u(this, gVar);
    }

    @Override // S3.f
    public final S3.g getKey() {
        return C0263e0.f3843k;
    }

    @Override // H5.InterfaceC0265f0
    public final boolean isCancelled() {
        Object obj = f3873k.get(this);
        if (obj instanceof C0278t) {
            return true;
        }
        return (obj instanceof l0) && ((l0) obj).e();
    }

    public Object j() throws Throwable {
        Object obj = f3873k.get(this);
        if (obj instanceof InterfaceC0255a0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0278t) {
            throw ((C0278t) obj).a;
        }
        return D.E(obj);
    }

    public final Object k(S3.c cVar) throws Throwable {
        Object obj;
        int i7 = 1;
        do {
            obj = f3873k.get(this);
            if (!(obj instanceof InterfaceC0255a0)) {
                if (obj instanceof C0278t) {
                    throw ((C0278t) obj).a;
                }
                return D.E(obj);
            }
        } while (V(obj) < 0);
        j0 j0Var = new j0(this, P3.r.E(cVar));
        j0Var.r();
        j0Var.u(new C0267h(i7, D.t(this, true, new O(2, j0Var))));
        Object objQ = j0Var.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[PHI: r0
      0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.n0.l(java.lang.Object):boolean");
    }

    @Override // H5.InterfaceC0265f0
    public final Object m(S3.c cVar) {
        Object obj;
        O3.C c2;
        do {
            obj = f3873k.get(this);
            boolean z7 = obj instanceof InterfaceC0255a0;
            c2 = O3.C.a;
            if (!z7) {
                D.m(cVar.getContext());
                return c2;
            }
        } while (V(obj) < 0);
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        c0270k.u(new C0267h(1, D.t(this, true, new C0272m(c0270k, 1))));
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        if (objQ != aVar) {
            objQ = c2;
        }
        return objQ == aVar ? objQ : c2;
    }

    @Override // S3.h
    public final S3.h minusKey(S3.g gVar) {
        return P3.F.K(this, gVar);
    }

    public void n(CancellationException cancellationException) {
        l(cancellationException);
    }

    public final boolean o(Throwable th) {
        if (E()) {
            return true;
        }
        boolean z7 = th instanceof CancellationException;
        InterfaceC0273n interfaceC0273n = (InterfaceC0273n) f3874l.get(this);
        return (interfaceC0273n == null || interfaceC0273n == r0.f3878k) ? z7 : interfaceC0273n.e(th) || z7;
    }

    public String p() {
        return "Job was cancelled";
    }

    @Override // S3.h
    public final S3.h plus(S3.h hVar) {
        return P3.F.M(this, hVar);
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return l(th) && w();
    }

    public final void r(InterfaceC0255a0 interfaceC0255a0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3874l;
        InterfaceC0273n interfaceC0273n = (InterfaceC0273n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0273n != null) {
            interfaceC0273n.dispose();
            atomicReferenceFieldUpdater.set(this, r0.f3878k);
        }
        D6.r rVar = null;
        C0278t c0278t = obj instanceof C0278t ? (C0278t) obj : null;
        Throwable th = c0278t != null ? c0278t.a : null;
        if (interfaceC0255a0 instanceof i0) {
            try {
                ((i0) interfaceC0255a0).k(th);
                return;
            } catch (Throwable th2) {
                B(new D6.r("Exception in completion handler " + interfaceC0255a0 + " for " + this, th2));
                return;
            }
        }
        p0 p0VarC = interfaceC0255a0.c();
        if (p0VarC != null) {
            p0VarC.a(new M5.h(1), 1);
            Object obj2 = M5.i.f6589k.get(p0VarC);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
            for (M5.i iVarG = (M5.i) obj2; !iVarG.equals(p0VarC); iVarG = iVarG.g()) {
                if (iVarG instanceof i0) {
                    try {
                        ((i0) iVarG).k(th);
                    } catch (Throwable th3) {
                        if (rVar != null) {
                            q0.c.j(rVar, th3);
                        } else {
                            rVar = new D6.r("Exception in completion handler " + iVarG + " for " + this, th3);
                        }
                    }
                }
            }
            if (rVar != null) {
                B(rVar);
            }
        }
    }

    @Override // H5.InterfaceC0265f0
    public final y5.h s() {
        return new P3.p(new m0(this, null));
    }

    @Override // H5.InterfaceC0265f0
    public final boolean start() {
        int iV;
        do {
            iV = V(f3873k.get(this));
            if (iV == 0) {
                return false;
            }
        } while (iV != 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable t(Object obj) {
        CancellationException cancellationExceptionD;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        n0 n0Var = (n0) ((t0) obj);
        Object obj2 = f3873k.get(n0Var);
        if (obj2 instanceof l0) {
            cancellationExceptionD = ((l0) obj2).d();
        } else if (obj2 instanceof C0278t) {
            cancellationExceptionD = ((C0278t) obj2).a;
        } else {
            if (obj2 instanceof InterfaceC0255a0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionD = null;
        }
        CancellationException cancellationException = cancellationExceptionD instanceof CancellationException ? cancellationExceptionD : null;
        return cancellationException == null ? new g0("Parent job is ".concat(W(obj2)), cancellationExceptionD, n0Var) : cancellationException;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(I() + '{' + W(f3873k.get(this)) + '}');
        sb.append('@');
        sb.append(D.p(this));
        return sb.toString();
    }

    public final Object u(l0 l0Var, Object obj) {
        boolean zE;
        Throwable thV;
        C0278t c0278t = obj instanceof C0278t ? (C0278t) obj : null;
        Throwable th = c0278t != null ? c0278t.a : null;
        synchronized (l0Var) {
            zE = l0Var.e();
            ArrayList<Throwable> arrayListF = l0Var.f(th);
            thV = v(l0Var, arrayListF);
            if (thV != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != thV && th2 != thV && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        q0.c.j(thV, th2);
                    }
                }
            }
        }
        if (thV != null && thV != th) {
            obj = new C0278t(thV, false);
        }
        if (thV != null && (o(thV) || A(thV))) {
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C0278t.f3883b.compareAndSet((C0278t) obj, 0, 1);
        }
        if (!zE) {
            N(thV);
        }
        Q(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3873k;
        Object c0257b0 = obj instanceof InterfaceC0255a0 ? new C0257b0((InterfaceC0255a0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, l0Var, c0257b0) && atomicReferenceFieldUpdater.get(this) == l0Var) {
        }
        r(l0Var, obj);
        return obj;
    }

    public final Throwable v(l0 l0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (l0Var.e()) {
                return new g0(p(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof y0) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof y0)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean w() {
        return true;
    }

    @Override // H5.InterfaceC0265f0
    public final N x(e4.k kVar) {
        return D(true, new O(1, kVar));
    }

    public boolean y() {
        return this instanceof C0276q;
    }

    public final p0 z(InterfaceC0255a0 interfaceC0255a0) {
        p0 p0VarC = interfaceC0255a0.c();
        if (p0VarC != null) {
            return p0VarC;
        }
        if (interfaceC0255a0 instanceof P) {
            return new p0();
        }
        if (interfaceC0255a0 instanceof i0) {
            U((i0) interfaceC0255a0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0255a0).toString());
    }

    public void R() {
    }

    public void B(D6.r rVar) {
        throw rVar;
    }

    public void N(Throwable th) {
    }

    public void Q(Object obj) {
    }

    public void d(Object obj) {
    }
}
