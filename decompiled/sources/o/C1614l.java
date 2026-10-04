package o;

import java.util.ArrayList;
import java.util.List;
import l4.AbstractC1420H;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;
import w0.S;

/* renamed from: o.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614l implements InterfaceC2173H {
    public final C1620r a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13511b;

    public C1614l(C1620r c1620r) {
        this.a = c1620r;
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
        Object obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((InterfaceC2172G) list.get(i7)).b(j7));
        }
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i8 = ((S) obj).f16840k;
            int iY = P3.r.y(arrayList);
            if (1 <= iY) {
                int i9 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i9);
                    int i10 = ((S) obj3).f16840k;
                    if (i8 < i10) {
                        obj = obj3;
                        i8 = i10;
                    }
                    if (i9 == iY) {
                        break;
                    }
                    i9++;
                }
            }
        }
        S s7 = (S) obj;
        int i11 = s7 != null ? s7.f16840k : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i12 = ((S) obj2).f16841l;
            int iY2 = P3.r.y(arrayList);
            if (1 <= iY2) {
                int i13 = 1;
                while (true) {
                    Object obj4 = arrayList.get(i13);
                    int i14 = ((S) obj4).f16841l;
                    if (i12 < i14) {
                        obj2 = obj4;
                        i12 = i14;
                    }
                    if (i13 == iY2) {
                        break;
                    }
                    i13++;
                }
            }
        }
        S s8 = (S) obj2;
        int i15 = s8 != null ? s8.f16841l : 0;
        boolean zS = interfaceC2175J.s();
        C1620r c1620r = this.a;
        if (zS) {
            this.f13511b = true;
            c1620r.a.setValue(new T0.j(AbstractC1420H.a(i11, i15)));
        } else if (!this.f13511b) {
            c1620r.a.setValue(new T0.j(AbstractC1420H.a(i11, i15)));
        }
        return interfaceC2175J.T(i11, i15, P3.z.f7780k, new H.K(3, arrayList));
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
