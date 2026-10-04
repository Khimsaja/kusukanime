package H1;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements B1.n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f3204k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f3205l;

    public /* synthetic */ A(boolean z7, int i7) {
        this.f3204k = i7;
        this.f3205l = z7;
    }

    @Override // B1.n
    public final void invoke(Object obj) {
        y1.J j7 = (y1.J) obj;
        switch (this.f3204k) {
            case 0:
                j7.y(this.f3205l);
                break;
            default:
                j7.m(this.f3205l);
                break;
        }
    }
}
