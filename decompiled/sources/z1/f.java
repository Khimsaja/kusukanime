package z1;

import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes.dex */
public final class f extends Exception {
    public f(e eVar) {
        this("Unhandled input format:", eVar);
    }

    public f(String str, e eVar) {
        super(str + ServerSentEventKt.SPACE + eVar);
    }
}
