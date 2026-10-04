package io.ktor.client.plugins;

import H5.h0;
import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.ContentType;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.OutgoingContent;
import io.ktor.http.content.TextContent;
import io.ktor.util.logging.KtorSimpleLoggerJvmKt;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/client/HttpClient;", "LO3/C;", "defaultTransformers", "(Lio/ktor/client/HttpClient;)V", "Lz6/b;", "Lio/ktor/util/logging/Logger;", "LOGGER", "Lz6/b;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultTransformKt {
    private static final z6.b LOGGER = KtorSimpleLoggerJvmKt.KtorSimpleLogger("io.ktor.client.plugins.defaultTransformers");

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "body", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1", f = "DefaultTransform.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            OutgoingContent outgoingContentPlatformRequestDefaultTransform;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                final PipelineContext pipelineContext = (PipelineContext) this.L$0;
                final Object obj2 = this.L$1;
                HeadersBuilder headers = ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders();
                HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
                if (headers.get(httpHeaders.getAccept()) == null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().append(httpHeaders.getAccept(), "*/*");
                }
                final ContentType contentType = HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (contentType == null) {
                        contentType = ContentType.Text.INSTANCE.getPlain();
                    }
                    outgoingContentPlatformRequestDefaultTransform = new TextContent(str, contentType, null, 4, null);
                } else {
                    outgoingContentPlatformRequestDefaultTransform = obj2 instanceof byte[] ? new OutgoingContent.ByteArrayContent(contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$1
                        final /* synthetic */ Object $body;
                        private final long contentLength;
                        private final ContentType contentType;

                        {
                            this.$body = obj2;
                            this.contentType = contentType == null ? ContentType.Application.INSTANCE.getOctetStream() : contentType;
                            this.contentLength = ((byte[]) obj2).length;
                        }

                        @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
                        /* renamed from: bytes */
                        public byte[] getContent() {
                            return (byte[]) this.$body;
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public Long getContentLength() {
                            return Long.valueOf(this.contentLength);
                        }

                        @Override // io.ktor.http.content.OutgoingContent
                        public ContentType getContentType() {
                            return this.contentType;
                        }
                    } : obj2 instanceof ByteReadChannel ? new OutgoingContent.ReadChannelContent(pipelineContext, contentType, obj2) { // from class: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$1$content$2
                        final /* synthetic */ Object $body;
                        private final Long contentLength;
                        private final ContentType contentType;

                        {
                            this.$body = obj2;
                            String str2 = pipelineContext.getContext().getHeaders().get(HttpHeaders.INSTANCE.getContentLength());
                            this.contentLength = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
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
                            return (ByteReadChannel) this.$body;
                        }
                    } : obj2 instanceof OutgoingContent ? (OutgoingContent) obj2 : DefaultTransformersJvmKt.platformRequestDefaultTransform(contentType, (HttpRequestBuilder) pipelineContext.getContext(), obj2);
                }
                if ((outgoingContentPlatformRequestDefaultTransform != null ? outgoingContentPlatformRequestDefaultTransform.getContentType() : null) != null) {
                    ((HttpRequestBuilder) pipelineContext.getContext()).getHeaders().remove(httpHeaders.getContentType());
                    DefaultTransformKt.LOGGER.e("Transformed with default transformers request body for " + ((HttpRequestBuilder) pipelineContext.getContext()).getUrl() + " from " + y.a.b(obj2.getClass()));
                    this.L$0 = null;
                    this.label = 1;
                    if (pipelineContext.proceedWith(outgoingContentPlatformRequestDefaultTransform, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "<destruct>", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2", f = "DefaultTransform.kt", l = {72, 76, 76, 81, 81, 85, 92, 116, 121, 137}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.DefaultTransformKt$defaultTransformers$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements o {
        final /* synthetic */ HttpClient $this_defaultTransformers;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpClient httpClient, S3.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
            this.$this_defaultTransformers = httpClient;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$1$lambda$0(H5.r rVar, Throwable th) {
            ((h0) rVar).Z();
            return C.a;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, S3.c<? super C> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_defaultTransformers, cVar);
            anonymousClass2.L$0 = pipelineContext;
            anonymousClass2.L$1 = httpResponseContainer;
            return anonymousClass2.invokeSuspend(C.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x033f  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0347  */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 914
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.DefaultTransformKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void defaultTransformers(HttpClient httpClient) {
        l.f("<this>", httpClient);
        httpClient.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new AnonymousClass1(null));
        httpClient.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getParse(), new AnonymousClass2(httpClient, null));
        DefaultTransformersJvmKt.platformResponseDefaultTransformers(httpClient);
    }
}
