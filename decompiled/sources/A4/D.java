package A4;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* loaded from: classes.dex */
public final class D extends t implements N4.b {
    public final TypeVariable a;

    public D(TypeVariable typeVariable) {
        kotlin.jvm.internal.l.f("typeVariable", typeVariable);
        this.a = typeVariable;
    }

    @Override // N4.b
    public final C0012e a(W4.c cVar) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.l.f("fqName", cVar);
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return n6.m.x(declaredAnnotations, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D) {
            return kotlin.jvm.internal.l.a(this.a, ((D) obj).a);
        }
        return false;
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? P3.y.f7779k : n6.m.C(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return D.class.getName() + ": " + this.a;
    }
}
