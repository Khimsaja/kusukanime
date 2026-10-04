package io.github.jan.supabase;

import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a5\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000*,\b\u0000\u0010\u0000\"\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00012\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001*6\b\u0000\u0010\u0004\"\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\b\u00072\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0002\b\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"PluginProvider", "Lkotlin/Function1;", "Lio/github/jan/supabase/SupabaseClient;", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "HttpConfigOverride", "Lio/ktor/client/HttpClientConfig;", "", "Lkotlin/ExtensionFunctionType;", "createSupabaseClient", "supabaseUrl", "", "supabaseKey", "builder", "Lio/github/jan/supabase/SupabaseClientBuilder;", "supabase-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupabaseClientBuilderKt {
    public static final SupabaseClient createSupabaseClient(String str, String str2, k kVar) {
        l.f("supabaseUrl", str);
        l.f("supabaseKey", str2);
        l.f("builder", kVar);
        SupabaseClientBuilder supabaseClientBuilder = new SupabaseClientBuilder(str, str2);
        kVar.invoke(supabaseClientBuilder);
        return supabaseClientBuilder.build();
    }
}
