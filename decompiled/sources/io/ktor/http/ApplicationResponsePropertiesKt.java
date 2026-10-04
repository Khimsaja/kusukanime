package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/http/HeadersBuilder;", "", "entityTag", "LO3/C;", "etag", "(Lio/ktor/http/HeadersBuilder;Ljava/lang/String;)V", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationResponsePropertiesKt {
    public static final void etag(HeadersBuilder headersBuilder, String str) {
        l.f("<this>", headersBuilder);
        l.f("entityTag", str);
        headersBuilder.set(HttpHeaders.INSTANCE.getETag(), str);
    }
}
