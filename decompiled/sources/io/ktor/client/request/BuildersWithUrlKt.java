package io.ktor.client.request;

import O3.C;
import S3.c;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLUtilsKt;
import io.ktor.http.Url;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u000b\u0010\t\u001a2\u0010\f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\f\u0010\t\u001a2\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\r\u0010\t\u001a2\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u000e\u0010\t\u001a2\u0010\u000f\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u000f\u0010\t\u001a2\u0010\u0010\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0010\u0010\t\u001a2\u0010\u0011\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0011\u0010\t\u001a2\u0010\u0012\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0012\u0010\t\u001a2\u0010\u0013\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0013\u0010\t\u001a2\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0014\u0010\t\u001a2\u0010\u0015\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0015\u0010\t\u001a2\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0016\u0010\t\u001a2\u0010\u0017\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0086H¢\u0006\u0004\b\u0017\u0010\t\u001a\u0019\u0010\u0002\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/Url;", "url", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "LO3/C;", "block", "Lio/ktor/client/statement/HttpResponse;", "get", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Url;Le4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareGet", "post", "preparePost", "put", "preparePut", "patch", "preparePatch", "options", "prepareOptions", "head", "prepareHead", "delete", "prepareDelete", "(Lio/ktor/client/request/HttpRequestBuilder;Lio/ktor/http/Url;)V", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersWithUrlKt {
    public static final Object delete(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object delete$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getDelete());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object delete$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.delete.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getDelete());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object get(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object get$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object get$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.get.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object head(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object head$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getHead());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object head$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.head.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getHead());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object options(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object options$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getOptions());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object options$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.options.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getOptions());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object patch(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object patch$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPatch());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object patch$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.patch.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPatch());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object post(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object post$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPost());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object post$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.post.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPost());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareDelete(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareDelete$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareDelete$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareDelete.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareGet(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareGet$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareGet$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareGet.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareHead(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareHead$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareHead$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareHead.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object prepareOptions(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareOptions$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getOptions());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object prepareOptions$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.prepareOptions.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePatch(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePatch$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPatch());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePatch$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePatch.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePost(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePost$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePost$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePost.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object preparePut(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object preparePut$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPut());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object preparePut$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.preparePut.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object put(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object put$$forInline(HttpClient httpClient, Url url, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpMethod.Companion companion = HttpMethod.INSTANCE;
        httpRequestBuilder.setMethod(companion.getPut());
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static /* synthetic */ Object put$default(HttpClient httpClient, Url url, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.BuildersWithUrlKt.put.2
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
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
        kVar.invoke(httpRequestBuilder);
        httpRequestBuilder.setMethod(companion.getPut());
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final void url(HttpRequestBuilder httpRequestBuilder, Url url) {
        l.f("<this>", httpRequestBuilder);
        l.f("url", url);
        URLUtilsKt.takeFrom(httpRequestBuilder.getUrl(), url);
    }
}
