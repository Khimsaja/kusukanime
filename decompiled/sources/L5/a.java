package L5;

import K5.InterfaceC0330i;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: k, reason: collision with root package name */
    public final transient InterfaceC0330i f6156k;

    public a(InterfaceC0330i interfaceC0330i) {
        super("Flow was aborted, no more elements needed");
        this.f6156k = interfaceC0330i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
