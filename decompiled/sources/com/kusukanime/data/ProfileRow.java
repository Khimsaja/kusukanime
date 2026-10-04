package com.kusukanime.data;

import V5.i;
import Z5.o0;
import Z5.t0;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p.AbstractC1755i;
import v.c0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011B\u0083\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u007f\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010/\u001a\u00020\r2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\nHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u0006="}, d2 = {"Lcom/kusukanime/data/ProfileRow;", "", "id", "", ContentDisposition.Parameters.Name, "username", "avatar_url", "bio", "role", "level", "", "exp", "is_private", "", "vip_expires_at", "created_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getUsername", "getAvatar_url", "getBio", "getRole", "getLevel", "()I", "getExp", "()Z", "getVip_expires_at", "getCreated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class ProfileRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatar_url;
    private final String bio;
    private final String created_at;
    private final int exp;
    private final String id;
    private final boolean is_private;
    private final int level;
    private final String name;
    private final String role;
    private final String username;
    private final String vip_expires_at;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/ProfileRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/ProfileRow;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ProfileRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProfileRow() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, false, (String) null, (String) null, 2047, (f) null);
    }

    public static /* synthetic */ ProfileRow copy$default(ProfileRow profileRow, String str, String str2, String str3, String str4, String str5, String str6, int i7, int i8, boolean z7, String str7, String str8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = profileRow.id;
        }
        if ((i9 & 2) != 0) {
            str2 = profileRow.name;
        }
        if ((i9 & 4) != 0) {
            str3 = profileRow.username;
        }
        if ((i9 & 8) != 0) {
            str4 = profileRow.avatar_url;
        }
        if ((i9 & 16) != 0) {
            str5 = profileRow.bio;
        }
        if ((i9 & 32) != 0) {
            str6 = profileRow.role;
        }
        if ((i9 & 64) != 0) {
            i7 = profileRow.level;
        }
        if ((i9 & 128) != 0) {
            i8 = profileRow.exp;
        }
        if ((i9 & 256) != 0) {
            z7 = profileRow.is_private;
        }
        if ((i9 & 512) != 0) {
            str7 = profileRow.vip_expires_at;
        }
        if ((i9 & 1024) != 0) {
            str8 = profileRow.created_at;
        }
        String str9 = str7;
        String str10 = str8;
        int i10 = i8;
        boolean z8 = z7;
        String str11 = str6;
        int i11 = i7;
        String str12 = str5;
        String str13 = str3;
        return profileRow.copy(str, str2, str13, str4, str12, str11, i11, i10, z8, str9, str10);
    }

    public static final /* synthetic */ void write$Self$app_release(ProfileRow profileRow, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(profileRow.id, "")) {
            bVar.E(serialDescriptor, 0, profileRow.id);
        }
        if (bVar.z(serialDescriptor) || !l.a(profileRow.name, "")) {
            bVar.E(serialDescriptor, 1, profileRow.name);
        }
        if (bVar.z(serialDescriptor) || profileRow.username != null) {
            bVar.F(serialDescriptor, 2, t0.a, profileRow.username);
        }
        if (bVar.z(serialDescriptor) || profileRow.avatar_url != null) {
            bVar.F(serialDescriptor, 3, t0.a, profileRow.avatar_url);
        }
        if (bVar.z(serialDescriptor) || profileRow.bio != null) {
            bVar.F(serialDescriptor, 4, t0.a, profileRow.bio);
        }
        if (bVar.z(serialDescriptor) || !l.a(profileRow.role, "watcher")) {
            bVar.E(serialDescriptor, 5, profileRow.role);
        }
        if (bVar.z(serialDescriptor) || profileRow.level != 1) {
            bVar.q(6, profileRow.level, serialDescriptor);
        }
        if (bVar.z(serialDescriptor) || profileRow.exp != 0) {
            bVar.q(7, profileRow.exp, serialDescriptor);
        }
        if (bVar.z(serialDescriptor) || profileRow.is_private) {
            bVar.A(serialDescriptor, 8, profileRow.is_private);
        }
        if (bVar.z(serialDescriptor) || profileRow.vip_expires_at != null) {
            bVar.F(serialDescriptor, 9, t0.a, profileRow.vip_expires_at);
        }
        if (!bVar.z(serialDescriptor) && l.a(profileRow.created_at, "")) {
            return;
        }
        bVar.E(serialDescriptor, 10, profileRow.created_at);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVip_expires_at() {
        return this.vip_expires_at;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* renamed from: component6, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component8, reason: from getter */
    public final int getExp() {
        return this.exp;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIs_private() {
        return this.is_private;
    }

    public final ProfileRow copy(String id, String name, String username, String avatar_url, String bio, String role, int level, int exp, boolean is_private, String vip_expires_at, String created_at) {
        l.f("id", id);
        l.f(ContentDisposition.Parameters.Name, name);
        l.f("role", role);
        l.f("created_at", created_at);
        return new ProfileRow(id, name, username, avatar_url, bio, role, level, exp, is_private, vip_expires_at, created_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileRow)) {
            return false;
        }
        ProfileRow profileRow = (ProfileRow) other;
        return l.a(this.id, profileRow.id) && l.a(this.name, profileRow.name) && l.a(this.username, profileRow.username) && l.a(this.avatar_url, profileRow.avatar_url) && l.a(this.bio, profileRow.bio) && l.a(this.role, profileRow.role) && this.level == profileRow.level && this.exp == profileRow.exp && this.is_private == profileRow.is_private && l.a(this.vip_expires_at, profileRow.vip_expires_at) && l.a(this.created_at, profileRow.created_at);
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final int getExp() {
        return this.exp;
    }

    public final String getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getVip_expires_at() {
        return this.vip_expires_at;
    }

    public int hashCode() {
        int iB = A6.b.b(this.name, this.id.hashCode() * 31, 31);
        String str = this.username;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bio;
        int iD = AbstractC0703b.d(AbstractC1755i.a(this.exp, AbstractC1755i.a(this.level, A6.b.b(this.role, (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31), 31, this.is_private);
        String str4 = this.vip_expires_at;
        return this.created_at.hashCode() + ((iD + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final boolean is_private() {
        return this.is_private;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.username;
        String str4 = this.avatar_url;
        String str5 = this.bio;
        String str6 = this.role;
        int i7 = this.level;
        int i8 = this.exp;
        boolean z7 = this.is_private;
        String str7 = this.vip_expires_at;
        String str8 = this.created_at;
        StringBuilder sbC = c0.c("ProfileRow(id=", str, ", name=", str2, ", username=");
        sbC.append(str3);
        sbC.append(", avatar_url=");
        sbC.append(str4);
        sbC.append(", bio=");
        sbC.append(str5);
        sbC.append(", role=");
        sbC.append(str6);
        sbC.append(", level=");
        sbC.append(i7);
        sbC.append(", exp=");
        sbC.append(i8);
        sbC.append(", is_private=");
        sbC.append(z7);
        sbC.append(", vip_expires_at=");
        sbC.append(str7);
        sbC.append(", created_at=");
        return AbstractC0703b.m(sbC, str8, ")");
    }

    public /* synthetic */ ProfileRow(int i7, String str, String str2, String str3, String str4, String str5, String str6, int i8, int i9, boolean z7, String str7, String str8, o0 o0Var) {
        if ((i7 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i7 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i7 & 4) == 0) {
            this.username = null;
        } else {
            this.username = str3;
        }
        if ((i7 & 8) == 0) {
            this.avatar_url = null;
        } else {
            this.avatar_url = str4;
        }
        if ((i7 & 16) == 0) {
            this.bio = null;
        } else {
            this.bio = str5;
        }
        if ((i7 & 32) == 0) {
            this.role = "watcher";
        } else {
            this.role = str6;
        }
        if ((i7 & 64) == 0) {
            this.level = 1;
        } else {
            this.level = i8;
        }
        if ((i7 & 128) == 0) {
            this.exp = 0;
        } else {
            this.exp = i9;
        }
        if ((i7 & 256) == 0) {
            this.is_private = false;
        } else {
            this.is_private = z7;
        }
        if ((i7 & 512) == 0) {
            this.vip_expires_at = null;
        } else {
            this.vip_expires_at = str7;
        }
        if ((i7 & 1024) == 0) {
            this.created_at = "";
        } else {
            this.created_at = str8;
        }
    }

    public ProfileRow(String str, String str2, String str3, String str4, String str5, String str6, int i7, int i8, boolean z7, String str7, String str8) {
        l.f("id", str);
        l.f(ContentDisposition.Parameters.Name, str2);
        l.f("role", str6);
        l.f("created_at", str8);
        this.id = str;
        this.name = str2;
        this.username = str3;
        this.avatar_url = str4;
        this.bio = str5;
        this.role = str6;
        this.level = i7;
        this.exp = i8;
        this.is_private = z7;
        this.vip_expires_at = str7;
        this.created_at = str8;
    }

    public /* synthetic */ ProfileRow(String str, String str2, String str3, String str4, String str5, String str6, int i7, int i8, boolean z7, String str7, String str8, int i9, f fVar) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? null : str3, (i9 & 8) != 0 ? null : str4, (i9 & 16) != 0 ? null : str5, (i9 & 32) != 0 ? "watcher" : str6, (i9 & 64) != 0 ? 1 : i7, (i9 & 128) != 0 ? 0 : i8, (i9 & 256) == 0 ? z7 : false, (i9 & 512) == 0 ? str7 : null, (i9 & 1024) != 0 ? "" : str8);
    }
}
