package io.github.jan.supabase.auth.mfa;

import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.o0;
import Z5.t0;
import e4.k;
import io.github.jan.supabase.UtilsKt;
import io.github.jan.supabase.annotations.SupabaseInternal;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\u000b2\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\b\u000fH§@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00028\u00012\u0006\u0010\u0012\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType;", "Config", "Response", "", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "encodeConfig", "Lkotlinx/serialization/json/JsonObject;", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeResponse", "json", "(Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "TOTP", "Phone", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FactorType<Config, Response> {
    private final String value;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone;", "Lio/github/jan/supabase/auth/mfa/FactorType;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "<init>", "()V", "decodeResponse", "json", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encodeConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "", "Response", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends FactorType<Config, Response> {
        public static final Phone INSTANCE = new Phone();

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "", "phone", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Config {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private String phone;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return FactorType$Phone$Config$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this((String) null, 1, (f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Config copy$default(Config config, String str, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = config.phone;
                }
                return config.copy(str);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
                if (!bVar.z(serialDescriptor) && config.phone == null) {
                    return;
                }
                bVar.F(serialDescriptor, 0, t0.a, config.phone);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            public final Config copy(String phone) {
                return new Config(phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && l.a(this.phone, ((Config) other).phone);
            }

            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                String str = this.phone;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public String toString() {
                return A6.b.j(new StringBuilder("Config(phone="), this.phone, ')');
            }

            public /* synthetic */ Config(int i7, String str, o0 o0Var) {
                if ((i7 & 1) == 0) {
                    this.phone = null;
                } else {
                    this.phone = str;
                }
            }

            public Config(String str) {
                this.phone = str;
            }

            public /* synthetic */ Config(String str, int i7, f fVar) {
                this((i7 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J%\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001¢\u0006\u0002\b\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "", "phone", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Response {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String phone;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$Phone$Response;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return FactorType$Phone$Response$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Response(int i7, String str, o0 o0Var) {
                if (1 == (i7 & 1)) {
                    this.phone = str;
                } else {
                    AbstractC0632e0.j(i7, 1, FactorType$Phone$Response$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public static /* synthetic */ Response copy$default(Response response, String str, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = response.phone;
                }
                return response.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            public final Response copy(String phone) {
                l.f("phone", phone);
                return new Response(phone);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Response) && l.a(this.phone, ((Response) other).phone);
            }

            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode();
            }

            public String toString() {
                return A6.b.j(new StringBuilder("Response(phone="), this.phone, ')');
            }

            public Response(String str) {
                l.f("phone", str);
                this.phone = str;
            }
        }

        private Phone() {
            super("phone", null);
        }

        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public Object decodeResponse(c cVar, S3.c<? super Response> cVar2) {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("phone");
            if (bVar != null) {
                d dVarF = a6.l.f(bVar);
                String strA = dVarF instanceof JsonNull ? null : dVarF.a();
                if (strA != null) {
                    return new Response(strA);
                }
            }
            throw new IllegalStateException("No 'phone' entry found in factor response");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public Object encodeConfig(k kVar, S3.c<? super c> cVar) {
            a6.d supabaseJson = UtilsKt.getSupabaseJson();
            Config config = new Config((String) null, 1, (f) (0 == true ? 1 : 0));
            kVar.invoke(config);
            supabaseJson.getClass();
            return a6.l.e(supabaseJson.c(Config.INSTANCE.serializer(), config));
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Phone);
        }

        public int hashCode() {
            return 1929459909;
        }

        public String toString() {
            return "Phone";
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP;", "Lio/github/jan/supabase/auth/mfa/FactorType;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "<init>", "()V", "decodeResponse", "json", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encodeConfig", "config", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "equals", "", "other", "", "hashCode", "", "toString", "", "Response", "Config", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TOTP extends FactorType<Config, Response> {
        public static final TOTP INSTANCE = new TOTP();

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0005¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "", "issuer", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getIssuer", "()Ljava/lang/String;", "setIssuer", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Config {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private String issuer;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Config;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return FactorType$TOTP$Config$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Config() {
                this((String) null, 1, (f) (0 == true ? 1 : 0));
            }

            public static /* synthetic */ Config copy$default(Config config, String str, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = config.issuer;
                }
                return config.copy(str);
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(Config config, b bVar, SerialDescriptor serialDescriptor) {
                if (!bVar.z(serialDescriptor) && config.issuer == null) {
                    return;
                }
                bVar.F(serialDescriptor, 0, t0.a, config.issuer);
            }

            /* renamed from: component1, reason: from getter */
            public final String getIssuer() {
                return this.issuer;
            }

            public final Config copy(String issuer) {
                return new Config(issuer);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Config) && l.a(this.issuer, ((Config) other).issuer);
            }

            public final String getIssuer() {
                return this.issuer;
            }

            public int hashCode() {
                String str = this.issuer;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final void setIssuer(String str) {
                this.issuer = str;
            }

            public String toString() {
                return A6.b.j(new StringBuilder("Config(issuer="), this.issuer, ')');
            }

            public /* synthetic */ Config(int i7, String str, o0 o0Var) {
                if ((i7 & 1) == 0) {
                    this.issuer = null;
                } else {
                    this.issuer = str;
                }
            }

            public Config(String str) {
                this.issuer = str;
            }

            public /* synthetic */ Config(String str, int i7, f fVar) {
                this((i7 & 1) != 0 ? null : str);
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J%\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0001¢\u0006\u0002\b#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006&"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "", "secret", "", "qrCode", "uri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSecret", "()Ljava/lang/String;", "getQrCode$annotations", "()V", "getQrCode", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @i
        public static final /* data */ class Response {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String qrCode;
            private final String secret;
            private final String uri;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/FactorType$TOTP$Response;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public final KSerializer serializer() {
                    return FactorType$TOTP$Response$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Response(int i7, String str, String str2, String str3, o0 o0Var) {
                if (7 != (i7 & 7)) {
                    AbstractC0632e0.j(i7, 7, FactorType$TOTP$Response$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.secret = str;
                this.qrCode = str2;
                this.uri = str3;
            }

            public static /* synthetic */ Response copy$default(Response response, String str, String str2, String str3, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    str = response.secret;
                }
                if ((i7 & 2) != 0) {
                    str2 = response.qrCode;
                }
                if ((i7 & 4) != 0) {
                    str3 = response.uri;
                }
                return response.copy(str, str2, str3);
            }

            @h("qr_code")
            public static /* synthetic */ void getQrCode$annotations() {
            }

            public static final /* synthetic */ void write$Self$auth_kt_release(Response response, b bVar, SerialDescriptor serialDescriptor) {
                bVar.E(serialDescriptor, 0, response.secret);
                bVar.E(serialDescriptor, 1, response.qrCode);
                bVar.E(serialDescriptor, 2, response.uri);
            }

            /* renamed from: component1, reason: from getter */
            public final String getSecret() {
                return this.secret;
            }

            /* renamed from: component2, reason: from getter */
            public final String getQrCode() {
                return this.qrCode;
            }

            /* renamed from: component3, reason: from getter */
            public final String getUri() {
                return this.uri;
            }

            public final Response copy(String secret, String qrCode, String uri) {
                l.f("secret", secret);
                l.f("qrCode", qrCode);
                l.f("uri", uri);
                return new Response(secret, qrCode, uri);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Response)) {
                    return false;
                }
                Response response = (Response) other;
                return l.a(this.secret, response.secret) && l.a(this.qrCode, response.qrCode) && l.a(this.uri, response.uri);
            }

            public final String getQrCode() {
                return this.qrCode;
            }

            public final String getSecret() {
                return this.secret;
            }

            public final String getUri() {
                return this.uri;
            }

            public int hashCode() {
                return this.uri.hashCode() + A6.b.b(this.qrCode, this.secret.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Response(secret=");
                sb.append(this.secret);
                sb.append(", qrCode=");
                sb.append(this.qrCode);
                sb.append(", uri=");
                return A6.b.j(sb, this.uri, ')');
            }

            public Response(String str, String str2, String str3) {
                l.f("secret", str);
                l.f("qrCode", str2);
                l.f("uri", str3);
                this.secret = str;
                this.qrCode = str2;
                this.uri = str3;
            }
        }

        private TOTP() {
            super("totp", null);
        }

        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public Object decodeResponse(c cVar, S3.c<? super Response> cVar2) {
            a6.d supabaseJson = UtilsKt.getSupabaseJson();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get("totp");
            if (bVar == null) {
                throw new IllegalStateException("No 'totp' object found in factor response");
            }
            c cVarE = a6.l.e(bVar);
            supabaseJson.getClass();
            return supabaseJson.a(Response.INSTANCE.serializer(), cVarE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.github.jan.supabase.auth.mfa.FactorType
        public Object encodeConfig(k kVar, S3.c<? super c> cVar) {
            a6.d supabaseJson = UtilsKt.getSupabaseJson();
            Config config = new Config((String) null, 1, (f) (0 == true ? 1 : 0));
            kVar.invoke(config);
            supabaseJson.getClass();
            return a6.l.e(supabaseJson.c(Config.INSTANCE.serializer(), config));
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof TOTP);
        }

        public int hashCode() {
            return 1170713568;
        }

        public String toString() {
            return "TOTP";
        }
    }

    public /* synthetic */ FactorType(String str, f fVar) {
        this(str);
    }

    @SupabaseInternal
    public abstract Object decodeResponse(c cVar, S3.c<? super Response> cVar2);

    @SupabaseInternal
    public abstract Object encodeConfig(k kVar, S3.c<? super c> cVar);

    public final String getValue() {
        return this.value;
    }

    private FactorType(String str) {
        this.value = str;
    }
}
