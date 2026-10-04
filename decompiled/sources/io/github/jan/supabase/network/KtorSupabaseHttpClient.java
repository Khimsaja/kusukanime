package io.github.jan.supabase.network;

import O3.C;
import P3.y;
import U3.c;
import U3.e;
import e4.k;
import io.github.jan.supabase.OSInformation;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.UtilsKt;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.exceptions.HttpRequestException;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientJvmKt;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.HttpClientEngine;
import io.ktor.client.plugins.DefaultRequest;
import io.ktor.client.plugins.HttpRequestTimeoutException;
import io.ktor.client.plugins.HttpTimeoutConfig;
import io.ktor.client.plugins.HttpTimeoutKt;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationConfig;
import io.ktor.client.plugins.contentnegotiation.ContentNegotiationKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HeadersBuilder;
import io.ktor.serialization.kotlinx.json.JsonSupportKt;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BT\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012#\b\u0002\u0010\u0004\u001a\u001d\u0012\u0019\u0012\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0096@¢\u0006\u0002\u0010\u001dJ/\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00032\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0096@¢\u0006\u0002\u0010\u001dJ\u0006\u0010 \u001a\u00020\bJ3\u0010!\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00072!\u0010\u0004\u001a\u001d\u0012\u0019\u0012\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t0\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "Lio/github/jan/supabase/network/SupabaseHttpClient;", "supabaseKey", "", "modifiers", "", "Lkotlin/Function1;", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "requestTimeout", "", "engine", "Lio/ktor/client/engine/HttpClientEngine;", "osInformation", "Lio/github/jan/supabase/OSInformation;", "<init>", "(Ljava/lang/String;Ljava/util/List;JLio/ktor/client/engine/HttpClientEngine;Lio/github/jan/supabase/OSInformation;)V", "httpClient", "Lio/ktor/client/HttpClient;", "getHttpClient$annotations", "()V", "getHttpClient", "()Lio/ktor/client/HttpClient;", "request", "Lio/ktor/client/statement/HttpResponse;", "url", "builder", "Lio/ktor/client/request/HttpRequestBuilder;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareRequest", "Lio/ktor/client/statement/HttpStatement;", "close", "applyDefaultConfiguration", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KtorSupabaseHttpClient extends SupabaseHttpClient {
    private final HttpClient httpClient;
    private final OSInformation osInformation;
    private final long requestTimeout;
    private final String supabaseKey;

    @e(c = "io.github.jan.supabase.network.KtorSupabaseHttpClient", f = "KtorSupabaseHttpClient.kt", l = {145}, m = "request", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.network.KtorSupabaseHttpClient$request$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KtorSupabaseHttpClient.this.request(null, null, this);
        }
    }

    @SupabaseInternal
    public KtorSupabaseHttpClient(String str, final List<? extends k> list, long j7, HttpClientEngine httpClientEngine, OSInformation oSInformation) {
        HttpClient HttpClient;
        l.f("supabaseKey", str);
        l.f("modifiers", list);
        this.supabaseKey = str;
        this.requestTimeout = j7;
        this.osInformation = oSInformation;
        SupabaseClient.Companion companion = SupabaseClient.INSTANCE;
        SupabaseLogger logger = companion.getLOGGER();
        LogLevel logLevel = LogLevel.DEBUG;
        LogLevel level = logger.getLevel();
        if (logLevel.compareTo(level == null ? companion.getDEFAULT_LOG_LEVEL() : level) >= 0) {
            logger.log(logLevel, (Throwable) null, "Creating KtorSupabaseHttpClient with request timeout " + j7 + " ms, HttpClientEngine: " + httpClientEngine);
        }
        if (httpClientEngine != null) {
            final int i7 = 0;
            HttpClient = HttpClientKt.HttpClient(httpClientEngine, new k(this) { // from class: io.github.jan.supabase.network.b

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ KtorSupabaseHttpClient f12076l;

                {
                    this.f12076l = this;
                }

                @Override // e4.k
                public final Object invoke(Object obj) {
                    switch (i7) {
                        case 0:
                            return KtorSupabaseHttpClient.httpClient$lambda$0(this.f12076l, list, (HttpClientConfig) obj);
                        default:
                            return KtorSupabaseHttpClient.httpClient$lambda$1(this.f12076l, list, (HttpClientConfig) obj);
                    }
                }
            });
        } else {
            final int i8 = 1;
            HttpClient = HttpClientJvmKt.HttpClient(new k(this) { // from class: io.github.jan.supabase.network.b

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ KtorSupabaseHttpClient f12076l;

                {
                    this.f12076l = this;
                }

                @Override // e4.k
                public final Object invoke(Object obj) {
                    switch (i8) {
                        case 0:
                            return KtorSupabaseHttpClient.httpClient$lambda$0(this.f12076l, list, (HttpClientConfig) obj);
                        default:
                            return KtorSupabaseHttpClient.httpClient$lambda$1(this.f12076l, list, (HttpClientConfig) obj);
                    }
                }
            });
        }
        this.httpClient = HttpClient;
    }

    private final void applyDefaultConfiguration(HttpClientConfig<?> httpClientConfig, List<? extends k> list) {
        httpClientConfig.install(DefaultRequest.INSTANCE, new a(this, 0));
        httpClientConfig.install(ContentNegotiationKt.getContentNegotiation(), new A3.e(26));
        httpClientConfig.install(HttpTimeoutKt.getHttpTimeout(), new a(this, 1));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(httpClientConfig);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyDefaultConfiguration$lambda$0(KtorSupabaseHttpClient ktorSupabaseHttpClient, DefaultRequest.DefaultRequestBuilder defaultRequestBuilder) {
        l.f("$this$install", defaultRequestBuilder);
        HttpRequestKt.headers(defaultRequestBuilder, new a(ktorSupabaseHttpClient, 2));
        defaultRequestBuilder.setPort(443);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyDefaultConfiguration$lambda$0$0(KtorSupabaseHttpClient ktorSupabaseHttpClient, HeadersBuilder headersBuilder) {
        l.f("$this$headers", headersBuilder);
        if (!AbstractC2510o.g0(ktorSupabaseHttpClient.supabaseKey)) {
            headersBuilder.append("apikey", ktorSupabaseHttpClient.supabaseKey);
        }
        headersBuilder.append("X-Client-Info", "supabase-kt/3.2.3");
        OSInformation oSInformation = ktorSupabaseHttpClient.osInformation;
        if (oSInformation != null) {
            headersBuilder.append("X-Supabase-Client-Platform", oSInformation.getName());
            headersBuilder.append("X-Supabase-Client-Platform-Version", oSInformation.getVersion());
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyDefaultConfiguration$lambda$1(ContentNegotiationConfig contentNegotiationConfig) {
        l.f("$this$install", contentNegotiationConfig);
        JsonSupportKt.json$default(contentNegotiationConfig, UtilsKt.getSupabaseJson(), null, 2, null);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C applyDefaultConfiguration$lambda$2(KtorSupabaseHttpClient ktorSupabaseHttpClient, HttpTimeoutConfig httpTimeoutConfig) {
        l.f("$this$install", httpTimeoutConfig);
        httpTimeoutConfig.setRequestTimeoutMillis(Long.valueOf(ktorSupabaseHttpClient.requestTimeout));
        return C.a;
    }

    @SupabaseInternal
    public static /* synthetic */ void getHttpClient$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C httpClient$lambda$0(KtorSupabaseHttpClient ktorSupabaseHttpClient, List list, HttpClientConfig httpClientConfig) {
        l.f("$this$HttpClient", httpClientConfig);
        ktorSupabaseHttpClient.applyDefaultConfiguration(httpClientConfig, list);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C httpClient$lambda$1(KtorSupabaseHttpClient ktorSupabaseHttpClient, List list, HttpClientConfig httpClientConfig) {
        l.f("$this$HttpClient", httpClientConfig);
        ktorSupabaseHttpClient.applyDefaultConfiguration(httpClientConfig, list);
        return C.a;
    }

    public final void close() throws Exception {
        this.httpClient.close();
    }

    public final HttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    public Object prepareRequest(String str, k kVar, S3.c<? super HttpStatement> cVar) throws HttpRequestException, HttpRequestTimeoutException {
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        kVar.invoke(httpRequestBuilder);
        try {
            HttpClient httpClient = this.httpClient;
            HttpRequestBuilder httpRequestBuilder2 = new HttpRequestBuilder();
            HttpRequestKt.url(httpRequestBuilder2, str);
            kVar.invoke(httpRequestBuilder2);
            return new HttpStatement(httpRequestBuilder2, httpClient);
        } catch (HttpRequestTimeoutException e7) {
            SupabaseClient.Companion companion = SupabaseClient.INSTANCE;
            SupabaseLogger logger = companion.getLOGGER();
            LogLevel logLevel = LogLevel.ERROR;
            LogLevel level = logger.getLevel();
            if (level == null) {
                level = companion.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel.compareTo(level) >= 0) {
                logger.log(logLevel, (Throwable) null, "Request timed out after " + this.requestTimeout + " ms on url " + str);
            }
            throw e7;
        } catch (CancellationException e8) {
            SupabaseClient.Companion companion2 = SupabaseClient.INSTANCE;
            SupabaseLogger logger2 = companion2.getLOGGER();
            LogLevel logLevel2 = LogLevel.ERROR;
            LogLevel level2 = logger2.getLevel();
            if (level2 == null) {
                level2 = companion2.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel2.compareTo(level2) >= 0) {
                logger2.log(logLevel2, (Throwable) null, "Request was cancelled on url " + str);
            }
            throw e8;
        } catch (Exception e9) {
            SupabaseClient.Companion companion3 = SupabaseClient.INSTANCE;
            SupabaseLogger logger3 = companion3.getLOGGER();
            LogLevel logLevel3 = LogLevel.ERROR;
            LogLevel level3 = logger3.getLevel();
            if (level3 == null) {
                level3 = companion3.getDEFAULT_LOG_LEVEL();
            }
            if (logLevel3.compareTo(level3) >= 0) {
                logger3.log(logLevel3, e9, "Request failed with " + e9.getMessage() + " on url " + str);
            }
            String message = e9.getMessage();
            if (message == null) {
                message = "";
            }
            throw new HttpRequestException(message, httpRequestBuilder);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.network.SupabaseHttpClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object request(java.lang.String r11, e4.k r12, S3.c<? super io.ktor.client.statement.HttpResponse> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.network.KtorSupabaseHttpClient.request(java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public /* synthetic */ KtorSupabaseHttpClient(String str, List list, long j7, HttpClientEngine httpClientEngine, OSInformation oSInformation, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? y.f7779k : list, j7, (i7 & 8) != 0 ? null : httpClientEngine, oSInformation);
    }
}
