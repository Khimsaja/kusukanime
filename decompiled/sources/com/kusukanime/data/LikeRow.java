package com.kusukanime.data;

import V5.i;
import Z5.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import v.c0;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002%&B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, d2 = {"Lcom/kusukanime/data/LikeRow;", "", "id", "", "user_id", "target_type", "target_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUser_id", "getTarget_type", "getTarget_id", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_release", "$serializer", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class LikeRow {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String id;
    private final String target_id;
    private final String target_type;
    private final String user_id;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/kusukanime/data/LikeRow$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/kusukanime/data/LikeRow;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return LikeRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LikeRow() {
        this((String) null, (String) null, (String) null, (String) null, 15, (f) null);
    }

    public static /* synthetic */ LikeRow copy$default(LikeRow likeRow, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = likeRow.id;
        }
        if ((i7 & 2) != 0) {
            str2 = likeRow.user_id;
        }
        if ((i7 & 4) != 0) {
            str3 = likeRow.target_type;
        }
        if ((i7 & 8) != 0) {
            str4 = likeRow.target_id;
        }
        return likeRow.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$app_release(LikeRow likeRow, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || !l.a(likeRow.id, "")) {
            bVar.E(serialDescriptor, 0, likeRow.id);
        }
        if (bVar.z(serialDescriptor) || !l.a(likeRow.user_id, "")) {
            bVar.E(serialDescriptor, 1, likeRow.user_id);
        }
        if (bVar.z(serialDescriptor) || !l.a(likeRow.target_type, "")) {
            bVar.E(serialDescriptor, 2, likeRow.target_type);
        }
        if (!bVar.z(serialDescriptor) && l.a(likeRow.target_id, "")) {
            return;
        }
        bVar.E(serialDescriptor, 3, likeRow.target_id);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUser_id() {
        return this.user_id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTarget_type() {
        return this.target_type;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTarget_id() {
        return this.target_id;
    }

    public final LikeRow copy(String id, String user_id, String target_type, String target_id) {
        l.f("id", id);
        l.f("user_id", user_id);
        l.f("target_type", target_type);
        l.f("target_id", target_id);
        return new LikeRow(id, user_id, target_type, target_id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LikeRow)) {
            return false;
        }
        LikeRow likeRow = (LikeRow) other;
        return l.a(this.id, likeRow.id) && l.a(this.user_id, likeRow.user_id) && l.a(this.target_type, likeRow.target_type) && l.a(this.target_id, likeRow.target_id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTarget_id() {
        return this.target_id;
    }

    public final String getTarget_type() {
        return this.target_type;
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public int hashCode() {
        return this.target_id.hashCode() + A6.b.b(this.target_type, A6.b.b(this.user_id, this.id.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.user_id;
        String str3 = this.target_type;
        String str4 = this.target_id;
        StringBuilder sbC = c0.c("LikeRow(id=", str, ", user_id=", str2, ", target_type=");
        sbC.append(str3);
        sbC.append(", target_id=");
        sbC.append(str4);
        sbC.append(")");
        return sbC.toString();
    }

    public /* synthetic */ LikeRow(int i7, String str, String str2, String str3, String str4, o0 o0Var) {
        if ((i7 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i7 & 2) == 0) {
            this.user_id = "";
        } else {
            this.user_id = str2;
        }
        if ((i7 & 4) == 0) {
            this.target_type = "";
        } else {
            this.target_type = str3;
        }
        if ((i7 & 8) == 0) {
            this.target_id = "";
        } else {
            this.target_id = str4;
        }
    }

    public LikeRow(String str, String str2, String str3, String str4) {
        l.f("id", str);
        l.f("user_id", str2);
        l.f("target_type", str3);
        l.f("target_id", str4);
        this.id = str;
        this.user_id = str2;
        this.target_type = str3;
        this.target_id = str4;
    }

    public /* synthetic */ LikeRow(String str, String str2, String str3, String str4, int i7, f fVar) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4);
    }
}
