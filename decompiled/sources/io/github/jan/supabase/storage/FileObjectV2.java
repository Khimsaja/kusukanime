package io.github.jan.supabase.storage;

import V5.i;
import Z5.AbstractC0632e0;
import Z5.K;
import Z5.o0;
import Z5.t0;
import a6.x;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.serializer.KotlinXSerializer;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002^_B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0015\u0010\u001bJ\u0018\u0010>\u001a\u0004\u0018\u0001H?\"\u0006\b\u0000\u0010?\u0018\u0001H\u0086\b¢\u0006\u0002\u0010@J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010F\u001a\u00020\bHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010I\u001a\u00020\u000eHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000e\u0010N\u001a\u00020\u0014HÀ\u0003¢\u0006\u0002\bOJ¥\u0001\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0014HÆ\u0001J\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0018HÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001J%\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\H\u0001¢\u0006\u0002\b]R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001dR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010!\u001a\u0004\b$\u0010%R\u001c\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010!\u001a\u0004\b'\u0010%R\u001e\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010!\u001a\u0004\b)\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010!\u001a\u0004\b/\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001dR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010!\u001a\u0004\b2\u0010%R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010!\u001a\u0004\b4\u0010\u001dR\u001c\u0010\u0013\u001a\u00020\u00148\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010!\u001a\u0004\b6\u00107R\u001b\u00108\u001a\u0002098FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b:\u0010;¨\u0006`"}, d2 = {"Lio/github/jan/supabase/storage/FileObjectV2;", "", ContentDisposition.Parameters.Name, "", "id", "version", "bucketId", "updatedAt", "Lkotlin/time/Instant;", "createdAt", "lastAccessedAt", "metadata", "Lkotlinx/serialization/json/JsonObject;", ContentDisposition.Parameters.Size, "", "rawContentType", "etag", "lastModified", "cacheControl", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Ljava/lang/String;Lio/github/jan/supabase/SupabaseSerializer;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlin/time/Instant;Lkotlinx/serialization/json/JsonObject;JLjava/lang/String;Ljava/lang/String;Lkotlin/time/Instant;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getId", "getVersion", "getBucketId$annotations", "()V", "getBucketId", "getUpdatedAt$annotations", "getUpdatedAt", "()Lkotlin/time/Instant;", "getCreatedAt$annotations", "getCreatedAt", "getLastAccessedAt$annotations", "getLastAccessedAt", "getMetadata", "()Lkotlinx/serialization/json/JsonObject;", "getSize", "()J", "getRawContentType$annotations", "getRawContentType", "getEtag", "getLastModified$annotations", "getLastModified", "getCacheControl$annotations", "getCacheControl", "getSerializer$annotations", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "contentType$delegate", "Lkotlin/Lazy;", "decodeMetadata", "T", "()Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component14$storage_kt_release", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class FileObjectV2 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String bucketId;
    private final String cacheControl;
    private final O3.i contentType$delegate;
    private final A5.d createdAt;
    private final String etag;
    private final String id;
    private final A5.d lastAccessedAt;
    private final A5.d lastModified;
    private final kotlinx.serialization.json.c metadata;
    private final String name;
    private final String rawContentType;
    private final SupabaseSerializer serializer;
    private final long size;
    private final A5.d updatedAt;
    private final String version;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/FileObjectV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/FileObjectV2;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return FileObjectV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FileObjectV2(int i7, String str, String str2, String str3, String str4, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, long j7, String str5, String str6, A5.d dVar4, String str7, o0 o0Var) {
        a6.d dVar5 = null;
        Object[] objArr = 0;
        if (807 != (i7 & 807)) {
            AbstractC0632e0.j(i7, 807, FileObjectV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.id = str2;
        this.version = str3;
        if ((i7 & 8) == 0) {
            this.bucketId = null;
        } else {
            this.bucketId = str4;
        }
        if ((i7 & 16) == 0) {
            this.updatedAt = null;
        } else {
            this.updatedAt = dVar;
        }
        this.createdAt = dVar2;
        if ((i7 & 64) == 0) {
            this.lastAccessedAt = null;
        } else {
            this.lastAccessedAt = dVar3;
        }
        if ((i7 & 128) == 0) {
            this.metadata = null;
        } else {
            this.metadata = cVar;
        }
        this.size = j7;
        this.rawContentType = str5;
        if ((i7 & 1024) == 0) {
            this.etag = null;
        } else {
            this.etag = str6;
        }
        if ((i7 & 2048) == 0) {
            this.lastModified = null;
        } else {
            this.lastModified = dVar4;
        }
        if ((i7 & 4096) == 0) {
            this.cacheControl = null;
        } else {
            this.cacheControl = str7;
        }
        this.serializer = new KotlinXSerializer(dVar5, 1, objArr == true ? 1 : 0);
        final int i8 = 0;
        this.contentType$delegate = z1.c.C(new InterfaceC0821a(this) { // from class: io.github.jan.supabase.storage.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ FileObjectV2 f12087l;

            {
                this.f12087l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return FileObjectV2._init_$lambda$0(this.f12087l);
                    default:
                        return FileObjectV2.contentType_delegate$lambda$0(this.f12087l);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentType _init_$lambda$0(FileObjectV2 fileObjectV2) {
        return ContentType.INSTANCE.parse(fileObjectV2.rawContentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentType contentType_delegate$lambda$0(FileObjectV2 fileObjectV2) {
        return ContentType.INSTANCE.parse(fileObjectV2.rawContentType);
    }

    @V5.h("bucket_id")
    public static /* synthetic */ void getBucketId$annotations() {
    }

    @V5.h("cache_control")
    public static /* synthetic */ void getCacheControl$annotations() {
    }

    @V5.h("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @V5.h("last_accessed_at")
    public static /* synthetic */ void getLastAccessedAt$annotations() {
    }

    @V5.h("last_modified")
    public static /* synthetic */ void getLastModified$annotations() {
    }

    @V5.h("content_type")
    public static /* synthetic */ void getRawContentType$annotations() {
    }

    public static /* synthetic */ void getSerializer$annotations() {
    }

    @V5.h("updated_at")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(FileObjectV2 fileObjectV2, Y5.b bVar, SerialDescriptor serialDescriptor) {
        bVar.E(serialDescriptor, 0, fileObjectV2.name);
        t0 t0Var = t0.a;
        bVar.F(serialDescriptor, 1, t0Var, fileObjectV2.id);
        bVar.E(serialDescriptor, 2, fileObjectV2.version);
        if (bVar.z(serialDescriptor) || fileObjectV2.bucketId != null) {
            bVar.F(serialDescriptor, 3, t0Var, fileObjectV2.bucketId);
        }
        if (bVar.z(serialDescriptor) || fileObjectV2.updatedAt != null) {
            bVar.F(serialDescriptor, 4, K.a, fileObjectV2.updatedAt);
        }
        K k7 = K.a;
        bVar.j(serialDescriptor, 5, k7, fileObjectV2.createdAt);
        if (bVar.z(serialDescriptor) || fileObjectV2.lastAccessedAt != null) {
            bVar.F(serialDescriptor, 6, k7, fileObjectV2.lastAccessedAt);
        }
        if (bVar.z(serialDescriptor) || fileObjectV2.metadata != null) {
            bVar.F(serialDescriptor, 7, x.a, fileObjectV2.metadata);
        }
        bVar.x(serialDescriptor, 8, fileObjectV2.size);
        bVar.E(serialDescriptor, 9, fileObjectV2.rawContentType);
        if (bVar.z(serialDescriptor) || fileObjectV2.etag != null) {
            bVar.F(serialDescriptor, 10, t0Var, fileObjectV2.etag);
        }
        if (bVar.z(serialDescriptor) || fileObjectV2.lastModified != null) {
            bVar.F(serialDescriptor, 11, k7, fileObjectV2.lastModified);
        }
        if (!bVar.z(serialDescriptor) && fileObjectV2.cacheControl == null) {
            return;
        }
        bVar.F(serialDescriptor, 12, t0Var, fileObjectV2.cacheControl);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRawContentType() {
        return this.rawContentType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEtag() {
        return this.etag;
    }

    /* renamed from: component12, reason: from getter */
    public final A5.d getLastModified() {
        return this.lastModified;
    }

    /* renamed from: component13, reason: from getter */
    public final String getCacheControl() {
        return this.cacheControl;
    }

    /* renamed from: component14$storage_kt_release, reason: from getter */
    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBucketId() {
        return this.bucketId;
    }

    /* renamed from: component5, reason: from getter */
    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component7, reason: from getter */
    public final A5.d getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    /* renamed from: component8, reason: from getter */
    public final kotlinx.serialization.json.c getMetadata() {
        return this.metadata;
    }

    /* renamed from: component9, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final FileObjectV2 copy(String str, String str2, String str3, String str4, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, long j7, String str5, String str6, A5.d dVar4, String str7, SupabaseSerializer supabaseSerializer) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("version", str3);
        l.f("createdAt", dVar2);
        l.f("rawContentType", str5);
        l.f("serializer", supabaseSerializer);
        return new FileObjectV2(str, str2, str3, str4, dVar, dVar2, dVar3, cVar, j7, str5, str6, dVar4, str7, supabaseSerializer);
    }

    public final <T> T decodeMetadata() {
        kotlinx.serialization.json.c metadata = getMetadata();
        if (metadata == null) {
            return null;
        }
        getSerializer();
        metadata.toString();
        l.k();
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileObjectV2)) {
            return false;
        }
        FileObjectV2 fileObjectV2 = (FileObjectV2) other;
        return l.a(this.name, fileObjectV2.name) && l.a(this.id, fileObjectV2.id) && l.a(this.version, fileObjectV2.version) && l.a(this.bucketId, fileObjectV2.bucketId) && l.a(this.updatedAt, fileObjectV2.updatedAt) && l.a(this.createdAt, fileObjectV2.createdAt) && l.a(this.lastAccessedAt, fileObjectV2.lastAccessedAt) && l.a(this.metadata, fileObjectV2.metadata) && this.size == fileObjectV2.size && l.a(this.rawContentType, fileObjectV2.rawContentType) && l.a(this.etag, fileObjectV2.etag) && l.a(this.lastModified, fileObjectV2.lastModified) && l.a(this.cacheControl, fileObjectV2.cacheControl) && l.a(this.serializer, fileObjectV2.serializer);
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    public final String getCacheControl() {
        return this.cacheControl;
    }

    public final ContentType getContentType() {
        return (ContentType) this.contentType$delegate.getValue();
    }

    public final A5.d getCreatedAt() {
        return this.createdAt;
    }

    public final String getEtag() {
        return this.etag;
    }

    public final String getId() {
        return this.id;
    }

    public final A5.d getLastAccessedAt() {
        return this.lastAccessedAt;
    }

    public final A5.d getLastModified() {
        return this.lastModified;
    }

    public final kotlinx.serialization.json.c getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRawContentType() {
        return this.rawContentType;
    }

    public final SupabaseSerializer getSerializer() {
        return this.serializer;
    }

    public final long getSize() {
        return this.size;
    }

    public final A5.d getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.id;
        int iB = A6.b.b(this.version, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.bucketId;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        A5.d dVar = this.updatedAt;
        int iHashCode3 = (this.createdAt.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        A5.d dVar2 = this.lastAccessedAt;
        int iHashCode4 = (iHashCode3 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        kotlinx.serialization.json.c cVar = this.metadata;
        int iB2 = A6.b.b(this.rawContentType, AbstractC0703b.c((iHashCode4 + (cVar == null ? 0 : cVar.f12722k.hashCode())) * 31, 31, this.size), 31);
        String str3 = this.etag;
        int iHashCode5 = (iB2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        A5.d dVar3 = this.lastModified;
        int iHashCode6 = (iHashCode5 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        String str4 = this.cacheControl;
        return this.serializer.hashCode() + ((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "FileObjectV2(name=" + this.name + ", id=" + this.id + ", version=" + this.version + ", bucketId=" + this.bucketId + ", updatedAt=" + this.updatedAt + ", createdAt=" + this.createdAt + ", lastAccessedAt=" + this.lastAccessedAt + ", metadata=" + this.metadata + ", size=" + this.size + ", rawContentType=" + this.rawContentType + ", etag=" + this.etag + ", lastModified=" + this.lastModified + ", cacheControl=" + this.cacheControl + ", serializer=" + this.serializer + ')';
    }

    public FileObjectV2(String str, String str2, String str3, String str4, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, long j7, String str5, String str6, A5.d dVar4, String str7, SupabaseSerializer supabaseSerializer) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("version", str3);
        l.f("createdAt", dVar2);
        l.f("rawContentType", str5);
        l.f("serializer", supabaseSerializer);
        this.name = str;
        this.id = str2;
        this.version = str3;
        this.bucketId = str4;
        this.updatedAt = dVar;
        this.createdAt = dVar2;
        this.lastAccessedAt = dVar3;
        this.metadata = cVar;
        this.size = j7;
        this.rawContentType = str5;
        this.etag = str6;
        this.lastModified = dVar4;
        this.cacheControl = str7;
        this.serializer = supabaseSerializer;
        final int i7 = 1;
        this.contentType$delegate = z1.c.C(new InterfaceC0821a(this) { // from class: io.github.jan.supabase.storage.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ FileObjectV2 f12087l;

            {
                this.f12087l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return FileObjectV2._init_$lambda$0(this.f12087l);
                    default:
                        return FileObjectV2.contentType_delegate$lambda$0(this.f12087l);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FileObjectV2(String str, String str2, String str3, String str4, A5.d dVar, A5.d dVar2, A5.d dVar3, kotlinx.serialization.json.c cVar, long j7, String str5, String str6, A5.d dVar4, String str7, SupabaseSerializer supabaseSerializer, int i7, kotlin.jvm.internal.f fVar) {
        SupabaseSerializer kotlinXSerializer;
        a6.d dVar5 = null;
        Object[] objArr = 0;
        String str8 = (i7 & 8) != 0 ? null : str4;
        A5.d dVar6 = (i7 & 16) != 0 ? null : dVar;
        A5.d dVar7 = (i7 & 64) != 0 ? null : dVar3;
        kotlinx.serialization.json.c cVar2 = (i7 & 128) != 0 ? null : cVar;
        String str9 = (i7 & 1024) != 0 ? null : str6;
        A5.d dVar8 = (i7 & 2048) != 0 ? null : dVar4;
        String str10 = (i7 & 4096) != 0 ? null : str7;
        if ((i7 & 8192) != 0) {
            kotlinXSerializer = new KotlinXSerializer(dVar5, 1, objArr == true ? 1 : 0);
        } else {
            kotlinXSerializer = supabaseSerializer;
        }
        this(str, str2, str3, str8, dVar6, dVar2, dVar7, cVar2, j7, str5, str9, dVar8, str10, kotlinXSerializer);
    }
}
