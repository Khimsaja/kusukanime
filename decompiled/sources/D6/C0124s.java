package D6;

import H5.C0270k;
import f6.InterfaceC0907e;

/* renamed from: D6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124s extends AbstractC0126u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1759d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0113g f1760e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0124s(U u5, InterfaceC0907e interfaceC0907e, InterfaceC0120n interfaceC0120n, InterfaceC0113g interfaceC0113g, int i7) {
        super(u5, interfaceC0907e, interfaceC0120n);
        this.f1759d = i7;
        this.f1760e = interfaceC0113g;
    }

    @Override // D6.AbstractC0126u
    public final Object a(D d4, Object[] objArr) {
        int i7 = 2;
        InterfaceC0113g interfaceC0113g = this.f1760e;
        switch (this.f1759d) {
            case 0:
                return interfaceC0113g.e(d4);
            default:
                InterfaceC0111e interfaceC0111e = (InterfaceC0111e) interfaceC0113g.e(d4);
                S3.c cVar = (S3.c) objArr[objArr.length - 1];
                try {
                    C0270k c0270k = new C0270k(1, P3.r.E(cVar));
                    c0270k.r();
                    c0270k.t(new C0128w(interfaceC0111e, 2));
                    interfaceC0111e.m(new C0129x(c0270k, i7));
                    Object objQ = c0270k.q();
                    T3.a aVar = T3.a.f9048k;
                    return objQ;
                } catch (Exception e7) {
                    c0.r(e7, cVar);
                    return T3.a.f9048k;
                }
        }
    }
}
