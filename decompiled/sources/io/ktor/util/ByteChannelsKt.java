package io.ktor.util;

import H5.A;
import H5.D;
import H5.M;
import H5.Y;
import O3.C;
import P3.r;
import U3.e;
import U3.j;
import com.kusukanime.BuildConfig;
import e4.n;
import io.github.jan.supabase.auth.PKCEConstants;
import io.ktor.util.collections.ConcurrentMapKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "LH5/A;", "coroutineScope", "LO3/l;", "split", "(Lio/ktor/utils/io/ByteReadChannel;LH5/A;)LO3/l;", "Lio/ktor/utils/io/ByteWriteChannel;", "first", "second", "LO3/C;", "copyToBoth", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteWriteChannel;)V", "", "CHUNK_BUFFER_SIZE", "J", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ByteChannelsKt {
    private static final long CHUNK_BUFFER_SIZE = 4096;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.ByteChannelsKt$copyToBoth$1", f = "ByteChannels.kt", l = {PKCEConstants.VERIFIER_LENGTH, 66, 67, 81, 82, 81, 82, 81, 82}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.ByteChannelsKt$copyToBoth$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ByteWriteChannel $first;
        final /* synthetic */ ByteWriteChannel $second;
        final /* synthetic */ ByteReadChannel $this_copyToBoth;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$this_copyToBoth = byteReadChannel;
            this.$first = byteWriteChannel;
            this.$second = byteWriteChannel2;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return new AnonymousClass1(this.$this_copyToBoth, this.$first, this.$second, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
        
            if (r9.flushAndClose(r8) != r0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0153, code lost:
        
            if (r9.flushAndClose(r8) == r0) goto L77;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007c A[Catch: all -> 0x006e, TryCatch #5 {all -> 0x006e, blocks: (B:46:0x00f3, B:26:0x0074, B:28:0x007c, B:30:0x0084, B:32:0x008c, B:35:0x00a5, B:51:0x00fb, B:52:0x00fe, B:53:0x00ff, B:61:0x0129, B:21:0x006a, B:36:0x00ae, B:45:0x00ea, B:49:0x00f9), top: B:90:0x006a, inners: #2, #4 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0129 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x006e, blocks: (B:46:0x00f3, B:26:0x0074, B:28:0x007c, B:30:0x0084, B:32:0x008c, B:35:0x00a5, B:51:0x00fb, B:52:0x00fe, B:53:0x00ff, B:61:0x0129, B:21:0x006a, B:36:0x00ae, B:45:0x00ea, B:49:0x00f9), top: B:90:0x006a, inners: #2, #4 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00e8 -> B:46:0x00f3). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", l = {27, ConcurrentMapKt.INITIAL_CAPACITY}, m = "invokeSuspend")
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1, reason: invalid class name and case insensitive filesystem */
    public static final class C12391 extends j implements n {
        final /* synthetic */ ByteChannel $first;
        final /* synthetic */ ByteChannel $second;
        final /* synthetic */ ByteReadChannel $this_split;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", l = {BuildConfig.VERSION_CODE}, m = "invokeSuspend")
        /* renamed from: io.ktor.util.ByteChannelsKt$split$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00041 extends j implements n {
            final /* synthetic */ byte[] $buffer;
            final /* synthetic */ ByteChannel $first;
            final /* synthetic */ int $read;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(ByteChannel byteChannel, byte[] bArr, int i7, S3.c<? super C00041> cVar) {
                super(2, cVar);
                this.$first = byteChannel;
                this.$buffer = bArr;
                this.$read = i7;
            }

            @Override // U3.a
            public final S3.c<C> create(Object obj, S3.c<?> cVar) {
                return new C00041(this.$first, this.$buffer, this.$read, cVar);
            }

            @Override // e4.n
            public final Object invoke(A a, S3.c<? super C> cVar) {
                return ((C00041) create(a, cVar)).invokeSuspend(C.a);
            }

            @Override // U3.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                T3.a aVar = T3.a.f9048k;
                int i7 = this.label;
                if (i7 == 0) {
                    r.Y(obj);
                    ByteChannel byteChannel = this.$first;
                    byte[] bArr = this.$buffer;
                    int i8 = this.$read;
                    this.label = 1;
                    if (ByteWriteChannelOperationsKt.writeFully(byteChannel, bArr, 0, i8, this) == aVar) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
        @e(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", l = {31}, m = "invokeSuspend")
        /* renamed from: io.ktor.util.ByteChannelsKt$split$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends j implements n {
            final /* synthetic */ byte[] $buffer;
            final /* synthetic */ int $read;
            final /* synthetic */ ByteChannel $second;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ByteChannel byteChannel, byte[] bArr, int i7, S3.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.$second = byteChannel;
                this.$buffer = bArr;
                this.$read = i7;
            }

            @Override // U3.a
            public final S3.c<C> create(Object obj, S3.c<?> cVar) {
                return new AnonymousClass2(this.$second, this.$buffer, this.$read, cVar);
            }

            @Override // e4.n
            public final Object invoke(A a, S3.c<? super C> cVar) {
                return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
            }

            @Override // U3.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                T3.a aVar = T3.a.f9048k;
                int i7 = this.label;
                if (i7 == 0) {
                    r.Y(obj);
                    ByteChannel byteChannel = this.$second;
                    byte[] bArr = this.$buffer;
                    int i8 = this.$read;
                    this.label = 1;
                    if (ByteWriteChannelOperationsKt.writeFully(byteChannel, bArr, 0, i8, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12391(ByteReadChannel byteReadChannel, ByteChannel byteChannel, ByteChannel byteChannel2, S3.c<? super C12391> cVar) {
            super(2, cVar);
            this.$this_split = byteReadChannel;
            this.$first = byteChannel;
            this.$second = byteChannel2;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C12391 c12391 = new C12391(this.$this_split, this.$first, this.$second, cVar);
            c12391.L$0 = obj;
            return c12391;
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((C12391) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        
            if (H5.D.g(r13, r12) == r2) goto L30;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[Catch: all -> 0x00a7, TRY_LEAVE, TryCatch #2 {all -> 0x00a7, blocks: (B:18:0x0046, B:20:0x004e), top: B:55:0x0046 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #4 {all -> 0x009e, blocks: (B:26:0x0066, B:28:0x006e), top: B:58:0x0066 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:17:0x0045). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.ByteChannelsKt.C12391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void copyToBoth(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2) {
        l.f("<this>", byteReadChannel);
        l.f("first", byteWriteChannel);
        l.f("second", byteWriteChannel2);
        D.x(Y.f3831k, M.a, new AnonymousClass1(byteReadChannel, byteWriteChannel, byteWriteChannel2, null), 2).x(new a(3, byteWriteChannel, byteWriteChannel2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C copyToBoth$lambda$1(ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Throwable th) throws Throwable {
        C c2 = C.a;
        if (th == null) {
            return c2;
        }
        ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
        ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
        return c2;
    }

    public static final O3.l split(ByteReadChannel byteReadChannel, A a) {
        l.f("<this>", byteReadChannel);
        l.f("coroutineScope", a);
        ByteChannel byteChannel = new ByteChannel(true);
        ByteChannel byteChannel2 = new ByteChannel(true);
        D.x(a, null, new C12391(byteReadChannel, byteChannel, byteChannel2, null), 3).x(new a(4, byteChannel, byteChannel2));
        return new O3.l(byteChannel, byteChannel2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C split$lambda$0(ByteChannel byteChannel, ByteChannel byteChannel2, Throwable th) {
        C c2 = C.a;
        if (th == null) {
            return c2;
        }
        byteChannel.cancel(th);
        byteChannel2.cancel(th);
        return c2;
    }
}
