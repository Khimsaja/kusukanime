package H;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.l f2938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S f2939n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(r.l lVar, S s7, int i7) {
        super(0);
        this.f2937l = i7;
        this.f2938m = lVar;
        this.f2939n = s7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f2937l) {
            case 0:
                this.f2939n.d();
                this.f2938m.a.setValue(r.i.a);
                break;
            case 1:
                this.f2939n.b(false);
                this.f2938m.a.setValue(r.i.a);
                break;
            case 2:
                this.f2939n.l();
                this.f2938m.a.setValue(r.i.a);
                break;
            default:
                this.f2939n.m();
                this.f2938m.a.setValue(r.i.a);
                break;
        }
        return O3.C.a;
    }
}
