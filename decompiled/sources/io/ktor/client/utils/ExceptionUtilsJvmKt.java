package io.ktor.client.utils;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "unwrapCancellationException", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExceptionUtilsJvmKt {
    public static final Throwable unwrapCancellationException(Throwable th) {
        l.f("<this>", th);
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (l.a(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }
}
