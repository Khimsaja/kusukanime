package o4;

import e4.InterfaceC0821a;

/* renamed from: o4.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1677e0 implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13703k;

    /* renamed from: l, reason: collision with root package name */
    public final C1681g0 f13704l;

    public /* synthetic */ C1677e0(C1681g0 c1681g0, int i7) {
        this.f13703k = i7;
        this.f13704l = c1681g0;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f13703k) {
            case 0:
                return new C1679f0(this.f13704l);
            default:
                return this.f13704l.t();
        }
    }
}
