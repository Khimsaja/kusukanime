package io.github.jan.supabase.storage;

import O3.C;
import P3.r;
import U3.j;
import e4.n;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lio/ktor/client/statement/HttpResponse;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl$channelDownloadRequest$3", f = "BucketApiImpl.kt", l = {194, 194}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class BucketApiImpl$channelDownloadRequest$3 extends j implements n {
    final /* synthetic */ ByteWriteChannel $channel;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BucketApiImpl$channelDownloadRequest$3(ByteWriteChannel byteWriteChannel, S3.c<? super BucketApiImpl$channelDownloadRequest$3> cVar) {
        super(2, cVar);
        this.$channel = byteWriteChannel;
    }

    @Override // U3.a
    public final S3.c<C> create(Object obj, S3.c<?> cVar) {
        BucketApiImpl$channelDownloadRequest$3 bucketApiImpl$channelDownloadRequest$3 = new BucketApiImpl$channelDownloadRequest$3(this.$channel, cVar);
        bucketApiImpl$channelDownloadRequest$3.L$0 = obj;
        return bucketApiImpl$channelDownloadRequest$3;
    }

    @Override // e4.n
    public final Object invoke(HttpResponse httpResponse, S3.c<? super Long> cVar) {
        return ((BucketApiImpl$channelDownloadRequest$3) create(httpResponse, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpResponse httpResponse = (HttpResponse) this.L$0;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            this.L$0 = null;
            this.label = 1;
            obj = HttpResponseKt.bodyAsChannel(httpResponse, this);
            if (obj != aVar) {
            }
        }
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
            return obj;
        }
        r.Y(obj);
        ByteWriteChannel byteWriteChannel = this.$channel;
        this.L$0 = null;
        this.label = 2;
        Object objCopyTo = ByteReadChannelOperationsKt.copyTo((ByteReadChannel) obj, byteWriteChannel, this);
        return objCopyTo == aVar ? aVar : objCopyTo;
    }
}
