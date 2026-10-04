package o;

import e4.InterfaceC0821a;
import p.u0;

/* renamed from: o.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1616n extends kotlin.jvm.internal.m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u0 f13521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1616n(u0 u0Var, int i7) {
        super(0);
        this.f13520l = i7;
        this.f13521m = u0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13520l) {
            case 0:
                u0 u0Var = this.f13521m;
                Object objV0 = u0Var.a.v0();
                EnumC1624v enumC1624v = EnumC1624v.f13540m;
                return Boolean.valueOf(objV0 == enumC1624v && u0Var.f14136d.getValue() == enumC1624v);
            default:
                return Long.valueOf(this.f13521m.b());
        }
    }
}
