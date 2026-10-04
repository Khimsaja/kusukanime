package H1;

/* renamed from: H1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0238t implements B1.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3579k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3580l;

    public /* synthetic */ C0238t(int i7, int i8) {
        this.f3579k = i8;
        this.f3580l = i7;
    }

    @Override // B1.n
    public final void invoke(Object obj) {
        switch (this.f3579k) {
            case 0:
                ((y1.J) obj).u(this.f3580l);
                break;
            case 1:
                ((y1.J) obj).g(this.f3580l);
                break;
            default:
                I1.k kVar = (I1.k) obj;
                kVar.getClass();
                int i7 = this.f3580l;
                if (i7 == 1) {
                    kVar.f3997v = true;
                }
                kVar.f3987l = i7;
                break;
        }
    }

    public /* synthetic */ C0238t(I1.a aVar, int i7, y1.K k7, y1.K k8) {
        this.f3579k = 2;
        this.f3580l = i7;
    }
}
