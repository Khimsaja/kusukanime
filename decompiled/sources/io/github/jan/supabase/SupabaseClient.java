package io.github.jan.supabase;

import H5.AbstractC0281w;
import O3.C;
import S3.c;
import e4.k;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.logging.KermitSupabaseLogger;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.network.KtorSupabaseHttpClient;
import io.github.jan.supabase.plugins.PluginManager;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 *2\u00020\u0001:\u0001*J\u000e\u0010'\u001a\u00020(H¦@¢\u0006\u0002\u0010)R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R:\u0010\u001a\u001a\"\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001bj\u0004\u0018\u0001`\u001d8&X§\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&¨\u0006+À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/SupabaseClient;", "", "supabaseHttpUrl", "", "getSupabaseHttpUrl", "()Ljava/lang/String;", "supabaseUrl", "getSupabaseUrl", "supabaseKey", "getSupabaseKey", "pluginManager", "Lio/github/jan/supabase/plugins/PluginManager;", "getPluginManager", "()Lio/github/jan/supabase/plugins/PluginManager;", "httpClient", "Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "getHttpClient", "()Lio/github/jan/supabase/network/KtorSupabaseHttpClient;", "useHTTPS", "", "getUseHTTPS", "()Z", "defaultSerializer", "Lio/github/jan/supabase/SupabaseSerializer;", "getDefaultSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "accessToken", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/AccessTokenProvider;", "getAccessToken$annotations", "()V", "getAccessToken", "()Lkotlin/jvm/functions/Function1;", "coroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getCoroutineDispatcher$annotations", "getCoroutineDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupabaseClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lio/github/jan/supabase/SupabaseClient$Companion;", "", "<init>", "()V", "value", "Lio/github/jan/supabase/logging/LogLevel;", "DEFAULT_LOG_LEVEL", "getDEFAULT_LOG_LEVEL", "()Lio/github/jan/supabase/logging/LogLevel;", "setDEFAULT_LOG_LEVEL$supabase_kt_release", "(Lio/github/jan/supabase/logging/LogLevel;)V", "LOGGER", "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLOGGER", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "createLogger", "tag", "", "level", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        private static LogLevel DEFAULT_LOG_LEVEL;
        private static final SupabaseLogger LOGGER;

        static {
            Companion companion = new Companion();
            $$INSTANCE = companion;
            DEFAULT_LOG_LEVEL = LogLevel.INFO;
            LOGGER = createLogger$default(companion, "Supabase-Core", null, 2, null);
        }

        private Companion() {
        }

        public static /* synthetic */ SupabaseLogger createLogger$default(Companion companion, String str, LogLevel logLevel, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                logLevel = null;
            }
            return companion.createLogger(str, logLevel);
        }

        public final SupabaseLogger createLogger(String tag, LogLevel level) {
            l.f("tag", tag);
            if (level == null) {
                level = DEFAULT_LOG_LEVEL;
            }
            return new KermitSupabaseLogger(level, tag, null, 4, null);
        }

        public final LogLevel getDEFAULT_LOG_LEVEL() {
            return DEFAULT_LOG_LEVEL;
        }

        public final SupabaseLogger getLOGGER() {
            return LOGGER;
        }

        public final void setDEFAULT_LOG_LEVEL$supabase_kt_release(LogLevel logLevel) {
            l.f("<set-?>", logLevel);
            DEFAULT_LOG_LEVEL = logLevel;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @SupabaseInternal
        public static /* synthetic */ void getAccessToken$annotations() {
        }

        @SupabaseInternal
        public static /* synthetic */ void getCoroutineDispatcher$annotations() {
        }
    }

    Object close(c<? super C> cVar);

    k getAccessToken();

    AbstractC0281w getCoroutineDispatcher();

    SupabaseSerializer getDefaultSerializer();

    KtorSupabaseHttpClient getHttpClient();

    PluginManager getPluginManager();

    String getSupabaseHttpUrl();

    String getSupabaseKey();

    String getSupabaseUrl();

    boolean getUseHTTPS();
}
