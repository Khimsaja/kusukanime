package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.InvalidPhaseException;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.pipeline.PipelinePhase;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002,\u0012(\u0012&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJC\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2*\u0010\u000b\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/AfterRenderHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/http/content/OutgoingContent;", "LS3/c;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AfterRenderHook implements ClientHook<o> {
    public static final AfterRenderHook INSTANCE = new AfterRenderHook();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.AfterRenderHook$install$1", f = "BodyProgress.kt", l = {65, 66}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.AfterRenderHook$install$1, reason: invalid class name */
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

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            PipelineContext pipelineContext;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            C c2 = C.a;
            if (i7 == 0) {
                r.Y(obj);
                pipelineContext = (PipelineContext) this.L$0;
                Object obj2 = this.L$1;
                if (!(obj2 instanceof OutgoingContent)) {
                    return c2;
                }
                o oVar = this.$handler;
                Object context = pipelineContext.getContext();
                this.L$0 = pipelineContext;
                this.label = 1;
                obj = oVar.invoke(context, obj2, this);
                if (obj != aVar) {
                }
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    r.Y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pipelineContext = (PipelineContext) this.L$0;
            r.Y(obj);
            OutgoingContent outgoingContent = (OutgoingContent) obj;
            if (outgoingContent == null) {
                return c2;
            }
            this.L$0 = null;
            this.label = 2;
            return pipelineContext.proceedWith(outgoingContent, this) == aVar ? aVar : c2;
        }
    }

    private AfterRenderHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) throws InvalidPhaseException {
        l.f("client", client);
        l.f("handler", handler);
        PipelinePhase pipelinePhase = new PipelinePhase("ObservableContent");
        client.getRequestPipeline().insertPhaseAfter(HttpRequestPipeline.INSTANCE.getRender(), pipelinePhase);
        client.getRequestPipeline().intercept(pipelinePhase, new AnonymousClass1(handler, null));
    }
}
