package H5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC0255a0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3862l = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_isCompleting$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3863m = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_rootCause$volatile");

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3864n = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: k, reason: collision with root package name */
    public final p0 f3865k;

    public l0(p0 p0Var, Throwable th) {
        this.f3865k = p0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable thD = d();
        if (thD == null) {
            f3863m.set(this, th);
            return;
        }
        if (th == thD) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864n;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // H5.InterfaceC0255a0
    public final boolean b() {
        return d() == null;
    }

    @Override // H5.InterfaceC0255a0
    public final p0 c() {
        return this.f3865k;
    }

    public final Throwable d() {
        return (Throwable) f3863m.get(this);
    }

    public final boolean e() {
        return d() != null;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3864n;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thD = d();
        if (thD != null) {
            arrayList.add(0, thD);
        }
        if (th != null && !th.equals(thD)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, D.f3803h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        sb.append(f3862l.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(d());
        sb.append(", exceptions=");
        sb.append(f3864n.get(this));
        sb.append(", list=");
        sb.append(this.f3865k);
        sb.append(']');
        return sb.toString();
    }
}
