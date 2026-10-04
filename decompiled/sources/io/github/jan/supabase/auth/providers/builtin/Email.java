package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import V5.i;
import Y5.b;
import Z5.o0;
import a6.d;
import e4.k;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.UtilsKt;
import io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider;
import io.github.jan.supabase.auth.user.UserInfo;
import io.github.jan.supabase.exceptions.SupabaseEncodingException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Email;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "Lio/github/jan/supabase/auth/user/UserInfo;", "<init>", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "decodeResult", "json", "Lkotlinx/serialization/json/JsonObject;", "encodeCredentials", "credentials", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Email implements DefaultAuthProvider<Config, UserInfo> {
    public static final Email INSTANCE = new Email();
    private static final String grantType = "password";

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006BC\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0005\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006("}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "email", "", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "captchaToken", "data", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static final /* data */ class Config extends DefaultAuthProvider.Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String email;
        private String password;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Email$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/Email$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return Email$Config$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.email;
            }
            if ((i7 & 2) != 0) {
                str2 = config.password;
            }
            return config.copy(str, str2);
        }

        public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
            DefaultAuthProvider.Config.write$Self(config, bVar, serialDescriptor);
            if (bVar.z(serialDescriptor) || !l.a(config.email, "")) {
                bVar.E(serialDescriptor, 2, config.email);
            }
            if (!bVar.z(serialDescriptor) && l.a(config.password, "")) {
                return;
            }
            bVar.E(serialDescriptor, 3, config.password);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        public final Config copy(String email, String password) {
            l.f("email", email);
            l.f("password", password);
            return new Config(email, password);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return l.a(this.email, config.email) && l.a(this.password, config.password);
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPassword() {
            return this.password;
        }

        public int hashCode() {
            return this.password.hashCode() + (this.email.hashCode() * 31);
        }

        public final void setEmail(String str) {
            l.f("<set-?>", str);
            this.email = str;
        }

        public final void setPassword(String str) {
            l.f("<set-?>", str);
            this.password = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Config(email=");
            sb.append(this.email);
            sb.append(", password=");
            return A6.b.j(sb, this.password, ')');
        }

        public /* synthetic */ Config(int i7, String str, c cVar, String str2, String str3, o0 o0Var) {
            super(i7, str, cVar, o0Var);
            if ((i7 & 4) == 0) {
                this.email = "";
            } else {
                this.email = str2;
            }
            if ((i7 & 8) == 0) {
                this.password = "";
            } else {
                this.password = str3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Config(String str, String str2) {
            super((String) null, (c) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            l.f("email", str);
            l.f("password", str2);
            this.email = str;
            this.password = str2;
        }

        public /* synthetic */ Config(String str, String str2, int i7, f fVar) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
        }
    }

    private Email() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public c encodeCredentials(k kVar) {
        l.f("credentials", kVar);
        d supabaseJson = UtilsKt.getSupabaseJson();
        Config config = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kVar.invoke(config);
        supabaseJson.getClass();
        return a6.l.e(supabaseJson.c(Config.INSTANCE.serializer(), config));
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof Email);
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public String getGrantType() {
        return grantType;
    }

    public int hashCode() {
        return -189519665;
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
        return "Email";
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
            throw new SupabaseEncodingException("Couldn't decode sign up email result. Input: " + cVar);
        }
    }
}
