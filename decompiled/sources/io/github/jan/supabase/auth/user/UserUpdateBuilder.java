package io.github.jan.supabase.auth.user;

import V5.h;
import V5.i;
import Y5.b;
import Z5.o0;
import Z5.t0;
import a6.C0673c;
import a6.d;
import a6.v;
import a6.x;
import e4.k;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.serializer.KotlinXSerializer;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002BCBM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\"\u0010\u0007\u001a\u00020'\"\n\b\u0000\u0010(\u0018\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u0002H(H\u0086\b¢\u0006\u0002\u0010)J%\u0010\u0007\u001a\u00020'2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020'0+¢\u0006\u0002\b-H\u0086\bø\u0001\u0000J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000e\u00103\u001a\u00020\nHÀ\u0003¢\u0006\u0002\b4JO\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u000eHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J%\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006D"}, d2 = {"Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "", "email", "", "password", "phone", "nonce", "data", "Lkotlinx/serialization/json/JsonObject;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lio/github/jan/supabase/SupabaseSerializer;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getPhone$annotations", "()V", "getPhone", "setPhone", "getNonce", "setNonce", "getData", "()Lkotlinx/serialization/json/JsonObject;", "setData", "(Lkotlinx/serialization/json/JsonObject;)V", "getSerializer$annotations", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "", "T", "(Ljava/lang/Object;)V", "builder", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonObjectBuilder;", "Lkotlin/ExtensionFunctionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component6$auth_kt_release", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class UserUpdateBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private c data;
    private String email;
    private String nonce;
    private String password;
    private String phone;
    private SupabaseSerializer serializer;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserUpdateBuilder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserUpdateBuilder;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UserUpdateBuilder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserUpdateBuilder() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ UserUpdateBuilder copy$default(UserUpdateBuilder userUpdateBuilder, String str, String str2, String str3, String str4, c cVar, SupabaseSerializer supabaseSerializer, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userUpdateBuilder.email;
        }
        if ((i7 & 2) != 0) {
            str2 = userUpdateBuilder.password;
        }
        if ((i7 & 4) != 0) {
            str3 = userUpdateBuilder.phone;
        }
        if ((i7 & 8) != 0) {
            str4 = userUpdateBuilder.nonce;
        }
        if ((i7 & 16) != 0) {
            cVar = userUpdateBuilder.data;
        }
        if ((i7 & 32) != 0) {
            supabaseSerializer = userUpdateBuilder.serializer;
        }
        c cVar2 = cVar;
        SupabaseSerializer supabaseSerializer2 = supabaseSerializer;
        return userUpdateBuilder.copy(str, str2, str3, str4, cVar2, supabaseSerializer2);
    }

    @h("phone")
    public static /* synthetic */ void getPhone$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(UserUpdateBuilder userUpdateBuilder, b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || userUpdateBuilder.email != null) {
            bVar.F(serialDescriptor, 0, t0.a, userUpdateBuilder.email);
        }
        if (bVar.z(serialDescriptor) || userUpdateBuilder.password != null) {
            bVar.F(serialDescriptor, 1, t0.a, userUpdateBuilder.password);
        }
        if (bVar.z(serialDescriptor) || userUpdateBuilder.phone != null) {
            bVar.F(serialDescriptor, 2, t0.a, userUpdateBuilder.phone);
        }
        if (bVar.z(serialDescriptor) || userUpdateBuilder.nonce != null) {
            bVar.F(serialDescriptor, 3, t0.a, userUpdateBuilder.nonce);
        }
        if (!bVar.z(serialDescriptor) && userUpdateBuilder.data == null) {
            return;
        }
        bVar.F(serialDescriptor, 4, x.a, userUpdateBuilder.data);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: component5, reason: from getter */
    public final c getData() {
        return this.data;
    }

    /* renamed from: component6$auth_kt_release, reason: from getter */
    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final UserUpdateBuilder copy(String str, String str2, String str3, String str4, c cVar, SupabaseSerializer supabaseSerializer) {
        l.f("serializer", supabaseSerializer);
        return new UserUpdateBuilder(str, str2, str3, str4, cVar, supabaseSerializer);
    }

    public final <T> void data(T data) {
        l.f("data", data);
        getSerializer();
        C0673c c0673c = d.f10459d;
        l.k();
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserUpdateBuilder)) {
            return false;
        }
        UserUpdateBuilder userUpdateBuilder = (UserUpdateBuilder) other;
        return l.a(this.email, userUpdateBuilder.email) && l.a(this.password, userUpdateBuilder.password) && l.a(this.phone, userUpdateBuilder.phone) && l.a(this.nonce, userUpdateBuilder.nonce) && l.a(this.data, userUpdateBuilder.data) && l.a(this.serializer, userUpdateBuilder.serializer);
    }

    public final c getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nonce;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        c cVar = this.data;
        return this.serializer.hashCode() + ((iHashCode4 + (cVar != null ? cVar.f12722k.hashCode() : 0)) * 31);
    }

    public final void setData(c cVar) {
        this.data = cVar;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setSerializer(SupabaseSerializer supabaseSerializer) {
        l.f("<set-?>", supabaseSerializer);
        this.serializer = supabaseSerializer;
    }

    public String toString() {
        return "UserUpdateBuilder(email=" + this.email + ", password=" + this.password + ", phone=" + this.phone + ", nonce=" + this.nonce + ", data=" + this.data + ", serializer=" + this.serializer + ')';
    }

    public /* synthetic */ UserUpdateBuilder(int i7, String str, String str2, String str3, String str4, c cVar, o0 o0Var) {
        if ((i7 & 1) == 0) {
            this.email = null;
        } else {
            this.email = str;
        }
        if ((i7 & 2) == 0) {
            this.password = null;
        } else {
            this.password = str2;
        }
        if ((i7 & 4) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i7 & 8) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str4;
        }
        if ((i7 & 16) == 0) {
            this.data = null;
        } else {
            this.data = cVar;
        }
        this.serializer = new KotlinXSerializer(null, 1, null);
    }

    public final void data(k kVar) {
        l.f("builder", kVar);
        v vVar = new v();
        kVar.invoke(vVar);
        setData(vVar.a());
    }

    public UserUpdateBuilder(String str, String str2, String str3, String str4, c cVar, SupabaseSerializer supabaseSerializer) {
        l.f("serializer", supabaseSerializer);
        this.email = str;
        this.password = str2;
        this.phone = str3;
        this.nonce = str4;
        this.data = cVar;
        this.serializer = supabaseSerializer;
    }

    public /* synthetic */ UserUpdateBuilder(String str, String str2, String str3, String str4, c cVar, SupabaseSerializer supabaseSerializer, int i7, f fVar) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : cVar, (i7 & 32) != 0 ? new KotlinXSerializer(null, 1, null) : supabaseSerializer);
    }
}
