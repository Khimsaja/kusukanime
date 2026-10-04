package L;

import java.util.List;
import java.util.NoSuchElementException;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;

/* loaded from: classes.dex */
public final class F2 implements InterfaceC2173H {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5068b;

    /* renamed from: c, reason: collision with root package name */
    public final v.Z f5069c;

    public F2(boolean z7, float f5, v.Z z8) {
        this.a = z7;
        this.f5068b = f5;
        this.f5069c = z8;
    }

    public static int g(List list, int i7, e4.n nVar) {
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
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj4), "Prefix")) {
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
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj5), "Suffix")) {
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
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj6), "Leading")) {
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
                int iIntValue7 = interfaceC2172G6 != null ? ((Number) nVar.invoke(interfaceC2172G6, Integer.valueOf(i7))).intValue() : 0;
                long j7 = M.W.a;
                int i15 = D2.a;
                int i16 = iIntValue4 + iIntValue5;
                return Math.max(Math.max(iIntValue + i16, Math.max(iIntValue7 + i16, iIntValue2)) + iIntValue6 + iIntValue3, T0.a.j(j7));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, list, i7, S.f5318D);
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        Object obj;
        int i7;
        Object obj2;
        Object obj3;
        int i8;
        w0.S sB;
        Object obj4;
        int i9;
        Object obj5;
        Object obj6;
        Object obj7;
        int i10;
        w0.S sB2;
        F2 f22 = this;
        List list2 = list;
        int i11 = 1;
        v.Z z7 = f22.f5069c;
        int iO = interfaceC2175J.O(z7.f16423b);
        int iO2 = interfaceC2175J.O(z7.f16425d);
        long jA = T0.a.a(j7, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i12);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj), "Leading")) {
                break;
            }
            i12++;
        }
        InterfaceC2172G interfaceC2172G = (InterfaceC2172G) obj;
        w0.S sB3 = interfaceC2172G != null ? interfaceC2172G.b(jA) : null;
        float f5 = M.W.f6267b;
        int i13 = sB3 != null ? sB3.f16840k : 0;
        int iMax = Math.max(0, sB3 != null ? sB3.f16841l : 0);
        int size2 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                i7 = i11;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i14);
            i7 = i11;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj2), "Trailing")) {
                break;
            }
            i14++;
            i11 = i7;
        }
        InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) obj2;
        w0.S sB4 = interfaceC2172G2 != null ? interfaceC2172G2.b(q0.c.I(-i13, 0, 2, jA)) : null;
        int i15 = i13 + (sB4 != null ? sB4.f16840k : 0);
        int iMax2 = Math.max(iMax, sB4 != null ? sB4.f16841l : 0);
        int size3 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list2.get(i16);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj3), "Prefix")) {
                break;
            }
            i16++;
        }
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj3;
        if (interfaceC2172G3 != null) {
            i8 = iO;
            sB = interfaceC2172G3.b(q0.c.I(-i15, 0, 2, jA));
        } else {
            i8 = iO;
            sB = null;
        }
        int i17 = i15 + (sB != null ? sB.f16840k : 0);
        int iMax3 = Math.max(iMax2, sB != null ? sB.f16841l : 0);
        int size4 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list2.get(i18);
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj4), "Suffix")) {
                break;
            }
            i18++;
        }
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) obj4;
        w0.S sB5 = interfaceC2172G4 != null ? interfaceC2172G4.b(q0.c.I(-i17, 0, 2, jA)) : null;
        int i19 = i17 + (sB5 != null ? sB5.f16840k : 0);
        int iMax4 = Math.max(iMax3, sB5 != null ? sB5.f16841l : 0);
        int i20 = -i19;
        long jH = q0.c.H(i20, -iO2, jA);
        int size5 = list2.size();
        int i21 = 0;
        while (true) {
            if (i21 >= size5) {
                i9 = iO2;
                obj5 = null;
                break;
            }
            obj5 = list2.get(i21);
            i9 = iO2;
            int i22 = size5;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj5), "Label")) {
                break;
            }
            i21++;
            size5 = i22;
            iO2 = i9;
        }
        InterfaceC2172G interfaceC2172G5 = (InterfaceC2172G) obj5;
        w0.S sB6 = interfaceC2172G5 != null ? interfaceC2172G5.b(jH) : null;
        int size6 = list2.size();
        int i23 = 0;
        while (true) {
            if (i23 >= size6) {
                obj6 = null;
                break;
            }
            obj6 = list2.get(i23);
            int i24 = size6;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj6), "Supporting")) {
                break;
            }
            i23++;
            size6 = i24;
        }
        InterfaceC2172G interfaceC2172G6 = (InterfaceC2172G) obj6;
        int iB0 = interfaceC2172G6 != null ? interfaceC2172G6.b0(T0.a.j(j7)) : 0;
        int i25 = (sB6 != null ? sB6.f16841l : 0) + i8;
        int i26 = i8;
        long jH2 = q0.c.H(i20, ((-i25) - i9) - iB0, T0.a.a(j7, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i27 = 0;
        while (i27 < size7) {
            int i28 = size7;
            InterfaceC2172G interfaceC2172G7 = (InterfaceC2172G) list2.get(i27);
            int i29 = i27;
            if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G7), "TextField")) {
                w0.S sB7 = interfaceC2172G7.b(jH2);
                long jA2 = T0.a.a(jH2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i30 = 0;
                while (true) {
                    if (i30 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list2.get(i30);
                    int i31 = size8;
                    int i32 = i30;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a((InterfaceC2172G) obj7), "Hint")) {
                        break;
                    }
                    i30 = i32 + 1;
                    size8 = i31;
                }
                InterfaceC2172G interfaceC2172G8 = (InterfaceC2172G) obj7;
                w0.S sB8 = interfaceC2172G8 != null ? interfaceC2172G8.b(jA2) : null;
                int iMax5 = Math.max(iMax4, Math.max(sB7.f16841l, sB8 != null ? sB8.f16841l : 0) + i25 + i9);
                int i33 = sB3 != null ? sB3.f16840k : 0;
                int i34 = sB4 != null ? sB4.f16840k : 0;
                int i35 = i33;
                int i36 = (sB != null ? sB.f16840k : 0) + (sB5 != null ? sB5.f16840k : 0);
                int iMax6 = Math.max(Math.max(sB7.f16840k + i36, Math.max((sB8 != null ? sB8.f16840k : 0) + i36, sB6 != null ? sB6.f16840k : 0)) + i35 + i34, T0.a.j(j7));
                long jA3 = T0.a.a(q0.c.I(0, -iMax5, i7, jA), 0, iMax6, 0, 0, 9);
                int i37 = iMax6;
                if (interfaceC2172G6 != null) {
                    i10 = 0;
                    sB2 = interfaceC2172G6.b(jA3);
                } else {
                    i10 = 0;
                    sB2 = null;
                }
                int i38 = sB2 != null ? sB2.f16841l : i10;
                int iC = D2.c(sB7.f16841l, sB6 != null ? sB6.f16841l : i10, sB3 != null ? sB3.f16841l : i10, sB4 != null ? sB4.f16841l : i10, sB != null ? sB.f16841l : i10, sB5 != null ? sB5.f16841l : i10, sB8 != null ? sB8.f16841l : i10, sB2 != null ? sB2.f16841l : i10, f22.f5068b, j7, interfaceC2175J.a(), f22.f5069c);
                int i39 = iC - i38;
                int size9 = list2.size();
                int i40 = i10;
                while (i40 < size9) {
                    InterfaceC2172G interfaceC2172G9 = (InterfaceC2172G) list2.get(i40);
                    w0.S s7 = sB;
                    if (kotlin.jvm.internal.l.a(androidx.compose.ui.layout.a.a(interfaceC2172G9), "Container")) {
                        w0.S sB9 = interfaceC2172G9.b(q0.c.a(i37 != Integer.MAX_VALUE ? i37 : i10, i37, i39 != Integer.MAX_VALUE ? i39 : i10, i39));
                        int i41 = i37;
                        w0.S s8 = sB3;
                        int i42 = iC;
                        return interfaceC2175J.T(i41, i42, P3.z.f7780k, new E2(sB6, i41, i42, sB7, sB8, s8, sB4, s7, sB5, sB9, sB2, f22, i26, interfaceC2175J));
                    }
                    i40++;
                    iC = iC;
                    sB3 = sB3;
                    sB4 = sB4;
                    sB7 = sB7;
                    f22 = this;
                    list2 = list;
                    sB2 = sB2;
                    i37 = i37;
                    sB6 = sB6;
                    sB = s7;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i27 = i29 + 1;
            f22 = this;
            list2 = list;
            sB = sB;
            jH2 = jH2;
            sB4 = sB4;
            size7 = i28;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(list, i7, S.f5319E);
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return g(list, i7, S.f5321G);
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return f(interfaceC2197o, list, i7, S.f5320F);
    }

    public final int f(InterfaceC2197o interfaceC2197o, List list, int i7, e4.n nVar) {
        Object obj;
        int iY;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i8;
        Object obj5;
        int i9;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj), "Leading")) {
                break;
            }
            i10++;
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
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj2), "Trailing")) {
                break;
            }
            i11++;
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
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i12);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj3), "Label")) {
                break;
            }
            i12++;
        }
        Object obj8 = (InterfaceC2172G) obj3;
        int iIntValue3 = obj8 != null ? ((Number) nVar.invoke(obj8, Integer.valueOf(iY))).intValue() : 0;
        int size4 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i13);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj4), "Prefix")) {
                break;
            }
            i13++;
        }
        InterfaceC2172G interfaceC2172G3 = (InterfaceC2172G) obj4;
        if (interfaceC2172G3 != null) {
            int iIntValue4 = ((Number) nVar.invoke(interfaceC2172G3, Integer.valueOf(iY))).intValue();
            int iY3 = interfaceC2172G3.Y(Integer.MAX_VALUE);
            if (iY != Integer.MAX_VALUE) {
                iY -= iY3;
            }
            i8 = iIntValue4;
        } else {
            i8 = 0;
        }
        int size5 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i14);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj5), "Suffix")) {
                break;
            }
            i14++;
        }
        InterfaceC2172G interfaceC2172G4 = (InterfaceC2172G) obj5;
        if (interfaceC2172G4 != null) {
            int iIntValue5 = ((Number) nVar.invoke(interfaceC2172G4, Integer.valueOf(iY))).intValue();
            int iY4 = interfaceC2172G4.Y(Integer.MAX_VALUE);
            if (iY != Integer.MAX_VALUE) {
                iY -= iY4;
            }
            i9 = iIntValue5;
        } else {
            i9 = 0;
        }
        int size6 = list.size();
        for (int i15 = 0; i15 < size6; i15++) {
            Object obj9 = list.get(i15);
            if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj9), "TextField")) {
                int iIntValue6 = ((Number) nVar.invoke(obj9, Integer.valueOf(iY))).intValue();
                int size7 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i16);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj6), "Hint")) {
                        break;
                    }
                    i16++;
                }
                Object obj10 = (InterfaceC2172G) obj6;
                int iIntValue7 = obj10 != null ? ((Number) nVar.invoke(obj10, Integer.valueOf(iY))).intValue() : 0;
                int size8 = list.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i17);
                    if (kotlin.jvm.internal.l.a(M.W.e((InterfaceC2172G) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i17++;
                }
                Object obj12 = (InterfaceC2172G) obj7;
                return D2.c(iIntValue6, iIntValue3, iIntValue, iIntValue2, i8, i9, iIntValue7, obj12 != null ? ((Number) nVar.invoke(obj12, Integer.valueOf(i7))).intValue() : 0, this.f5068b, M.W.a, interfaceC2197o.a(), this.f5069c);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
