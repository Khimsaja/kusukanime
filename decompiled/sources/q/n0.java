package q;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o0 f14588m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, int i7) {
        super(0);
        this.f14587l = i7;
        this.f14588m = o0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14587l) {
            case 0:
                return Boolean.valueOf(this.f14588m.a.f() > 0);
            default:
                o0 o0Var = this.f14588m;
                return Boolean.valueOf(o0Var.a.f() < o0Var.f14600d.f());
        }
    }
}
