package D6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: D6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123q extends AbstractC0112f {
    public final ExecutorC0107a a;

    public C0123q(ExecutorC0107a executorC0107a) {
        this.a = executorC0107a;
    }

    @Override // D6.AbstractC0112f
    public final InterfaceC0113g a(Type type, Annotation[] annotationArr) {
        if (c0.h(type) != InterfaceC0111e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new F.w(9, c0.g(0, (ParameterizedType) type), c0.l(annotationArr, X.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
