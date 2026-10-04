package io.github.jan.supabase.storage;

import O3.j;
import V5.i;
import Z5.AbstractC0632e0;
import Z5.C0629d;
import Z5.K;
import Z5.T;
import Z5.o0;
import Z5.t0;
import b1.AbstractC0703b;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002BCBU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bo\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000f\u0010\u0015J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010*Jh\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0012HÖ\u0001J\t\u00109\u001a\u00020\u0005HÖ\u0001J%\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001¢\u0006\u0002\bAR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u001cR\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010+\u0012\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*¨\u0006D"}, d2 = {"Lio/github/jan/supabase/storage/Bucket;", "", "createdAt", "Lkotlin/time/Instant;", "id", "", ContentDisposition.Parameters.Name, "owner", "updatedAt", CacheControl.PUBLIC, "", "allowedMimeTypes", "", "fileSizeLimit", "", "<init>", "(Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;ZLjava/util/List;Ljava/lang/Long;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;ZLjava/util/List;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCreatedAt$annotations", "()V", "getCreatedAt", "()Lkotlin/time/Instant;", "getId$annotations", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "getOwner$annotations", "getOwner", "getUpdatedAt$annotations", "getUpdatedAt", "getPublic", "()Z", "getAllowedMimeTypes$annotations", "getAllowedMimeTypes", "()Ljava/util/List;", "getFileSizeLimit$annotations", "getFileSizeLimit", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lkotlin/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;ZLjava/util/List;Ljava/lang/Long;)Lio/github/jan/supabase/storage/Bucket;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class Bucket {
    private final List<String> allowedMimeTypes;
    private final A5.d createdAt;
    private final Long fileSizeLimit;
    private final String id;
    private final String name;
    private final String owner;
    private final boolean public;
    private final A5.d updatedAt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final O3.i[] $childSerializers = {null, null, null, null, null, null, z1.c.B(j.f7525k, new J3.a(12)), null};

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/Bucket$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/Bucket;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return Bucket$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Bucket(int i7, A5.d dVar, String str, String str2, String str3, A5.d dVar2, boolean z7, List list, Long l7, o0 o0Var) {
        if (63 != (i7 & 63)) {
            AbstractC0632e0.j(i7, 63, Bucket$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.createdAt = dVar;
        this.id = str;
        this.name = str2;
        this.owner = str3;
        this.updatedAt = dVar2;
        this.public = z7;
        if ((i7 & 64) == 0) {
            this.allowedMimeTypes = null;
        } else {
            this.allowedMimeTypes = list;
        }
        if ((i7 & 128) == 0) {
            this.fileSizeLimit = null;
        } else {
            this.fileSizeLimit = l7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new C0629d(t0.a, 0);
    }

    public static /* synthetic */ Bucket copy$default(Bucket bucket, A5.d dVar, String str, String str2, String str3, A5.d dVar2, boolean z7, List list, Long l7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            dVar = bucket.createdAt;
        }
        if ((i7 & 2) != 0) {
            str = bucket.id;
        }
        if ((i7 & 4) != 0) {
            str2 = bucket.name;
        }
        if ((i7 & 8) != 0) {
            str3 = bucket.owner;
        }
        if ((i7 & 16) != 0) {
            dVar2 = bucket.updatedAt;
        }
        if ((i7 & 32) != 0) {
            z7 = bucket.public;
        }
        if ((i7 & 64) != 0) {
            list = bucket.allowedMimeTypes;
        }
        if ((i7 & 128) != 0) {
            l7 = bucket.fileSizeLimit;
        }
        List list2 = list;
        Long l8 = l7;
        A5.d dVar3 = dVar2;
        boolean z8 = z7;
        return bucket.copy(dVar, str, str2, str3, dVar3, z8, list2, l8);
    }

    @V5.h("allowed_mime_types")
    public static /* synthetic */ void getAllowedMimeTypes$annotations() {
    }

    @V5.h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @V5.h("file_size_limit")
    public static /* synthetic */ void getFileSizeLimit$annotations() {
    }

    @V5.h("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @V5.h(ContentDisposition.Parameters.Name)
    public static /* synthetic */ void getName$annotations() {
    }

    @V5.h("owner")
    public static /* synthetic */ void getOwner$annotations() {
    }

    @V5.h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(Bucket bucket, Y5.b bVar, SerialDescriptor serialDescriptor) {
        O3.i[] iVarArr = $childSerializers;
        K k7 = K.a;
        bVar.j(serialDescriptor, 0, k7, bucket.createdAt);
        bVar.E(serialDescriptor, 1, bucket.id);
        bVar.E(serialDescriptor, 2, bucket.name);
        bVar.E(serialDescriptor, 3, bucket.owner);
        bVar.j(serialDescriptor, 4, k7, bucket.updatedAt);
        bVar.A(serialDescriptor, 5, bucket.public);
        if (bVar.z(serialDescriptor) || bucket.allowedMimeTypes != null) {
            bVar.F(serialDescriptor, 6, (KSerializer) iVarArr[6].getValue(), bucket.allowedMimeTypes);
        }
        if (!bVar.z(serialDescriptor) && bucket.fileSizeLimit == null) {
            return;
        }
        bVar.F(serialDescriptor, 7, T.a, bucket.fileSizeLimit);
    }

    /* renamed from: component1, reason: from getter */
    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* renamed from: component5, reason: from getter */
    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getPublic() {
        return this.public;
    }

    public final List<String> component7() {
        return this.allowedMimeTypes;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public final Bucket copy(A5.d dVar, String str, String str2, String str3, A5.d dVar2, boolean z7, List<String> list, Long l7) {
        l.f("createdAt", dVar);
        l.f("id", str);
        l.f(ContentDisposition.Parameters.Name, str2);
        l.f("owner", str3);
        l.f("updatedAt", dVar2);
        return new Bucket(dVar, str, str2, str3, dVar2, z7, list, l7);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bucket)) {
            return false;
        }
        Bucket bucket = (Bucket) other;
        return l.a(this.createdAt, bucket.createdAt) && l.a(this.id, bucket.id) && l.a(this.name, bucket.name) && l.a(this.owner, bucket.owner) && l.a(this.updatedAt, bucket.updatedAt) && this.public == bucket.public && l.a(this.allowedMimeTypes, bucket.allowedMimeTypes) && l.a(this.fileSizeLimit, bucket.fileSizeLimit);
    }

    public final List<String> getAllowedMimeTypes() {
        return this.allowedMimeTypes;
    }

    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    public final Long getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwner() {
        return this.owner;
    }

    public final boolean getPublic() {
        return this.public;
    }

    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iD = AbstractC0703b.d((this.updatedAt.hashCode() + A6.b.b(this.owner, A6.b.b(this.name, A6.b.b(this.id, this.createdAt.hashCode() * 31, 31), 31), 31)) * 31, 31, this.public);
        List<String> list = this.allowedMimeTypes;
        int iHashCode = (iD + (list == null ? 0 : list.hashCode())) * 31;
        Long l7 = this.fileSizeLimit;
        return iHashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "Bucket(createdAt=" + this.createdAt + ", id=" + this.id + ", name=" + this.name + ", owner=" + this.owner + ", updatedAt=" + this.updatedAt + ", public=" + this.public + ", allowedMimeTypes=" + this.allowedMimeTypes + ", fileSizeLimit=" + this.fileSizeLimit + ')';
    }

    public Bucket(A5.d dVar, String str, String str2, String str3, A5.d dVar2, boolean z7, List<String> list, Long l7) {
        l.f("createdAt", dVar);
        l.f("id", str);
        l.f(ContentDisposition.Parameters.Name, str2);
        l.f("owner", str3);
        l.f("updatedAt", dVar2);
        this.createdAt = dVar;
        this.id = str;
        this.name = str2;
        this.owner = str3;
        this.updatedAt = dVar2;
        this.public = z7;
        this.allowedMimeTypes = list;
        this.fileSizeLimit = l7;
    }

    public /* synthetic */ Bucket(A5.d dVar, String str, String str2, String str3, A5.d dVar2, boolean z7, List list, Long l7, int i7, kotlin.jvm.internal.f fVar) {
        this(dVar, str, str2, str3, dVar2, z7, (i7 & 64) != 0 ? null : list, (i7 & 128) != 0 ? null : l7);
    }
}
