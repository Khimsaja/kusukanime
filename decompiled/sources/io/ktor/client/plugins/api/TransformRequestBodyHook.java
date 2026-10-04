package io.ktor.client.plugins.api;

import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import e4.q;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002:\u00126\u00124\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJQ\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b28\u0010\r\u001a4\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/TransformRequestBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformRequestBodyContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lio/ktor/util/reflect/TypeInfo;", "LS3/c;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/q;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformRequestBodyHook implements ClientHook<q> {
    public static final TransformRequestBodyHook INSTANCE = new TransformRequestBodyHook();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", f = "KtorCallContexts.kt", l = {87, 88}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.api.TransformRequestBodyHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ q $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = qVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            if (r1.proceedWith(r11, r10) == r0) goto L17;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                P3.r.Y(r11)
                r9 = r10
                goto L5f
            L11:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L19:
                java.lang.Object r1 = r10.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                P3.r.Y(r11)
                r9 = r10
                goto L4f
            L22:
                P3.r.Y(r11)
                java.lang.Object r11 = r10.L$0
                r1 = r11
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                e4.q r4 = r10.$handler
                io.ktor.client.plugins.api.TransformRequestBodyContext r5 = new io.ktor.client.plugins.api.TransformRequestBodyContext
                r5.<init>()
                java.lang.Object r6 = r1.getContext()
                java.lang.Object r7 = r1.getSubject()
                java.lang.Object r11 = r1.getContext()
                io.ktor.client.request.HttpRequestBuilder r11 = (io.ktor.client.request.HttpRequestBuilder) r11
                io.ktor.util.reflect.TypeInfo r8 = r11.getBodyType()
                r10.L$0 = r1
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.invoke(r5, r6, r7, r8, r9)
                if (r11 != r0) goto L4f
                goto L5e
            L4f:
                io.ktor.http.content.OutgoingContent r11 = (io.ktor.http.content.OutgoingContent) r11
                if (r11 == 0) goto L5f
                r3 = 0
                r9.L$0 = r3
                r9.label = r2
                java.lang.Object r11 = r1.proceedWith(r11, r10)
                if (r11 != r0) goto L5f
            L5e:
                return r0
            L5f:
                O3.C r11 = O3.C.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.api.TransformRequestBodyHook.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private TransformRequestBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, q handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getTransform(), new AnonymousClass1(handler, null));
    }
}
