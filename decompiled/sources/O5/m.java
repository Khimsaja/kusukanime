package O5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7636b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7637c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7638d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7639e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7637c;
        if (atomicIntegerFieldUpdater.get(this) - f7638d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f7628l) {
            f7639e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i7) == null) {
                atomicReferenceArray.lazySet(i7, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7638d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f7637c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (iVar = (i) this.a.getAndSet(i8, null)) != null) {
                if (iVar.f7628l) {
                    f7639e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i7, boolean z7) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        i iVar = (i) atomicReferenceArray.get(i8);
        if (iVar != null && iVar.f7628l == z7) {
            while (!atomicReferenceArray.compareAndSet(i8, iVar, null)) {
                if (atomicReferenceArray.get(i8) != iVar) {
                }
            }
            if (z7) {
                f7639e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
