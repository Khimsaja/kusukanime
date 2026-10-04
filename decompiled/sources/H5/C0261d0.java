package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: H5.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261d0 extends i0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3840p = AtomicIntegerFieldUpdater.newUpdater(C0261d0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* renamed from: o, reason: collision with root package name */
    public final e4.k f3841o;

    public C0261d0(e4.k kVar) {
        this.f3841o = kVar;
    }

    @Override // H5.i0
    public final boolean j() {
        return true;
    }

    @Override // H5.i0
    public final void k(Throwable th) {
        if (f3840p.compareAndSet(this, 0, 1)) {
            this.f3841o.invoke(th);
        }
    }
}
