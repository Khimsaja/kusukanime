package X;

import P3.E;
import P3.r;
import e4.InterfaceC0821a;
import f6.AbstractC0915m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class k implements j {
    public final kotlin.jvm.internal.m a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9690b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f9691c;

    /* JADX WARN: Multi-variable type inference failed */
    public k(Map map, e4.k kVar) {
        this.a = (kotlin.jvm.internal.m) kVar;
        this.f9690b = map != null ? E.t0(map) : new LinkedHashMap();
        this.f9691c = new LinkedHashMap();
    }

    public final Map a() {
        LinkedHashMap linkedHashMapT0 = E.t0(this.f9690b);
        for (Map.Entry entry : this.f9691c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((InterfaceC0821a) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!b(objInvoke)) {
                        throw new IllegalStateException(z1.c.r(objInvoke).toString());
                    }
                    linkedHashMapT0.put(str, r.f(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i7 = 0; i7 < size; i7++) {
                    Object objInvoke2 = ((InterfaceC0821a) list.get(i7)).invoke();
                    if (objInvoke2 != null && !b(objInvoke2)) {
                        throw new IllegalStateException(z1.c.r(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                linkedHashMapT0.put(str, arrayList);
            }
        }
        return linkedHashMapT0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // X.j
    public final boolean b(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // X.j
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f9690b;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    @Override // X.j
    public final i d(String str, InterfaceC0821a interfaceC0821a) {
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (!AbstractC0915m.B(str.charAt(i7))) {
                LinkedHashMap linkedHashMap = this.f9691c;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(interfaceC0821a);
                return new B2.l(this, str, interfaceC0821a);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
