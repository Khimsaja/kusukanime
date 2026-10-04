package io.ktor.client.utils;

import H5.A;
import H5.Y;
import O3.C;
import S3.c;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.client.content.ProgressListener;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LS3/h;", "context", "", "contentLength", "Lio/ktor/client/content/ProgressListener;", "listener", "observable", "(Lio/ktor/utils/io/ByteReadChannel;LS3/h;Ljava/lang/Long;Lio/ktor/client/content/ProgressListener;)Lio/ktor/utils/io/ByteReadChannel;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelUtilsKt {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.utils.ByteChannelUtilsKt$observable$1", f = "ByteChannelUtils.kt", l = {22, 24, 26, 31}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.utils.ByteChannelUtilsKt$observable$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ Long $contentLength;
        final /* synthetic */ ProgressListener $listener;
        final /* synthetic */ ByteReadChannel $this_observable;
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, ProgressListener progressListener, Long l7, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_observable = byteReadChannel;
            this.$listener = progressListener;
            this.$contentLength = l7;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_observable, this.$listener, this.$contentLength, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:35:0x00e6, B:37:0x00ec, B:41:0x011a, B:43:0x0122, B:57:0x0189, B:61:0x019a), top: B:78:0x00e6 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0122 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #3 {all -> 0x017b, blocks: (B:35:0x00e6, B:37:0x00ec, B:41:0x011a, B:43:0x0122, B:57:0x0189, B:61:0x019a), top: B:78:0x00e6 }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x016d -> B:18:0x0055). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x017f -> B:78:0x00e6). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.utils.ByteChannelUtilsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final ByteReadChannel observable(ByteReadChannel byteReadChannel, h hVar, Long l7, ProgressListener progressListener) {
        l.f("<this>", byteReadChannel);
        l.f("context", hVar);
        l.f("listener", progressListener);
        return ByteWriteChannelOperationsKt.writer((A) Y.f3831k, hVar, true, (n) new AnonymousClass1(byteReadChannel, progressListener, l7, null)).getChannel();
    }
}
