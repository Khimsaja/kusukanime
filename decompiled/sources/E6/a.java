package E6;

import B1.C0017d;
import D6.AbstractC0119m;
import D6.InterfaceC0120n;
import G3.l;
import G3.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class a extends AbstractC0119m {
    public final x a;

    public a(x xVar) {
        this.a = xVar;
    }

    public static Set c(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(l.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.EMPTY_SET;
    }

    @Override // D6.AbstractC0119m
    public final InterfaceC0120n a(Type type, Annotation[] annotationArr) {
        return new b(this.a.a(type, c(annotationArr), null));
    }

    @Override // D6.AbstractC0119m
    public final InterfaceC0120n b(Type type, Annotation[] annotationArr, C0017d c0017d) {
        return new c(this.a.a(type, c(annotationArr), null));
    }
}
