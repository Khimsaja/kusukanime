package r4;

import n5.b0;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;
import x4.C2255A;
import x4.C2297x;

/* renamed from: r4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1878g implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f14934k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC1880i f14935l;

    public /* synthetic */ C1878g(AbstractC1880i abstractC1880i, int i7) {
        this.f14934k = i7;
        this.f14935l = abstractC1880i;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC1880i abstractC1880i = this.f14935l;
        switch (this.f14934k) {
            case 0:
                W4.e eVar = (W4.e) obj;
                C2255A c2255aL = abstractC1880i.l();
                W4.c cVar = AbstractC1887p.f15028k;
                g5.k kVar = ((C2297x) c2255aL.F(cVar)).f17514q;
                if (kVar == null) {
                    AbstractC1880i.a(11);
                    throw null;
                }
                InterfaceC2102h interfaceC2102hB = kVar.b(eVar, C4.c.f959k);
                if (interfaceC2102hB == null) {
                    throw new AssertionError("Built-in class " + cVar.a(eVar) + " is not found");
                }
                if (interfaceC2102hB instanceof InterfaceC2099e) {
                    return (InterfaceC2099e) interfaceC2102hB;
                }
                throw new AssertionError("Must be a class descriptor " + eVar + ", but was " + interfaceC2102hB);
            default:
                InterfaceC2118y interfaceC2118y = (InterfaceC2118y) obj;
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                AbstractC1880i abstractC1880iD = interfaceC2118y.d();
                b0 b0Var = b0.f13390m;
                return abstractC1880iD.h(abstractC1880i.u());
        }
    }
}
