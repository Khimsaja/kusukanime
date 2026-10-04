package io.ktor.util.cio;

import U3.c;
import U3.e;
import e4.k;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\n\u001a\u00020\b*\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "", "limit", "", "toByteArray", "(Lio/ktor/utils/io/ByteReadChannel;ILS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function1;", "LO3/C;", "block", "use", "(Lio/ktor/utils/io/ByteWriteChannel;Le4/k;)V", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ReadersKt {

    @e(c = "io.ktor.util.cio.ReadersKt", f = "Readers.kt", l = {19}, m = "toByteArray")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.cio.ReadersKt$toByteArray$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReadersKt.toByteArray(null, 0, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object toByteArray(io.ktor.utils.io.ByteReadChannel r4, int r5, S3.c<? super byte[]> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.util.cio.ReadersKt.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.util.cio.ReadersKt$toByteArray$1 r0 = (io.ktor.util.cio.ReadersKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.cio.ReadersKt$toByteArray$1 r0 = new io.ktor.util.cio.ReadersKt$toByteArray$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L3c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            P3.r.Y(r6)
            long r5 = (long) r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteReadChannelOperationsKt.readRemaining(r4, r5, r0)
            if (r6 != r1) goto L3c
            return r1
        L3c:
            S5.n r6 = (S5.n) r6
            byte[] r4 = S5.p.h(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.ReadersKt.toByteArray(io.ktor.utils.io.ByteReadChannel, int, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object toByteArray$default(ByteReadChannel byteReadChannel, int i7, S3.c cVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return toByteArray(byteReadChannel, i7, cVar);
    }

    public static final void use(ByteWriteChannel byteWriteChannel, k kVar) {
        l.f("<this>", byteWriteChannel);
        l.f("block", kVar);
        try {
            kVar.invoke(byteWriteChannel);
        } finally {
        }
    }
}
