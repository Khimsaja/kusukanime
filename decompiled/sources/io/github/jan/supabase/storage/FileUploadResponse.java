package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/FileUploadResponse;", "", "id", "", "path", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPath", "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FileUploadResponse {
    private final String id;
    private final String key;
    private final String path;

    public FileUploadResponse(String str, String str2, String str3) {
        l.f("path", str2);
        this.id = str;
        this.path = str2;
        this.key = str3;
    }

    public static /* synthetic */ FileUploadResponse copy$default(FileUploadResponse fileUploadResponse, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = fileUploadResponse.id;
        }
        if ((i7 & 2) != 0) {
            str2 = fileUploadResponse.path;
        }
        if ((i7 & 4) != 0) {
            str3 = fileUploadResponse.key;
        }
        return fileUploadResponse.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    public final FileUploadResponse copy(String id, String path, String key) {
        l.f("path", path);
        return new FileUploadResponse(id, path, key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileUploadResponse)) {
            return false;
        }
        FileUploadResponse fileUploadResponse = (FileUploadResponse) other;
        return l.a(this.id, fileUploadResponse.id) && l.a(this.path, fileUploadResponse.path) && l.a(this.key, fileUploadResponse.key);
    }

    public final String getId() {
        return this.id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.id;
        int iB = A6.b.b(this.path, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.key;
        return iB + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FileUploadResponse(id=");
        sb.append(this.id);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", key=");
        return A6.b.j(sb, this.key, ')');
    }

    public /* synthetic */ FileUploadResponse(String str, String str2, String str3, int i7, kotlin.jvm.internal.f fVar) {
        this((i7 & 1) != 0 ? null : str, str2, (i7 & 4) != 0 ? null : str3);
    }
}
