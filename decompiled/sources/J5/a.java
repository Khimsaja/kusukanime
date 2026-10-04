package J5;

import H5.D;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public class a extends j implements b {
    @Override // H5.n0
    public final boolean A(Throwable th) {
        D.s(this.f3833m, th);
        return true;
    }

    @Override // H5.n0
    public final void N(Throwable th) {
        if (th != null) {
            cancellationExceptionA = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = D.a(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.f4337n.e(cancellationExceptionA);
    }
}
