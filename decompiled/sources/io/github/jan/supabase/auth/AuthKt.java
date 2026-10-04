package io.github.jan.supabase.auth;

import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.Auth;
import io.github.jan.supabase.plugins.PluginManager;
import io.github.jan.supabase.plugins.SupabasePlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"auth", "Lio/github/jan/supabase/auth/Auth;", "Lio/github/jan/supabase/SupabaseClient;", "getAuth", "(Lio/github/jan/supabase/SupabaseClient;)Lio/github/jan/supabase/auth/Auth;", "tryToGetUser", "Lio/github/jan/supabase/auth/user/UserInfo;", "jwt", "", "(Lio/github/jan/supabase/auth/Auth;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthKt {

    @U3.e(c = "io.github.jan.supabase.auth.AuthKt", f = "Auth.kt", l = {480}, m = "tryToGetUser", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.AuthKt$tryToGetUser$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthKt.tryToGetUser(null, null, this);
        }
    }

    public static final Auth getAuth(SupabaseClient supabaseClient) {
        l.f("<this>", supabaseClient);
        PluginManager pluginManager = supabaseClient.getPluginManager();
        Auth.Companion companion = Auth.INSTANCE;
        SupabasePlugin<?> supabasePlugin = pluginManager.getInstalledPlugins().get(companion.getKey());
        if (!(supabasePlugin instanceof Auth)) {
            supabasePlugin = null;
        }
        Auth auth = (Auth) supabasePlugin;
        if (auth != null) {
            return auth;
        }
        StringBuilder sb = new StringBuilder("Plugin ");
        sb.append(companion.getKey());
        sb.append(" not installed or not of type ");
        z zVar = y.a;
        sb.append(zVar.b(Auth.class).n());
        sb.append(". Consider installing ");
        sb.append(zVar.b(Auth.class).n());
        sb.append(" within your SupabaseClientBuilder");
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object tryToGetUser(io.github.jan.supabase.auth.Auth r5, java.lang.String r6, S3.c<? super io.github.jan.supabase.auth.user.UserInfo> r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof io.github.jan.supabase.auth.AuthKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            io.github.jan.supabase.auth.AuthKt$tryToGetUser$1 r0 = (io.github.jan.supabase.auth.AuthKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.AuthKt$tryToGetUser$1 r0 = new io.github.jan.supabase.auth.AuthKt$tryToGetUser$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.L$0
            io.github.jan.supabase.auth.Auth r5 = (io.github.jan.supabase.auth.Auth) r5
            P3.r.Y(r7)     // Catch: java.lang.Exception -> L30
            goto L4a
        L30:
            r5 = move-exception
            goto L4d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            P3.r.Y(r7)
            r0.L$0 = r4     // Catch: java.lang.Exception -> L30
            r0.L$1 = r4     // Catch: java.lang.Exception -> L30
            r0.label = r3     // Catch: java.lang.Exception -> L30
            java.lang.Object r7 = r5.retrieveUser(r6, r0)     // Catch: java.lang.Exception -> L30
            if (r7 != r1) goto L4a
            return r1
        L4a:
            io.github.jan.supabase.auth.user.UserInfo r7 = (io.github.jan.supabase.auth.user.UserInfo) r7     // Catch: java.lang.Exception -> L30
            return r7
        L4d:
            S3.h r6 = r0.getContext()
            H5.D.m(r6)
            io.github.jan.supabase.auth.Auth$Companion r6 = io.github.jan.supabase.auth.Auth.INSTANCE
            io.github.jan.supabase.logging.SupabaseLogger r6 = r6.getLogger()
            io.github.jan.supabase.logging.LogLevel r7 = io.github.jan.supabase.logging.LogLevel.ERROR
            io.github.jan.supabase.logging.LogLevel r0 = r6.getLevel()
            if (r0 != 0) goto L68
            io.github.jan.supabase.SupabaseClient$Companion r0 = io.github.jan.supabase.SupabaseClient.INSTANCE
            io.github.jan.supabase.logging.LogLevel r0 = r0.getDEFAULT_LOG_LEVEL()
        L68:
            int r0 = r7.compareTo(r0)
            if (r0 < 0) goto L73
            java.lang.String r0 = "Couldn't retrieve user using your custom jwt token. If you use the project secret ignore this message"
            r6.log(r7, r5, r0)
        L73:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.AuthKt.tryToGetUser(io.github.jan.supabase.auth.Auth, java.lang.String, S3.c):java.lang.Object");
    }
}
