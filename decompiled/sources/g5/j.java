package g5;

import e4.InterfaceC0821a;

/* loaded from: classes.dex */
public final class j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11750k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0821a f11751l;

    public /* synthetic */ j(InterfaceC0821a interfaceC0821a, int i7) {
        this.f11750k = i7;
        this.f11751l = interfaceC0821a;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f11750k) {
            case 0:
                o oVar = (o) this.f11751l.invoke();
                return oVar instanceof k ? ((k) oVar).h() : oVar;
            default:
                return P3.q.X0((Iterable) this.f11751l.invoke());
        }
    }
}
