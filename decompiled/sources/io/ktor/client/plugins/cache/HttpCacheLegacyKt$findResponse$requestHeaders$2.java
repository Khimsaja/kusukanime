package io.ktor.client.plugins.cache;

import e4.k;
import io.ktor.http.Headers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public /* synthetic */ class HttpCacheLegacyKt$findResponse$requestHeaders$2 extends j implements k {
    public HttpCacheLegacyKt$findResponse$requestHeaders$2(Object obj) {
        super(1, 0, Headers.class, obj, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;");
    }

    @Override // e4.k
    public final List<String> invoke(String str) {
        l.f("p0", str);
        return ((Headers) this.receiver).getAll(str);
    }
}
