package kotlin.jvm.internal;

import P3.E;
import e4.InterfaceC0821a;
import e4.InterfaceC0822b;
import e4.InterfaceC0823c;
import e4.InterfaceC0824d;
import e4.InterfaceC0825e;
import e4.InterfaceC0826f;
import e4.InterfaceC0827g;
import e4.InterfaceC0828h;
import e4.InterfaceC0829i;
import e4.InterfaceC0830j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.InterfaceC1425d;
import o4.InterfaceC1678f;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class e implements InterfaceC1425d, InterfaceC1404d {

    /* renamed from: l, reason: collision with root package name */
    public static final Map f12712l;

    /* renamed from: k, reason: collision with root package name */
    public final Class f12713k;

    static {
        List listI = P3.r.I(InterfaceC0821a.class, e4.k.class, e4.n.class, e4.o.class, e4.p.class, e4.q.class, e4.r.class, e4.s.class, e4.t.class, e4.u.class, InterfaceC0822b.class, InterfaceC0823c.class, InterfaceC1678f.class, InterfaceC0824d.class, InterfaceC0825e.class, InterfaceC0826f.class, InterfaceC0827g.class, InterfaceC0828h.class, InterfaceC0829i.class, InterfaceC0830j.class, e4.l.class, e4.m.class, InterfaceC1678f.class);
        ArrayList arrayList = new ArrayList(P3.r.p(listI, 10));
        int i7 = 0;
        for (Object obj : listI) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            arrayList.add(new O3.l((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f12712l = E.r0(arrayList);
    }

    public e(Class cls) {
        l.f("jClass", cls);
        this.f12713k = cls;
    }

    public static void e() {
        throw new H5.C();
    }

    @Override // kotlin.jvm.internal.InterfaceC1404d
    public final Class d() {
        return this.f12713k;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && n6.m.G(this).equals(n6.m.G((InterfaceC1425d) obj));
    }

    @Override // l4.InterfaceC1423b
    public final List getAnnotations() {
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final List getTypeParameters() {
        e();
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final int hashCode() {
        return n6.m.G(this).hashCode();
    }

    @Override // l4.InterfaceC1425d
    public final boolean i() {
        e();
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final boolean isAbstract() {
        e();
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final boolean j() {
        e();
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final String k() {
        String strF;
        Class cls = this.f12713k;
        l.f("jClass", cls);
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strF2 = B.f(cls.getName());
            return strF2 == null ? cls.getCanonicalName() : strF2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strF = B.f(componentType.getName())) != null) {
            strConcat = strF.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // l4.InterfaceC1425d
    public final boolean l() {
        e();
        throw null;
    }

    @Override // l4.InterfaceC1425d
    public final boolean m(Object obj) {
        Class clsG = this.f12713k;
        l.f("jClass", clsG);
        Map map = f12712l;
        l.d("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(clsG);
        if (num != null) {
            return B.g(num.intValue(), obj);
        }
        if (clsG.isPrimitive()) {
            clsG = n6.m.G(n6.m.I(clsG));
        }
        return clsG.isInstance(obj);
    }

    @Override // l4.InterfaceC1425d
    public final String n() {
        String strI;
        Class cls = this.f12713k;
        l.f("jClass", cls);
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strI2 = B.i(cls.getName());
                return strI2 == null ? cls.getSimpleName() : strI2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strI = B.i(componentType.getName())) != null) {
                strConcat = strI.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC2510o.B0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return AbstractC2510o.A0('$', simpleName, simpleName);
        }
        return AbstractC2510o.B0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    @Override // l4.InterfaceC1425d
    public final Object o() {
        e();
        throw null;
    }

    public final String toString() {
        return this.f12713k.toString() + " (Kotlin reflection is not available)";
    }
}
