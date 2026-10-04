package io.ktor.client.plugins;

import O3.C;
import P3.q;
import S3.h;
import e4.k;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.CreatePluginUtilsKt;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.plugins.api.SetupRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.Headers;
import io.ktor.http.HttpMethod;
import io.ktor.http.Url;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.reflect.TypeInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00060\fj\u0002`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"(\u0010 \u001a\u00020\u0016*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f*B\u0010%\"\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!2\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!*B\u0010'\"\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!2\u001e\b\u0001\u0012\u0004\u0012\u00020&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0!*N\u0010)\"$\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0(2$\b\u0001\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0#\u0012\u0006\u0012\u0004\u0018\u00010$0(¨\u0006*"}, d2 = {"Lio/ktor/client/request/HttpRequestBuilder;", "builder", "Lio/ktor/client/request/HttpRequest;", "HttpRequest", "(Lio/ktor/client/request/HttpRequestBuilder;)Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/HttpCallValidatorConfig;", "LO3/C;", "block", "HttpResponseValidator", "(Lio/ktor/client/HttpClientConfig;Le4/k;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "Lio/ktor/client/plugins/api/ClientPlugin;", "HttpCallValidator", "Lio/ktor/client/plugins/api/ClientPlugin;", "getHttpCallValidator", "()Lio/ktor/client/plugins/api/ClientPlugin;", "Lio/ktor/util/AttributeKey;", "", "ExpectSuccessAttributeKey", "Lio/ktor/util/AttributeKey;", "getExpectSuccessAttributeKey", "()Lio/ktor/util/AttributeKey;", "value", "getExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;)Z", "setExpectSuccess", "(Lio/ktor/client/request/HttpRequestBuilder;Z)V", "expectSuccess", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "LS3/c;", "", "ResponseValidator", "", "CallExceptionHandler", "Lkotlin/Function3;", "CallRequestExceptionHandler", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCallValidatorKt {
    private static final AttributeKey<Boolean> ExpectSuccessAttributeKey;
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.HttpCallValidator");
    private static final ClientPlugin<HttpCallValidatorConfig> HttpCallValidator = CreatePluginUtilsKt.createClientPlugin("HttpResponseValidator", HttpCallValidatorKt$HttpCallValidator$1.INSTANCE, new io.ktor.client.b(11));

    static {
        InterfaceC1444w interfaceC1444wA;
        InterfaceC1425d interfaceC1425dB = y.a.b(Boolean.class);
        try {
            interfaceC1444wA = y.a(Boolean.TYPE);
        } catch (Throwable unused) {
            interfaceC1444wA = null;
        }
        ExpectSuccessAttributeKey = new AttributeKey<>("ExpectSuccessAttributeKey", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C HttpCallValidator$lambda$2(ClientPluginBuilder clientPluginBuilder) {
        l.f("$this$createClientPlugin", clientPluginBuilder);
        List listI0 = q.I0(((HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getResponseValidators$ktor_client_core());
        List listI02 = q.I0(((HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getResponseExceptionHandlers$ktor_client_core());
        clientPluginBuilder.on(SetupRequest.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$1(((HttpCallValidatorConfig) clientPluginBuilder.getPluginConfig()).getExpectSuccess(), null));
        clientPluginBuilder.on(Send.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$2(listI0, null));
        clientPluginBuilder.on(RequestError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$3(listI02, null));
        clientPluginBuilder.on(ReceiveError.INSTANCE, new HttpCallValidatorKt$HttpCallValidator$2$4(listI02, null));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        if (r10.invoke(r8, r9, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:
    
        r6 = r9;
        r9 = r8;
        r8 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object HttpCallValidator$lambda$2$processException(java.util.List<? extends io.ktor.client.plugins.HandlerWrapper> r7, java.lang.Throwable r8, io.ktor.client.request.HttpRequest r9, S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$processException$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L2f
            if (r2 != r3) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            io.ktor.client.request.HttpRequest r8 = (io.ktor.client.request.HttpRequest) r8
            java.lang.Object r9 = r0.L$0
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            P3.r.Y(r10)
            goto L8d
        L3f:
            P3.r.Y(r10)
            z6.b r10 = io.ktor.client.plugins.HttpCallValidatorKt.LOGGER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Processing exception "
            r2.<init>(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            io.ktor.http.Url r5 = r9.getUrl()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.e(r2)
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Lb0
            java.lang.Object r10 = r7.next()
            io.ktor.client.plugins.HandlerWrapper r10 = (io.ktor.client.plugins.HandlerWrapper) r10
            boolean r2 = r10 instanceof io.ktor.client.plugins.ExceptionHandlerWrapper
            if (r2 == 0) goto L91
            io.ktor.client.plugins.ExceptionHandlerWrapper r10 = (io.ktor.client.plugins.ExceptionHandlerWrapper) r10
            e4.n r10 = r10.getHandler()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r10 = r10.invoke(r8, r0)
            if (r10 != r1) goto L8a
            goto La9
        L8a:
            r6 = r9
            r9 = r8
            r8 = r6
        L8d:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L65
        L91:
            boolean r2 = r10 instanceof io.ktor.client.plugins.RequestExceptionHandlerWrapper
            if (r2 == 0) goto Laa
            io.ktor.client.plugins.RequestExceptionHandlerWrapper r10 = (io.ktor.client.plugins.RequestExceptionHandlerWrapper) r10
            e4.o r10 = r10.getHandler()
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r10 = r10.invoke(r8, r9, r0)
            if (r10 != r1) goto L8a
        La9:
            return r1
        Laa:
            D6.r r7 = new D6.r
            r7.<init>()
            throw r7
        Lb0:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$processException(java.util.List, java.lang.Throwable, io.ktor.client.request.HttpRequest, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object HttpCallValidator$lambda$2$validateResponse(java.util.List<? extends e4.n> r5, io.ktor.client.statement.HttpResponse r6, S3.c<? super O3.C> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = (io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1 r0 = new io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$validateResponse$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            io.ktor.client.statement.HttpResponse r6 = (io.ktor.client.statement.HttpResponse) r6
            P3.r.Y(r7)
            goto L5d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            P3.r.Y(r7)
            z6.b r7 = io.ktor.client.plugins.HttpCallValidatorKt.LOGGER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Validating response for request "
            r2.<init>(r4)
            io.ktor.client.call.HttpClientCall r4 = r6.getCall()
            io.ktor.client.request.HttpRequest r4 = r4.getRequest()
            io.ktor.http.Url r4 = r4.getUrl()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.e(r2)
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L76
            java.lang.Object r7 = r5.next()
            e4.n r7 = (e4.n) r7
            r0.L$0 = r6
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L5d
            return r1
        L76:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpCallValidatorKt.HttpCallValidator$lambda$2$validateResponse(java.util.List, io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpRequest HttpRequest(HttpRequestBuilder httpRequestBuilder) {
        return new HttpRequest() { // from class: io.ktor.client.plugins.HttpCallValidatorKt.HttpRequest.1
            private final Attributes attributes;
            private final Headers headers;
            private final HttpMethod method;
            private final Url url;

            {
                this.method = this.$builder.getMethod();
                this.url = this.$builder.getUrl().build();
                this.attributes = this.$builder.getAttributes();
                this.headers = this.$builder.getHeaders().build();
            }

            @Override // io.ktor.client.request.HttpRequest
            public Attributes getAttributes() {
                return this.attributes;
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpClientCall getCall() {
                throw new IllegalStateException("Call is not initialized");
            }

            @Override // io.ktor.client.request.HttpRequest
            public OutgoingContent getContent() {
                Object body = this.$builder.getBody();
                OutgoingContent outgoingContent = body instanceof OutgoingContent ? (OutgoingContent) body : null;
                if (outgoingContent != null) {
                    return outgoingContent;
                }
                throw new IllegalStateException(("Content was not transformed to OutgoingContent yet. Current body is " + this.$builder.getBody()).toString());
            }

            @Override // io.ktor.client.request.HttpRequest, H5.A
            public h getCoroutineContext() {
                return HttpRequest.DefaultImpls.getCoroutineContext(this);
            }

            @Override // io.ktor.http.HttpMessage
            public Headers getHeaders() {
                return this.headers;
            }

            @Override // io.ktor.client.request.HttpRequest
            public HttpMethod getMethod() {
                return this.method;
            }

            @Override // io.ktor.client.request.HttpRequest
            public Url getUrl() {
                return this.url;
            }
        };
    }

    public static final void HttpResponseValidator(HttpClientConfig<?> httpClientConfig, k kVar) {
        l.f("<this>", httpClientConfig);
        l.f("block", kVar);
        httpClientConfig.install(HttpCallValidator, kVar);
    }

    public static final boolean getExpectSuccess(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        Boolean bool = (Boolean) httpRequestBuilder.getAttributes().getOrNull(ExpectSuccessAttributeKey);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final AttributeKey<Boolean> getExpectSuccessAttributeKey() {
        return ExpectSuccessAttributeKey;
    }

    public static final ClientPlugin<HttpCallValidatorConfig> getHttpCallValidator() {
        return HttpCallValidator;
    }

    public static final void setExpectSuccess(HttpRequestBuilder httpRequestBuilder, boolean z7) {
        l.f("<this>", httpRequestBuilder);
        httpRequestBuilder.getAttributes().put(ExpectSuccessAttributeKey, Boolean.valueOf(z7));
    }
}
