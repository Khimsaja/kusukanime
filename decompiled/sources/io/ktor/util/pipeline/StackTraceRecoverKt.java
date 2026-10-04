package io.ktor.util.pipeline;

import S3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "exception", "LS3/c;", "continuation", "recoverStackTraceBridge", "(Ljava/lang/Throwable;LS3/c;)Ljava/lang/Throwable;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StackTraceRecoverKt {
    public static final Throwable recoverStackTraceBridge(Throwable th, c<?> cVar) {
        l.f("exception", th);
        l.f("continuation", cVar);
        try {
            return StackTraceRecoverJvmKt.withCause(th, th.getCause());
        } catch (Throwable unused) {
            return th;
        }
    }
}
