package O4;

import P3.F;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {
    public final LinkedHashMap a;

    public t(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final t a() {
        LinkedHashMap linkedHashMap = this.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(F.I(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            e eVar = (e) entry.getValue();
            linkedHashMap2.put(key, new e(eVar.a, eVar.f7555b, eVar.f7556c, true));
        }
        return new t(linkedHashMap2);
    }
}
