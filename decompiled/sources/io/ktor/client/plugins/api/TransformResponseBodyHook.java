package io.ktor.client.plugins.api;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.o;
import e4.q;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseContainer;
import io.ktor.client.statement.HttpResponsePipeline;
import io.ktor.http.content.NullBody;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u000028\u00124\u00122\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJO\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b26\u0010\r\u001a2\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/TransformResponseBodyHook;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function5;", "Lio/ktor/client/plugins/api/TransformResponseBodyContext;", "Lio/ktor/client/statement/HttpResponse;", "Lio/ktor/utils/io/ByteReadChannel;", "Lio/ktor/util/reflect/TypeInfo;", "LS3/c;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/q;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformResponseBodyHook implements ClientHook<q> {
    public static final TransformResponseBodyHook INSTANCE = new TransformResponseBodyHook();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/PipelineContext;", "Lio/ktor/client/statement/HttpResponseContainer;", "Lio/ktor/client/call/HttpClientCall;", "it", "LO3/C;", "<anonymous>", "(Lio/ktor/util/pipeline/PipelineContext;Lio/ktor/client/statement/HttpResponseContainer;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", f = "KtorCallContexts.kt", l = {113, 120}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.api.TransformResponseBodyHook$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ q $handler;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(q qVar, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = qVar;
        }

        @Override // e4.o
        public final Object invoke(PipelineContext<HttpResponseContainer, HttpClientCall> pipelineContext, HttpResponseContainer httpResponseContainer, c<? super C> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, cVar);
            anonymousClass1.L$0 = pipelineContext;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            AnonymousClass1 anonymousClass1;
            PipelineContext pipelineContext;
            TypeInfo typeInfo;
            a aVar = a.f9048k;
            int i7 = this.label;
            C c2 = C.a;
            if (i7 == 0) {
                r.Y(obj);
                PipelineContext pipelineContext2 = (PipelineContext) this.L$0;
                HttpResponseContainer httpResponseContainer = (HttpResponseContainer) pipelineContext2.getSubject();
                TypeInfo expectedType = httpResponseContainer.getExpectedType();
                Object response = httpResponseContainer.getResponse();
                if (!(response instanceof ByteReadChannel)) {
                    return c2;
                }
                q qVar = this.$handler;
                TransformResponseBodyContext transformResponseBodyContext = new TransformResponseBodyContext();
                HttpResponse response2 = ((HttpClientCall) pipelineContext2.getContext()).getResponse();
                this.L$0 = pipelineContext2;
                this.L$1 = expectedType;
                this.label = 1;
                anonymousClass1 = this;
                Object objInvoke = qVar.invoke(transformResponseBodyContext, response2, response, expectedType, anonymousClass1);
                if (objInvoke != aVar) {
                    pipelineContext = pipelineContext2;
                    obj = objInvoke;
                    typeInfo = expectedType;
                }
            }
            if (i7 != 1) {
                if (i7 == 2) {
                    r.Y(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            typeInfo = (TypeInfo) this.L$1;
            pipelineContext = (PipelineContext) this.L$0;
            r.Y(obj);
            anonymousClass1 = this;
            if (obj == null) {
                return c2;
            }
            if ((obj instanceof NullBody) || typeInfo.getType().m(obj)) {
                HttpResponseContainer httpResponseContainer2 = new HttpResponseContainer(typeInfo, obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                return pipelineContext.proceedWith(httpResponseContainer2, this) == aVar ? aVar : c2;
            }
            throw new IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + typeInfo);
        }
    }

    private TransformResponseBodyHook() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, q handler) {
        l.f("client", client);
        l.f("handler", handler);
        client.getResponsePipeline().intercept(HttpResponsePipeline.INSTANCE.getTransform(), new AnonymousClass1(handler, null));
    }
}
