package z;

import O.C0485c0;
import O.C0487d0;
import O1.C0541o;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import f.AbstractC0841b;
import f.AbstractC0847h;
import f1.AbstractC0870c;
import f6.AbstractC0915m;
import java.util.ArrayList;
import java.util.List;
import l4.InterfaceC1440s;
import s.EnumC1903a0;
import v.C2127f;
import v.Z;
import w0.b0;
import x.C2238l;
import y.C2301A;
import y.C2343x;

/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2425d f18511l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f18512m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f18513n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f18514o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1440s f18515p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f18516q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0.h f18517r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t.l f18518s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ M5.c f18519t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C2425d c2425d, Z z7, float f5, k kVar, InterfaceC1440s interfaceC1440s, InterfaceC0821a interfaceC0821a, a0.h hVar, t.l lVar, M5.c cVar) {
        super(2);
        this.f18511l = c2425d;
        this.f18512m = z7;
        this.f18513n = f5;
        this.f18514o = kVar;
        this.f18515p = interfaceC1440s;
        this.f18516q = interfaceC0821a;
        this.f18517r = hVar;
        this.f18518s = lVar;
        this.f18519t = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        a0.g gVar;
        int i8;
        a0.h hVar;
        int i9;
        int i10;
        long j7;
        int i11;
        int i12;
        int i13;
        C2343x c2343x;
        a0.g gVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        C2343x c2343x2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        j jVar;
        int i27;
        P3.l lVar;
        int i28;
        int i29;
        long j8;
        List list;
        int i30;
        List list2;
        int i31;
        List arrayList;
        int i32;
        int i33;
        j jVar2;
        b0 b0Var;
        P3.l lVar2;
        int i34;
        List list3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List list4;
        List list5;
        int i35;
        Object obj3;
        C2425d c2425d;
        v vVar;
        int i36;
        int i37;
        int i38;
        List list6;
        int i39;
        u uVar = this;
        C2343x c2343x3 = (C2343x) obj;
        long j9 = ((T0.a) obj2).a;
        C2425d c2425d2 = uVar.f18511l;
        c2425d2.f18399B.getValue();
        EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
        AbstractC0847h.i(j9, enumC1903a0);
        Z z7 = uVar.f18512m;
        int iO = c2343x3.f17648l.O(androidx.compose.foundation.layout.a.f(z7, c2343x3.f17648l.getLayoutDirection()));
        int iO2 = c2343x3.f17648l.O(androidx.compose.foundation.layout.a.e(z7, c2343x3.f17648l.getLayoutDirection()));
        int iO3 = c2343x3.f17648l.O(z7.f16423b);
        b0 b0Var2 = c2343x3.f17648l;
        int iO4 = b0Var2.O(z7.f16425d) + iO3;
        int i40 = iO2 + iO;
        int i41 = i40 - iO;
        long jH = q0.c.H(-i40, -iO4, j9);
        c2425d2.f18418p = c2343x3;
        int iO5 = b0Var2.O(uVar.f18513n);
        int iH = T0.a.h(j9) - i40;
        long jB = P3.F.b(iO, iO3);
        uVar.f18514o.getClass();
        int i42 = iH < 0 ? 0 : iH;
        C2343x c2343x4 = c2343x3;
        int i43 = iO4;
        EnumC1903a0 enumC1903a02 = enumC1903a0;
        long j10 = jH;
        c2425d2.f18427y = q0.c.b(i42, T0.a.g(jH), 5);
        t tVar = (t) uVar.f18515p.invoke();
        t.l lVar3 = uVar.f18518s;
        Y.h hVarC = Y.s.c();
        e4.k kVarF = hVarC != null ? hVarC.f() : null;
        Y.h hVarD = Y.s.d(hVarC);
        try {
            int iJ = c2425d2.j();
            int i44 = i42;
            C0541o c0541o = c2425d2.f18405c;
            int iQ = AbstractC0915m.q(iJ, c0541o.f7471e, tVar);
            if (iJ != iQ) {
                i7 = iH;
                ((C0487d0) c0541o.f7469c).g(iQ);
                ((C2301A) c0541o.f7472f).a(iJ);
            } else {
                i7 = iH;
            }
            c2425d2.j();
            float f5 = ((C0485c0) c0541o.f7470d).f();
            c2425d2.l();
            lVar3.getClass();
            float f7 = 0;
            int i45 = i44 + iO5;
            int iW = P3.F.W(f7 - (f5 * i45));
            Y.s.f(hVarC, hVarD, kVarF);
            List listI = AbstractC0870c.I(tVar, c2425d2.f18428z, c2425d2.f18423u);
            int iIntValue = ((Number) uVar.f18516q.invoke()).intValue();
            if (iO < 0) {
                throw new IllegalArgumentException("negative beforeContentPadding");
            }
            if (i41 < 0) {
                throw new IllegalArgumentException("negative afterContentPadding");
            }
            int i46 = i45 < 0 ? 0 : i45;
            List list7 = P3.y.f7779k;
            P3.z zVar = P3.z.f7780k;
            M5.c cVar = uVar.f18519t;
            t tVar2 = tVar;
            t.l lVar4 = uVar.f18518s;
            if (iIntValue <= 0) {
                vVar = new v(i44, iO5, i41, -iO, i7 + i41, lVar4, b0Var2.T(q0.c.v(T0.a.j(j10) + i40, j9), q0.c.u(T0.a.i(j10) + i43, j9), zVar, C2424c.f18445n), cVar);
                c2425d = c2425d2;
            } else {
                P3.z zVar2 = zVar;
                long j11 = j9;
                long jB2 = q0.c.b(i44, T0.a.g(j10), 5);
                while (iQ > 0 && iW > 0) {
                    iQ--;
                    iW -= i46;
                }
                int i47 = iW * (-1);
                if (iQ >= iIntValue) {
                    iQ = iIntValue - 1;
                    i47 = 0;
                }
                P3.l lVar5 = new P3.l();
                int i48 = -iO;
                int i49 = i48 + (iO5 < 0 ? iO5 : 0);
                int i50 = i47 + i49;
                int i51 = iIntValue;
                int iMax = 0;
                while (true) {
                    gVar = a0.b.f10394x;
                    i8 = i46;
                    hVar = uVar.f18517r;
                    i9 = i49;
                    if (i50 >= 0 || iQ <= 0) {
                        break;
                    }
                    int i52 = iQ - 1;
                    int i53 = iO;
                    P3.l lVar6 = lVar5;
                    C2343x c2343x5 = c2343x4;
                    long j12 = jB2;
                    EnumC1903a0 enumC1903a03 = enumC1903a02;
                    int i54 = i51;
                    C2425d c2425d3 = c2425d2;
                    int i55 = i50;
                    t tVar3 = tVar2;
                    j jVarL = AbstractC0841b.l(c2343x5, i52, j12, tVar3, jB, enumC1903a03, gVar, hVar, b0Var2.getLayoutDirection(), false, i44);
                    lVar6.add(0, jVarL);
                    iMax = Math.max(iMax, jVarL.f18483j);
                    uVar = this;
                    listI = listI;
                    iQ = i52;
                    tVar2 = tVar3;
                    i43 = i43;
                    i49 = i9;
                    j11 = j11;
                    j10 = j10;
                    iO5 = iO5;
                    zVar2 = zVar2;
                    i50 = i55 + i8;
                    c2343x4 = c2343x5;
                    jB2 = j12;
                    c2425d2 = c2425d3;
                    i46 = i8;
                    f7 = f7;
                    i51 = i54;
                    enumC1903a02 = enumC1903a03;
                    lVar5 = lVar6;
                    iO = i53;
                }
                float f8 = f7;
                int i56 = iO;
                int i57 = iO5;
                long j13 = j10;
                P3.z zVar3 = zVar2;
                long j14 = j11;
                P3.l lVar7 = lVar5;
                int i58 = iQ;
                EnumC1903a0 enumC1903a04 = enumC1903a02;
                int i59 = i51;
                C2425d c2425d4 = c2425d2;
                int i60 = i50;
                t tVar4 = tVar2;
                C2343x c2343x6 = c2343x4;
                int i61 = i43;
                List list8 = listI;
                long j15 = jB2;
                int i62 = iMax;
                int i63 = i9;
                if (i60 < i63) {
                    i60 = i63;
                }
                int i64 = i60 - i63;
                int i65 = i7 + i41;
                int i66 = i65 < 0 ? 0 : i65;
                C2343x c2343x7 = c2343x6;
                int i67 = -i64;
                int i68 = i64;
                a0.g gVar3 = gVar;
                int i69 = i58;
                int i70 = 0;
                boolean z8 = false;
                while (true) {
                    i10 = i63;
                    if (i70 >= lVar7.f7767m) {
                        break;
                    }
                    if (i67 >= i66) {
                        lVar7.h(i70);
                        i63 = i10;
                        z8 = true;
                    } else {
                        i69++;
                        i67 += i8;
                        i70++;
                        i63 = i10;
                    }
                }
                int i71 = i67;
                int i72 = i59;
                int i73 = i69;
                int i74 = i58;
                while (true) {
                    if (i73 >= i72) {
                        j7 = j15;
                        i11 = i71;
                        i12 = i72;
                        i13 = i62;
                        c2343x = c2343x7;
                        gVar2 = gVar3;
                        i14 = 1;
                        break;
                    }
                    if (i71 >= i66 && i71 > 0 && !lVar7.isEmpty()) {
                        j7 = j15;
                        i11 = i71;
                        i13 = i62;
                        c2343x = c2343x7;
                        gVar2 = gVar3;
                        i14 = 1;
                        i12 = i72;
                        break;
                    }
                    int i75 = i71;
                    int i76 = i72;
                    int iMax2 = i62;
                    C2343x c2343x8 = c2343x7;
                    a0.g gVar4 = gVar3;
                    int i77 = i66;
                    j jVarL2 = AbstractC0841b.l(c2343x8, i73, j15, tVar4, jB, enumC1903a04, gVar4, hVar, b0Var2.getLayoutDirection(), false, i44);
                    int i78 = i76 - 1;
                    int i79 = i75 + (i73 == i78 ? i44 : i8);
                    long j16 = j15;
                    int i80 = i10;
                    if (i79 > i80 || i73 == i78) {
                        iMax2 = Math.max(iMax2, jVarL2.f18483j);
                        lVar7.addLast(jVarL2);
                    } else {
                        i68 -= i8;
                        i74 = i73 + 1;
                        z8 = true;
                    }
                    i73++;
                    i72 = i76;
                    i71 = i79;
                    i10 = i80;
                    gVar3 = gVar4;
                    i66 = i77;
                    c2343x7 = c2343x8;
                    j15 = j16;
                    i62 = iMax2;
                }
                int i81 = i7;
                if (i11 < i81) {
                    int i82 = i81 - i11;
                    int i83 = i11 + i82;
                    int i84 = i56;
                    int iMax3 = i13;
                    int i85 = i68 - i82;
                    while (i85 < i84 && i74 > 0) {
                        int i86 = i74 - 1;
                        int i87 = i85;
                        int i88 = i81;
                        int i89 = iMax3;
                        C2343x c2343x9 = c2343x;
                        long j17 = j7;
                        j jVarL3 = AbstractC0841b.l(c2343x9, i86, j17, tVar4, jB, enumC1903a04, gVar2, hVar, b0Var2.getLayoutDirection(), false, i44);
                        j7 = j17;
                        lVar7.add(0, jVarL3);
                        iMax3 = Math.max(i89, jVarL3.f18483j);
                        i85 = i87 + i8;
                        c2343x = c2343x9;
                        i74 = i86;
                        i84 = i84;
                        i81 = i88;
                        i73 = i73;
                    }
                    int i90 = i85;
                    i16 = i81;
                    i17 = i73;
                    int i91 = iMax3;
                    i15 = i84;
                    c2343x2 = c2343x;
                    if (i90 < 0) {
                        i20 = i74;
                        i18 = i91;
                        i19 = i83 + i90;
                        i21 = 0;
                    } else {
                        i20 = i74;
                        i21 = i90;
                        i18 = i91;
                        i19 = i83;
                    }
                } else {
                    i15 = i56;
                    i16 = i81;
                    i17 = i73;
                    c2343x2 = c2343x;
                    int i92 = i74;
                    i18 = i13;
                    i19 = i11;
                    i20 = i92;
                    i21 = i68;
                }
                if (i21 < 0) {
                    throw new IllegalArgumentException("invalid currentFirstPageScrollOffset");
                }
                int i93 = -i21;
                j jVar3 = (j) lVar7.first();
                if (i15 > 0 || i57 < 0) {
                    int i94 = lVar7.f7767m;
                    j jVar4 = jVar3;
                    int i95 = 0;
                    while (i95 < i94 && i21 != 0) {
                        int i96 = i94;
                        i23 = i8;
                        i22 = i21;
                        if (i23 > i21 || i95 == P3.r.y(lVar7)) {
                            break;
                        }
                        i21 = i22 - i23;
                        i95++;
                        jVar4 = (j) lVar7.get(i95);
                        i8 = i23;
                        i94 = i96;
                    }
                    i22 = i21;
                    i23 = i8;
                    i8 = i23;
                    jVar3 = jVar4;
                    i24 = i22;
                } else {
                    i24 = i21;
                }
                int iMax4 = Math.max(0, i20);
                int i97 = i20 - 1;
                if (iMax4 <= i97) {
                    int i98 = i97;
                    List arrayList4 = null;
                    while (true) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        int i99 = i98;
                        i25 = i19;
                        i27 = iMax4;
                        jVar = jVar3;
                        lVar = lVar7;
                        i28 = i8;
                        i29 = i57;
                        list = arrayList4;
                        i26 = i93;
                        j8 = j7;
                        list.add(AbstractC0841b.l(c2343x2, i99, j8, tVar4, jB, enumC1903a04, gVar2, hVar, c2343x2.f17648l.getLayoutDirection(), false, i44));
                        if (i99 == i27) {
                            break;
                        }
                        i98 = i99 - 1;
                        iMax4 = i27;
                        j7 = j8;
                        arrayList4 = list;
                        i19 = i25;
                        lVar7 = lVar;
                        jVar3 = jVar;
                        i57 = i29;
                        i8 = i28;
                        i93 = i26;
                    }
                } else {
                    i25 = i19;
                    i26 = i93;
                    jVar = jVar3;
                    i27 = iMax4;
                    lVar = lVar7;
                    i28 = i8;
                    i29 = i57;
                    j8 = j7;
                    list = null;
                }
                int size = list8.size();
                List arrayList5 = list;
                int i100 = 0;
                while (i100 < size) {
                    List list9 = list8;
                    int i101 = size;
                    int iIntValue2 = ((Number) list9.get(i100)).intValue();
                    if (iIntValue2 < i27) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        i38 = i27;
                        i39 = i100;
                        List list10 = arrayList5;
                        list6 = list9;
                        i37 = i101;
                        list10.add(AbstractC0841b.l(c2343x2, iIntValue2, j8, tVar4, jB, enumC1903a04, gVar2, hVar, c2343x2.f17648l.getLayoutDirection(), false, i44));
                        arrayList5 = list10;
                    } else {
                        i37 = i101;
                        i38 = i27;
                        list6 = list9;
                        i39 = i100;
                    }
                    i100 = i39 + 1;
                    list8 = list6;
                    i27 = i38;
                    size = i37;
                }
                List list11 = list8;
                List list12 = arrayList5 == null ? list7 : arrayList5;
                int iMax5 = i18;
                int i102 = 0;
                for (int size2 = list12.size(); i102 < size2; size2 = size2) {
                    iMax5 = Math.max(iMax5, ((j) list12.get(i102)).f18483j);
                    i102++;
                }
                int i103 = ((j) lVar.last()).a;
                int iMin = Math.min(i103, i12 - 1);
                int i104 = i103 + 1;
                if (i104 <= iMin) {
                    List arrayList6 = null;
                    while (true) {
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        int i105 = i104;
                        List list13 = arrayList6;
                        i30 = iMax5;
                        list2 = list12;
                        i31 = iMin;
                        j jVarL4 = AbstractC0841b.l(c2343x2, i105, j8, tVar4, jB, enumC1903a04, gVar2, hVar, c2343x2.f17648l.getLayoutDirection(), false, i44);
                        arrayList = list13;
                        arrayList.add(jVarL4);
                        if (i105 == i31) {
                            break;
                        }
                        i104 = i105 + 1;
                        arrayList6 = arrayList;
                        iMax5 = i30;
                        iMin = i31;
                        list12 = list2;
                    }
                } else {
                    i30 = iMax5;
                    list2 = list12;
                    i31 = iMin;
                    arrayList = null;
                }
                int size3 = list11.size();
                int i106 = 0;
                while (i106 < size3) {
                    List list14 = list11;
                    int iIntValue3 = ((Number) list11.get(i106)).intValue();
                    int i107 = size3;
                    if (i31 + 1 > iIntValue3 || iIntValue3 >= i12) {
                        i36 = i106;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        List list15 = arrayList;
                        i36 = i106;
                        list15.add(AbstractC0841b.l(c2343x2, iIntValue3, j8, tVar4, jB, enumC1903a04, gVar2, hVar, c2343x2.f17648l.getLayoutDirection(), false, i44));
                        arrayList = list15;
                    }
                    i106 = i36 + 1;
                    size3 = i107;
                    list11 = list14;
                }
                if (arrayList == null) {
                    arrayList = list7;
                }
                int size4 = arrayList.size();
                int iMax6 = i30;
                for (int i108 = 0; i108 < size4; i108++) {
                    iMax6 = Math.max(iMax6, ((j) arrayList.get(i108)).f18483j);
                }
                j jVar5 = jVar;
                int i109 = (kotlin.jvm.internal.l.a(jVar5, lVar.first()) && list2.isEmpty() && arrayList.isEmpty()) ? i14 : 0;
                int i110 = i25;
                int iV = q0.c.v(i110, j13);
                int iU = q0.c.u(iMax6, j13);
                int i111 = i16;
                int i112 = i110 < Math.min(iV, i111) ? i14 : 0;
                if (i112 != 0 && i26 != 0) {
                    throw new IllegalStateException(AbstractC0703b.g(i26, "non-zero pagesScrollOffset=").toString());
                }
                int i113 = i26;
                ArrayList arrayList7 = new ArrayList(arrayList.size() + list2.size() + lVar.a());
                if (i112 == 0) {
                    i32 = i109;
                    i33 = iV;
                    jVar2 = jVar5;
                    b0Var = b0Var2;
                    lVar2 = lVar;
                    i34 = i29;
                    int size5 = list2.size();
                    int i114 = i113;
                    int i115 = 0;
                    while (i115 < size5) {
                        int i116 = size5;
                        j jVar6 = (j) list2.get(i115);
                        i114 -= i45;
                        jVar6.b(i114, i33, iU);
                        arrayList7.add(jVar6);
                        i115++;
                        size5 = i116;
                    }
                    list3 = list2;
                    int iA = lVar2.a();
                    int i117 = i113;
                    for (int i118 = 0; i118 < iA; i118++) {
                        j jVar7 = (j) lVar2.get(i118);
                        jVar7.b(i117, i33, iU);
                        arrayList7.add(jVar7);
                        i117 += i45;
                    }
                    int size6 = arrayList.size();
                    for (int i119 = 0; i119 < size6; i119++) {
                        j jVar8 = (j) arrayList.get(i119);
                        jVar8.b(i117, i33, iU);
                        arrayList7.add(jVar8);
                        i117 += i45;
                    }
                } else {
                    if (!list2.isEmpty() || !arrayList.isEmpty()) {
                        throw new IllegalArgumentException("No extra pages");
                    }
                    int iA2 = lVar.a();
                    int[] iArr = new int[iA2];
                    for (int i120 = 0; i120 < iA2; i120++) {
                        iArr[i120] = i44;
                    }
                    int[] iArr2 = new int[iA2];
                    for (int i121 = 0; i121 < iA2; i121++) {
                        iArr2[i121] = 0;
                    }
                    i34 = i29;
                    i32 = i109;
                    jVar2 = jVar5;
                    i33 = iV;
                    b0Var = b0Var2;
                    new C2127f(b0Var2.q0(i34), false, null).b(c2343x2, i33, iArr, T0.k.f8844k, iArr2);
                    k4.g gVarJ0 = P3.m.j0(iArr2);
                    int i122 = gVarJ0.f12672k;
                    int i123 = gVarJ0.f12673l;
                    int i124 = gVarJ0.f12674m;
                    if ((i124 > 0 && i122 <= i123) || (i124 < 0 && i123 <= i122)) {
                        while (true) {
                            int i125 = iArr2[i122];
                            lVar2 = lVar;
                            int i126 = i124;
                            j jVar9 = (j) lVar2.get(i122);
                            jVar9.b(i125, i33, iU);
                            arrayList7.add(jVar9);
                            if (i122 == i123) {
                                break;
                            }
                            i122 += i126;
                            lVar = lVar2;
                            i124 = i126;
                        }
                    } else {
                        lVar2 = lVar;
                    }
                    list3 = list2;
                }
                if (i32 != 0) {
                    arrayList2 = arrayList7;
                } else {
                    arrayList2 = new ArrayList(arrayList7.size());
                    int size7 = arrayList7.size();
                    int i127 = 0;
                    while (i127 < size7) {
                        Object obj4 = arrayList7.get(i127);
                        int i128 = size7;
                        j jVar10 = (j) obj4;
                        int i129 = i33;
                        List list16 = list3;
                        if (jVar10.a >= ((j) lVar2.first()).a) {
                            if (jVar10.a <= ((j) lVar2.last()).a) {
                                arrayList2.add(obj4);
                            }
                        }
                        i127++;
                        size7 = i128;
                        list3 = list16;
                        i33 = i129;
                    }
                }
                int i130 = i33;
                if (list3.isEmpty()) {
                    arrayList3 = list7;
                } else {
                    arrayList3 = new ArrayList(arrayList7.size());
                    int size8 = arrayList7.size();
                    int i131 = 0;
                    while (i131 < size8) {
                        Object obj5 = arrayList7.get(i131);
                        int i132 = size8;
                        if (((j) obj5).a < ((j) lVar2.first()).a) {
                            arrayList3.add(obj5);
                        }
                        i131++;
                        size8 = i132;
                    }
                }
                if (arrayList.isEmpty()) {
                    list4 = list7;
                    list5 = arrayList3;
                } else {
                    ArrayList arrayList8 = new ArrayList(arrayList7.size());
                    int size9 = arrayList7.size();
                    int i133 = 0;
                    List list17 = arrayList3;
                    while (i133 < size9) {
                        Object obj6 = arrayList7.get(i133);
                        List list18 = list17;
                        if (((j) obj6).a > ((j) lVar2.last()).a) {
                            arrayList8.add(obj6);
                        }
                        i133++;
                        list17 = list18;
                    }
                    list4 = arrayList8;
                    list5 = list17;
                }
                List list19 = list5;
                if (arrayList2.isEmpty()) {
                    i35 = i14;
                    obj3 = null;
                } else {
                    Object obj7 = arrayList2.get(0);
                    int i134 = ((j) obj7).f18485l;
                    lVar4.getClass();
                    float f9 = -Math.abs(i134 - f8);
                    int iY = P3.r.y(arrayList2);
                    i35 = i14;
                    if (i35 <= iY) {
                        int i135 = i35;
                        while (true) {
                            Object obj8 = arrayList2.get(i135);
                            float f10 = -Math.abs(((j) obj8).f18485l - f8);
                            if (Float.compare(f9, f10) < 0) {
                                obj7 = obj8;
                                f9 = f10;
                            }
                            if (i135 == iY) {
                                break;
                            }
                            i135++;
                        }
                    }
                    obj3 = obj7;
                }
                j jVar11 = (j) obj3;
                lVar4.getClass();
                int i136 = i28;
                c2425d = c2425d4;
                vVar = new v(arrayList2, i44, i34, i41, i48, i65, jVar2, jVar11, i136 == 0 ? 0.0f : e3.c.j((0 - (jVar11 != null ? jVar11.f18485l : 0)) / i136, -0.5f, 0.5f), i24, (i17 < i12 || i110 > i111) ? i35 : 0, lVar4, b0Var.T(q0.c.v(i130 + i40, j14), q0.c.u(iU + i61, j14), zVar3, new C2238l(arrayList7, c2425d.f18398A, 1)), z8, list19, list4, cVar);
            }
            v vVar2 = vVar;
            c2425d.h(vVar2, false);
            return vVar2;
        } catch (Throwable th) {
            Y.s.f(hVarC, hVarD, kVarF);
            throw th;
        }
    }
}
