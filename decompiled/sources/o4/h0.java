package o4;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class h0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13709k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f13710l;

    public /* synthetic */ h0(j0 j0Var, int i7) {
        this.f13709k = i7;
        this.f13710l = j0Var;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13709k) {
            case 0:
                return new i0(this.f13710l);
            default:
                return this.f13710l.t();
        }
    }
}
