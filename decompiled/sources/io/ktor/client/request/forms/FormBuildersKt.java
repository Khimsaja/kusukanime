package io.ktor.client.request.forms;

import O3.C;
import S3.c;
import b1.AbstractC0703b;
import e4.k;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.Parameters;
import io.ktor.http.content.PartData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001aF\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086@¢\u0006\u0004\b\n\u0010\u000e\u001a8\u0010\u0012\u001a\u00020\t*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0012\u001a\u00020\t*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\u0012\u0010\u0014\u001a>\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\u0016\u0010\u000b\u001aF\u0010\u0016\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086@¢\u0006\u0004\b\u0016\u0010\u000e\u001a8\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0006\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\u0017\u0010\u0013\u001a@\u0010\u0017\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0014\b\u0006\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0086H¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lio/ktor/client/HttpClient;", "Lio/ktor/http/Parameters;", "formParameters", "", "encodeInQuery", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "LO3/C;", "block", "Lio/ktor/client/statement/HttpResponse;", "submitForm", "(Lio/ktor/client/HttpClient;Lio/ktor/http/Parameters;ZLe4/k;LS3/c;)Ljava/lang/Object;", "", "url", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Lio/ktor/http/Parameters;ZLe4/k;LS3/c;)Ljava/lang/Object;", "", "Lio/ktor/http/content/PartData;", "formData", "submitFormWithBinaryData", "(Lio/ktor/client/HttpClient;Ljava/util/List;Le4/k;LS3/c;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Ljava/util/List;Le4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/statement/HttpStatement;", "prepareForm", "prepareFormWithBinaryData", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FormBuildersKt {
    public static final Object prepareForm(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object prepareForm$$forInline(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static Object prepareForm$default(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            parameters = Parameters.INSTANCE.getEmpty();
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.prepareForm.2
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
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C prepareForm$lambda$6(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object prepareFormWithBinaryData(HttpClient httpClient, List<? extends PartData> list, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    private static final Object prepareFormWithBinaryData$$forInline(HttpClient httpClient, List<? extends PartData> list, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static Object prepareFormWithBinaryData$default(HttpClient httpClient, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.prepareFormWithBinaryData.2
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
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static final Object submitForm(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object submitForm$$forInline(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static Object submitForm$default(HttpClient httpClient, Parameters parameters, boolean z7, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            parameters = Parameters.INSTANCE.getEmpty();
        }
        if ((i7 & 2) != 0) {
            z7 = false;
        }
        if ((i7 & 4) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.submitForm.2
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
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C submitForm$lambda$1(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object submitFormWithBinaryData(HttpClient httpClient, List<? extends PartData> list, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    private static final Object submitFormWithBinaryData$$forInline(HttpClient httpClient, List<? extends PartData> list, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static Object submitFormWithBinaryData$default(HttpClient httpClient, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.submitFormWithBinaryData.2
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
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object prepareFormWithBinaryData(HttpClient httpClient, String str, List<? extends PartData> list, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    private static final Object prepareFormWithBinaryData$$forInline(HttpClient httpClient, String str, List<? extends PartData> list, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static Object prepareFormWithBinaryData$default(HttpClient httpClient, String str, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.prepareFormWithBinaryData.5
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
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        return AbstractC0703b.e(kVar, httpRequestBuilder, httpRequestBuilder, httpClient);
    }

    public static final Object submitForm(HttpClient httpClient, String str, Parameters parameters, boolean z7, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return AbstractC0703b.f(httpClient, httpRequestBuilder, cVar);
    }

    public static final Object submitFormWithBinaryData(HttpClient httpClient, String str, List<? extends PartData> list, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    private static final Object submitFormWithBinaryData$$forInline(HttpClient httpClient, String str, List<? extends PartData> list, k kVar, c<? super HttpResponse> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static final Object prepareForm(HttpClient httpClient, String str, Parameters parameters, boolean z7, k kVar, c<? super HttpStatement> cVar) {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        if (z7) {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
            httpRequestBuilder.getUrl().getParameters().appendAll(parameters);
        } else {
            httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
            httpRequestBuilder.setBody(new FormDataContent(parameters));
            httpRequestBuilder.setBodyType(null);
        }
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient);
    }

    public static /* synthetic */ Object submitForm$default(HttpClient httpClient, String str, Parameters parameters, boolean z7, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            parameters = Parameters.INSTANCE.getEmpty();
        }
        Parameters parameters2 = parameters;
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        boolean z8 = z7;
        if ((i7 & 8) != 0) {
            kVar = new io.ktor.client.request.a(8);
        }
        return submitForm(httpClient, str, parameters2, z8, kVar, cVar);
    }

    public static Object submitFormWithBinaryData$default(HttpClient httpClient, String str, List list, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new k() { // from class: io.ktor.client.request.forms.FormBuildersKt.submitFormWithBinaryData.5
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
        httpRequestBuilder.setBody(new MultiPartFormDataContent(list, null, null, 6, null));
        httpRequestBuilder.setBodyType(null);
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        return new HttpStatement(httpRequestBuilder, httpClient).execute(cVar);
    }

    public static /* synthetic */ Object prepareForm$default(HttpClient httpClient, String str, Parameters parameters, boolean z7, k kVar, c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            parameters = Parameters.INSTANCE.getEmpty();
        }
        Parameters parameters2 = parameters;
        if ((i7 & 4) != 0) {
            z7 = false;
        }
        boolean z8 = z7;
        if ((i7 & 8) != 0) {
            kVar = new io.ktor.client.request.a(7);
        }
        return prepareForm(httpClient, str, parameters2, z8, kVar, cVar);
    }
}
