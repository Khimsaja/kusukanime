package io.github.jan.supabase.auth;

import O3.C;
import android.net.Uri;
import io.github.jan.supabase.SupabaseClient;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001au\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u000423\u0010\t\u001a/\b\u0001\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\nH\u0080@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"openExternalUrl", "", "Lio/github/jan/supabase/SupabaseClient;", "url", "", "(Lio/github/jan/supabase/SupabaseClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startExternalAuth", "Lio/github/jan/supabase/auth/Auth;", "redirectUrl", "getUrl", "Lkotlin/Function2;", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "redirectTo", "Lkotlin/coroutines/Continuation;", "", "onSessionSuccess", "Lio/github/jan/supabase/auth/user/UserSession;", "(Lio/github/jan/supabase/auth/Auth;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "auth-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utils_androidKt {

    @U3.e(c = "io.github.jan.supabase.auth.Utils_androidKt", f = "Utils.android.kt", l = {17, 17}, m = "startExternalAuth", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.Utils_androidKt$startExternalAuth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Utils_androidKt.startExternalAuth(null, null, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object openExternalUrl(SupabaseClient supabaseClient, String str, S3.c<? super C> cVar) {
        Uri uri = Uri.parse(str);
        l.e("parse(...)", uri);
        AndroidKt.openUrl(uri, ((AuthConfig) AuthKt.getAuth(supabaseClient).getConfig()).getDefaultExternalAuthAction());
        return C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        if (r7.openUrl(r6, (java.lang.String) r10, r9) == r0) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startExternalAuth(io.github.jan.supabase.auth.Auth r6, java.lang.String r7, e4.n r8, e4.n r9, S3.c<? super O3.C> r10) {
        /*
            boolean r9 = r10 instanceof io.github.jan.supabase.auth.Utils_androidKt.AnonymousClass1
            if (r9 == 0) goto L13
            r9 = r10
            io.github.jan.supabase.auth.Utils_androidKt$startExternalAuth$1 r9 = (io.github.jan.supabase.auth.Utils_androidKt.AnonymousClass1) r9
            int r0 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r9.label = r0
            goto L18
        L13:
            io.github.jan.supabase.auth.Utils_androidKt$startExternalAuth$1 r9 = new io.github.jan.supabase.auth.Utils_androidKt$startExternalAuth$1
            r9.<init>(r10)
        L18:
            java.lang.Object r10 = r9.result
            T3.a r0 = T3.a.f9048k
            int r1 = r9.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L5f
            if (r1 == r3) goto L43
            if (r1 != r2) goto L3b
            java.lang.Object r6 = r9.L$3
            e4.n r6 = (e4.n) r6
            java.lang.Object r6 = r9.L$2
            e4.n r6 = (e4.n) r6
            java.lang.Object r6 = r9.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r9.L$0
            io.github.jan.supabase.auth.Auth r6 = (io.github.jan.supabase.auth.Auth) r6
            P3.r.Y(r10)
            goto L9f
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            java.lang.Object r6 = r9.L$5
            io.github.jan.supabase.SupabaseClient r6 = (io.github.jan.supabase.SupabaseClient) r6
            java.lang.Object r7 = r9.L$4
            io.github.jan.supabase.auth.UrlLauncher r7 = (io.github.jan.supabase.auth.UrlLauncher) r7
            java.lang.Object r8 = r9.L$3
            e4.n r8 = (e4.n) r8
            java.lang.Object r8 = r9.L$2
            e4.n r8 = (e4.n) r8
            java.lang.Object r8 = r9.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r9.L$0
            io.github.jan.supabase.auth.Auth r8 = (io.github.jan.supabase.auth.Auth) r8
            P3.r.Y(r10)
            goto L88
        L5f:
            P3.r.Y(r10)
            java.lang.Object r10 = r6.getConfig()
            io.github.jan.supabase.auth.AuthConfig r10 = (io.github.jan.supabase.auth.AuthConfig) r10
            io.github.jan.supabase.auth.UrlLauncher r10 = r10.getUrlLauncher()
            io.github.jan.supabase.SupabaseClient r6 = r6.getSupabaseClient()
            r9.L$0 = r4
            r9.L$1 = r4
            r9.L$2 = r4
            r9.L$3 = r4
            r9.L$4 = r10
            r9.L$5 = r6
            r9.label = r3
            java.lang.Object r7 = r8.invoke(r7, r9)
            if (r7 != r0) goto L85
            goto L9e
        L85:
            r5 = r10
            r10 = r7
            r7 = r5
        L88:
            java.lang.String r10 = (java.lang.String) r10
            r9.L$0 = r4
            r9.L$1 = r4
            r9.L$2 = r4
            r9.L$3 = r4
            r9.L$4 = r4
            r9.L$5 = r4
            r9.label = r2
            java.lang.Object r6 = r7.openUrl(r6, r10, r9)
            if (r6 != r0) goto L9f
        L9e:
            return r0
        L9f:
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.Utils_androidKt.startExternalAuth(io.github.jan.supabase.auth.Auth, java.lang.String, e4.n, e4.n, S3.c):java.lang.Object");
    }
}
