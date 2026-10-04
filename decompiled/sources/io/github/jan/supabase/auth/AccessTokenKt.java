package io.github.jan.supabase.auth;

import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.plugins.MainConfig;
import io.github.jan.supabase.plugins.MainPlugin;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\u0006\u001a6\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0007*\u00020\b*\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"resolveAccessToken", "", "Lio/github/jan/supabase/SupabaseClient;", "jwtToken", "keyAsFallback", "", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "C", "Lio/github/jan/supabase/plugins/MainConfig;", "plugin", "Lio/github/jan/supabase/plugins/MainPlugin;", "(Lio/github/jan/supabase/SupabaseClient;Lio/github/jan/supabase/plugins/MainPlugin;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccessTokenKt {

    @U3.e(c = "io.github.jan.supabase.auth.AccessTokenKt", f = "AccessToken.kt", l = {21}, m = "resolveAccessToken", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AccessTokenKt$resolveAccessToken$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessTokenKt.resolveAccessToken((SupabaseClient) null, (String) null, false, (S3.c<? super String>) this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @io.github.jan.supabase.annotations.SupabaseInternal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveAccessToken(io.github.jan.supabase.SupabaseClient r6, java.lang.String r7, boolean r8, S3.c<? super java.lang.String> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.AccessTokenKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.auth.AccessTokenKt$resolveAccessToken$1 r0 = (io.github.jan.supabase.auth.AccessTokenKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AccessTokenKt$resolveAccessToken$1 r0 = new io.github.jan.supabase.auth.AccessTokenKt$resolveAccessToken$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            io.github.jan.supabase.SupabaseClient r7 = (io.github.jan.supabase.SupabaseClient) r7
            P3.r.Y(r9)
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r5
            goto L64
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            P3.r.Y(r9)
            if (r8 == 0) goto L4a
            java.lang.String r9 = r6.getSupabaseKey()
            goto L4b
        L4a:
            r9 = r4
        L4b:
            if (r7 != 0) goto L8d
            e4.k r7 = r6.getAccessToken()
            if (r7 == 0) goto L67
            r0.L$0 = r6
            r0.L$1 = r4
            r0.L$2 = r9
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r7 = r7.invoke(r0)
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.String r7 = (java.lang.String) r7
            goto L68
        L67:
            r7 = r4
        L68:
            if (r7 != 0) goto L8d
            io.github.jan.supabase.plugins.PluginManager r6 = r6.getPluginManager()
            io.github.jan.supabase.auth.Auth$Companion r7 = io.github.jan.supabase.auth.Auth.INSTANCE
            java.util.Map r6 = r6.getInstalledPlugins()
            java.lang.String r7 = r7.getKey()
            java.lang.Object r6 = r6.get(r7)
            boolean r7 = r6 instanceof io.github.jan.supabase.auth.Auth
            if (r7 != 0) goto L81
            r6 = r4
        L81:
            io.github.jan.supabase.auth.Auth r6 = (io.github.jan.supabase.auth.Auth) r6
            if (r6 == 0) goto L89
            java.lang.String r4 = r6.currentAccessTokenOrNull()
        L89:
            if (r4 != 0) goto L8c
            return r9
        L8c:
            return r4
        L8d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AccessTokenKt.resolveAccessToken(io.github.jan.supabase.SupabaseClient, java.lang.String, boolean, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object resolveAccessToken$default(SupabaseClient supabaseClient, String str, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = null;
        }
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return resolveAccessToken(supabaseClient, str, z7, (S3.c<? super String>) cVar);
    }

    public static /* synthetic */ Object resolveAccessToken$default(SupabaseClient supabaseClient, MainPlugin mainPlugin, boolean z7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return resolveAccessToken(supabaseClient, mainPlugin, z7, (S3.c<? super String>) cVar);
    }

    @SupabaseInternal
    public static final <C extends MainConfig> Object resolveAccessToken(SupabaseClient supabaseClient, MainPlugin<C> mainPlugin, boolean z7, S3.c<? super String> cVar) {
        return resolveAccessToken(supabaseClient, mainPlugin.getConfig().getJwtToken(), z7, cVar);
    }
}
