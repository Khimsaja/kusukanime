package p4;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: p4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1807m extends x {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1807m(Field field, boolean z7) {
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.l.e("getGenericType(...)", genericType);
        super(field, genericType, z7 ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p4.InterfaceC1801g
    public Object call(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        return ((Field) this.a).get(this.f14398c != null ? P3.m.h0(objArr) : null);
    }
}
