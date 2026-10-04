package A4;

import java.lang.reflect.Type;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class C implements N4.d {
    @Override // N4.b
    public C0012e a(W4.c cVar) {
        Object next;
        kotlin.jvm.internal.l.f("fqName", cVar);
        Iterator it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (kotlin.jvm.internal.l.a(AbstractC0011d.a(n6.m.F(n6.m.B(((C0012e) next).a))).a(), cVar)) {
                break;
            }
        }
        return (C0012e) next;
    }

    public abstract Type b();

    public final boolean equals(Object obj) {
        return (obj instanceof C) && kotlin.jvm.internal.l.a(b(), ((C) obj).b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + b();
    }
}
