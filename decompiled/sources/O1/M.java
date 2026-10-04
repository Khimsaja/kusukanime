package O1;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7291k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f7292l;

    public /* synthetic */ M(S s7, int i7) {
        this.f7291k = i7;
        this.f7292l = s7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7291k) {
            case 0:
                this.f7292l.f7327S = true;
                break;
            case 1:
                this.f7292l.y();
                break;
            default:
                S s7 = this.f7292l;
                if (!s7.f7333Y) {
                    InterfaceC0550y interfaceC0550y = s7.f7312B;
                    interfaceC0550y.getClass();
                    interfaceC0550y.c(s7);
                    break;
                }
                break;
        }
    }
}
