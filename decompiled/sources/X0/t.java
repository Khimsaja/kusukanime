package X0;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9739k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f9740l;

    public /* synthetic */ t(InterfaceC0821a interfaceC0821a, int i7) {
        this.f9739k = i7;
        this.f9740l = interfaceC0821a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9739k) {
            case 0:
                this.f9740l.invoke();
                break;
            default:
                this.f9740l.invoke();
                break;
        }
    }
}
