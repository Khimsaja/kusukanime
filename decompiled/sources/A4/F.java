package A4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class F extends C implements N4.d {
    public final WildcardType a;

    public F(WildcardType wildcardType) {
        this.a = wildcardType;
    }

    @Override // A4.C
    public final Type b() {
        return this.a;
    }

    public final C c() {
        WildcardType wildcardType = this.a;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + wildcardType);
        }
        if (lowerBounds.length == 1) {
            Object objR0 = P3.m.r0(lowerBounds);
            kotlin.jvm.internal.l.e("single(...)", objR0);
            Type type = (Type) objR0;
            boolean z7 = type instanceof Class;
            if (z7) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new A(cls);
                }
            }
            return ((type instanceof GenericArrayType) || (z7 && ((Class) type).isArray())) ? new i(type) : type instanceof WildcardType ? new F((WildcardType) type) : new r(type);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        Type type2 = (Type) P3.m.r0(upperBounds);
        if (kotlin.jvm.internal.l.a(type2, Object.class)) {
            return null;
        }
        kotlin.jvm.internal.l.c(type2);
        boolean z8 = type2 instanceof Class;
        if (z8) {
            Class cls2 = (Class) type2;
            if (cls2.isPrimitive()) {
                return new A(cls2);
            }
        }
        return ((type2 instanceof GenericArrayType) || (z8 && ((Class) type2).isArray())) ? new i(type2) : type2 instanceof WildcardType ? new F((WildcardType) type2) : new r(type2);
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        return P3.y.f7779k;
    }
}
