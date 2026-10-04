package H;

import java.util.ArrayList;
import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public final class L implements InterfaceC2173H {
    public static final L a = new L();

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        Integer numValueOf = 0;
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((InterfaceC2172G) list.get(i7)).b(j7));
        }
        int size2 = arrayList.size();
        Integer numValueOf2 = numValueOf;
        for (int i8 = 0; i8 < size2; i8++) {
            numValueOf2 = Integer.valueOf(Math.max(numValueOf2.intValue(), ((w0.S) arrayList.get(i8)).f16840k));
        }
        int iIntValue = numValueOf2.intValue();
        int size3 = arrayList.size();
        for (int i9 = 0; i9 < size3; i9++) {
            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((w0.S) arrayList.get(i9)).f16841l));
        }
        return interfaceC2175J.T(iIntValue, numValueOf.intValue(), P3.z.f7780k, new K(0, arrayList));
    }
}
