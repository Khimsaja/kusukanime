package io.github.jan.supabase.storage;

import V5.i;
import Z5.AbstractC0632e0;
import Z5.o0;
import io.ktor.http.ContentType;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006%"}, d2 = {"Lio/github/jan/supabase/storage/StorageErrorResponse;", "", "statusCode", "", "error", "", ContentType.Message.TYPE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getStatusCode", "()I", "getError", "()Ljava/lang/String;", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class StorageErrorResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String message;
    private final int statusCode;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/StorageErrorResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/StorageErrorResponse;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return StorageErrorResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ StorageErrorResponse(int i7, int i8, String str, String str2, o0 o0Var) {
        if (7 != (i7 & 7)) {
            AbstractC0632e0.j(i7, 7, StorageErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.statusCode = i8;
        this.error = str;
        this.message = str2;
    }

    public static /* synthetic */ StorageErrorResponse copy$default(StorageErrorResponse storageErrorResponse, int i7, String str, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = storageErrorResponse.statusCode;
        }
        if ((i8 & 2) != 0) {
            str = storageErrorResponse.error;
        }
        if ((i8 & 4) != 0) {
            str2 = storageErrorResponse.message;
        }
        return storageErrorResponse.copy(i7, str, str2);
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(StorageErrorResponse storageErrorResponse, Y5.b bVar, SerialDescriptor serialDescriptor) {
        bVar.q(0, storageErrorResponse.statusCode, serialDescriptor);
        bVar.E(serialDescriptor, 1, storageErrorResponse.error);
        bVar.E(serialDescriptor, 2, storageErrorResponse.message);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final StorageErrorResponse copy(int statusCode, String error, String message) {
        l.f("error", error);
        l.f(ContentType.Message.TYPE, message);
        return new StorageErrorResponse(statusCode, error, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorageErrorResponse)) {
            return false;
        }
        StorageErrorResponse storageErrorResponse = (StorageErrorResponse) other;
        return this.statusCode == storageErrorResponse.statusCode && l.a(this.error, storageErrorResponse.error) && l.a(this.message, storageErrorResponse.message);
    }

    public final String getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return this.message.hashCode() + A6.b.b(this.error, Integer.hashCode(this.statusCode) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StorageErrorResponse(statusCode=");
        sb.append(this.statusCode);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", message=");
        return A6.b.j(sb, this.message, ')');
    }

    public StorageErrorResponse(int i7, String str, String str2) {
        l.f("error", str);
        l.f(ContentType.Message.TYPE, str2);
        this.statusCode = i7;
        this.error = str;
        this.message = str2;
    }
}
