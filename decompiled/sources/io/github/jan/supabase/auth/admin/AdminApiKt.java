package io.github.jan.supabase.auth.admin;

import O3.l;
import S3.c;
import a6.v;
import e4.k;
import e6.C0837a;
import io.github.jan.supabase.auth.admin.LinkType;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import n6.d;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a_\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0019\b\b\u0010\n\u001a\u0013\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0086H¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"generateLinkFor", "Lkotlin/Pair;", "", "Lio/github/jan/supabase/auth/user/UserInfo;", "C", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "Lio/github/jan/supabase/auth/admin/AdminApi;", "linkType", "Lio/github/jan/supabase/auth/admin/LinkType;", "redirectTo", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/auth/admin/AdminApi;Lio/github/jan/supabase/auth/admin/LinkType;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AdminApiKt {
    public static final <C extends LinkType.Config> Object generateLinkFor(AdminApi adminApi, LinkType<C> linkType, String str, k kVar, c<? super l> cVar) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type io.github.jan.supabase.auth.admin.AdminApiImpl", adminApi);
        linkType.createConfig(kVar);
        d.V(LinkHeader.Parameters.Type, linkType.getType(), new v());
        C0837a c0837a = a6.d.f10459d.f10460b;
        kotlin.jvm.internal.l.k();
        throw null;
    }

    public static Object generateLinkFor$default(AdminApi adminApi, LinkType linkType, String str, k kVar, c cVar, int i7, Object obj) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type io.github.jan.supabase.auth.admin.AdminApiImpl", adminApi);
        linkType.createConfig(kVar);
        d.V(LinkHeader.Parameters.Type, linkType.getType(), new v());
        C0837a c0837a = a6.d.f10459d.f10460b;
        kotlin.jvm.internal.l.k();
        throw null;
    }
}
