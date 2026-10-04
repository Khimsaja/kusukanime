package O3;

import e4.InterfaceC0821a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p implements i, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7532m = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "l");

    /* renamed from: k, reason: collision with root package name */
    public volatile InterfaceC0821a f7533k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f7534l;

    @Override // O3.i
    public final boolean a() {
        return this.f7534l != z.a;
    }

    @Override // O3.i
    public final Object getValue() {
        Object obj = this.f7534l;
        z zVar = z.a;
        if (obj != zVar) {
            return obj;
        }
        InterfaceC0821a interfaceC0821a = this.f7533k;
        if (interfaceC0821a != null) {
            Object objInvoke = interfaceC0821a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7532m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, zVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != zVar) {
                }
            }
            this.f7533k = null;
            return objInvoke;
        }
        return this.f7534l;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
