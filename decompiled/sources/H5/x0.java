package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class x0 extends i0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3888q = AtomicIntegerFieldUpdater.newUpdater(x0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: o, reason: collision with root package name */
    public final Thread f3889o = Thread.currentThread();

    /* renamed from: p, reason: collision with root package name */
    public N f3890p;

    public static void m(int i7) {
        throw new IllegalStateException(("Illegal state " + i7).toString());
    }

    @Override // H5.i0
    public final boolean j() {
        return true;
    }

    @Override // H5.i0
    public final void k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f3888q;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 == 1 || i7 == 2 || i7 == 3) {
                    return;
                }
                m(i7);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 2));
        this.f3889o.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3888q;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i7);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i7, 1)) {
                N n7 = this.f3890p;
                if (n7 != null) {
                    n7.dispose();
                    return;
                }
                return;
            }
        }
    }
}
