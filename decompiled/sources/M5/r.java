package M5;

/* loaded from: classes.dex */
public abstract class r {
    public static final /* synthetic */ int a = 0;

    static {
        Object objR;
        Object objR2;
        Exception exc = new Exception();
        String simpleName = P3.r.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objR = U3.a.class.getCanonicalName();
        } catch (Throwable th) {
            objR = P3.r.r(th);
        }
        if (O3.o.a(objR) != null) {
            objR = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objR2 = r.class.getCanonicalName();
        } catch (Throwable th2) {
            objR2 = P3.r.r(th2);
        }
        if (O3.o.a(objR2) != null) {
            objR2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
