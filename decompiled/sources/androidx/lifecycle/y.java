package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class y {
    public static final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f10751b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0693u interfaceC0693u) {
        try {
            kotlin.jvm.internal.l.c(constructor.newInstance(interfaceC0693u));
            throw new ClassCastException();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0141 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.y.b(java.lang.Class):int");
    }
}
