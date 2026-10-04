package W3;

import java.lang.reflect.Method;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class a {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        l.c(methods);
        int length = methods.length;
        int i7 = 0;
        while (true) {
            method = null;
            if (i7 >= length) {
                break;
            }
            Method method2 = methods[i7];
            if (l.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                l.e("getParameterTypes(...)", parameterTypes);
                if (l.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i7++;
        }
        a = method;
        int length2 = methods.length;
        for (int i8 = 0; i8 < length2 && !l.a(methods[i8].getName(), "getSuppressed"); i8++) {
        }
    }
}
