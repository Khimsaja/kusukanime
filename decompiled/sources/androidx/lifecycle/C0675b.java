package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0675b {
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10727b;

    public C0675b(HashMap map) {
        this.f10727b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0688o enumC0688o = (EnumC0688o) entry.getValue();
            List arrayList = (List) this.a.get(enumC0688o);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(enumC0688o, arrayList);
            }
            arrayList.add((C0676c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0694v interfaceC0694v, EnumC0688o enumC0688o, InterfaceC0693u interfaceC0693u) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0676c c0676c = (C0676c) list.get(size);
                c0676c.getClass();
                try {
                    int i7 = c0676c.a;
                    Method method = c0676c.f10728b;
                    if (i7 == 0) {
                        method.invoke(interfaceC0693u, new Object[0]);
                    } else if (i7 == 1) {
                        method.invoke(interfaceC0693u, interfaceC0694v);
                    } else if (i7 == 2) {
                        method.invoke(interfaceC0693u, interfaceC0694v, enumC0688o);
                    }
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                } catch (InvocationTargetException e8) {
                    throw new RuntimeException("Failed to call observer method", e8.getCause());
                }
            }
        }
    }
}
