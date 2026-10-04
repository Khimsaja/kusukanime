package io.github.jan.supabase.auth.providers.builtin;

import O3.C;
import V5.h;
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
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u00020\f2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\b\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Phone;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider;", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "Lio/github/jan/supabase/auth/user/UserInfo;", "<init>", "()V", "grantType", "", "getGrantType", "()Ljava/lang/String;", "decodeResult", "json", "Lkotlinx/serialization/json/JsonObject;", "encodeCredentials", "credentials", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "equals", "", "other", "", "hashCode", "", "toString", "Config", "Channel", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Phone implements DefaultAuthProvider<Config, UserInfo> {
    public static final Phone INSTANCE = new Phone();
    private static final String grantType = "password";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SMS", "WHATSAPP", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i(with = Companion.class)
    public static final class Channel {
        private static final /* synthetic */ V3.a $ENTRIES;
        private static final /* synthetic */ Channel[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Channel SMS = new Channel("SMS", 0, "sms");
        public static final Channel WHATSAPP = new Channel("WHATSAPP", 1, "whatsapp");
        private static final SerialDescriptor descriptor;
        private final String value;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serializer", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion implements KSerializer {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            @Override // kotlinx.serialization.KSerializer
            public SerialDescriptor getDescriptor() {
                return Channel.descriptor;
            }

            public final KSerializer serializer() {
                return Channel.INSTANCE;
            }

            private Companion() {
            }

            @Override // kotlinx.serialization.KSerializer
            public Channel deserialize(Decoder decoder) {
                l.f("decoder", decoder);
                for (Channel channel : Channel.getEntries()) {
                    if (l.a(channel.getValue(), decoder.A())) {
                        return channel;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }

            @Override // kotlinx.serialization.KSerializer
            public void serialize(Encoder encoder, Channel value) {
                l.f("encoder", encoder);
                l.f("value", value);
                encoder.C(value.getValue());
            }
        }

        private static final /* synthetic */ Channel[] $values() {
            return new Channel[]{SMS, WHATSAPP};
        }

        static {
            Channel[] channelArr$values = $values();
            $VALUES = channelArr$values;
            $ENTRIES = AbstractC1420H.z(channelArr$values);
            INSTANCE = new Companion(null);
            descriptor = AbstractC1420H.b("Channel");
        }

        private Channel(String str, int i7, String str2) {
            this.value = str2;
        }

        public static V3.a getEntries() {
            return $ENTRIES;
        }

        public static Channel valueOf(String str) {
            return (Channel) Enum.valueOf(Channel.class, str);
        }

        public static Channel[] values() {
            return (Channel[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bBM\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0007\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J'\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00061"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "Lio/github/jan/supabase/auth/providers/builtin/DefaultAuthProvider$Config;", "phone", "", "password", "channel", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;)V", "seen0", "", "captchaToken", "data", "Lkotlinx/serialization/json/JsonObject;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPhone$annotations", "()V", "getPhone", "()Ljava/lang/String;", "setPhone", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getChannel", "()Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;", "setChannel", "(Lio/github/jan/supabase/auth/providers/builtin/Phone$Channel;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static final /* data */ class Config extends DefaultAuthProvider.Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private Channel channel;
        private String password;
        private String phone;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/providers/builtin/Phone$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/providers/builtin/Phone$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return Phone$Config$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public Config() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Config copy$default(Config config, String str, String str2, Channel channel, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = config.phone;
            }
            if ((i7 & 2) != 0) {
                str2 = config.password;
            }
            if ((i7 & 4) != 0) {
                channel = config.channel;
            }
            return config.copy(str, str2, channel);
        }

        @h("phone")
        public static /* synthetic */ void getPhone$annotations() {
        }

        public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
            DefaultAuthProvider.Config.write$Self(config, bVar, serialDescriptor);
            if (bVar.z(serialDescriptor) || !l.a(config.phone, "")) {
                bVar.E(serialDescriptor, 2, config.phone);
            }
            if (bVar.z(serialDescriptor) || !l.a(config.password, "")) {
                bVar.E(serialDescriptor, 3, config.password);
            }
            if (!bVar.z(serialDescriptor) && config.channel == Channel.SMS) {
                return;
            }
            bVar.j(serialDescriptor, 4, Channel.INSTANCE, config.channel);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPassword() {
            return this.password;
        }

        /* renamed from: component3, reason: from getter */
        public final Channel getChannel() {
            return this.channel;
        }

        public final Config copy(String phone, String password, Channel channel) {
            l.f("phone", phone);
            l.f("password", password);
            l.f("channel", channel);
            return new Config(phone, password, channel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return l.a(this.phone, config.phone) && l.a(this.password, config.password) && this.channel == config.channel;
        }

        public final Channel getChannel() {
            return this.channel;
        }

        public final String getPassword() {
            return this.password;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.channel.hashCode() + A6.b.b(this.password, this.phone.hashCode() * 31, 31);
        }

        public final void setChannel(Channel channel) {
            l.f("<set-?>", channel);
            this.channel = channel;
        }

        public final void setPassword(String str) {
            l.f("<set-?>", str);
            this.password = str;
        }

        public final void setPhone(String str) {
            l.f("<set-?>", str);
            this.phone = str;
        }

        public String toString() {
            return "Config(phone=" + this.phone + ", password=" + this.password + ", channel=" + this.channel + ')';
        }

        public /* synthetic */ Config(int i7, String str, c cVar, String str2, String str3, Channel channel, o0 o0Var) {
            super(i7, str, cVar, o0Var);
            if ((i7 & 4) == 0) {
                this.phone = "";
            } else {
                this.phone = str2;
            }
            if ((i7 & 8) == 0) {
                this.password = "";
            } else {
                this.password = str3;
            }
            if ((i7 & 16) == 0) {
                this.channel = Channel.SMS;
            } else {
                this.channel = channel;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Config(String str, String str2, Channel channel) {
            super((String) null, (c) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
            l.f("phone", str);
            l.f("password", str2);
            l.f("channel", channel);
            this.phone = str;
            this.password = str2;
            this.channel = channel;
        }

        public /* synthetic */ Config(String str, String str2, Channel channel, int i7, f fVar) {
            this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? Channel.SMS : channel);
        }
    }

    private Phone() {
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public c encodeCredentials(k kVar) {
        l.f("credentials", kVar);
        d supabaseJson = UtilsKt.getSupabaseJson();
        Config config = new Config(null, null, null, 7, null);
        kVar.invoke(config);
        supabaseJson.getClass();
        return a6.l.e(supabaseJson.c(Config.INSTANCE.serializer(), config));
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof Phone);
    }

    @Override // io.github.jan.supabase.auth.providers.builtin.DefaultAuthProvider
    public String getGrantType() {
        return grantType;
    }

    public int hashCode() {
        return -179496287;
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
        return "Phone";
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
            throw new SupabaseEncodingException("Couldn't decode sign up phone result. Input: " + cVar);
        }
    }
}
