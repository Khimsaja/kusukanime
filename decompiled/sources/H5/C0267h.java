package H5;

/* renamed from: H5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267h implements InterfaceC0268i {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3848b;

    public /* synthetic */ C0267h(int i7, Object obj) {
        this.a = i7;
        this.f3848b = obj;
    }

    @Override // H5.InterfaceC0268i
    public final void a(Throwable th) {
        switch (this.a) {
            case 0:
                ((e4.k) this.f3848b).invoke(th);
                break;
            default:
                ((N) this.f3848b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((e4.k) this.f3848b).getClass().getSimpleName() + '@' + D.p(this) + ']';
            default:
                return "DisposeOnCancel[" + ((N) this.f3848b) + ']';
        }
    }
}
