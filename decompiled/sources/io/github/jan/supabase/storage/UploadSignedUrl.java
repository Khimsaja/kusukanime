package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lio/github/jan/supabase/storage/UploadSignedUrl;", "", "url", "", "path", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getPath", "getToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UploadSignedUrl {
    private final String path;
    private final String token;
    private final String url;

    public UploadSignedUrl(String str, String str2, String str3) {
        l.f("url", str);
        l.f("path", str2);
        l.f("token", str3);
        this.url = str;
        this.path = str2;
        this.token = str3;
    }

    public static /* synthetic */ UploadSignedUrl copy$default(UploadSignedUrl uploadSignedUrl, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = uploadSignedUrl.url;
        }
        if ((i7 & 2) != 0) {
            str2 = uploadSignedUrl.path;
        }
        if ((i7 & 4) != 0) {
            str3 = uploadSignedUrl.token;
        }
        return uploadSignedUrl.copy(str, str2, str3);
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
    public final String getToken() {
        return this.token;
    }

    public final UploadSignedUrl copy(String url, String path, String token) {
        l.f("url", url);
        l.f("path", path);
        l.f("token", token);
        return new UploadSignedUrl(url, path, token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadSignedUrl)) {
            return false;
        }
        UploadSignedUrl uploadSignedUrl = (UploadSignedUrl) other;
        return l.a(this.url, uploadSignedUrl.url) && l.a(this.path, uploadSignedUrl.path) && l.a(this.token, uploadSignedUrl.token);
    }

    public final String getPath() {
        return this.path;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.token.hashCode() + A6.b.b(this.path, this.url.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UploadSignedUrl(url=");
        sb.append(this.url);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", token=");
        return A6.b.j(sb, this.token, ')');
    }
}
