package q;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class k0 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0 f14572m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, int i7) {
        super(0);
        this.f14571l = i7;
        this.f14572m = l0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14571l) {
            case 0:
                return Float.valueOf(this.f14572m.f14576x.a.f());
            default:
                return Float.valueOf(this.f14572m.f14576x.f14600d.f());
        }
    }
}
