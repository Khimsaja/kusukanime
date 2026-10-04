package o4;

import e4.InterfaceC0821a;
import f1.AbstractC0871d;
import v4.C2159g;
import x4.C2265K;

/* loaded from: classes.dex */
public final class o0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13728k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f13729l;

    public /* synthetic */ o0(p0 p0Var, int i7) {
        this.f13728k = i7;
        this.f13729l = p0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13728k) {
            case 0:
                p0 p0Var = this.f13729l;
                C2265K setter = p0Var.u().p().getSetter();
                return setter == null ? Z4.l.g(p0Var.u().p(), C2159g.a) : setter;
            default:
                return AbstractC0871d.G(this.f13729l, false);
        }
    }
}
