package z0;

import android.R;
import j1.C1302c;
import j1.C1303d;
import java.util.LinkedHashMap;

/* renamed from: z0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2481z {
    public static final void a(C1303d c1303d, F0.n nVar) {
        if (O.h(nVar)) {
            F0.t tVar = F0.h.f2092w;
            LinkedHashMap linkedHashMap = nVar.f2104d.f2096k;
            Object obj = linkedHashMap.get(tVar);
            if (obj == null) {
                obj = null;
            }
            F0.a aVar = (F0.a) obj;
            if (aVar != null) {
                c1303d.b(new C1302c(null, R.id.accessibilityActionPageUp, aVar.a, null));
            }
            Object obj2 = linkedHashMap.get(F0.h.f2094y);
            if (obj2 == null) {
                obj2 = null;
            }
            F0.a aVar2 = (F0.a) obj2;
            if (aVar2 != null) {
                c1303d.b(new C1302c(null, R.id.accessibilityActionPageDown, aVar2.a, null));
            }
            Object obj3 = linkedHashMap.get(F0.h.f2093x);
            if (obj3 == null) {
                obj3 = null;
            }
            F0.a aVar3 = (F0.a) obj3;
            if (aVar3 != null) {
                c1303d.b(new C1302c(null, R.id.accessibilityActionPageLeft, aVar3.a, null));
            }
            Object obj4 = linkedHashMap.get(F0.h.f2095z);
            if (obj4 == null) {
                obj4 = null;
            }
            F0.a aVar4 = (F0.a) obj4;
            if (aVar4 != null) {
                c1303d.b(new C1302c(null, R.id.accessibilityActionPageRight, aVar4.a, null));
            }
        }
    }
}
