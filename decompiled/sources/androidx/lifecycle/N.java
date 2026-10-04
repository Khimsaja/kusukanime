package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class N {
    public static final List a = P3.r.I(Application.class, G.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f10722b = P3.r.H(G.class);

    public static final Constructor a(Class cls, List list) {
        kotlin.jvm.internal.l.f("signature", list);
        O3.t tVarI = kotlin.jvm.internal.l.i(cls.getConstructors());
        while (tVarI.hasNext()) {
            Constructor constructor = (Constructor) tVarI.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.e("getParameterTypes(...)", parameterTypes);
            List listU0 = P3.m.u0(parameterTypes);
            if (list.equals(listU0)) {
                return constructor;
            }
            if (list.size() == listU0.size() && listU0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final O b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (O) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Failed to access " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e9.getCause());
        }
    }
}
