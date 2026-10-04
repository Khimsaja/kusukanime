package o;

import java.util.List;
import l4.AbstractC1420H;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;
import w0.S;

/* renamed from: o.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1608f implements InterfaceC2173H {
    public final C1613k a;

    public C1608f(C1613k c1613k) {
        this.a = c1613k;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2172G) list.get(0)).c(i7));
            int iY = P3.r.y(list);
            int i8 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2172G) list.get(i8)).c(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iY) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        S s7;
        S s8;
        int i7;
        int size = list.size();
        S[] sArr = new S[size];
        int size2 = list.size();
        long j8 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            s7 = null;
            if (i9 >= size2) {
                break;
            }
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i9);
            Object objH = interfaceC2172G.h();
            C1610h c1610h = objH instanceof C1610h ? (C1610h) objH : null;
            if (c1610h != null && ((Boolean) c1610h.a.getValue()).booleanValue()) {
                S sB = interfaceC2172G.b(j7);
                long jA = AbstractC1420H.a(sB.f16840k, sB.f16841l);
                sArr[i9] = sB;
                j8 = jA;
            }
            i9++;
        }
        int size3 = list.size();
        for (int i10 = 0; i10 < size3; i10++) {
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i10);
            if (sArr[i10] == null) {
                sArr[i10] = interfaceC2172G2.b(j7);
            }
        }
        if (interfaceC2175J.s()) {
            i7 = (int) (j8 >> 32);
        } else {
            if (size == 0) {
                s8 = null;
            } else {
                s8 = sArr[0];
                int i11 = size - 1;
                if (i11 != 0) {
                    int i12 = s8 != null ? s8.f16840k : 0;
                    k4.f it = new k4.g(1, i11, 1).iterator();
                    while (it.f12677m) {
                        S s9 = sArr[it.a()];
                        int i13 = s9 != null ? s9.f16840k : 0;
                        if (i12 < i13) {
                            s8 = s9;
                            i12 = i13;
                        }
                    }
                }
            }
            i7 = s8 != null ? s8.f16840k : 0;
        }
        if (interfaceC2175J.s()) {
            i8 = (int) (4294967295L & j8);
        } else {
            if (size != 0) {
                s7 = sArr[0];
                int i14 = size - 1;
                if (i14 != 0) {
                    int i15 = s7 != null ? s7.f16841l : 0;
                    k4.f it2 = new k4.g(1, i14, 1).iterator();
                    while (it2.f12677m) {
                        S s10 = sArr[it2.a()];
                        int i16 = s10 != null ? s10.f16841l : 0;
                        if (i15 < i16) {
                            s7 = s10;
                            i15 = i16;
                        }
                    }
                }
            }
            if (s7 != null) {
                i8 = s7.f16841l;
            }
        }
        if (!interfaceC2175J.s()) {
            this.a.f13509c.setValue(new T0.j(AbstractC1420H.a(i7, i8)));
        }
        return interfaceC2175J.T(i7, i8, P3.z.f7780k, new C1607e(sArr, this, i7, i8));
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2172G) list.get(0)).Y(i7));
            int iY = P3.r.y(list);
            int i8 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2172G) list.get(i8)).Y(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iY) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2172G) list.get(0)).W(i7));
            int iY = P3.r.y(list);
            int i8 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2172G) list.get(i8)).W(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iY) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(((InterfaceC2172G) list.get(0)).b0(i7));
            int iY = P3.r.y(list);
            int i8 = 1;
            if (1 <= iY) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((InterfaceC2172G) list.get(i8)).b0(i7));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i8 == iY) {
                        break;
                    }
                    i8++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
