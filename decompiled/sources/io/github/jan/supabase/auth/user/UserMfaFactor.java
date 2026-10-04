package io.github.jan.supabase.auth.user;

import A5.d;
import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.K;
import Z5.o0;
import Z5.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JG\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\rHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001f¨\u00065"}, d2 = {"Lio/github/jan/supabase/auth/user/UserMfaFactor;", "", "id", "", "createdAt", "Lkotlin/time/Instant;", "updatedAt", "status", "friendlyName", "factorType", "<init>", "(Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Lkotlin/time/Instant;", "getUpdatedAt$annotations", "getUpdatedAt", "getFriendlyName$annotations", "getFriendlyName", "getFactorType$annotations", "getFactorType", "isVerified", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class UserMfaFactor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final d createdAt;
    private final String factorType;
    private final String friendlyName;
    private final String id;
    private final String status;
    private final d updatedAt;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserMfaFactor$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserMfaFactor;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UserMfaFactor$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ UserMfaFactor(int i7, String str, d dVar, d dVar2, String str2, String str3, String str4, o0 o0Var) {
        if (47 != (i7 & 47)) {
            AbstractC0632e0.j(i7, 47, UserMfaFactor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.createdAt = dVar;
        this.updatedAt = dVar2;
        this.status = str2;
        if ((i7 & 16) == 0) {
            this.friendlyName = null;
        } else {
            this.friendlyName = str3;
        }
        this.factorType = str4;
    }

    /* renamed from: component4, reason: from getter */
    private final String getStatus() {
        return this.status;
    }

    public static /* synthetic */ UserMfaFactor copy$default(UserMfaFactor userMfaFactor, String str, d dVar, d dVar2, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userMfaFactor.id;
        }
        if ((i7 & 2) != 0) {
            dVar = userMfaFactor.createdAt;
        }
        if ((i7 & 4) != 0) {
            dVar2 = userMfaFactor.updatedAt;
        }
        if ((i7 & 8) != 0) {
            str2 = userMfaFactor.status;
        }
        if ((i7 & 16) != 0) {
            str3 = userMfaFactor.friendlyName;
        }
        if ((i7 & 32) != 0) {
            str4 = userMfaFactor.factorType;
        }
        String str5 = str3;
        String str6 = str4;
        return userMfaFactor.copy(str, dVar, dVar2, str2, str5, str6);
    }

    @h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @h("factor_type")
    public static /* synthetic */ void getFactorType$annotations() {
    }

    @h("friendly_name")
    public static /* synthetic */ void getFriendlyName$annotations() {
    }

    @h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(UserMfaFactor userMfaFactor, b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, userMfaFactor.id);
        K k7 = K.a;
        bVar.j(serialDescriptor, 1, k7, userMfaFactor.createdAt);
        bVar.j(serialDescriptor, 2, k7, userMfaFactor.updatedAt);
        bVar.E(serialDescriptor, 3, userMfaFactor.status);
        if (bVar.z(serialDescriptor) || userMfaFactor.friendlyName != null) {
            bVar.F(serialDescriptor, 4, t0.a, userMfaFactor.friendlyName);
        }
        bVar.E(serialDescriptor, 5, userMfaFactor.factorType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final d getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFactorType() {
        return this.factorType;
    }

    public final UserMfaFactor copy(String str, d dVar, d dVar2, String str2, String str3, String str4) {
        l.f("id", str);
        l.f("createdAt", dVar);
        l.f("updatedAt", dVar2);
        l.f("status", str2);
        l.f("factorType", str4);
        return new UserMfaFactor(str, dVar, dVar2, str2, str3, str4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMfaFactor)) {
            return false;
        }
        UserMfaFactor userMfaFactor = (UserMfaFactor) other;
        return l.a(this.id, userMfaFactor.id) && l.a(this.createdAt, userMfaFactor.createdAt) && l.a(this.updatedAt, userMfaFactor.updatedAt) && l.a(this.status, userMfaFactor.status) && l.a(this.friendlyName, userMfaFactor.friendlyName) && l.a(this.factorType, userMfaFactor.factorType);
    }

    public final d getCreatedAt() {
        return this.createdAt;
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final String getId() {
        return this.id;
    }

    public final d getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iB = A6.b.b(this.status, (this.updatedAt.hashCode() + ((this.createdAt.hashCode() + (this.id.hashCode() * 31)) * 31)) * 31, 31);
        String str = this.friendlyName;
        return this.factorType.hashCode() + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isVerified() {
        return l.a(this.status, "verified");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserMfaFactor(id=");
        sb.append(this.id);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", friendlyName=");
        sb.append(this.friendlyName);
        sb.append(", factorType=");
        return A6.b.j(sb, this.factorType, ')');
    }

    public UserMfaFactor(String str, d dVar, d dVar2, String str2, String str3, String str4) {
        l.f("id", str);
        l.f("createdAt", dVar);
        l.f("updatedAt", dVar2);
        l.f("status", str2);
        l.f("factorType", str4);
        this.id = str;
        this.createdAt = dVar;
        this.updatedAt = dVar2;
        this.status = str2;
        this.friendlyName = str3;
        this.factorType = str4;
    }

    public /* synthetic */ UserMfaFactor(String str, d dVar, d dVar2, String str2, String str3, String str4, int i7, f fVar) {
        this(str, dVar, dVar2, str2, (i7 & 16) != 0 ? null : str3, str4);
    }
}
