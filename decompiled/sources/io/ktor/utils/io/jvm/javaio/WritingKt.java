package io.ktor.utils.io.jvm.javaio;

import U3.c;
import U3.e;
import io.ktor.utils.io.ByteReadChannel;
import java.io.OutputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Ljava/io/OutputStream;", "out", "", "limit", "copyTo", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/io/OutputStream;JLS3/c;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WritingKt {

    @e(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", l = {25}, m = "copyTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.jvm.javaio.WritingKt$copyTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WritingKt.copyTo(null, null, 0L, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x005a -> B:26:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006d -> B:25:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object copyTo(io.ktor.utils.io.ByteReadChannel r17, java.io.OutputStream r18, long r19, S3.c<? super java.lang.Long> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.WritingKt.copyTo(io.ktor.utils.io.ByteReadChannel, java.io.OutputStream, long, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object copyTo$default(ByteReadChannel byteReadChannel, OutputStream outputStream, long j7, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return copyTo(byteReadChannel, outputStream, j7, cVar);
    }
}
