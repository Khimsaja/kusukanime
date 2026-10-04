package p4;

import D4.S;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import v.c0;

/* loaded from: classes.dex */
public final class u extends w implements InterfaceC1800f {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f14394f;

    /* JADX WARN: Illegal instructions before constructor call */
    public u(Method method, Object[] objArr) {
        Collection collectionH;
        kotlin.jvm.internal.l.f("method", method);
        kotlin.jvm.internal.l.f("boundReceiverComponents", objArr);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        kotlin.jvm.internal.l.e("getGenericParameterTypes(...)", genericParameterTypes);
        int length = objArr.length;
        if (length < 0) {
            throw new IllegalArgumentException(c0.a(length, "Requested element count ", " is less than zero.").toString());
        }
        int length2 = genericParameterTypes.length - length;
        length2 = length2 < 0 ? 0 : length2;
        if (length2 < 0) {
            throw new IllegalArgumentException(c0.a(length2, "Requested element count ", " is less than zero.").toString());
        }
        if (length2 == 0) {
            collectionH = P3.y.f7779k;
        } else {
            int length3 = genericParameterTypes.length;
            if (length2 >= length3) {
                collectionH = P3.m.u0(genericParameterTypes);
            } else if (length2 == 1) {
                collectionH = P3.r.H(genericParameterTypes[length3 - 1]);
            } else {
                ArrayList arrayList = new ArrayList(length2);
                for (int i7 = length3 - length2; i7 < length3; i7++) {
                    arrayList.add(genericParameterTypes[i7]);
                }
                collectionH = arrayList;
            }
        }
        super(method, false, (Type[]) collectionH.toArray(new Type[0]));
        this.f14394f = objArr;
    }

    @Override // p4.InterfaceC1801g
    public final Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        S s7 = new S(2);
        s7.j(this.f14394f);
        s7.j(objArr);
        ArrayList arrayList = s7.f1530k;
        return f(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
