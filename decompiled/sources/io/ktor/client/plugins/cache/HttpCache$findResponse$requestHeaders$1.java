package io.ktor.client.plugins.cache;

import e4.k;
import io.ktor.http.Headers;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpCache$findResponse$requestHeaders$1 extends j implements k {
    public HttpCache$findResponse$requestHeaders$1(Object obj) {
        super(1, 0, Headers.class, obj, "get", "get(Ljava/lang/String;)Ljava/lang/String;");
    }

    @Override // e4.k
    public final String invoke(String str) {
        l.f("p0", str);
        return ((Headers) this.receiver).get(str);
    }
}
