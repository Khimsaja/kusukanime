package q;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14498l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ V f14499m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(V v5, int i7) {
        super(0);
        this.f14498l = i7;
        this.f14499m = v5;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14498l) {
            case 0:
                w0.r rVar = (w0.r) this.f14499m.f14505D.getValue();
                return new g0.c(rVar != null ? rVar.S(0L) : 9205357640488583168L);
            case 1:
                return new g0.c(this.f14499m.f14507F);
            default:
                this.f14499m.I0();
                return O3.C.a;
        }
    }
}
