package io.ktor.client.plugins;

import e4.k;
import e4.o;
import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0004\u0015\u0014\u0016\u0017B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u00020\r2,\u0010\f\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R@\u0010\u0012\u001a.\u0012*\u0012(\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006j\u0002`\u000b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/HttpSend;", "", "", "maxSendCount", "<init>", "(I)V", "Lkotlin/Function3;", "Lio/ktor/client/plugins/Sender;", "Lio/ktor/client/request/HttpRequestBuilder;", "LS3/c;", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/HttpSendInterceptor;", "block", "LO3/C;", "intercept", "(Le4/o;)V", "I", "", "interceptors", "Ljava/util/List;", "Plugin", "Config", "InterceptedSender", "DefaultSender", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpSend {

    /* renamed from: Plugin, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<HttpSend> key;
    private final List<o> interceptors;
    private final int maxSendCount;

    @KtorDsl
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Config;", "", "<init>", "()V", "", "maxSendCount", "I", "getMaxSendCount", "()I", "setMaxSendCount", "(I)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private int maxSendCount = 20;

        public final int getMaxSendCount() {
            return this.maxSendCount;
        }

        public final void setMaxSendCount(int i7) {
            this.maxSendCount = i7;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/ktor/client/plugins/HttpSend$DefaultSender;", "Lio/ktor/client/plugins/Sender;", "", "maxSendCount", "Lio/ktor/client/HttpClient;", "client", "<init>", "(ILio/ktor/client/HttpClient;)V", "Lio/ktor/client/request/HttpRequestBuilder;", "requestBuilder", "Lio/ktor/client/call/HttpClientCall;", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "I", "Lio/ktor/client/HttpClient;", "sentCount", "currentCall", "Lio/ktor/client/call/HttpClientCall;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultSender implements Sender {
        private final HttpClient client;
        private HttpClientCall currentCall;
        private final int maxSendCount;
        private int sentCount;

        public DefaultSender(int i7, HttpClient httpClient) {
            l.f("client", httpClient);
            this.maxSendCount = i7;
            this.client = httpClient;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // io.ktor.client.plugins.Sender
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object execute(io.ktor.client.request.HttpRequestBuilder r6, S3.c<? super io.ktor.client.call.HttpClientCall> r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                if (r0 == 0) goto L13
                r0 = r7
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = (io.ktor.client.plugins.HttpSend$DefaultSender$execute$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                io.ktor.client.plugins.HttpSend$DefaultSender$execute$1 r0 = new io.ktor.client.plugins.HttpSend$DefaultSender$execute$1
                r0.<init>(r5, r7)
            L18:
                java.lang.Object r7 = r0.result
                T3.a r1 = T3.a.f9048k
                int r2 = r0.label
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L30
                if (r2 != r4) goto L28
                P3.r.Y(r7)
                goto L56
            L28:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L30:
                P3.r.Y(r7)
                io.ktor.client.call.HttpClientCall r7 = r5.currentCall
                if (r7 == 0) goto L3a
                H5.D.h(r7, r3)
            L3a:
                int r7 = r5.sentCount
                int r2 = r5.maxSendCount
                if (r7 >= r2) goto L7a
                int r7 = r7 + r4
                r5.sentCount = r7
                io.ktor.client.HttpClient r7 = r5.client
                io.ktor.client.request.HttpSendPipeline r7 = r7.getSendPipeline()
                java.lang.Object r2 = r6.getBody()
                r0.label = r4
                java.lang.Object r7 = r7.execute(r6, r2, r0)
                if (r7 != r1) goto L56
                return r1
            L56:
                boolean r6 = r7 instanceof io.ktor.client.call.HttpClientCall
                if (r6 == 0) goto L5d
                r3 = r7
                io.ktor.client.call.HttpClientCall r3 = (io.ktor.client.call.HttpClientCall) r3
            L5d:
                if (r3 == 0) goto L62
                r5.currentCall = r3
                return r3
            L62:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Failed to execute send pipeline. Expected [HttpClientCall], but received "
                r0.<init>(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            L7a:
                io.ktor.client.plugins.SendCountExceedException r6 = new io.ktor.client.plugins.SendCountExceedException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r0 = "Max send count "
                r7.<init>(r0)
                int r0 = r5.maxSendCount
                r7.append(r0)
                java.lang.String r0 = " exceeded. Consider increasing the property maxSendCount if more is required."
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                r6.<init>(r7)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.HttpSend.DefaultSender.execute(io.ktor.client.request.HttpRequestBuilder, S3.c):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B=\u0012,\u0010\b\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\r\u0010\u000eR:\u0010\b\u001a(\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/client/plugins/HttpSend$InterceptedSender;", "Lio/ktor/client/plugins/Sender;", "Lkotlin/Function3;", "Lio/ktor/client/request/HttpRequestBuilder;", "LS3/c;", "Lio/ktor/client/call/HttpClientCall;", "", "Lio/ktor/client/plugins/HttpSendInterceptor;", "interceptor", "nextSender", "<init>", "(Le4/o;Lio/ktor/client/plugins/Sender;)V", "requestBuilder", "execute", "(Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "Le4/o;", "Lio/ktor/client/plugins/Sender;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InterceptedSender implements Sender {
        private final o interceptor;
        private final Sender nextSender;

        public InterceptedSender(o oVar, Sender sender) {
            l.f("interceptor", oVar);
            l.f("nextSender", sender);
            this.interceptor = oVar;
            this.nextSender = sender;
        }

        @Override // io.ktor.client.plugins.Sender
        public Object execute(HttpRequestBuilder httpRequestBuilder, S3.c<? super HttpClientCall> cVar) {
            return this.interceptor.invoke(this.nextSender, httpRequestBuilder, cVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpSend$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/HttpSend$Config;", "Lio/ktor/client/plugins/HttpSend;", "<init>", "()V", "Lkotlin/Function1;", "LO3/C;", "block", "prepare", "(Le4/k;)Lio/ktor/client/plugins/HttpSend;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/HttpSend;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.HttpSend$Plugin, reason: from kotlin metadata */
    public static final class Companion implements HttpClientPlugin<Config, HttpSend> {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpSend> getKey() {
            return HttpSend.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpSend plugin, HttpClient scope) {
            l.f("plugin", plugin);
            l.f("scope", scope);
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getSend(), new HttpSend$Plugin$install$1(plugin, scope, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpSend prepare(k block) {
            l.f("block", block);
            Config config = new Config();
            block.invoke(config);
            return new HttpSend(config.getMaxSendCount(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(HttpSend.class);
        try {
            interfaceC1444wA = y.a(HttpSend.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpSend", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    public /* synthetic */ HttpSend(int i7, kotlin.jvm.internal.f fVar) {
        this(i7);
    }

    public final void intercept(o block) {
        l.f("block", block);
        this.interceptors.add(block);
    }

    private HttpSend(int i7) {
        this.maxSendCount = i7;
        this.interceptors = new ArrayList();
    }

    public /* synthetic */ HttpSend(int i7, int i8, kotlin.jvm.internal.f fVar) {
        this((i8 & 1) != 0 ? 20 : i7);
    }
}
