package io.github.jan.supabase.storage.resumable;

import H5.A;
import H5.D;
import H5.G;
import O3.C;
import P3.r;
import S3.c;
import T3.a;
import U3.e;
import U3.j;
import e4.n;
import e4.o;
import io.ktor.utils.io.ByteReadChannel;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Deferred;", "Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
@e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$2$2", f = "ResumableClient.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ResumableClientImpl$continuePreviousUploads$2$2 extends j implements n {
    final /* synthetic */ ResumableCacheEntry $cacheEntry;
    final /* synthetic */ o $channelProducer;
    final /* synthetic */ String $fingerprint;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ResumableClientImpl this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lio/github/jan/supabase/storage/resumable/ResumableUploadImpl;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$2$2$1", f = "ResumableClient.kt", l = {88}, m = "invokeSuspend", v = 1)
    /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$2$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements n {
        final /* synthetic */ ResumableCacheEntry $cacheEntry;
        final /* synthetic */ o $channelProducer;
        final /* synthetic */ String $fingerprint;
        int label;
        final /* synthetic */ ResumableClientImpl this$0;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lio/ktor/utils/io/ByteReadChannel;", "it", ""}, k = 3, mv = {2, 2, 0}, xi = 48)
        @e(c = "io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$2$2$1$1", f = "ResumableClient.kt", l = {88}, m = "invokeSuspend", v = 1)
        /* renamed from: io.github.jan.supabase.storage.resumable.ResumableClientImpl$continuePreviousUploads$2$2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00021 extends j implements n {
            final /* synthetic */ o $channelProducer;
            final /* synthetic */ String $fingerprint;
            /* synthetic */ long J$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00021(o oVar, String str, c<? super C00021> cVar) {
                super(2, cVar);
                this.$channelProducer = oVar;
                this.$fingerprint = str;
            }

            @Override // U3.a
            public final c<C> create(Object obj, c<?> cVar) {
                C00021 c00021 = new C00021(this.$channelProducer, this.$fingerprint, cVar);
                c00021.J$0 = ((Number) obj).longValue();
                return c00021;
            }

            public final Object invoke(long j7, c<? super ByteReadChannel> cVar) {
                return ((C00021) create(Long.valueOf(j7), cVar)).invokeSuspend(C.a);
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
                    r.Y(obj);
                    return obj;
                }
                r.Y(obj);
                o oVar = this.$channelProducer;
                String strM91getSourceimpl = Fingerprint.m91getSourceimpl(this.$fingerprint);
                Long l7 = new Long(j7);
                this.J$0 = j7;
                this.label = 1;
                Object objInvoke = oVar.invoke(strM91getSourceimpl, l7, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }

            @Override // e4.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (c<? super ByteReadChannel>) obj2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ResumableClientImpl resumableClientImpl, ResumableCacheEntry resumableCacheEntry, String str, o oVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = resumableClientImpl;
            this.$cacheEntry = resumableCacheEntry;
            this.$fingerprint = str;
            this.$channelProducer = oVar;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$cacheEntry, this.$fingerprint, this.$channelProducer, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, c<? super ResumableUploadImpl> cVar) {
            return ((AnonymousClass1) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f9048k;
            int i7 = this.label;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.Y(obj);
                return obj;
            }
            r.Y(obj);
            ResumableClientImpl resumableClientImpl = this.this$0;
            C00021 c00021 = new C00021(this.$channelProducer, this.$fingerprint, null);
            ResumableCacheEntry resumableCacheEntry = this.$cacheEntry;
            String strM91getSourceimpl = Fingerprint.m91getSourceimpl(this.$fingerprint);
            String path = this.$cacheEntry.getPath();
            long jM90getSizeimpl = Fingerprint.m90getSizeimpl(this.$fingerprint);
            this.label = 1;
            Object objResumeUpload = resumableClientImpl.resumeUpload(c00021, resumableCacheEntry, strM91getSourceimpl, path, jM90getSizeimpl, this);
            return objResumeUpload == aVar ? aVar : objResumeUpload;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResumableClientImpl$continuePreviousUploads$2$2(ResumableClientImpl resumableClientImpl, ResumableCacheEntry resumableCacheEntry, String str, o oVar, c<? super ResumableClientImpl$continuePreviousUploads$2$2> cVar) {
        super(2, cVar);
        this.this$0 = resumableClientImpl;
        this.$cacheEntry = resumableCacheEntry;
        this.$fingerprint = str;
        this.$channelProducer = oVar;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        ResumableClientImpl$continuePreviousUploads$2$2 resumableClientImpl$continuePreviousUploads$2$2 = new ResumableClientImpl$continuePreviousUploads$2$2(this.this$0, this.$cacheEntry, this.$fingerprint, this.$channelProducer, cVar);
        resumableClientImpl$continuePreviousUploads$2$2.L$0 = obj;
        return resumableClientImpl$continuePreviousUploads$2$2;
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super G> cVar) {
        return ((ResumableClientImpl$continuePreviousUploads$2$2) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        A a = (A) this.L$0;
        a aVar = a.f9048k;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.Y(obj);
        return D.f(a, null, new AnonymousClass1(this.this$0, this.$cacheEntry, this.$fingerprint, this.$channelProducer, null), 3);
    }
}
