package b5;

import n5.AbstractC1586x;
import n5.B;
import r4.AbstractC1886o;
import u4.AbstractC2115v;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class y extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10956b = 0;

    public y(byte b4) {
        super(Byte.valueOf(b4));
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        B bG;
        B bG2;
        B bG3;
        B bG4;
        switch (this.f10956b) {
            case 0:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118y, AbstractC1886o.f14979S);
                return (interfaceC2099eD == null || (bG = interfaceC2099eD.g()) == null) ? p5.l.c(p5.k.J, "UByte") : bG;
            case 1:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                InterfaceC2099e interfaceC2099eD2 = AbstractC2115v.d(interfaceC2118y, AbstractC1886o.f14981U);
                return (interfaceC2099eD2 == null || (bG2 = interfaceC2099eD2.g()) == null) ? p5.l.c(p5.k.J, "UInt") : bG2;
            case 2:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                InterfaceC2099e interfaceC2099eD3 = AbstractC2115v.d(interfaceC2118y, AbstractC1886o.f14982V);
                return (interfaceC2099eD3 == null || (bG3 = interfaceC2099eD3.g()) == null) ? p5.l.c(p5.k.J, "ULong") : bG3;
            default:
                kotlin.jvm.internal.l.f("module", interfaceC2118y);
                InterfaceC2099e interfaceC2099eD4 = AbstractC2115v.d(interfaceC2118y, AbstractC1886o.f14980T);
                return (interfaceC2099eD4 == null || (bG4 = interfaceC2099eD4.g()) == null) ? p5.l.c(p5.k.J, "UShort") : bG4;
        }
    }

    @Override // b5.g
    public final String toString() {
        switch (this.f10956b) {
            case 0:
                return ((Number) this.a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.a).longValue() + ".toULong()";
            default:
                return ((Number) this.a).intValue() + ".toUShort()";
        }
    }

    public y(short s7) {
        super(Short.valueOf(s7));
    }

    public y(int i7) {
        super(Integer.valueOf(i7));
    }

    public y(long j7) {
        super(Long.valueOf(j7));
    }
}
