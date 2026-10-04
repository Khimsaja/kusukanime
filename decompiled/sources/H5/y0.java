package H5;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class y0 extends CancellationException implements InterfaceC0279u {

    /* renamed from: k, reason: collision with root package name */
    public final transient z0 f3891k;

    public y0(String str, z0 z0Var) {
        super(str);
        this.f3891k = z0Var;
    }

    @Override // H5.InterfaceC0279u
    public final Throwable createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        y0 y0Var = new y0(message, this.f3891k);
        y0Var.initCause(this);
        return y0Var;
    }
}
