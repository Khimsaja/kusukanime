package io.ktor.util;

import H5.A;
import H5.Y;
import O3.C;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000>\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001c\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0082\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a,\u0010\u0013\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"", "flag", "", "has", "(II)Z", "Lio/ktor/utils/io/ByteReadChannel;", "source", "gzip", "LS3/h;", "coroutineContext", "inflate", "(Lio/ktor/utils/io/ByteReadChannel;ZLS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/util/zip/Inflater;", "Lio/ktor/utils/io/ByteWriteChannel;", "channel", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/util/zip/Checksum;", "checksum", "inflateTo", "(Ljava/util/zip/Inflater;Lio/ktor/utils/io/ByteWriteChannel;Ljava/nio/ByteBuffer;Ljava/util/zip/Checksum;LS3/c;)Ljava/lang/Object;", "GZIP_HEADER_SIZE", "I", "Lio/ktor/util/Encoder;", "Deflate", "Lio/ktor/util/Encoder;", "getDeflate", "()Lio/ktor/util/Encoder;", "GZip", "getGZip", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EncodersJvmKt {
    private static final int GZIP_HEADER_SIZE = 10;
    private static final Encoder Deflate = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$Deflate$1
        @Override // io.ktor.util.Encoder
        public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return EncodersJvmKt.inflate(source, false, coroutineContext);
        }

        @Override // io.ktor.util.Encoder
        public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return DeflaterKt.deflated$default(source, false, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }

        @Override // io.ktor.util.Encoder
        public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return DeflaterKt.deflated$default(source, false, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }
    };
    private static final Encoder GZip = new Encoder() { // from class: io.ktor.util.EncodersJvmKt$GZip$1
        @Override // io.ktor.util.Encoder
        public ByteReadChannel decode(ByteReadChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return EncodersJvmKt.inflate$default(source, false, coroutineContext, 2, null);
        }

        @Override // io.ktor.util.Encoder
        public ByteReadChannel encode(ByteReadChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }

        @Override // io.ktor.util.Encoder
        public ByteWriteChannel encode(ByteWriteChannel source, h coroutineContext) {
            l.f("source", source);
            l.f("coroutineContext", coroutineContext);
            return DeflaterKt.deflated$default(source, true, (ObjectPool) null, coroutineContext, 2, (Object) null);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.EncodersJvmKt$inflate$1", f = "EncodersJvm.kt", l = {82, 99, 100, 110, 117, 123, 135}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.EncodersJvmKt$inflate$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ByteReadChannel $source;
        byte B$0;
        byte B$1;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        short S$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z7, ByteReadChannel byteReadChannel, S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$gzip = z7;
            this.$source = byteReadChannel;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$gzip, this.$source, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x019c, code lost:
        
            if (io.ktor.utils.io.ByteReadChannelOperationsKt.discardExact(r14, r5, r17) != r0) goto L37;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0237 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x025a A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0272 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x02c2 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x02d6 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x030e A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:7:0x0032, B:93:0x02f7, B:87:0x02d0, B:89:0x02d6, B:94:0x030e, B:96:0x0312, B:98:0x031a, B:100:0x033a, B:103:0x033f, B:104:0x0363, B:105:0x0364, B:106:0x036b, B:107:0x036c, B:108:0x038f, B:109:0x0390, B:113:0x03aa, B:114:0x03b1, B:73:0x026c, B:75:0x0272, B:77:0x0278, B:83:0x02bd, B:65:0x022f, B:67:0x0237, B:70:0x0252, B:72:0x025a, B:84:0x02c2, B:86:0x02ca, B:115:0x03b2, B:17:0x0083, B:64:0x0226), top: B:124:0x0009 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0258 -> B:65:0x022f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x025a -> B:73:0x026c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0299 -> B:81:0x02a1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02f6 -> B:93:0x02f7). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 988
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.util.EncodersJvmKt", f = "EncodersJvm.kt", l = {171}, m = "inflateTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.EncodersJvmKt$inflateTo$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12441 extends U3.c {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C12441(S3.c<? super C12441> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EncodersJvmKt.inflateTo(null, null, null, null, this);
        }
    }

    public static final Encoder getDeflate() {
        return Deflate;
    }

    public static final Encoder getGZip() {
        return GZip;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean has(int i7, int i8) {
        return (i7 & i8) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteReadChannel inflate(ByteReadChannel byteReadChannel, boolean z7, h hVar) {
        return ByteWriteChannelOperationsKt.writer$default((A) Y.f3831k, hVar, false, (n) new AnonymousClass1(z7, byteReadChannel, null), 2, (Object) null).getChannel();
    }

    public static /* synthetic */ ByteReadChannel inflate$default(ByteReadChannel byteReadChannel, boolean z7, h hVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        return inflate(byteReadChannel, z7, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object inflateTo(java.util.zip.Inflater r5, io.ktor.utils.io.ByteWriteChannel r6, java.nio.ByteBuffer r7, java.util.zip.Checksum r8, S3.c<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.util.EncodersJvmKt.C12441
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = (io.ktor.util.EncodersJvmKt.C12441) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.EncodersJvmKt$inflateTo$1 r0 = new io.ktor.util.EncodersJvmKt$inflateTo$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r5 = r0.I$0
            P3.r.Y(r9)
            goto L60
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            P3.r.Y(r9)
            r7.clear()
            byte[] r9 = r7.array()
            int r2 = r7.position()
            int r4 = r7.remaining()
            int r5 = r5.inflate(r9, r2, r4)
            int r9 = r7.position()
            int r9 = r9 + r5
            r7.position(r9)
            r7.flip()
            io.ktor.util.DeflaterKt.updateKeepPosition(r8, r7)
            r0.I$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(r6, r7, r0)
            if (r6 != r1) goto L60
            return r1
        L60:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.EncodersJvmKt.inflateTo(java.util.zip.Inflater, io.ktor.utils.io.ByteWriteChannel, java.nio.ByteBuffer, java.util.zip.Checksum, S3.c):java.lang.Object");
    }
}
