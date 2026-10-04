package G2;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class M {
    public static final K a = new K(false, 1);

    /* renamed from: b, reason: collision with root package name */
    public static final K f2678b = new K(false, 2);

    /* renamed from: c, reason: collision with root package name */
    public static final K f2679c = new K(false, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final K f2680d = new K(true, 3);

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public Object d(String str, Object obj) {
        return c(str);
    }

    public abstract void e(Bundle bundle, String str, Object obj);

    public boolean f(Object obj, Object obj2) {
        return kotlin.jvm.internal.l.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
