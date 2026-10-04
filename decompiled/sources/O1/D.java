package O1;

import B1.InterfaceC0021h;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements InterfaceC0021h {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K1.e f7256k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0544s f7257l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0549x f7258m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f7259n;

    public /* synthetic */ D(K1.e eVar, C0544s c0544s, C0549x c0549x, int i7) {
        this.f7256k = eVar;
        this.f7257l = c0544s;
        this.f7258m = c0549x;
        this.f7259n = i7;
    }

    @Override // B1.InterfaceC0021h
    public final void c(Object obj) {
        H h7 = (H) obj;
        K1.e eVar = this.f7256k;
        h7.i(eVar.a, eVar.f4459b, this.f7257l, this.f7258m, this.f7259n);
    }
}
