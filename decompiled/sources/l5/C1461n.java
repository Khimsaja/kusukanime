package l5;

import P3.J;
import e4.InterfaceC0821a;

/* renamed from: l5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461n implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12802k;

    /* renamed from: l, reason: collision with root package name */
    public final C1462o f12803l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1463p f12804m;

    public /* synthetic */ C1461n(C1462o c1462o, AbstractC1463p abstractC1463p, int i7) {
        this.f12802k = i7;
        this.f12803l = c1462o;
        this.f12804m = abstractC1463p;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f12802k) {
            case 0:
                return J.T(this.f12803l.a.keySet(), this.f12804m.o());
            default:
                return J.T(this.f12803l.f12806b.keySet(), this.f12804m.p());
        }
    }
}
