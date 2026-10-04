package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import U3.c;
import U3.e;
import a6.C0673c;
import a6.d;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.auth.providers.AuthProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u0013J_\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001¨\u0006\u001c"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/OTP;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/OTP$Config;", "", "<init>", "()V", "login", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "", "redirectUrl", "", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "equals", "", "other", "hashCode", "", "toString", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class OTP implements AuthProvider<Config, C> {
    public static final OTP INSTANCE = new OTP();

    @e(c = "io.github.jan.supabase.auth.providers.builtin.OTP", f = "OTP.kt", l = {82, 113}, m = "login", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.OTP$login$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$12;
        Object L$13;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OTP.this.login(null, null, null, null, this);
        }
    }

    @e(c = "io.github.jan.supabase.auth.providers.builtin.OTP", f = "OTP.kt", l = {102}, m = "signUp", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.OTP$signUp$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11141 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11141(S3.c<? super C11141> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OTP.this.signUp(null, null, null, null, this);
        }
    }

    private OTP() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C login$lambda$0(Config config) {
        l.f("<this>", config);
        return C.a;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof OTP);
    }

    public int hashCode() {
        return -2145437410;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00eb, code lost:
    
        if (z5.AbstractC2510o.g0(r0) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f6, code lost:
    
        if (r4.request("otp", r8, r1) != r3) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object login(io.github.jan.supabase.SupabaseClient r23, e4.n r24, java.lang.String r25, e4.k r26, S3.c<? super O3.C> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.builtin.OTP.login(io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signUp(io.github.jan.supabase.SupabaseClient r8, e4.n r9, java.lang.String r10, e4.k r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r12 instanceof io.github.jan.supabase.auth.providers.builtin.OTP.C11141
            if (r0 == 0) goto L14
            r0 = r12
            io.github.jan.supabase.auth.providers.builtin.OTP$signUp$1 r0 = (io.github.jan.supabase.auth.providers.builtin.OTP.C11141) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            io.github.jan.supabase.auth.providers.builtin.OTP$signUp$1 r0 = new io.github.jan.supabase.auth.providers.builtin.OTP$signUp$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            T3.a r0 = T3.a.f9048k
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L41
            if (r1 != r2) goto L39
            java.lang.Object r8 = r6.L$3
            e4.k r8 = (e4.k) r8
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r6.L$1
            e4.n r8 = (e4.n) r8
            java.lang.Object r8 = r6.L$0
            io.github.jan.supabase.SupabaseClient r8 = (io.github.jan.supabase.SupabaseClient) r8
            P3.r.Y(r12)
            goto L5b
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            P3.r.Y(r12)
            r12 = 0
            r6.L$0 = r12
            r6.L$1 = r12
            r6.L$2 = r12
            r6.L$3 = r12
            r6.label = r2
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            java.lang.Object r8 = r1.login(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L5b
            return r0
        L5b:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.builtin.OTP.signUp(io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public String toString() {
        return "OTP";
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\u00020\"\"\n\b\u0000\u0010#\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u0002H#H\u0086\b¢\u0006\u0002\u0010$R\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015¨\u0006%"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/OTP$Config;", "", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "email", "", "phone", "data", "Lkotlinx/serialization/json/JsonObject;", "createUser", "", "captchaToken", "<init>", "(Lio/github/jan/supabase/SupabaseSerializer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;ZLjava/lang/String;)V", "getSerializer$annotations", "()V", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPhone", "setPhone", "getData", "()Lkotlinx/serialization/json/JsonObject;", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "getCreateUser", "()Z", "setCreateUser", "(Z)V", "getCaptchaToken", "setCaptchaToken", "", "T", "(Ljava/lang/Object;)V", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Config {
        private String captchaToken;
        private boolean createUser;
        private kotlinx.serialization.json.c data;
        private String email;
        private String phone;
        private final SupabaseSerializer serializer;

        public Config(SupabaseSerializer supabaseSerializer, String str, String str2, kotlinx.serialization.json.c cVar, boolean z7, String str3) {
            l.f("serializer", supabaseSerializer);
            this.serializer = supabaseSerializer;
            this.email = str;
            this.phone = str2;
            this.data = cVar;
            this.createUser = z7;
            this.captchaToken = str3;
        }

        public static /* synthetic */ void getSerializer$annotations() {
        }

        public final <T> void data(T data) {
            l.f("data", data);
            getSerializer();
            C0673c c0673c = d.f10459d;
            l.k();
            throw null;
        }

        public final String getCaptchaToken() {
            return this.captchaToken;
        }

        public final boolean getCreateUser() {
            return this.createUser;
        }

        public final kotlinx.serialization.json.c getData() {
            return this.data;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        public final void setCaptchaToken(String str) {
            this.captchaToken = str;
        }

        public final void setCreateUser(boolean z7) {
            this.createUser = z7;
        }

        public final void setData(kotlinx.serialization.json.c cVar) {
            this.data = cVar;
        }

        public final void setEmail(String str) {
            this.email = str;
        }

        public final void setPhone(String str) {
            this.phone = str;
        }

        public /* synthetic */ Config(SupabaseSerializer supabaseSerializer, String str, String str2, kotlinx.serialization.json.c cVar, boolean z7, String str3, int i7, f fVar) {
            this(supabaseSerializer, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : cVar, (i7 & 16) != 0 ? true : z7, (i7 & 32) != 0 ? null : str3);
        }
    }
}
