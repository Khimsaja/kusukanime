package androidx.lifecycle;

import android.app.Application;
import e5.AbstractC0832b;
import java.lang.reflect.InvocationTargetException;
import v1.C2149c;

/* loaded from: classes.dex */
public final class P extends S {

    /* renamed from: c, reason: collision with root package name */
    public static P f10723c;

    /* renamed from: d, reason: collision with root package name */
    public static final R1.i f10724d = new R1.i(12);

    /* renamed from: b, reason: collision with root package name */
    public final Application f10725b;

    public P(Application application) {
        this.f10725b = application;
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.Q
    public final O a(Class cls) {
        Application application = this.f10725b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.Q
    public final O b(Class cls, C2149c c2149c) {
        if (this.f10725b != null) {
            return a(cls);
        }
        Application application = (Application) c2149c.a.get(f10724d);
        if (application != null) {
            return d(cls, application);
        }
        if (AbstractC0674a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return AbstractC0832b.p(cls);
    }

    public final O d(Class cls, Application application) {
        if (!AbstractC0674a.class.isAssignableFrom(cls)) {
            return AbstractC0832b.p(cls);
        }
        try {
            O o7 = (O) cls.getConstructor(Application.class).newInstance(application);
            kotlin.jvm.internal.l.c(o7);
            return o7;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }
}
