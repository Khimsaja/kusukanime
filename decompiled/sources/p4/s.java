package p4;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s extends w implements InterfaceC1800f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Method method) {
        super(method, false, 4);
        kotlin.jvm.internal.l.f("method", method);
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        return f(null, objArr);
    }
}
