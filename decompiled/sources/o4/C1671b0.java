package o4;

import e4.InterfaceC0821a;

/* renamed from: o4.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1671b0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13679k;

    /* renamed from: l, reason: collision with root package name */
    public final C1675d0 f13680l;

    public /* synthetic */ C1671b0(C1675d0 c1675d0, int i7) {
        this.f13679k = i7;
        this.f13680l = c1675d0;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13679k) {
            case 0:
                return new C1673c0(this.f13680l);
            default:
                C1675d0 c1675d0 = this.f13680l;
                return c1675d0.u(c1675d0.t(), null);
        }
    }
}
