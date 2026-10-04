package io.github.jan.supabase.auth.admin;

import A6.b;
import D6.r;
import O3.C;
import P3.m;
import V5.i;
import X5.a;
import X5.g;
import X5.j;
import Z5.C0635g;
import Z5.k0;
import Z5.t0;
import a6.o;
import a6.v;
import e4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;
import n6.d;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0003\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\u0002\b\u001dJ\u001f\u0010\n\u001a\u00020\u00192\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\u0002\b\u001dR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002!\"¨\u0006#"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserBuilder;", "", "<init>", "()V", "userMetadata", "Lkotlinx/serialization/json/JsonObject;", "getUserMetadata", "()Lkotlinx/serialization/json/JsonObject;", "setUserMetadata", "(Lkotlinx/serialization/json/JsonObject;)V", "appMetadata", "getAppMetadata", "setAppMetadata", "autoConfirm", "", "getAutoConfirm", "()Z", "setAutoConfirm", "(Z)V", "password", "", "getPassword", "()Ljava/lang/String;", "setPassword", "(Ljava/lang/String;)V", "", "metadata", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "Lkotlin/ExtensionFunctionType;", "Email", "Phone", "Companion", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Email;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Phone;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(with = Companion.class)
/* loaded from: classes.dex */
public abstract class AdminUserBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SerialDescriptor descriptor;
    private c appMetadata;
    private boolean autoConfirm;
    private String password;
    private c userMetadata;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serializer", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements KSerializer {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return AdminUserBuilder.descriptor;
        }

        public final KSerializer serializer() {
            return AdminUserBuilder.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public AdminUserBuilder deserialize(Decoder decoder) {
            l.f("decoder", decoder);
            throw new IllegalStateException("This serializer is only used for serialization");
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(Encoder encoder, AdminUserBuilder value) {
            l.f("encoder", encoder);
            l.f("value", value);
            o oVar = (o) encoder;
            if (AbstractC2510o.g0(value.getPassword())) {
                throw new IllegalArgumentException("Password must not be blank");
            }
            boolean z7 = value instanceof Email;
            if (z7 && AbstractC2510o.g0(((Email) value).getEmail())) {
                throw new IllegalArgumentException("Email must not be blank");
            }
            boolean z8 = value instanceof Phone;
            if (z8 && AbstractC2510o.g0(((Phone) value).getPhone())) {
                throw new IllegalArgumentException("Phone number must not be blank");
            }
            v vVar = new v();
            d.V("password", value.getPassword(), vVar);
            c userMetadata = value.getUserMetadata();
            if (userMetadata != null) {
                vVar.b("user_metadata", userMetadata);
            }
            c appMetadata = value.getAppMetadata();
            if (appMetadata != null) {
                vVar.b("app_metadata", appMetadata);
            }
            if (z7) {
                d.V("email", ((Email) value).getEmail(), vVar);
                d.W(vVar, "email_confirm", Boolean.valueOf(value.getAutoConfirm()));
            } else {
                if (!z8) {
                    throw new r();
                }
                d.V("phone", ((Phone) value).getPhone(), vVar);
                d.W(vVar, "phone_confirm", Boolean.valueOf(value.getAutoConfirm()));
            }
            oVar.y(vVar.a());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Email;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder;", "email", "", "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends AdminUserBuilder {
        private String email;

        /* JADX WARN: Multi-variable type inference failed */
        public Email() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Email copy$default(Email email, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = email.email;
            }
            return email.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public final Email copy(String email) {
            l.f("email", email);
            return new Email(email);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && l.a(this.email, ((Email) other).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public final void setEmail(String str) {
            l.f("<set-?>", str);
            this.email = str;
        }

        public String toString() {
            return b.j(new StringBuilder("Email(email="), this.email, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(String str) {
            super(null);
            l.f("email", str);
            this.email = str;
        }

        public /* synthetic */ Email(String str, int i7, f fVar) {
            this((i7 & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserBuilder$Phone;", "Lio/github/jan/supabase/auth/admin/AdminUserBuilder;", "phone", "", "<init>", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "setPhone", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends AdminUserBuilder {
        private String phone;

        /* JADX WARN: Multi-variable type inference failed */
        public Phone() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Phone copy$default(Phone phone, String str, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = phone.phone;
            }
            return phone.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final Phone copy(String phone) {
            l.f("phone", phone);
            return new Phone(phone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Phone) && l.a(this.phone, ((Phone) other).phone);
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.phone.hashCode();
        }

        public final void setPhone(String str) {
            l.f("<set-?>", str);
            this.phone = str;
        }

        public String toString() {
            return b.j(new StringBuilder("Phone(phone="), this.phone, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(String str) {
            super(null);
            l.f("phone", str);
            this.phone = str;
        }

        public /* synthetic */ Phone(String str, int i7, f fVar) {
            this((i7 & 1) != 0 ? "" : str);
        }
    }

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (AbstractC2510o.g0("io.github.jan.supabase.gotrue.admin.UserBuilder")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a("io.github.jan.supabase.gotrue.admin.UserBuilder");
        descriptor$lambda$0(aVar);
        descriptor = new g("io.github.jan.supabase.gotrue.admin.UserBuilder", j.f9951h, aVar.f9920c.size(), m.u0(serialDescriptorArr), aVar);
    }

    public /* synthetic */ AdminUserBuilder(f fVar) {
        this();
    }

    private static final C descriptor$lambda$0(a aVar) {
        l.f("$this$buildClassSerialDescriptor", aVar);
        k0 k0Var = t0.f10356b;
        aVar.a("password", k0Var, (12 & 8) == 0);
        aVar.a("email", k0Var, (12 & 8) == 0);
        k0 k0Var2 = C0635g.f10326b;
        aVar.a("email_confirm", k0Var2, (12 & 8) == 0);
        aVar.a("phone", k0Var, (12 & 8) == 0);
        aVar.a("phone_confirm", k0Var2, (12 & 8) == 0);
        aVar.a("user_metadata", c.Companion.serializer().getDescriptor(), (12 & 8) == 0);
        return C.a;
    }

    public final void appMetadata(k kVar) {
        l.f("metadata", kVar);
        v vVar = new v();
        kVar.invoke(vVar);
        this.appMetadata = vVar.a();
    }

    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final boolean getAutoConfirm() {
        return this.autoConfirm;
    }

    public final String getPassword() {
        return this.password;
    }

    public final c getUserMetadata() {
        return this.userMetadata;
    }

    public final void setAppMetadata(c cVar) {
        this.appMetadata = cVar;
    }

    public final void setAutoConfirm(boolean z7) {
        this.autoConfirm = z7;
    }

    public final void setPassword(String str) {
        l.f("<set-?>", str);
        this.password = str;
    }

    public final void setUserMetadata(c cVar) {
        this.userMetadata = cVar;
    }

    public final void userMetadata(k kVar) {
        l.f("metadata", kVar);
        v vVar = new v();
        kVar.invoke(vVar);
        this.userMetadata = vVar.a();
    }

    private AdminUserBuilder() {
        this.password = "";
    }
}
