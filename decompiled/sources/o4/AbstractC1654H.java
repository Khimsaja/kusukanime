package o4;

import A4.AbstractC0011d;
import f1.AbstractC0871d;
import io.ktor.http.ContentDisposition;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.InterfaceC1404d;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2508m;

/* renamed from: o4.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1654H implements InterfaceC1404d {

    /* renamed from: k, reason: collision with root package name */
    public static final C2508m f13637k = new C2508m("<v#(\\d+)>");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    public static void e(ArrayList arrayList, ArrayList arrayList2, boolean z7) {
        Class cls;
        cls = kotlin.jvm.internal.f.class;
        boolean zA = kotlin.jvm.internal.l.a(P3.q.B0(arrayList2), cls);
        ArrayList arrayListSubList = arrayList2;
        if (zA) {
            arrayListSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(arrayListSubList);
        int size = (arrayListSubList.size() + 31) / 32;
        for (int i7 = 0; i7 < size; i7++) {
            Class cls2 = Integer.TYPE;
            kotlin.jvm.internal.l.e("TYPE", cls2);
            arrayList.add(cls2);
        }
        arrayList.add(z7 ? kotlin.jvm.internal.f.class : Object.class);
    }

    public static Method u(Class cls, String str, Class[] clsArr, Class cls2, boolean z7) throws NoSuchMethodException, SecurityException {
        Class clsT0;
        Method methodU;
        if (z7) {
            clsArr[0] = cls;
        }
        Method methodY = y(cls, str, clsArr, cls2);
        if (methodY != null) {
            return methodY;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodU = u(superclass, str, clsArr, cls2, z7)) != null) {
            return methodU;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.l.e("getInterfaces(...)", interfaces);
        for (Class<?> cls3 : interfaces) {
            kotlin.jvm.internal.l.c(cls3);
            Method methodU2 = u(cls3, str, clsArr, cls2, z7);
            if (methodU2 != null) {
                return methodU2;
            }
            if (z7 && (clsT0 = AbstractC0871d.t0(AbstractC0011d.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodY2 = y(clsT0, str, clsArr, cls2);
                if (methodY2 != null) {
                    return methodY2;
                }
            }
        }
        return null;
    }

    public static Constructor x(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method y(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.l.a(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            kotlin.jvm.internal.l.e("getDeclaredMethods(...)", declaredMethods);
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.l.a(method.getName(), str) && kotlin.jvm.internal.l.a(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method f(String str, String str2, boolean z7) {
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("desc", str2);
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z7) {
            arrayList.add(d());
        }
        n5.P pV = v(str2, true);
        e(arrayList, (ArrayList) pV.f13378l, false);
        Class clsS = s();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) pV.f13379m;
        kotlin.jvm.internal.l.c(cls);
        return u(clsS, strConcat, clsArr, cls, z7);
    }

    public final Method g(String str, String str2) {
        Method methodU;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        kotlin.jvm.internal.l.f("desc", str2);
        if (str.equals("<init>")) {
            return null;
        }
        n5.P pV = v(str2, true);
        Class[] clsArr = (Class[]) ((ArrayList) pV.f13378l).toArray(new Class[0]);
        Class cls = (Class) pV.f13379m;
        kotlin.jvm.internal.l.c(cls);
        Method methodU2 = u(s(), str, clsArr, cls, false);
        if (methodU2 != null) {
            return methodU2;
        }
        if (!s().isInterface() || (methodU = u(Object.class, str, clsArr, cls, false)) == null) {
            return null;
        }
        return methodU;
    }

    public abstract Collection h();

    public abstract Collection p(W4.e eVar);

    public abstract u4.K q(int i7);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List r(g5.o r9, o4.EnumC1652F r10) {
        /*
            r8 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.l.f(r0, r9)
            o4.G r0 = new o4.G
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = f1.AbstractC0871d.Z(r9, r1, r2)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L1b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r9.next()
            u4.k r3 = (u4.InterfaceC2105k) r3
            boolean r4 = r3 instanceof u4.InterfaceC2097c
            if (r4 == 0) goto L56
            r4 = r3
            u4.c r4 = (u4.InterfaceC2097c) r4
            H4.o r5 = r4.getVisibility()
            H4.o r6 = u4.AbstractC2108n.f16325h
            boolean r5 = kotlin.jvm.internal.l.a(r5, r6)
            if (r5 != 0) goto L56
            int r4 = r4.c()
            r5 = 2
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L45
            r4 = r7
            goto L46
        L45:
            r4 = r6
        L46:
            o4.F r5 = o4.EnumC1652F.f13633k
            if (r10 != r5) goto L4b
            r6 = r7
        L4b:
            if (r4 != r6) goto L56
            O3.C r4 = O3.C.a
            java.lang.Object r3 = r3.u(r0, r4)
            o4.t r3 = (o4.AbstractC1694t) r3
            goto L57
        L56:
            r3 = r1
        L57:
            if (r3 == 0) goto L1b
            r2.add(r3)
            goto L1b
        L5d:
            java.util.List r9 = P3.q.S0(r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.AbstractC1654H.r(g5.o, o4.F):java.util.List");
    }

    public Class s() {
        Class clsD = d();
        List list = AbstractC0011d.a;
        kotlin.jvm.internal.l.f("<this>", clsD);
        Class cls = (Class) AbstractC0011d.f220c.get(clsD);
        return cls == null ? d() : cls;
    }

    public abstract Collection t(W4.e eVar);

    public final n5.P v(String str, boolean z7) {
        int iD0;
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        while (str.charAt(i7) != ')') {
            int i8 = i7;
            while (str.charAt(i8) == '[') {
                i8++;
            }
            char cCharAt = str.charAt(i8);
            if (AbstractC2510o.X("VZCBSIFJD", cCharAt)) {
                iD0 = i8 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new H5.C("Unknown type prefix in the method signature: ".concat(str));
                }
                iD0 = AbstractC2510o.d0(str, ';', i7, 4) + 1;
            }
            arrayList.add(w(str, i7, iD0));
            i7 = iD0;
        }
        return new n5.P(1, arrayList, z7 ? w(str, i7 + 1, str.length()) : null);
    }

    public final Class w(String str, int i7, int i8) throws ClassNotFoundException {
        char cCharAt = str.charAt(i7);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = AbstractC0011d.d(d());
            String strSubstring = str.substring(i7 + 1, i8 - 1);
            kotlin.jvm.internal.l.e("substring(...)", strSubstring);
            Class<?> clsLoadClass = classLoaderD.loadClass(AbstractC2517v.Q(strSubstring, '/', '.'));
            kotlin.jvm.internal.l.e("loadClass(...)", clsLoadClass);
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            kotlin.jvm.internal.l.e("TYPE", cls);
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsW = w(str, i7 + 1, i8);
            W4.c cVar = F0.a;
            kotlin.jvm.internal.l.f("<this>", clsW);
            return Array.newInstance((Class<?>) clsW, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new H5.C("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
