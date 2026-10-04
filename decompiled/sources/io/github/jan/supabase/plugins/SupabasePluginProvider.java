package io.github.jan.supabase.plugins;

import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.SupabasePlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004J&\u0010\r\u001a\u00028\u00002\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H&¢\u0006\u0002\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001bR\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Config", "PluginInstance", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "", "key", "", "getKey", "()Ljava/lang/String;", "logger", "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "createConfig", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setup", "builder", "Lio/github/jan/supabase/SupabaseClientBuilder;", "config", "(Lio/github/jan/supabase/SupabaseClientBuilder;Ljava/lang/Object;)V", "create", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/Object;)Lio/github/jan/supabase/plugins/SupabasePlugin;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupabasePluginProvider<Config, PluginInstance extends SupabasePlugin<Config>> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <Config, PluginInstance extends SupabasePlugin<Config>> void setup(SupabasePluginProvider<Config, PluginInstance> supabasePluginProvider, SupabaseClientBuilder supabaseClientBuilder, Config config) {
            l.f("builder", supabaseClientBuilder);
            SupabasePluginProvider.super.setup(supabaseClientBuilder, config);
        }
    }

    PluginInstance create(SupabaseClient supabaseClient, Config config);

    Config createConfig(k kVar);

    String getKey();

    SupabaseLogger getLogger();

    default void setup(SupabaseClientBuilder builder, Config config) {
        l.f("builder", builder);
    }
}
