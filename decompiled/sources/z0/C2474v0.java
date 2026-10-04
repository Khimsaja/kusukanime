package z0;

import M0.InterfaceC0475h;
import java.lang.reflect.Method;

/* renamed from: z0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2474v0 implements S3.g, InterfaceC0475h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ C2474v0 f18935k = new C2474v0();

    /* renamed from: l, reason: collision with root package name */
    public static final a1 f18936l = new a1();

    public static final boolean a() throws ClassNotFoundException {
        Class cls = C2471u.f18843J0;
        try {
            if (C2471u.f18843J0 == null) {
                Class<?> cls2 = Class.forName("android.os.SystemProperties");
                C2471u.f18843J0 = cls2;
                C2471u.f18844K0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
            }
            Method method = C2471u.f18844K0;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
