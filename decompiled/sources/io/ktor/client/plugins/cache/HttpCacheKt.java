package io.ktor.client.plugins.cache;

import P3.q;
import P3.y;
import e4.k;
import io.github.jan.supabase.auth.d;
import io.ktor.client.engine.UtilsKt;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.URLProtocol;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z6.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aU\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00050\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\"\u001e\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "content", "Lkotlin/Function1;", "", "headerExtractor", "", "allHeadersExtractor", "mergedHeadersLookup", "(Lio/ktor/http/content/OutgoingContent;Le4/k;Le4/k;)Le4/k;", "Lio/ktor/http/URLProtocol;", "", "canStore", "(Lio/ktor/http/URLProtocol;)Z", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "getLOGGER", "()Lz6/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCacheKt {
    private static final b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCache");

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean canStore(URLProtocol uRLProtocol) {
        return l.a(uRLProtocol.getName(), "http") || l.a(uRLProtocol.getName(), "https");
    }

    public static final b getLOGGER() {
        return LOGGER;
    }

    public static final k mergedHeadersLookup(OutgoingContent outgoingContent, k kVar, k kVar2) {
        l.f("content", outgoingContent);
        l.f("headerExtractor", kVar);
        l.f("allHeadersExtractor", kVar2);
        return new d(outgoingContent, kVar, kVar2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mergedHeadersLookup$lambda$0(OutgoingContent outgoingContent, k kVar, k kVar2, String str) {
        String string;
        String string2;
        l.f("header", str);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (str.equals(httpHeaders.getContentLength())) {
            Long contentLength = outgoingContent.getContentLength();
            return (contentLength == null || (string2 = contentLength.toString()) == null) ? "" : string2;
        }
        if (str.equals(httpHeaders.getContentType())) {
            ContentType contentType = outgoingContent.getContentType();
            return (contentType == null || (string = contentType.toString()) == null) ? "" : string;
        }
        if (str.equals(httpHeaders.getUserAgent())) {
            String str2 = outgoingContent.getHeaders().get(httpHeaders.getUserAgent());
            if (str2 != null) {
                return str2;
            }
            String str3 = (String) kVar.invoke(httpHeaders.getUserAgent());
            return str3 == null ? UtilsKt.getKTOR_DEFAULT_USER_AGENT() : str3;
        }
        List<String> all = outgoingContent.getHeaders().getAll(str);
        if (all == null && (all = (List) kVar2.invoke(str)) == null) {
            all = y.f7779k;
        }
        return q.y0(all, ";", null, null, null, 62);
    }
}
