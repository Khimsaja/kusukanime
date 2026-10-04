package io.ktor.client.plugins;

import O3.C;
import P3.r;
import U3.j;
import e4.k;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.pipeline.PipelineContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C1401a;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002@\u0012<\u0012:\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJW\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2>\u0010\f\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/client/plugins/SetupRequestContext;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "Lkotlin/Function1;", "LS3/c;", "LO3/C;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SetupRequestContext implements ClientHook<o> {
    public static final SetupRequestContext INSTANCE = new SetupRequestContext();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Ljava/lang/Object;)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.SetupRequestContext$install$1", f = "HttpRequestLifecycle.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.SetupRequestContext$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ o $handler;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1, reason: invalid class name and collision with other inner class name */
        public /* synthetic */ class C00031 extends C1401a implements k {
            public C00031(Object obj) {
                super(1, 8, PipelineContext.class, obj, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
            }

            @Override // e4.k
            public final Object invoke(S3.c<? super C> cVar) {
                return AnonymousClass1.invokeSuspend$proceed((PipelineContext) this.receiver, cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, S3.c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invokeSuspend$proceed(PipelineContext pipelineContext, S3.c cVar) {
            Object objProceed = pipelineContext.proceed(cVar);
            return objProceed == T3.a.f9048k ? objProceed : C.a;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, S3.c<? super C> cVar) {
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
                Object context = pipelineContext.getContext();
                C00031 c00031 = new C00031(pipelineContext);
                this.label = 1;
                if (oVar.invoke(context, c00031, this) == aVar) {
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

    private SetupRequestContext() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getBefore(), new AnonymousClass1(handler, null));
    }
}
