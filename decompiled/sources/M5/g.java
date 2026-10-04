package M5;

import D6.RunnableC0131z;
import H5.AbstractC0281w;
import H5.C0270k;
import H5.F;
import H5.I;
import H5.N;
import H5.z0;
import b1.AbstractC0703b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class g extends AbstractC0281w implements I {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6582q = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I f6583l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0281w f6584m;

    /* renamed from: n, reason: collision with root package name */
    public final int f6585n;

    /* renamed from: o, reason: collision with root package name */
    public final j f6586o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f6587p;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0281w abstractC0281w, int i7) {
        I i8 = abstractC0281w instanceof I ? (I) abstractC0281w : null;
        this.f6583l = i8 == null ? F.a : i8;
        this.f6584m = abstractC0281w;
        this.f6585n = i7;
        this.f6586o = new j();
        this.f6587p = new Object();
    }

    @Override // H5.AbstractC0281w
    public final void W(S3.h hVar, Runnable runnable) {
        Runnable runnableA0;
        this.f6586o.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6582q;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6585n || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        try {
            a.i(this.f6584m, this, new RunnableC0131z(this, runnableA0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // H5.AbstractC0281w
    public final void X(S3.h hVar, Runnable runnable) {
        Runnable runnableA0;
        this.f6586o.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6582q;
        if (atomicIntegerFieldUpdater.get(this) >= this.f6585n || !b0() || (runnableA0 = a0()) == null) {
            return;
        }
        try {
            this.f6584m.X(this, new RunnableC0131z(this, runnableA0));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    public final Runnable a0() {
        while (true) {
            Runnable runnable = (Runnable) this.f6586o.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f6587p) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6582q;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f6586o.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean b0() {
        synchronized (this.f6587p) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6582q;
            if (atomicIntegerFieldUpdater.get(this) >= this.f6585n) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // H5.I
    public final void i(long j7, C0270k c0270k) {
        this.f6583l.i(j7, c0270k);
    }

    @Override // H5.AbstractC0281w
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6584m);
        sb.append(".limitedParallelism(");
        return AbstractC0703b.l(sb, this.f6585n, ')');
    }

    @Override // H5.I
    public final N v(long j7, z0 z0Var, S3.h hVar) {
        return this.f6583l.v(j7, z0Var, hVar);
    }
}
