package Y0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.m;

/* loaded from: classes.dex */
public final class d extends m {

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10050i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10051j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10052k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10053l;

    /* renamed from: m, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10054m;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f10050i = atomicReferenceFieldUpdater;
        this.f10051j = atomicReferenceFieldUpdater2;
        this.f10052k = atomicReferenceFieldUpdater3;
        this.f10053l = atomicReferenceFieldUpdater4;
        this.f10054m = atomicReferenceFieldUpdater5;
    }

    @Override // n6.m
    public final void T(f fVar, f fVar2) {
        this.f10051j.lazySet(fVar, fVar2);
    }

    @Override // n6.m
    public final void U(f fVar, Thread thread) {
        this.f10050i.lazySet(fVar, thread);
    }

    @Override // n6.m
    public final boolean n(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10053l;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // n6.m
    public final boolean o(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10054m;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // n6.m
    public final boolean p(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10052k;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
