package o4;

import e4.InterfaceC0821a;
import f1.AbstractC0871d;
import v4.C2159g;
import x4.C2264J;

/* loaded from: classes.dex */
public final class m0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13717k;

    /* renamed from: l, reason: collision with root package name */
    public final n0 f13718l;

    public /* synthetic */ m0(n0 n0Var, int i7) {
        this.f13717k = i7;
        this.f13718l = n0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13717k) {
            case 0:
                n0 n0Var = this.f13718l;
                C2264J getter = n0Var.u().p().getGetter();
                return getter == null ? Z4.l.f(n0Var.u().p(), C2159g.a) : getter;
            default:
                return AbstractC0871d.G(this.f13718l, true);
        }
    }
}
