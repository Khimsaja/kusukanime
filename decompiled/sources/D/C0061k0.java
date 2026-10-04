package D;

import s0.AbstractC1971p;

/* renamed from: D.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0061k0 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0071p0 f1208m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0061k0(InterfaceC0071p0 interfaceC0071p0, int i7) {
        super(1);
        this.f1207l = i7;
        this.f1208m = interfaceC0071p0;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1207l) {
            case 0:
                this.f1208m.c(((g0.c) obj).a);
                break;
            default:
                s0.r rVar = (s0.r) obj;
                this.f1208m.e(AbstractC1971p.f(rVar, false));
                rVar.a();
                break;
        }
        return O3.C.a;
    }
}
