package H;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ B1.s f3004l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3005m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B1.s sVar, int i7) {
        super(0);
        this.f3004l = sVar;
        this.f3005m = i7;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        return Integer.valueOf(((H0.F) this.f3004l.f361e).e(this.f3005m));
    }
}
