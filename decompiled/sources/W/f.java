package W;

import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.C0519u;
import java.util.ArrayList;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class f {
    public static final e a = new e(0, new long[0], new Object[0]);

    public static final int a(int i7, int i8) {
        return i7 << (((i8 % 10) * 3) + 1);
    }

    public static final a b(int i7, O3.e eVar, C0510p c0510p) {
        Object objH = c0510p.H();
        if (objH == C0502l.a) {
            objH = new a(true, i7, eVar);
            c0510p.b0(objH);
        }
        a aVar = (a) objH;
        if (!l.a(aVar.f9502m, eVar)) {
            boolean z7 = aVar.f9502m == null;
            aVar.f9502m = eVar;
            if (!z7 && aVar.f9501l) {
                C0509o0 c0509o0 = aVar.f9503n;
                if (c0509o0 != null) {
                    C0519u c0519u = c0509o0.f7109b;
                    if (c0519u != null) {
                        c0519u.p(c0509o0, null);
                    }
                    aVar.f9503n = null;
                }
                ArrayList arrayList = aVar.f9504o;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        C0509o0 c0509o02 = (C0509o0) arrayList.get(i8);
                        C0519u c0519u2 = c0509o02.f7109b;
                        if (c0519u2 != null) {
                            c0519u2.p(c0509o02, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return aVar;
    }

    public static final boolean c(C0509o0 c0509o0, C0509o0 c0509o02) {
        if (c0509o0 == null) {
            return true;
        }
        if (c0509o0 instanceof C0509o0) {
            return !c0509o0.b() || c0509o0.equals(c0509o02) || l.a(c0509o0.f7110c, c0509o02.f7110c);
        }
        return false;
    }
}
