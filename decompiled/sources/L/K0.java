package L;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import e4.InterfaceC0821a;
import p.C1743c;

/* loaded from: classes.dex */
public final class K0 implements OnBackAnimationCallback {
    public final /* synthetic */ H5.A a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1743c f5164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5165c;

    public K0(InterfaceC0821a interfaceC0821a, C1743c c1743c, H5.A a) {
        this.a = a;
        this.f5164b = c1743c;
        this.f5165c = interfaceC0821a;
    }

    public final void onBackCancelled() {
        H5.D.x(this.a, null, new H0(this.f5164b, null), 3);
    }

    public final void onBackInvoked() {
        this.f5165c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        H5.D.x(this.a, null, new I0(this.f5164b, backEvent, null), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        H5.D.x(this.a, null, new J0(this.f5164b, backEvent, null), 3);
    }
}
