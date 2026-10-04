package io.ktor.client.plugins;

import O3.C;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002,\u0012(\u0012&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2*\u0010\u000b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/ReceiveError;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequest;", "", "LS3/c;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReceiveError implements ClientHook<o> {
    public static final ReceiveError INSTANCE = new ReceiveError();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.ReceiveError$install$1", f = "HttpCallValidator.kt", l = {165, 167}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.ReceiveError$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ o $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = oVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, S3.c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
        
            if (r6 == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            if (r6 != r0) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [io.ktor.util.pipeline.PipelineContext] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v7 */
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
                if (r1 == 0) goto L22
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                P3.r.Y(r6)
                goto L4d
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                P3.r.Y(r6)     // Catch: java.lang.Throwable -> L20
                goto L51
            L20:
                r6 = move-exception
                goto L35
            L22:
                P3.r.Y(r6)
                java.lang.Object r6 = r5.L$0
                r1 = r6
                io.ktor.util.pipeline.PipelineContext r1 = (io.ktor.util.pipeline.PipelineContext) r1
                r5.L$0 = r1     // Catch: java.lang.Throwable -> L20
                r5.label = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r6 = r1.proceed(r5)     // Catch: java.lang.Throwable -> L20
                if (r6 != r0) goto L51
                goto L4c
            L35:
                e4.o r3 = r5.$handler
                java.lang.Object r1 = r1.getContext()
                io.ktor.client.call.HttpClientCall r1 = (io.ktor.client.call.HttpClientCall) r1
                io.ktor.client.request.HttpRequest r1 = r1.getRequest()
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r3.invoke(r1, r6, r5)
                if (r6 != r0) goto L4d
            L4c:
                return r0
            L4d:
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                if (r6 != 0) goto L54
            L51:
                O3.C r6 = O3.C.a
                return r6
            L54:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.ReceiveError.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private ReceiveError() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) throws InvalidPhaseException {
        l.f("client", client);
        l.f("handler", handler);
        PipelinePhase pipelinePhase = new PipelinePhase("BeforeReceive");
        client.getResponsePipeline().insertPhaseBefore(HttpResponsePipeline.INSTANCE.getReceive(), pipelinePhase);
        client.getResponsePipeline().intercept(pipelinePhase, new AnonymousClass1(handler, null));
    }
}
