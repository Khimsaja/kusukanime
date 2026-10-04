package io.github.jan.supabase.storage.resumable;

import O3.C;
import S3.c;
import T3.a;
import e4.n;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.ContentDisposition;
import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012'\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0017R1\u0010\u0004\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0005¢\u0006\u0002\b\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lio/github/jan/supabase/storage/resumable/StreamContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", ContentDisposition.Parameters.Size, "", "copyTo", "Lkotlin/Function2;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "<init>", "(JLkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "contentLength", "getContentLength", "()Ljava/lang/Long;", "contentType", "Lio/ktor/http/ContentType;", "getContentType", "()Lio/ktor/http/ContentType;", "writeTo", "channel", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseInternal
/* loaded from: classes.dex */
public final class StreamContent extends OutgoingContent.WriteChannelContent {
    private final long contentLength;
    private final ContentType contentType;
    private final n copyTo;

    public StreamContent(long j7, n nVar) {
        l.f("copyTo", nVar);
        this.copyTo = nVar;
        this.contentLength = j7;
        this.contentType = ContentType.INSTANCE.parse("application/offset+octet-stream");
    }

    @Override // io.ktor.http.content.OutgoingContent
    public Long getContentLength() {
        return Long.valueOf(this.contentLength);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public ContentType getContentType() {
        return this.contentType;
    }

    @Override // io.ktor.http.content.OutgoingContent.WriteChannelContent
    public Object writeTo(ByteWriteChannel byteWriteChannel, c<? super C> cVar) {
        Object objInvoke = this.copyTo.invoke(byteWriteChannel, cVar);
        return objInvoke == a.f9048k ? objInvoke : C.a;
    }
}
