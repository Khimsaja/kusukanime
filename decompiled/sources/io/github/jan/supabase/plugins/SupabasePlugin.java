package io.github.jan.supabase.plugins;

import O3.C;
import S3.c;
import io.github.jan.supabase.SupabaseClient;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000bH\u0016R\u0012\u0010\u0003\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/plugins/SupabasePlugin;", "Config", "", "config", "getConfig", "()Ljava/lang/Object;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "close", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupabasePlugin<Config> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <Config> Object close(SupabasePlugin<Config> supabasePlugin, c<? super C> cVar) {
            return SupabasePlugin.super.close(cVar);
        }

        @Deprecated
        public static <Config> void init(SupabasePlugin<Config> supabasePlugin) {
            SupabasePlugin.super.init();
        }
    }

    static /* synthetic */ <Config> Object close$suspendImpl(SupabasePlugin<Config> supabasePlugin, c<? super C> cVar) {
        return C.a;
    }

    default Object close(c<? super C> cVar) {
        return close$suspendImpl(this, cVar);
    }

    Config getConfig();

    SupabaseClient getSupabaseClient();

    default void init() {
    }
}
