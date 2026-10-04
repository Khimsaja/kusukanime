package io.ktor.client.call;

import H5.A;
import S3.h;
import U3.c;
import U3.e;
import io.ktor.client.HttpClient;
import io.ktor.client.request.DefaultHttpRequest;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestData;
import io.ktor.client.request.HttpResponseData;
import io.ktor.client.statement.DefaultHttpResponse;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.InternalAPI;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 92\u00020\u0001:\u00019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R*\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001d8\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u001e\u0010&\u001a\u0004\b'\u0010(\"\u0004\b!\u0010 R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\u00178\u0006@DX\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010)\u001a\u0004\b*\u0010+\"\u0004\b\u001c\u0010\u001bR\u001a\u0010-\u001a\u00020,8\u0014X\u0094D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lio/ktor/client/call/HttpClientCall;", "LH5/A;", "Lio/ktor/client/HttpClient;", "client", "<init>", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestData;", "requestData", "Lio/ktor/client/request/HttpResponseData;", "responseData", "(Lio/ktor/client/HttpClient;Lio/ktor/client/request/HttpRequestData;Lio/ktor/client/request/HttpResponseData;)V", "Lio/ktor/utils/io/ByteReadChannel;", "getResponseContent", "(LS3/c;)Ljava/lang/Object;", "Lio/ktor/util/reflect/TypeInfo;", "info", "", "bodyNullable", "(Lio/ktor/util/reflect/TypeInfo;LS3/c;)Ljava/lang/Object;", "body", "", "toString", "()Ljava/lang/String;", "Lio/ktor/client/statement/HttpResponse;", "response", "LO3/C;", "setResponse$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;)V", "setResponse", "Lio/ktor/client/request/HttpRequest;", "request", "setRequest$ktor_client_core", "(Lio/ktor/client/request/HttpRequest;)V", "setRequest", "Lio/ktor/client/HttpClient;", "getClient", "()Lio/ktor/client/HttpClient;", "value", "Lio/ktor/client/request/HttpRequest;", "getRequest", "()Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "getResponse", "()Lio/ktor/client/statement/HttpResponse;", "", "allowDoubleReceive", "Z", "getAllowDoubleReceive", "()Z", "LS3/h;", "getCoroutineContext", "()LS3/h;", "coroutineContext", "Lio/ktor/util/Attributes;", "getAttributes", "()Lio/ktor/util/Attributes;", "attributes", "Companion", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class HttpClientCall implements A {
    private static final AttributeKey<Object> CustomResponse;
    private static final /* synthetic */ AtomicIntegerFieldUpdater received$FU;
    private final boolean allowDoubleReceive;
    private final HttpClient client;
    private volatile /* synthetic */ int received;
    protected HttpRequest request;
    protected HttpResponse response;

    @e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {125}, m = "body")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.call.HttpClientCall$body$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.body(null, this);
        }
    }

    @e(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {96, 99}, m = "bodyNullable")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.call.HttpClientCall$bodyNullable$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11561 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11561(S3.c<? super C11561> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpClientCall.this.bodyNullable(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(Object.class);
        try {
            interfaceC1444wA = y.a(Object.class);
        } catch (Throwable unused) {
        }
        CustomResponse = new AttributeKey<>("CustomResponse", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
        received$FU = AtomicIntegerFieldUpdater.newUpdater(HttpClientCall.class, "received");
    }

    public HttpClientCall(HttpClient httpClient) {
        l.f("client", httpClient);
        this.client = httpClient;
        this.received = 0;
    }

    public static /* synthetic */ Object getResponseContent$suspendImpl(HttpClientCall httpClientCall, S3.c<? super ByteReadChannel> cVar) {
        return httpClientCall.getResponse().getRawContent();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object body(io.ktor.util.reflect.TypeInfo r5, S3.c<java.lang.Object> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.call.HttpClientCall.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.call.HttpClientCall$body$1 r0 = (io.ktor.client.call.HttpClientCall.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.HttpClientCall$body$1 r0 = new io.ktor.client.call.HttpClientCall$body$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            r0.label = r3
            java.lang.Object r6 = r4.bodyNullable(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            kotlin.jvm.internal.l.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.body(io.ktor.util.reflect.TypeInfo, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object bodyNullable(io.ktor.util.reflect.TypeInfo r6, S3.c<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.call.HttpClientCall.C11561
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.call.HttpClientCall$bodyNullable$1 r0 = (io.ktor.client.call.HttpClientCall.C11561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.call.HttpClientCall$bodyNullable$1 r0 = new io.ktor.client.call.HttpClientCall$bodyNullable$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$0
            io.ktor.util.reflect.TypeInfo r6 = (io.ktor.util.reflect.TypeInfo) r6
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L2f
            goto La5
        L2f:
            r6 = move-exception
            goto Ldb
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            io.ktor.util.reflect.TypeInfo r6 = (io.ktor.util.reflect.TypeInfo) r6
            P3.r.Y(r7)     // Catch: java.lang.Throwable -> L2f
            goto L8f
        L42:
            P3.r.Y(r7)
            io.ktor.client.statement.HttpResponse r7 = r5.getResponse()     // Catch: java.lang.Throwable -> L2f
            l4.d r2 = r6.getType()     // Catch: java.lang.Throwable -> L2f
            boolean r7 = io.ktor.util.reflect.TypeInfoJvmKt.instanceOf(r7, r2)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L58
            io.ktor.client.statement.HttpResponse r6 = r5.getResponse()     // Catch: java.lang.Throwable -> L2f
            return r6
        L58:
            boolean r7 = r5.getAllowDoubleReceive()     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L78
            io.ktor.client.statement.HttpResponse r7 = r5.getResponse()     // Catch: java.lang.Throwable -> L2f
            boolean r7 = io.ktor.client.plugins.DoubleReceivePluginKt.isSaved(r7)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L78
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = io.ktor.client.call.HttpClientCall.received$FU     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r4)     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L72
            goto L78
        L72:
            io.ktor.client.call.DoubleReceiveException r6 = new io.ktor.client.call.DoubleReceiveException     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L2f
        L78:
            io.ktor.util.Attributes r7 = r5.getAttributes()     // Catch: java.lang.Throwable -> L2f
            io.ktor.util.AttributeKey<java.lang.Object> r2 = io.ktor.client.call.HttpClientCall.CustomResponse     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.getOrNull(r2)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L8f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.label = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r5.getResponseContent(r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto L8f
            goto La4
        L8f:
            io.ktor.client.statement.HttpResponseContainer r2 = new io.ktor.client.statement.HttpResponseContainer     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r6, r7)     // Catch: java.lang.Throwable -> L2f
            io.ktor.client.HttpClient r7 = r5.client     // Catch: java.lang.Throwable -> L2f
            io.ktor.client.statement.HttpResponsePipeline r7 = r7.getResponsePipeline()     // Catch: java.lang.Throwable -> L2f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.execute(r5, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r1) goto La5
        La4:
            return r1
        La5:
            io.ktor.client.statement.HttpResponseContainer r7 = (io.ktor.client.statement.HttpResponseContainer) r7     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.getResponse()     // Catch: java.lang.Throwable -> L2f
            io.ktor.http.content.NullBody r0 = io.ktor.http.content.NullBody.INSTANCE     // Catch: java.lang.Throwable -> L2f
            boolean r0 = kotlin.jvm.internal.l.a(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto Lb4
            goto Lb5
        Lb4:
            r7 = 0
        Lb5:
            if (r7 == 0) goto Lda
            l4.d r0 = r6.getType()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = io.ktor.util.reflect.TypeInfoJvmKt.instanceOf(r7, r0)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto Lc2
            goto Lda
        Lc2:
            java.lang.Class r7 = r7.getClass()     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.z r0 = kotlin.jvm.internal.y.a     // Catch: java.lang.Throwable -> L2f
            l4.d r7 = r0.b(r7)     // Catch: java.lang.Throwable -> L2f
            l4.d r6 = r6.getType()     // Catch: java.lang.Throwable -> L2f
            io.ktor.client.call.NoTransformationFoundException r0 = new io.ktor.client.call.NoTransformationFoundException     // Catch: java.lang.Throwable -> L2f
            io.ktor.client.statement.HttpResponse r1 = r5.getResponse()     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1, r7, r6)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        Lda:
            return r7
        Ldb:
            io.ktor.client.statement.HttpResponse r7 = r5.getResponse()
            java.lang.String r0 = "Receive failed"
            java.util.concurrent.CancellationException r0 = H5.D.a(r0, r6)
            H5.D.h(r7, r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.call.HttpClientCall.bodyNullable(io.ktor.util.reflect.TypeInfo, S3.c):java.lang.Object");
    }

    public boolean getAllowDoubleReceive() {
        return this.allowDoubleReceive;
    }

    public final Attributes getAttributes() {
        return getRequest().getAttributes();
    }

    public final HttpClient getClient() {
        return this.client;
    }

    @Override // H5.A
    public h getCoroutineContext() {
        return getResponse().getCoroutineContext();
    }

    public final HttpRequest getRequest() {
        HttpRequest httpRequest = this.request;
        if (httpRequest != null) {
            return httpRequest;
        }
        l.l("request");
        throw null;
    }

    public final HttpResponse getResponse() {
        HttpResponse httpResponse = this.response;
        if (httpResponse != null) {
            return httpResponse;
        }
        l.l("response");
        throw null;
    }

    public Object getResponseContent(S3.c<? super ByteReadChannel> cVar) {
        return getResponseContent$suspendImpl(this, cVar);
    }

    public final void setRequest(HttpRequest httpRequest) {
        l.f("<set-?>", httpRequest);
        this.request = httpRequest;
    }

    public final void setRequest$ktor_client_core(HttpRequest request) {
        l.f("request", request);
        setRequest(request);
    }

    public final void setResponse(HttpResponse httpResponse) {
        l.f("<set-?>", httpResponse);
        this.response = httpResponse;
    }

    public final void setResponse$ktor_client_core(HttpResponse response) {
        l.f("response", response);
        setResponse(response);
    }

    public String toString() {
        return "HttpClientCall[" + getRequest().getUrl() + ", " + getResponse().getStatus() + ']';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InternalAPI
    public HttpClientCall(HttpClient httpClient, HttpRequestData httpRequestData, HttpResponseData httpResponseData) {
        this(httpClient);
        l.f("client", httpClient);
        l.f("requestData", httpRequestData);
        l.f("responseData", httpResponseData);
        setRequest(new DefaultHttpRequest(this, httpRequestData));
        setResponse(new DefaultHttpResponse(this, httpResponseData));
        Attributes attributes = getAttributes();
        AttributeKey<Object> attributeKey = CustomResponse;
        attributes.remove(attributeKey);
        if (httpResponseData.getBody() instanceof ByteReadChannel) {
            return;
        }
        getAttributes().put(attributeKey, httpResponseData.getBody());
    }
}
