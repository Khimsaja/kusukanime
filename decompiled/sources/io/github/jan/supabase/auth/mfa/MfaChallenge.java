package io.github.jan.supabase.auth.mfa;

import A5.d;
import A5.g;
import V5.h;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.o0;
import io.ktor.http.LinkHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B7\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0005\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0002X\u0083D¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "", "id", "", "factorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "expiresAtSeconds", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getFactorType$annotations", "()V", "getFactorType", "getExpiresAtSeconds$annotations", "expiresAt", "Lkotlin/time/Instant;", "getExpiresAt", "()Lkotlin/time/Instant;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class MfaChallenge {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long expiresAtSeconds;
    private final String factorType;
    private final String id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/mfa/MfaChallenge$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/mfa/MfaChallenge;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return MfaChallenge$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MfaChallenge(int i7, String str, String str2, long j7, o0 o0Var) {
        if (3 != (i7 & 3)) {
            AbstractC0632e0.j(i7, 3, MfaChallenge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.factorType = str2;
        if ((i7 & 4) == 0) {
            this.expiresAtSeconds = 0L;
        } else {
            this.expiresAtSeconds = j7;
        }
    }

    public static /* synthetic */ MfaChallenge copy$default(MfaChallenge mfaChallenge, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = mfaChallenge.id;
        }
        if ((i7 & 2) != 0) {
            str2 = mfaChallenge.factorType;
        }
        return mfaChallenge.copy(str, str2);
    }

    @h("expires_at")
    private static /* synthetic */ void getExpiresAtSeconds$annotations() {
    }

    @h(LinkHeader.Parameters.Type)
    public static /* synthetic */ void getFactorType$annotations() {
    }

    public static final /* synthetic */ void write$Self$auth_kt_release(MfaChallenge mfaChallenge, b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, mfaChallenge.id);
        bVar.E(serialDescriptor, 1, mfaChallenge.factorType);
        if (!bVar.z(serialDescriptor) && mfaChallenge.expiresAtSeconds == 0) {
            return;
        }
        bVar.x(serialDescriptor, 2, mfaChallenge.expiresAtSeconds);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFactorType() {
        return this.factorType;
    }

    public final MfaChallenge copy(String id, String factorType) {
        l.f("id", id);
        l.f("factorType", factorType);
        return new MfaChallenge(id, factorType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MfaChallenge)) {
            return false;
        }
        MfaChallenge mfaChallenge = (MfaChallenge) other;
        return l.a(this.id, mfaChallenge.id) && l.a(this.factorType, mfaChallenge.factorType);
    }

    public final d getExpiresAt() {
        d dVar = d.f249m;
        return g.h(this.expiresAtSeconds, 0L);
    }

    public final String getFactorType() {
        return this.factorType;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.factorType.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MfaChallenge(id=");
        sb.append(this.id);
        sb.append(", factorType=");
        return A6.b.j(sb, this.factorType, ')');
    }

    public MfaChallenge(String str, String str2) {
        l.f("id", str);
        l.f("factorType", str2);
        this.id = str;
        this.factorType = str2;
    }
}
