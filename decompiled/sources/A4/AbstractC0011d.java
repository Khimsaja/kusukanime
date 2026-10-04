package A4;

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
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.InterfaceC1425d;
import o4.InterfaceC1678f;
import z5.AbstractC2517v;

/* renamed from: A4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0011d {
    public static final List a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f219b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f220c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f221d;

    static {
        int i7 = 0;
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        List<InterfaceC1425d> listI = P3.r.I(zVar.b(Boolean.TYPE), zVar.b(Byte.TYPE), zVar.b(Character.TYPE), zVar.b(Double.TYPE), zVar.b(Float.TYPE), zVar.b(Integer.TYPE), zVar.b(Long.TYPE), zVar.b(Short.TYPE));
        a = listI;
        ArrayList arrayList = new ArrayList(P3.r.p(listI, 10));
        for (InterfaceC1425d interfaceC1425d : listI) {
            arrayList.add(new O3.l(n6.m.G(interfaceC1425d), n6.m.H(interfaceC1425d)));
        }
        f219b = P3.E.r0(arrayList);
        List<InterfaceC1425d> list = a;
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        for (InterfaceC1425d interfaceC1425d2 : list) {
            arrayList2.add(new O3.l(n6.m.H(interfaceC1425d2), n6.m.G(interfaceC1425d2)));
        }
        f220c = P3.E.r0(arrayList2);
        List listI2 = P3.r.I(InterfaceC0821a.class, e4.k.class, e4.n.class, e4.o.class, e4.p.class, e4.q.class, e4.r.class, e4.s.class, e4.t.class, e4.u.class, InterfaceC0822b.class, InterfaceC0823c.class, InterfaceC1678f.class, InterfaceC0824d.class, InterfaceC0825e.class, InterfaceC0826f.class, InterfaceC0827g.class, InterfaceC0828h.class, InterfaceC0829i.class, InterfaceC0830j.class, e4.l.class, e4.m.class, InterfaceC1678f.class);
        ArrayList arrayList3 = new ArrayList(P3.r.p(listI2, 10));
        for (Object obj : listI2) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                P3.r.X();
                throw null;
            }
            arrayList3.add(new O3.l((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f221d = P3.E.r0(arrayList3);
    }

    public static final W4.b a(Class cls) {
        kotlin.jvm.internal.l.f("<this>", cls);
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            W4.c cVar = new W4.c(cls.getName());
            return new W4.b(cVar.b(), P3.F.g0(cVar.a.g()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return a(declaringClass).d(W4.e.e(cls.getSimpleName()));
        }
        W4.c cVar2 = new W4.c(cls.getName());
        return new W4.b(cVar2.b(), cVar2.a.g());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final String b(Class cls) {
        kotlin.jvm.internal.l.f("<this>", cls);
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return AbstractC2517v.Q(cls.getName(), '.', '/');
            }
            return "L" + AbstractC2517v.Q(cls.getName(), '.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException("Unsupported primitive type: " + cls);
    }

    public static final List c(Type type) {
        kotlin.jvm.internal.l.f("<this>", type);
        if (!(type instanceof ParameterizedType)) {
            return P3.y.f7779k;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return y5.k.W(new y5.g(y5.k.S(C0010c.f214l, type), C0010c.f215m, y5.m.f18389k));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.l.e("getActualTypeArguments(...)", actualTypeArguments);
        return P3.m.u0(actualTypeArguments);
    }

    public static final ClassLoader d(Class cls) {
        kotlin.jvm.internal.l.f("<this>", cls);
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.l.e("getSystemClassLoader(...)", systemClassLoader);
        return systemClassLoader;
    }
}
