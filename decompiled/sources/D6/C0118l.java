package D6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: D6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118l extends AbstractC0112f {
    @Override // D6.AbstractC0112f
    public final InterfaceC0113g a(Type type, Annotation[] annotationArr) {
        if (c0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeG = c0.g(0, (ParameterizedType) type);
        if (c0.h(typeG) != V.class) {
            return new C0116j(0, typeG);
        }
        if (!(typeG instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new C0116j(1, c0.g(0, (ParameterizedType) typeG));
    }
}
