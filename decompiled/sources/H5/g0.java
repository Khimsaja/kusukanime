package H5;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class g0 extends CancellationException implements InterfaceC0279u {

    /* renamed from: k, reason: collision with root package name */
    public final transient n0 f3847k;

    public g0(String str, Throwable th, n0 n0Var) {
        super(str);
        this.f3847k = n0Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // H5.InterfaceC0279u
    public final /* bridge */ /* synthetic */ Throwable createCopy() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!kotlin.jvm.internal.l.a(g0Var.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = g0Var.f3847k;
        if (obj2 == null) {
            obj2 = q0.f3877k;
        }
        Object obj3 = this.f3847k;
        if (obj3 == null) {
            obj3 = q0.f3877k;
        }
        return kotlin.jvm.internal.l.a(obj2, obj3) && kotlin.jvm.internal.l.a(g0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.l.c(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.f3847k;
        if (obj == null) {
            obj = q0.f3877k;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f3847k;
        if (obj == null) {
            obj = q0.f3877k;
        }
        sb.append(obj);
        return sb.toString();
    }
}
