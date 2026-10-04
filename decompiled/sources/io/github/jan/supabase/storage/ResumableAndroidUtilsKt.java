package io.github.jan.supabase.storage;

import O3.C;
import P3.r;
import U3.j;
import android.annotation.SuppressLint;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import e4.k;
import e4.n;
import io.github.jan.supabase.storage.resumable.ResumableClient;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.jvm.javaio.ReadingKt;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086@¢\u0006\u0002\u0010\f\u001a.\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e*\u00020\u0006H\u0083@¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0014\u001a\u00020\u000f*\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"createOrContinueUpload", "Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "Lio/github/jan/supabase/storage/resumable/ResumableClient;", "path", "", "uri", "Landroid/net/Uri;", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lio/github/jan/supabase/storage/resumable/ResumableClient;Ljava/lang/String;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createByteReader", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/ByteReadChannel;", "", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "contentSize", "getContentSize", "(Landroid/net/Uri;)J", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResumableAndroidUtilsKt {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "offset", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createByteReader$2", f = "ResumableAndroidUtils.kt", l = {23}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createByteReader$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ Uri $this_createByteReader;
        int I$0;
        /* synthetic */ long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Uri uri, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_createByteReader = uri;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_createByteReader, cVar);
            anonymousClass2.J$0 = ((Number) obj).longValue();
            return anonymousClass2;
        }

        public final Object invoke(long j7, S3.c<? super ByteReadChannel> cVar) {
            return ((AnonymousClass2) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
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
                ByteReadChannel byteReadChannel = (ByteReadChannel) this.L$2;
                r.Y(obj);
                return byteReadChannel;
            }
            r.Y(obj);
            InputStream inputStreamOpenInputStream = ContextKt.applicationContext().getContentResolver().openInputStream(this.$this_createByteReader);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalArgumentException("Uri is not readable");
            }
            ByteReadChannel byteReadChannelWithArrayPool$default = ReadingKt.toByteReadChannelWithArrayPool$default(inputStreamOpenInputStream, null, null, 3, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = byteReadChannelWithArrayPool$default;
            this.L$3 = null;
            this.J$0 = j7;
            this.I$0 = 0;
            this.label = 1;
            return ByteReadChannelOperationsKt.discard(byteReadChannelWithArrayPool$default, j7, this) == aVar ? aVar : byteReadChannelWithArrayPool$default;
        }

        @Override // e4.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (S3.c<? super ByteReadChannel>) obj2);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.ResumableAndroidUtilsKt", f = "ResumableAndroidUtils.kt", l = {17, 17}, m = "createOrContinueUpload", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createOrContinueUpload$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ResumableAndroidUtilsKt.createOrContinueUpload(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Recycle"})
    public static final Object createByteReader(Uri uri, S3.c<? super n> cVar) {
        return new AnonymousClass2(uri, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object createOrContinueUpload(io.github.jan.supabase.storage.resumable.ResumableClient r9, java.lang.String r10, android.net.Uri r11, e4.k r12, S3.c<? super io.github.jan.supabase.storage.resumable.ResumableUpload> r13) throws java.lang.Throwable {
        /*
            boolean r0 = r13 instanceof io.github.jan.supabase.storage.ResumableAndroidUtilsKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r13
            io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createOrContinueUpload$1 r0 = (io.github.jan.supabase.storage.ResumableAndroidUtilsKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createOrContinueUpload$1 r0 = new io.github.jan.supabase.storage.ResumableAndroidUtilsKt$createOrContinueUpload$1
            r0.<init>(r13)
            goto L12
        L1a:
            java.lang.Object r13 = r8.result
            T3.a r0 = T3.a.f9048k
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L62
            if (r1 == r3) goto L45
            if (r1 != r2) goto L3d
            java.lang.Object r9 = r8.L$3
            e4.k r9 = (e4.k) r9
            java.lang.Object r9 = r8.L$2
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.Object r9 = r8.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r8.L$0
            io.github.jan.supabase.storage.resumable.ResumableClient r9 = (io.github.jan.supabase.storage.resumable.ResumableClient) r9
            P3.r.Y(r13)
            return r13
        L3d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L45:
            java.lang.Object r9 = r8.L$4
            io.github.jan.supabase.storage.resumable.ResumableClient r9 = (io.github.jan.supabase.storage.resumable.ResumableClient) r9
            java.lang.Object r10 = r8.L$3
            r12 = r10
            e4.k r12 = (e4.k) r12
            java.lang.Object r10 = r8.L$2
            r11 = r10
            android.net.Uri r11 = (android.net.Uri) r11
            java.lang.Object r10 = r8.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r8.L$0
            io.github.jan.supabase.storage.resumable.ResumableClient r1 = (io.github.jan.supabase.storage.resumable.ResumableClient) r1
            P3.r.Y(r13)
        L5e:
            r1 = r9
            r6 = r10
            r7 = r12
            goto L78
        L62:
            P3.r.Y(r13)
            r8.L$0 = r4
            r8.L$1 = r10
            r8.L$2 = r11
            r8.L$3 = r12
            r8.L$4 = r9
            r8.label = r3
            java.lang.Object r13 = createByteReader(r11, r8)
            if (r13 != r0) goto L5e
            goto L9b
        L78:
            e4.n r13 = (e4.n) r13
            java.lang.String r3 = r11.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.l.e(r9, r3)
            long r9 = getContentSize(r11)
            r8.L$0 = r4
            r8.L$1 = r4
            r8.L$2 = r4
            r8.L$3 = r4
            r8.L$4 = r4
            r8.label = r2
            r4 = r9
            r2 = r13
            java.lang.Object r9 = r1.createOrContinueUpload(r2, r3, r4, r6, r7, r8)
            if (r9 != r0) goto L9c
        L9b:
            return r0
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.ResumableAndroidUtilsKt.createOrContinueUpload(io.github.jan.supabase.storage.resumable.ResumableClient, java.lang.String, android.net.Uri, e4.k, S3.c):java.lang.Object");
    }

    public static /* synthetic */ Object createOrContinueUpload$default(ResumableClient resumableClient, String str, Uri uri, k kVar, S3.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new f(21);
        }
        return createOrContinueUpload(resumableClient, str, uri, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C createOrContinueUpload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    @SuppressLint({"Recycle"})
    public static final long getContentSize(Uri uri) throws IOException {
        l.f("<this>", uri);
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = ContextKt.applicationContext().getContentResolver().openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor == null) {
            throw new IllegalStateException("Could not open file descriptor");
        }
        try {
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            assetFileDescriptorOpenAssetFileDescriptor.close();
            return length;
        } finally {
        }
    }
}
