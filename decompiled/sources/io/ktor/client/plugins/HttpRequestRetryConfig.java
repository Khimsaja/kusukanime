package io.ktor.client.plugins;

import A3.C0006a;
import A3.C0007b;
import H5.D;
import O3.C;
import P3.r;
import U3.j;
import e4.n;
import e4.o;
import i4.AbstractC1079e;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.utils.CIOKt;
import io.ktor.http.Headers;
import io.ktor.http.HttpHeaders;
import io.ktor.utils.io.KtorDsl;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@KtorDsl
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J'\u0010\n\u001a\u00020\u00042\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\u0004\b\u0016\u0010\u0014J!\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001bJ1\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00122\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0\u0006¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J?\u0010*\u001a\u00020\u00042\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010)\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020\u00042\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040,\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b-\u0010\u000bJ\u0017\u0010.\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b.\u0010/R:\u00100\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R:\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00120\u000e8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u00103\"\u0004\b8\u00105R4\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001f0\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b \u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u000bR>\u0010-\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040,\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u00109\u001a\u0004\b=\u0010;\"\u0004\b>\u0010\u000bRH\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00062\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b@\u0010;R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u001bR+\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bE\u00103R+\u0010\u0016\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\bF\u00103¨\u0006G"}, d2 = {"Lio/ktor/client/plugins/HttpRequestRetryConfig;", "", "<init>", "()V", "LO3/C;", "noRetry", "Lkotlin/Function2;", "Lio/ktor/client/plugins/HttpRetryModifyRequestContext;", "Lio/ktor/client/request/HttpRequestBuilder;", "block", "modifyRequest", "(Le4/n;)V", "", "maxRetries", "Lkotlin/Function3;", "Lio/ktor/client/plugins/HttpRetryShouldRetryContext;", "Lio/ktor/client/request/HttpRequest;", "Lio/ktor/client/statement/HttpResponse;", "", "retryIf", "(ILe4/o;)V", "", "retryOnExceptionIf", "retryOnTimeout", "retryOnException", "(IZ)V", "retryOnServerErrors", "(I)V", "retryOnExceptionOrServerErrors", "respectRetryAfterHeader", "Lio/ktor/client/plugins/HttpRetryDelayContext;", "", "delayMillis", "(ZLe4/n;)V", "millis", "randomizationMs", "constantDelay", "(JJZ)V", "", "base", "baseDelayMs", "maxDelayMs", "exponentialDelay", "(DJJJZ)V", "LS3/c;", "delay", "randomMs", "(J)J", "shouldRetry", "Le4/o;", "getShouldRetry$ktor_client_core", "()Le4/o;", "setShouldRetry$ktor_client_core", "(Le4/o;)V", "shouldRetryOnException", "getShouldRetryOnException$ktor_client_core", "setShouldRetryOnException$ktor_client_core", "Le4/n;", "getDelayMillis$ktor_client_core", "()Le4/n;", "setDelayMillis$ktor_client_core", "getDelay$ktor_client_core", "setDelay$ktor_client_core", "value", "getModifyRequest", "I", "getMaxRetries", "()I", "setMaxRetries", "getRetryIf", "getRetryOnExceptionIf", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpRequestRetryConfig {
    public n delayMillis;
    private int maxRetries;
    public o shouldRetry;
    public o shouldRetryOnException;
    private n delay = new AnonymousClass1(null);
    private n modifyRequest = new C0006a(25);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LO3/C;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 1, 0})
    @U3.e(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", l = {42}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.HttpRequestRetryConfig$delay$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        /* synthetic */ long J$0;
        int label;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar);
            anonymousClass1.J$0 = ((Number) obj).longValue();
            return anonymousClass1;
        }

        public final Object invoke(long j7, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                long j7 = this.J$0;
                this.label = 1;
                if (D.k(j7, this) == aVar) {
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

        @Override // e4.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (S3.c<? super C>) obj2);
        }
    }

    public HttpRequestRetryConfig() {
        retryOnExceptionOrServerErrors(3);
        exponentialDelay$default(this, 0.0d, 0L, 0L, 0L, false, 31, null);
    }

    public static /* synthetic */ void constantDelay$default(HttpRequestRetryConfig httpRequestRetryConfig, long j7, long j8, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = 1000;
        }
        if ((i7 & 2) != 0) {
            j8 = 1000;
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        httpRequestRetryConfig.constantDelay(j7, j8, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constantDelay$lambda$7(long j7, HttpRequestRetryConfig httpRequestRetryConfig, long j8, HttpRetryDelayContext httpRetryDelayContext, int i7) {
        l.f("$this$delayMillis", httpRetryDelayContext);
        return j7 + httpRequestRetryConfig.randomMs(j8);
    }

    public static /* synthetic */ void delayMillis$default(HttpRequestRetryConfig httpRequestRetryConfig, boolean z7, n nVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        httpRequestRetryConfig.delayMillis(z7, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long delayMillis$lambda$6(boolean z7, n nVar, HttpRetryDelayContext httpRetryDelayContext, int i7) {
        Headers headers;
        String str;
        Long lV;
        l.f("<this>", httpRetryDelayContext);
        if (!z7) {
            return ((Number) nVar.invoke(httpRetryDelayContext, Integer.valueOf(i7))).longValue();
        }
        HttpResponse response = httpRetryDelayContext.getResponse();
        Long lValueOf = (response == null || (headers = response.getHeaders()) == null || (str = headers.get(HttpHeaders.INSTANCE.getRetryAfter())) == null || (lV = AbstractC2517v.V(str)) == null) ? null : Long.valueOf(lV.longValue() * CIOKt.DEFAULT_HTTP_POOL_SIZE);
        return Math.max(((Number) nVar.invoke(httpRetryDelayContext, Integer.valueOf(i7))).longValue(), lValueOf != null ? lValueOf.longValue() : 0L);
    }

    public static /* synthetic */ void exponentialDelay$default(HttpRequestRetryConfig httpRequestRetryConfig, double d4, long j7, long j8, long j9, boolean z7, int i7, Object obj) {
        httpRequestRetryConfig.exponentialDelay((i7 & 1) != 0 ? 2.0d : d4, (i7 & 2) != 0 ? 1000L : j7, (i7 & 4) != 0 ? 60000L : j8, (i7 & 8) == 0 ? j9 : 1000L, (i7 & 16) != 0 ? true : z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long exponentialDelay$lambda$8(double d4, long j7, long j8, HttpRequestRetryConfig httpRequestRetryConfig, long j9, HttpRetryDelayContext httpRetryDelayContext, int i7) {
        l.f("$this$delayMillis", httpRetryDelayContext);
        return Math.min((long) (Math.pow(d4, i7 - 1) * j7), j8) + httpRequestRetryConfig.randomMs(j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C modifyRequest$lambda$0(HttpRetryModifyRequestContext httpRetryModifyRequestContext, HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRetryModifyRequestContext);
        l.f("it", httpRequestBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noRetry$lambda$1(HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequest httpRequest, HttpResponse httpResponse) {
        l.f("<this>", httpRetryShouldRetryContext);
        l.f("<unused var>", httpRequest);
        l.f("<unused var>", httpResponse);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean noRetry$lambda$2(HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequestBuilder httpRequestBuilder, Throwable th) {
        l.f("<this>", httpRetryShouldRetryContext);
        l.f("<unused var>", httpRequestBuilder);
        l.f("<unused var>", th);
        return false;
    }

    private final long randomMs(long randomizationMs) {
        if (randomizationMs == 0) {
            return 0L;
        }
        return AbstractC1079e.f12024k.f(randomizationMs);
    }

    public static /* synthetic */ void retryIf$default(HttpRequestRetryConfig httpRequestRetryConfig, int i7, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        httpRequestRetryConfig.retryIf(i7, oVar);
    }

    public static /* synthetic */ void retryOnException$default(HttpRequestRetryConfig httpRequestRetryConfig, int i7, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        if ((i8 & 2) != 0) {
            z7 = false;
        }
        httpRequestRetryConfig.retryOnException(i7, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnException$lambda$3(boolean z7, HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequestBuilder httpRequestBuilder, Throwable th) {
        l.f("$this$retryOnExceptionIf", httpRetryShouldRetryContext);
        l.f("<unused var>", httpRequestBuilder);
        l.f("cause", th);
        return HttpRequestRetryKt.isTimeoutException(th) ? z7 : !(th instanceof CancellationException);
    }

    public static /* synthetic */ void retryOnExceptionIf$default(HttpRequestRetryConfig httpRequestRetryConfig, int i7, o oVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        httpRequestRetryConfig.retryOnExceptionIf(i7, oVar);
    }

    public static /* synthetic */ void retryOnExceptionOrServerErrors$default(HttpRequestRetryConfig httpRequestRetryConfig, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        httpRequestRetryConfig.retryOnExceptionOrServerErrors(i7);
    }

    public static /* synthetic */ void retryOnServerErrors$default(HttpRequestRetryConfig httpRequestRetryConfig, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        httpRequestRetryConfig.retryOnServerErrors(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean retryOnServerErrors$lambda$5(HttpRetryShouldRetryContext httpRetryShouldRetryContext, HttpRequest httpRequest, HttpResponse httpResponse) {
        l.f("$this$retryIf", httpRetryShouldRetryContext);
        l.f("<unused var>", httpRequest);
        l.f("response", httpResponse);
        int value = httpResponse.getStatus().getValue();
        return 500 <= value && value < 600;
    }

    public final void constantDelay(final long millis, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (millis <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new n() { // from class: io.ktor.client.plugins.d
            @Override // e4.n
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                HttpRequestRetryConfig httpRequestRetryConfig = this;
                long j7 = randomizationMs;
                return Long.valueOf(HttpRequestRetryConfig.constantDelay$lambda$7(millis, httpRequestRetryConfig, j7, (HttpRetryDelayContext) obj, iIntValue));
            }
        });
    }

    public final void delay(n block) {
        l.f("block", block);
        this.delay = block;
    }

    public final void delayMillis(final boolean respectRetryAfterHeader, final n block) {
        l.f("block", block);
        setDelayMillis$ktor_client_core(new n() { // from class: io.ktor.client.plugins.e
            @Override // e4.n
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                n nVar = block;
                return Long.valueOf(HttpRequestRetryConfig.delayMillis$lambda$6(respectRetryAfterHeader, nVar, (HttpRetryDelayContext) obj, iIntValue));
            }
        });
    }

    public final void exponentialDelay(final double base, final long baseDelayMs, final long maxDelayMs, final long randomizationMs, boolean respectRetryAfterHeader) {
        if (base <= 0.0d) {
            throw new IllegalStateException("Check failed.");
        }
        if (baseDelayMs <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (maxDelayMs <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (randomizationMs < 0) {
            throw new IllegalStateException("Check failed.");
        }
        delayMillis(respectRetryAfterHeader, new n() { // from class: io.ktor.client.plugins.f
            @Override // e4.n
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                HttpRequestRetryConfig httpRequestRetryConfig = this;
                long j7 = randomizationMs;
                return Long.valueOf(HttpRequestRetryConfig.exponentialDelay$lambda$8(base, baseDelayMs, maxDelayMs, httpRequestRetryConfig, j7, (HttpRetryDelayContext) obj, iIntValue));
            }
        });
    }

    /* renamed from: getDelay$ktor_client_core, reason: from getter */
    public final n getDelay() {
        return this.delay;
    }

    public final n getDelayMillis$ktor_client_core() {
        n nVar = this.delayMillis;
        if (nVar != null) {
            return nVar;
        }
        l.l("delayMillis");
        throw null;
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final n getModifyRequest() {
        return this.modifyRequest;
    }

    public final o getRetryIf() {
        if (this.shouldRetry != null) {
            return getShouldRetry$ktor_client_core();
        }
        return null;
    }

    public final o getRetryOnExceptionIf() {
        if (this.shouldRetryOnException != null) {
            return getShouldRetryOnException$ktor_client_core();
        }
        return null;
    }

    public final o getShouldRetry$ktor_client_core() {
        o oVar = this.shouldRetry;
        if (oVar != null) {
            return oVar;
        }
        l.l("shouldRetry");
        throw null;
    }

    public final o getShouldRetryOnException$ktor_client_core() {
        o oVar = this.shouldRetryOnException;
        if (oVar != null) {
            return oVar;
        }
        l.l("shouldRetryOnException");
        throw null;
    }

    public final void modifyRequest(n block) {
        l.f("block", block);
        this.modifyRequest = block;
    }

    public final void noRetry() {
        this.maxRetries = 0;
        setShouldRetry$ktor_client_core(new C0007b(19));
        setShouldRetryOnException$ktor_client_core(new C0007b(20));
    }

    public final void retryIf(int maxRetries, o block) {
        l.f("block", block);
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetry$ktor_client_core(block);
    }

    public final void retryOnException(int maxRetries, final boolean retryOnTimeout) {
        retryOnExceptionIf(maxRetries, new o() { // from class: io.ktor.client.plugins.c
            @Override // e4.o
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(HttpRequestRetryConfig.retryOnException$lambda$3(retryOnTimeout, (HttpRetryShouldRetryContext) obj, (HttpRequestBuilder) obj2, (Throwable) obj3));
            }
        });
    }

    public final void retryOnExceptionIf(int maxRetries, o block) {
        l.f("block", block);
        if (maxRetries != -1) {
            this.maxRetries = maxRetries;
        }
        setShouldRetryOnException$ktor_client_core(block);
    }

    public final void retryOnExceptionOrServerErrors(int maxRetries) {
        retryOnServerErrors(maxRetries);
        retryOnException$default(this, maxRetries, false, 2, null);
    }

    public final void retryOnServerErrors(int maxRetries) {
        retryIf(maxRetries, new C0007b(21));
    }

    public final void setDelay$ktor_client_core(n nVar) {
        l.f("<set-?>", nVar);
        this.delay = nVar;
    }

    public final void setDelayMillis$ktor_client_core(n nVar) {
        l.f("<set-?>", nVar);
        this.delayMillis = nVar;
    }

    public final void setMaxRetries(int i7) {
        this.maxRetries = i7;
    }

    public final void setShouldRetry$ktor_client_core(o oVar) {
        l.f("<set-?>", oVar);
        this.shouldRetry = oVar;
    }

    public final void setShouldRetryOnException$ktor_client_core(o oVar) {
        l.f("<set-?>", oVar);
        this.shouldRetryOnException = oVar;
    }
}
