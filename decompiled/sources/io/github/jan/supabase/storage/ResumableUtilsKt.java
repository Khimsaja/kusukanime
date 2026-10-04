package io.github.jan.supabase.storage;

import H5.G;
import O3.C;
import P3.r;
import U3.j;
import e4.k;
import e4.n;
import e4.o;
import io.github.jan.supabase.storage.resumable.ResumableClient;
import io.github.jan.supabase.storage.resumable.ResumableUpload;
import io.ktor.util.cio.FileChannelsAtNioPathKt;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\r2\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\u000e\u001a\u001e\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00110\u0010*\u00020\u0002H\u0086@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"createOrContinueUpload", "Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "Lio/github/jan/supabase/storage/resumable/ResumableClient;", "path", "", "file", "Ljava/io/File;", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/storage/resumable/ResumableClient;Ljava/lang/String;Ljava/io/File;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/nio/file/Path;", "(Lio/github/jan/supabase/storage/resumable/ResumableClient;Ljava/lang/String;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "continuePreviousFileUploads", "", "Lkotlinx/coroutines/Deferred;", "(Lio/github/jan/supabase/storage/resumable/ResumableClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResumableUtilsKt {

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "source", "", "offset", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.ResumableUtilsKt$continuePreviousFileUploads$2", f = "ResumableUtils.kt", l = {36}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.ResumableUtilsKt$continuePreviousFileUploads$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements o {
        int I$0;
        /* synthetic */ long J$0;
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass2(S3.c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        @Override // e4.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((String) obj, ((Number) obj2).longValue(), (S3.c<? super ByteReadChannel>) obj3);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.L$0;
            long j7 = this.J$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$1;
                r.Y(obj);
                return byteReadChannel;
            }
            r.Y(obj);
            ByteReadChannel channel$default = FileChannelsKt.readChannel$default(new File(str), 0L, 0L, null, 7, null);
            this.L$0 = null;
            this.L$1 = channel$default;
            this.L$2 = null;
            this.J$0 = j7;
            this.I$0 = 0;
            this.label = 1;
            return ByteReadChannelOperationsKt.discard(channel$default, j7, this) == aVar ? aVar : channel$default;
        }

        public final Object invoke(String str, long j7, S3.c<? super ByteReadChannel> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = str;
            anonymousClass2.J$0 = j7;
            return anonymousClass2.invokeSuspend(C.a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.ResumableUtilsKt$createOrContinueUpload$3", f = "ResumableUtils.kt", l = {20}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.ResumableUtilsKt$createOrContinueUpload$3, reason: invalid class name */
    public static final class AnonymousClass3 extends j implements n {
        final /* synthetic */ File $file;
        int I$0;
        /* synthetic */ long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file, S3.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$file = file;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$file, cVar);
            anonymousClass3.J$0 = ((Number) obj).longValue();
            return anonymousClass3;
        }

        public final Object invoke(long j7, S3.c<? super ByteReadChannel> cVar) {
            return ((AnonymousClass3) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j7 = this.J$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
                r.Y(obj);
                return byteReadChannel;
            }
            r.Y(obj);
            ByteReadChannel channel$default = FileChannelsKt.readChannel$default(this.$file, 0L, 0L, null, 7, null);
            this.L$0 = channel$default;
            this.L$1 = null;
            this.J$0 = j7;
            this.I$0 = 0;
            this.label = 1;
            return ByteReadChannelOperationsKt.discard(channel$default, j7, this) == aVar ? aVar : channel$default;
        }

        @Override // e4.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (S3.c<? super ByteReadChannel>) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.ResumableUtilsKt$createOrContinueUpload$6", f = "ResumableUtils.kt", l = {29}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.ResumableUtilsKt$createOrContinueUpload$6, reason: invalid class name */
    public static final class AnonymousClass6 extends j implements n {
        final /* synthetic */ Path $file;
        int I$0;
        /* synthetic */ long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Path path, S3.c<? super AnonymousClass6> cVar) {
            super(2, cVar);
            this.$file = path;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$file, cVar);
            anonymousClass6.J$0 = ((Number) obj).longValue();
            return anonymousClass6;
        }

        public final Object invoke(long j7, S3.c<? super ByteReadChannel> cVar) {
            return ((AnonymousClass6) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j7 = this.J$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$0;
                r.Y(obj);
                return byteReadChannel;
            }
            r.Y(obj);
            ByteReadChannel channel$default = FileChannelsAtNioPathKt.readChannel$default(this.$file, 0L, 0L, null, 7, null);
            this.L$0 = channel$default;
            this.L$1 = null;
            this.J$0 = j7;
            this.I$0 = 0;
            this.label = 1;
            return ByteReadChannelOperationsKt.discard(channel$default, j7, this) == aVar ? aVar : channel$default;
        }

        @Override // e4.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (S3.c<? super ByteReadChannel>) obj2);
        }
    }

    public static final Object continuePreviousFileUploads(ResumableClient resumableClient, S3.c<? super List<? extends G>> cVar) {
        return resumableClient.continuePreviousUploads(new AnonymousClass2(null), cVar);
    }

    public static final Object createOrContinueUpload(ResumableClient resumableClient, String str, File file, k kVar, S3.c<? super ResumableUpload> cVar) {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(file, null);
        String absolutePath = file.getAbsolutePath();
        l.e("getAbsolutePath(...)", absolutePath);
        return resumableClient.createOrContinueUpload(anonymousClass3, absolutePath, file.length(), str, kVar, cVar);
    }

    public static /* synthetic */ Object createOrContinueUpload$default(ResumableClient resumableClient, String str, File file, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(22);
        }
        return createOrContinueUpload(resumableClient, str, file, kVar, (S3.c<? super ResumableUpload>) cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C createOrContinueUpload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C createOrContinueUpload$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final Object createOrContinueUpload(ResumableClient resumableClient, String str, Path path, k kVar, S3.c<? super ResumableUpload> cVar) {
        return resumableClient.createOrContinueUpload(new AnonymousClass6(path, null), path.toAbsolutePath().toString(), Files.size(path), str, kVar, cVar);
    }

    public static /* synthetic */ Object createOrContinueUpload$default(ResumableClient resumableClient, String str, Path path, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(23);
        }
        return createOrContinueUpload(resumableClient, str, path, kVar, (S3.c<? super ResumableUpload>) cVar);
    }
}
