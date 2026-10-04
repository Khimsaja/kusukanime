package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0677d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0677d f10729c = new C0677d();
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10730b = new HashMap();

    public static void b(HashMap map, C0676c c0676c, EnumC0688o enumC0688o, Class cls) {
        EnumC0688o enumC0688o2 = (EnumC0688o) map.get(c0676c);
        if (enumC0688o2 == null || enumC0688o == enumC0688o2) {
            if (enumC0688o2 == null) {
                map.put(c0676c, enumC0688o);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0676c.f10728b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0688o2 + ", new value " + enumC0688o);
    }

    public final C0675b a(Class cls, Method[] methodArr) throws SecurityException {
        int i7;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            C0675b c0675bA = (C0675b) map2.get(superclass);
            if (c0675bA == null) {
                c0675bA = a(superclass, null);
            }
            map.putAll(c0675bA.f10727b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0675b c0675bA2 = (C0675b) map2.get(cls2);
            if (c0675bA2 == null) {
                c0675bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0675bA2.f10727b.entrySet()) {
                b(map, (C0676c) entry.getKey(), (EnumC0688o) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            z zVar = (z) method.getAnnotation(z.class);
            if (zVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!InterfaceC0694v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                EnumC0688o enumC0688oValue = zVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0688o.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0688oValue != EnumC0688o.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0676c(method, i7), enumC0688oValue, cls);
                z7 = true;
            }
        }
        C0675b c0675b = new C0675b(map);
        map2.put(cls, c0675b);
        this.f10730b.put(cls, Boolean.valueOf(z7));
        return c0675b;
    }
}
