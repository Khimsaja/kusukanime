package H4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {
    public static final LinkedHashMap a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f3733b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(W4.h.f9656x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(W4.h.f9657y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(W4.h.f9658z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        W4.c cVar = new W4.c("java.util.function.Function");
        b(new W4.b(cVar.b(), cVar.a.g()), a("java.util.function.UnaryOperator"));
        W4.c cVar2 = new W4.c("java.util.function.BiFunction");
        b(new W4.b(cVar2.b(), cVar2.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new O3.l(((W4.b) entry.getKey()).a(), ((W4.b) entry.getValue()).a()));
        }
        f3733b = P3.E.r0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            W4.c cVar = new W4.c(str);
            arrayList.add(new W4.b(cVar.b(), cVar.a.g()));
        }
        return arrayList;
    }

    public static void b(W4.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            a.put(next, bVar);
        }
    }
}
