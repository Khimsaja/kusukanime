package io.github.jan.supabase.auth.admin;

import V5.h;
import V5.i;
import Y5.b;
import Z5.C0635g;
import Z5.o0;
import Z5.t0;
import a6.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002KLBs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0011HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001J%\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0001¢\u0006\u0002\bJR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R&\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R&\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010)\u0012\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010)\u0012\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u0018R&\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u0016\"\u0004\b1\u0010\u0018R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018¨\u0006M"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "", "email", "", "password", "appMetadata", "Lkotlinx/serialization/json/JsonObject;", "userMetadata", "emailConfirm", "", "phoneConfirm", "phone", "banDuration", "role", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getAppMetadata$annotations", "()V", "getAppMetadata", "()Lkotlinx/serialization/json/JsonObject;", "setAppMetadata", "(Lkotlinx/serialization/json/JsonObject;)V", "getUserMetadata$annotations", "getUserMetadata", "setUserMetadata", "getEmailConfirm$annotations", "getEmailConfirm", "()Ljava/lang/Boolean;", "setEmailConfirm", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPhoneConfirm$annotations", "getPhoneConfirm", "setPhoneConfirm", "getPhone", "setPhone", "getBanDuration$annotations", "getBanDuration", "setBanDuration", "getRole", "setRole", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/json/JsonObject;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class AdminUserUpdateBuilder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private c appMetadata;
    private String banDuration;
    private String email;
    private Boolean emailConfirm;
    private String password;
    private String phone;
    private Boolean phoneConfirm;
    private String role;
    private c userMetadata;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/admin/AdminUserUpdateBuilder;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return AdminUserUpdateBuilder$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AdminUserUpdateBuilder() {
        this((String) null, (String) null, (c) null, (c) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (String) null, 511, (f) null);
    }

    public static /* synthetic */ AdminUserUpdateBuilder copy$default(AdminUserUpdateBuilder adminUserUpdateBuilder, String str, String str2, c cVar, c cVar2, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = adminUserUpdateBuilder.email;
        }
        if ((i7 & 2) != 0) {
            str2 = adminUserUpdateBuilder.password;
        }
        if ((i7 & 4) != 0) {
            cVar = adminUserUpdateBuilder.appMetadata;
        }
        if ((i7 & 8) != 0) {
            cVar2 = adminUserUpdateBuilder.userMetadata;
        }
        if ((i7 & 16) != 0) {
            bool = adminUserUpdateBuilder.emailConfirm;
        }
        if ((i7 & 32) != 0) {
            bool2 = adminUserUpdateBuilder.phoneConfirm;
        }
        if ((i7 & 64) != 0) {
            str3 = adminUserUpdateBuilder.phone;
        }
        if ((i7 & 128) != 0) {
            str4 = adminUserUpdateBuilder.banDuration;
        }
        if ((i7 & 256) != 0) {
            str5 = adminUserUpdateBuilder.role;
        }
        String str6 = str4;
        String str7 = str5;
        Boolean bool3 = bool2;
        String str8 = str3;
        Boolean bool4 = bool;
        c cVar3 = cVar;
        return adminUserUpdateBuilder.copy(str, str2, cVar3, cVar2, bool4, bool3, str8, str6, str7);
    }

    @h("app_metadata")
    public static /* synthetic */ void getAppMetadata$annotations() {
    }

    @h("ban_duration")
    public static /* synthetic */ void getBanDuration$annotations() {
    }

    @h("email_confirm")
    public static /* synthetic */ void getEmailConfirm$annotations() {
    }

    @h("phone_confirm")
    public static /* synthetic */ void getPhoneConfirm$annotations() {
    }

    @h("user_metadata")
    public static /* synthetic */ void getUserMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(AdminUserUpdateBuilder adminUserUpdateBuilder, b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.email != null) {
            bVar.F(serialDescriptor, 0, t0.a, adminUserUpdateBuilder.email);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.password != null) {
            bVar.F(serialDescriptor, 1, t0.a, adminUserUpdateBuilder.password);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.appMetadata != null) {
            bVar.F(serialDescriptor, 2, x.a, adminUserUpdateBuilder.appMetadata);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.userMetadata != null) {
            bVar.F(serialDescriptor, 3, x.a, adminUserUpdateBuilder.userMetadata);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.emailConfirm != null) {
            bVar.F(serialDescriptor, 4, C0635g.a, adminUserUpdateBuilder.emailConfirm);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.phoneConfirm != null) {
            bVar.F(serialDescriptor, 5, C0635g.a, adminUserUpdateBuilder.phoneConfirm);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.phone != null) {
            bVar.F(serialDescriptor, 6, t0.a, adminUserUpdateBuilder.phone);
        }
        if (bVar.z(serialDescriptor) || adminUserUpdateBuilder.banDuration != null) {
            bVar.F(serialDescriptor, 7, t0.a, adminUserUpdateBuilder.banDuration);
        }
        if (!bVar.z(serialDescriptor) && adminUserUpdateBuilder.role == null) {
            return;
        }
        bVar.F(serialDescriptor, 8, t0.a, adminUserUpdateBuilder.role);
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
    public final c getAppMetadata() {
        return this.appMetadata;
    }

    /* renamed from: component4, reason: from getter */
    public final c getUserMetadata() {
        return this.userMetadata;
    }

    /* renamed from: component5, reason: from getter */
    public final Boolean getEmailConfirm() {
        return this.emailConfirm;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getPhoneConfirm() {
        return this.phoneConfirm;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBanDuration() {
        return this.banDuration;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final AdminUserUpdateBuilder copy(String str, String str2, c cVar, c cVar2, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
        return new AdminUserUpdateBuilder(str, str2, cVar, cVar2, bool, bool2, str3, str4, str5);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdminUserUpdateBuilder)) {
            return false;
        }
        AdminUserUpdateBuilder adminUserUpdateBuilder = (AdminUserUpdateBuilder) other;
        return l.a(this.email, adminUserUpdateBuilder.email) && l.a(this.password, adminUserUpdateBuilder.password) && l.a(this.appMetadata, adminUserUpdateBuilder.appMetadata) && l.a(this.userMetadata, adminUserUpdateBuilder.userMetadata) && l.a(this.emailConfirm, adminUserUpdateBuilder.emailConfirm) && l.a(this.phoneConfirm, adminUserUpdateBuilder.phoneConfirm) && l.a(this.phone, adminUserUpdateBuilder.phone) && l.a(this.banDuration, adminUserUpdateBuilder.banDuration) && l.a(this.role, adminUserUpdateBuilder.role);
    }

    public final c getAppMetadata() {
        return this.appMetadata;
    }

    public final String getBanDuration() {
        return this.banDuration;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Boolean getEmailConfirm() {
        return this.emailConfirm;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Boolean getPhoneConfirm() {
        return this.phoneConfirm;
    }

    public final String getRole() {
        return this.role;
    }

    public final c getUserMetadata() {
        return this.userMetadata;
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.appMetadata;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.f12722k.hashCode())) * 31;
        c cVar2 = this.userMetadata;
        int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.f12722k.hashCode())) * 31;
        Boolean bool = this.emailConfirm;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.phoneConfirm;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.banDuration;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.role;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setAppMetadata(c cVar) {
        this.appMetadata = cVar;
    }

    public final void setBanDuration(String str) {
        this.banDuration = str;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final void setEmailConfirm(Boolean bool) {
        this.emailConfirm = bool;
    }

    public final void setPassword(String str) {
        this.password = str;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final void setPhoneConfirm(Boolean bool) {
        this.phoneConfirm = bool;
    }

    public final void setRole(String str) {
        this.role = str;
    }

    public final void setUserMetadata(c cVar) {
        this.userMetadata = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdminUserUpdateBuilder(email=");
        sb.append(this.email);
        sb.append(", password=");
        sb.append(this.password);
        sb.append(", appMetadata=");
        sb.append(this.appMetadata);
        sb.append(", userMetadata=");
        sb.append(this.userMetadata);
        sb.append(", emailConfirm=");
        sb.append(this.emailConfirm);
        sb.append(", phoneConfirm=");
        sb.append(this.phoneConfirm);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", banDuration=");
        sb.append(this.banDuration);
        sb.append(", role=");
        return A6.b.j(sb, this.role, ')');
    }

    public /* synthetic */ AdminUserUpdateBuilder(int i7, String str, String str2, c cVar, c cVar2, Boolean bool, Boolean bool2, String str3, String str4, String str5, o0 o0Var) {
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
            this.appMetadata = null;
        } else {
            this.appMetadata = cVar;
        }
        if ((i7 & 8) == 0) {
            this.userMetadata = null;
        } else {
            this.userMetadata = cVar2;
        }
        if ((i7 & 16) == 0) {
            this.emailConfirm = null;
        } else {
            this.emailConfirm = bool;
        }
        if ((i7 & 32) == 0) {
            this.phoneConfirm = null;
        } else {
            this.phoneConfirm = bool2;
        }
        if ((i7 & 64) == 0) {
            this.phone = null;
        } else {
            this.phone = str3;
        }
        if ((i7 & 128) == 0) {
            this.banDuration = null;
        } else {
            this.banDuration = str4;
        }
        if ((i7 & 256) == 0) {
            this.role = null;
        } else {
            this.role = str5;
        }
    }

    public AdminUserUpdateBuilder(String str, String str2, c cVar, c cVar2, Boolean bool, Boolean bool2, String str3, String str4, String str5) {
        this.email = str;
        this.password = str2;
        this.appMetadata = cVar;
        this.userMetadata = cVar2;
        this.emailConfirm = bool;
        this.phoneConfirm = bool2;
        this.phone = str3;
        this.banDuration = str4;
        this.role = str5;
    }

    public /* synthetic */ AdminUserUpdateBuilder(String str, String str2, c cVar, c cVar2, Boolean bool, Boolean bool2, String str3, String str4, String str5, int i7, f fVar) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : cVar, (i7 & 8) != 0 ? null : cVar2, (i7 & 16) != 0 ? null : bool, (i7 & 32) != 0 ? null : bool2, (i7 & 64) != 0 ? null : str3, (i7 & 128) != 0 ? null : str4, (i7 & 256) != 0 ? null : str5);
    }
}
