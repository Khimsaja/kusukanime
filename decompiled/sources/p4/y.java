package p4;

import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y extends AbstractC1791A implements InterfaceC1800f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f14400d;

    public y(Method method, Object obj) {
        super(method, P3.y.f7779k);
        this.f14400d = obj;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        return this.a.invoke(this.f14400d, Arrays.copyOf(objArr, objArr.length));
    }
}
