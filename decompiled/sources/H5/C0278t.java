package H5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: H5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0278t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3883b = AtomicIntegerFieldUpdater.newUpdater(C0278t.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public C0278t(Throwable th, boolean z7) {
        this.a = th;
        this._handled$volatile = z7 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.a + ']';
    }
}
