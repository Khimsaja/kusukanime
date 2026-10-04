package G3;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class C {
    public static final C0181a a = new C0181a(5);

    /* renamed from: b, reason: collision with root package name */
    public static final z f2777b = new z(1);

    /* renamed from: c, reason: collision with root package name */
    public static final z f2778c = new z(2);

    /* renamed from: d, reason: collision with root package name */
    public static final z f2779d = new z(3);

    /* renamed from: e, reason: collision with root package name */
    public static final z f2780e = new z(4);

    /* renamed from: f, reason: collision with root package name */
    public static final z f2781f = new z(5);

    /* renamed from: g, reason: collision with root package name */
    public static final z f2782g = new z(6);

    /* renamed from: h, reason: collision with root package name */
    public static final z f2783h = new z(7);

    /* renamed from: i, reason: collision with root package name */
    public static final z f2784i = new z(8);

    /* renamed from: j, reason: collision with root package name */
    public static final z f2785j = new z(0);

    public static Type a(Type type) {
        if (!Collection.class.isAssignableFrom(Collection.class)) {
            throw new IllegalArgumentException();
        }
        Type typeG = H3.e.g(type, Collection.class, H3.e.d(type, Collection.class, Collection.class), new LinkedHashSet());
        if (typeG instanceof WildcardType) {
            typeG = ((WildcardType) typeG).getUpperBounds()[0];
        }
        return typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments()[0] : Object.class;
    }

    public static boolean b(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? b(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return b(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof H3.c ? ((H3.c) parameterizedType).f3678c : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof H3.c ? ((H3.c) parameterizedType2).f3678c : parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return b(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return b(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    public static String c(int i7, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder("$");
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = iArr[i8];
            if (i9 == 1 || i9 == 2) {
                sb.append('[');
                sb.append(iArr2[i8]);
                sb.append(']');
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                sb.append('.');
                String str = strArr[i8];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public static Class d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static int f(m mVar, String str, int i7, int i8) {
        int iV = mVar.v();
        if (iV >= i7 && iV <= i8) {
            return iV;
        }
        throw new D6.r("Expected " + str + " but was " + iV + " at path " + mVar.j());
    }

    public abstract Object e();
}
