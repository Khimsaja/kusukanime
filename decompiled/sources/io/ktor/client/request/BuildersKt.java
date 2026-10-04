package io.ktor.client.request;

import O3.C;
import S3.c;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0007\u0010\u0005\u001a(\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0004\u0010\u000b\u001a(\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0007\u0010\u000b\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0004\u0010\u000e\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0007\u0010\u000e\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0004\u0010\u0011\u001a2\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0007\u0010\u0011\u001a\u001c\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0012\u0010\u0005\u001a\u001c\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0013\u0010\u0005\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0014\u0010\u0005\u001a\u001c\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0015\u0010\u0005\u001a\u001c\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0016\u0010\u0005\u001a\u001c\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0017\u0010\u0005\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0018\u0010\u0005\u001a\u001c\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u0019\u0010\u0005\u001a\u001c\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001a\u0010\u0005\u001a\u001c\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001b\u0010\u0005\u001a\u001c\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001c\u0010\u0005\u001a\u001c\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001d\u0010\u0005\u001a\u001c\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001e\u0010\u0005\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086H¢\u0006\u0004\b\u001f\u0010\u0005\u001a(\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0012\u0010\u000b\u001a(\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0013\u0010\u000b\u001a(\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0014\u0010\u000b\u001a(\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0015\u0010\u000b\u001a(\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0016\u0010\u000b\u001a(\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0017\u0010\u000b\u001a(\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0018\u0010\u000b\u001a(\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0019\u0010\u000b\u001a(\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001a\u0010\u000b\u001a(\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001b\u0010\u000b\u001a(\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001c\u0010\u000b\u001a(\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001d\u0010\u000b\u001a(\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001e\u0010\u000b\u001a(\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001f\u0010\u000b\u001a!\u0010\u0004\u001a\u00020\u00012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0004\u0010 \u001a2\u0010\u0012\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0012\u0010\u000e\u001a2\u0010\u0013\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0013\u0010\u000e\u001a2\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0014\u0010\u000e\u001a2\u0010\u0015\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0015\u0010\u000e\u001a2\u0010\u0016\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0016\u0010\u000e\u001a2\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0017\u0010\u000e\u001a2\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0018\u0010\u000e\u001a2\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u0019\u0010\u000e\u001a2\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001a\u0010\u000e\u001a2\u0010\u001b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001b\u0010\u000e\u001a2\u0010\u001c\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001c\u0010\u000e\u001a2\u0010\u001d\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001d\u0010\u000e\u001a2\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001e\u0010\u000e\u001a2\u0010\u001f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\bH\u0086H¢\u0006\u0004\b\u001f\u0010\u000e¨\u0006!"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/statement/HttpResponse;", "request", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "Lkotlin/Function1;", "LO3/C;", "block", "(Lio/ktor/client/HttpClient;Le4/k;LS3/c;)Ljava/lang/Object;", "", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/Url;", "url", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Le4/k;LS3/c;)Ljava/lang/Object;", "get", "post", "put", "delete", "options", "patch", "head", "prepareGet", "preparePost", "preparePut", "prepareDelete", "prepareOptions", "preparePatch", "prepareHead", "(Le4/k;)Lio/ktor/client/request/HttpRequestBuilder;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt {
    public static final Object delete(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object delete$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object delete$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.delete.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object get(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object get$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object get$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.get.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object head(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object head$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object head$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.head.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object options(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object options$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object options$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.options.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object patch(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object patch$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object patch$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.patch.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object post(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object post$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object post$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.post.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object prepareDelete(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareDelete$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareDelete$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareDelete.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareGet$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareGet$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareGet.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareHead$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareHead$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareHead.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareOptions$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareOptions$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareOptions.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePatch$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePatch$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.preparePatch.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePost(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePost$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePost$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.preparePost.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePut(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePut$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePut$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.preparePut.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareRequest$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpStatement> cVar) {
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpRequestBuilder = new HttpRequestBuilder();
        }
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object put(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object put$$forInline(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object put$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.put.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object request(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c<? super HttpResponse> cVar) {
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, HttpRequestBuilder httpRequestBuilder, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpRequestBuilder = new HttpRequestBuilder();
        }
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareRequest(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareRequest$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object delete(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object delete$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object get(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object get$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object head(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object head$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object options(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object options$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object patch(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object patch$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object post(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object post$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareDelete(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareDelete$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareGet$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareHead$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareOptions$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePatch$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePost$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePut$$forInline(HttpClient httpClient, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareRequest.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object put(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object put$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareRequest(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareRequest$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object request(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object request$$forInline(HttpClient httpClient, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object get(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object get$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object prepareGet(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareGet$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, String str, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.request.4
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareDelete(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object prepareDelete$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object prepareHead$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object prepareOptions$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object preparePatch$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePost(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object preparePost$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object preparePut(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object preparePut$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object prepareRequest(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareRequest$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.prepareRequest.7
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final HttpRequestBuilder request(k kVar) {
        l.f("block", kVar);
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        kVar.invoke(httpRequestBuilder);
        return httpRequestBuilder;
    }

    private static final Object request$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object delete(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object delete$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object head(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object head$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object options(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object options$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object patch(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object patch$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object post(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object post$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object put(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object put$$forInline(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object request(HttpClient httpClient, String str, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersKt.request.7
                public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                    l.f("<this>", httpRequestBuilder);
                }

                @Override // e4.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((HttpRequestBuilder) obj2);
                    return C.a;
                }
            };
        }
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object request$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object request(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        BuildersWithUrlKt.url(httpRequestBuilder, url);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }
}
