package io.ktor.client.plugins.websocket;

import A3.C0006a;
import H5.A;
import H5.C0276q;
import H5.D;
import H5.InterfaceC0275p;
import I5.d;
import O3.C;
import U3.c;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.plugins.HttpClientPluginKt;
import io.ktor.client.plugins.sse.b;
import io.ktor.client.plugins.websocket.WebSockets;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.request.UtilsKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLParserKt;
import io.ktor.http.URLProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\u001a)\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a(\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0014\u001a2\u0010\u000b\u001a\u00020\n*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0086@¢\u0006\u0004\b\u000b\u0010\u0016\u001aL\u0010\u001b\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001c\u001a|\u0010\u001b\u001a\u00020\u0003*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001d\u001aV\u0010\u001b\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001b\u0010\u001e\u001a|\u0010\u001f\u001a\u00020\u0003*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001f\u0010\u001d\u001aL\u0010\u001f\u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001f\u0010\u001c\u001aV\u0010\u001f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b\u001f\u0010\u001e\u001aL\u0010 \u001a\u00020\u0003*\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b \u0010\u001c\u001aV\u0010 \u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b \u0010\u001e\u001a|\u0010 \u001a\u00020\u0003*\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0018H\u0086@¢\u0006\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lio/ktor/client/HttpClientConfig;", "Lkotlin/Function1;", "Lio/ktor/client/plugins/websocket/WebSockets$Config;", "LO3/C;", "config", "WebSockets", "(Lio/ktor/client/HttpClientConfig;Le4/k;)V", "Lio/ktor/client/HttpClient;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "Lio/ktor/client/plugins/websocket/DefaultClientWebSocketSession;", "webSocketSession", "(Lio/ktor/client/HttpClient;Le4/k;LS3/c;)Ljava/lang/Object;", "Lio/ktor/http/HttpMethod;", "method", "", "host", "", "port", "path", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;LS3/c;)Ljava/lang/Object;", "urlString", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/k;LS3/c;)Ljava/lang/Object;", "request", "Lkotlin/Function2;", "LS3/c;", "", "webSocket", "(Lio/ktor/client/HttpClient;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Lio/ktor/http/HttpMethod;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "(Lio/ktor/client/HttpClient;Ljava/lang/String;Le4/k;Le4/n;LS3/c;)Ljava/lang/Object;", "ws", "wss", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BuildersKt {

    @e(c = "io.ktor.client.plugins.websocket.BuildersKt", f = "builders.kt", l = {271, 274, 114, 116, 116, 286, 286}, m = "webSocket")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocket$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BuildersKt.webSocket(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2", f = "builders.kt", l = {269, 272, 56, 284, 284}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.websocket.BuildersKt$webSocketSession$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ InterfaceC0275p $sessionDeferred;
        final /* synthetic */ HttpStatement $statement;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpStatement httpStatement, InterfaceC0275p interfaceC0275p, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$statement = httpStatement;
            this.$sessionDeferred = interfaceC0275p;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass2(this.$statement, this.$sessionDeferred, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:70)|(1:(2:(1:(1:(1:(2:9|10)(3:11|12|63))(3:18|19|67))(5:21|68|22|54|(1:62)(1:67)))(4:26|75|27|(3:50|(3:53|54|(0))|62)(2:57|58))|60)(3:31|32|33))(4:34|35|36|(2:38|62)(1:39))|40|71|41|73|42|45|(2:48|(0)(0))|62|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|70|(1:(2:(1:(1:(1:(2:9|10)(3:11|12|63))(3:18|19|67))(5:21|68|22|54|(1:62)(1:67)))(4:26|75|27|(3:50|(3:53|54|(0))|62)(2:57|58))|60)(3:31|32|33))(4:34|35|36|(2:38|62)(1:39))|40|71|41|73|42|45|(2:48|(0)(0))|62|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009e, code lost:
        
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0105, code lost:
        
            if (r2.cleanup(r15, r14) == r1) goto L62;
         */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ba A[Catch: all -> 0x005e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x005e, blocks: (B:27:0x0059, B:50:0x00ba, B:57:0x00f0, B:58:0x00f7), top: B:75:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x00f0 A[Catch: all -> 0x005e, TRY_ENTER, TryCatch #5 {all -> 0x005e, blocks: (B:27:0x0059, B:50:0x00ba, B:57:0x00f0, B:58:0x00f7), top: B:75:0x0059 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0115 A[RETURN] */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void WebSockets(HttpClientConfig<?> httpClientConfig, k kVar) {
        l.f("<this>", httpClientConfig);
        l.f("config", kVar);
        httpClientConfig.install(WebSockets.INSTANCE, new io.github.jan.supabase.auth.a(3, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C WebSockets$lambda$0(k kVar, WebSockets.Config config) {
        l.f("$this$install", config);
        kVar.invoke(config);
        return C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0172, code lost:
    
        if (r0.cleanup(r10, r1) != r2) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[Catch: all -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:19:0x0050, B:70:0x014f, B:71:0x0156, B:24:0x0066, B:60:0x0123, B:57:0x0113, B:67:0x013d, B:32:0x0093, B:52:0x0100, B:72:0x0157, B:73:0x015e), top: B:85:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[Catch: all -> 0x0055, PHI: r0 r8 r10
      0x0123: PHI (r0v15 io.ktor.client.statement.HttpStatement) = (r0v12 io.ktor.client.statement.HttpStatement), (r0v17 io.ktor.client.statement.HttpStatement) binds: [B:58:0x0120, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r8v26 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession) = 
      (r8v22 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
      (r8v31 io.ktor.client.plugins.websocket.DefaultClientWebSocketSession)
     binds: [B:58:0x0120, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r10v17 io.ktor.client.statement.HttpResponse) = (r10v12 io.ktor.client.statement.HttpResponse), (r10v19 io.ktor.client.statement.HttpResponse) binds: [B:58:0x0120, B:24:0x0066] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:19:0x0050, B:70:0x014f, B:71:0x0156, B:24:0x0066, B:60:0x0123, B:57:0x0113, B:67:0x013d, B:32:0x0093, B:52:0x0100, B:72:0x0157, B:73:0x015e), top: B:85:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0157 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:19:0x0050, B:70:0x014f, B:71:0x0156, B:24:0x0066, B:60:0x0123, B:57:0x0113, B:67:0x013d, B:32:0x0093, B:52:0x0100, B:72:0x0157, B:73:0x015e), top: B:85:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class, java.lang.Class<io.ktor.client.plugins.websocket.DefaultClientWebSocketSession>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.ktor.client.statement.HttpStatement] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r10v0, types: [e4.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [io.ktor.client.statement.HttpResponse] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r9v0, types: [e4.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object webSocket(io.ktor.client.HttpClient r8, e4.k r9, e4.n r10, S3.c<? super O3.C> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.websocket.BuildersKt.webSocket(io.ktor.client.HttpClient, e4.k, e4.n, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(11);
        }
        k kVar2 = kVar;
        return webSocket(httpClient, httpMethod, str, num, str2, kVar2, nVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocket$lambda$10(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocket$lambda$11(HttpMethod httpMethod, String str, Integer num, String str2, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocket", httpRequestBuilder);
        httpRequestBuilder.setMethod(httpMethod);
        HttpRequestKt.url$default(httpRequestBuilder, "ws", str, num, str2, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocket$lambda$12(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocket$lambda$13(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocket", httpRequestBuilder);
        httpRequestBuilder.getUrl().setProtocol(URLProtocol.INSTANCE.getWS());
        httpRequestBuilder.getUrl().setPort(UtilsKt.getPort(httpRequestBuilder));
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocket$lambda$8$lambda$7(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
        l.f("$this$url", uRLBuilder);
        l.f("it", uRLBuilder2);
        uRLBuilder.setProtocol(URLProtocol.INSTANCE.getWS());
        return C.a;
    }

    public static final Object webSocketSession(HttpClient httpClient, k kVar, S3.c<? super DefaultClientWebSocketSession> cVar) throws Throwable {
        HttpClientPluginKt.plugin(httpClient, WebSockets.INSTANCE);
        C0276q c0276qB = D.b();
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        httpRequestBuilder.url(new C0006a(27));
        kVar.invoke(httpRequestBuilder);
        D.x(httpClient, null, new AnonymousClass2(new HttpStatement(httpRequestBuilder, httpClient), c0276qB, null), 3);
        Object objK = c0276qB.k(cVar);
        T3.a aVar = T3.a.f9048k;
        return objK;
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(18);
        }
        return webSocketSession(httpClient, httpMethod, str, num, str2, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocketSession$lambda$2$lambda$1(URLBuilder uRLBuilder, URLBuilder uRLBuilder2) {
        l.f("$this$url", uRLBuilder);
        l.f("it", uRLBuilder2);
        uRLBuilder.setProtocol(URLProtocol.INSTANCE.getWS());
        uRLBuilder.setPort(uRLBuilder.getProtocol().getDefaultPort());
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocketSession$lambda$3(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocketSession$lambda$4(HttpMethod httpMethod, String str, Integer num, String str2, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocketSession", httpRequestBuilder);
        httpRequestBuilder.setMethod(httpMethod);
        HttpRequestKt.url$default(httpRequestBuilder, "ws", str, num, str2, null, 16, null);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocketSession$lambda$5(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C webSocketSession$lambda$6(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocketSession", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    public static final Object ws(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, kVar, nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(14);
        }
        k kVar2 = kVar;
        return ws(httpClient, httpMethod, str, num, str2, kVar2, nVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C ws$lambda$14(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C ws$lambda$15(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    public static final Object wss(HttpClient httpClient, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new io.github.jan.supabase.auth.a(4, kVar), nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, String str, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(12);
        }
        return wss(httpClient, str, kVar, nVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C wss$lambda$16(k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocket", httpRequestBuilder);
        httpRequestBuilder.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        httpRequestBuilder.getUrl().setPort(httpRequestBuilder.getUrl().getProtocol().getDefaultPort());
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C wss$lambda$17(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C wss$lambda$18(String str, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$wss", httpRequestBuilder);
        URLParserKt.takeFrom(httpRequestBuilder.getUrl(), str);
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C wss$lambda$19(HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C wss$lambda$20(Integer num, k kVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$webSocket", httpRequestBuilder);
        httpRequestBuilder.getUrl().setProtocol(URLProtocol.INSTANCE.getWSS());
        if (num != null) {
            httpRequestBuilder.getUrl().setPort(num.intValue());
        }
        kVar.invoke(httpRequestBuilder);
        return C.a;
    }

    public static final Object ws(HttpClient httpClient, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, kVar, nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static final Object wss(HttpClient httpClient, String str, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWss = wss(httpClient, new b(5, str, kVar), nVar, cVar);
        return objWss == T3.a.f9048k ? objWss : C.a;
    }

    public static final Object ws(HttpClient httpClient, String str, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, str, kVar, nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static final Object wss(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, httpMethod, str, num, str2, new d(5, num, kVar), nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static /* synthetic */ Object wss$default(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            httpMethod = HttpMethod.INSTANCE.getGet();
        }
        if ((i7 & 2) != 0) {
            str = null;
        }
        if ((i7 & 4) != 0) {
            num = null;
        }
        if ((i7 & 8) != 0) {
            str2 = null;
        }
        if ((i7 & 16) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(13);
        }
        k kVar2 = kVar;
        return wss(httpClient, httpMethod, str, num, str2, kVar2, nVar, cVar);
    }

    public static /* synthetic */ Object webSocket$default(HttpClient httpClient, String str, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(16);
        }
        return webSocket(httpClient, str, kVar, nVar, cVar);
    }

    public static /* synthetic */ Object webSocketSession$default(HttpClient httpClient, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(15);
        }
        return webSocketSession(httpClient, str, kVar, cVar);
    }

    public static /* synthetic */ Object ws$default(HttpClient httpClient, String str, k kVar, n nVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new io.ktor.client.plugins.sse.c(17);
        }
        return ws(httpClient, str, kVar, nVar, cVar);
    }

    public static final Object webSocketSession(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, S3.c<? super DefaultClientWebSocketSession> cVar) {
        return webSocketSession(httpClient, new a(httpMethod, str, num, str2, kVar, 0), cVar);
    }

    public static final Object webSocketSession(HttpClient httpClient, String str, k kVar, S3.c<? super DefaultClientWebSocketSession> cVar) {
        return webSocketSession(httpClient, new b(6, str, kVar), cVar);
    }

    public static final Object webSocket(HttpClient httpClient, HttpMethod httpMethod, String str, Integer num, String str2, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, new a(httpMethod, str, num, str2, kVar, 1), nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }

    public static final Object webSocket(HttpClient httpClient, String str, k kVar, n nVar, S3.c<? super C> cVar) throws Throwable {
        Object objWebSocket = webSocket(httpClient, HttpMethod.INSTANCE.getGet(), null, null, null, new b(4, str, kVar), nVar, cVar);
        return objWebSocket == T3.a.f9048k ? objWebSocket : C.a;
    }
}
