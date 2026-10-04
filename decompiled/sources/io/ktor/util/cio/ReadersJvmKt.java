package io.ktor.util.cio;

import O3.C;
import U3.c;
import U3.e;
import e4.k;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import io.ktor.utils.io.InternalAPI;
import java.nio.ByteBuffer;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0087H¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/ByteBuffer;", "buffer", "Lkotlin/Function1;", "LO3/C;", "block", "pass", "(Lio/ktor/utils/io/ByteReadChannel;Ljava/nio/ByteBuffer;Le4/k;LS3/c;)Ljava/lang/Object;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadersJvmKt {

    @e(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", l = {19}, m = "pass")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    /* renamed from: io.ktor.util.cio.ReadersJvmKt$pass$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersJvmKt.pass(null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    @io.ktor.utils.io.InternalAPI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object pass(io.ktor.utils.io.ByteReadChannel r5, java.nio.ByteBuffer r6, e4.k r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.util.cio.ReadersJvmKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.util.cio.ReadersJvmKt$pass$1 r0 = (io.ktor.util.cio.ReadersJvmKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.cio.ReadersJvmKt$pass$1 r0 = new io.ktor.util.cio.ReadersJvmKt$pass$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r5 = r0.L$2
            e4.k r5 = (e4.k) r5
            java.lang.Object r6 = r0.L$1
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteReadChannel r7 = (io.ktor.utils.io.ByteReadChannel) r7
            P3.r.Y(r8)
            r4 = r7
            r7 = r5
            r5 = r4
            goto L59
        L36:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3e:
            P3.r.Y(r8)
        L41:
            boolean r8 = r5.isClosedForRead()
            if (r8 != 0) goto L60
            r6.clear()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r3
            java.lang.Object r8 = io.ktor.utils.io.ByteReadChannelOperations_jvmKt.readAvailable(r5, r6, r0)
            if (r8 != r1) goto L59
            return r1
        L59:
            r6.flip()
            r7.invoke(r6)
            goto L41
        L60:
            java.lang.Throwable r5 = r5.getClosedCause()
            if (r5 != 0) goto L69
            O3.C r5 = O3.C.a
            return r5
        L69:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.ReadersJvmKt.pass(io.ktor.utils.io.ByteReadChannel, java.nio.ByteBuffer, e4.k, S3.c):java.lang.Object");
    }

    @InternalAPI
    private static final Object pass$$forInline(ByteReadChannel byteReadChannel, ByteBuffer byteBuffer, k kVar, S3.c<? super C> cVar) throws Throwable {
        while (!byteReadChannel.isClosedForRead()) {
            byteBuffer.clear();
            ByteReadChannelOperations_jvmKt.readAvailable(byteReadChannel, byteBuffer, cVar);
            byteBuffer.flip();
            kVar.invoke(byteBuffer);
        }
        Throwable closedCause = byteReadChannel.getClosedCause();
        if (closedCause == null) {
            return C.a;
        }
        throw closedCause;
    }
}
