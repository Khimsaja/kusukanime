package io.github.jan.supabase.auth.user;

import A5.a;
import A5.c;
import A5.d;
import A5.g;
import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.K;
import Z5.o0;
import Z5.t0;
import b1.AbstractC0703b;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002BCB_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003Ji\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0012HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006D"}, d2 = {"Lio/github/jan/supabase/auth/user/UserSession;", "", "accessToken", "", "refreshToken", "providerRefreshToken", "providerToken", "expiresIn", "", "tokenType", "user", "Lio/github/jan/supabase/auth/user/UserInfo;", LinkHeader.Parameters.Type, "expiresAt", "Lkotlin/time/Instant;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lkotlin/time/Instant;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lio/github/jan/supabase/auth/user/UserInfo;Ljava/lang/String;Lkotlin/time/Instant;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccessToken$annotations", "()V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken$annotations", "getRefreshToken", "getProviderRefreshToken$annotations", "getProviderRefreshToken", "getProviderToken$annotations", "getProviderToken", "getExpiresIn$annotations", "getExpiresIn", "()J", "getTokenType$annotations", "getTokenType", "getUser", "()Lio/github/jan/supabase/auth/user/UserInfo;", "getType$annotations", "getType", "getExpiresAt", "()Lkotlin/time/Instant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class UserSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String accessToken;
    private final d expiresAt;
    private final long expiresIn;
    private final String providerRefreshToken;
    private final String providerToken;
    private final String refreshToken;
    private final String tokenType;
    private final String type;
    private final UserInfo user;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/user/UserSession$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/user/UserSession;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UserSession$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserSession(int i7, String str, String str2, String str3, String str4, long j7, String str5, UserInfo userInfo, String str6, d dVar, o0 o0Var) {
        if (51 != (i7 & 51)) {
            AbstractC0632e0.j(i7, 51, UserSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.accessToken = str;
        this.refreshToken = str2;
        if ((i7 & 4) == 0) {
            this.providerRefreshToken = null;
        } else {
            this.providerRefreshToken = str3;
        }
        if ((i7 & 8) == 0) {
            this.providerToken = null;
        } else {
            this.providerToken = str4;
        }
        this.expiresIn = j7;
        this.tokenType = str5;
        if ((i7 & 64) == 0) {
            this.user = null;
        } else {
            this.user = userInfo;
        }
        if ((i7 & 128) == 0) {
            this.type = "";
        } else {
            this.type = str6;
        }
        if ((i7 & 256) != 0) {
            this.expiresAt = dVar;
            return;
        }
        d dVarS = A5.f.a.s();
        int i8 = a.f239n;
        this.expiresAt = dVarS.b(g.o(j7, c.f243n));
    }

    public static /* synthetic */ UserSession copy$default(UserSession userSession, String str, String str2, String str3, String str4, long j7, String str5, UserInfo userInfo, String str6, d dVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userSession.accessToken;
        }
        if ((i7 & 2) != 0) {
            str2 = userSession.refreshToken;
        }
        if ((i7 & 4) != 0) {
            str3 = userSession.providerRefreshToken;
        }
        if ((i7 & 8) != 0) {
            str4 = userSession.providerToken;
        }
        if ((i7 & 16) != 0) {
            j7 = userSession.expiresIn;
        }
        if ((i7 & 32) != 0) {
            str5 = userSession.tokenType;
        }
        if ((i7 & 64) != 0) {
            userInfo = userSession.user;
        }
        if ((i7 & 128) != 0) {
            str6 = userSession.type;
        }
        if ((i7 & 256) != 0) {
            dVar = userSession.expiresAt;
        }
        long j8 = j7;
        String str7 = str3;
        String str8 = str4;
        return userSession.copy(str, str2, str7, str8, j8, str5, userInfo, str6, dVar);
    }

    @h("access_token")
    public static /* synthetic */ void getAccessToken$annotations() {
    }

    @h("expires_in")
    public static /* synthetic */ void getExpiresIn$annotations() {
    }

    @h("provider_refresh_token")
    public static /* synthetic */ void getProviderRefreshToken$annotations() {
    }

    @h("provider_token")
    public static /* synthetic */ void getProviderToken$annotations() {
    }

    @h("refresh_token")
    public static /* synthetic */ void getRefreshToken$annotations() {
    }

    @h("token_type")
    public static /* synthetic */ void getTokenType$annotations() {
    }

    @h(LinkHeader.Parameters.Type)
    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self$auth_kt_release(UserSession userSession, b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, userSession.accessToken);
        bVar.E(serialDescriptor, 1, userSession.refreshToken);
        if (bVar.z(serialDescriptor) || userSession.providerRefreshToken != null) {
            bVar.F(serialDescriptor, 2, t0.a, userSession.providerRefreshToken);
        }
        if (bVar.z(serialDescriptor) || userSession.providerToken != null) {
            bVar.F(serialDescriptor, 3, t0.a, userSession.providerToken);
        }
        bVar.x(serialDescriptor, 4, userSession.expiresIn);
        bVar.E(serialDescriptor, 5, userSession.tokenType);
        if (bVar.z(serialDescriptor) || userSession.user != null) {
            bVar.F(serialDescriptor, 6, UserInfo$$serializer.INSTANCE, userSession.user);
        }
        if (bVar.z(serialDescriptor) || !l.a(userSession.type, "")) {
            bVar.E(serialDescriptor, 7, userSession.type);
        }
        if (!bVar.z(serialDescriptor)) {
            d dVar = userSession.expiresAt;
            d dVarS = A5.f.a.s();
            int i7 = a.f239n;
            if (l.a(dVar, dVarS.b(g.o(userSession.expiresIn, c.f243n)))) {
                return;
            }
        }
        bVar.j(serialDescriptor, 8, K.a, userSession.expiresAt);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getProviderRefreshToken() {
        return this.providerRefreshToken;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProviderToken() {
        return this.providerToken;
    }

    /* renamed from: component5, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component7, reason: from getter */
    public final UserInfo getUser() {
        return this.user;
    }

    /* renamed from: component8, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final UserSession copy(String str, String str2, String str3, String str4, long j7, String str5, UserInfo userInfo, String str6, d dVar) {
        l.f("accessToken", str);
        l.f("refreshToken", str2);
        l.f("tokenType", str5);
        l.f(LinkHeader.Parameters.Type, str6);
        l.f("expiresAt", dVar);
        return new UserSession(str, str2, str3, str4, j7, str5, userInfo, str6, dVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserSession)) {
            return false;
        }
        UserSession userSession = (UserSession) other;
        return l.a(this.accessToken, userSession.accessToken) && l.a(this.refreshToken, userSession.refreshToken) && l.a(this.providerRefreshToken, userSession.providerRefreshToken) && l.a(this.providerToken, userSession.providerToken) && this.expiresIn == userSession.expiresIn && l.a(this.tokenType, userSession.tokenType) && l.a(this.user, userSession.user) && l.a(this.type, userSession.type) && l.a(this.expiresAt, userSession.expiresAt);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final String getProviderRefreshToken() {
        return this.providerRefreshToken;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final String getType() {
        return this.type;
    }

    public final UserInfo getUser() {
        return this.user;
    }

    public int hashCode() {
        int iB = A6.b.b(this.refreshToken, this.accessToken.hashCode() * 31, 31);
        String str = this.providerRefreshToken;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.providerToken;
        int iB2 = A6.b.b(this.tokenType, AbstractC0703b.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.expiresIn), 31);
        UserInfo userInfo = this.user;
        return this.expiresAt.hashCode() + A6.b.b(this.type, (iB2 + (userInfo != null ? userInfo.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        return "UserSession(accessToken=" + this.accessToken + ", refreshToken=" + this.refreshToken + ", providerRefreshToken=" + this.providerRefreshToken + ", providerToken=" + this.providerToken + ", expiresIn=" + this.expiresIn + ", tokenType=" + this.tokenType + ", user=" + this.user + ", type=" + this.type + ", expiresAt=" + this.expiresAt + ')';
    }

    public UserSession(String str, String str2, String str3, String str4, long j7, String str5, UserInfo userInfo, String str6, d dVar) {
        l.f("accessToken", str);
        l.f("refreshToken", str2);
        l.f("tokenType", str5);
        l.f(LinkHeader.Parameters.Type, str6);
        l.f("expiresAt", dVar);
        this.accessToken = str;
        this.refreshToken = str2;
        this.providerRefreshToken = str3;
        this.providerToken = str4;
        this.expiresIn = j7;
        this.tokenType = str5;
        this.user = userInfo;
        this.type = str6;
        this.expiresAt = dVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UserSession(String str, String str2, String str3, String str4, long j7, String str5, UserInfo userInfo, String str6, d dVar, int i7, f fVar) {
        str3 = (i7 & 4) != 0 ? null : str3;
        str4 = (i7 & 8) != 0 ? null : str4;
        userInfo = (i7 & 64) != 0 ? null : userInfo;
        str6 = (i7 & 128) != 0 ? "" : str6;
        if ((i7 & 256) != 0) {
            d dVarS = A5.f.a.s();
            int i8 = a.f239n;
            dVar = dVarS.b(g.o(j7, c.f243n));
        }
        this(str, str2, str3, str4, j7, str5, userInfo, str6, dVar);
    }
}
