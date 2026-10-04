package p4;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* renamed from: p4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1811q extends x {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14390e;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1811q(Field field, boolean z7, boolean z8) {
        Class cls = Void.TYPE;
        kotlin.jvm.internal.l.e("TYPE", cls);
        Class<?> declaringClass = z8 ? field.getDeclaringClass() : null;
        Type genericType = field.getGenericType();
        kotlin.jvm.internal.l.e("getGenericType(...)", genericType);
        super(field, cls, declaringClass, new Type[]{genericType});
        this.f14390e = z7;
    }

    @Override // p4.InterfaceC1801g
    public Object call(Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        kotlin.jvm.internal.l.f("args", objArr);
        d(objArr);
        ((Field) this.a).set(this.f14398c != null ? P3.m.h0(objArr) : null, P3.m.o0(objArr));
        return O3.C.a;
    }

    @Override // p4.x
    public void d(Object[] objArr) {
        kotlin.jvm.internal.l.f("args", objArr);
        super.d(objArr);
        if (this.f14390e && P3.m.o0(objArr) == null) {
            throw new IllegalArgumentException("null is not allowed as a value for this property.");
        }
    }
}
