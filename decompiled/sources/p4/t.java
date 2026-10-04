package p4;

import D4.S;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends w implements InterfaceC1800f {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14392f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f14393g;

    /* JADX WARN: Illegal instructions before constructor call */
    public t(Method method, boolean z7, Object obj) {
        kotlin.jvm.internal.l.f("method", method);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : P3.m.b0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f14392f = z7;
        this.f14393g = obj;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        S s7 = new S(2);
        s7.g(this.f14393g);
        s7.j(objArr);
        ArrayList arrayList = s7.f1530k;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
