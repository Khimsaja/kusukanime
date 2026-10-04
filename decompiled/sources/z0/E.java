package z0;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public final class E extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f18580l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ F f18581m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(F f5, int i7) {
        super(1);
        this.f18580l = i7;
        this.f18581m = f5;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f18580l) {
            case 0:
                F f5 = this.f18581m;
                return Boolean.valueOf(f5.f18600d.getParent().requestSendAccessibilityEvent(f5.f18600d, (AccessibilityEvent) obj));
            default:
                K0 k02 = (K0) obj;
                F f7 = this.f18581m;
                f7.getClass();
                if (k02.f18637l.contains(k02)) {
                    f7.f18600d.getSnapshotObserver().a(k02, f7.f18599M, new A.m(19, k02, f7));
                }
                return O3.C.a;
        }
    }
}
