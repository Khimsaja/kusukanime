package io.github.jan.supabase.auth.user;

import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.o0;
import Z5.t0;
import a6.x;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003Ja\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000fHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0014\u001a\u0004\b%\u0010\u0016¨\u0006>"}, d2 = {"Lio/github/jan/supabase/auth/user/Identity;", "", "id", "", "identityData", "Lkotlinx/serialization/json/JsonObject;", "identityId", "lastSignInAt", "updatedAt", "createdAt", "provider", "userId", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getIdentityData$annotations", "getIdentityData", "()Lkotlinx/serialization/json/JsonObject;", "getIdentityId$annotations", "getIdentityId", "getLastSignInAt$annotations", "getLastSignInAt", "getUpdatedAt$annotations", "getUpdatedAt", "getCreatedAt$annotations", "getCreatedAt", "getProvider$annotations", "getProvider", "getUserId$annotations", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class Identity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String createdAt;
    private final String id;
    private final c identityData;
    private final String identityId;
    private final String lastSignInAt;
    private final String provider;
    private final String updatedAt;
    private final String userId;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/Identity$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/Identity;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return Identity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Identity(int i7, String str, c cVar, String str2, String str3, String str4, String str5, String str6, String str7, o0 o0Var) {
        if (195 != (i7 & 195)) {
            AbstractC0632e0.j(i7, 195, Identity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.identityData = cVar;
        if ((i7 & 4) == 0) {
            this.identityId = null;
        } else {
            this.identityId = str2;
        }
        if ((i7 & 8) == 0) {
            this.lastSignInAt = null;
        } else {
            this.lastSignInAt = str3;
        }
        if ((i7 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = str4;
        }
        if ((i7 & 32) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str5;
        }
        this.provider = str6;
        this.userId = str7;
    }

    public static /* synthetic */ Identity copy$default(Identity identity, String str, c cVar, String str2, String str3, String str4, String str5, String str6, String str7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = identity.id;
        }
        if ((i7 & 2) != 0) {
            cVar = identity.identityData;
        }
        if ((i7 & 4) != 0) {
            str2 = identity.identityId;
        }
        if ((i7 & 8) != 0) {
            str3 = identity.lastSignInAt;
        }
        if ((i7 & 16) != 0) {
            str4 = identity.updatedAt;
        }
        if ((i7 & 32) != 0) {
            str5 = identity.createdAt;
        }
        if ((i7 & 64) != 0) {
            str6 = identity.provider;
        }
        if ((i7 & 128) != 0) {
            str7 = identity.userId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        return identity.copy(str, cVar, str2, str3, str10, str11, str8, str9);
    }

    @h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @h("identity_data")
    public static /* synthetic */ void getIdentityData$annotations() {
    }

    @h("identity_id")
    public static /* synthetic */ void getIdentityId$annotations() {
    }

    @h("last_sign_in_at")
    public static /* synthetic */ void getLastSignInAt$annotations() {
    }

    @h("provider")
    public static /* synthetic */ void getProvider$annotations() {
    }

    @h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @h("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(Identity identity, b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, identity.id);
        bVar.j(serialDescriptor, 1, x.a, identity.identityData);
        if (bVar.z(serialDescriptor) || identity.identityId != null) {
            bVar.F(serialDescriptor, 2, t0.a, identity.identityId);
        }
        if (bVar.z(serialDescriptor) || identity.lastSignInAt != null) {
            bVar.F(serialDescriptor, 3, t0.a, identity.lastSignInAt);
        }
        if (bVar.z(serialDescriptor) || identity.updatedAt != null) {
            bVar.F(serialDescriptor, 4, t0.a, identity.updatedAt);
        }
        if (bVar.z(serialDescriptor) || identity.createdAt != null) {
            bVar.F(serialDescriptor, 5, t0.a, identity.createdAt);
        }
        bVar.E(serialDescriptor, 6, identity.provider);
        bVar.E(serialDescriptor, 7, identity.userId);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final c getIdentityData() {
        return this.identityData;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentityId() {
        return this.identityId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLastSignInAt() {
        return this.lastSignInAt;
    }

    /* renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProvider() {
        return this.provider;
    }

    /* renamed from: component8, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final Identity copy(String str, c cVar, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f("id", str);
        l.f("identityData", cVar);
        l.f("provider", str6);
        l.f("userId", str7);
        return new Identity(str, cVar, str2, str3, str4, str5, str6, str7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Identity)) {
            return false;
        }
        Identity identity = (Identity) other;
        return l.a(this.id, identity.id) && l.a(this.identityData, identity.identityData) && l.a(this.identityId, identity.identityId) && l.a(this.lastSignInAt, identity.lastSignInAt) && l.a(this.updatedAt, identity.updatedAt) && l.a(this.createdAt, identity.createdAt) && l.a(this.provider, identity.provider) && l.a(this.userId, identity.userId);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final c getIdentityData() {
        return this.identityData;
    }

    public final String getIdentityId() {
        return this.identityId;
    }

    public final String getLastSignInAt() {
        return this.lastSignInAt;
    }

    public final String getProvider() {
        return this.provider;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (this.identityData.f12722k.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.identityId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastSignInAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.updatedAt;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdAt;
        return this.userId.hashCode() + A6.b.b(this.provider, (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Identity(id=");
        sb.append(this.id);
        sb.append(", identityData=");
        sb.append(this.identityData);
        sb.append(", identityId=");
        sb.append(this.identityId);
        sb.append(", lastSignInAt=");
        sb.append(this.lastSignInAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", userId=");
        return A6.b.j(sb, this.userId, ')');
    }

    public Identity(String str, c cVar, String str2, String str3, String str4, String str5, String str6, String str7) {
        l.f("id", str);
        l.f("identityData", cVar);
        l.f("provider", str6);
        l.f("userId", str7);
        this.id = str;
        this.identityData = cVar;
        this.identityId = str2;
        this.lastSignInAt = str3;
        this.updatedAt = str4;
        this.createdAt = str5;
        this.provider = str6;
        this.userId = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Identity(String str, c cVar, String str2, String str3, String str4, String str5, String str6, String str7, int i7, f fVar) {
        String str8;
        String str9;
        String str10;
        str2 = (i7 & 4) != 0 ? null : str2;
        str3 = (i7 & 8) != 0 ? null : str3;
        str4 = (i7 & 16) != 0 ? null : str4;
        if ((i7 & 32) != 0) {
            str8 = str7;
            str9 = str6;
            str10 = null;
        } else {
            str8 = str7;
            str9 = str6;
            str10 = str5;
        }
        this(str, cVar, str2, str3, str4, str10, str9, str8);
    }
}
