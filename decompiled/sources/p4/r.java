package p4;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r extends w implements InterfaceC1800f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f14391f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Method method, Object obj) {
        super(method, false, 4);
        kotlin.jvm.internal.l.f("method", method);
        this.f14391f = obj;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        return f(this.f14391f, objArr);
    }
}
