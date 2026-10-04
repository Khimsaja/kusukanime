package io.ktor.client.plugins.api;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import S3.h;
import T3.a;
import U3.e;
import U3.j;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002*\u0012&\u0012$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJA\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/Send;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function3;", "Lio/ktor/client/plugins/api/Send$Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "LS3/c;", "Lio/ktor/client/call/HttpClientCall;", "", "<init>", "()V", "Lio/ktor/client/HttpClient;", "client", "handler", "LO3/C;", "install", "(Lio/ktor/client/HttpClient;Le4/o;)V", "Sender", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Send implements ClientHook<o> {
    public static final Send INSTANCE = new Send();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/api/Send$Sender;", "LH5/A;", "Lio/ktor/client/plugins/Sender;", "httpSendSender", "LS3/h;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/Sender;LS3/h;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "requestBuilder", "Lio/ktor/client/call/HttpClientCall;", "proceed", "(Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/plugins/Sender;", "LS3/h;", "getCoroutineContext", "()LS3/h;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Sender implements A {
        private final h coroutineContext;
        private final io.ktor.client.plugins.Sender httpSendSender;

        public Sender(io.ktor.client.plugins.Sender sender, h hVar) {
            l.f("httpSendSender", sender);
            l.f("coroutineContext", hVar);
            this.httpSendSender = sender;
            this.coroutineContext = hVar;
        }

        @Override // H5.A
        public h getCoroutineContext() {
            return this.coroutineContext;
        }

        public final Object proceed(HttpRequestBuilder httpRequestBuilder, c<? super HttpClientCall> cVar) {
            return this.httpSendSender.execute(httpRequestBuilder, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "io.ktor.client.plugins.api.Send$install$1", f = "CommonHooks.kt", l = {52}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.api.Send$install$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements o {
        final /* synthetic */ HttpClient $client;
        final /* synthetic */ o $handler;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(o oVar, HttpClient httpClient, c<? super AnonymousClass1> cVar) {
            super(3, cVar);
            this.$handler = oVar;
            this.$client = httpClient;
        }

        @Override // e4.o
        public final Object invoke(io.ktor.client.plugins.Sender sender, HttpRequestBuilder httpRequestBuilder, c<? super HttpClientCall> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handler, this.$client, cVar);
            anonymousClass1.L$0 = sender;
            anonymousClass1.L$1 = httpRequestBuilder;
            return anonymousClass1.invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            io.ktor.client.plugins.Sender sender = (io.ktor.client.plugins.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            o oVar = this.$handler;
            Sender sender2 = new Sender(sender, this.$client.getCoroutineContext());
            this.L$0 = null;
            this.label = 1;
            Object objInvoke = oVar.invoke(sender2, httpRequestBuilder, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    private Send() {
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(HttpClient client, o handler) {
        l.f("client", client);
        l.f("handler", handler);
        ((HttpSend) HttpClientPluginKt.plugin(client, HttpSend.INSTANCE)).intercept(new AnonymousClass1(handler, client, null));
    }
}
