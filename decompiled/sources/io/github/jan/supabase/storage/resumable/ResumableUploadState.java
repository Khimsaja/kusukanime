package io.github.jan.supabase.storage.resumable;

import b1.AbstractC0703b;
import io.github.jan.supabase.storage.UploadStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\rJ\t\u0010\u001f\u001a\u00020\u0005HÂ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J8\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rR\u0011\u0010\u0016\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "", "fingerprint", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "cacheEntry", "Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;", "status", "Lio/github/jan/supabase/storage/UploadStatus;", "paused", "", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lio/github/jan/supabase/storage/UploadStatus;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFingerprint-h-pxtCA", "()Ljava/lang/String;", "Ljava/lang/String;", "getStatus", "()Lio/github/jan/supabase/storage/UploadStatus;", "getPaused", "()Z", "path", "", "getPath", "bucketId", "getBucketId", "isDone", "progress", "", "getProgress", "()F", "component1", "component1-h-pxtCA", "component2", "component3", "component4", "copy", "copy-8R7v4q0", "(Ljava/lang/String;Lio/github/jan/supabase/storage/resumable/ResumableCacheEntry;Lio/github/jan/supabase/storage/UploadStatus;Z)Lio/github/jan/supabase/storage/resumable/ResumableUploadState;", "equals", "other", "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ResumableUploadState {
    private final String bucketId;
    private final ResumableCacheEntry cacheEntry;
    private final String fingerprint;
    private final boolean isDone;
    private final String path;
    private final boolean paused;
    private final float progress;
    private final UploadStatus status;

    public /* synthetic */ ResumableUploadState(String str, ResumableCacheEntry resumableCacheEntry, UploadStatus uploadStatus, boolean z7, f fVar) {
        this(str, resumableCacheEntry, uploadStatus, z7);
    }

    /* renamed from: component2, reason: from getter */
    private final ResumableCacheEntry getCacheEntry() {
        return this.cacheEntry;
    }

    /* renamed from: copy-8R7v4q0$default, reason: not valid java name */
    public static /* synthetic */ ResumableUploadState m101copy8R7v4q0$default(ResumableUploadState resumableUploadState, String str, ResumableCacheEntry resumableCacheEntry, UploadStatus uploadStatus, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = resumableUploadState.fingerprint;
        }
        if ((i7 & 2) != 0) {
            resumableCacheEntry = resumableUploadState.cacheEntry;
        }
        if ((i7 & 4) != 0) {
            uploadStatus = resumableUploadState.status;
        }
        if ((i7 & 8) != 0) {
            z7 = resumableUploadState.paused;
        }
        return resumableUploadState.m103copy8R7v4q0(str, resumableCacheEntry, uploadStatus, z7);
    }

    /* renamed from: component1-h-pxtCA, reason: not valid java name and from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* renamed from: component3, reason: from getter */
    public final UploadStatus getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPaused() {
        return this.paused;
    }

    /* renamed from: copy-8R7v4q0, reason: not valid java name */
    public final ResumableUploadState m103copy8R7v4q0(String fingerprint, ResumableCacheEntry cacheEntry, UploadStatus status, boolean paused) {
        l.f("$v$c$io-github-jan-supabase-storage-resumable-Fingerprint$-fingerprint$0", fingerprint);
        l.f("cacheEntry", cacheEntry);
        l.f("status", status);
        return new ResumableUploadState(fingerprint, cacheEntry, status, paused, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResumableUploadState)) {
            return false;
        }
        ResumableUploadState resumableUploadState = (ResumableUploadState) other;
        return Fingerprint.m88equalsimpl0(this.fingerprint, resumableUploadState.fingerprint) && l.a(this.cacheEntry, resumableUploadState.cacheEntry) && l.a(this.status, resumableUploadState.status) && this.paused == resumableUploadState.paused;
    }

    public final String getBucketId() {
        return this.bucketId;
    }

    /* renamed from: getFingerprint-h-pxtCA, reason: not valid java name */
    public final String m104getFingerprinthpxtCA() {
        return this.fingerprint;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getPaused() {
        return this.paused;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final UploadStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Boolean.hashCode(this.paused) + ((this.status.hashCode() + ((this.cacheEntry.hashCode() + (Fingerprint.m92hashCodeimpl(this.fingerprint) * 31)) * 31)) * 31);
    }

    /* renamed from: isDone, reason: from getter */
    public final boolean getIsDone() {
        return this.isDone;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResumableUploadState(fingerprint=");
        sb.append((Object) Fingerprint.m93toStringimpl(this.fingerprint));
        sb.append(", cacheEntry=");
        sb.append(this.cacheEntry);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", paused=");
        return AbstractC0703b.n(sb, this.paused, ')');
    }

    private ResumableUploadState(String str, ResumableCacheEntry resumableCacheEntry, UploadStatus uploadStatus, boolean z7) {
        l.f("fingerprint", str);
        l.f("cacheEntry", resumableCacheEntry);
        l.f("status", uploadStatus);
        this.fingerprint = str;
        this.cacheEntry = resumableCacheEntry;
        this.status = uploadStatus;
        this.paused = z7;
        this.path = resumableCacheEntry.getPath();
        this.bucketId = resumableCacheEntry.getBucketId();
        this.isDone = uploadStatus instanceof UploadStatus.Success;
        this.progress = uploadStatus instanceof UploadStatus.Progress ? ((UploadStatus.Progress) uploadStatus).getTotalBytesSend() / ((UploadStatus.Progress) uploadStatus).getContentLength() : 1.0f;
    }
}
