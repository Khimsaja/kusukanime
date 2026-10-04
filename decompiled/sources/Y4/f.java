package Y4;

import e4.InterfaceC0821a;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class f implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f10157k;

    /* renamed from: l, reason: collision with root package name */
    public final h f10158l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC1880i f10159m;

    public /* synthetic */ f(h hVar, AbstractC1880i abstractC1880i, int i7) {
        this.f10157k = i7;
        this.f10158l = hVar;
        this.f10159m = abstractC1880i;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f10157k) {
            case 0:
                h hVar = this.f10158l;
                l lVar = hVar.a;
                return AbstractC2510o.F0(((c) lVar.f10207b.getValue(lVar, l.f10184Y[0])).a(this.f10159m.j(AbstractC1886o.f14965C), hVar), "Collection");
            default:
                h hVar2 = this.f10158l;
                l lVar2 = hVar2.a;
                return AbstractC2510o.F0(((c) lVar2.f10207b.getValue(lVar2, l.f10184Y[0])).a(this.f10159m.k("Array"), hVar2), "Array");
        }
    }
}
