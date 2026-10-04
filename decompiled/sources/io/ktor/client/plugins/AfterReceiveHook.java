package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002&\u0012\"\u0012 \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2$\u0010\n\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/AfterReceiveHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "LS3/c;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/n;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AfterReceiveHook implements ClientHook<n> {
    public static final AfterReceiveHook INSTANCE = new AfterReceiveHook();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "response", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.AfterReceiveHook$install$1", f = "BodyProgress.kt", l = {50, 51}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.AfterReceiveHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ n $handler;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = nVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponse, C> pipelineContext, HttpResponse httpResponse, S3.c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            anonymousClass1.L$1 = httpResponse;
            return anonymousClass1.invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r1.proceedWith(r6, r5) == r0) goto L17;
         */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                P3.r.Y(r6)
                goto L49
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                P3.r.Y(r6)
                goto L39
            L20:
                P3.r.Y(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                java.lang.Object r6 = r5.L$1
                io.ktor.client.statement.HttpResponse r6 = (io.ktor.client.statement.HttpResponse) r6
                e4.n r4 = r5.$handler
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L48
            L39:
                io.ktor.client.statement.HttpResponse r6 = (io.ktor.client.statement.HttpResponse) r6
                if (r6 == 0) goto L49
                r3 = 0
                r5.L$0 = r3
                r5.label = r2
                java.lang.Object r6 = r1.proceedWith(r6, r5)
                if (r6 != r0) goto L49
            L48:
                return r0
            L49:
                O3.C r6 = O3.C.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.AfterReceiveHook.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private AfterReceiveHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, n handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getAfter(), new AnonymousClass1(handler, null));
    }
}
