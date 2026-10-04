package A4;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends x implements N4.e {
    public final Method a;

    public y(Method method) {
        kotlin.jvm.internal.l.f("member", method);
        this.a = method;
    }

    @Override // A4.x
    public final Member b() {
        return this.a;
    }

    public final C f() {
        Type genericReturnType = this.a.getGenericReturnType();
        kotlin.jvm.internal.l.e("getGenericReturnType(...)", genericReturnType);
        boolean z7 = genericReturnType instanceof Class;
        if (z7) {
            Class cls = (Class) genericReturnType;
            if (cls.isPrimitive()) {
                return new A(cls);
            }
        }
        return ((genericReturnType instanceof GenericArrayType) || (z7 && ((Class) genericReturnType).isArray())) ? new i(genericReturnType) : genericReturnType instanceof WildcardType ? new F((WildcardType) genericReturnType) : new r(genericReturnType);
    }

    public final List g() {
        Method method = this.a;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        kotlin.jvm.internal.l.e("getParameterAnnotations(...)", parameterAnnotations);
        return d(genericParameterTypes, parameterAnnotations, method.isVarArgs());
    }

    @Override // N4.e
    public final ArrayList getTypeParameters() {
        TypeVariable<Method>[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.l.e("getTypeParameters(...)", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Method> typeVariable : typeParameters) {
            arrayList.add(new D(typeVariable));
        }
        return arrayList;
    }
}
