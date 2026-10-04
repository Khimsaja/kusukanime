package io.github.jan.supabase.storage.resumable;

import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ByteWriteChannel;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "io.github.jan.supabase.storage.resumable.ResumableUploadImpl$uploadChunk$uploadResponse$1$1", f = "ResumableUpload.kt", l = {166}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ResumableUploadImpl$uploadChunk$uploadResponse$1$1 extends j implements n {
    final /* synthetic */ byte[] $buffer;
    final /* synthetic */ long $limit;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResumableUploadImpl$uploadChunk$uploadResponse$1$1(byte[] bArr, long j7, c<? super ResumableUploadImpl$uploadChunk$uploadResponse$1$1> cVar) {
        super(2, cVar);
        this.$buffer = bArr;
        this.$limit = j7;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        ResumableUploadImpl$uploadChunk$uploadResponse$1$1 resumableUploadImpl$uploadChunk$uploadResponse$1$1 = new ResumableUploadImpl$uploadChunk$uploadResponse$1$1(this.$buffer, this.$limit, cVar);
        resumableUploadImpl$uploadChunk$uploadResponse$1$1.L$0 = obj;
        return resumableUploadImpl$uploadChunk$uploadResponse$1$1;
    }

    @Override // e4.n
    public final Object invoke(ByteWriteChannel byteWriteChannel, c<? super C> cVar) {
        return ((ResumableUploadImpl$uploadChunk$uploadResponse$1$1) create(byteWriteChannel, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        ByteWriteChannel byteWriteChannel = (ByteWriteChannel) this.L$0;
        a aVar = a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            byte[] bArr = this.$buffer;
            int i8 = (int) this.$limit;
            this.L$0 = null;
            this.label = 1;
            if (ByteWriteChannelOperationsKt.writeFully(byteWriteChannel, bArr, 0, i8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.Y(obj);
        }
        return C.a;
    }
}
