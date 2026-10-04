package X0;

import D.L0;
import H.K;
import java.util.ArrayList;
import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.S;

/* loaded from: classes.dex */
public final class d implements InterfaceC2173H {

    /* renamed from: b, reason: collision with root package name */
    public static final d f9705b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f9706c = new d(1);
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        Object obj;
        int iMax;
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList.add(((InterfaceC2172G) list.get(i7)).b(j7));
                }
                int i8 = 1;
                S s7 = null;
                if (arrayList.isEmpty()) {
                    obj = null;
                } else {
                    obj = arrayList.get(0);
                    int i9 = ((S) obj).f16840k;
                    int iY = P3.r.y(arrayList);
                    if (1 <= iY) {
                        int i10 = 1;
                        while (true) {
                            Object obj2 = arrayList.get(i10);
                            int i11 = ((S) obj2).f16840k;
                            if (i9 < i11) {
                                obj = obj2;
                                i9 = i11;
                            }
                            if (i10 != iY) {
                                i10++;
                            }
                        }
                    }
                }
                S s8 = (S) obj;
                int iJ = s8 != null ? s8.f16840k : T0.a.j(j7);
                if (!arrayList.isEmpty()) {
                    ?? r2 = arrayList.get(0);
                    int i12 = ((S) r2).f16841l;
                    int iY2 = P3.r.y(arrayList);
                    boolean z7 = r2;
                    if (1 <= iY2) {
                        while (true) {
                            Object obj3 = arrayList.get(i8);
                            int i13 = ((S) obj3).f16841l;
                            r2 = z7;
                            if (i12 < i13) {
                                r2 = obj3;
                                i12 = i13;
                            }
                            if (i8 != iY2) {
                                i8++;
                                z7 = r2;
                            }
                        }
                    }
                    s7 = r2;
                }
                S s9 = s7;
                return interfaceC2175J.T(iJ, s9 != null ? s9.f16841l : T0.a.i(j7), P3.z.f7780k, new K(1, arrayList));
            default:
                int size2 = list.size();
                P3.z zVar = P3.z.f7780k;
                int i14 = 0;
                if (size2 == 0) {
                    return interfaceC2175J.T(0, 0, zVar, b.f9698q);
                }
                if (size2 == 1) {
                    S sB = ((InterfaceC2172G) list.get(0)).b(j7);
                    return interfaceC2175J.T(sB.f16840k, sB.f16841l, zVar, new L0(sB, 4));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    arrayList2.add(((InterfaceC2172G) list.get(i15)).b(j7));
                }
                int iY3 = P3.r.y(arrayList2);
                if (iY3 >= 0) {
                    int iMax2 = 0;
                    iMax = 0;
                    while (true) {
                        S s10 = (S) arrayList2.get(i14);
                        iMax2 = Math.max(iMax2, s10.f16840k);
                        iMax = Math.max(iMax, s10.f16841l);
                        if (i14 != iY3) {
                            i14++;
                        } else {
                            i14 = iMax2;
                        }
                    }
                } else {
                    iMax = 0;
                }
                return interfaceC2175J.T(i14, iMax, zVar, new K(2, arrayList2));
        }
    }
}
