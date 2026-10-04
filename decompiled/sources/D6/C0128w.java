package D6;

/* renamed from: D6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128w extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1767l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0111e f1768m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0128w(InterfaceC0111e interfaceC0111e, int i7) {
        super(1);
        this.f1767l = i7;
        this.f1768m = interfaceC0111e;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1767l) {
            case 0:
                this.f1768m.cancel();
                break;
            case 1:
                this.f1768m.cancel();
                break;
            default:
                this.f1768m.cancel();
                break;
        }
        return O3.C.a;
    }
}
