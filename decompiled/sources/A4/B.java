package A4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class B extends x {
    public final Object a;

    public B(Object obj) {
        kotlin.jvm.internal.l.f("recordComponent", obj);
        this.a = obj;
    }

    @Override // A4.x
    public final Member b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.a;
        kotlin.jvm.internal.l.f("recordComponent", obj);
        C0008a c0008a = AbstractC1420H.a;
        Method method = null;
        if (c0008a == null) {
            Class<?> cls = obj.getClass();
            try {
                c0008a = new C0008a(cls.getMethod("getType", new Class[0]), cls.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0008a = new C0008a(null, null);
            }
            AbstractC1420H.a = c0008a;
        }
        Method method2 = c0008a.f212b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, new Object[0]);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.reflect.Method", objInvoke);
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final N4.d f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.a;
        kotlin.jvm.internal.l.f("recordComponent", obj);
        C0008a c0008a = AbstractC1420H.a;
        Class cls = null;
        if (c0008a == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0008a = new C0008a(cls2.getMethod("getType", new Class[0]), cls2.getMethod("getAccessor", new Class[0]));
            } catch (NoSuchMethodException unused) {
                c0008a = new C0008a(null, null);
            }
            AbstractC1420H.a = c0008a;
        }
        Method method = c0008a.a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, new Object[0]);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<*>", objInvoke);
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new r(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
