package L;

import android.window.OnBackInvokedCallback;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class F0 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f5066b;

    public /* synthetic */ F0(InterfaceC0821a interfaceC0821a, int i7) {
        this.a = i7;
        this.f5066b = interfaceC0821a;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                this.f5066b.invoke();
                break;
            case 1:
                InterfaceC0821a interfaceC0821a = this.f5066b;
                if (interfaceC0821a != null) {
                    interfaceC0821a.invoke();
                    break;
                }
                break;
            default:
                ((c.s) this.f5066b).invoke();
                break;
        }
    }
}
