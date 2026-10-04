package O3;

import io.ktor.http.ContentType;

/* loaded from: classes.dex */
public final class k extends Error {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
    }
}
