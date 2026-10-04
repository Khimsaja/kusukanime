package D;

import L.AbstractC0379i;
import f0.AbstractC0851d;
import f0.C0866s;
import io.ktor.util.GzipHeaderFlags;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import m.C1501v;
import s.EnumC1903a0;
import v.AbstractC2130i;
import v.C2143w;
import w0.AbstractC2182Q;
import w0.InterfaceC2175J;
import w0.InterfaceC2186d;

/* loaded from: classes.dex */
public final class Y extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f1115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1117o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1118p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Object obj, Object obj2, int i7, Serializable serializable, int i8) {
        super(1);
        this.f1114l = i8;
        this.f1115m = obj;
        this.f1118p = obj2;
        this.f1117o = i7;
        this.f1116n = serializable;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f1114l) {
            case 0:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                Z z7 = (Z) this.f1118p;
                int i7 = z7.f1119b;
                N0 n02 = (N0) z7.f1121d.invoke();
                H0.F f5 = n02 != null ? n02.a : null;
                InterfaceC2175J interfaceC2175J = (InterfaceC2175J) this.f1115m;
                boolean z8 = interfaceC2175J.getLayoutDirection() == T0.k.f8845l;
                w0.S s7 = (w0.S) this.f1116n;
                g0.d dVarH = AbstractC0047d0.h(interfaceC2175J, i7, z7.f1120c, f5, z8, s7.f16840k);
                EnumC1903a0 enumC1903a0 = EnumC1903a0.f15260l;
                int i8 = s7.f16840k;
                J0 j02 = z7.a;
                j02.a(enumC1903a0, dVarH, this.f1117o, i8);
                AbstractC2182Q.f(abstractC2182Q, s7, Math.round(-j02.a.f()), 0);
                return O3.C.a;
            case 1:
                AbstractC2182Q abstractC2182Q2 = (AbstractC2182Q) obj;
                Q0 q02 = (Q0) this.f1118p;
                int i9 = q02.f1098b;
                N0 n03 = (N0) q02.f1100d.invoke();
                H0.F f7 = n03 != null ? n03.a : null;
                w0.S s8 = (w0.S) this.f1116n;
                g0.d dVarH2 = AbstractC0047d0.h((InterfaceC2175J) this.f1115m, i9, q02.f1099c, f7, false, s8.f16840k);
                EnumC1903a0 enumC1903a02 = EnumC1903a0.f15259k;
                int i10 = s8.f16841l;
                J0 j03 = q02.a;
                j03.a(enumC1903a02, dVarH2, this.f1117o, i10);
                AbstractC2182Q.f(abstractC2182Q2, s8, 0, Math.round(-j03.a.f()));
                return O3.C.a;
            case 2:
                AbstractC2182Q abstractC2182Q3 = (AbstractC2182Q) obj;
                ArrayList arrayList = (ArrayList) this.f1118p;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    List list = (List) arrayList.get(i11);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i12 = 0;
                    while (true) {
                        InterfaceC2175J interfaceC2175J2 = (InterfaceC2175J) this.f1115m;
                        if (i12 < size2) {
                            iArr[i12] = ((w0.S) list.get(i12)).f16840k + (i12 < P3.r.y(list) ? interfaceC2175J2.O(AbstractC0379i.f5599c) : 0);
                            i12++;
                        } else {
                            v.M m7 = AbstractC2130i.f16444b;
                            int[] iArr2 = new int[size2];
                            for (int i13 = 0; i13 < size2; i13++) {
                                iArr2[i13] = 0;
                            }
                            m7.b(interfaceC2175J2, this.f1117o, iArr, interfaceC2175J2.getLayoutDirection(), iArr2);
                            int size3 = list.size();
                            for (int i14 = 0; i14 < size3; i14++) {
                                AbstractC2182Q.d(abstractC2182Q3, (w0.S) list.get(i14), iArr2[i14], ((Number) ((ArrayList) this.f1116n).get(i11)).intValue());
                            }
                        }
                    }
                }
                return O3.C.a;
            case 3:
                if (obj == ((O.E) this.f1115m)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof Y.v) {
                    int i15 = ((W.b) this.f1118p).a - this.f1117o;
                    C1501v c1501v = (C1501v) this.f1116n;
                    int iC = c1501v.c(obj);
                    c1501v.f(Math.min(i15, iC >= 0 ? c1501v.f12930c[iC] : Integer.MAX_VALUE), obj);
                }
                return O3.C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                InterfaceC2186d interfaceC2186d = (InterfaceC2186d) obj;
                boolean zH = AbstractC0851d.H((C0866s) this.f1115m, (C0866s) this.f1118p, this.f1117o, (C0056i) this.f1116n);
                Boolean boolValueOf = Boolean.valueOf(zH);
                if (zH || !interfaceC2186d.a()) {
                    return boolValueOf;
                }
                return null;
            case 5:
                InterfaceC2186d interfaceC2186d2 = (InterfaceC2186d) obj;
                boolean zG = AbstractC0851d.G(this.f1117o, (C0056i) this.f1116n, (C0866s) this.f1115m, (g0.d) this.f1118p);
                Boolean boolValueOf2 = Boolean.valueOf(zG);
                if (zG || !interfaceC2186d2.a()) {
                    return boolValueOf2;
                }
                return null;
            default:
                AbstractC2182Q abstractC2182Q4 = (AbstractC2182Q) obj;
                w0.S[] sArr = (w0.S[]) this.f1115m;
                int length = sArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    w0.S s9 = sArr[i16];
                    int i18 = i17 + 1;
                    kotlin.jvm.internal.l.c(s9);
                    Object objH = s9.h();
                    v.d0 d0Var = objH instanceof v.d0 ? (v.d0) objH : null;
                    v.f0 f0Var = (v.f0) this.f1118p;
                    f0Var.getClass();
                    C2143w c2143w = d0Var != null ? d0Var.f16438c : null;
                    int i19 = this.f1117o;
                    AbstractC2182Q.d(abstractC2182Q4, s9, ((int[]) this.f1116n)[i17], c2143w != null ? c2143w.b(i19 - s9.f16841l, T0.k.f8844k) : f0Var.f16442b.a(0, i19 - s9.f16841l));
                    i16++;
                    i17 = i18;
                }
                return O3.C.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Object obj, Object obj2, Object obj3, int i7, int i8) {
        super(1);
        this.f1114l = i8;
        this.f1115m = obj;
        this.f1118p = obj2;
        this.f1116n = obj3;
        this.f1117o = i7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(ArrayList arrayList, InterfaceC2175J interfaceC2175J, int i7, ArrayList arrayList2) {
        super(1);
        this.f1114l = 2;
        float f5 = AbstractC0379i.a;
        this.f1118p = arrayList;
        this.f1115m = interfaceC2175J;
        this.f1117o = i7;
        this.f1116n = arrayList2;
    }
}
