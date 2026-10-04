package D6;

import H5.C0270k;
import b1.AbstractC0703b;
import com.kusukanime.data.KusuApi;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class c0 {
    public static final Type[] a = new Type[0];

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1747b = true;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f1748c;

    public static final Object b(InterfaceC0111e interfaceC0111e, S3.c cVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        c0270k.t(new C0128w(interfaceC0111e, 0));
        interfaceC0111e.m(new C0129x(c0270k, 0));
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    public static final Object c(InterfaceC0111e interfaceC0111e, S3.c cVar) {
        C0270k c0270k = new C0270k(1, P3.r.E(cVar));
        c0270k.r();
        c0270k.t(new C0128w(interfaceC0111e, 1));
        interfaceC0111e.m(new C0129x(c0270k, 1));
        Object objQ = c0270k.q();
        T3.a aVar = T3.a.f9048k;
        return objQ;
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean e(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i7 = 0; i7 < length; i7++) {
                Class<?> cls3 = interfaces[i7];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i7];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i7], interfaces[i7], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i7, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i7 >= 0 && i7 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i7];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Index ", " not in range [0,");
        sbP.append(actualTypeArguments.length);
        sbP.append(") for ");
        sbP.append(parameterizedType);
        throw new IllegalArgumentException(sbP.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return q(type, cls, f(type, cls, Map.class));
        }
        throw new IllegalArgumentException();
    }

    public static boolean j(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static Object k(Object obj, Method method, Object[] objArr) throws NoSuchMethodException, SecurityException {
        Constructor declaredConstructor = f1748c;
        if (declaredConstructor == null) {
            declaredConstructor = B5.a.g().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f1748c = declaredConstructor;
        }
        return B5.a.l(declaredConstructor.newInstance(KusuApi.class, -1)).unreflectSpecial(method, KusuApi.class).bindTo(obj).invokeWithArguments(objArr);
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(Type type) {
        return f1747b && type == O3.C.class;
    }

    public static IllegalArgumentException n(Method method, Exception exc, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static IllegalArgumentException o(Method method, int i7, String str, Object... objArr) {
        return n(method, null, str + " (" + O.f1682b.d(method, i7) + ")", objArr);
    }

    public static IllegalArgumentException p(Method method, Exception exc, int i7, String str, Object... objArr) {
        return n(method, exc, str + " (" + O.f1682b.d(method, i7) + ")", objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type q(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.c0.q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(java.lang.Throwable r4, S3.c r5) {
        /*
            boolean r0 = r5 instanceof D6.C0130y
            if (r0 == 0) goto L13
            r0 = r5
            D6.y r0 = (D6.C0130y) r0
            int r1 = r0.f1772l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1772l = r1
            goto L18
        L13:
            D6.y r0 = new D6.y
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1771k
            T3.a r1 = T3.a.f9048k
            int r1 = r0.f1772l
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 == r2) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            P3.r.Y(r5)
            D6.r r4 = new D6.r
            r4.<init>()
            throw r4
        L34:
            P3.r.Y(r5)
            r0.f1772l = r2
            O5.e r5 = H5.M.a
            S3.h r1 = r0.getContext()
            D6.z r2 = new D6.z
            r3 = 0
            r2.<init>(r3, r0, r4)
            r5.W(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.c0.r(java.lang.Throwable, S3.c):void");
    }

    public static void s(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String t(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public abstract void a(S s7, Object obj);
}
