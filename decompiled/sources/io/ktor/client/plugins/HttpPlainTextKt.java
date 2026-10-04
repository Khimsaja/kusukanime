package io.ktor.client.plugins;

import O3.C;
import P3.E;
import P3.F;
import P3.q;
import S5.n;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.ContentType;
import io.ktor.http.ContentTypesKt;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.core.StringsKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.C2496a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpPlainTextConfig;", "LO3/C;", "block", "Charsets", "(Lio/ktor/client/HttpClientConfig;Le4/k;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpPlainText", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpPlainText", "()Lio/ktor/client/plugins/api/ClientPlugin;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpPlainTextKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpPlainText");
    private static final ClientPlugin<HttpPlainTextConfig> HttpPlainText = CreatePluginUtilsKt.createClientPlugin("HttpPlainText", HttpPlainTextKt$HttpPlainText$1.INSTANCE, new io.ktor.client.b(13));

    public static final void Charsets(HttpClientConfig<?> httpClientConfig, k kVar) {
        l.f("<this>", httpClientConfig);
        l.f("block", kVar);
        httpClientConfig.install(HttpPlainText, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpPlainText$lambda$6(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        List<O3.l> listO0 = q.O0(E.q0(((HttpPlainTextConfig) clientPluginBuilder.getPluginConfig()).getCharsetQuality$ktor_client_core()), new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h((Float) ((O3.l) t8).f7529l, (Float) ((O3.l) t7).f7529l);
            }
        });
        Charset responseCharsetFallback = ((HttpPlainTextConfig) clientPluginBuilder.getPluginConfig()).getResponseCharsetFallback();
        Set<Charset> charsets$ktor_client_core = ((HttpPlainTextConfig) clientPluginBuilder.getPluginConfig()).getCharsets$ktor_client_core();
        ArrayList arrayList = new ArrayList();
        for (Object obj : charsets$ktor_client_core) {
            if (!((HttpPlainTextConfig) clientPluginBuilder.getPluginConfig()).getCharsetQuality$ktor_client_core().containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> listO02 = q.O0(arrayList, new Comparator() { // from class: io.ktor.client.plugins.HttpPlainTextKt$HttpPlainText$lambda$6$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t7, T t8) {
                return z1.c.h(CharsetJVMKt.getName((Charset) t7), CharsetJVMKt.getName((Charset) t8));
            }
        });
        StringBuilder sb = new StringBuilder();
        for (Charset charset : listO02) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(CharsetJVMKt.getName(charset));
        }
        for (O3.l lVar : listO0) {
            Charset charset2 = (Charset) lVar.f7528k;
            float fFloatValue = ((Number) lVar.f7529l).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d4 = fFloatValue;
            if (0.0d > d4 || d4 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(CharsetJVMKt.getName(charset2) + ";q=" + (F.W(100 * fFloatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(CharsetJVMKt.getName(responseCharsetFallback));
        }
        String string = sb.toString();
        Charset sendCharset = ((HttpPlainTextConfig) clientPluginBuilder.getPluginConfig()).getSendCharset();
        if (sendCharset == null && (sendCharset = (Charset) q.t0(listO02)) == null) {
            O3.l lVar2 = (O3.l) q.t0(listO0);
            sendCharset = lVar2 != null ? (Charset) lVar2.f7528k : null;
            if (sendCharset == null) {
                sendCharset = C2496a.f19036b;
            }
        }
        clientPluginBuilder.on(RenderRequestHook.INSTANCE, new HttpPlainTextKt$HttpPlainText$2$1(string, sendCharset, null));
        clientPluginBuilder.transformResponseBody(new HttpPlainTextKt$HttpPlainText$2$2(responseCharsetFallback, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HttpPlainText$lambda$6$addCharsetHeaders(String str, HttpRequestBuilder httpRequestBuilder) {
        HeadersBuilder headers = httpRequestBuilder.getHeaders();
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        if (headers.get(httpHeaders.getAcceptCharset()) != null) {
            return;
        }
        z6.b bVar = LOGGER;
        StringBuilder sbQ = AbstractC0703b.q("Adding Accept-Charset=", str, " to ");
        sbQ.append(httpRequestBuilder.getUrl());
        bVar.e(sbQ.toString());
        httpRequestBuilder.getHeaders().set(httpHeaders.getAcceptCharset(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HttpPlainText$lambda$6$read(Charset charset, HttpClientCall httpClientCall, n nVar) {
        Charset charset2 = HttpMessagePropertiesKt.charset(httpClientCall.getResponse());
        if (charset2 != null) {
            charset = charset2;
        }
        LOGGER.e("Reading response body for " + httpClientCall.getRequest().getUrl() + " as String with charset " + charset);
        return StringsKt.readText$default(nVar, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OutgoingContent HttpPlainText$lambda$6$wrapContent(Charset charset, HttpRequestBuilder httpRequestBuilder, String str, ContentType contentType) {
        Charset charset2;
        ContentType plain = contentType == null ? ContentType.Text.INSTANCE.getPlain() : contentType;
        if (contentType != null && (charset2 = ContentTypesKt.charset(contentType)) != null) {
            charset = charset2;
        }
        LOGGER.e("Sending request body to " + httpRequestBuilder.getUrl() + " as text/plain with charset " + charset);
        return new TextContent(str, ContentTypesKt.withCharset(plain, charset), null, 4, null);
    }

    public static final ClientPlugin<HttpPlainTextConfig> getHttpPlainText() {
        return HttpPlainText;
    }
}
