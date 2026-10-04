package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002,\u0012(\u0012&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2*\u0010\u000b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/RenderRequestHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "LS3/c;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RenderRequestHook implements ClientHook<o> {
    public static final RenderRequestHook INSTANCE = new RenderRequestHook();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.RenderRequestHook$install$1", f = "HttpPlainText.kt", l = {155, 156}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.RenderRequestHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ o $handler;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = oVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = obj;
            return anonymousClass1.invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r1.proceedWith(r7, r6) == r0) goto L17;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r6.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                P3.r.Y(r7)
                goto L4b
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                java.lang.Object r1 = r6.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                P3.r.Y(r7)
                goto L3b
            L20:
                P3.r.Y(r7)
                java.lang.Object r7 = r6.L$0
                r1 = r7
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                java.lang.Object r7 = r6.L$1
                e4.o r4 = r6.$handler
                java.lang.Object r5 = r1.getContext()
                r6.L$0 = r1
                r6.label = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L3b
                goto L4a
            L3b:
                io.ktor.http.content.OutgoingContent r7 = (io.ktor.http.content.OutgoingContent) r7
                if (r7 == 0) goto L4b
                r3 = 0
                r6.L$0 = r3
                r6.label = r2
                java.lang.Object r7 = r1.proceedWith(r7, r6)
                if (r7 != r0) goto L4b
            L4a:
                return r0
            L4b:
                O3.C r7 = O3.C.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.RenderRequestHook.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private RenderRequestHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getRender(), new AnonymousClass1(handler, null));
    }
}
