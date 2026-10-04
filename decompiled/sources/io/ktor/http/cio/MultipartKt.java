package io.ktor.http.cio;

import H5.A;
import H5.B;
import H5.D;
import J5.s;
import J5.t;
import J5.u;
import O3.C;
import P3.F;
import P3.m;
import S3.c;
import S3.i;
import U3.e;
import U3.j;
import e4.n;
import f6.AbstractC0915m;
import io.ktor.http.ContentType;
import io.ktor.http.cio.internals.CharsKt;
import io.ktor.http.cio.internals.UnsupportedMediaTypeExceptionCIO;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.StringsKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.v;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\b\u0010\t\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u000b\u0010\f\u001a8\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0012\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u001d\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u00020\u00142\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u001f\u001a\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\"\u0014\u0010-\u001a\u00020,8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010.\"\u0014\u0010/\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010+¨\u00060"}, d2 = {"LT5/a;", "boundary", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lio/ktor/utils/io/ByteWriteChannel;", "output", "", "limit", "parsePreambleImpl", "(LT5/a;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JLS3/c;)Ljava/lang/Object;", "Lio/ktor/http/cio/HttpHeadersMap;", "parsePartHeadersImpl", "(Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "boundaryPrefixed", "headers", "parsePartBodyImpl", "(LT5/a;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/http/cio/HttpHeadersMap;JLS3/c;)Ljava/lang/Object;", "prefix", "skipIfFoundReadCount", "(Lio/ktor/utils/io/ByteReadChannel;LT5/a;LS3/c;)Ljava/lang/Object;", "LH5/A;", "maxPartSize", "LJ5/u;", "Lio/ktor/http/cio/MultipartEvent;", "parseMultipart", "(LH5/A;Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/http/cio/HttpHeadersMap;J)LJ5/u;", "", "contentType", "contentLength", "(LH5/A;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)LJ5/u;", "totalLength", "(LH5/A;LT5/a;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/Long;J)LJ5/u;", "", "findBoundary", "(Ljava/lang/CharSequence;)I", "", "parseBoundaryInternal", "(Ljava/lang/CharSequence;)[B", "actual", "", "throwLimitExceeded", "(JJ)Ljava/lang/Void;", "CrLf", "LT5/a;", "", "PrefixChar", "B", "PrefixString", "ktor-http-cio"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultipartKt {
    private static final T5.a CrLf = new T5.a(StringsKt.toByteArray$default(ServerSentEventKt.END_OF_LINE, null, 1, null), 0);
    private static final byte PrefixChar = 45;
    private static final T5.a PrefixString = new T5.a(new byte[]{PrefixChar, PrefixChar});

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LJ5/t;", "Lio/ktor/http/cio/MultipartEvent;", "LO3/C;", "<anonymous>", "(LJ5/t;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.MultipartKt$parseMultipart$1", f = "Multipart.kt", l = {208, 211, 214, 215, 218, 225, 229, 236, 248, 249, 256, 256, 259, 261}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.MultipartKt$parseMultipart$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ T5.a $boundaryPrefixed;
        final /* synthetic */ ByteReadChannel $input;
        final /* synthetic */ long $maxPartSize;
        final /* synthetic */ Long $totalLength;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, T5.a aVar, long j7, Long l7, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$input = byteReadChannel;
            this.$boundaryPrefixed = aVar;
            this.$maxPartSize = j7;
            this.$totalLength = l7;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$input, this.$boundaryPrefixed, this.$maxPartSize, this.$totalLength, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(t tVar, c<? super C> cVar) {
            return ((AnonymousClass1) create(tVar, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:118:0x0353, code lost:
        
            if (((J5.j) r0).f4337n.send(r2, r20) != r7) goto L130;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0388, code lost:
        
            if (((J5.j) r0).f4337n.send(r2, r20) == r7) goto L129;
         */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02d5 A[PHI: r0 r3 r8 r12
          0x02d5: PHI (r0v16 long) = (r0v33 long), (r0v34 long) binds: [B:50:0x01dd, B:45:0x01b8] A[DONT_GENERATE, DONT_INLINE]
          0x02d5: PHI (r3v24 io.ktor.utils.io.CountedByteReadChannel) = (r3v40 io.ktor.utils.io.CountedByteReadChannel), (r3v41 io.ktor.utils.io.CountedByteReadChannel) binds: [B:50:0x01dd, B:45:0x01b8] A[DONT_GENERATE, DONT_INLINE]
          0x02d5: PHI (r8v1 long) = (r8v8 long), (r8v9 long) binds: [B:50:0x01dd, B:45:0x01b8] A[DONT_GENERATE, DONT_INLINE]
          0x02d5: PHI (r12v11 H5.A) = (r12v17 H5.A), (r12v18 H5.A) binds: [B:50:0x01dd, B:45:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x030d  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0317  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x035e  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0375  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00e1 A[PHI: r0 r2 r3 r4 r5 r8
          0x00e1: PHI (r0v31 long) = (r0v11 long), (r0v32 long) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r2v27 T5.a) = (r2v12 T5.a), (r2v29 T5.a) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r3v37 io.ktor.utils.io.CountedByteReadChannel) = (r3v17 io.ktor.utils.io.CountedByteReadChannel), (r3v39 io.ktor.utils.io.CountedByteReadChannel) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r4v44 H5.A) = (r4v26 H5.A), (r4v48 H5.A) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r5v12 java.lang.Object) = (r5v4 java.lang.Object), (r5v18 java.lang.Object) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r8v6 long) = (r8v0 long), (r8v7 long) binds: [B:23:0x00ce, B:56:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01b4 A[PHI: r0 r2 r3 r8 r12
          0x01b4: PHI (r0v34 long) = (r0v5 long), (r0v7 long), (r0v31 long), (r0v35 long) binds: [B:38:0x0193, B:43:0x01b3, B:59:0x0210, B:79:0x02a0] A[DONT_GENERATE, DONT_INLINE]
          0x01b4: PHI (r2v31 T5.a) = (r2v1 T5.a), (r2v4 T5.a), (r2v27 T5.a), (r2v32 T5.a) binds: [B:38:0x0193, B:43:0x01b3, B:59:0x0210, B:79:0x02a0] A[DONT_GENERATE, DONT_INLINE]
          0x01b4: PHI (r3v41 io.ktor.utils.io.CountedByteReadChannel) = 
          (r3v6 io.ktor.utils.io.CountedByteReadChannel)
          (r3v9 io.ktor.utils.io.CountedByteReadChannel)
          (r3v37 io.ktor.utils.io.CountedByteReadChannel)
          (r3v44 io.ktor.utils.io.CountedByteReadChannel)
         binds: [B:38:0x0193, B:43:0x01b3, B:59:0x0210, B:79:0x02a0] A[DONT_GENERATE, DONT_INLINE]
          0x01b4: PHI (r8v9 long) = (r8v0 long), (r8v0 long), (r8v6 long), (r8v11 long) binds: [B:38:0x0193, B:43:0x01b3, B:59:0x0210, B:79:0x02a0] A[DONT_GENERATE, DONT_INLINE]
          0x01b4: PHI (r12v18 H5.A) = (r12v2 H5.A), (r12v4 H5.A), (r12v16 H5.A), (r12v20 H5.A) binds: [B:38:0x0193, B:43:0x01b3, B:59:0x0210, B:79:0x02a0] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0213  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x025f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0271 A[Catch: all -> 0x02b0, TRY_LEAVE, TryCatch #0 {all -> 0x02b0, blocks: (B:70:0x0268, B:72:0x0271), top: B:132:0x0268 }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x02b3  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0210 -> B:44:0x01b4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0298 -> B:138:0x029d). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 944
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {132, 133, 133, 136}, m = "parsePartBodyImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.MultipartKt$parsePartBodyImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12281 extends U3.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C12281(c<? super C12281> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.parsePartBodyImpl(null, null, null, null, 0L, this);
        }
    }

    @e(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {113}, m = "parsePartHeadersImpl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12291 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12291(c<? super C12291> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.parsePartHeadersImpl(null, this);
        }
    }

    @e(c = "io.ktor.http.cio.MultipartKt", f = "Multipart.kt", l = {143}, m = "skipIfFoundReadCount")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12301 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C12301(c<? super C12301> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultipartKt.skipIfFoundReadCount(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final int findBoundary(java.lang.CharSequence r13) {
        /*
            int r0 = r13.length()
            r1 = 0
            r3 = r1
            r8 = r3
            r9 = r8
        L8:
            if (r3 >= r0) goto L79
            char r2 = r13.charAt(r3)
            r4 = 59
            r5 = 1
            if (r8 == 0) goto L6d
            r6 = 44
            r7 = 2
            if (r8 == r5) goto L42
            r10 = 34
            r11 = 3
            if (r8 == r7) goto L36
            r4 = 4
            if (r8 == r11) goto L28
            if (r8 == r4) goto L23
            goto L30
        L23:
            r6 = r3
            r8 = r11
        L25:
            r3 = r13
            goto L73
        L28:
            if (r2 == r10) goto L32
            r5 = 92
            if (r2 == r5) goto L2f
            goto L30
        L2f:
            r8 = r4
        L30:
            r6 = r3
            goto L25
        L32:
            r9 = r1
            r6 = r3
            r8 = r5
            goto L25
        L36:
            if (r2 == r10) goto L23
            if (r2 == r6) goto L40
            if (r2 == r4) goto L3d
            goto L30
        L3d:
            r9 = r1
            r8 = r5
            goto L30
        L40:
            r8 = r1
            goto L30
        L42:
            r5 = 61
            if (r2 != r5) goto L49
            r6 = r3
            r8 = r7
            goto L25
        L49:
            if (r2 != r4) goto L4d
            r9 = r1
            goto L30
        L4d:
            if (r2 != r6) goto L50
            goto L40
        L50:
            r4 = 32
            if (r2 == r4) goto L30
            if (r9 != 0) goto L68
            r5 = 0
            java.lang.String r4 = "boundary="
            int r6 = r4.length()
            r7 = 1
            r2 = r13
            boolean r13 = z5.AbstractC2510o.n0(r2, r3, r4, r5, r6, r7)
            r6 = r3
            r3 = r2
            if (r13 == 0) goto L6a
            return r6
        L68:
            r6 = r3
            r3 = r13
        L6a:
            int r9 = r9 + 1
            goto L73
        L6d:
            r6 = r3
            r3 = r13
            if (r2 != r4) goto L73
            r9 = r1
            r8 = r5
        L73:
            int r13 = r6 + 1
            r12 = r3
            r3 = r13
            r13 = r12
            goto L8
        L79:
            r13 = -1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.findBoundary(java.lang.CharSequence):int");
    }

    public static final byte[] parseBoundaryInternal(CharSequence charSequence) throws IOException {
        l.f("contentType", charSequence);
        int iFindBoundary = findBoundary(charSequence);
        if (iFindBoundary == -1) {
            throw new IOException("Failed to parse multipart: Content-Type's boundary parameter is missing");
        }
        byte[] bArr = new byte[74];
        v vVar = new v();
        parseBoundaryInternal$put(vVar, bArr, (byte) 13);
        parseBoundaryInternal$put(vVar, bArr, (byte) 10);
        parseBoundaryInternal$put(vVar, bArr, PrefixChar);
        parseBoundaryInternal$put(vVar, bArr, PrefixChar);
        int length = charSequence.length();
        char c2 = 0;
        for (int i7 = iFindBoundary + 9; i7 < length; i7++) {
            char cCharAt = charSequence.charAt(i7);
            int i8 = 65535 & cCharAt;
            if (i8 > 127) {
                StringBuilder sb = new StringBuilder("Failed to parse multipart: wrong boundary byte 0x");
                AbstractC0915m.k(16);
                String string = Integer.toString(i8, 16);
                l.e("toString(...)", string);
                sb.append(string);
                sb.append(" - should be 7bit character");
                throw new IOException(sb.toString());
            }
            char c4 = 1;
            if (c2 != 0) {
                if (c2 != 1) {
                    c4 = 3;
                    if (c2 == 2) {
                        if (cCharAt == '\"') {
                            break;
                        }
                        if (cCharAt != '\\') {
                            parseBoundaryInternal$put(vVar, bArr, (byte) i8);
                        } else {
                            c2 = c4;
                        }
                    } else if (c2 == 3) {
                        parseBoundaryInternal$put(vVar, bArr, (byte) i8);
                        c2 = 2;
                    }
                } else {
                    if (cCharAt == ' ' || cCharAt == ',' || cCharAt == ';') {
                        break;
                    }
                    parseBoundaryInternal$put(vVar, bArr, (byte) i8);
                }
            } else if (cCharAt == ' ') {
                continue;
            } else {
                if (cCharAt != '\"') {
                    if (cCharAt == ',' || cCharAt == ';') {
                        break;
                    }
                    parseBoundaryInternal$put(vVar, bArr, (byte) i8);
                    c2 = c4;
                }
                c2 = 2;
            }
        }
        int i9 = vVar.f12718k;
        if (i9 != 4) {
            return m.a0(bArr, 0, i9);
        }
        throw new IOException("Empty multipart boundary is not allowed");
    }

    private static final void parseBoundaryInternal$put(v vVar, byte[] bArr, byte b4) throws IOException {
        int i7 = vVar.f12718k;
        if (i7 >= bArr.length) {
            throw new IOException("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
        vVar.f12718k = i7 + 1;
        bArr[i7] = b4;
    }

    public static final u parseMultipart(A a, ByteReadChannel byteReadChannel, HttpHeadersMap httpHeadersMap, long j7) throws UnsupportedMediaTypeExceptionCIO {
        l.f("<this>", a);
        l.f("input", byteReadChannel);
        l.f("headers", httpHeadersMap);
        CharSequence charSequence = httpHeadersMap.get("Content-Type");
        if (charSequence == null) {
            throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: no Content-Type header");
        }
        CharSequence charSequence2 = httpHeadersMap.get("Content-Length");
        return parseMultipart(a, byteReadChannel, charSequence, charSequence2 != null ? Long.valueOf(CharsKt.parseDecLong(charSequence2)) : null, j7);
    }

    public static /* synthetic */ u parseMultipart$default(A a, ByteReadChannel byteReadChannel, HttpHeadersMap httpHeadersMap, long j7, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return parseMultipart(a, byteReadChannel, httpHeadersMap, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
    
        if (r3.flush(r6) != r7) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parsePartBodyImpl(T5.a r19, io.ktor.utils.io.ByteReadChannel r20, io.ktor.utils.io.ByteWriteChannel r21, io.ktor.http.cio.HttpHeadersMap r22, long r23, S3.c<? super java.lang.Long> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.parsePartBodyImpl(T5.a, io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel, io.ktor.http.cio.HttpHeadersMap, long, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object parsePartHeadersImpl(io.ktor.utils.io.ByteReadChannel r7, S3.c<? super io.ktor.http.cio.HttpHeadersMap> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof io.ktor.http.cio.MultipartKt.C12291
            if (r0 == 0) goto L14
            r0 = r8
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = (io.ktor.http.cio.MultipartKt.C12291) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1 r0 = new io.ktor.http.cio.MultipartKt$parsePartHeadersImpl$1
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.result
            T3.a r0 = T3.a.f9048k
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            java.lang.Object r7 = r4.L$0
            io.ktor.http.cio.internals.CharArrayBuilder r7 = (io.ktor.http.cio.internals.CharArrayBuilder) r7
            P3.r.Y(r8)     // Catch: java.lang.Throwable -> L2d
            goto L52
        L2d:
            r0 = move-exception
            r8 = r0
            goto L62
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            P3.r.Y(r8)
            r8 = r2
            io.ktor.http.cio.internals.CharArrayBuilder r2 = new io.ktor.http.cio.internals.CharArrayBuilder
            r1 = 0
            r2.<init>(r1, r8, r1)
            r4.L$0 = r2     // Catch: java.lang.Throwable -> L5f
            r4.label = r8     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            java.lang.Object r8 = io.ktor.http.cio.HttpParserKt.parseHeaders$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5f
            if (r8 != r0) goto L51
            return r0
        L51:
            r7 = r2
        L52:
            io.ktor.http.cio.HttpHeadersMap r8 = (io.ktor.http.cio.HttpHeadersMap) r8     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L57
            return r8
        L57:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            throw r8     // Catch: java.lang.Throwable -> L2d
        L5f:
            r0 = move-exception
            r8 = r0
            r7 = r2
        L62:
            r7.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.parsePartHeadersImpl(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object parsePreambleImpl(T5.a aVar, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, c<? super Long> cVar) {
        return ByteReadChannelOperationsKt.readUntil(byteReadChannel, aVar, byteWriteChannel, j7, true, cVar);
    }

    public static /* synthetic */ Object parsePreambleImpl$default(T5.a aVar, ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j7, c cVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return parsePreambleImpl(aVar, byteReadChannel, byteWriteChannel, j7, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object skipIfFoundReadCount(io.ktor.utils.io.ByteReadChannel r4, T5.a r5, S3.c<? super java.lang.Long> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof io.ktor.http.cio.MultipartKt.C12301
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = (io.ktor.http.cio.MultipartKt.C12301) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1 r0 = new io.ktor.http.cio.MultipartKt$skipIfFoundReadCount$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            r5 = r4
            T5.a r5 = (T5.a) r5
            P3.r.Y(r6)
            goto L42
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            P3.r.Y(r6)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = io.ktor.utils.io.ByteReadChannelOperationsKt.skipIfFound(r4, r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4f
            byte[] r4 = r5.f9118k
            int r4 = r4.length
            long r4 = (long) r4
            goto L51
        L4f:
            r4 = 0
        L51:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.MultipartKt.skipIfFoundReadCount(io.ktor.utils.io.ByteReadChannel, T5.a, S3.c):java.lang.Object");
    }

    private static final Void throwLimitExceeded(long j7, long j8) throws IOException {
        throw new IOException(A6.b.f(j8, "; limit is defined using 'formFieldLimit' argument", A6.b.k("Multipart content length exceeds limit ", j7, " > ")));
    }

    public static /* synthetic */ u parseMultipart$default(A a, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l7, long j7, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            j7 = Long.MAX_VALUE;
        }
        return parseMultipart(a, byteReadChannel, charSequence, l7, j7);
    }

    public static final u parseMultipart(A a, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l7, long j7) throws UnsupportedMediaTypeExceptionCIO {
        l.f("<this>", a);
        l.f("input", byteReadChannel);
        l.f("contentType", charSequence);
        if (ContentType.MultiPart.INSTANCE.contains(charSequence)) {
            return parseMultipart(a, new T5.a(parseBoundaryInternal(charSequence), 0), byteReadChannel, l7, j7);
        }
        throw new UnsupportedMediaTypeExceptionCIO("Failed to parse multipart: Content-Type should be multipart/* but it is " + ((Object) charSequence));
    }

    private static final u parseMultipart(A a, T5.a aVar, ByteReadChannel byteReadChannel, Long l7, long j7) {
        n anonymousClass1 = new AnonymousClass1(byteReadChannel, aVar, j7, l7, null);
        i iVar = i.f8767k;
        J5.c cVar = J5.c.f4299k;
        B b4 = B.f3790k;
        s sVar = new s(D.y(a, iVar), F.a(0, 4, cVar), true, true);
        sVar.b0(b4, sVar, anonymousClass1);
        return sVar;
    }
}
