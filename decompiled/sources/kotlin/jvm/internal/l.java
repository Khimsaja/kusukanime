package kotlin.jvm.internal;

import android.net.Uri;
import b1.AbstractC0703b;
import java.util.Arrays;
import v.c0;

/* loaded from: classes.dex */
public abstract class l {
    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Uri uri) {
        if (uri != null) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Uri.parse(this) must not be null");
        j(illegalStateException, l.class.getName());
        throw illegalStateException;
    }

    public static void c(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void d(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        j(nullPointerException, l.class.getName());
        throw nullPointerException;
    }

    public static void f(String str, Object obj) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = l.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            StringBuilder sbC = c0.c("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            sbC.append(str);
            NullPointerException nullPointerException = new NullPointerException(sbC.toString());
            j(nullPointerException, l.class.getName());
            throw nullPointerException;
        }
    }

    public static int g(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    public static int h(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 == j8 ? 0 : 1;
    }

    public static final O3.t i(Object[] objArr) {
        f("array", objArr);
        return new O3.t(objArr);
    }

    public static void j(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
    }

    public static void k() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void l(String str) {
        D6.r rVar = new D6.r(AbstractC0703b.j("lateinit property ", str, " has not been initialized"));
        j(rVar, l.class.getName());
        throw rVar;
    }
}
