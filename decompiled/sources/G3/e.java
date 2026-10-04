package G3;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e extends C {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Method f2796k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2797l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f2798m;

    public e(Method method, Class cls, int i7) {
        this.f2796k = method;
        this.f2797l = cls;
        this.f2798m = i7;
    }

    @Override // G3.C
    public final Object e() {
        return this.f2796k.invoke(null, this.f2797l, Integer.valueOf(this.f2798m));
    }

    public final String toString() {
        return this.f2797l.getName();
    }
}
