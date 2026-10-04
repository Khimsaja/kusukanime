package D6;

import B1.C0017d;
import C2.C0034g;
import f6.AbstractC0893G;
import f6.AbstractC0897K;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: D6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109c extends AbstractC0119m {
    public final /* synthetic */ int a;

    public /* synthetic */ C0109c(int i7) {
        this.a = i7;
    }

    @Override // D6.AbstractC0119m
    public InterfaceC0120n a(Type type, Annotation[] annotationArr) {
        switch (this.a) {
            case 0:
                if (AbstractC0893G.class.isAssignableFrom(c0.h(type))) {
                    return C0108b.f1741n;
                }
                return null;
            default:
                return super.a(type, annotationArr);
        }
    }

    @Override // D6.AbstractC0119m
    public final InterfaceC0120n b(Type type, Annotation[] annotationArr, C0017d c0017d) {
        switch (this.a) {
            case 0:
                if (type == AbstractC0897K.class) {
                    return c0.l(annotationArr, F6.w.class) ? C0108b.f1742o : C0108b.f1740m;
                }
                if (type == Void.class) {
                    return C0108b.f1744q;
                }
                if (c0.m(type)) {
                    return C0108b.f1743p;
                }
                return null;
            default:
                if (c0.h(type) != Optional.class) {
                    return null;
                }
                return new C0034g(2, c0017d.F(c0.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
