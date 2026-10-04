package v;

import java.util.List;
import m.C1487h;
import s0.C1958c;
import w0.InterfaceC2172G;

/* loaded from: classes.dex */
public abstract class G {
    public static final C2144x a = new C2144x();

    /* JADX WARN: Removed duplicated region for block: B:100:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(a0.q r19, v.InterfaceC2126e r20, v.InterfaceC2128g r21, int r22, int r23, v.M r24, W.a r25, O.C0510p r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v.G.a(a0.q, v.e, v.g, int, int, v.M, W.a, O.p, int, int):void");
    }

    public static final long b(List list, e4.o oVar, e4.o oVar2, int i7, int i8, int i9, int i10, I i11) {
        boolean z7;
        C c2;
        C1487h c1487h;
        int i12 = 0;
        if (list.isEmpty()) {
            return C1487h.a(0, 0);
        }
        int i13 = Integer.MAX_VALUE;
        C c4 = new C(i10, i11, q0.c.a(0, i7, 0, Integer.MAX_VALUE), i8, i9);
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) P3.q.u0(0, list);
        int iIntValue = interfaceC2172G != null ? ((Number) oVar2.invoke(interfaceC2172G, 0, Integer.valueOf(i7))).intValue() : 0;
        int iIntValue2 = interfaceC2172G != null ? ((Number) oVar.invoke(interfaceC2172G, 0, Integer.valueOf(iIntValue))).intValue() : 0;
        int i14 = 0;
        int iMax = 0;
        if (c4.b(list.size() > 1, 0, C1487h.a(i7, Integer.MAX_VALUE), interfaceC2172G == null ? null : new C1487h(C1487h.a(iIntValue2, iIntValue)), 0, 0, 0, false, false).f15442b) {
            C1487h c1487hA = i11.a(0, 0, interfaceC2172G != null);
            return C1487h.a(c1487hA != null ? (int) (c1487hA.a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i15 = i7;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            int i20 = iMax;
            if (i16 >= size) {
                break;
            }
            int i21 = i15 - iIntValue2;
            int i22 = i16 + 1;
            iMax = Math.max(i20, iIntValue);
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) P3.q.u0(i22, list);
            int iIntValue3 = interfaceC2172G2 != null ? ((Number) oVar2.invoke(interfaceC2172G2, Integer.valueOf(i22), Integer.valueOf(i7))).intValue() : i12;
            int iIntValue4 = interfaceC2172G2 != null ? ((Number) oVar.invoke(interfaceC2172G2, Integer.valueOf(i22), Integer.valueOf(iIntValue3))).intValue() + i8 : 0;
            if (i16 + 2 < list.size()) {
                i16 = i22;
                z7 = true;
            } else {
                i16 = i22;
                z7 = false;
            }
            int i23 = i16 - i18;
            int i24 = i19;
            long jA = C1487h.a(i21, i13);
            if (interfaceC2172G2 == null) {
                c2 = c4;
                c1487h = null;
            } else {
                c2 = c4;
                c1487h = new C1487h(C1487h.a(iIntValue4, iIntValue3));
            }
            c4 = c2;
            C1958c c1958cB = c4.b(z7, i23, jA, c1487h, i24, i14, iMax, false, false);
            if (c1958cB.a) {
                int i25 = iMax + i9 + i14;
                C2121B c2121bA = c4.a(c1958cB, interfaceC2172G2 != null, i24, i25, i21, i23);
                iIntValue4 -= i8;
                i19 = i24 + 1;
                if (c1958cB.f15442b) {
                    if (c2121bA != null && !c2121bA.f16351d) {
                        i25 = ((int) (c2121bA.f16350c & 4294967295L)) + i9 + i25;
                    }
                    i14 = i25;
                    i17 = i16;
                } else {
                    i15 = i7;
                    i18 = i16;
                    i14 = i25;
                    iMax = 0;
                }
            } else {
                i15 = i21;
                i19 = i24;
            }
            iIntValue2 = iIntValue4;
            iIntValue = iIntValue3;
            i17 = i16;
            i13 = Integer.MAX_VALUE;
            i12 = 0;
        }
        return C1487h.a(i14 - i9, i17);
    }

    public static final void c(InterfaceC2172G interfaceC2172G, L l7, long j7, e4.k kVar) {
        if (AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G)) != 0.0f) {
            l7.getClass();
            interfaceC2172G.b0(interfaceC2172G.W(Integer.MAX_VALUE));
            return;
        }
        AbstractC2123b.e(interfaceC2172G);
        w0.S sB = interfaceC2172G.b(j7);
        kVar.invoke(sB);
        l7.getClass();
        sB.h0();
        sB.f0();
    }
}
