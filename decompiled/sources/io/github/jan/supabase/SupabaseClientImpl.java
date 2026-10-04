package io.github.jan.supabase;

import A5.a;
import H5.AbstractC0281w;
import P3.E;
import P3.F;
import P3.r;
import U3.c;
import U3.e;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.network.KtorSupabaseHttpClient;
import io.github.jan.supabase.plugins.PluginManager;
import io.github.jan.supabase.plugins.SupabasePlugin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010,\u001a\u00020-H\u0096@¢\u0006\u0002\u0010.R6\u0010\u0006\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u0007j\u0004\u0018\u0001`\u000bX\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001a\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lio/github/jan/supabase/SupabaseClientImpl;", "Lio/github/jan/supabase/SupabaseClient;", "config", "Lio/github/jan/supabase/SupabaseClientConfig;", "<init>", "(Lio/github/jan/supabase/SupabaseClientConfig;)V", "accessToken", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "Lio/github/jan/supabase/AccessTokenProvider;", "getAccessToken", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "defaultSerializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "supabaseUrl", "getSupabaseUrl", "()Ljava/lang/String;", "supabaseKey", "getSupabaseKey", "useHTTPS", "", "getUseHTTPS", "()Z", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "supabaseHttpUrl", "getSupabaseHttpUrl", "httpClient", "Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "getHttpClient$annotations", "()V", "getHttpClient", "()Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "pluginManager", "Lio/github/jan/supabase/plugins/PluginManager;", "getPluginManager", "()Lio/github/jan/supabase/plugins/PluginManager;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupabaseClientImpl implements SupabaseClient {
    private final k accessToken;
    private final AbstractC0281w coroutineDispatcher;
    private final SupabaseSerializer defaultSerializer;
    private final KtorSupabaseHttpClient httpClient;
    private final PluginManager pluginManager;
    private final String supabaseHttpUrl;
    private final String supabaseKey;
    private final String supabaseUrl;
    private final boolean useHTTPS;

    @e(c = "io.github.jan.supabase.SupabaseClientImpl", f = "SupabaseClient.kt", l = {151}, m = "close", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.SupabaseClientImpl$close$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupabaseClientImpl.this.close(this);
        }
    }

    public SupabaseClientImpl(SupabaseClientConfig supabaseClientConfig) {
        l.f("config", supabaseClientConfig);
        this.accessToken = supabaseClientConfig.getAccessToken();
        this.defaultSerializer = supabaseClientConfig.getDefaultSerializer();
        this.supabaseUrl = supabaseClientConfig.getSupabaseUrl();
        this.supabaseKey = supabaseClientConfig.getSupabaseKey();
        this.useHTTPS = supabaseClientConfig.getNetworkConfig().getUseHTTPS();
        this.coroutineDispatcher = supabaseClientConfig.getCoroutineDispatcher();
        SupabaseClient.Companion companion = SupabaseClient.INSTANCE;
        SupabaseLogger logger = companion.getLOGGER();
        LogLevel logLevel = LogLevel.INFO;
        LogLevel level = logger.getLevel();
        if (logLevel.compareTo(level == null ? companion.getDEFAULT_LOG_LEVEL() : level) >= 0) {
            logger.log(logLevel, (Throwable) null, "SupabaseClient created! Please report any bugs you find.");
        }
        this.supabaseHttpUrl = getUseHTTPS() ? "https://" + getSupabaseUrl() : "http://" + getSupabaseUrl();
        this.httpClient = new KtorSupabaseHttpClient(getSupabaseKey(), supabaseClientConfig.getNetworkConfig().getHttpConfigOverrides(), a.c(supabaseClientConfig.getNetworkConfig().m10getRequestTimeoutUwyO8pc()), supabaseClientConfig.getNetworkConfig().getHttpEngine(), supabaseClientConfig.getOsInformation());
        List<O3.l> listQ0 = E.q0(supabaseClientConfig.getPlugins());
        int I = F.I(r.p(listQ0, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(I < 16 ? 16 : I);
        for (O3.l lVar : listQ0) {
            linkedHashMap.put((String) lVar.f7528k, ((k) lVar.f7529l).invoke(this));
        }
        this.pluginManager = new PluginManager(linkedHashMap);
        Iterator<T> it = getPluginManager().getInstalledPlugins().values().iterator();
        while (it.hasNext()) {
            ((SupabasePlugin) it.next()).init();
        }
    }

    public static /* synthetic */ void getHttpClient$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.SupabaseClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object close(S3.c<? super O3.C> r10) throws java.lang.Exception {
        /*
            r9 = this;
            boolean r0 = r10 instanceof io.github.jan.supabase.SupabaseClientImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r10
            io.github.jan.supabase.SupabaseClientImpl$close$1 r0 = (io.github.jan.supabase.SupabaseClientImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.SupabaseClientImpl$close$1 r0 = new io.github.jan.supabase.SupabaseClientImpl$close$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            int r2 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$4
            io.github.jan.supabase.plugins.SupabasePlugin r7 = (io.github.jan.supabase.plugins.SupabasePlugin) r7
            java.lang.Object r7 = r0.L$2
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$1
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.Object r8 = r0.L$0
            io.github.jan.supabase.plugins.PluginManager r8 = (io.github.jan.supabase.plugins.PluginManager) r8
            P3.r.Y(r10)
            goto L81
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L45:
            P3.r.Y(r10)
            io.github.jan.supabase.SupabaseClient$Companion r10 = io.github.jan.supabase.SupabaseClient.INSTANCE
            io.github.jan.supabase.logging.SupabaseLogger r2 = r10.getLOGGER()
            io.github.jan.supabase.logging.LogLevel r6 = io.github.jan.supabase.logging.LogLevel.INFO
            io.github.jan.supabase.logging.LogLevel r7 = r2.getLevel()
            if (r7 != 0) goto L5a
            io.github.jan.supabase.logging.LogLevel r7 = r10.getDEFAULT_LOG_LEVEL()
        L5a:
            int r10 = r6.compareTo(r7)
            if (r10 < 0) goto L65
            java.lang.String r10 = "Closing SupabaseClient"
            r2.log(r6, r5, r10)
        L65:
            io.github.jan.supabase.network.KtorSupabaseHttpClient r10 = r9.getHttpClient()
            r10.close()
            io.github.jan.supabase.plugins.PluginManager r10 = r9.getPluginManager()
            java.util.Map r10 = r10.getInstalledPlugins()
            java.util.Collection r10 = r10.values()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r7 = r10
            r2 = r4
            r6 = r2
        L81:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto La6
            java.lang.Object r10 = r7.next()
            io.github.jan.supabase.plugins.SupabasePlugin r10 = (io.github.jan.supabase.plugins.SupabasePlugin) r10
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r7
            r0.L$3 = r5
            r0.L$4 = r5
            r0.I$0 = r6
            r0.I$1 = r2
            r0.I$2 = r4
            r0.label = r3
            java.lang.Object r10 = r10.close(r0)
            if (r10 != r1) goto L81
            return r1
        La6:
            O3.C r10 = O3.C.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.SupabaseClientImpl.close(S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public k getAccessToken() {
        return this.accessToken;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public AbstractC0281w getCoroutineDispatcher() {
        return this.coroutineDispatcher;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public SupabaseSerializer getDefaultSerializer() {
        return this.defaultSerializer;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public KtorSupabaseHttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public PluginManager getPluginManager() {
        return this.pluginManager;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public String getSupabaseHttpUrl() {
        return this.supabaseHttpUrl;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public String getSupabaseKey() {
        return this.supabaseKey;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public String getSupabaseUrl() {
        return this.supabaseUrl;
    }

    @Override // io.github.jan.supabase.SupabaseClient
    public boolean getUseHTTPS() {
        return this.useHTTPS;
    }
}
