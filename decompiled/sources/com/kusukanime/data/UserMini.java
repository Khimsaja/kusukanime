package com.kusukanime.data;

import V5.i;
import Z5.o0;
import Z5.t0;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\bHÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006!"}, d2 = {"Lcom/kusukanime/data/UserMini;", "", ContentDisposition.Parameters.Name, "", "avatar_url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getAvatar_url", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class UserMini {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String avatar_url;
    private final String name;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/UserMini$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/UserMini;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UserMini$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserMini() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (f) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ UserMini copy$default(UserMini userMini, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = userMini.name;
        }
        if ((i7 & 2) != 0) {
            str2 = userMini.avatar_url;
        }
        return userMini.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app_release(UserMini userMini, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(userMini.name, "")) {
            bVar.E(serialDescriptor, 0, userMini.name);
        }
        if (!bVar.z(serialDescriptor) && userMini.avatar_url == null) {
            return;
        }
        bVar.F(serialDescriptor, 1, t0.a, userMini.avatar_url);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final UserMini copy(String name, String avatar_url) {
        l.f(ContentDisposition.Parameters.Name, name);
        return new UserMini(name, avatar_url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMini)) {
            return false;
        }
        UserMini userMini = (UserMini) other;
        return l.a(this.name, userMini.name) && l.a(this.avatar_url, userMini.avatar_url);
    }

    public final String getAvatar_url() {
        return this.avatar_url;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.avatar_url;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "UserMini(name=" + this.name + ", avatar_url=" + this.avatar_url + ")";
    }

    public /* synthetic */ UserMini(int i7, String str, String str2, o0 o0Var) {
        this.name = (i7 & 1) == 0 ? "" : str;
        if ((i7 & 2) == 0) {
            this.avatar_url = null;
        } else {
            this.avatar_url = str2;
        }
    }

    public UserMini(String str, String str2) {
        l.f(ContentDisposition.Parameters.Name, str);
        this.name = str;
        this.avatar_url = str2;
    }

    public /* synthetic */ UserMini(String str, String str2, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : str2);
    }
}
