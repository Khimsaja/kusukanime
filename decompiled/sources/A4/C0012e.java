package A4;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: A4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012e extends t {
    public final Annotation a;

    public C0012e(Annotation annotation) {
        kotlin.jvm.internal.l.f("annotation", annotation);
        this.a = annotation;
    }

    public final ArrayList b() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.a;
        Method[] declaredMethods = n6.m.F(n6.m.B(annotation)).getDeclaredMethods();
        kotlin.jvm.internal.l.e("getDeclaredMethods(...)", declaredMethods);
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, new Object[0]);
            kotlin.jvm.internal.l.e("invoke(...)", objInvoke);
            W4.e eVarE = W4.e.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC0011d.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new u(eVarE, (Enum) objInvoke) : objInvoke instanceof Annotation ? new g(eVarE, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new h(eVarE, (Object[]) objInvoke) : objInvoke instanceof Class ? new q(eVarE, (Class) objInvoke) : new w(eVarE, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0012e) {
            return this.a == ((C0012e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    public final String toString() {
        return C0012e.class.getName() + ": " + this.a;
    }
}
