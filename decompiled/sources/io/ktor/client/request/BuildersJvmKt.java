package io.ktor.client.request;

import O3.C;
import S3.c;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLUtilsJvmKt;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\n\u0010\t\u001a2\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u000b\u0010\t\u001a2\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\f\u0010\t\u001a2\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\r\u0010\t\u001a2\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u000e\u0010\t\u001a2\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u000f\u0010\t\u001a2\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0010\u0010\t\u001a2\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0012\u0010\t\u001a2\u0010\u0013\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0013\u0010\t\u001a2\u0010\u0014\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0014\u0010\t\u001a2\u0010\u0015\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0015\u0010\t\u001a2\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0016\u0010\t\u001a2\u0010\u0017\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0017\u0010\t\u001a2\u0010\u0018\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0018\u0010\t\u001a2\u0010\u0019\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086@¢\u0006\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lio/ktor/client/HttpClient;", "Ljava/net/URL;", "url", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "LO3/C;", "block", "Lio/ktor/client/statement/HttpResponse;", "request", "(Lio/ktor/client/HttpClient;Ljava/net/URL;Le4/k;LS3/c;)Ljava/lang/Object;", "get", "post", "put", "patch", "options", "head", "delete", "Lio/ktor/client/statement/HttpStatement;", "prepareRequest", "prepareGet", "preparePost", "preparePut", "preparePatch", "prepareOptions", "prepareHead", "prepareDelete", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersJvmKt {
    public static final Object delete(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object delete$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(20);
        }
        return delete(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C delete$lambda$14(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object get(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object get$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(4);
        }
        return get(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C get$lambda$2(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object head(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object head$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(0);
        }
        return head(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C head$lambda$12(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object options(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object options$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(28);
        }
        return options(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C options$lambda$10(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object patch(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object patch$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(29);
        }
        return patch(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C patch$lambda$8(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object post(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object post$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(2);
        }
        return post(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C post$lambda$4(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareDelete(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareDelete$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(23);
        }
        return prepareDelete(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareDelete$lambda$30(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareGet(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareGet$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(25);
        }
        return prepareGet(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareGet$lambda$18(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareHead(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareHead$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(3);
        }
        return prepareHead(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareHead$lambda$28(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareOptions(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareOptions$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(19);
        }
        return prepareOptions(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareOptions$lambda$26(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object preparePatch(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePatch$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(26);
        }
        return preparePatch(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C preparePatch$lambda$24(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object preparePost(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePost$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(21);
        }
        return preparePost(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C preparePost$lambda$20(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object preparePut(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePut$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(22);
        }
        return preparePut(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C preparePut$lambda$22(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareRequest(HttpClient httpClient, URL url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareRequest$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(1);
        }
        return prepareRequest(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareRequest$lambda$16(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object put(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object put$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(24);
        }
        return put(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C put$lambda$6(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object request(HttpClient httpClient, URL url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsJvmKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object request$default(HttpClient httpClient, URL url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(27);
        }
        return request(httpClient, url, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C request$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }
}
