package L;

import O.C0486d;
import O.C0510p;
import java.util.ArrayList;
import java.util.List;
import w0.InterfaceC2172G;

/* loaded from: classes.dex */
public final class U1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5364l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5365m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ W.a f5366n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f5367o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5368p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f5369q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5370r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5371s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(int i7, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, M.G g4, W.a aVar5) {
        super(2);
        this.f5365m = i7;
        this.f5366n = aVar;
        this.f5367o = aVar2;
        this.f5368p = aVar3;
        this.f5369q = aVar4;
        this.f5371s = g4;
        this.f5370r = aVar5;
    }

    /* JADX WARN: Type inference failed for: r6v18, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Object obj3;
        Object obj4;
        Object obj5;
        int i7;
        D.P0 p02;
        Object obj6;
        Integer numValueOf;
        ArrayList arrayList;
        int i8;
        int iO;
        int iD;
        Object obj7;
        Object obj8;
        int i9;
        int iO2;
        int iO3;
        switch (this.f5364l) {
            case 0:
                C0510p c0510p = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
                    c0510p.M();
                } else {
                    Y1.b(this.f5365m, this.f5366n, (W.a) this.f5367o, (W.a) this.f5368p, (W.a) this.f5369q, (M.G) this.f5371s, (W.a) this.f5370r, c0510p, 0);
                }
                return O3.C.a;
            case 1:
                C0510p c0510p2 = (C0510p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0510p2.y()) {
                    c0510p2.M();
                } else {
                    v.m0 m0Var = (v.m0) this.f5367o;
                    w0.b0 b0Var = (w0.b0) this.f5368p;
                    v.S s7 = new v.S(m0Var, b0Var);
                    this.f5366n.invoke(new v.Z(androidx.compose.foundation.layout.a.f(s7, b0Var.getLayoutDirection()), ((ArrayList) this.f5369q).isEmpty() ? s7.c() : b0Var.q0(this.f5365m), androidx.compose.foundation.layout.a.e(s7, b0Var.getLayoutDirection()), (((ArrayList) this.f5370r).isEmpty() || (num = (Integer) this.f5371s) == null) ? s7.a() : b0Var.q0(num.intValue())), c0510p2, 0);
                }
                return O3.C.a;
            case 2:
                w0.b0 b0Var2 = (w0.b0) obj;
                long j7 = ((T0.a) obj2).a;
                int iH = T0.a.h(j7);
                int iG = T0.a.g(j7);
                long jA = T0.a.a(j7, 0, 0, 0, 0, 10);
                List listO = b0Var2.o(Z1.f5433k, this.f5366n);
                ArrayList arrayList2 = new ArrayList(listO.size());
                int size = listO.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(((InterfaceC2172G) listO.get(i10)).b(jA));
                }
                if (arrayList2.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList2.get(0);
                    int i11 = ((w0.S) obj3).f16841l;
                    int iY = P3.r.y(arrayList2);
                    if (1 <= iY) {
                        int i12 = 1;
                        while (true) {
                            Object obj9 = arrayList2.get(i12);
                            int i13 = ((w0.S) obj9).f16841l;
                            if (i11 < i13) {
                                obj3 = obj9;
                                i11 = i13;
                            }
                            if (i12 != iY) {
                                i12++;
                            }
                        }
                    }
                }
                w0.S s8 = (w0.S) obj3;
                int i14 = s8 != null ? s8.f16841l : 0;
                List listO2 = b0Var2.o(Z1.f5435m, (W.a) this.f5367o);
                ArrayList arrayList3 = new ArrayList(listO2.size());
                int size2 = listO2.size();
                int i15 = 0;
                while (true) {
                    v.m0 m0Var2 = (v.m0) this.f5371s;
                    if (i15 >= size2) {
                        if (arrayList3.isEmpty()) {
                            obj4 = null;
                        } else {
                            obj4 = arrayList3.get(0);
                            int i16 = ((w0.S) obj4).f16841l;
                            int iY2 = P3.r.y(arrayList3);
                            if (1 <= iY2) {
                                Object obj10 = obj4;
                                int i17 = i16;
                                int i18 = 1;
                                while (true) {
                                    Object obj11 = arrayList3.get(i18);
                                    int i19 = ((w0.S) obj11).f16841l;
                                    if (i17 < i19) {
                                        obj10 = obj11;
                                        i17 = i19;
                                    }
                                    if (i18 != iY2) {
                                        i18++;
                                    } else {
                                        obj4 = obj10;
                                    }
                                }
                            }
                        }
                        w0.S s9 = (w0.S) obj4;
                        int i20 = s9 != null ? s9.f16841l : 0;
                        if (arrayList3.isEmpty()) {
                            i7 = iH;
                            obj5 = null;
                        } else {
                            obj5 = arrayList3.get(0);
                            int i21 = ((w0.S) obj5).f16840k;
                            int iY3 = P3.r.y(arrayList3);
                            if (1 <= iY3) {
                                Object obj12 = obj5;
                                int i22 = i21;
                                int i23 = 1;
                                while (true) {
                                    Object obj13 = arrayList3.get(i23);
                                    i7 = iH;
                                    int i24 = ((w0.S) obj13).f16840k;
                                    if (i22 < i24) {
                                        i22 = i24;
                                        obj12 = obj13;
                                    }
                                    if (i23 != iY3) {
                                        i23++;
                                        iH = i7;
                                    } else {
                                        obj5 = obj12;
                                    }
                                }
                            } else {
                                i7 = iH;
                            }
                        }
                        w0.S s10 = (w0.S) obj5;
                        int i25 = s10 != null ? s10.f16840k : 0;
                        List listO3 = b0Var2.o(Z1.f5436n, (W.a) this.f5368p);
                        ArrayList arrayList4 = new ArrayList(listO3.size());
                        int size3 = listO3.size();
                        int i26 = 0;
                        while (i26 < size3) {
                            int i27 = i25;
                            int i28 = i20;
                            w0.S sB = ((InterfaceC2172G) listO3.get(i26)).b(q0.c.H((-m0Var2.a(b0Var2, b0Var2.getLayoutDirection())) - m0Var2.b(b0Var2, b0Var2.getLayoutDirection()), -m0Var2.d(b0Var2), jA));
                            if (sB.f16841l == 0 || sB.f16840k == 0) {
                                sB = null;
                            }
                            if (sB != null) {
                                arrayList4.add(sB);
                            }
                            i26++;
                            i25 = i27;
                            i20 = i28;
                        }
                        int i29 = i25;
                        int i30 = i20;
                        boolean zIsEmpty = arrayList4.isEmpty();
                        int i31 = this.f5365m;
                        if (zIsEmpty) {
                            p02 = null;
                        } else {
                            if (arrayList4.isEmpty()) {
                                obj7 = null;
                            } else {
                                obj7 = arrayList4.get(0);
                                int i32 = ((w0.S) obj7).f16840k;
                                int iY4 = P3.r.y(arrayList4);
                                if (1 <= iY4) {
                                    Object obj14 = obj7;
                                    int i33 = i32;
                                    int i34 = 1;
                                    while (true) {
                                        Object obj15 = arrayList4.get(i34);
                                        int i35 = ((w0.S) obj15).f16840k;
                                        if (i33 < i35) {
                                            i33 = i35;
                                            obj14 = obj15;
                                        }
                                        if (i34 != iY4) {
                                            i34++;
                                        } else {
                                            obj7 = obj14;
                                        }
                                    }
                                }
                            }
                            kotlin.jvm.internal.l.c(obj7);
                            int i36 = ((w0.S) obj7).f16840k;
                            if (arrayList4.isEmpty()) {
                                i9 = i36;
                                obj8 = null;
                            } else {
                                obj8 = arrayList4.get(0);
                                int i37 = ((w0.S) obj8).f16841l;
                                int iY5 = P3.r.y(arrayList4);
                                if (1 <= iY5) {
                                    Object obj16 = obj8;
                                    int i38 = i37;
                                    int i39 = 1;
                                    while (true) {
                                        Object obj17 = arrayList4.get(i39);
                                        i9 = i36;
                                        int i40 = ((w0.S) obj17).f16841l;
                                        if (i38 < i40) {
                                            i38 = i40;
                                            obj16 = obj17;
                                        }
                                        if (i39 != iY5) {
                                            i39++;
                                            i36 = i9;
                                        } else {
                                            obj8 = obj16;
                                        }
                                    }
                                } else {
                                    i9 = i36;
                                }
                            }
                            kotlin.jvm.internal.l.c(obj8);
                            int i41 = ((w0.S) obj8).f16841l;
                            T0.k kVar = T0.k.f8844k;
                            if (i31 != 0) {
                                if (i31 != 2 && i31 != 3) {
                                    iO2 = (i7 - i9) / 2;
                                } else if (b0Var2.getLayoutDirection() == kVar) {
                                    iO3 = b0Var2.O(Y1.a);
                                    iO2 = (i7 - iO3) - i9;
                                } else {
                                    iO2 = b0Var2.O(Y1.a);
                                }
                                p02 = new D.P0(iO2, i41);
                            } else if (b0Var2.getLayoutDirection() == kVar) {
                                iO2 = b0Var2.O(Y1.a);
                                p02 = new D.P0(iO2, i41);
                            } else {
                                iO3 = b0Var2.O(Y1.a);
                                iO2 = (i7 - iO3) - i9;
                                p02 = new D.P0(iO2, i41);
                            }
                        }
                        List listO4 = b0Var2.o(Z1.f5437o, new W.a(true, -2146438447, new C0351b((W.a) this.f5369q, 5, (byte) 0)));
                        ArrayList arrayList5 = new ArrayList(listO4.size());
                        int size4 = listO4.size();
                        for (int i42 = 0; i42 < size4; i42++) {
                            arrayList5.add(((InterfaceC2172G) listO4.get(i42)).b(jA));
                        }
                        if (arrayList5.isEmpty()) {
                            obj6 = null;
                        } else {
                            obj6 = arrayList5.get(0);
                            int i43 = ((w0.S) obj6).f16841l;
                            int iY6 = P3.r.y(arrayList5);
                            if (1 <= iY6) {
                                int i44 = 1;
                                while (true) {
                                    Object obj18 = arrayList5.get(i44);
                                    Object obj19 = obj6;
                                    int i45 = ((w0.S) obj18).f16841l;
                                    if (i43 < i45) {
                                        i43 = i45;
                                        obj6 = obj18;
                                    } else {
                                        obj6 = obj19;
                                    }
                                    if (i44 != iY6) {
                                        i44++;
                                    }
                                }
                            }
                        }
                        w0.S s11 = (w0.S) obj6;
                        Integer numValueOf2 = s11 != null ? Integer.valueOf(s11.f16841l) : null;
                        if (p02 != null) {
                            int i46 = p02.f1093b;
                            if (numValueOf2 == null || i31 == 3) {
                                iO = b0Var2.O(Y1.a) + i46;
                                iD = m0Var2.d(b0Var2);
                            } else {
                                iO = numValueOf2.intValue() + i46;
                                iD = b0Var2.O(Y1.a);
                            }
                            numValueOf = Integer.valueOf(iD + iO);
                        } else {
                            numValueOf = null;
                        }
                        if (i30 != 0) {
                            int iIntValue = i30 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : m0Var2.d(b0Var2));
                            arrayList = arrayList3;
                            i8 = iIntValue;
                        } else {
                            arrayList = arrayList3;
                            i8 = 0;
                        }
                        Integer num2 = numValueOf2;
                        List listO5 = b0Var2.o(Z1.f5434l, new W.a(true, -1213360416, new U1((v.m0) this.f5371s, b0Var2, arrayList2, i14, arrayList5, num2, (W.a) this.f5370r)));
                        ArrayList arrayList6 = new ArrayList(listO5.size());
                        int size5 = listO5.size();
                        for (int i47 = 0; i47 < size5; i47++) {
                            arrayList6.add(((InterfaceC2172G) listO5.get(i47)).b(jA));
                        }
                        int i48 = i7;
                        return b0Var2.T(i48, iG, P3.z.f7780k, new W1(arrayList6, arrayList2, arrayList, arrayList5, p02, i48, i29, (v.m0) this.f5371s, b0Var2, iG, i8, num2, arrayList4, numValueOf));
                    }
                    arrayList3.add(((InterfaceC2172G) listO2.get(i15)).b(q0.c.H((-m0Var2.a(b0Var2, b0Var2.getLayoutDirection())) - m0Var2.b(b0Var2, b0Var2.getLayoutDirection()), -m0Var2.d(b0Var2), jA)));
                    i15++;
                }
                break;
            default:
                ((Number) obj2).intValue();
                e3.c.a((p.u0) this.f5367o, (a0.q) this.f5368p, (e4.k) this.f5369q, (a0.i) this.f5370r, (kotlin.jvm.internal.m) this.f5371s, this.f5366n, (C0510p) obj, C0486d.V(this.f5365m | 1));
                return O3.C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(W.a aVar, W.a aVar2, W.a aVar3, int i7, v.m0 m0Var, W.a aVar4, W.a aVar5) {
        super(2);
        this.f5366n = aVar;
        this.f5367o = aVar2;
        this.f5368p = aVar3;
        this.f5365m = i7;
        this.f5371s = m0Var;
        this.f5369q = aVar4;
        this.f5370r = aVar5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public U1(p.u0 u0Var, a0.q qVar, e4.k kVar, a0.i iVar, e4.k kVar2, W.a aVar, int i7) {
        super(2);
        this.f5367o = u0Var;
        this.f5368p = qVar;
        this.f5369q = kVar;
        this.f5370r = iVar;
        this.f5371s = (kotlin.jvm.internal.m) kVar2;
        this.f5366n = aVar;
        this.f5365m = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U1(v.m0 m0Var, w0.b0 b0Var, ArrayList arrayList, int i7, ArrayList arrayList2, Integer num, W.a aVar) {
        super(2);
        this.f5367o = m0Var;
        this.f5368p = b0Var;
        this.f5369q = arrayList;
        this.f5365m = i7;
        this.f5370r = arrayList2;
        this.f5371s = num;
        this.f5366n = aVar;
    }
}
