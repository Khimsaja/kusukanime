package J5;

import F2.G;
import H5.C0270k;
import H5.D;
import H5.E0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d implements E0 {

    /* renamed from: k, reason: collision with root package name */
    public Object f4303k = g.f4331p;

    /* renamed from: l, reason: collision with root package name */
    public C0270k f4304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f4305m;

    public d(e eVar) {
        this.f4305m = eVar;
    }

    @Override // H5.E0
    public final void a(M5.q qVar, int i7) {
        C0270k c0270k = this.f4304l;
        if (c0270k != null) {
            c0270k.a(qVar, i7);
        }
    }

    public final Object b(U3.c cVar) throws Throwable {
        n nVarK;
        Boolean bool;
        Object obj = this.f4303k;
        boolean z7 = true;
        if (obj == g.f4331p || obj == g.f4327l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f4311q;
            e eVar = this.f4305m;
            n nVar = (n) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                eVar.getClass();
                if (eVar.q(e.f4306l.get(eVar), true)) {
                    this.f4303k = g.f4327l;
                    Throwable thL = eVar.l();
                    if (thL != null) {
                        int i7 = M5.r.a;
                        throw thL;
                    }
                    z7 = false;
                } else {
                    long andIncrement = e.f4307m.getAndIncrement(eVar);
                    long j7 = g.f4317b;
                    long j8 = andIncrement / j7;
                    int i8 = (int) (andIncrement % j7);
                    if (nVar.f6600c != j8) {
                        nVarK = eVar.k(j8, nVar);
                        if (nVarK == null) {
                            continue;
                        }
                    } else {
                        nVarK = nVar;
                    }
                    Object objY = eVar.y(nVarK, i8, andIncrement, null);
                    G g4 = g.f4328m;
                    if (objY == g4) {
                        throw new IllegalStateException("unreachable");
                    }
                    G g7 = g.f4330o;
                    if (objY == g7) {
                        if (andIncrement < eVar.o()) {
                            nVarK.b();
                        }
                        nVar = nVarK;
                    } else {
                        if (objY == g.f4329n) {
                            e eVar2 = this.f4305m;
                            C0270k c0270kR = D.r(P3.r.E(cVar));
                            try {
                                this.f4304l = c0270kR;
                                Object objY2 = eVar2.y(nVarK, i8, andIncrement, this);
                                if (objY2 == g4) {
                                    a(nVarK, i8);
                                } else {
                                    if (objY2 == g7) {
                                        if (andIncrement < eVar2.o()) {
                                            nVarK.b();
                                        }
                                        n nVar2 = (n) e.f4311q.get(eVar2);
                                        while (true) {
                                            if (eVar2.q(e.f4306l.get(eVar2), true)) {
                                                C0270k c0270k = this.f4304l;
                                                kotlin.jvm.internal.l.c(c0270k);
                                                this.f4304l = null;
                                                this.f4303k = g.f4327l;
                                                Throwable thL2 = eVar.l();
                                                if (thL2 == null) {
                                                    c0270k.resumeWith(Boolean.FALSE);
                                                } else {
                                                    c0270k.resumeWith(P3.r.r(thL2));
                                                }
                                            } else {
                                                long andIncrement2 = e.f4307m.getAndIncrement(eVar2);
                                                long j9 = g.f4317b;
                                                long j10 = andIncrement2 / j9;
                                                int i9 = (int) (andIncrement2 % j9);
                                                if (nVar2.f6600c != j10) {
                                                    n nVarK2 = eVar2.k(j10, nVar2);
                                                    if (nVarK2 != null) {
                                                        nVar2 = nVarK2;
                                                    }
                                                }
                                                Object objY3 = eVar2.y(nVar2, i9, andIncrement2, this);
                                                if (objY3 == g.f4328m) {
                                                    a(nVar2, i9);
                                                    break;
                                                }
                                                if (objY3 == g.f4330o) {
                                                    if (andIncrement2 < eVar2.o()) {
                                                        nVar2.b();
                                                    }
                                                } else {
                                                    if (objY3 == g.f4329n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    nVar2.b();
                                                    this.f4303k = objY3;
                                                    this.f4304l = null;
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                        }
                                    } else {
                                        nVarK.b();
                                        this.f4303k = objY2;
                                        this.f4304l = null;
                                        bool = Boolean.TRUE;
                                    }
                                    c0270kR.h(bool, null);
                                }
                                Object objQ = c0270kR.q();
                                T3.a aVar = T3.a.f9048k;
                                return objQ;
                            } catch (Throwable th) {
                                c0270kR.y();
                                throw th;
                            }
                        }
                        nVarK.b();
                        this.f4303k = objY;
                    }
                }
            }
        }
        return Boolean.valueOf(z7);
    }

    public final Object c() throws Throwable {
        Object obj = this.f4303k;
        G g4 = g.f4331p;
        if (obj == g4) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f4303k = g4;
        if (obj != g.f4327l) {
            return obj;
        }
        Throwable thM = this.f4305m.m();
        int i7 = M5.r.a;
        throw thM;
    }
}
