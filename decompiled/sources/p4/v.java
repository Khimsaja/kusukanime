package p4;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class v extends w {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14395f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Method method, int i7) {
        super(method, false, 6);
        this.f14395f = i7;
        switch (i7) {
            case 1:
                kotlin.jvm.internal.l.f("method", method);
                super(method, true, 4);
                break;
            case 2:
                kotlin.jvm.internal.l.f("method", method);
                super(method, false, 6);
                break;
            default:
                kotlin.jvm.internal.l.f("method", method);
                break;
        }
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        switch (this.f14395f) {
            case 0:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                return f(objArr[0], objArr.length <= 1 ? new Object[0] : P3.m.b0(objArr, 1, objArr.length));
            case 1:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                e(P3.m.i0(objArr));
                return f(null, objArr.length <= 1 ? new Object[0] : P3.m.b0(objArr, 1, objArr.length));
            default:
                kotlin.jvm.internal.l.f("args", objArr);
                d(objArr);
                return f(null, objArr);
        }
    }
}
