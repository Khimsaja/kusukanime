package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import V5.h;
import V5.i;
import Y5.b;
import Z5.o0;
import Z5.t0;
import a6.d;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.UtilsKt;
import io.github.jan.supabase.auth.providers.IDTokenProvider;
import io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.exceptions.SupabaseEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/IDToken;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "Lio/github/jan/supabase/auth/user/UserInfo;", "<init>", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "decodeResult", "json", "Lkotlinx/serialization/json/JsonObject;", "encodeCredentials", "credentials", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class IDToken implements DefaultAuthProvider<Config, UserInfo> {
    public static final IDToken INSTANCE = new IDToken();
    private static final String grantType = "id_token";

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBW\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u00066"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "idToken", "", "provider", "Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "accessToken", "nonce", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "captchaToken", "data", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/IDTokenProvider;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIdToken$annotations", "()V", "getIdToken", "()Ljava/lang/String;", "setIdToken", "(Ljava/lang/String;)V", "getProvider", "()Lio/github/jan/supabase/auth/providers/IDTokenProvider;", "setProvider", "(Lio/github/jan/supabase/auth/providers/IDTokenProvider;)V", "getAccessToken$annotations", "getAccessToken", "setAccessToken", "getNonce", "setNonce", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static final /* data */ class Config extends DefaultAuthProvider.Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String accessToken;
        private String idToken;
        private String nonce;
        private IDTokenProvider provider;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/IDToken$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return IDToken$Config$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, IDTokenProvider iDTokenProvider, String str2, String str3, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.idToken;
            }
            if ((i7 & 2) != 0) {
                iDTokenProvider = config.provider;
            }
            if ((i7 & 4) != 0) {
                str2 = config.accessToken;
            }
            if ((i7 & 8) != 0) {
                str3 = config.nonce;
            }
            return config.copy(str, iDTokenProvider, str2, str3);
        }

        @h("access_token")
        public static /* synthetic */ void getAccessToken$annotations() {
        }

        @h("id_token")
        public static /* synthetic */ void getIdToken$annotations() {
        }

        public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
            DefaultAuthProvider.Config.write$Self(config, bVar, serialDescriptor);
            if (bVar.z(serialDescriptor) || !l.a(config.idToken, "")) {
                bVar.E(serialDescriptor, 2, config.idToken);
            }
            if (bVar.z(serialDescriptor) || config.provider != null) {
                bVar.F(serialDescriptor, 3, IDTokenProvider.INSTANCE, config.provider);
            }
            if (bVar.z(serialDescriptor) || config.accessToken != null) {
                bVar.F(serialDescriptor, 4, t0.a, config.accessToken);
            }
            if (!bVar.z(serialDescriptor) && config.nonce == null) {
                return;
            }
            bVar.F(serialDescriptor, 5, t0.a, config.nonce);
        }

        /* renamed from: component1, reason: from getter */
        public final String getIdToken() {
            return this.idToken;
        }

        /* renamed from: component2, reason: from getter */
        public final IDTokenProvider getProvider() {
            return this.provider;
        }

        /* renamed from: component3, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: component4, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        public final Config copy(String idToken, IDTokenProvider provider, String accessToken, String nonce) {
            l.f("idToken", idToken);
            return new Config(idToken, provider, accessToken, nonce);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return l.a(this.idToken, config.idToken) && l.a(this.provider, config.provider) && l.a(this.accessToken, config.accessToken) && l.a(this.nonce, config.nonce);
        }

        public final String getAccessToken() {
            return this.accessToken;
        }

        public final String getIdToken() {
            return this.idToken;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final IDTokenProvider getProvider() {
            return this.provider;
        }

        public int hashCode() {
            int iHashCode = this.idToken.hashCode() * 31;
            IDTokenProvider iDTokenProvider = this.provider;
            int iHashCode2 = (iHashCode + (iDTokenProvider == null ? 0 : iDTokenProvider.hashCode())) * 31;
            String str = this.accessToken;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.nonce;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setAccessToken(String str) {
            this.accessToken = str;
        }

        public final void setIdToken(String str) {
            l.f("<set-?>", str);
            this.idToken = str;
        }

        public final void setNonce(String str) {
            this.nonce = str;
        }

        public final void setProvider(IDTokenProvider iDTokenProvider) {
            this.provider = iDTokenProvider;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(idToken=");
            sb.append(this.idToken);
            sb.append(", provider=");
            sb.append(this.provider);
            sb.append(", accessToken=");
            sb.append(this.accessToken);
            sb.append(", nonce=");
            return A6.b.j(sb, this.nonce, ')');
        }

        public /* synthetic */ Config(int i7, String str, c cVar, String str2, IDTokenProvider iDTokenProvider, String str3, String str4, o0 o0Var) {
            super(i7, str, cVar, o0Var);
            if ((i7 & 4) == 0) {
                this.idToken = "";
            } else {
                this.idToken = str2;
            }
            if ((i7 & 8) == 0) {
                this.provider = null;
            } else {
                this.provider = iDTokenProvider;
            }
            if ((i7 & 16) == 0) {
                this.accessToken = null;
            } else {
                this.accessToken = str3;
            }
            if ((i7 & 32) == 0) {
                this.nonce = null;
            } else {
                this.nonce = str4;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Config(String str, IDTokenProvider iDTokenProvider, String str2, String str3) {
            super((String) null, (c) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            l.f("idToken", str);
            this.idToken = str;
            this.provider = iDTokenProvider;
            this.accessToken = str2;
            this.nonce = str3;
        }

        public /* synthetic */ Config(String str, IDTokenProvider iDTokenProvider, String str2, String str3, int i7, f fVar) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : iDTokenProvider, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? null : str3);
        }
    }

    private IDToken() {
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public c encodeCredentials(k kVar) {
        l.f("credentials", kVar);
        d supabaseJson = UtilsKt.getSupabaseJson();
        Config config = new Config(null, null, null, null, 15, null);
        kVar.invoke(config);
        supabaseJson.getClass();
        return a6.l.e(supabaseJson.c(Config.INSTANCE.serializer(), config));
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof IDToken);
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public String getGrantType() {
        return grantType;
    }

    public int hashCode() {
        return 624623153;
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider, io.github.jan.supabase.auth.providers.AuthProvider
    public /* bridge */ Object login(SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super C> cVar) {
        return super.login(supabaseClient, nVar, str, kVar, cVar);
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider, io.github.jan.supabase.auth.providers.AuthProvider
    public /* bridge */ Object signUp(SupabaseClient supabaseClient, n nVar, String str, k kVar, S3.c<? super UserInfo> cVar) {
        return super.signUp(supabaseClient, nVar, str, kVar, cVar);
    }

    public String toString() {
        return "IDToken";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public UserInfo decodeResult(c cVar) throws SupabaseEncodingException {
        l.f("json", cVar);
        try {
            d supabaseJson = UtilsKt.getSupabaseJson();
            supabaseJson.getClass();
            return (UserInfo) supabaseJson.a(UserInfo.INSTANCE.serializer(), cVar);
        } catch (V5.b unused) {
            throw new SupabaseEncodingException("Couldn't decode sign up id token result. Input: " + cVar);
        }
    }
}
