package P3;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class E extends F {
    public static Object m0(Object obj, Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static Map n0(O3.l... lVarArr) {
        if (lVarArr.length <= 0) {
            return z.f7780k;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(lVarArr.length));
        p0(linkedHashMap, lVarArr);
        return linkedHashMap;
    }

    public static LinkedHashMap o0(Map map, Map map2) {
        kotlin.jvm.internal.l.f("<this>", map);
        kotlin.jvm.internal.l.f("map", map2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static void p0(AbstractMap abstractMap, O3.l[] lVarArr) {
        for (O3.l lVar : lVarArr) {
            abstractMap.put(lVar.f7528k, lVar.f7529l);
        }
    }

    public static List q0(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        int size = map.size();
        y yVar = y.f7779k;
        if (size == 0) {
            return yVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return yVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return r.H(new O3.l(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new O3.l(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new O3.l(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map r0(List list) {
        int size = list.size();
        if (size == 0) {
            return z.f7780k;
        }
        if (size == 1) {
            return F.J((O3.l) list.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(F.I(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            O3.l lVar = (O3.l) it.next();
            linkedHashMap.put(lVar.f7528k, lVar.f7529l);
        }
        return linkedHashMap;
    }

    public static Map s0(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        int size = map.size();
        return size != 0 ? size != 1 ? t0(map) : F.f0(map) : z.f7780k;
    }

    public static LinkedHashMap t0(Map map) {
        kotlin.jvm.internal.l.f("<this>", map);
        return new LinkedHashMap(map);
    }
}
