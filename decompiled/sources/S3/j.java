package S3;

import O3.n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class j implements c, U3.d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8768l = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* renamed from: k, reason: collision with root package name */
    public final c f8769k;
    private volatile Object result;

    public j(c cVar, T3.a aVar) {
        this.f8769k = cVar;
        this.result = aVar;
    }

    public final Object a() throws Throwable {
        Object obj = this.result;
        T3.a aVar = T3.a.f9049l;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8768l;
            T3.a aVar2 = T3.a.f9048k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return T3.a.f9048k;
        }
        if (obj == T3.a.f9050m) {
            return T3.a.f9048k;
        }
        if (obj instanceof n) {
            throw ((n) obj).f7530k;
        }
        return obj;
    }

    @Override // U3.d
    public final U3.d getCallerFrame() {
        c cVar = this.f8769k;
        if (cVar instanceof U3.d) {
            return (U3.d) cVar;
        }
        return null;
    }

    @Override // S3.c
    public final h getContext() {
        return this.f8769k.getContext();
    }

    @Override // S3.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            T3.a aVar = T3.a.f9049l;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8768l;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            T3.a aVar2 = T3.a.f9048k;
            if (obj2 != aVar2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8768l;
            T3.a aVar3 = T3.a.f9050m;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                    break;
                }
            }
            this.f8769k.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f8769k;
    }
}
