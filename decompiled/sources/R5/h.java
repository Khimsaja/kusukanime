package R5;

import F2.G;
import H5.E0;
import H5.InterfaceC0269j;
import M5.q;
import O3.C;
import b1.AbstractC0703b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8667c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8668d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8669e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f8670f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8671g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final A3.g f8672b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i7) {
        this.a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i7;
        this.f8672b = new A3.g(4, this);
    }

    public final boolean a(E0 e02) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8669e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f8670f.getAndIncrement(this);
        f fVar = f.f8665k;
        long j7 = andIncrement / j.f8677f;
        loop0: while (true) {
            objB = M5.a.b(kVar, j7, fVar);
            if (!M5.a.e(objB)) {
                q qVarC = M5.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
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
        k kVar2 = (k) M5.a.c(objB);
        int i7 = (int) (andIncrement % j.f8677f);
        AtomicReferenceArray atomicReferenceArray = kVar2.f8678e;
        while (!atomicReferenceArray.compareAndSet(i7, null, e02)) {
            if (atomicReferenceArray.get(i7) != null) {
                G g4 = j.f8673b;
                G g7 = j.f8674c;
                while (!atomicReferenceArray.compareAndSet(i7, g4, g7)) {
                    if (atomicReferenceArray.get(i7) != g4) {
                        return false;
                    }
                }
                if (e02 instanceof InterfaceC0269j) {
                    ((InterfaceC0269j) e02).h(C.a, this.f8672b);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + e02).toString());
            }
        }
        e02.a(kVar2, i7);
        return true;
    }

    public final void b() {
        int i7;
        Object objB;
        boolean z7;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8671g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i8 = this.a;
            if (andIncrement >= i8) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= i8) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, i8));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i8).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8667c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f8668d.getAndIncrement(this);
            long j7 = andIncrement2 / j.f8677f;
            g gVar = g.f8666k;
            while (true) {
                objB = M5.a.b(kVar, j7, gVar);
                if (M5.a.e(objB)) {
                    break;
                }
                q qVarC = M5.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.f6600c >= qVarC.f6600c) {
                        break;
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
            }
            k kVar2 = (k) M5.a.c(objB);
            kVar2.b();
            z7 = false;
            if (kVar2.f6600c <= j7) {
                int i9 = (int) (andIncrement2 % j.f8677f);
                G g4 = j.f8673b;
                AtomicReferenceArray atomicReferenceArray = kVar2.f8678e;
                Object andSet = atomicReferenceArray.getAndSet(i9, g4);
                if (andSet == null) {
                    int i10 = j.a;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (atomicReferenceArray.get(i9) == j.f8674c) {
                            z7 = true;
                            break;
                        }
                    }
                    G g7 = j.f8673b;
                    G g8 = j.f8675d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i9, g7, g8)) {
                            if (atomicReferenceArray.get(i9) != g7) {
                                break;
                            }
                        } else {
                            z7 = true;
                            break;
                        }
                    }
                    z7 = !z7;
                } else if (andSet != j.f8676e) {
                    if (!(andSet instanceof InterfaceC0269j)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0269j interfaceC0269j = (InterfaceC0269j) andSet;
                    G gC = interfaceC0269j.c(C.a, this.f8672b);
                    if (gC != null) {
                        interfaceC0269j.i(gC);
                        z7 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z7);
    }
}
