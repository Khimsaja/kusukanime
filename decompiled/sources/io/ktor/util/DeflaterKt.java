package io.ktor.util;

import H5.A;
import H5.M;
import H5.Y;
import O3.C;
import P3.r;
import S3.h;
import U3.e;
import U3.j;
import e4.n;
import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterScope;
import io.ktor.utils.io.pool.ObjectPool;
import java.nio.ByteBuffer;
import java.util.zip.Checksum;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\r\u001a$\u0010\u0010\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0015\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a6\u0010\u0004\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0082@¢\u0006\u0004\b\u0004\u0010\u001c\u001a5\u0010\u001f\u001a\u00020\u0017*\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010\u001f\u001a\u00020\u000b*\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010!\"\u0014\u0010#\u001a\u00020\"8\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010$\"\u001a\u0010&\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ljava/util/zip/Deflater;", "Ljava/nio/ByteBuffer;", "outBuffer", "LO3/C;", "deflateTo", "(Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;)V", "buffer", "setInputBuffer", "Ljava/util/zip/Checksum;", "updateKeepPosition", "(Ljava/util/zip/Checksum;Ljava/nio/ByteBuffer;)V", "Lio/ktor/utils/io/ByteWriteChannel;", "putGzipHeader", "(Lio/ktor/utils/io/ByteWriteChannel;LS3/c;)Ljava/lang/Object;", "crc", "deflater", "putGzipTrailer", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Checksum;Ljava/util/zip/Deflater;LS3/c;)Ljava/lang/Object;", "Lkotlin/Function0;", "", "predicate", "deflateWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Ljava/util/zip/Deflater;Ljava/nio/ByteBuffer;Le4/a;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "destination", "gzip", "Lio/ktor/utils/io/pool/ObjectPool;", "pool", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;LS3/c;)Ljava/lang/Object;", "LS3/h;", "coroutineContext", "deflated", "(Lio/ktor/utils/io/ByteReadChannel;ZLio/ktor/utils/io/pool/ObjectPool;LS3/h;)Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteWriteChannel;ZLio/ktor/utils/io/pool/ObjectPool;LS3/h;)Lio/ktor/utils/io/ByteWriteChannel;", "", "GZIP_MAGIC", "S", "", "GZIP_HEADER_PADDING", "[B", "getGZIP_HEADER_PADDING", "()[B", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DeflaterKt {
    private static final byte[] GZIP_HEADER_PADDING = new byte[7];
    public static final short GZIP_MAGIC = -29921;

    @e(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", l = {72, 77, 82, 88, 91}, m = "deflateTo")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.DeflaterKt$deflateTo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateTo(null, null, false, null, this);
        }
    }

    @e(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", l = {52}, m = "deflateWhile")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.DeflaterKt$deflateWhile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12401 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C12401(S3.c<? super C12401> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.deflateWhile(null, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/WriterScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/WriterScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.DeflaterKt$deflated$1", f = "Deflater.kt", l = {112}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.DeflaterKt$deflated$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12411 extends j implements n {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ ByteReadChannel $this_deflated;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12411(ByteReadChannel byteReadChannel, boolean z7, ObjectPool<ByteBuffer> objectPool, S3.c<? super C12411> cVar) {
            super(2, cVar);
            this.$this_deflated = byteReadChannel;
            this.$gzip = z7;
            this.$pool = objectPool;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C12411 c12411 = new C12411(this.$this_deflated, this.$gzip, this.$pool, cVar);
            c12411.L$0 = obj;
            return c12411;
        }

        @Override // e4.n
        public final Object invoke(WriterScope writerScope, S3.c<? super C> cVar) {
            return ((C12411) create(writerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                ByteReadChannel byteReadChannel = this.$this_deflated;
                ByteWriteChannel channel = writerScope.getChannel();
                boolean z7 = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(byteReadChannel, channel, z7, objectPool, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/ReaderScope;", "LO3/C;", "<anonymous>", "(Lio/ktor/utils/io/ReaderScope;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", l = {127}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.DeflaterKt$deflated$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ boolean $gzip;
        final /* synthetic */ ObjectPool<ByteBuffer> $pool;
        final /* synthetic */ ByteWriteChannel $this_deflated;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteWriteChannel byteWriteChannel, boolean z7, ObjectPool<ByteBuffer> objectPool, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_deflated = byteWriteChannel;
            this.$gzip = z7;
            this.$pool = objectPool;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_deflated, this.$gzip, this.$pool, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(ReaderScope readerScope, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(readerScope, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                ByteReadChannel channel = ((ReaderScope) this.L$0).getChannel();
                ByteWriteChannel byteWriteChannel = this.$this_deflated;
                boolean z7 = this.$gzip;
                ObjectPool<ByteBuffer> objectPool = this.$pool;
                this.label = 1;
                if (DeflaterKt.deflateTo(channel, byteWriteChannel, z7, objectPool, this) == aVar) {
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

    @e(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", l = {37, 38, 39}, m = "putGzipHeader")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.DeflaterKt$putGzipHeader$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12421 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12421(S3.c<? super C12421> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipHeader(null, this);
        }
    }

    @e(c = "io.ktor.util.DeflaterKt", f = "Deflater.kt", l = {43, 44}, m = "putGzipTrailer")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.util.DeflaterKt$putGzipTrailer$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12431 extends U3.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C12431(S3.c<? super C12431> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeflaterKt.putGzipTrailer(null, null, null, this);
        }
    }

    private static final void deflateTo(Deflater deflater, ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byteBuffer.position(byteBuffer.position() + deflater.deflate(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining()));
        }
    }

    public static /* synthetic */ Object deflateTo$default(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, boolean z7, ObjectPool objectPool, S3.c cVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z7 = true;
        }
        if ((i7 & 4) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        return deflateTo(byteReadChannel, byteWriteChannel, z7, objectPool, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$2(Deflater deflater) {
        return !deflater.needsInput();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean deflateTo$lambda$4(Deflater deflater) {
        return !deflater.finished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deflateWhile(io.ktor.utils.io.ByteWriteChannel r5, java.util.zip.Deflater r6, java.nio.ByteBuffer r7, e4.InterfaceC0821a r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.util.DeflaterKt.C12401
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = (io.ktor.util.DeflaterKt.C12401) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$deflateWhile$1 r0 = new io.ktor.util.DeflaterKt$deflateWhile$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r5 = r0.L$3
            e4.a r5 = (e4.InterfaceC0821a) r5
            java.lang.Object r6 = r0.L$2
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            java.lang.Object r7 = r0.L$1
            java.util.zip.Deflater r7 = (java.util.zip.Deflater) r7
            java.lang.Object r8 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            P3.r.Y(r9)
            r4 = r8
            r8 = r5
            r5 = r4
            r4 = r7
            r7 = r6
            r6 = r4
            goto L48
        L3d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L45:
            P3.r.Y(r9)
        L48:
            java.lang.Object r9 = r8.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6e
            r7.clear()
            deflateTo(r6, r7)
            r7.flip()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r8
            r0.label = r3
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(r5, r7, r0)
            if (r9 != r1) goto L48
            return r1
        L6e:
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.deflateWhile(io.ktor.utils.io.ByteWriteChannel, java.util.zip.Deflater, java.nio.ByteBuffer, e4.a, S3.c):java.lang.Object");
    }

    public static final ByteReadChannel deflated(ByteReadChannel byteReadChannel, boolean z7, ObjectPool<ByteBuffer> objectPool, h hVar) {
        l.f("<this>", byteReadChannel);
        l.f("pool", objectPool);
        l.f("coroutineContext", hVar);
        return ByteWriteChannelOperationsKt.writer((A) Y.f3831k, hVar, true, (n) new C12411(byteReadChannel, z7, objectPool, null)).getChannel();
    }

    public static ByteReadChannel deflated$default(ByteReadChannel byteReadChannel, boolean z7, ObjectPool objectPool, h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i7 & 4) != 0) {
            hVar = M.f3814b;
        }
        return deflated(byteReadChannel, z7, (ObjectPool<ByteBuffer>) objectPool, hVar);
    }

    public static final byte[] getGZIP_HEADER_PADDING() {
        return GZIP_HEADER_PADDING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, 0, 0, r5, 6, null) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object putGzipHeader(io.ktor.utils.io.ByteWriteChannel r8, S3.c<? super O3.C> r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof io.ktor.util.DeflaterKt.C12421
            if (r0 == 0) goto L14
            r0 = r9
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = (io.ktor.util.DeflaterKt.C12421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            io.ktor.util.DeflaterKt$putGzipHeader$1 r0 = new io.ktor.util.DeflaterKt$putGzipHeader$1
            r0.<init>(r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.result
            T3.a r0 = T3.a.f9048k
            int r1 = r5.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L49
            if (r1 == r4) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            P3.r.Y(r9)
            goto L7d
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r5.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            P3.r.Y(r9)
        L3e:
            r1 = r8
            r8 = r2
            goto L6b
        L41:
            java.lang.Object r8 = r5.L$0
            io.ktor.utils.io.ByteWriteChannel r8 = (io.ktor.utils.io.ByteWriteChannel) r8
            P3.r.Y(r9)
            goto L5e
        L49:
            P3.r.Y(r9)
            r9 = -29921(0xffffffffffff8b1f, float:NaN)
            short r9 = (short) r9
            short r9 = java.lang.Short.reverseBytes(r9)
            r5.L$0 = r8
            r5.label = r4
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeShort(r8, r9, r5)
            if (r9 != r0) goto L5e
            goto L7c
        L5e:
            r5.L$0 = r8
            r5.label = r3
            r9 = 8
            java.lang.Object r9 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r8, r9, r5)
            if (r9 != r0) goto L3e
            goto L7c
        L6b:
            byte[] r2 = io.ktor.util.DeflaterKt.GZIP_HEADER_PADDING
            r9 = 0
            r5.L$0 = r9
            r5.label = r8
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            java.lang.Object r8 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L7d
        L7c:
            return r0
        L7d:
            O3.C r8 = O3.C.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.putGzipHeader(io.ktor.utils.io.ByteWriteChannel, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object putGzipTrailer(io.ktor.utils.io.ByteWriteChannel r7, java.util.zip.Checksum r8, java.util.zip.Deflater r9, S3.c<? super O3.C> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof io.ktor.util.DeflaterKt.C12431
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = (io.ktor.util.DeflaterKt.C12431) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.util.DeflaterKt$putGzipTrailer$1 r0 = new io.ktor.util.DeflaterKt$putGzipTrailer$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            P3.r.Y(r10)
            goto L6e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.L$1
            r9 = r7
            java.util.zip.Deflater r9 = (java.util.zip.Deflater) r9
            java.lang.Object r7 = r0.L$0
            io.ktor.utils.io.ByteWriteChannel r7 = (io.ktor.utils.io.ByteWriteChannel) r7
            P3.r.Y(r10)
            goto L58
        L3f:
            P3.r.Y(r10)
            long r5 = r8.getValue()
            int r8 = (int) r5
            int r8 = java.lang.Integer.reverseBytes(r8)
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r8 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r7, r8, r0)
            if (r8 != r1) goto L58
            goto L6d
        L58:
            int r8 = r9.getTotalIn()
            int r8 = java.lang.Integer.reverseBytes(r8)
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r7 = io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r7, r8, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            O3.C r7 = O3.C.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.putGzipTrailer(io.ktor.utils.io.ByteWriteChannel, java.util.zip.Checksum, java.util.zip.Deflater, S3.c):java.lang.Object");
    }

    private static final void setInputBuffer(Deflater deflater, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        deflater.setInput(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static final void updateKeepPosition(Checksum checksum, ByteBuffer byteBuffer) {
        l.f("<this>", checksum);
        l.f("buffer", byteBuffer);
        if (!byteBuffer.hasArray()) {
            throw new IllegalArgumentException("buffer need to be array-backed");
        }
        checksum.update(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
    }

    public static final ByteWriteChannel deflated(ByteWriteChannel byteWriteChannel, boolean z7, ObjectPool<ByteBuffer> objectPool, h hVar) {
        l.f("<this>", byteWriteChannel);
        l.f("pool", objectPool);
        l.f("coroutineContext", hVar);
        return ByteReadChannelOperationsKt.reader((A) Y.f3831k, hVar, true, (n) new AnonymousClass2(byteWriteChannel, z7, objectPool, null)).getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0139, code lost:
    
        if (putGzipHeader(r0, r3) == r4) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:10:0x002c, B:39:0x0103], limit reached: 98 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155 A[Catch: all -> 0x01c7, TRY_LEAVE, TryCatch #1 {all -> 0x01c7, blocks: (B:53:0x014f, B:55:0x0155, B:72:0x01cb, B:74:0x01d1, B:86:0x0221), top: B:91:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185 A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #2 {all -> 0x01b8, blocks: (B:59:0x017d, B:61:0x0185), top: B:92:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cb A[Catch: all -> 0x01c7, TRY_ENTER, TryCatch #1 {all -> 0x01c7, blocks: (B:53:0x014f, B:55:0x0155, B:72:0x01cb, B:74:0x01d1, B:86:0x0221), top: B:91:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00aa, blocks: (B:79:0x01fa, B:28:0x00a1, B:34:0x00cd, B:37:0x00fb), top: B:94:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.zip.Deflater] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01ae -> B:30:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object deflateTo(io.ktor.utils.io.ByteReadChannel r17, io.ktor.utils.io.ByteWriteChannel r18, boolean r19, io.ktor.utils.io.pool.ObjectPool<java.nio.ByteBuffer> r20, S3.c<? super O3.C> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.DeflaterKt.deflateTo(io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, boolean, io.ktor.utils.io.pool.ObjectPool, S3.c):java.lang.Object");
    }

    public static ByteWriteChannel deflated$default(ByteWriteChannel byteWriteChannel, boolean z7, ObjectPool objectPool, h hVar, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z7 = true;
        }
        if ((i7 & 2) != 0) {
            objectPool = ByteBufferPoolKt.getKtorDefaultPool();
        }
        if ((i7 & 4) != 0) {
            hVar = M.f3814b;
        }
        return deflated(byteWriteChannel, z7, (ObjectPool<ByteBuffer>) objectPool, hVar);
    }
}
