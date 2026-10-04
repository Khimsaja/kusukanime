package io.ktor.client.request;

import O3.C;
import e4.k;
import e4.n;
import io.ktor.client.plugins.sse.SSEClientContent;
import io.ktor.client.plugins.sse.SSEKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMethodKt;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.content.OutgoingContentKt;
import io.ktor.util.AttributeKey;
import io.ktor.util.AttributesKt;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.InternalAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a3\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\n\u001a\u00020\t*\u00020\u00072\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\u0003*\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0019\u0010\u000f\u001a\u00020\f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0014\u001a(\u0010\u0016\u001a\u00020\f*\u00020\u00152\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\bH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001aW\u0010\u0012\u001a\u00020\u0003*\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u0012\u0010\u001d\u001aZ\u0010\u0016\u001a\u00020\f*\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\bH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u001e\u001a\u0019\u0010\u0012\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010 \u001a\u0013\u0010\"\u001a\u00020!*\u00020\u0000H\u0007¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020!*\u00020\u0000H\u0007¢\u0006\u0004\b$\u0010#\u001a\u0013\u0010%\u001a\u00020!*\u00020\u0000H\u0007¢\u0006\u0004\b%\u0010#\"&\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"Lio/ktor/client/request/HttpRequestData;", "Lkotlin/Function2;", "", "LO3/C;", "block", "forEachHeader", "(Lio/ktor/client/request/HttpRequestData;Le4/n;)V", "Lio/ktor/http/HttpMessageBuilder;", "Lkotlin/Function1;", "Lio/ktor/http/HeadersBuilder;", "headers", "(Lio/ktor/http/HttpMessageBuilder;Le4/k;)Lio/ktor/http/HeadersBuilder;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequest;", "request", "takeFrom", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/request/HttpRequest;)Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/URLBuilder;", "url", "(Lio/ktor/client/request/HttpRequestBuilder;Le4/k;)V", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/client/request/HttpRequestData;)Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/request/HttpRequestBuilder$Companion;", "invoke", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Le4/k;)Lio/ktor/client/request/HttpRequestBuilder;", "scheme", "host", "", "port", "path", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;)V", "(Lio/ktor/client/request/HttpRequestBuilder$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;)Lio/ktor/client/request/HttpRequestBuilder;", "urlString", "(Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/String;)V", "", "isUpgradeRequest", "(Lio/ktor/client/request/HttpRequestData;)Z", "isSseRequest", "isSseReconnectionRequest", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/request/ResponseAdapter;", "ResponseAdapterAttributeKey", "Lio/ktor/util/AttributeKey;", "getResponseAdapterAttributeKey", "()Lio/ktor/util/AttributeKey;", "getResponseAdapterAttributeKey$annotations", "()V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequestKt {
    private static final AttributeKey<ResponseAdapter> ResponseAdapterAttributeKey;

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(ResponseAdapter.class);
        try {
            interfaceC1444wA = y.a(ResponseAdapter.class);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        ResponseAdapterAttributeKey = new AttributeKey<>("ResponseAdapterAttributeKey", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    @InternalAPI
    public static final void forEachHeader(HttpRequestData httpRequestData, final n nVar) {
        l.f("<this>", httpRequestData);
        l.f("block", nVar);
        final boolean z7 = !HttpMethodKt.getSupportsRequestBody(httpRequestData.getMethod()) && OutgoingContentKt.isEmpty(httpRequestData.getBody());
        io.ktor.client.engine.UtilsKt.mergeHeaders(httpRequestData.getHeaders(), httpRequestData.getBody(), new n() { // from class: io.ktor.client.request.HttpRequestKt.forEachHeader.1
            @Override // e4.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, (String) obj2);
                return C.a;
            }

            public final void invoke(String str, String str2) {
                l.f("key", str);
                l.f("value", str2);
                if (z7 && str.equals(HttpHeaders.INSTANCE.getContentLength())) {
                    return;
                }
                nVar.invoke(str, str2);
            }
        });
    }

    public static final AttributeKey<ResponseAdapter> getResponseAdapterAttributeKey() {
        return ResponseAdapterAttributeKey;
    }

    @InternalAPI
    public static /* synthetic */ void getResponseAdapterAttributeKey$annotations() {
    }

    public static final HeadersBuilder headers(HttpMessageBuilder httpMessageBuilder, k kVar) {
        l.f("<this>", httpMessageBuilder);
        l.f("block", kVar);
        HeadersBuilder headers = httpMessageBuilder.getHeaders();
        kVar.invoke(headers);
        return headers;
    }

    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, k kVar) {
        l.f("<this>", companion);
        l.f("block", kVar);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, kVar);
        return httpRequestBuilder;
    }

    public static /* synthetic */ HttpRequestBuilder invoke$default(HttpRequestBuilder.Companion companion, String str, String str2, Integer num, String str3, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new a(5);
        }
        return invoke(companion, str, str2, num, str3, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C invoke$lambda$2(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return C.a;
    }

    @InternalAPI
    public static final boolean isSseReconnectionRequest(HttpRequestData httpRequestData) {
        l.f("<this>", httpRequestData);
        return l.a(httpRequestData.getAttributes().getOrNull(SSEKt.getSSEReconnectionRequestAttr()), Boolean.TRUE);
    }

    @InternalAPI
    public static final boolean isSseRequest(HttpRequestData httpRequestData) {
        l.f("<this>", httpRequestData);
        return httpRequestData.getBody() instanceof SSEClientContent;
    }

    @InternalAPI
    public static final boolean isUpgradeRequest(HttpRequestData httpRequestData) {
        l.f("<this>", httpRequestData);
        return httpRequestData.getBody() instanceof ClientUpgradeContent;
    }

    public static final HttpRequestBuilder takeFrom(HttpRequestBuilder httpRequestBuilder, HttpRequest httpRequest) {
        l.f("<this>", httpRequestBuilder);
        l.f("request", httpRequest);
        httpRequestBuilder.setMethod(httpRequest.getMethod());
        httpRequestBuilder.setBody(httpRequest.getContent());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), httpRequest.getUrl());
        httpRequestBuilder.getHeaders().appendAll(httpRequest.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), httpRequest.getAttributes());
        return httpRequestBuilder;
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, k kVar) {
        l.f("<this>", httpRequestBuilder);
        l.f("block", kVar);
        kVar.invoke(httpRequestBuilder.getUrl());
    }

    public static /* synthetic */ void url$default(HttpRequestBuilder httpRequestBuilder, String str, String str2, Integer num, String str3, k kVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            str2 = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str3 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new a(6);
        }
        url(httpRequestBuilder, str, str2, num, str3, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C url$lambda$1(URLBuilder uRLBuilder) {
        l.f("<this>", uRLBuilder);
        return C.a;
    }

    public static final HttpRequestBuilder invoke(HttpRequestBuilder.Companion companion, String str, String str2, Integer num, String str3, k kVar) {
        l.f("<this>", companion);
        l.f("block", kVar);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        url(httpRequestBuilder, str, str2, num, str3, kVar);
        return httpRequestBuilder;
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, String str, String str2, Integer num, String str3, k kVar) {
        l.f("<this>", httpRequestBuilder);
        l.f("block", kVar);
        URLBuilderKt.set(httpRequestBuilder.getUrl(), str, str2, num, str3, kVar);
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, String str) {
        l.f("<this>", httpRequestBuilder);
        l.f("urlString", str);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
    }

    public static final HttpRequestBuilder takeFrom(HttpRequestBuilder httpRequestBuilder, HttpRequestData httpRequestData) {
        l.f("<this>", httpRequestBuilder);
        l.f("request", httpRequestData);
        httpRequestBuilder.setMethod(httpRequestData.getMethod());
        httpRequestBuilder.setBody(httpRequestData.getBody());
        httpRequestBuilder.setBodyType((TypeInfo) httpRequestBuilder.getAttributes().getOrNull(RequestBodyKt.getBodyTypeAttributeKey()));
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), httpRequestData.getUrl());
        httpRequestBuilder.getHeaders().appendAll(httpRequestData.getHeaders());
        AttributesKt.putAll(httpRequestBuilder.getAttributes(), httpRequestData.getAttributes());
        return httpRequestBuilder;
    }
}
