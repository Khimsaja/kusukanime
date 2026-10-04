package D6;

import f6.C0895I;
import io.ktor.sse.ServerSentEventKt;

/* loaded from: classes.dex */
public final class r extends RuntimeException {
    public r(V v5) {
        StringBuilder sb = new StringBuilder("HTTP ");
        C0895I c0895i = v5.a;
        sb.append(c0895i.f11498n);
        sb.append(ServerSentEventKt.SPACE);
        sb.append(c0895i.f11497m);
        super(sb.toString());
    }

    public r() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
