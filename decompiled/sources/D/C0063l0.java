package D;

import e4.InterfaceC0821a;

/* renamed from: D.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063l0 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1218l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1219m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0063l0(InterfaceC0071p0 interfaceC0071p0, int i7) {
        super(0);
        this.f1218l = i7;
        this.f1219m = interfaceC0071p0;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f1218l) {
            case 0:
                this.f1219m.a();
                break;
            default:
                this.f1219m.onCancel();
                break;
        }
        return O3.C.a;
    }
}
