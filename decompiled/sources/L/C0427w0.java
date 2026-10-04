package L;

import java.util.ArrayList;
import java.util.List;
import w0.AbstractC2185c;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2176K;
import w0.InterfaceC2197o;

/* renamed from: L.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427w0 implements InterfaceC2176K {
    public static int f(InterfaceC2197o interfaceC2197o, ArrayList arrayList, int i7, e4.n nVar) {
        int iIntValue;
        int iIntValue2;
        List list = (List) arrayList.get(0);
        int i8 = 1;
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        int iO = i7 == Integer.MAX_VALUE ? i7 : i7 - interfaceC2197o.O(AbstractC0412r0.f5757c + AbstractC0412r0.f5758d);
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) P3.q.t0(list4);
        if (interfaceC2172G != null) {
            iIntValue = ((Number) nVar.invoke(interfaceC2172G, Integer.valueOf(iO))).intValue();
            int iY = interfaceC2172G.Y(Integer.MAX_VALUE);
            if (iO != Integer.MAX_VALUE) {
                iO -= iY;
            }
        } else {
            iIntValue = 0;
        }
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) P3.q.t0(list5);
        if (interfaceC2172G2 != null) {
            iIntValue2 = ((Number) nVar.invoke(interfaceC2172G2, Integer.valueOf(iO))).intValue();
            int iY2 = interfaceC2172G2.Y(Integer.MAX_VALUE);
            if (iO != Integer.MAX_VALUE) {
                iO -= iY2;
            }
        } else {
            iIntValue2 = 0;
        }
        Object obj = (InterfaceC2172G) P3.q.t0(list2);
        int iIntValue3 = obj != null ? ((Number) nVar.invoke(obj, Integer.valueOf(iO))).intValue() : 0;
        Object obj2 = (InterfaceC2172G) P3.q.t0(list3);
        int iIntValue4 = obj2 != null ? ((Number) nVar.invoke(obj2, Integer.valueOf(iO))).intValue() : 0;
        boolean z7 = iIntValue4 > interfaceC2197o.H(n6.d.F(30));
        boolean z8 = iIntValue3 > 0;
        boolean z9 = iIntValue4 > 0;
        if ((z8 && z9) || z7) {
            i8 = 3;
        } else if (z8 || z9) {
            i8 = 2;
        }
        Object obj3 = (InterfaceC2172G) P3.q.t0(list);
        return AbstractC0412r0.d(interfaceC2197o, iIntValue, iIntValue2, obj3 != null ? ((Number) nVar.invoke(obj3, Integer.valueOf(i7))).intValue() : 0, iIntValue3, iIntValue4, i8, interfaceC2197o.O((i8 == 3 ? AbstractC0412r0.f5756b : AbstractC0412r0.a) * 2), q0.c.b(0, 0, 15));
    }

    public static int g(InterfaceC2197o interfaceC2197o, ArrayList arrayList, int i7, e4.n nVar) {
        List list = (List) arrayList.get(0);
        List list2 = (List) arrayList.get(1);
        List list3 = (List) arrayList.get(2);
        List list4 = (List) arrayList.get(3);
        List list5 = (List) arrayList.get(4);
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) P3.q.t0(list4);
        int iIntValue = interfaceC2172G != null ? ((Number) nVar.invoke(interfaceC2172G, Integer.valueOf(i7))).intValue() : 0;
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) P3.q.t0(list5);
        int iIntValue2 = interfaceC2172G2 != null ? ((Number) nVar.invoke(interfaceC2172G2, Integer.valueOf(i7))).intValue() : 0;
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) P3.q.t0(list);
        int iIntValue3 = interfaceC2172G3 != null ? ((Number) nVar.invoke(interfaceC2172G3, Integer.valueOf(i7))).intValue() : 0;
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) P3.q.t0(list2);
        int iIntValue4 = interfaceC2172G4 != null ? ((Number) nVar.invoke(interfaceC2172G4, Integer.valueOf(i7))).intValue() : 0;
        InterfaceC2172G interfaceC2172G5 = (InterfaceC2172G) P3.q.t0(list3);
        int iIntValue5 = interfaceC2172G5 != null ? ((Number) nVar.invoke(interfaceC2172G5, Integer.valueOf(i7))).intValue() : 0;
        int iO = interfaceC2197o.O(AbstractC0412r0.f5757c + AbstractC0412r0.f5758d);
        long jB = q0.c.b(0, 0, 15);
        if (T0.a.d(jB)) {
            return T0.a.h(jB);
        }
        return iO + iIntValue + Math.max(iIntValue3, Math.max(iIntValue4, iIntValue5)) + iIntValue2;
    }

    @Override // w0.InterfaceC2176K
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, (ArrayList) list, i7, C0415s0.f5781k);
    }

    @Override // w0.InterfaceC2176K
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        List list2;
        List list3;
        w0.S sB;
        int i7;
        w0.S sB2;
        float f5;
        w0.S sB3;
        int i8;
        int i9;
        ArrayList arrayList = (ArrayList) list;
        List list4 = (List) arrayList.get(0);
        List list5 = (List) arrayList.get(1);
        List list6 = (List) arrayList.get(2);
        List list7 = (List) arrayList.get(3);
        List list8 = (List) arrayList.get(4);
        long jA = T0.a.a(j7, 0, 0, 0, 0, 10);
        float f7 = AbstractC0412r0.f5757c;
        float f8 = AbstractC0412r0.f5758d;
        int iO = interfaceC2175J.O(f7 + f8);
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) P3.q.t0(list7);
        int iW = interfaceC2172G != null ? interfaceC2172G.W(T0.a.g(j7)) : 0;
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) P3.q.t0(list8);
        int iW2 = interfaceC2172G2 != null ? interfaceC2172G2.W(T0.a.g(j7)) : 0;
        int iH = T0.a.h(jA);
        int i10 = iW + iW2 + iO;
        if (iH != Integer.MAX_VALUE) {
            iH -= i10;
        }
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) P3.q.t0(list6);
        float f9 = (((P3.q.t0(list5) != null) && (P3.q.t0(list6) != null)) || ((interfaceC2172G3 != null ? interfaceC2172G3.b0(iH) : 0) > interfaceC2175J.H(n6.d.F(30)))) ? AbstractC0412r0.f5756b : AbstractC0412r0.a;
        float f10 = 2;
        long jH = q0.c.H(-iO, -interfaceC2175J.O(f9 * f10), jA);
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) P3.q.t0(list7);
        w0.S sB4 = interfaceC2172G4 != null ? interfaceC2172G4.b(jH) : null;
        float f11 = M.W.f6267b;
        int i11 = sB4 != null ? sB4.f16840k : 0;
        InterfaceC2172G interfaceC2172G5 = (InterfaceC2172G) P3.q.t0(list8);
        if (interfaceC2172G5 != null) {
            list2 = list4;
            list3 = list5;
            sB = interfaceC2172G5.b(q0.c.I(-i11, 0, 2, jH));
        } else {
            list2 = list4;
            list3 = list5;
            sB = null;
        }
        int i12 = i11 + (sB != null ? sB.f16840k : 0);
        InterfaceC2172G interfaceC2172G6 = (InterfaceC2172G) P3.q.t0(list2);
        if (interfaceC2172G6 != null) {
            i7 = 2;
            sB2 = interfaceC2172G6.b(q0.c.I(-i12, 0, 2, jH));
        } else {
            i7 = 2;
            sB2 = null;
        }
        int i13 = sB2 != null ? sB2.f16841l : 0;
        InterfaceC2172G interfaceC2172G7 = (InterfaceC2172G) P3.q.t0(list6);
        if (interfaceC2172G7 != null) {
            f5 = f10;
            sB3 = interfaceC2172G7.b(q0.c.H(-i12, -i13, jH));
        } else {
            f5 = f10;
            sB3 = null;
        }
        int i14 = i13 + (sB3 != null ? sB3.f16841l : 0);
        boolean z7 = (sB3 == null || sB3.c0(AbstractC2185c.a) == sB3.c0(AbstractC2185c.f16859b)) ? false : true;
        InterfaceC2172G interfaceC2172G8 = (InterfaceC2172G) P3.q.t0(list3);
        w0.S sB5 = interfaceC2172G8 != null ? interfaceC2172G8.b(q0.c.H(-i12, -i14, jH)) : null;
        boolean z8 = sB5 != null;
        boolean z9 = sB3 != null;
        if ((z8 && z9) || z7) {
            i9 = 3;
            i8 = 3;
        } else if (z8 || z9) {
            i8 = i7;
            i9 = 3;
        } else {
            i9 = 3;
            i8 = 1;
        }
        float f12 = i8 == i9 ? AbstractC0412r0.f5756b : AbstractC0412r0.a;
        float f13 = f12 * f5;
        int iH2 = T0.a.d(j7) ? T0.a.h(j7) : iO + (sB4 != null ? sB4.f16840k : 0) + Math.max(sB2 != null ? sB2.f16840k : 0, Math.max(sB5 != null ? sB5.f16840k : 0, sB3 != null ? sB3.f16840k : 0)) + (sB != null ? sB.f16840k : 0);
        w0.S s7 = sB2;
        w0.S s8 = sB5;
        int iD = AbstractC0412r0.d(interfaceC2175J, sB4 != null ? sB4.f16841l : 0, sB != null ? sB.f16841l : 0, sB2 != null ? sB2.f16841l : 0, sB5 != null ? sB5.f16841l : 0, sB3 != null ? sB3.f16841l : 0, i8, interfaceC2175J.O(f13), j7);
        return interfaceC2175J.T(iH2, iD, P3.z.f7780k, new C0410q0(sB4, sB, interfaceC2175J.O(f7), i8 == 3, interfaceC2175J.O(f12), s7, s8, sB3, iD, iH2, interfaceC2175J.O(f8)));
    }

    @Override // w0.InterfaceC2176K
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(interfaceC2197o, (ArrayList) list, i7, C0418t0.f5799k);
    }

    @Override // w0.InterfaceC2176K
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(interfaceC2197o, (ArrayList) list, i7, C0424v0.f5875k);
    }

    @Override // w0.InterfaceC2176K
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, (ArrayList) list, i7, C0421u0.f5858k);
    }
}
