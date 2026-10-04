package io.github.jan.supabase.auth.admin;

import V5.h;
import V5.i;
import Y5.b;
import Z5.o0;
import a6.x;
import e4.k;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.github.jan.supabase.auth.admin.LinkType.Config;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0007\u000e\u000f\u0010\u0011\u0012\u0013\u0014J&\u0010\b\u001a\u00028\u00002\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\b\fH'¢\u0006\u0002\u0010\rR\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType;", "C", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Lio/github/jan/supabase/auth/admin/LinkType$Config;", "Config", "Signup", "Invite", "MagicLink", "RecoveryLink", "EmailChangeCurrent", "EmailChangeNew", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LinkType<C extends Config> {

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailChangeCurrent implements LinkType<Config> {
        public static final EmailChangeCurrent INSTANCE = new EmailChangeCurrent();
        private static final String type = "email_change_current";

        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B/\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006#"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "newEmail", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "email", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getNewEmail$annotations", "()V", "getNewEmail", "()Ljava/lang/String;", "setNewEmail", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Config extends Config {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private String newEmail;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return LinkType$EmailChangeCurrent$Config$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Config copy$default(Config config, String str, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = config.newEmail;
                }
                return config.copy(str);
            }

            @h("new_email")
            public static /* synthetic */ void getNewEmail$annotations() {
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
                Config.write$Self(config, bVar, serialDescriptor);
                if (!bVar.z(serialDescriptor) && l.a(config.newEmail, "")) {
                    return;
                }
                bVar.E(serialDescriptor, 1, config.newEmail);
            }

            /* renamed from: component1, reason: from getter */
            public final String getNewEmail() {
                return this.newEmail;
            }

            public final Config copy(String newEmail) {
                l.f("newEmail", newEmail);
                return new Config(newEmail);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && l.a(this.newEmail, ((Config) other).newEmail);
            }

            public final String getNewEmail() {
                return this.newEmail;
            }

            public int hashCode() {
                return this.newEmail.hashCode();
            }

            public final void setNewEmail(String str) {
                l.f("<set-?>", str);
                this.newEmail = str;
            }

            public String toString() {
                return A6.b.j(new StringBuilder("Config(newEmail="), this.newEmail, ')');
            }

            public /* synthetic */ Config(int i7, String str, String str2, o0 o0Var) {
                super(i7, str, o0Var);
                if ((i7 & 2) == 0) {
                    this.newEmail = "";
                } else {
                    this.newEmail = str2;
                }
            }

            public Config(String str) {
                l.f("newEmail", str);
                this.newEmail = str;
            }

            public /* synthetic */ Config(String str, int i7, f fVar) {
                this((i7 & 1) != 0 ? "" : str);
            }
        }

        private EmailChangeCurrent() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EmailChangeCurrent);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -35365934;
        }

        public String toString() {
            return "EmailChangeCurrent";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public Config createConfig(k kVar) {
            l.f("config", kVar);
            Config config = new Config(null, 1, 0 == true ? 1 : 0);
            kVar.invoke(config);
            return config;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeNew;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$EmailChangeCurrent$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EmailChangeNew implements LinkType<EmailChangeCurrent.Config> {
        public static final EmailChangeNew INSTANCE = new EmailChangeNew();
        private static final String type = "email_change_new";

        private EmailChangeNew() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof EmailChangeNew);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1911643257;
        }

        public String toString() {
            return "EmailChangeNew";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public EmailChangeCurrent.Config createConfig(k kVar) {
            l.f("config", kVar);
            EmailChangeCurrent.Config config = new EmailChangeCurrent.Config(null, 1, 0 == true ? 1 : 0);
            kVar.invoke(config);
            return config;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Invite;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invite implements LinkType<Config> {
        public static final Invite INSTANCE = new Invite();
        private static final String type = "invite";

        private Invite() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public Config createConfig(k kVar) {
            l.f("config", kVar);
            Config config = new Config();
            kVar.invoke(config);
            return config;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Invite);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 731307246;
        }

        public String toString() {
            return "Invite";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$MagicLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MagicLink implements LinkType<Config> {
        public static final MagicLink INSTANCE = new MagicLink();
        private static final String type = "magiclink";

        private MagicLink() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public Config createConfig(k kVar) {
            l.f("config", kVar);
            Config config = new Config();
            kVar.invoke(config);
            return config;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof MagicLink);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 2034465602;
        }

        public String toString() {
            return "MagicLink";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$RecoveryLink;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecoveryLink implements LinkType<Config> {
        public static final RecoveryLink INSTANCE = new RecoveryLink();
        private static final String type = "recovery";

        private RecoveryLink() {
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public Config createConfig(k kVar) {
            l.f("config", kVar);
            Config config = new Config();
            kVar.invoke(config);
            return config;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof RecoveryLink);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return -1501511852;
        }

        public String toString() {
            return "RecoveryLink";
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00022\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup;", "Lio/github/jan/supabase/auth/admin/LinkType;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "<init>", "()V", LinkHeader.Parameters.Type, "", "getType", "()Ljava/lang/String;", "createConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Signup implements LinkType<Config> {
        public static final Signup INSTANCE = new Signup();
        private static final String type = "signup";

        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002'(B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "password", "", "data", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "email", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "getData", "()Lkotlinx/serialization/json/JsonObject;", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Config extends Config {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private c data;
            private String password;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Signup$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return LinkType$Signup$Config$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Config copy$default(Config config, String str, c cVar, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = config.password;
                }
                if ((i7 & 2) != 0) {
                    cVar = config.data;
                }
                return config.copy(str, cVar);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
                Config.write$Self(config, bVar, serialDescriptor);
                if (bVar.z(serialDescriptor) || !l.a(config.password, "")) {
                    bVar.E(serialDescriptor, 1, config.password);
                }
                if (!bVar.z(serialDescriptor) && config.data == null) {
                    return;
                }
                bVar.F(serialDescriptor, 2, x.a, config.data);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPassword() {
                return this.password;
            }

            /* renamed from: component2, reason: from getter */
            public final c getData() {
                return this.data;
            }

            public final Config copy(String str, c cVar) {
                l.f("password", str);
                return new Config(str, cVar);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Config)) {
                    return false;
                }
                Config config = (Config) other;
                return l.a(this.password, config.password) && l.a(this.data, config.data);
            }

            public final c getData() {
                return this.data;
            }

            public final String getPassword() {
                return this.password;
            }

            public int hashCode() {
                int iHashCode = this.password.hashCode() * 31;
                c cVar = this.data;
                return iHashCode + (cVar == null ? 0 : cVar.f12722k.hashCode());
            }

            public final void setData(c cVar) {
                this.data = cVar;
            }

            public final void setPassword(String str) {
                l.f("<set-?>", str);
                this.password = str;
            }

            public String toString() {
                return "Config(password=" + this.password + ", data=" + this.data + ')';
            }

            public /* synthetic */ Config(int i7, String str, String str2, c cVar, o0 o0Var) {
                super(i7, str, o0Var);
                if ((i7 & 2) == 0) {
                    this.password = "";
                } else {
                    this.password = str2;
                }
                if ((i7 & 4) == 0) {
                    this.data = null;
                } else {
                    this.data = cVar;
                }
            }

            public Config(String str, c cVar) {
                l.f("password", str);
                this.password = str;
                this.data = cVar;
            }

            public /* synthetic */ Config(String str, c cVar, int i7, f fVar) {
                this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : cVar);
            }
        }

        private Signup() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Signup);
        }

        @Override // io.github.jan.supabase.auth.admin.LinkType
        public String getType() {
            return type;
        }

        public int hashCode() {
            return 1012539133;
        }

        public String toString() {
            return "Signup";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.admin.LinkType
        @SupabaseInternal
        public Config createConfig(k kVar) {
            l.f("config", kVar);
            Config config = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            kVar.invoke(config);
            return config;
        }
    }

    @SupabaseInternal
    C createConfig(k kVar);

    String getType();

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00172\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B%\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0002\u0010\nJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018\u0080å\b\u0006"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config;", "", "<init>", "()V", "seen0", "", "email", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private String email;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/LinkType$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/LinkType$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return LinkType$Config$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Config() {
            this.email = "";
        }

        public static final /* synthetic */ void write$Self(Config config, b bVar, SerialDescriptor serialDescriptor) {
            if (!bVar.z(serialDescriptor) && l.a(config.email, "")) {
                return;
            }
            bVar.E(serialDescriptor, 0, config.email);
        }

        public final String getEmail() {
            return this.email;
        }

        public final void setEmail(String str) {
            l.f("<set-?>", str);
            this.email = str;
        }

        public /* synthetic */ Config(int i7, String str, o0 o0Var) {
            if ((i7 & 1) == 0) {
                this.email = "";
            } else {
                this.email = str;
            }
        }
    }
}
