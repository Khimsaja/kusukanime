package A4;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends AbstractC0013f implements N4.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f223b;

    public h(W4.e eVar, Object[] objArr) {
        super(eVar);
        this.f223b = objArr;
    }

    public final ArrayList a() {
        Object[] objArr = this.f223b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            kotlin.jvm.internal.l.c(obj);
            Class<?> cls = obj.getClass();
            List list = AbstractC0011d.a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new u(null, (Enum) obj) : obj instanceof Annotation ? new g(null, (Annotation) obj) : obj instanceof Object[] ? new h(null, (Object[]) obj) : obj instanceof Class ? new q(null, (Class) obj) : new w(null, obj));
        }
        return arrayList;
    }
}
