package io.github.jan.supabase.postgrest;

import V5.i;
import Z5.AbstractC0632e0;
import Z5.o0;
import Z5.t0;
import a6.m;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002'(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J%\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006)"}, d2 = {"Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;", "", ContentType.Message.TYPE, "", "hint", "details", "Lkotlinx/serialization/json/JsonElement;", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMessage", "()Ljava/lang/String;", "getHint", "getDetails", "()Lkotlinx/serialization/json/JsonElement;", "getCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$postgrest_kt_release", "$serializer", "Companion", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class PostgrestErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final b details;
    private final String hint;
    private final String message;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/postgrest/PostgrestErrorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/postgrest/PostgrestErrorResponse;", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return PostgrestErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PostgrestErrorResponse(int i7, String str, String str2, b bVar, String str3, o0 o0Var) {
        if (1 != (i7 & 1)) {
            AbstractC0632e0.j(i7, 1, PostgrestErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.message = str;
        if ((i7 & 2) == 0) {
            this.hint = null;
        } else {
            this.hint = str2;
        }
        if ((i7 & 4) == 0) {
            this.details = null;
        } else {
            this.details = bVar;
        }
        if ((i7 & 8) == 0) {
            this.code = null;
        } else {
            this.code = str3;
        }
    }

    public static /* synthetic */ PostgrestErrorResponse copy$default(PostgrestErrorResponse postgrestErrorResponse, String str, String str2, b bVar, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = postgrestErrorResponse.message;
        }
        if ((i7 & 2) != 0) {
            str2 = postgrestErrorResponse.hint;
        }
        if ((i7 & 4) != 0) {
            bVar = postgrestErrorResponse.details;
        }
        if ((i7 & 8) != 0) {
            str3 = postgrestErrorResponse.code;
        }
        return postgrestErrorResponse.copy(str, str2, bVar, str3);
    }

    public static final /* synthetic */ void write$Self$postgrest_kt_release(PostgrestErrorResponse postgrestErrorResponse, Y5.b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, postgrestErrorResponse.message);
        if (bVar.z(serialDescriptor) || postgrestErrorResponse.hint != null) {
            bVar.F(serialDescriptor, 1, t0.a, postgrestErrorResponse.hint);
        }
        if (bVar.z(serialDescriptor) || postgrestErrorResponse.details != null) {
            bVar.F(serialDescriptor, 2, m.a, postgrestErrorResponse.details);
        }
        if (!bVar.z(serialDescriptor) && postgrestErrorResponse.code == null) {
            return;
        }
        bVar.F(serialDescriptor, 3, t0.a, postgrestErrorResponse.code);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* renamed from: component3, reason: from getter */
    public final b getDetails() {
        return this.details;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final PostgrestErrorResponse copy(String str, String str2, b bVar, String str3) {
        l.f(ContentType.Message.TYPE, str);
        return new PostgrestErrorResponse(str, str2, bVar, str3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostgrestErrorResponse)) {
            return false;
        }
        PostgrestErrorResponse postgrestErrorResponse = (PostgrestErrorResponse) other;
        return l.a(this.message, postgrestErrorResponse.message) && l.a(this.hint, postgrestErrorResponse.hint) && l.a(this.details, postgrestErrorResponse.details) && l.a(this.code, postgrestErrorResponse.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final b getDetails() {
        return this.details;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        String str = this.hint;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.details;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str2 = this.code;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PostgrestErrorResponse(message=");
        sb.append(this.message);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", details=");
        sb.append(this.details);
        sb.append(", code=");
        return A6.b.j(sb, this.code, ')');
    }

    public PostgrestErrorResponse(String str, String str2, b bVar, String str3) {
        l.f(ContentType.Message.TYPE, str);
        this.message = str;
        this.hint = str2;
        this.details = bVar;
        this.code = str3;
    }

    public /* synthetic */ PostgrestErrorResponse(String str, String str2, b bVar, String str3, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? null : bVar, (i7 & 8) != 0 ? null : str3);
    }
}
