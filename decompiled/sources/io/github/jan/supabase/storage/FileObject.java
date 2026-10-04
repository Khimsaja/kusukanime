package io.github.jan.supabase.storage;

import V5.i;
import Z5.AbstractC0632e0;
import Z5.K;
import Z5.o0;
import Z5.t0;
import a6.x;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003JO\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000eHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lio/github/jan/supabase/storage/FileObject;", "", ContentDisposition.Parameters.Name, "", "id", "updatedAt", "Lkotlin/time/Instant;", "createdAt", "lastAccessedAt", "metadata", "Lkotlinx/serialization/json/JsonObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getId", "getUpdatedAt$annotations", "()V", "getUpdatedAt", "()Lkotlin/time/Instant;", "getCreatedAt$annotations", "getCreatedAt", "getLastAccessedAt$annotations", "getLastAccessedAt", "getMetadata", "()Lkotlinx/serialization/json/JsonObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class FileObject {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final A5.d createdAt;
    private final String id;
    private final A5.d lastAccessedAt;
    private final kotlinx.serialization.json.c metadata;
    private final String name;
    private final A5.d updatedAt;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/FileObject$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/FileObject;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return FileObject$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FileObject(int i7, String str, String str2, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, o0 o0Var) {
        if (63 != (i7 & 63)) {
            AbstractC0632e0.j(i7, 63, FileObject$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.id = str2;
        this.updatedAt = dVar;
        this.createdAt = dVar2;
        this.lastAccessedAt = dVar3;
        this.metadata = cVar;
    }

    public static /* synthetic */ FileObject copy$default(FileObject fileObject, String str, String str2, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = fileObject.name;
        }
        if ((i7 & 2) != 0) {
            str2 = fileObject.id;
        }
        if ((i7 & 4) != 0) {
            dVar = fileObject.updatedAt;
        }
        if ((i7 & 8) != 0) {
            dVar2 = fileObject.createdAt;
        }
        if ((i7 & 16) != 0) {
            dVar3 = fileObject.lastAccessedAt;
        }
        if ((i7 & 32) != 0) {
            cVar = fileObject.metadata;
        }
        A5.d dVar4 = dVar3;
        kotlinx.serialization.json.c cVar2 = cVar;
        return fileObject.copy(str, str2, dVar, dVar2, dVar4, cVar2);
    }

    @V5.h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @V5.h("last_accessed_at")
    public static /* synthetic */ void getLastAccessedAt$annotations() {
    }

    @V5.h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(FileObject fileObject, Y5.b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, fileObject.name);
        bVar.F(serialDescriptor, 1, t0.a, fileObject.id);
        K k7 = K.a;
        bVar.F(serialDescriptor, 2, k7, fileObject.updatedAt);
        bVar.F(serialDescriptor, 3, k7, fileObject.createdAt);
        bVar.F(serialDescriptor, 4, k7, fileObject.lastAccessedAt);
        bVar.F(serialDescriptor, 5, x.a, fileObject.metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component5, reason: from getter */
    public final A5.d getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final kotlinx.serialization.json.c getMetadata() {
        return this.metadata;
    }

    public final FileObject copy(String str, String str2, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        return new FileObject(str, str2, dVar, dVar2, dVar3, cVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileObject)) {
            return false;
        }
        FileObject fileObject = (FileObject) other;
        return l.a(this.name, fileObject.name) && l.a(this.id, fileObject.id) && l.a(this.updatedAt, fileObject.updatedAt) && l.a(this.createdAt, fileObject.createdAt) && l.a(this.lastAccessedAt, fileObject.lastAccessedAt) && l.a(this.metadata, fileObject.metadata);
    }

    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final A5.d getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    public final kotlinx.serialization.json.c getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        A5.d dVar = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        A5.d dVar2 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        A5.d dVar3 = this.lastAccessedAt;
        int iHashCode5 = (iHashCode4 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.metadata;
        return iHashCode5 + (cVar != null ? cVar.f12722k.hashCode() : 0);
    }

    public String toString() {
        return "FileObject(name=" + this.name + ", id=" + this.id + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", lastAccessedAt=" + this.lastAccessedAt + ", metadata=" + this.metadata + ')';
    }

    public FileObject(String str, String str2, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar) {
        l.f(ContentDisposition.Parameters.Name, str);
        this.name = str;
        this.id = str2;
        this.updatedAt = dVar;
        this.createdAt = dVar2;
        this.lastAccessedAt = dVar3;
        this.metadata = cVar;
    }
}
