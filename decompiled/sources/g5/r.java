package g5;

import P3.y;
import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class r implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11760k;

    /* renamed from: l, reason: collision with root package name */
    public final s f11761l;

    public /* synthetic */ r(s sVar, int i7) {
        this.f11760k = i7;
        this.f11761l = sVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11760k) {
            case 0:
                s sVar = this.f11761l;
                return P3.r.I(Z4.l.i(sVar.f11763b), Z4.l.j(sVar.f11763b));
            default:
                s sVar2 = this.f11761l;
                return sVar2.f11764c ? P3.r.J(Z4.l.h(sVar2.f11763b)) : y.f7779k;
        }
    }
}
