package io.github.jan.supabase.storage;

import J5.t;
import K5.C0324c;
import K5.InterfaceC0329h;
import O3.C;
import P3.r;
import S3.i;
import U3.j;
import e4.k;
import e4.n;
import io.github.jan.supabase.storage.DownloadStatus;
import io.github.jan.supabase.storage.UploadStatus;
import io.ktor.client.content.ProgressListener;
import io.ktor.client.plugins.BodyProgressKt;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.utils.io.ByteChannelCtorKt;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0005¢\u0006\u0002\b\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001a+\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0005¢\u0006\u0002\b\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u0002\u001a;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00152\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aC\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00152\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a;\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a;\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00152\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aP\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\f*\u00020\r27\u0010\u0019\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0005¢\u0006\u0002\b\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0002¢\u0006\u0002\u0010\u001e\u001a3\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a3\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a;\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001a;\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#2\u0019\b\u0002\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aR\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\f*\u00020\r29\u0010\u0019\u001a5\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0005¢\u0006\u0002\b\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001aH\u0002¢\u0006\u0002\u0010\u001e¨\u0006%"}, d2 = {"downloadOverride", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;", "flowProducer", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/github/jan/supabase/storage/DownloadStatus;", "uploadOverride", "Lio/github/jan/supabase/storage/UploadStatus;", "updateAsFlow", "Lkotlinx/coroutines/flow/Flow;", "Lio/github/jan/supabase/storage/BucketApi;", "path", "", "data", "Lio/github/jan/supabase/storage/UploadData;", "options", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "uploadAsFlow", "", "uploadToSignedUrlAsFlow", "token", "uploadAsFlowRequest", "producer", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lio/github/jan/supabase/storage/FileUploadResponse;", "", "(Lio/github/jan/supabase/storage/BucketApi;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "downloadAuthenticatedAsFlow", "Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "downloadPublicAsFlow", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "downloadAsFlowRequest", "storage-kt_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FlowExtensionKt {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/github/jan/supabase/storage/DownloadStatus;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$downloadAsFlowRequest$1", f = "FlowExtension.kt", l = {223}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$downloadAsFlowRequest$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ n $producer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(n nVar, S3.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$producer = nVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$producer, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e4.n
        public final Object invoke(t tVar, S3.c<? super C> cVar) {
            return ((AnonymousClass1) create(tVar, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            t tVar = (t) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                n nVar = this.$producer;
                k kVarDownloadOverride = FlowExtensionKt.downloadOverride(tVar);
                this.L$0 = tVar;
                this.label = 1;
                obj = nVar.invoke(kVarDownloadOverride, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            byte[] bArr = (byte[]) obj;
            J5.j jVar = (J5.j) tVar;
            jVar.mo2trySendJP2dKIU(DownloadStatus.Success.INSTANCE);
            if (bArr != null) {
                jVar.mo2trySendJP2dKIU(DownloadStatus.ByteData.m52boximpl(DownloadStatus.ByteData.m53constructorimpl(bArr)));
            }
            jVar.close(null);
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$downloadAuthenticatedAsFlow$2", f = "FlowExtension.kt", l = {148}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$downloadAuthenticatedAsFlow$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_downloadAuthenticatedAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BucketApi bucketApi, String str, k kVar, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_downloadAuthenticatedAsFlow = bucketApi;
            this.$path = str;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, DownloadOptionBuilder downloadOptionBuilder) {
            kVar.invoke(downloadOptionBuilder);
            downloadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_downloadAuthenticatedAsFlow, this.$path, this.$options, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super byte[]> cVar) {
            return ((AnonymousClass2) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_downloadAuthenticatedAsFlow;
            String str = this.$path;
            g gVar = new g(this.$options, kVar, 0);
            this.L$0 = null;
            this.label = 1;
            Object objDownloadAuthenticated = bucketApi.downloadAuthenticated(str, gVar, this);
            return objDownloadAuthenticated == aVar ? aVar : objDownloadAuthenticated;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$downloadAuthenticatedAsFlow$4", f = "FlowExtension.kt", l = {190}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$downloadAuthenticatedAsFlow$4, reason: invalid class name */
    public static final class AnonymousClass4 extends j implements n {
        final /* synthetic */ ByteWriteChannel $channel;
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_downloadAuthenticatedAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.$this_downloadAuthenticatedAsFlow = bucketApi;
            this.$path = str;
            this.$channel = byteWriteChannel;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, DownloadOptionBuilder downloadOptionBuilder) {
            kVar.invoke(downloadOptionBuilder);
            downloadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.$this_downloadAuthenticatedAsFlow, this.$path, this.$channel, this.$options, cVar);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super byte[]> cVar) {
            return ((AnonymousClass4) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return null;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_downloadAuthenticatedAsFlow;
            String str = this.$path;
            ByteWriteChannel byteWriteChannel = this.$channel;
            g gVar = new g(this.$options, kVar, 1);
            this.L$0 = null;
            this.label = 1;
            if (bucketApi.downloadAuthenticated(str, byteWriteChannel, gVar, this) == aVar) {
                return aVar;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$downloadPublicAsFlow$2", f = "FlowExtension.kt", l = {168}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$downloadPublicAsFlow$2, reason: invalid class name and case insensitive filesystem */
    public static final class C11432 extends j implements n {
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_downloadPublicAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11432(BucketApi bucketApi, String str, k kVar, S3.c<? super C11432> cVar) {
            super(2, cVar);
            this.$this_downloadPublicAsFlow = bucketApi;
            this.$path = str;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, DownloadOptionBuilder downloadOptionBuilder) {
            kVar.invoke(downloadOptionBuilder);
            downloadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11432 c11432 = new C11432(this.$this_downloadPublicAsFlow, this.$path, this.$options, cVar);
            c11432.L$0 = obj;
            return c11432;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super byte[]> cVar) {
            return ((C11432) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_downloadPublicAsFlow;
            String str = this.$path;
            g gVar = new g(this.$options, kVar, 2);
            this.L$0 = null;
            this.label = 1;
            Object objDownloadPublic = bucketApi.downloadPublic(str, gVar, this);
            return objDownloadPublic == aVar ? aVar : objDownloadPublic;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$downloadPublicAsFlow$4", f = "FlowExtension.kt", l = {212}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$downloadPublicAsFlow$4, reason: invalid class name and case insensitive filesystem */
    public static final class C11444 extends j implements n {
        final /* synthetic */ ByteWriteChannel $channel;
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_downloadPublicAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11444(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C11444> cVar) {
            super(2, cVar);
            this.$this_downloadPublicAsFlow = bucketApi;
            this.$path = str;
            this.$channel = byteWriteChannel;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, DownloadOptionBuilder downloadOptionBuilder) {
            kVar.invoke(downloadOptionBuilder);
            downloadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11444 c11444 = new C11444(this.$this_downloadPublicAsFlow, this.$path, this.$channel, this.$options, cVar);
            c11444.L$0 = obj;
            return c11444;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super byte[]> cVar) {
            return ((C11444) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return null;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_downloadPublicAsFlow;
            String str = this.$path;
            ByteWriteChannel byteWriteChannel = this.$channel;
            g gVar = new g(this.$options, kVar, 3);
            this.L$0 = null;
            this.label = 1;
            if (bucketApi.downloadPublic(str, byteWriteChannel, gVar, this) == aVar) {
                return aVar;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "Lio/github/jan/supabase/storage/FileUploadResponse;", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$updateAsFlow$2", f = "FlowExtension.kt", l = {42}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$updateAsFlow$2, reason: invalid class name and case insensitive filesystem */
    public static final class C11452 extends j implements n {
        final /* synthetic */ UploadData $data;
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_updateAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11452(BucketApi bucketApi, String str, UploadData uploadData, k kVar, S3.c<? super C11452> cVar) {
            super(2, cVar);
            this.$this_updateAsFlow = bucketApi;
            this.$path = str;
            this.$data = uploadData;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, UploadOptionBuilder uploadOptionBuilder) {
            kVar.invoke(uploadOptionBuilder);
            uploadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11452 c11452 = new C11452(this.$this_updateAsFlow, this.$path, this.$data, this.$options, cVar);
            c11452.L$0 = obj;
            return c11452;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super FileUploadResponse> cVar) {
            return ((C11452) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_updateAsFlow;
            String str = this.$path;
            UploadData uploadData = this.$data;
            g gVar = new g(this.$options, kVar, 4);
            this.L$0 = null;
            this.label = 1;
            Object objUpdate = bucketApi.update(str, uploadData, gVar, this);
            return objUpdate == aVar ? aVar : objUpdate;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "Lio/github/jan/supabase/storage/FileUploadResponse;", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$uploadAsFlow$3", f = "FlowExtension.kt", l = {109}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$uploadAsFlow$3, reason: invalid class name */
    public static final class AnonymousClass3 extends j implements n {
        final /* synthetic */ UploadData $data;
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_uploadAsFlow;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BucketApi bucketApi, String str, UploadData uploadData, k kVar, S3.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$this_uploadAsFlow = bucketApi;
            this.$path = str;
            this.$data = uploadData;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, UploadOptionBuilder uploadOptionBuilder) {
            kVar.invoke(uploadOptionBuilder);
            uploadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$this_uploadAsFlow, this.$path, this.$data, this.$options, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super FileUploadResponse> cVar) {
            return ((AnonymousClass3) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_uploadAsFlow;
            String str = this.$path;
            UploadData uploadData = this.$data;
            g gVar = new g(this.$options, kVar, 5);
            this.L$0 = null;
            this.label = 1;
            Object objUpload = bucketApi.upload(str, uploadData, gVar, this);
            return objUpload == aVar ? aVar : objUpload;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lio/github/jan/supabase/storage/UploadStatus;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$uploadAsFlowRequest$1", f = "FlowExtension.kt", l = {130}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$uploadAsFlowRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11461 extends j implements n {
        final /* synthetic */ n $producer;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11461(n nVar, S3.c<? super C11461> cVar) {
            super(2, cVar);
            this.$producer = nVar;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11461 c11461 = new C11461(this.$producer, cVar);
            c11461.L$0 = obj;
            return c11461;
        }

        @Override // e4.n
        public final Object invoke(t tVar, S3.c<? super C> cVar) {
            return ((C11461) create(tVar, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            t tVar = (t) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 == 0) {
                r.Y(obj);
                n nVar = this.$producer;
                k kVarUploadOverride = FlowExtensionKt.uploadOverride(tVar);
                this.L$0 = tVar;
                this.label = 1;
                obj = nVar.invoke(kVarUploadOverride, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
            }
            J5.j jVar = (J5.j) tVar;
            jVar.mo2trySendJP2dKIU(UploadStatus.Success.m76boximpl(UploadStatus.Success.m77constructorimpl((FileUploadResponse) obj)));
            jVar.close(null);
            return C.a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u001b\u0010\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0007¢\u0006\u0002\b\u0006H\n"}, d2 = {"<anonymous>", "Lio/github/jan/supabase/storage/FileUploadResponse;", "it", "Lkotlin/Function1;", "Lio/ktor/client/request/HttpRequestBuilder;", "", "Lkotlin/ExtensionFunctionType;", "Lio/github/jan/supabase/network/HttpRequestOverride;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @U3.e(c = "io.github.jan.supabase.storage.FlowExtensionKt$uploadToSignedUrlAsFlow$2", f = "FlowExtension.kt", l = {78}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.FlowExtensionKt$uploadToSignedUrlAsFlow$2, reason: invalid class name and case insensitive filesystem */
    public static final class C11472 extends j implements n {
        final /* synthetic */ UploadData $data;
        final /* synthetic */ k $options;
        final /* synthetic */ String $path;
        final /* synthetic */ BucketApi $this_uploadToSignedUrlAsFlow;
        final /* synthetic */ String $token;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11472(BucketApi bucketApi, String str, String str2, UploadData uploadData, k kVar, S3.c<? super C11472> cVar) {
            super(2, cVar);
            this.$this_uploadToSignedUrlAsFlow = bucketApi;
            this.$path = str;
            this.$token = str2;
            this.$data = uploadData;
            this.$options = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C invokeSuspend$lambda$0(k kVar, k kVar2, UploadOptionBuilder uploadOptionBuilder) {
            kVar.invoke(uploadOptionBuilder);
            uploadOptionBuilder.httpOverride(kVar2);
            return C.a;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11472 c11472 = new C11472(this.$this_uploadToSignedUrlAsFlow, this.$path, this.$token, this.$data, this.$options, cVar);
            c11472.L$0 = obj;
            return c11472;
        }

        @Override // e4.n
        public final Object invoke(k kVar, S3.c<? super FileUploadResponse> cVar) {
            return ((C11472) create(kVar, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar = (k) this.L$0;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            BucketApi bucketApi = this.$this_uploadToSignedUrlAsFlow;
            String str = this.$path;
            String str2 = this.$token;
            UploadData uploadData = this.$data;
            g gVar = new g(this.$options, kVar, 6);
            this.L$0 = null;
            this.label = 1;
            Object objUploadToSignedUrl = bucketApi.uploadToSignedUrl(str, str2, uploadData, gVar, this);
            return objUploadToSignedUrl == aVar ? aVar : objUploadToSignedUrl;
        }
    }

    private static final InterfaceC0329h downloadAsFlowRequest(BucketApi bucketApi, n nVar) {
        return new C0324c(new AnonymousClass1(nVar, null), i.f8767k, -2, J5.c.f4299k);
    }

    public static final InterfaceC0329h downloadAuthenticatedAsFlow(BucketApi bucketApi, String str, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("options", kVar);
        return downloadAsFlowRequest(bucketApi, new AnonymousClass2(bucketApi, str, kVar, null));
    }

    public static /* synthetic */ InterfaceC0329h downloadAuthenticatedAsFlow$default(BucketApi bucketApi, String str, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(27);
        }
        return downloadAuthenticatedAsFlow(bucketApi, str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedAsFlow$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadAuthenticatedAsFlow$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k downloadOverride(t tVar) {
        return new e(tVar, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadOverride$lambda$0(final t tVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        BodyProgressKt.onDownload(httpRequestBuilder, new ProgressListener() { // from class: io.github.jan.supabase.storage.FlowExtensionKt$downloadOverride$1$1
            @Override // io.ktor.client.content.ProgressListener
            public final Object onProgress(long j7, Long l7, S3.c<? super C> cVar) {
                ((J5.j) tVar).mo2trySendJP2dKIU(new DownloadStatus.Progress(j7, l7 != null ? l7.longValue() : 0L));
                return C.a;
            }
        });
        return C.a;
    }

    public static final InterfaceC0329h downloadPublicAsFlow(BucketApi bucketApi, String str, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("options", kVar);
        return downloadAsFlowRequest(bucketApi, new C11432(bucketApi, str, kVar, null));
    }

    public static /* synthetic */ InterfaceC0329h downloadPublicAsFlow$default(BucketApi bucketApi, String str, k kVar, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            kVar = new a(26);
        }
        return downloadPublicAsFlow(bucketApi, str, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicAsFlow$lambda$0(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C downloadPublicAsFlow$lambda$1(DownloadOptionBuilder downloadOptionBuilder) {
        l.f("<this>", downloadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h updateAsFlow(BucketApi bucketApi, String str, UploadData uploadData, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("data", uploadData);
        l.f("options", kVar);
        return uploadAsFlowRequest(bucketApi, new C11452(bucketApi, str, uploadData, kVar, null));
    }

    public static /* synthetic */ InterfaceC0329h updateAsFlow$default(BucketApi bucketApi, String str, UploadData uploadData, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(25);
        }
        return updateAsFlow(bucketApi, str, uploadData, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C updateAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h uploadAsFlow(BucketApi bucketApi, String str, byte[] bArr, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("data", bArr);
        l.f("options", kVar);
        return uploadAsFlow(bucketApi, str, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadAsFlow$default(BucketApi bucketApi, String str, byte[] bArr, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(29);
        }
        return uploadAsFlow(bucketApi, str, bArr, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    private static final InterfaceC0329h uploadAsFlowRequest(BucketApi bucketApi, n nVar) {
        return new C0324c(new C11461(nVar, null), i.f8767k, -2, J5.c.f4299k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k uploadOverride(t tVar) {
        return new e(tVar, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadOverride$lambda$0(final t tVar, HttpRequestBuilder httpRequestBuilder) {
        l.f("<this>", httpRequestBuilder);
        BodyProgressKt.onUpload(httpRequestBuilder, new ProgressListener() { // from class: io.github.jan.supabase.storage.FlowExtensionKt$uploadOverride$1$1
            @Override // io.ktor.client.content.ProgressListener
            public final Object onProgress(long j7, Long l7, S3.c<? super C> cVar) {
                ((J5.j) tVar).mo2trySendJP2dKIU(new UploadStatus.Progress(j7, l7 != null ? l7.longValue() : 0L));
                return C.a;
            }
        });
        return C.a;
    }

    public static final InterfaceC0329h uploadToSignedUrlAsFlow(BucketApi bucketApi, String str, String str2, UploadData uploadData, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("token", str2);
        l.f("data", uploadData);
        l.f("options", kVar);
        return uploadAsFlowRequest(bucketApi, new C11472(bucketApi, str, str2, uploadData, kVar, null));
    }

    public static /* synthetic */ InterfaceC0329h uploadToSignedUrlAsFlow$default(BucketApi bucketApi, String str, String str2, UploadData uploadData, k kVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new f(0);
        }
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, uploadData, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrlAsFlow$lambda$0(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadToSignedUrlAsFlow$lambda$1(UploadOptionBuilder uploadOptionBuilder) {
        l.f("<this>", uploadOptionBuilder);
        return C.a;
    }

    public static final InterfaceC0329h downloadAuthenticatedAsFlow(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("channel", byteWriteChannel);
        l.f("options", kVar);
        return downloadAsFlowRequest(bucketApi, new AnonymousClass4(bucketApi, str, byteWriteChannel, kVar, null));
    }

    public static final InterfaceC0329h downloadPublicAsFlow(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("channel", byteWriteChannel);
        l.f("options", kVar);
        return downloadAsFlowRequest(bucketApi, new C11444(bucketApi, str, byteWriteChannel, kVar, null));
    }

    public static final InterfaceC0329h updateAsFlow(BucketApi bucketApi, String str, byte[] bArr, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("data", bArr);
        l.f("options", kVar);
        return updateAsFlow(bucketApi, str, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadAsFlow$default(BucketApi bucketApi, String str, UploadData uploadData, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(22);
        }
        return uploadAsFlow(bucketApi, str, uploadData, kVar);
    }

    public static final InterfaceC0329h uploadToSignedUrlAsFlow(BucketApi bucketApi, String str, String str2, byte[] bArr, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("token", str2);
        l.f("data", bArr);
        l.f("options", kVar);
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, new UploadData(ByteChannelCtorKt.ByteReadChannel$default(bArr, 0, 0, 6, null), bArr.length), kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadAuthenticatedAsFlow$default(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(23);
        }
        return downloadAuthenticatedAsFlow(bucketApi, str, byteWriteChannel, kVar);
    }

    public static /* synthetic */ InterfaceC0329h downloadPublicAsFlow$default(BucketApi bucketApi, String str, ByteWriteChannel byteWriteChannel, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(28);
        }
        return downloadPublicAsFlow(bucketApi, str, byteWriteChannel, kVar);
    }

    public static /* synthetic */ InterfaceC0329h updateAsFlow$default(BucketApi bucketApi, String str, byte[] bArr, k kVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            kVar = new a(21);
        }
        return updateAsFlow(bucketApi, str, bArr, kVar);
    }

    public static /* synthetic */ InterfaceC0329h uploadToSignedUrlAsFlow$default(BucketApi bucketApi, String str, String str2, byte[] bArr, k kVar, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            kVar = new a(24);
        }
        return uploadToSignedUrlAsFlow(bucketApi, str, str2, bArr, kVar);
    }

    public static final InterfaceC0329h uploadAsFlow(BucketApi bucketApi, String str, UploadData uploadData, k kVar) {
        l.f("<this>", bucketApi);
        l.f("path", str);
        l.f("data", uploadData);
        l.f("options", kVar);
        return uploadAsFlowRequest(bucketApi, new AnonymousClass3(bucketApi, str, uploadData, kVar, null));
    }
}
