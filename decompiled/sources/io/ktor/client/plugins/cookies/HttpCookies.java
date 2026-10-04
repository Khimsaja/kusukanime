package io.ktor.client.plugins.cookies;

import H5.D;
import H5.InterfaceC0265f0;
import H5.M;
import H5.Y;
import U3.c;
import U3.e;
import e4.k;
import e4.n;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpClientPlugin;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.client.request.HttpSendPipeline;
import io.ktor.client.statement.HttpReceivePipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.utils.io.KtorDsl;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00060\u0001j\u0002`\u0002:\u0002'&B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012(\u0010\n\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0017\u0010\u0015J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0080@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R6\u0010\n\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u001a\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010\u001f¨\u0006("}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "storage", "", "Lkotlin/Function2;", "LS3/c;", "LO3/C;", "", "defaults", "<init>", "(Lio/ktor/client/plugins/cookies/CookiesStorage;Ljava/util/List;)V", "Lio/ktor/http/Url;", "requestUrl", "Lio/ktor/http/Cookie;", "get", "(Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "builder", "captureHeaderCookies$ktor_client_core", "(Lio/ktor/client/request/HttpRequestBuilder;LS3/c;)Ljava/lang/Object;", "captureHeaderCookies", "sendCookiesWith$ktor_client_core", "sendCookiesWith", "Lio/ktor/client/statement/HttpResponse;", "response", "saveCookiesFrom$ktor_client_core", "(Lio/ktor/client/statement/HttpResponse;LS3/c;)Ljava/lang/Object;", "saveCookiesFrom", "close", "()V", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "Ljava/util/List;", "LH5/f0;", "initializer", "LH5/f0;", "getInitializer$annotations", "Companion", "Config", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpCookies implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(0 == true ? 1 : 0);
    private static final AttributeKey<HttpCookies> key;
    private final List<n> defaults;
    private final InterfaceC0265f0 initializer;
    private final CookiesStorage storage;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Companion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "Lio/ktor/client/plugins/cookies/HttpCookies;", "<init>", "()V", "Lkotlin/Function1;", "LO3/C;", "block", "prepare", "(Le4/k;)Lio/ktor/client/plugins/cookies/HttpCookies;", "plugin", "Lio/ktor/client/HttpClient;", "scope", "install", "(Lio/ktor/client/plugins/cookies/HttpCookies;Lio/ktor/client/HttpClient;)V", "Lio/ktor/util/AttributeKey;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements HttpClientPlugin<Config, HttpCookies> {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public AttributeKey<HttpCookies> getKey() {
            return HttpCookies.key;
        }

        private Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(HttpCookies plugin, HttpClient scope) {
            l.f("plugin", plugin);
            l.f("scope", scope);
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$1(plugin, null));
            scope.getSendPipeline().intercept(HttpSendPipeline.INSTANCE.getState(), new HttpCookies$Companion$install$2(plugin, null));
            scope.getReceivePipeline().intercept(HttpReceivePipeline.INSTANCE.getState(), new HttpCookies$Companion$install$3(plugin, null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        public HttpCookies prepare(k block) {
            l.f("block", block);
            Config config = new Config();
            block.invoke(config);
            return config.build$ktor_client_core();
        }
    }

    @KtorDsl
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR6\u0010\u0010\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/cookies/HttpCookies$Config;", "", "<init>", "()V", "Lkotlin/Function2;", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "LS3/c;", "LO3/C;", "block", "default", "(Le4/n;)V", "Lio/ktor/client/plugins/cookies/HttpCookies;", "build$ktor_client_core", "()Lio/ktor/client/plugins/cookies/HttpCookies;", "build", "", "defaults", "Ljava/util/List;", "storage", "Lio/ktor/client/plugins/cookies/CookiesStorage;", "getStorage", "()Lio/ktor/client/plugins/cookies/CookiesStorage;", "setStorage", "(Lio/ktor/client/plugins/cookies/CookiesStorage;)V", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private final List<n> defaults = new ArrayList();
        private CookiesStorage storage = new AcceptAllCookiesStorage(null, 1, 0 == true ? 1 : 0);

        public final HttpCookies build$ktor_client_core() {
            return new HttpCookies(this.storage, this.defaults);
        }

        /* renamed from: default, reason: not valid java name */
        public final void m105default(n block) {
            l.f("block", block);
            this.defaults.add(block);
        }

        public final CookiesStorage getStorage() {
            return this.storage;
        }

        public final void setStorage(CookiesStorage cookiesStorage) {
            l.f("<set-?>", cookiesStorage);
            this.storage = cookiesStorage;
        }
    }

    @e(c = "io.ktor.client.plugins.cookies.HttpCookies", f = "HttpCookies.kt", l = {43, 44}, m = "get")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cookies.HttpCookies$get$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HttpCookies.this.get(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        InterfaceC1444w interfaceC1444wA = null;
        InterfaceC1425d interfaceC1425dB = y.a.b(HttpCookies.class);
        try {
            interfaceC1444wA = y.a(HttpCookies.class);
        } catch (Throwable unused) {
        }
        key = new AttributeKey<>("HttpCookies", new TypeInfo(interfaceC1425dB, interfaceC1444wA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpCookies(CookiesStorage cookiesStorage, List<? extends n> list) {
        l.f("storage", cookiesStorage);
        l.f("defaults", list);
        this.storage = cookiesStorage;
        this.defaults = list;
        this.initializer = D.x(Y.f3831k, M.f3814b, new HttpCookies$initializer$1(this, null), 2);
    }

    private static /* synthetic */ void getInitializer$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder r23, S3.c<? super O3.C> r24) throws java.lang.Throwable {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1
            if (r2 == 0) goto L17
            r2 = r1
            io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1 r2 = (io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1 r2 = new io.ktor.client.plugins.cookies.HttpCookies$captureHeaderCookies$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            T3.a r3 = T3.a.f9048k
            int r4 = r2.label
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            java.lang.Object r4 = r2.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r6 = r2.L$0
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            P3.r.Y(r1)
            goto Lc8
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            P3.r.Y(r1)
            io.ktor.http.URLBuilder r1 = r23.getUrl()
            io.ktor.http.URLBuilder r1 = io.ktor.http.URLBuilderKt.clone(r1)
            io.ktor.http.Url r1 = r1.build()
            io.ktor.http.HeadersBuilder r4 = r23.getHeaders()
            io.ktor.http.HttpHeaders r6 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r6 = r6.getCookie()
            java.lang.String r4 = r4.get(r6)
            r6 = 0
            if (r4 == 0) goto Lc1
            z6.b r7 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$getLOGGER$p()
            java.lang.String r8 = "Saving cookie "
            java.lang.String r9 = " for "
            java.lang.StringBuilder r8 = b1.AbstractC0703b.q(r8, r4, r9)
            io.ktor.http.URLBuilder r9 = r23.getUrl()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.e(r8)
            r7 = 0
            r8 = 2
            java.util.Map r4 = io.ktor.http.CookieKt.parseClientCookiesHeader$default(r4, r7, r8, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r4.size()
            r6.<init>(r7)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L8d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lc1
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r7.getValue()
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            io.ktor.http.Cookie r9 = new io.ktor.http.Cookie
            io.ktor.http.CookieEncoding r12 = io.ktor.http.CookieEncoding.RAW
            r18 = 0
            r19 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 1016(0x3f8, float:1.424E-42)
            r21 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r6.add(r9)
            goto L8d
        Lc1:
            if (r6 == 0) goto Le3
            java.util.Iterator r4 = r6.iterator()
            r6 = r1
        Lc8:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Le3
            java.lang.Object r1 = r4.next()
            io.ktor.http.Cookie r1 = (io.ktor.http.Cookie) r1
            io.ktor.client.plugins.cookies.CookiesStorage r7 = r0.storage
            r2.L$0 = r6
            r2.L$1 = r4
            r2.label = r5
            java.lang.Object r1 = r7.addCookie(r6, r1, r2)
            if (r1 != r3) goto Lc8
            return r3
        Le3:
            O3.C r1 = O3.C.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.captureHeaderCookies$ktor_client_core(io.ktor.client.request.HttpRequestBuilder, S3.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.storage.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(io.ktor.http.Url r6, S3.c<? super java.util.List<io.ktor.http.Cookie>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$get$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$get$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            P3.r.Y(r7)
            goto L4a
        L3a:
            P3.r.Y(r7)
            H5.f0 r7 = r5.initializer
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r7.m(r0)
            if (r7 != r1) goto L4a
            goto L57
        L4a:
            io.ktor.client.plugins.cookies.CookiesStorage r7 = r5.storage
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r7.get(r6, r0)
            if (r6 != r1) goto L58
        L57:
            return r1
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.get(io.ktor.http.Url, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse r9, S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$saveCookiesFrom$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r2 = r0.L$0
            io.ktor.http.Url r2 = (io.ktor.http.Url) r2
            P3.r.Y(r10)
            goto L8e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            P3.r.Y(r10)
            io.ktor.client.request.HttpRequest r10 = io.ktor.client.statement.HttpResponseKt.getRequest(r9)
            io.ktor.http.Url r10 = r10.getUrl()
            io.ktor.http.Headers r2 = r9.getHeaders()
            io.ktor.http.HttpHeaders r4 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r4 = r4.getSetCookie()
            java.util.List r2 = r2.getAll(r4)
            if (r2 == 0) goto L85
            java.util.Iterator r2 = r2.iterator()
        L56:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            z6.b r5 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$getLOGGER$p()
            java.lang.String r6 = "Received cookie "
            java.lang.String r7 = " in response for "
            java.lang.StringBuilder r4 = b1.AbstractC0703b.q(r6, r4, r7)
            io.ktor.client.call.HttpClientCall r6 = r9.getCall()
            io.ktor.client.request.HttpRequest r6 = r6.getRequest()
            io.ktor.http.Url r6 = r6.getUrl()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r5.e(r4)
            goto L56
        L85:
            java.util.List r9 = io.ktor.http.HttpMessagePropertiesKt.setCookie(r9)
            java.util.Iterator r9 = r9.iterator()
            r2 = r10
        L8e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La9
            java.lang.Object r10 = r9.next()
            io.ktor.http.Cookie r10 = (io.ktor.http.Cookie) r10
            io.ktor.client.plugins.cookies.CookiesStorage r4 = r8.storage
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r4.addCookie(r2, r10, r0)
            if (r10 != r1) goto L8e
            return r1
        La9:
            O3.C r9 = O3.C.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.saveCookiesFrom$ktor_client_core(io.ktor.client.statement.HttpResponse, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder r5, S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r0 = (io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1 r0 = new io.ktor.client.plugins.cookies.HttpCookies$sendCookiesWith$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            io.ktor.client.request.HttpRequestBuilder r5 = (io.ktor.client.request.HttpRequestBuilder) r5
            P3.r.Y(r6)
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r6)
            io.ktor.http.URLBuilder r6 = r5.getUrl()
            io.ktor.http.URLBuilder r6 = io.ktor.http.URLBuilderKt.clone(r6)
            io.ktor.http.Url r6 = r6.build()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.get(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L81
            java.lang.String r6 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$renderClientCookies(r6)
            io.ktor.http.HeadersBuilder r0 = r5.getHeaders()
            io.ktor.http.HttpHeaders r1 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r1 = r1.getCookie()
            r0.set(r1, r6)
            z6.b r0 = io.ktor.client.plugins.cookies.HttpCookiesKt.access$getLOGGER$p()
            java.lang.String r1 = "Sending cookie "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r6 = b1.AbstractC0703b.q(r1, r6, r2)
            io.ktor.http.URLBuilder r5 = r5.getUrl()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r0.e(r5)
            goto L8e
        L81:
            io.ktor.http.HeadersBuilder r5 = r5.getHeaders()
            io.ktor.http.HttpHeaders r6 = io.ktor.http.HttpHeaders.INSTANCE
            java.lang.String r6 = r6.getCookie()
            r5.remove(r6)
        L8e:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cookies.HttpCookies.sendCookiesWith$ktor_client_core(io.ktor.client.request.HttpRequestBuilder, S3.c):java.lang.Object");
    }
}
