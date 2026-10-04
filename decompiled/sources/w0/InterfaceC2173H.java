package w0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: w0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2173H {
    default int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = 2;
            arrayList.add(new C2193k((InterfaceC2172G) list.get(i8), i9, i9, 0));
        }
        return b(new C2199q(interfaceC2197o, interfaceC2197o.getLayoutDirection()), arrayList, q0.c.b(i7, 0, 13)).e();
    }

    InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7);

    default int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C2193k((InterfaceC2172G) list.get(i8), 2, 1, 0));
        }
        return b(new C2199q(interfaceC2197o, interfaceC2197o.getLayoutDirection()), arrayList, q0.c.b(0, i7, 7)).l();
    }

    default int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            int i9 = 1;
            arrayList.add(new C2193k((InterfaceC2172G) list.get(i8), i9, i9, 0));
        }
        return b(new C2199q(interfaceC2197o, interfaceC2197o.getLayoutDirection()), arrayList, q0.c.b(0, i7, 7)).l();
    }

    default int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new C2193k((InterfaceC2172G) list.get(i8), 1, 2, 0));
        }
        return b(new C2199q(interfaceC2197o, interfaceC2197o.getLayoutDirection()), arrayList, q0.c.b(i7, 0, 13)).e();
    }
}
