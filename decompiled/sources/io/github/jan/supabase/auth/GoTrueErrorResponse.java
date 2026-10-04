package io.github.jan.supabase.auth;

import O3.C;
import O3.j;
import P3.m;
import V5.i;
import X5.g;
import Z5.AbstractC0632e0;
import Z5.C0629d;
import Z5.o0;
import Z5.t0;
import a6.C0673c;
import a6.k;
import io.github.jan.supabase.auth.exception.AuthWeakPasswordException;
import io.ktor.http.ContentType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "", "error", "", "description", "weakPassword", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;)V", "getError", "()Ljava/lang/String;", "getDescription", "getWeakPassword", "()Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "WeakPassword", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(with = Companion.class)
/* loaded from: classes.dex */
public final /* data */ class GoTrueErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final SerialDescriptor descriptor;
    private final String description;
    private final String error;
    private final WeakPassword weakPassword;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$Companion;", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/GoTrueErrorResponse;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "serializer", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements KSerializer {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        @Override // kotlinx.serialization.KSerializer
        public SerialDescriptor getDescriptor() {
            return GoTrueErrorResponse.descriptor;
        }

        public final KSerializer serializer() {
            return GoTrueErrorResponse.INSTANCE;
        }

        private Companion() {
        }

        @Override // kotlinx.serialization.KSerializer
        public GoTrueErrorResponse deserialize(Decoder decoder) {
            String strA;
            l.f("decoder", decoder);
            kotlinx.serialization.json.b bVarR = ((k) decoder).r();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) a6.l.e(bVarR).get("error_code");
            WeakPassword weakPassword = null;
            String strA2 = bVar != null ? a6.l.f(bVar).a() : null;
            kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) a6.l.e(bVarR).get("error_description");
            if (bVar2 == null || (strA = a6.l.f(bVar2).a()) == null) {
                kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) a6.l.e(bVarR).get("msg");
                if (bVar3 != null) {
                    strA = a6.l.f(bVar3).a();
                } else {
                    kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) a6.l.e(bVarR).get(ContentType.Message.TYPE);
                    strA = bVar4 != null ? a6.l.f(bVar4).a() : null;
                    if (strA == null) {
                        strA = bVarR.toString();
                    }
                }
            }
            if (a6.l.e(bVarR).containsKey(AuthWeakPasswordException.CODE)) {
                C0673c c0673c = a6.d.f10459d;
                Object obj = a6.l.e(bVarR).get(AuthWeakPasswordException.CODE);
                l.c(obj);
                c0673c.getClass();
                weakPassword = (WeakPassword) c0673c.a(WeakPassword.INSTANCE.serializer(), (kotlinx.serialization.json.b) obj);
            }
            return new GoTrueErrorResponse(strA2, strA, weakPassword);
        }

        @Override // kotlinx.serialization.KSerializer
        public void serialize(Encoder encoder, GoTrueErrorResponse value) {
            l.f("encoder", encoder);
            l.f("value", value);
            throw new UnsupportedOperationException();
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\bHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J%\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "", "reasons", "", "", "<init>", "(Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReasons", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$auth_kt_release", "$serializer", "Companion", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @i
    public static final /* data */ class WeakPassword {
        private final List<String> reasons;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final O3.i[] $childSerializers = {z1.c.B(j.f7525k, new e())};

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/auth/GoTrueErrorResponse$WeakPassword;", "auth-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final KSerializer serializer() {
                return GoTrueErrorResponse$WeakPassword$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public /* synthetic */ WeakPassword(int i7, List list, o0 o0Var) {
            if (1 == (i7 & 1)) {
                this.reasons = list;
            } else {
                AbstractC0632e0.j(i7, 1, GoTrueErrorResponse$WeakPassword$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new C0629d(t0.a, 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WeakPassword copy$default(WeakPassword weakPassword, List list, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                list = weakPassword.reasons;
            }
            return weakPassword.copy(list);
        }

        public final List<String> component1() {
            return this.reasons;
        }

        public final WeakPassword copy(List<String> reasons) {
            l.f("reasons", reasons);
            return new WeakPassword(reasons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WeakPassword) && l.a(this.reasons, ((WeakPassword) other).reasons);
        }

        public final List<String> getReasons() {
            return this.reasons;
        }

        public int hashCode() {
            return this.reasons.hashCode();
        }

        public String toString() {
            return "WeakPassword(reasons=" + this.reasons + ')';
        }

        public WeakPassword(List<String> list) {
            l.f("reasons", list);
            this.reasons = list;
        }
    }

    static {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (AbstractC2510o.g0("GoTrueErrorResponse")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        X5.a aVar = new X5.a("GoTrueErrorResponse");
        descriptor$lambda$0(aVar);
        descriptor = new g("GoTrueErrorResponse", X5.j.f9951h, aVar.f9920c.size(), m.u0(serialDescriptorArr), aVar);
    }

    public GoTrueErrorResponse(String str, String str2, WeakPassword weakPassword) {
        l.f("description", str2);
        this.error = str;
        this.description = str2;
        this.weakPassword = weakPassword;
    }

    public static /* synthetic */ GoTrueErrorResponse copy$default(GoTrueErrorResponse goTrueErrorResponse, String str, String str2, WeakPassword weakPassword, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = goTrueErrorResponse.error;
        }
        if ((i7 & 2) != 0) {
            str2 = goTrueErrorResponse.description;
        }
        if ((i7 & 4) != 0) {
            weakPassword = goTrueErrorResponse.weakPassword;
        }
        return goTrueErrorResponse.copy(str, str2, weakPassword);
    }

    private static final C descriptor$lambda$0(X5.a aVar) {
        l.f("$this$buildClassSerialDescriptor", aVar);
        aVar.a("error", t0.f10356b, (12 & 8) == 0);
        return C.a;
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final WeakPassword getWeakPassword() {
        return this.weakPassword;
    }

    public final GoTrueErrorResponse copy(String error, String description, WeakPassword weakPassword) {
        l.f("description", description);
        return new GoTrueErrorResponse(error, description, weakPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoTrueErrorResponse)) {
            return false;
        }
        GoTrueErrorResponse goTrueErrorResponse = (GoTrueErrorResponse) other;
        return l.a(this.error, goTrueErrorResponse.error) && l.a(this.description, goTrueErrorResponse.description) && l.a(this.weakPassword, goTrueErrorResponse.weakPassword);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getError() {
        return this.error;
    }

    public final WeakPassword getWeakPassword() {
        return this.weakPassword;
    }

    public int hashCode() {
        String str = this.error;
        int iB = A6.b.b(this.description, (str == null ? 0 : str.hashCode()) * 31, 31);
        WeakPassword weakPassword = this.weakPassword;
        return iB + (weakPassword != null ? weakPassword.hashCode() : 0);
    }

    public String toString() {
        return "GoTrueErrorResponse(error=" + this.error + ", description=" + this.description + ", weakPassword=" + this.weakPassword + ')';
    }

    public /* synthetic */ GoTrueErrorResponse(String str, String str2, WeakPassword weakPassword, int i7, f fVar) {
        this(str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? null : weakPassword);
    }
}
