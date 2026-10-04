package L;

import f1.AbstractC0870c;
import java.util.List;
import java.util.NoSuchElementException;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;

/* loaded from: classes.dex */
public final class H1 implements InterfaceC2173H {
    public final e4.k a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5107b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5108c;

    /* renamed from: d, reason: collision with root package name */
    public final v.Z f5109d;

    public H1(e4.k kVar, boolean z7, float f5, v.Z z8) {
        this.a = kVar;
        this.f5107b = z7;
        this.f5108c = f5;
        this.f5109d = z8;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, list, i7, S.f5334y);
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        Object obj;
        int i7;
        Object obj2;
        int i8;
        w0.S sB;
        Object obj3;
        w0.S s7;
        int i9;
        w0.S sB2;
        Object obj4;
        int i10;
        w0.S sB3;
        Object obj5;
        int i11;
        Object obj6;
        Object obj7;
        H1 h1 = this;
        List list2 = list;
        int i12 = 1;
        v.Z z7 = h1.f5109d;
        int iO = interfaceC2175J.O(z7.f16425d);
        long jA = T0.a.a(j7, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i13);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj), "Leading")) {
                break;
            }
            i13++;
        }
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) obj;
        w0.S sB4 = interfaceC2172G != null ? interfaceC2172G.b(jA) : null;
        float f5 = M.W.f6267b;
        int i14 = sB4 != null ? sB4.f16840k : 0;
        int iMax = Math.max(0, sB4 != null ? sB4.f16841l : 0);
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                i7 = i12;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i15);
            i7 = i12;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj2), "Trailing")) {
                break;
            }
            i15++;
            i12 = i7;
        }
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) obj2;
        if (interfaceC2172G2 != null) {
            i8 = i14;
            sB = interfaceC2172G2.b(q0.c.I(-i14, 0, 2, jA));
        } else {
            i8 = i14;
            sB = null;
        }
        int i16 = (sB != null ? sB.f16840k : 0) + i8;
        int iMax2 = Math.max(iMax, sB != null ? sB.f16841l : 0);
        int size3 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i17);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj3), "Prefix")) {
                break;
            }
            i17++;
        }
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj3;
        if (interfaceC2172G3 != null) {
            s7 = sB;
            i9 = i16;
            sB2 = interfaceC2172G3.b(q0.c.I(-i16, 0, 2, jA));
        } else {
            s7 = sB;
            i9 = i16;
            sB2 = null;
        }
        int i18 = i9 + (sB2 != null ? sB2.f16840k : 0);
        int iMax3 = Math.max(iMax2, sB2 != null ? sB2.f16841l : 0);
        int size4 = list2.size();
        int i19 = 0;
        while (true) {
            if (i19 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i19);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj4), "Suffix")) {
                break;
            }
            i19++;
        }
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) obj4;
        if (interfaceC2172G4 != null) {
            i10 = i18;
            sB3 = interfaceC2172G4.b(q0.c.I(-i18, 0, 2, jA));
        } else {
            i10 = i18;
            sB3 = null;
        }
        int i20 = (sB3 != null ? sB3.f16840k : 0) + i10;
        int iMax4 = Math.max(iMax3, sB3 != null ? sB3.f16841l : 0);
        int iO2 = interfaceC2175J.O(z7.d(interfaceC2175J.getLayoutDirection())) + interfaceC2175J.O(z7.b(interfaceC2175J.getLayoutDirection()));
        int i21 = -i20;
        int iH = P3.F.H(h1.f5108c, i21 - iO2, -iO2);
        int i22 = -iO;
        long jH = q0.c.H(iH, i22, jA);
        int size5 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list2.get(i23);
            int i24 = i23;
            int i25 = size5;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj5), "Label")) {
                break;
            }
            i23 = i24 + 1;
            size5 = i25;
        }
        InterfaceC2172G interfaceC2172G5 = (InterfaceC2172G) obj5;
        w0.S sB5 = interfaceC2172G5 != null ? interfaceC2172G5.b(jH) : null;
        h1.a.invoke(new g0.f(sB5 != null ? AbstractC0870c.F(sB5.f16840k, sB5.f16841l) : 0L));
        int size6 = list2.size();
        int i26 = 0;
        while (true) {
            if (i26 >= size6) {
                i11 = i22;
                obj6 = null;
                break;
            }
            obj6 = list2.get(i26);
            int i27 = size6;
            i11 = i22;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj6), "Supporting")) {
                break;
            }
            i26++;
            i22 = i11;
            size6 = i27;
        }
        InterfaceC2172G interfaceC2172G6 = (InterfaceC2172G) obj6;
        int iB0 = interfaceC2172G6 != null ? interfaceC2172G6.b0(T0.a.j(j7)) : 0;
        int iMax5 = Math.max((sB5 != null ? sB5.f16841l : 0) / 2, interfaceC2175J.O(z7.f16423b));
        long jA2 = T0.a.a(q0.c.H(i21, (i11 - iMax5) - iB0, j7), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i28 = 0;
        while (i28 < size7) {
            InterfaceC2172G interfaceC2172G7 = (InterfaceC2172G) list2.get(i28);
            int i29 = i28;
            int i30 = size7;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G7), "TextField")) {
                w0.S sB6 = interfaceC2172G7.b(jA2);
                long jA3 = T0.a.a(jA2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i31 = 0;
                while (true) {
                    if (i31 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i31);
                    int i32 = size8;
                    int i33 = i31;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj7), "Hint")) {
                        break;
                    }
                    i31 = i33 + 1;
                    size8 = i32;
                }
                InterfaceC2172G interfaceC2172G8 = (InterfaceC2172G) obj7;
                w0.S sB7 = interfaceC2172G8 != null ? interfaceC2172G8.b(jA3) : null;
                int iMax6 = Math.max(iMax4, Math.max(sB6.f16841l, sB7 != null ? sB7.f16841l : 0) + iMax5 + iO);
                w0.S s8 = s7;
                int iD = F1.d(sB4 != null ? sB4.f16840k : 0, s7 != null ? s8.f16840k : 0, sB2 != null ? sB2.f16840k : 0, sB3 != null ? sB3.f16840k : 0, sB6.f16840k, sB5 != null ? sB5.f16840k : 0, sB7 != null ? sB7.f16840k : 0, h1.f5108c, j7, interfaceC2175J.a(), h1.f5109d);
                w0.S sB8 = interfaceC2172G6 != null ? interfaceC2172G6.b(T0.a.a(q0.c.I(0, -iMax6, i7, jA), 0, iD, 0, 0, 9)) : null;
                int i34 = sB8 != null ? sB8.f16841l : 0;
                int iC = F1.c(sB4 != null ? sB4.f16841l : 0, s8 != null ? s8.f16841l : 0, sB2 != null ? sB2.f16841l : 0, sB3 != null ? sB3.f16841l : 0, sB6.f16841l, sB5 != null ? sB5.f16841l : 0, sB7 != null ? sB7.f16841l : 0, sB8 != null ? sB8.f16841l : 0, h1.f5108c, j7, interfaceC2175J.a(), h1.f5109d);
                int i35 = iC - i34;
                int size9 = list2.size();
                int i36 = 0;
                while (i36 < size9) {
                    InterfaceC2172G interfaceC2172G9 = (InterfaceC2172G) list2.get(i36);
                    int i37 = iC;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G9), "Container")) {
                        return interfaceC2175J.T(iD, i37, P3.z.f7780k, new G1(i37, iD, sB4, s8, sB2, sB3, sB6, sB5, sB7, interfaceC2172G9.b(q0.c.a(iD != Integer.MAX_VALUE ? iD : 0, iD, i35 != Integer.MAX_VALUE ? i35 : 0, i35)), sB8, h1, interfaceC2175J));
                    }
                    iC = i37;
                    i36++;
                    sB4 = sB4;
                    sB5 = sB5;
                    h1 = this;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i28 = i29 + 1;
            sB4 = sB4;
            sB5 = sB5;
            h1 = this;
            size7 = i30;
            jA2 = jA2;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(interfaceC2197o, list, i7, S.f5335z);
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(interfaceC2197o, list, i7, S.f5316B);
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, list, i7, S.f5315A);
    }

    public final int f(InterfaceC2197o interfaceC2197o, List list, int i7, e4.n nVar) {
        Object obj;
        int iY;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int i8;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i9);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj), "Leading")) {
                break;
            }
            i9++;
        }
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) obj;
        if (interfaceC2172G != null) {
            iY = i7 == Integer.MAX_VALUE ? i7 : i7 - interfaceC2172G.Y(Integer.MAX_VALUE);
            iIntValue = ((Number) nVar.invoke(interfaceC2172G, Integer.valueOf(i7))).intValue();
        } else {
            iY = i7;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj2), "Trailing")) {
                break;
            }
            i10++;
        }
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) obj2;
        if (interfaceC2172G2 != null) {
            int iY2 = interfaceC2172G2.Y(Integer.MAX_VALUE);
            if (iY != Integer.MAX_VALUE) {
                iY -= iY2;
            }
            iIntValue2 = ((Number) nVar.invoke(interfaceC2172G2, Integer.valueOf(i7))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i11);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj3), "Label")) {
                break;
            }
            i11++;
        }
        Object obj8 = (InterfaceC2172G) obj3;
        int iIntValue4 = obj8 != null ? ((Number) nVar.invoke(obj8, Integer.valueOf(P3.F.H(this.f5108c, iY, i7)))).intValue() : 0;
        int size4 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i12);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj4), "Prefix")) {
                break;
            }
            i12++;
        }
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj4;
        if (interfaceC2172G3 != null) {
            iIntValue3 = ((Number) nVar.invoke(interfaceC2172G3, Integer.valueOf(iY))).intValue();
            int iY3 = interfaceC2172G3.Y(Integer.MAX_VALUE);
            if (iY != Integer.MAX_VALUE) {
                iY -= iY3;
            }
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i13);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj5), "Suffix")) {
                break;
            }
            i13++;
        }
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) obj5;
        if (interfaceC2172G4 != null) {
            int iIntValue5 = ((Number) nVar.invoke(interfaceC2172G4, Integer.valueOf(iY))).intValue();
            int iY4 = interfaceC2172G4.Y(Integer.MAX_VALUE);
            if (iY != Integer.MAX_VALUE) {
                iY -= iY4;
            }
            i8 = iIntValue5;
        } else {
            i8 = 0;
        }
        int size6 = list.size();
        for (int i14 = 0; i14 < size6; i14++) {
            Object obj9 = list.get(i14);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj9), "TextField")) {
                int iIntValue6 = ((Number) nVar.invoke(obj9, Integer.valueOf(iY))).intValue();
                int size7 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i15);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj6), "Hint")) {
                        break;
                    }
                    i15++;
                }
                Object obj10 = (InterfaceC2172G) obj6;
                int iIntValue7 = obj10 != null ? ((Number) nVar.invoke(obj10, Integer.valueOf(iY))).intValue() : 0;
                int size8 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i16);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i16++;
                }
                Object obj12 = (InterfaceC2172G) obj7;
                return F1.c(iIntValue, iIntValue2, iIntValue3, i8, iIntValue6, iIntValue4, iIntValue7, obj12 != null ? ((Number) nVar.invoke(obj12, Integer.valueOf(i7))).intValue() : 0, this.f5108c, M.W.a, interfaceC2197o.a(), this.f5109d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final int g(InterfaceC2197o interfaceC2197o, List list, int i7, e4.n nVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            Object obj7 = list.get(i8);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj7), "TextField")) {
                int iIntValue = ((Number) nVar.invoke(obj7, Integer.valueOf(i7))).intValue();
                int size2 = list.size();
                int i9 = 0;
                while (true) {
                    obj = null;
                    if (i9 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i9);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj2), "Label")) {
                        break;
                    }
                    i9++;
                }
                InterfaceC2172G interfaceC2172G = (InterfaceC2172G) obj2;
                int iIntValue2 = interfaceC2172G != null ? ((Number) nVar.invoke(interfaceC2172G, Integer.valueOf(i7))).intValue() : 0;
                int size3 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i10);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj3), "Trailing")) {
                        break;
                    }
                    i10++;
                }
                InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) obj3;
                int iIntValue3 = interfaceC2172G2 != null ? ((Number) nVar.invoke(interfaceC2172G2, Integer.valueOf(i7))).intValue() : 0;
                int size4 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i11);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj4), "Leading")) {
                        break;
                    }
                    i11++;
                }
                InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj4;
                int iIntValue4 = interfaceC2172G3 != null ? ((Number) nVar.invoke(interfaceC2172G3, Integer.valueOf(i7))).intValue() : 0;
                int size5 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i12);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj5), "Prefix")) {
                        break;
                    }
                    i12++;
                }
                InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) obj5;
                int iIntValue5 = interfaceC2172G4 != null ? ((Number) nVar.invoke(interfaceC2172G4, Integer.valueOf(i7))).intValue() : 0;
                int size6 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i13);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj6), "Suffix")) {
                        break;
                    }
                    i13++;
                }
                InterfaceC2172G interfaceC2172G5 = (InterfaceC2172G) obj6;
                int iIntValue6 = interfaceC2172G5 != null ? ((Number) nVar.invoke(interfaceC2172G5, Integer.valueOf(i7))).intValue() : 0;
                int size7 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i14);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i14++;
                }
                InterfaceC2172G interfaceC2172G6 = (InterfaceC2172G) obj;
                return F1.d(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, interfaceC2172G6 != null ? ((Number) nVar.invoke(interfaceC2172G6, Integer.valueOf(i7))).intValue() : 0, this.f5108c, M.W.a, interfaceC2197o.a(), this.f5109d);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
