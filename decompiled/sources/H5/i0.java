package H5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class i0 extends M5.i implements N, InterfaceC0255a0 {

    /* renamed from: n, reason: collision with root package name */
    public n0 f3850n;

    @Override // H5.InterfaceC0255a0
    public final boolean b() {
        return true;
    }

    @Override // H5.InterfaceC0255a0
    public final p0 c() {
        return null;
    }

    @Override // H5.N
    public final void dispose() {
        n0 n0VarI = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n0.f3873k;
            Object obj = atomicReferenceFieldUpdater.get(n0VarI);
            if (obj instanceof i0) {
                if (obj != this) {
                    return;
                }
                P p7 = D.f3805j;
                while (!atomicReferenceFieldUpdater.compareAndSet(n0VarI, obj, p7)) {
                    if (atomicReferenceFieldUpdater.get(n0VarI) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC0255a0) || ((InterfaceC0255a0) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M5.i.f6589k;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof M5.n) {
                    M5.i iVar = ((M5.n) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
                M5.i iVar2 = (M5.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = M5.i.f6591m;
                M5.n nVar = (M5.n) atomicReferenceFieldUpdater3.get(iVar2);
                if (nVar == null) {
                    nVar = new M5.n(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, nVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                iVar2.d();
                return;
            }
        }
    }

    public InterfaceC0265f0 getParent() {
        return i();
    }

    public final n0 i() {
        n0 n0Var = this.f3850n;
        if (n0Var != null) {
            return n0Var;
        }
        kotlin.jvm.internal.l.l("job");
        throw null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // M5.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + D.p(this) + "[job@" + D.p(i()) + ']';
    }
}
