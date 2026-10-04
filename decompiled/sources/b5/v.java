package b5;

import n5.AbstractC1586x;
import r4.AbstractC1880i;
import r4.EnumC1882k;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class v extends o {
    public v(short s7) {
        super(Short.valueOf(s7));
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        AbstractC1880i abstractC1880iD = interfaceC2118y.d();
        abstractC1880iD.getClass();
        return abstractC1880iD.s(EnumC1882k.f14947s);
    }

    @Override // b5.g
    public final String toString() {
        return ((Number) this.a).intValue() + ".toShort()";
    }
}
