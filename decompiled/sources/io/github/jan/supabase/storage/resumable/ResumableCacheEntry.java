package io.github.jan.supabase.storage.resumable;

import A5.d;
import V5.i;
import Y5.b;
import Z5.AbstractC0632e0;
import Z5.K;
import Z5.o0;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JE\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000eHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J%\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0001¢\u0006\u0002\b-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013¨\u00060"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "", "url", "", "path", "bucketId", "expiresAt", "Lkotlin/time/Instant;", "upsert", "", "contentType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;ZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getUrl", "()Ljava/lang/String;", "getPath", "getBucketId", "getExpiresAt", "()Lkotlin/time/Instant;", "getUpsert", "()Z", "getContentType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class ResumableCacheEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bucketId;
    private final String contentType;
    private final d expiresAt;
    private final String path;
    private final boolean upsert;
    private final String url;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return ResumableCacheEntry$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ResumableCacheEntry(int i7, String str, String str2, String str3, d dVar, boolean z7, String str4, o0 o0Var) {
        if (15 != (i7 & 15)) {
            AbstractC0632e0.j(i7, 15, ResumableCacheEntry$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.url = str;
        this.path = str2;
        this.bucketId = str3;
        this.expiresAt = dVar;
        if ((i7 & 16) == 0) {
            this.upsert = false;
        } else {
            this.upsert = z7;
        }
        if ((i7 & 32) == 0) {
            this.contentType = "application/octet-stream";
        } else {
            this.contentType = str4;
        }
    }

    public static /* synthetic */ ResumableCacheEntry copy$default(ResumableCacheEntry resumableCacheEntry, String str, String str2, String str3, d dVar, boolean z7, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = resumableCacheEntry.url;
        }
        if ((i7 & 2) != 0) {
            str2 = resumableCacheEntry.path;
        }
        if ((i7 & 4) != 0) {
            str3 = resumableCacheEntry.bucketId;
        }
        if ((i7 & 8) != 0) {
            dVar = resumableCacheEntry.expiresAt;
        }
        if ((i7 & 16) != 0) {
            z7 = resumableCacheEntry.upsert;
        }
        if ((i7 & 32) != 0) {
            str4 = resumableCacheEntry.contentType;
        }
        boolean z8 = z7;
        String str5 = str4;
        return resumableCacheEntry.copy(str, str2, str3, dVar, z8, str5);
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(ResumableCacheEntry resumableCacheEntry, b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, resumableCacheEntry.url);
        bVar.E(serialDescriptor, 1, resumableCacheEntry.path);
        bVar.E(serialDescriptor, 2, resumableCacheEntry.bucketId);
        bVar.j(serialDescriptor, 3, K.a, resumableCacheEntry.expiresAt);
        if (bVar.z(serialDescriptor) || resumableCacheEntry.upsert) {
            bVar.A(serialDescriptor, 4, resumableCacheEntry.upsert);
        }
        if (!bVar.z(serialDescriptor) && l.a(resumableCacheEntry.contentType, "application/octet-stream")) {
            return;
        }
        bVar.E(serialDescriptor, 5, resumableCacheEntry.contentType);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBucketId() {
        return this.bucketId;
    }

    /* renamed from: component4, reason: from getter */
    public final d getExpiresAt() {
        return this.expiresAt;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getUpsert() {
        return this.upsert;
    }

    /* renamed from: component6, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    public final ResumableCacheEntry copy(String str, String str2, String str3, d dVar, boolean z7, String str4) {
        l.f("url", str);
        l.f("path", str2);
        l.f("bucketId", str3);
        l.f("expiresAt", dVar);
        l.f("contentType", str4);
        return new ResumableCacheEntry(str, str2, str3, dVar, z7, str4);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumableCacheEntry)) {
            return false;
        }
        ResumableCacheEntry resumableCacheEntry = (ResumableCacheEntry) other;
        return l.a(this.url, resumableCacheEntry.url) && l.a(this.path, resumableCacheEntry.path) && l.a(this.bucketId, resumableCacheEntry.bucketId) && l.a(this.expiresAt, resumableCacheEntry.expiresAt) && this.upsert == resumableCacheEntry.upsert && l.a(this.contentType, resumableCacheEntry.contentType);
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final d getExpiresAt() {
        return this.expiresAt;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getUpsert() {
        return this.upsert;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.contentType.hashCode() + AbstractC0703b.d((this.expiresAt.hashCode() + A6.b.b(this.bucketId, A6.b.b(this.path, this.url.hashCode() * 31, 31), 31)) * 31, 31, this.upsert);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResumableCacheEntry(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", bucketId=");
        sb.append(this.bucketId);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", upsert=");
        sb.append(this.upsert);
        sb.append(", contentType=");
        return A6.b.j(sb, this.contentType, ')');
    }

    public ResumableCacheEntry(String str, String str2, String str3, d dVar, boolean z7, String str4) {
        l.f("url", str);
        l.f("path", str2);
        l.f("bucketId", str3);
        l.f("expiresAt", dVar);
        l.f("contentType", str4);
        this.url = str;
        this.path = str2;
        this.bucketId = str3;
        this.expiresAt = dVar;
        this.upsert = z7;
        this.contentType = str4;
    }

    public /* synthetic */ ResumableCacheEntry(String str, String str2, String str3, d dVar, boolean z7, String str4, int i7, f fVar) {
        this(str, str2, str3, dVar, (i7 & 16) != 0 ? false : z7, (i7 & 32) != 0 ? "application/octet-stream" : str4);
    }
}
