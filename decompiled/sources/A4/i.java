package A4;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes.dex */
public final class i extends C implements N4.d {
    public final Type a;

    /* renamed from: b, reason: collision with root package name */
    public final C f224b;

    /* renamed from: c, reason: collision with root package name */
    public final P3.y f225c;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Type type) {
        C a;
        C a7;
        this.a = type;
        if (!(type instanceof GenericArrayType)) {
            if (type instanceof Class) {
                Class cls = (Class) type;
                if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    kotlin.jvm.internal.l.e("getComponentType(...)", componentType);
                    a = componentType.isPrimitive() ? new A(componentType) : ((componentType instanceof GenericArrayType) || componentType.isArray()) ? new i(componentType) : componentType instanceof WildcardType ? new F((WildcardType) componentType) : new r(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + type.getClass() + "): " + type);
        }
        Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        kotlin.jvm.internal.l.e("getGenericComponentType(...)", genericComponentType);
        boolean z7 = genericComponentType instanceof Class;
        if (z7) {
            Class cls2 = (Class) genericComponentType;
            if (cls2.isPrimitive()) {
                a7 = new A(cls2);
                this.f224b = a7;
                this.f225c = P3.y.f7779k;
            }
        }
        a = ((genericComponentType instanceof GenericArrayType) || (z7 && ((Class) genericComponentType).isArray())) ? new i(genericComponentType) : genericComponentType instanceof WildcardType ? new F((WildcardType) genericComponentType) : new r(genericComponentType);
        a7 = a;
        this.f224b = a7;
        this.f225c = P3.y.f7779k;
    }

    @Override // A4.C
    public final Type b() {
        return this.a;
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        return this.f225c;
    }
}
