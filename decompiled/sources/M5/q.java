package M5;

import H5.s0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class q extends b implements s0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6599d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f6600c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public q(long j7, q qVar, int i7) {
        super(qVar);
        this.f6600c = j7;
        this.cleanedAndPointers$volatile = i7 << 16;
    }

    @Override // M5.b
    public final boolean d() {
        return f6599d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f6599d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i7, S3.h hVar);

    public final void i() {
        if (f6599d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f6599d;
            i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 65536 + i7));
        return true;
    }
}
