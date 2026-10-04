package io.github.jan.supabase.storage;

import P3.m;
import P3.r;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u001b\"\u00020\u0014¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u0012\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u001b\u0010\u0012\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013H\u0007¢\u0006\u0002\b\u001eJ\u001f\u0010\u0012\u001a\u00020\u00192\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001b\"\u00020\u001d¢\u0006\u0002\u0010\u001fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010 \u001a\u00020\f*\u00020!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0015\u0010$\u001a\u00020\f*\u00020!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0015\u0010&\u001a\u00020\f*\u00020!8F¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0015\u0010(\u001a\u00020\f*\u00020!8F¢\u0006\u0006\u001a\u0004\b)\u0010#R\u0015\u0010 \u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b\"\u0010+R\u0015\u0010$\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b%\u0010+R\u0015\u0010&\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b'\u0010+R\u0015\u0010(\u001a\u00020\f*\u00020*8F¢\u0006\u0006\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lio/github/jan/supabase/storage/BucketBuilder;", "", "<init>", "()V", CacheControl.PUBLIC, "", "getPublic", "()Ljava/lang/Boolean;", "setPublic", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "fileSizeLimit", "Lio/github/jan/supabase/storage/FileSizeLimit;", "getFileSizeLimit-cccgrl4", "()Ljava/lang/String;", "setFileSizeLimit-saRlmmQ", "(Ljava/lang/String;)V", "Ljava/lang/String;", "allowedMimeTypes", "", "", "getAllowedMimeTypes$storage_kt_release", "()Ljava/util/List;", "setAllowedMimeTypes$storage_kt_release", "(Ljava/util/List;)V", "", "mimeTypes", "", "([Ljava/lang/String;)V", "Lio/ktor/http/ContentType;", "allowedMimeTypesContentType", "([Lio/ktor/http/ContentType;)V", "bytes", "", "getBytes-ueSVNNQ", "(J)Ljava/lang/String;", "kilobytes", "getKilobytes-ueSVNNQ", "megabytes", "getMegabytes-ueSVNNQ", "gigabytes", "getGigabytes-ueSVNNQ", "", "(I)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketBuilder {
    private List<String> allowedMimeTypes;
    private String fileSizeLimit;
    private Boolean public;

    public final void allowedMimeTypes(String... mimeTypes) {
        l.f("mimeTypes", mimeTypes);
        this.allowedMimeTypes = m.u0(mimeTypes);
    }

    public final void allowedMimeTypesContentType(List<ContentType> mimeTypes) {
        l.f("mimeTypes", mimeTypes);
        ArrayList arrayList = new ArrayList(r.p(mimeTypes, 10));
        Iterator<T> it = mimeTypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((ContentType) it.next()).toString());
        }
        this.allowedMimeTypes = arrayList;
    }

    public final List<String> getAllowedMimeTypes$storage_kt_release() {
        return this.allowedMimeTypes;
    }

    /* renamed from: getBytes-ueSVNNQ, reason: not valid java name */
    public final String m43getBytesueSVNNQ(long j7) {
        StringBuilder sb = new StringBuilder();
        sb.append(j7);
        sb.append('b');
        return FileSizeLimit.m60constructorimpl(sb.toString());
    }

    /* renamed from: getFileSizeLimit-cccgrl4, reason: not valid java name and from getter */
    public final String getFileSizeLimit() {
        return this.fileSizeLimit;
    }

    /* renamed from: getGigabytes-ueSVNNQ, reason: not valid java name */
    public final String m46getGigabytesueSVNNQ(long j7) {
        return FileSizeLimit.m60constructorimpl(j7 + "gb");
    }

    /* renamed from: getKilobytes-ueSVNNQ, reason: not valid java name */
    public final String m48getKilobytesueSVNNQ(long j7) {
        return FileSizeLimit.m60constructorimpl(j7 + "kb");
    }

    /* renamed from: getMegabytes-ueSVNNQ, reason: not valid java name */
    public final String m50getMegabytesueSVNNQ(long j7) {
        return FileSizeLimit.m60constructorimpl(j7 + "mb");
    }

    public final Boolean getPublic() {
        return this.public;
    }

    public final void setAllowedMimeTypes$storage_kt_release(List<String> list) {
        this.allowedMimeTypes = list;
    }

    /* renamed from: setFileSizeLimit-saRlmmQ, reason: not valid java name */
    public final void m51setFileSizeLimitsaRlmmQ(String str) {
        this.fileSizeLimit = str;
    }

    public final void setPublic(Boolean bool) {
        this.public = bool;
    }

    public final void allowedMimeTypes(List<String> mimeTypes) {
        l.f("mimeTypes", mimeTypes);
        this.allowedMimeTypes = mimeTypes;
    }

    /* renamed from: getBytes-ueSVNNQ, reason: not valid java name */
    public final String m42getBytesueSVNNQ(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append(i7);
        sb.append('b');
        return FileSizeLimit.m60constructorimpl(sb.toString());
    }

    /* renamed from: getGigabytes-ueSVNNQ, reason: not valid java name */
    public final String m45getGigabytesueSVNNQ(int i7) {
        return FileSizeLimit.m60constructorimpl(i7 + "gb");
    }

    /* renamed from: getKilobytes-ueSVNNQ, reason: not valid java name */
    public final String m47getKilobytesueSVNNQ(int i7) {
        return FileSizeLimit.m60constructorimpl(i7 + "kb");
    }

    /* renamed from: getMegabytes-ueSVNNQ, reason: not valid java name */
    public final String m49getMegabytesueSVNNQ(int i7) {
        return FileSizeLimit.m60constructorimpl(i7 + "mb");
    }

    public final void allowedMimeTypes(ContentType... mimeTypes) {
        l.f("mimeTypes", mimeTypes);
        ArrayList arrayList = new ArrayList(mimeTypes.length);
        for (ContentType contentType : mimeTypes) {
            arrayList.add(contentType.toString());
        }
        this.allowedMimeTypes = arrayList;
    }
}
