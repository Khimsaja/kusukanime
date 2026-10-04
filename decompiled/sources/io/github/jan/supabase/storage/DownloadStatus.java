package io.github.jan.supabase.storage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus;", "", "Progress", "Success", "ByteData", "Lio/github/jan/supabase/storage/DownloadStatus$ByteData;", "Lio/github/jan/supabase/storage/DownloadStatus$Progress;", "Lio/github/jan/supabase/storage/DownloadStatus$Success;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DownloadStatus {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0010"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$ByteData;", "Lio/github/jan/supabase/storage/DownloadStatus;", "data", "", "constructor-impl", "([B)[B", "getData", "()[B", "equals", "", "other", "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ByteData implements DownloadStatus {
        private final byte[] data;

        private /* synthetic */ ByteData(byte[] bArr) {
            this.data = bArr;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ByteData m52boximpl(byte[] bArr) {
            return new ByteData(bArr);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static byte[] m53constructorimpl(byte[] bArr) {
            l.f("data", bArr);
            return bArr;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m54equalsimpl(byte[] bArr, Object obj) {
            return (obj instanceof ByteData) && l.a(bArr, ((ByteData) obj).m58unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m55equalsimpl0(byte[] bArr, byte[] bArr2) {
            return l.a(bArr, bArr2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m56hashCodeimpl(byte[] bArr) {
            return Arrays.hashCode(bArr);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m57toStringimpl(byte[] bArr) {
            return "ByteData(data=" + Arrays.toString(bArr) + ')';
        }

        public boolean equals(Object other) {
            return m54equalsimpl(this.data, other);
        }

        public final byte[] getData() {
            return this.data;
        }

        public int hashCode() {
            return m56hashCodeimpl(this.data);
        }

        public String toString() {
            return m57toStringimpl(this.data);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ byte[] m58unboximpl() {
            return this.data;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$Progress;", "Lio/github/jan/supabase/storage/DownloadStatus;", "totalBytesReceived", "", "contentLength", "<init>", "(JJ)V", "getTotalBytesReceived", "()J", "getContentLength", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Progress implements DownloadStatus {
        private final long contentLength;
        private final long totalBytesReceived;

        public Progress(long j7, long j8) {
            this.totalBytesReceived = j7;
            this.contentLength = j8;
        }

        public static /* synthetic */ Progress copy$default(Progress progress, long j7, long j8, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = progress.totalBytesReceived;
            }
            if ((i7 & 2) != 0) {
                j8 = progress.contentLength;
            }
            return progress.copy(j7, j8);
        }

        /* renamed from: component1, reason: from getter */
        public final long getTotalBytesReceived() {
            return this.totalBytesReceived;
        }

        /* renamed from: component2, reason: from getter */
        public final long getContentLength() {
            return this.contentLength;
        }

        public final Progress copy(long totalBytesReceived, long contentLength) {
            return new Progress(totalBytesReceived, contentLength);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) other;
            return this.totalBytesReceived == progress.totalBytesReceived && this.contentLength == progress.contentLength;
        }

        public final long getContentLength() {
            return this.contentLength;
        }

        public final long getTotalBytesReceived() {
            return this.totalBytesReceived;
        }

        public int hashCode() {
            return Long.hashCode(this.contentLength) + (Long.hashCode(this.totalBytesReceived) * 31);
        }

        public String toString() {
            return "Progress(totalBytesReceived=" + this.totalBytesReceived + ", contentLength=" + this.contentLength + ')';
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lio/github/jan/supabase/storage/DownloadStatus$Success;", "Lio/github/jan/supabase/storage/DownloadStatus;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements DownloadStatus {
        public static final Success INSTANCE = new Success();

        private Success() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -2013805838;
        }

        public String toString() {
            return "Success";
        }
    }
}
