package w0;

import D.L0;
import java.util.ArrayList;
import java.util.List;
import y0.AbstractC2347B;

/* loaded from: classes.dex */
public final class V extends AbstractC2347B {

    /* renamed from: b, reason: collision with root package name */
    public static final V f16849b = new V("Undefined intrinsics block and it is required");

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        boolean zIsEmpty = list.isEmpty();
        P3.z zVar = P3.z.f7780k;
        if (zIsEmpty) {
            return interfaceC2175J.T(T0.a.j(j7), T0.a.i(j7), zVar, T.f16846n);
        }
        if (list.size() == 1) {
            S sB = ((InterfaceC2172G) list.get(0)).b(j7);
            return interfaceC2175J.T(q0.c.v(sB.f16840k, j7), q0.c.u(sB.f16841l, j7), zVar, new L0(sB, 14));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((InterfaceC2172G) list.get(i7)).b(j7));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            S s7 = (S) arrayList.get(i8);
            iMax = Math.max(s7.f16840k, iMax);
            iMax2 = Math.max(s7.f16841l, iMax2);
        }
        return interfaceC2175J.T(q0.c.v(iMax, j7), q0.c.u(iMax2, j7), zVar, new H.K(4, arrayList));
    }
}
