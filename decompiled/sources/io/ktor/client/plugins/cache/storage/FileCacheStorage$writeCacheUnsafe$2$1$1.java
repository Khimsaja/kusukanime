package io.ktor.client.plugins.cache.storage;

import H5.A;
import O3.C;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteChannel;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1", f = "FileCacheStorage.kt", l = {151, 153}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FileCacheStorage$writeCacheUnsafe$2$1$1 extends j implements n {
    final /* synthetic */ List<CachedResponseData> $caches;
    final /* synthetic */ ByteChannel $channel;
    Object L$0;
    int label;
    final /* synthetic */ FileCacheStorage this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCacheUnsafe$2$1$1(ByteChannel byteChannel, List<CachedResponseData> list, FileCacheStorage fileCacheStorage, c<? super FileCacheStorage$writeCacheUnsafe$2$1$1> cVar) {
        super(2, cVar);
        this.$channel = byteChannel;
        this.$caches = list;
        this.this$0 = fileCacheStorage;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new FileCacheStorage$writeCacheUnsafe$2$1$1(this.$channel, this.$caches, this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((FileCacheStorage$writeCacheUnsafe$2$1$1) create(a, cVar)).invokeSuspend(C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r6, r1, r5) == r0) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r1 = r5.L$0
            java.util.Iterator r1 = (java.util.Iterator) r1
            P3.r.Y(r6)
            goto L3b
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            P3.r.Y(r6)
            goto L34
        L20:
            P3.r.Y(r6)
            io.ktor.utils.io.ByteChannel r6 = r5.$channel
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r1 = r5.$caches
            int r1 = r1.size()
            r5.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r6, r1, r5)
            if (r6 != r0) goto L34
            goto L55
        L34:
            java.util.List<io.ktor.client.plugins.cache.storage.CachedResponseData> r6 = r5.$caches
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
        L3b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r1.next()
            io.ktor.client.plugins.cache.storage.CachedResponseData r6 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage r3 = r5.this$0
            io.ktor.utils.io.ByteChannel r4 = r5.$channel
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r6 = io.ktor.client.plugins.cache.storage.FileCacheStorage.access$writeCache(r3, r4, r6, r5)
            if (r6 != r0) goto L3b
        L55:
            return r0
        L56:
            io.ktor.utils.io.ByteChannel r6 = r5.$channel
            r6.close()
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
