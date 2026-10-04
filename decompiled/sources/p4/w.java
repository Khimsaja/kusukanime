package p4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class w extends x {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14396e;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ w(Method method, boolean z7, int i7) {
        z7 = (i7 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z7;
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
        this(method, z7, genericParameterTypes);
    }

    public final Object f(Object obj, Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        return this.f14396e ? O3.C.a : ((Method) this.a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(Method method, boolean z7, Type[] typeArr) {
        Type genericReturnType = method.getGenericReturnType();
        kotlin.jvm.internal.l.e("getGenericReturnType(...)", genericReturnType);
        super(method, genericReturnType, z7 ? method.getDeclaringClass() : null, typeArr);
        this.f14396e = genericReturnType.equals(Void.TYPE);
    }
}
