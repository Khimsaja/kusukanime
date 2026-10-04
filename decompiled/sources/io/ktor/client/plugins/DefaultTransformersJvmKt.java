package io.ktor.client.plugins;

import H5.C0263e0;
import H5.InterfaceC0265f0;
import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.HttpHeaders;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.BlockingKt;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lio/ktor/client/HttpClient;", "LO3/C;", "platformResponseDefaultTransformers", "(Lio/ktor/client/HttpClient;)V", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/client/request/HttpRequestBuilder;", "context", "", "body", "Lio/ktor/http/content/OutgoingContent;", "platformRequestDefaultTransform", "(Lio/ktor/http/ContentType;Lio/ktor/client/request/HttpRequestBuilder;Ljava/lang/Object;)Lio/ktor/http/content/OutgoingContent;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTransformersJvmKt {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1", f = "DefaultTransformersJvm.kt", l = {33}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11611 extends j implements o {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C11611(S3.c<? super C11611> cVar) {
            super(3, cVar);
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, S3.c<? super C> cVar) {
            C11611 c11611 = new C11611(cVar);
            c11611.L$0 = pipelineContext;
            c11611.L$1 = httpResponseContainer;
            return c11611.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            C c2 = C.a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return c2;
            }
            r.Y(obj);
            PipelineContext pipelineContext = (PipelineContext) this.L$0;
            HttpResponseContainer httpResponseContainer = (HttpResponseContainer) this.L$1;
            TypeInfo expectedType = httpResponseContainer.getExpectedType();
            Object response = httpResponseContainer.getResponse();
            if ((response instanceof ByteReadChannel) && l.a(expectedType.getType(), y.a.b(InputStream.class))) {
                final InputStream inputStream = BlockingKt.toInputStream((ByteReadChannel) response, (InterfaceC0265f0) ((HttpClientCall) pipelineContext.getContext()).getCoroutineContext().get(C0263e0.f3843k));
                HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(expectedType, new InputStream() { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt$platformResponseDefaultTransformers$1$response$1
                    @Override // java.io.InputStream
                    public int available() {
                        return inputStream.available();
                    }

                    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
                    public void close() throws IOException {
                        super.close();
                        inputStream.close();
                    }

                    @Override // java.io.InputStream
                    public int read() {
                        return inputStream.read();
                    }

                    @Override // java.io.InputStream
                    public int read(byte[] b4, int off, int len) {
                        l.f("b", b4);
                        return inputStream.read(b4, off, len);
                    }
                });
                this.L$0 = null;
                this.label = 1;
                if (pipelineContext.proceedWith(httpResponseContainer2, this) == aVar) {
                    return aVar;
                }
            }
            return c2;
        }
    }

    public static final OutgoingContent platformRequestDefaultTransform(ContentType contentType, HttpRequestBuilder httpRequestBuilder, Object obj) {
        l.f("context", httpRequestBuilder);
        l.f("body", obj);
        if (obj instanceof InputStream) {
            return new OutgoingContent.ReadChannelContent(httpRequestBuilder, contentType, obj) { // from class: io.ktor.client.plugins.DefaultTransformersJvmKt.platformRequestDefaultTransform.1
                final /* synthetic */ Object $body;
                private final Long contentLength;
                private final ContentType contentType;

                {
                    this.$body = obj;
                    String str = httpRequestBuilder.getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                    this.contentLength = str != null ? Long.valueOf(Long.parseLong(str)) : null;
                    this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public Long getContentLength() {
                    return this.contentLength;
                }

                @Override // io.ktor.http.content.OutgoingContent
                public ContentType getContentType() {
                    return this.contentType;
                }

                @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
                public ByteReadChannel readFrom() {
                    return ReadingKt.toByteReadChannelWithArrayPool$default((InputStream) this.$body, null, null, 3, null);
                }
            };
        }
        return null;
    }

    public static final void platformResponseDefaultTransformers(HttpClient httpClient) {
        l.f("<this>", httpClient);
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getParse(), new C11611(null));
    }
}
