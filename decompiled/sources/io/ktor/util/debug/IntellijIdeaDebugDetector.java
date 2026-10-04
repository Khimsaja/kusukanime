package io.ktor.util.debug;

import O3.i;
import java.lang.management.ManagementFactory;
import kotlin.Metadata;
import z1.c;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0007\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/util/debug/IntellijIdeaDebugDetector;", "", "<init>", "()V", "", "isDebuggerConnected$delegate", "LO3/i;", "isDebuggerConnected", "()Z", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntellijIdeaDebugDetector {
    public static final IntellijIdeaDebugDetector INSTANCE = new IntellijIdeaDebugDetector();

    /* renamed from: isDebuggerConnected$delegate, reason: from kotlin metadata */
    private static final i isDebuggerConnected = c.C(new io.ktor.http.c(15));

    private IntellijIdeaDebugDetector() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDebuggerConnected_delegate$lambda$0() {
        try {
            return AbstractC2510o.W(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean isDebuggerConnected() {
        return ((Boolean) isDebuggerConnected.getValue()).booleanValue();
    }
}
