package b5;

import n5.AbstractC1586x;
import r4.AbstractC1880i;
import r4.EnumC1882k;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10947b = 1;

    public /* synthetic */ c(Object obj) {
        super(obj);
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        switch (this.f10947b) {
            case 0:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                AbstractC1880i abstractC1880iD = interfaceC2118y.d();
                abstractC1880iD.getClass();
                return abstractC1880iD.s(EnumC1882k.f14944p);
            case 1:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                AbstractC1880i abstractC1880iD2 = interfaceC2118y.d();
                abstractC1880iD2.getClass();
                return abstractC1880iD2.s(EnumC1882k.f14951w);
            default:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                AbstractC1880i abstractC1880iD3 = interfaceC2118y.d();
                abstractC1880iD3.getClass();
                return abstractC1880iD3.s(EnumC1882k.f14949u);
        }
    }

    @Override // b5.g
    public String toString() {
        switch (this.f10947b) {
            case 1:
                return ((Number) this.a).doubleValue() + ".toDouble()";
            case 2:
                return ((Number) this.a).floatValue() + ".toFloat()";
            default:
                return super.toString();
        }
    }

    public c(double d4) {
        super(Double.valueOf(d4));
    }

    public c(float f5) {
        super(Float.valueOf(f5));
    }
}
