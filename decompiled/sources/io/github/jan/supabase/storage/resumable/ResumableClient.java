package io.github.jan.supabase.storage.resumable;

import H5.G;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.k;
import e4.n;
import e4.o;
import io.github.jan.supabase.storage.UploadOptionBuilder;
import io.github.jan.supabase.storage.f;
import io.ktor.http.ContentDisposition;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJt\u0010\u0002\u001a\u00020\u000321\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\r2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H¦@¢\u0006\u0002\u0010\u0015JA\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0019\b\u0002\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0014H\u0096@¢\u0006\u0002\u0010\u0018Jb\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001b0\u001a2F\u0010\u001c\u001aB\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH¦@¢\u0006\u0002\u0010\u001e¨\u0006 À\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableClient;", "", "createOrContinueUpload", "Lio/github/jan/supabase/storage/resumable/ResumableUpload;", "channel", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", ContentDisposition.Parameters.Name, "offset", "Lkotlin/coroutines/Continuation;", "Lio/ktor/utils/io/ByteReadChannel;", "source", "", ContentDisposition.Parameters.Size, "path", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;JLjava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "", "([BLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "continuePreviousUploads", "", "Lkotlinx/coroutines/Deferred;", "channelProducer", "Lkotlin/Function3;", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ResumableClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String TUS_VERSION = "1.0.0";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lio/github/jan/supabase/storage/resumable/ResumableClient$Companion;", "", "<init>", "()V", "TUS_VERSION", "", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String TUS_VERSION = "1.0.0";

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object createOrContinueUpload(ResumableClient resumableClient, byte[] bArr, String str, String str2, k kVar, c<? super ResumableUpload> cVar) {
            return ResumableClient.super.createOrContinueUpload(bArr, str, str2, kVar, cVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClient$createOrContinueUpload$4", f = "ResumableClient.kt", l = {57}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClient$createOrContinueUpload$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements n {
        final /* synthetic */ byte[] $data;
        int I$0;
        /* synthetic */ long J$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(byte[] bArr, c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$data = bArr;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$data, cVar);
            anonymousClass4.J$0 = ((Number) obj).longValue();
            return anonymousClass4;
        }

        public final Object invoke(long j7, c<? super ByteReadChannel> cVar) {
            return ((AnonymousClass4) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j7 = this.J$0;
            a aVar = a.f9048k;
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
            ByteReadChannel byteReadChannelByteReadChannel$default = ByteChannelCtorKt.ByteReadChannel$default(this.$data, 0, 0, 6, null);
            this.L$0 = byteReadChannelByteReadChannel$default;
            this.L$1 = null;
            this.J$0 = j7;
            this.I$0 = 0;
            this.label = 1;
            return ByteReadChannelOperationsKt.discard(byteReadChannelByteReadChannel$default, j7, this) == aVar ? aVar : byteReadChannelByteReadChannel$default;
        }

        @Override // e4.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (c<? super ByteReadChannel>) obj2);
        }
    }

    static /* synthetic */ Object createOrContinueUpload$default(ResumableClient resumableClient, n nVar, String str, long j7, String str2, k kVar, c cVar, int i7, Object obj) {
        if (obj == null) {
            return resumableClient.createOrContinueUpload(nVar, str, j7, str2, (i7 & 16) != 0 ? new f(26) : kVar, cVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrContinueUpload");
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C createOrContinueUpload$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C createOrContinueUpload$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    static /* synthetic */ Object createOrContinueUpload$suspendImpl(ResumableClient resumableClient, byte[] bArr, String str, String str2, k kVar, c<? super ResumableUpload> cVar) {
        return createOrContinueUpload$default(resumableClient, new AnonymousClass4(bArr, null), str, bArr.length, str2, null, cVar, 16, null);
    }

    Object continuePreviousUploads(o oVar, c<? super List<? extends G>> cVar);

    Object createOrContinueUpload(n nVar, String str, long j7, String str2, k kVar, c<? super ResumableUpload> cVar);

    default Object createOrContinueUpload(byte[] bArr, String str, String str2, k kVar, c<? super ResumableUpload> cVar) {
        return createOrContinueUpload$suspendImpl(this, bArr, str, str2, kVar, cVar);
    }

    static /* synthetic */ Object createOrContinueUpload$default(ResumableClient resumableClient, byte[] bArr, String str, String str2, k kVar, c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOrContinueUpload");
        }
        if ((i7 & 8) != 0) {
            kVar = new f(27);
        }
        return resumableClient.createOrContinueUpload(bArr, str, str2, kVar, cVar);
    }
}
