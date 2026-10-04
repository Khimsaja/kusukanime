package b5;

import java.util.Arrays;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import r4.EnumC1882k;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class e extends o {
    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        AbstractC1880i abstractC1880iD = interfaceC2118y.d();
        abstractC1880iD.getClass();
        return abstractC1880iD.s(EnumC1882k.f14945q);
    }

    @Override // b5.g
    public final String toString() {
        String strValueOf;
        Object obj = this.a;
        Integer numValueOf = Integer.valueOf(((Character) obj).charValue());
        char cCharValue = ((Character) obj).charValue();
        switch (cCharValue) {
            case '\b':
                strValueOf = "\\b";
                break;
            case '\t':
                strValueOf = "\\t";
                break;
            case '\n':
                strValueOf = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(cCharValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    strValueOf = String.valueOf(cCharValue);
                    break;
                } else {
                    strValueOf = "?";
                    break;
                }
            case '\f':
                strValueOf = "\\f";
                break;
            case '\r':
                strValueOf = "\\r";
                break;
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
