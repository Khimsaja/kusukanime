package io.github.jan.supabase.storage;

import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.plugins.PluginManager;
import io.github.jan.supabase.plugins.SupabasePlugin;
import io.github.jan.supabase.storage.Storage;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"storage", "Lio/github/jan/supabase/storage/Storage;", "Lio/github/jan/supabase/SupabaseClient;", "getStorage", "(Lio/github/jan/supabase/SupabaseClient;)Lio/github/jan/supabase/storage/Storage;", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StorageKt {
    public static final Storage getStorage(SupabaseClient supabaseClient) {
        l.f("<this>", supabaseClient);
        PluginManager pluginManager = supabaseClient.getPluginManager();
        Storage.Companion companion = Storage.INSTANCE;
        SupabasePlugin<?> supabasePlugin = pluginManager.getInstalledPlugins().get(companion.getKey());
        if (!(supabasePlugin instanceof Storage)) {
            supabasePlugin = null;
        }
        Storage storage = (Storage) supabasePlugin;
        if (storage != null) {
            return storage;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(companion.getKey());
        sb.append(" not installed or not of type ");
        z zVar = y.a;
        sb.append(zVar.b(Storage.class).n());
        sb.append(". Consider installing ");
        sb.append(zVar.b(Storage.class).n());
        sb.append(" within your SupabaseClientBuilder");
        throw new IllegalStateException(sb.toString().toString());
    }
}
