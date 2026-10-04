package p4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z extends AbstractC1791A {
    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        Object obj = objArr[0];
        Object[] objArrB0 = objArr.length <= 1 ? new Object[0] : P3.m.b0(objArr, 1, objArr.length);
        return this.a.invoke(obj, Arrays.copyOf(objArrB0, objArrB0.length));
    }
}
