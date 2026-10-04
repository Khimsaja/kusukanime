package D6;

/* renamed from: D6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115i implements InterfaceC0114h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1749k;

    /* renamed from: l, reason: collision with root package name */
    public final C0117k f1750l;

    public /* synthetic */ C0115i(C0117k c0117k, int i7) {
        this.f1749k = i7;
        this.f1750l = c0117k;
    }

    @Override // D6.InterfaceC0114h
    public final void a(InterfaceC0111e interfaceC0111e, Throwable th) {
        switch (this.f1749k) {
            case 0:
                this.f1750l.completeExceptionally(th);
                break;
            default:
                this.f1750l.completeExceptionally(th);
                break;
        }
    }

    @Override // D6.InterfaceC0114h
    public final void d(InterfaceC0111e interfaceC0111e, V v5) {
        switch (this.f1749k) {
            case 0:
                boolean zE = v5.a.e();
                C0117k c0117k = this.f1750l;
                if (!zE) {
                    c0117k.completeExceptionally(new r(v5));
                    break;
                } else {
                    c0117k.complete(v5.f1733b);
                    break;
                }
            default:
                this.f1750l.complete(v5);
                break;
        }
    }
}
