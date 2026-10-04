package A4;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import u4.Z;
import u4.c0;
import u4.f0;
import y4.C2415a;
import y4.C2416b;
import y4.C2417c;

/* loaded from: classes.dex */
public abstract class x extends t implements N4.b, N4.c {
    @Override // N4.b
    public final C0012e a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        Member memberB = b();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", memberB);
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return n6.m.x(declaredAnnotations, cVar);
        }
        return null;
    }

    public abstract Member b();

    public final W4.e c() {
        String name = b().getName();
        return name != null ? W4.e.e(name) : W4.g.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A4.x.d(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final f0 e() {
        int modifiers = b().getModifiers();
        return Modifier.isPublic(modifiers) ? c0.f16306c : Modifier.isPrivate(modifiers) ? Z.f16303c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C2417c.f18373c : C2416b.f18372c : C2415a.f18371c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && kotlin.jvm.internal.l.a(b(), ((x) obj).b());
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        Member memberB = b();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", memberB);
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberB).getDeclaredAnnotations();
        return declaredAnnotations != null ? n6.m.C(declaredAnnotations) : P3.y.f7779k;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
