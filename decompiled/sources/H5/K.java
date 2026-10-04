package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class K extends M5.p {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3812o = AtomicIntegerFieldUpdater.newUpdater(K.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // M5.p, H5.n0
    public final void d(Object obj) throws J {
        f(obj);
    }

    @Override // M5.p, H5.n0
    public final void f(Object obj) throws J {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3812o;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                M5.a.h(P3.r.E(this.f6598n), D.z(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
