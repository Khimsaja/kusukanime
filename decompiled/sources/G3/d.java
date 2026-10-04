package G3;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d extends C {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f2793k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f2794l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Class f2795m;

    public d(Method method, Object obj, Class cls) {
        this.f2793k = method;
        this.f2794l = obj;
        this.f2795m = cls;
    }

    @Override // G3.C
    public final Object e() {
        return this.f2793k.invoke(this.f2794l, this.f2795m);
    }

    public final String toString() {
        return this.f2795m.getName();
    }
}
