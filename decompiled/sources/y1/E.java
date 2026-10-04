package y1;

import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;

/* loaded from: classes.dex */
public class E extends IOException {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f17932k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17933l;

    public E(String str, RuntimeException runtimeException, boolean z7, int i7) {
        super(str, runtimeException);
        this.f17932k = z7;
        this.f17933l = i7;
    }

    public static E a(RuntimeException runtimeException, String str) {
        return new E(str, runtimeException, true, 1);
    }

    public static E b(String str) {
        return new E(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(ServerSentEventKt.SPACE) : "");
        sb.append("{contentIsMalformed=");
        sb.append(this.f17932k);
        sb.append(", dataType=");
        sb.append(this.f17933l);
        sb.append("}");
        return sb.toString();
    }
}
