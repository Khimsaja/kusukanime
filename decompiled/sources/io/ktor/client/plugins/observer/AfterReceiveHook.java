package io.ktor.client.plugins.observer;

import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lio/ktor/client/plugins/observer/AfterReceiveHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "Lio/ktor/client/statement/HttpResponse;", "LS3/c;", "LO3/C;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "Context", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AfterReceiveHook implements ClientHook<o> {
    public static final AfterReceiveHook INSTANCE = new AfterReceiveHook();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lio/ktor/client/plugins/observer/AfterReceiveHook$Context;", "", "Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "context", "<init>", "(Lio/ktor/util/pipeline/PipelineContext;)V", "response", "proceedWith", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "Lio/ktor/util/pipeline/PipelineContext;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Context {
        private final PipelineContext<HttpResponse, C> context;

        public Context(PipelineContext<HttpResponse, C> pipelineContext) {
            l.f("context", pipelineContext);
            this.context = pipelineContext;
        }

        public final Object proceedWith(HttpResponse httpResponse, c<? super HttpResponse> cVar) {
            return this.context.proceedWith(httpResponse, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponse;", "LO3/C;", "it", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponse;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.observer.AfterReceiveHook$install$1", f = "ResponseObserver.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.observer.AfterReceiveHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ o $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = oVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponse, C> pipelineContext, HttpResponse httpResponse, c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                o oVar = this.$handler;
                Context context = new Context(pipelineContext);
                Object subject = pipelineContext.getSubject();
                this.label = 1;
                if (oVar.invoke(context, subject, this) == aVar) {
                    return aVar;
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

    private AfterReceiveHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getAfter(), new AnonymousClass1(handler, null));
    }
}
