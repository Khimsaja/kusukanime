package A4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class p extends t implements N4.b, N4.e {
    public final Class a;

    public p(Class cls) {
        kotlin.jvm.internal.l.f("klass", cls);
        this.a = cls;
    }

    @Override // N4.b
    public final C0012e a(W4.c cVar) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.l.f("fqName", cVar);
        Class cls = this.a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return n6.m.x(declaredAnnotations, cVar);
    }

    public final List b() {
        Field[] declaredFields = this.a.getDeclaredFields();
        kotlin.jvm.internal.l.e("getDeclaredFields(...)", declaredFields);
        return y5.k.W(y5.k.U(new y5.f(P3.m.Q(declaredFields), false, m.f230k), n.f231k));
    }

    public final W4.c c() {
        return AbstractC0011d.a(this.a).a();
    }

    public final List d() throws SecurityException {
        Method[] declaredMethods = this.a.getDeclaredMethods();
        kotlin.jvm.internal.l.e("getDeclaredMethods(...)", declaredMethods);
        return y5.k.W(y5.k.U(new y5.f(P3.m.Q(declaredMethods), true, new j(0, this)), o.f232k));
    }

    public final W4.e e() {
        Class cls = this.a;
        if (!cls.isAnonymousClass()) {
            return W4.e.e(cls.getSimpleName());
        }
        String name = cls.getName();
        return W4.e.e(AbstractC2510o.D0(name, ".", name));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return kotlin.jvm.internal.l.a(this.a, ((p) obj).a);
        }
        return false;
    }

    public final ArrayList f() {
        Class cls = this.a;
        kotlin.jvm.internal.l.f("clazz", cls);
        Method method = (Method) n6.d.J().f113o;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(cls, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new B(obj));
        }
        return arrayList;
    }

    public final boolean g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Boolean bool;
        Class cls = this.a;
        kotlin.jvm.internal.l.f("clazz", cls);
        Method method = (Method) n6.d.J().f112n;
        if (method == null) {
            bool = null;
        } else {
            Object objInvoke = method.invoke(cls, new Object[0]);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Boolean", objInvoke);
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class cls = this.a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? P3.y.f7779k : n6.m.C(declaredAnnotations);
    }

    @Override // N4.e
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new D(typeVariable));
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return p.class.getName() + ": " + this.a;
    }
}
