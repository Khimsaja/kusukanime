package A4;

import java.lang.annotation.Annotation;
import java.util.Collection;

/* loaded from: classes.dex */
public final class E extends t implements N4.b {
    public final C a;

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f209b;

    /* renamed from: c, reason: collision with root package name */
    public final String f210c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f211d;

    public E(C c2, Annotation[] annotationArr, String str, boolean z7) {
        kotlin.jvm.internal.l.f("reflectAnnotations", annotationArr);
        this.a = c2;
        this.f209b = annotationArr;
        this.f210c = str;
        this.f211d = z7;
    }

    @Override // N4.b
    public final C0012e a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return n6.m.x(this.f209b, cVar);
    }

    @Override // N4.b
    public final Collection getAnnotations() {
        return n6.m.C(this.f209b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(E.class.getName());
        sb.append(": ");
        sb.append(this.f211d ? "vararg " : "");
        String str = this.f210c;
        sb.append(str != null ? W4.e.d(str) : null);
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
