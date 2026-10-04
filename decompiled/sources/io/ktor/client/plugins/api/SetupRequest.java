package io.ktor.client.plugins.api;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lio/ktor/client/plugins/api/SetupRequest;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function2;", "Lio/ktor/client/request/HttpRequestBuilder;", "LS3/c;", "LO3/C;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Le4/n;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetupRequest implements ClientHook<n> {
    public static final SetupRequest INSTANCE = new SetupRequest();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.api.SetupRequest$install$1", f = "CommonHooks.kt", l = {24}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.api.SetupRequest$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ n $handler;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = nVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                PipelineContext pipelineContext = (PipelineContext) this.L$0;
                n nVar = this.$handler;
                Object context = pipelineContext.getContext();
                this.label = 1;
                if (nVar.invoke(context, this) == aVar) {
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

    private SetupRequest() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, n handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getBefore(), new AnonymousClass1(handler, null));
    }
}
