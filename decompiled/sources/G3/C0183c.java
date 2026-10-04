package G3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: G3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0183c extends C {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2790k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Class f2791l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AccessibleObject f2792m;

    public C0183c(Constructor constructor, Class cls) {
        this.f2792m = constructor;
        this.f2791l = cls;
    }

    @Override // G3.C
    public final Object e() {
        switch (this.f2790k) {
            case 0:
                return ((Constructor) this.f2792m).newInstance(null);
            default:
                return ((Method) this.f2792m).invoke(null, this.f2791l, Object.class);
        }
    }

    public final String toString() {
        switch (this.f2790k) {
        }
        return this.f2791l.getName();
    }

    public C0183c(Method method, Class cls) {
        this.f2792m = method;
        this.f2791l = cls;
    }
}
