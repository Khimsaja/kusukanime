package io.github.jan.supabase.auth;

import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.exceptions.RestException;
import io.github.jan.supabase.plugins.MainConfig;
import io.github.jan.supabase.plugins.MainPlugin;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aP\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000425\b\u0002\u0010\u0005\u001a/\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u000e\u001a5\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00102\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u0015H\u0007\u001a\u0094\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00040\u001225\b\u0002\u0010\u0005\u001a/\b\u0001\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00062\u001b\b\u0002\u0010\u0011\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0012¢\u0006\u0002\b\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"authenticatedSupabaseApi", "Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "Lio/github/jan/supabase/SupabaseClient;", "baseUrl", "", "parseErrorResponse", "Lkotlin/Function2;", "Lio/ktor/client/statement/HttpResponse;", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "response", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/exceptions/RestException;", "", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "plugin", "Lio/github/jan/supabase/plugins/MainPlugin;", "defaultRequest", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "resolveUrl", "path", "jwtToken", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Lio/github/jan/supabase/auth/AuthenticatedSupabaseApi;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthenticatedSupabaseApiKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt$authenticatedSupabaseApi$2, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass2 extends j implements k {
        public AnonymousClass2(Object obj) {
            super(1, 0, MainPlugin.class, obj, "resolveUrl", "resolveUrl(Ljava/lang/String;)Ljava/lang/String;");
        }

        @Override // e4.k
        public final String invoke(String str) {
            l.f("p0", str);
            return ((MainPlugin) this.receiver).resolveUrl(str);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthenticatedSupabaseApiKt$authenticatedSupabaseApi$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends j implements n {
        public AnonymousClass3(Object obj) {
            super(2, 0, MainPlugin.class, obj, "parseErrorResponse", "parseErrorResponse(Lio/ktor/client/statement/HttpResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // e4.n
        public final Object invoke(HttpResponse httpResponse, S3.c<? super RestException> cVar) {
            return ((MainPlugin) this.receiver).parseErrorResponse(httpResponse, cVar);
        }
    }

    @SupabaseInternal
    public static final AuthenticatedSupabaseApi authenticatedSupabaseApi(SupabaseClient supabaseClient, String str, n nVar) {
        l.f("<this>", supabaseClient);
        l.f("baseUrl", str);
        return authenticatedSupabaseApi$default(supabaseClient, new com.kusukanime.data.b(str, 5), nVar, null, null, 12, null);
    }

    public static /* synthetic */ AuthenticatedSupabaseApi authenticatedSupabaseApi$default(SupabaseClient supabaseClient, String str, n nVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            nVar = null;
        }
        return authenticatedSupabaseApi(supabaseClient, str, nVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String authenticatedSupabaseApi$lambda$0(String str, String str2) {
        l.f("it", str2);
        return str + str2;
    }

    @SupabaseInternal
    public static final AuthenticatedSupabaseApi authenticatedSupabaseApi(SupabaseClient supabaseClient, MainPlugin<?> mainPlugin, k kVar) {
        l.f("<this>", supabaseClient);
        l.f("plugin", mainPlugin);
        return authenticatedSupabaseApi(supabaseClient, new AnonymousClass2(mainPlugin), new AnonymousClass3(mainPlugin), kVar, ((MainConfig) mainPlugin.getConfig()).getJwtToken());
    }

    public static /* synthetic */ AuthenticatedSupabaseApi authenticatedSupabaseApi$default(SupabaseClient supabaseClient, MainPlugin mainPlugin, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = null;
        }
        return authenticatedSupabaseApi(supabaseClient, (MainPlugin<?>) mainPlugin, kVar);
    }

    @SupabaseInternal
    public static final AuthenticatedSupabaseApi authenticatedSupabaseApi(SupabaseClient supabaseClient, k kVar, n nVar, k kVar2, String str) {
        l.f("<this>", supabaseClient);
        l.f("resolveUrl", kVar);
        return new AuthenticatedSupabaseApi(kVar, nVar, kVar2, supabaseClient, str);
    }

    public static /* synthetic */ AuthenticatedSupabaseApi authenticatedSupabaseApi$default(SupabaseClient supabaseClient, k kVar, n nVar, k kVar2, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            nVar = null;
        }
        if ((i7 & 4) != 0) {
            kVar2 = null;
        }
        if ((i7 & 8) != 0) {
            str = null;
        }
        return authenticatedSupabaseApi(supabaseClient, kVar, nVar, kVar2, str);
    }
}
