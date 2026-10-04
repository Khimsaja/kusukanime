package io.github.jan.supabase.plugins;

import O3.C;
import S3.c;
import io.github.jan.supabase.exceptions.RestException;
import io.github.jan.supabase.plugins.MainConfig;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.URLBuilder;
import io.ktor.http.URLBuilderKt;
import io.ktor.http.URLUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0012\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H¦@¢\u0006\u0002\u0010\u0012R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/plugins/MainPlugin;", "Config", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/SupabasePlugin;", "apiVersion", "", "getApiVersion", "()I", "pluginKey", "", "getPluginKey", "()Ljava/lang/String;", "resolveUrl", "path", "parseErrorResponse", "Lio/github/jan/supabase/exceptions/RestException;", "response", "Lio/ktor/client/statement/HttpResponse;", "(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MainPlugin<Config extends MainConfig> extends SupabasePlugin<Config> {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static <Config extends MainConfig> Object close(MainPlugin<Config> mainPlugin, c<? super C> cVar) {
            return MainPlugin.super.close(cVar);
        }

        @Deprecated
        public static <Config extends MainConfig> void init(MainPlugin<Config> mainPlugin) {
            MainPlugin.super.init();
        }

        @Deprecated
        public static <Config extends MainConfig> String resolveUrl(MainPlugin<Config> mainPlugin, String str) {
            l.f("path", str);
            return MainPlugin.super.resolveUrl(str);
        }
    }

    static /* synthetic */ String resolveUrl$default(MainPlugin mainPlugin, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolveUrl");
        }
        if ((i7 & 1) != 0) {
            str = "";
        }
        return mainPlugin.resolveUrl(str);
    }

    int getApiVersion();

    String getPluginKey();

    Object parseErrorResponse(HttpResponse httpResponse, c<? super RestException> cVar);

    default String resolveUrl(String path) {
        l.f("path", path);
        boolean z7 = getConfig().getCustomUrl() == null;
        String customUrl = getConfig().getCustomUrl();
        if (customUrl == null) {
            customUrl = getSupabaseClient().getSupabaseHttpUrl();
        }
        URLBuilder URLBuilder = URLUtilsKt.URLBuilder(customUrl);
        if (z7) {
            URLBuilderKt.appendEncodedPathSegments(URLBuilder, getPluginKey(), "v" + getApiVersion());
        }
        if (!AbstractC2510o.g0(path)) {
            URLBuilderKt.appendEncodedPathSegments(URLBuilder, path);
        }
        return URLBuilder.buildString();
    }
}
