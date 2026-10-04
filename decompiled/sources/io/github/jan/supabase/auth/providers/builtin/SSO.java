package io.github.jan.supabase.auth.providers.builtin;

import A6.b;
import O3.C;
import U3.c;
import U3.e;
import V5.i;
import Z5.AbstractC0632e0;
import Z5.o0;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.providers.AuthProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u0013J_\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011¢\u0006\u0002\b\u0012H\u0096@¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u000fHÖ\u0001¨\u0006\u001d"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO;", "Lio/github/jan/supabase/auth/providers/AuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "", "<init>", "()V", "login", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "onSuccess", "Lkotlin/Function2;", "Lio/github/jan/supabase/auth/user/UserSession;", "Lkotlin/coroutines/Continuation;", "", "redirectUrl", "", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/SupabaseClient;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "equals", "", "other", "hashCode", "", "toString", "Config", "Result", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SSO implements AuthProvider<Config, C> {
    public static final SSO INSTANCE = new SSO();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Config;", "", "providerId", "", "captchaToken", "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProviderId", "()Ljava/lang/String;", "setProviderId", "(Ljava/lang/String;)V", "getCaptchaToken", "setCaptchaToken", "getDomain", "setDomain", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config {
        private String captchaToken;
        private String domain;
        private String providerId;

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.providerId;
            }
            if ((i7 & 2) != 0) {
                str2 = config.captchaToken;
            }
            if ((i7 & 4) != 0) {
                str3 = config.domain;
            }
            return config.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getProviderId() {
            return this.providerId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCaptchaToken() {
            return this.captchaToken;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDomain() {
            return this.domain;
        }

        public final Config copy(String providerId, String captchaToken, String domain) {
            return new Config(providerId, captchaToken, domain);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return l.a(this.providerId, config.providerId) && l.a(this.captchaToken, config.captchaToken) && l.a(this.domain, config.domain);
        }

        public final String getCaptchaToken() {
            return this.captchaToken;
        }

        public final String getDomain() {
            return this.domain;
        }

        public final String getProviderId() {
            return this.providerId;
        }

        public int hashCode() {
            String str = this.providerId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.captchaToken;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.domain;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setCaptchaToken(String str) {
            this.captchaToken = str;
        }

        public final void setDomain(String str) {
            this.domain = str;
        }

        public final void setProviderId(String str) {
            this.providerId = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(providerId=");
            sb.append(this.providerId);
            sb.append(", captchaToken=");
            sb.append(this.captchaToken);
            sb.append(", domain=");
            return b.j(sb, this.domain, ')');
        }

        public Config(String str, String str2, String str3) {
            this.providerId = str;
            this.captchaToken = str2;
            this.domain = str3;
        }

        public /* synthetic */ Config(String str, String str2, String str3, int i7, f fVar) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static final /* data */ class Result {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String url;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/SSO$Result$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/SSO$Result;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return SSO$Result$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ Result(int i7, String str, o0 o0Var) {
            if (1 == (i7 & 1)) {
                this.url = str;
            } else {
                AbstractC0632e0.j(i7, 1, SSO$Result$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Result copy$default(Result result, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = result.url;
            }
            return result.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final Result copy(String url) {
            l.f("url", url);
            return new Result(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && l.a(this.url, ((Result) other).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return b.j(new StringBuilder("Result(url="), this.url, ')');
        }

        public Result(String str) {
            l.f("url", str);
            this.url = str;
        }
    }

    @e(c = "io.github.jan.supabase.auth.providers.builtin.SSO", f = "SSO.kt", l = {54}, m = "signUp", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.auth.providers.builtin.SSO$signUp$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SSO.this.signUp(null, null, null, null, this);
        }
    }

    private SSO() {
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof SSO);
    }

    public int hashCode() {
        return -2145433598;
    }

    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    public Object login(SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super C> cVar) throws Throwable {
        Object objSignUp = signUp(supabaseClient, nVar, str, kVar, cVar);
        return objSignUp == T3.a.f9048k ? objSignUp : C.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.auth.providers.AuthProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object signUp(io.github.jan.supabase.SupabaseClient r5, e4.n r6, java.lang.String r7, e4.k r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            io.github.jan.supabase.auth.providers.builtin.SSO$signUp$1 r0 = (io.github.jan.supabase.auth.providers.builtin.SSO.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.github.jan.supabase.auth.providers.builtin.SSO$signUp$1 r0 = new io.github.jan.supabase.auth.providers.builtin.SSO$signUp$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.L$3
            e4.k r5 = (e4.k) r5
            java.lang.Object r5 = r0.L$2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.L$1
            e4.n r5 = (e4.n) r5
            java.lang.Object r5 = r0.L$0
            io.github.jan.supabase.SupabaseClient r5 = (io.github.jan.supabase.SupabaseClient) r5
            P3.r.Y(r9)
            goto L54
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            P3.r.Y(r9)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.L$2 = r9
            r0.L$3 = r9
            r0.label = r3
            java.lang.Object r5 = io.github.jan.supabase.auth.providers.builtin.SSOKt.loginWithSSO(r5, r6, r7, r8, r0)
            if (r5 != r1) goto L54
            return r1
        L54:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.auth.providers.builtin.SSO.signUp(io.github.jan.supabase.SupabaseClient, e4.n, java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    public String toString() {
        return "SSO";
    }
}
