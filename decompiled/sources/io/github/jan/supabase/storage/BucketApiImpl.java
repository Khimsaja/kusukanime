package io.github.jan.supabase.storage;

import D6.r;
import O3.C;
import a4.C0665c;
import a6.v;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.auth.AuthenticatedSupabaseApi;
import io.github.jan.supabase.storage.resumable.ResumableCache;
import io.github.jan.supabase.storage.resumable.ResumableClientImpl;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.ContentType;
import io.ktor.http.FileContentTypeKt;
import io.ktor.http.HttpHeaders;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import l4.InterfaceC1425d;
import l4.InterfaceC1444w;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010 J?\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010#J\u001e\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0096@¢\u0006\u0002\u0010(J7\u0010)\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010 J\u001c\u0010*\u001a\u00020\u001e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H\u0096@¢\u0006\u0002\u0010-J(\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0002\u00102J(\u00103\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u00032\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096@¢\u0006\u0002\u00102J9\u00104\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u00105\u001a\u0002062\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0004\b9\u0010:J,\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\u0006\u00105\u001a\u0002062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030,H\u0096@¢\u0006\u0004\b>\u0010?J/\u0010@\u001a\u00020A2\u0006\u0010\u0018\u001a\u00020\u00032\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010CJ/\u0010D\u001a\u00020A2\u0006\u0010\u0018\u001a\u00020\u00032\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010CJ7\u0010E\u001a\u00020A2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010F\u001a\u00020'2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0082@¢\u0006\u0002\u0010GJ7\u0010@\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010H\u001a\u00020I2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010JJ7\u0010D\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010H\u001a\u00020I2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010JJA\u0010K\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010H\u001a\u00020I2\u0006\u0010F\u001a\u00020'2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0080@¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u001e*\u00020O2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010F\u001a\u00020'2\u0006\u0010\u001b\u001a\u00020BH\u0000¢\u0006\u0002\bPJ5\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0<2\u0006\u0010S\u001a\u00020\u00032\u0017\u0010T\u001a\u0013\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0096@¢\u0006\u0002\u0010CJ\u0016\u0010V\u001a\u00020W2\u0006\u0010\u0018\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010XJ\u0016\u0010Y\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010XJ\u0010\u0010Z\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0002J\u0018\u0010[\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0002JA\u0010\\\u001a\u00020\u00172\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0080@¢\u0006\u0004\b`\u0010aJ$\u0010b\u001a\u00020\u001e*\u00020O2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010c\u001a\u00020\u001dH\u0002J\u0016\u0010d\u001a\u00020\u001e2\u0006\u0010F\u001a\u00020'H\u0096@¢\u0006\u0002\u0010eJ\u0010\u0010f\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0010\u0010g\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J)\u0010h\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0016J)\u0010i\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0017\u00107\u001a\u0013\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001e0\u001c¢\u0006\u0002\b\u001fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006j"}, d2 = {"Lio/github/jan/supabase/storage/BucketApiImpl;", "Lio/github/jan/supabase/storage/BucketApi;", "bucketId", "", "storage", "Lio/github/jan/supabase/storage/StorageImpl;", "resumableCache", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "<init>", "(Ljava/lang/String;Lio/github/jan/supabase/storage/StorageImpl;Lio/github/jan/supabase/storage/resumable/ResumableCache;)V", "getBucketId", "()Ljava/lang/String;", "getStorage", "()Lio/github/jan/supabase/storage/StorageImpl;", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "getSupabaseClient", "()Lio/github/jan/supabase/SupabaseClient;", "resumable", "Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "getResumable", "()Lio/github/jan/supabase/storage/resumable/ResumableClientImpl;", "update", "Lio/github/jan/supabase/storage/FileUploadResponse;", "path", "data", "Lio/github/jan/supabase/storage/UploadData;", "options", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/UploadOptionBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToSignedUrl", "token", "(Ljava/lang/String;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSignedUploadUrl", "Lio/github/jan/supabase/storage/UploadSignedUrl;", "upsert", "", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upload", "delete", "paths", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "move", "from", "to", "destinationBucket", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copy", "createSignedUrl", "expiresIn", "Lkotlin/time/Duration;", "transform", "Lio/github/jan/supabase/storage/ImageTransformation;", "createSignedUrl-dWUq8MI", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createSignedUrls", "", "Lio/github/jan/supabase/storage/SignedUrl;", "createSignedUrls-KLykuaI", "(JLjava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAuthenticated", "", "Lio/github/jan/supabase/storage/DownloadOptionBuilder;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadPublic", "normalDownloadRequest", CacheControl.PUBLIC, "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channel", "Lio/ktor/utils/io/ByteWriteChannel;", "(Ljava/lang/String;Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channelDownloadRequest", "channelDownloadRequest$storage_kt_release", "(Ljava/lang/String;Lio/ktor/utils/io/ByteWriteChannel;ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareDownloadRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "prepareDownloadRequest$storage_kt_release", "list", "Lio/github/jan/supabase/storage/FileObject;", "prefix", "filter", "Lio/github/jan/supabase/storage/BucketListFilter;", "info", "Lio/github/jan/supabase/storage/FileObjectV2;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exists", "defaultUploadUrl", "uploadToSignedUrlUrl", "uploadOrUpdate", "method", "Lio/ktor/http/HttpMethod;", "url", "uploadOrUpdate$storage_kt_release", "(Lio/ktor/http/HttpMethod;Ljava/lang/String;Lio/github/jan/supabase/storage/UploadData;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "defaultUploadRequest", "optionBuilder", "changePublicStatusTo", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authenticatedUrl", "publicUrl", "authenticatedRenderUrl", "publicRenderUrl", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BucketApiImpl implements BucketApi {
    private final String bucketId;
    private final ResumableClientImpl resumable;
    private final StorageImpl storage;
    private final SupabaseClient supabaseClient;

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {313, 317}, m = "createSignedUploadUrl", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiImpl$createSignedUploadUrl$1, reason: invalid class name */
    public static final class AnonymousClass1 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
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
            return BucketApiImpl.this.createSignedUploadUrl(null, false, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {236}, m = "exists", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiImpl$exists$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11391 extends U3.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11391(S3.c<? super C11391> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BucketApiImpl.this.exists(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {313, 318}, m = "info", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiImpl$info$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11401 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11401(S3.c<? super C11401> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BucketApiImpl.this.info(null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {317, 324}, m = "list", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiImpl$list$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11411 extends U3.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        /* synthetic */ Object result;

        public C11411(S3.c<? super C11411> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BucketApiImpl.this.list(null, null, this);
        }
    }

    @U3.e(c = "io.github.jan.supabase.storage.BucketApiImpl", f = "BucketApiImpl.kt", l = {160, 313}, m = "normalDownloadRequest", v = 1)
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: io.github.jan.supabase.storage.BucketApiImpl$normalDownloadRequest$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11421 extends U3.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C11421(S3.c<? super C11421> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BucketApiImpl.this.normalDownloadRequest(null, false, null, this);
        }
    }

    public BucketApiImpl(String str, StorageImpl storageImpl, ResumableCache resumableCache) {
        l.f("bucketId", str);
        l.f("storage", storageImpl);
        l.f("resumableCache", resumableCache);
        this.bucketId = str;
        this.storage = storageImpl;
        this.supabaseClient = storageImpl.getSupabaseClient();
        this.resumable = new ResumableClientImpl(this, resumableCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C changePublicStatusTo$lambda$0(boolean z7, BucketBuilder bucketBuilder) {
        l.f("$this$updateBucket", bucketBuilder);
        bucketBuilder.setPublic(Boolean.valueOf(z7));
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C channelDownloadRequest$lambda$0(BucketApiImpl bucketApiImpl, String str, boolean z7, DownloadOptionBuilder downloadOptionBuilder, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$prepareRequest", httpRequestBuilder);
        bucketApiImpl.prepareDownloadRequest$storage_kt_release(httpRequestBuilder, str, z7, downloadOptionBuilder);
        Iterator<T> it = downloadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(httpRequestBuilder);
        }
        return C.a;
    }

    private static final C createSignedUrl_dWUq8MI$lambda$0$0(ImageTransformation imageTransformation, v vVar) {
        l.f("$this$putJsonObject", vVar);
        UtilsKt.putImageTransformation(vVar, imageTransformation);
        return C.a;
    }

    private static final C createSignedUrls_KLykuaI$lambda$0$0(Collection collection, a6.e eVar) {
        l.f("$this$putJsonArray", eVar);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kotlinx.serialization.json.d dVarB = a6.l.b((String) it.next());
            l.f("element", dVarB);
            eVar.a.add(dVarB);
        }
        return C.a;
    }

    private final void defaultUploadRequest(HttpRequestBuilder httpRequestBuilder, String str, UploadData uploadData, UploadOptionBuilder uploadOptionBuilder) {
        httpRequestBuilder.setBody(new OutgoingContent.ReadChannelContent(uploadOptionBuilder, str, uploadData) { // from class: io.github.jan.supabase.storage.BucketApiImpl.defaultUploadRequest.1
            final /* synthetic */ UploadData $data;
            private final long contentLength;
            private final ContentType contentType;

            {
                this.$data = uploadData;
                ContentType contentType = uploadOptionBuilder.getContentType();
                this.contentType = contentType == null ? FileContentTypeKt.defaultForFilePath(ContentType.INSTANCE, str) : contentType;
                this.contentLength = uploadData.getSize();
            }

            @Override // io.ktor.http.content.OutgoingContent
            public Long getContentLength() {
                return Long.valueOf(this.contentLength);
            }

            @Override // io.ktor.http.content.OutgoingContent
            public ContentType getContentType() {
                return this.contentType;
            }

            @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
            public ByteReadChannel readFrom() {
                return this.$data.getStream();
            }
        });
        httpRequestBuilder.setBodyType(null);
        String contentType = HttpHeaders.INSTANCE.getContentType();
        ContentType contentType2 = uploadOptionBuilder.getContentType();
        if (contentType2 == null) {
            contentType2 = FileContentTypeKt.defaultForFilePath(ContentType.INSTANCE, str);
        }
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, contentType, contentType2);
        io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "x-upsert", String.valueOf(uploadOptionBuilder.getUpsert()));
        kotlinx.serialization.json.c userMetadata = uploadOptionBuilder.getUserMetadata();
        if (userMetadata != null) {
            io.ktor.client.request.UtilsKt.header(httpRequestBuilder, "x-metadata", C0665c.a(C0665c.f10439e, AbstractC2517v.K(userMetadata.toString())));
        }
    }

    private final String defaultUploadUrl(String path) {
        return "object/" + getBucketId() + '/' + path;
    }

    private static final C delete$lambda$0$0(Collection collection, a6.e eVar) {
        l.f("$this$putJsonArray", eVar);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            kotlinx.serialization.json.d dVarB = a6.l.b((String) it.next());
            l.f("element", dVarB);
            eVar.a.add(dVarB);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C exists$lambda$0(HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$request", httpRequestBuilder);
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getHead());
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(2:13|(2:29|30)(2:31|32))(2:14|15))(1:16))(3:17|(1:20)|27)|21|33|22|25) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        if (r0 == r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object normalDownloadRequest(java.lang.String r13, boolean r14, e4.k r15, S3.c<? super byte[]> r16) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof io.github.jan.supabase.storage.BucketApiImpl.C11421
            if (r2 == 0) goto L16
            r2 = r0
            io.github.jan.supabase.storage.BucketApiImpl$normalDownloadRequest$1 r2 = (io.github.jan.supabase.storage.BucketApiImpl.C11421) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r6 = r2
            goto L1c
        L16:
            io.github.jan.supabase.storage.BucketApiImpl$normalDownloadRequest$1 r2 = new io.github.jan.supabase.storage.BucketApiImpl$normalDownloadRequest$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r6.result
            T3.a r7 = T3.a.f9048k
            int r2 = r6.label
            r8 = 2
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L5a
            if (r2 == r9) goto L48
            if (r2 != r8) goto L40
            java.lang.Object r2 = r6.L$3
            io.ktor.client.statement.HttpResponse r2 = (io.ktor.client.statement.HttpResponse) r2
            java.lang.Object r2 = r6.L$2
            io.github.jan.supabase.storage.DownloadOptionBuilder r2 = (io.github.jan.supabase.storage.DownloadOptionBuilder) r2
            java.lang.Object r2 = r6.L$1
            e4.k r2 = (e4.k) r2
            java.lang.Object r2 = r6.L$0
            java.lang.String r2 = (java.lang.String) r2
            P3.r.Y(r0)
            goto Lb6
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L48:
            boolean r2 = r6.Z$0
            java.lang.Object r3 = r6.L$2
            io.github.jan.supabase.storage.DownloadOptionBuilder r3 = (io.github.jan.supabase.storage.DownloadOptionBuilder) r3
            java.lang.Object r3 = r6.L$1
            e4.k r3 = (e4.k) r3
            java.lang.Object r3 = r6.L$0
            java.lang.String r3 = (java.lang.String) r3
            P3.r.Y(r0)
            goto L87
        L5a:
            P3.r.Y(r0)
            io.github.jan.supabase.storage.DownloadOptionBuilder r4 = new io.github.jan.supabase.storage.DownloadOptionBuilder
            r0 = 3
            r4.<init>(r10, r10, r0, r10)
            r15.invoke(r4)
            io.github.jan.supabase.storage.StorageImpl r0 = r12.storage
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r11 = r0.getApi()
            io.github.jan.supabase.storage.b r0 = new io.github.jan.supabase.storage.b
            r5 = 1
            r1 = r12
            r2 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.Z$0 = r14
            r6.label = r9
            java.lang.Object r0 = r11.rawRequest(r0, r6)
            if (r0 != r7) goto L86
            goto Lb5
        L86:
            r2 = r14
        L87:
            io.ktor.client.statement.HttpResponse r0 = (io.ktor.client.statement.HttpResponse) r0
            io.ktor.client.call.HttpClientCall r0 = r0.getCall()
            kotlin.jvm.internal.z r1 = kotlin.jvm.internal.y.a
            java.lang.Class<byte[]> r3 = byte[].class
            l4.d r1 = r1.b(r3)
            l4.w r3 = kotlin.jvm.internal.y.a(r3)     // Catch: java.lang.Throwable -> L9a
            goto L9b
        L9a:
            r3 = r10
        L9b:
            io.ktor.util.reflect.TypeInfo r4 = new io.ktor.util.reflect.TypeInfo
            r4.<init>(r1, r3)
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.L$3 = r10
            r6.Z$0 = r2
            r1 = 0
            r6.I$0 = r1
            r6.label = r8
            java.lang.Object r0 = r0.bodyNullable(r4, r6)
            if (r0 != r7) goto Lb6
        Lb5:
            return r7
        Lb6:
            if (r0 == 0) goto Lbb
            byte[] r0 = (byte[]) r0
            return r0
        Lbb:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.ByteArray"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.normalDownloadRequest(java.lang.String, boolean, e4.k, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C normalDownloadRequest$lambda$0(BucketApiImpl bucketApiImpl, String str, boolean z7, DownloadOptionBuilder downloadOptionBuilder, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$rawRequest", httpRequestBuilder);
        bucketApiImpl.prepareDownloadRequest$storage_kt_release(httpRequestBuilder, str, z7, downloadOptionBuilder);
        Iterator<T> it = downloadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(httpRequestBuilder);
        }
        return C.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C uploadOrUpdate$lambda$0(HttpMethod httpMethod, BucketApiImpl bucketApiImpl, String str, UploadData uploadData, UploadOptionBuilder uploadOptionBuilder, HttpRequestBuilder httpRequestBuilder) {
        l.f("$this$request", httpRequestBuilder);
        httpRequestBuilder.setMethod(httpMethod);
        bucketApiImpl.defaultUploadRequest(httpRequestBuilder, str, uploadData, uploadOptionBuilder);
        Iterator<T> it = uploadOptionBuilder.getHttpRequestOverrides$storage_kt_release().iterator();
        while (it.hasNext()) {
            ((k) it.next()).invoke(httpRequestBuilder);
        }
        return C.a;
    }

    private final String uploadToSignedUrlUrl(String path, String token) {
        return "object/upload/sign/" + getBucketId() + '/' + path + "?token=" + token;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public String authenticatedRenderUrl(String str, k kVar) {
        l.f("path", str);
        l.f("transform", kVar);
        ImageTransformation imageTransformation = new ImageTransformation();
        kVar.invoke(imageTransformation);
        String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        StorageImpl storageImpl = this.storage;
        StringBuilder sb = new StringBuilder("render/image/authenticated/");
        sb.append(getBucketId());
        sb.append('/');
        sb.append(str);
        sb.append(!AbstractC2510o.g0(strQueryString$storage_kt_release) ? AbstractC0703b.i("?", strQueryString$storage_kt_release) : "");
        return storageImpl.resolveUrl(sb.toString());
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public String authenticatedUrl(String path) {
        l.f("path", path);
        return this.storage.resolveUrl("object/authenticated/" + getBucketId() + '/' + path);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object changePublicStatusTo(boolean z7, S3.c<? super C> cVar) {
        Object objUpdateBucket = this.storage.updateBucket(getBucketId(), new c(z7, 0), cVar);
        return objUpdateBucket == T3.a.f9048k ? objUpdateBucket : C.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d5, code lost:
    
        if (r3.flushAndClose(r6) != r7) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object channelDownloadRequest$storage_kt_release(java.lang.String r14, io.ktor.utils.io.ByteWriteChannel r15, boolean r16, e4.k r17, S3.c<? super O3.C> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.channelDownloadRequest$storage_kt_release(java.lang.String, io.ktor.utils.io.ByteWriteChannel, boolean, e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object copy(String str, String str2, String str3, S3.c<? super C> cVar) {
        AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        v vVar = new v();
        n6.d.V("bucketId", getBucketId(), vVar);
        n6.d.V("sourceKey", str, vVar);
        n6.d.V("destinationKey", str2, vVar);
        if (str3 != null) {
            n6.d.V("destinationBucket", str3, vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = api$storage_kt_release.request("object/copy", new k() { // from class: io.github.jan.supabase.storage.BucketApiImpl$copy$$inlined$postJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(2:27|(2:37|38)(2:31|(2:33|34)(2:35|36)))(2:39|40))(2:13|14))(1:15))(3:16|(0)|25)|19|41|20|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a1, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b7, code lost:
    
        if (r12 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createSignedUploadUrl(java.lang.String r10, final boolean r11, S3.c<? super io.github.jan.supabase.storage.UploadSignedUrl> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.createSignedUploadUrl(java.lang.String, boolean, S3.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(2:27|(2:33|34)(2:31|32))(2:35|36))(2:13|14))(1:15))(3:16|(0)|25)|19|37|20|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x011c, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0140, code lost:
    
        if (r15 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /* renamed from: createSignedUrl-dWUq8MI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo37createSignedUrldWUq8MI(java.lang.String r11, long r12, e4.k r14, S3.c<? super java.lang.String> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.mo37createSignedUrldWUq8MI(java.lang.String, long, e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    /* renamed from: createSignedUrls-KLykuaI */
    public /* bridge */ Object mo39createSignedUrlsKLykuaI(long j7, String[] strArr, S3.c<? super List<SignedUrl>> cVar) {
        return super.mo39createSignedUrlsKLykuaI(j7, strArr, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public /* bridge */ Object delete(String[] strArr, S3.c<? super C> cVar) {
        return super.delete(strArr, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object downloadAuthenticated(String str, k kVar, S3.c<? super byte[]> cVar) {
        return normalDownloadRequest(str, false, kVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object downloadPublic(String str, k kVar, S3.c<? super byte[]> cVar) {
        return normalDownloadRequest(str, true, kVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object exists(java.lang.String r6, S3.c<? super java.lang.Boolean> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "object/"
            boolean r1 = r7 instanceof io.github.jan.supabase.storage.BucketApiImpl.C11391
            if (r1 == 0) goto L15
            r1 = r7
            io.github.jan.supabase.storage.BucketApiImpl$exists$1 r1 = (io.github.jan.supabase.storage.BucketApiImpl.C11391) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.github.jan.supabase.storage.BucketApiImpl$exists$1 r1 = new io.github.jan.supabase.storage.BucketApiImpl$exists$1
            r1.<init>(r7)
        L1a:
            java.lang.Object r7 = r1.result
            T3.a r2 = T3.a.f9048k
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L37
            if (r3 != r4) goto L2f
            java.lang.Object r6 = r1.L$0
            java.lang.String r6 = (java.lang.String) r6
            P3.r.Y(r7)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            goto L6b
        L2d:
            r6 = move-exception
            goto L6e
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            P3.r.Y(r7)
            io.github.jan.supabase.storage.StorageImpl r7 = r5.storage     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            io.github.jan.supabase.auth.AuthenticatedSupabaseApi r7 = r7.getApi()     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r3.<init>(r0)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            java.lang.String r0 = r5.getBucketId()     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r3.append(r0)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r0 = 47
            r3.append(r0)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r3.append(r6)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            java.lang.String r6 = r3.toString()     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            io.github.jan.supabase.storage.a r0 = new io.github.jan.supabase.storage.a     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r3 = 19
            r0.<init>(r3)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r3 = 0
            r1.L$0 = r3     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            r1.label = r4     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            java.lang.Object r6 = r7.request(r6, r0, r1)     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            if (r6 != r2) goto L6b
            return r2
        L6b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: io.github.jan.supabase.exceptions.RestException -> L2d
            return r6
        L6e:
            io.ktor.http.HttpStatusCode$Companion r7 = io.ktor.http.HttpStatusCode.INSTANCE
            io.ktor.http.HttpStatusCode r0 = r7.getNotFound()
            int r0 = r0.getValue()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            io.ktor.http.HttpStatusCode r7 = r7.getBadRequest()
            int r7 = r7.getValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            java.lang.Integer[] r7 = new java.lang.Integer[]{r1, r0}
            java.util.List r7 = P3.r.I(r7)
            int r0 = r6.getStatusCode()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            boolean r7 = r7.contains(r1)
            if (r7 == 0) goto La4
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        La4:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.exists(java.lang.String, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public String getBucketId() {
        return this.bucketId;
    }

    public final StorageImpl getStorage() {
        return this.storage;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public SupabaseClient getSupabaseClient() {
        return this.supabaseClient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (r1 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object info(java.lang.String r21, S3.c<? super io.github.jan.supabase.storage.FileObjectV2> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.info(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e7, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object list(java.lang.String r10, e4.k r11, S3.c<? super java.util.List<io.github.jan.supabase.storage.FileObject>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.list(java.lang.String, e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object move(String str, String str2, String str3, S3.c<? super C> cVar) {
        AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        v vVar = new v();
        n6.d.V("bucketId", getBucketId(), vVar);
        n6.d.V("sourceKey", str, vVar);
        n6.d.V("destinationKey", str2, vVar);
        if (str3 != null) {
            n6.d.V("destinationBucket", str3, vVar);
        }
        final kotlinx.serialization.json.c cVarA = vVar.a();
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = api$storage_kt_release.request("object/move", new k() { // from class: io.github.jan.supabase.storage.BucketApiImpl$move$$inlined$postJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getPost());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVarA;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    public final void prepareDownloadRequest$storage_kt_release(HttpRequestBuilder httpRequestBuilder, String str, boolean z7, DownloadOptionBuilder downloadOptionBuilder) {
        String strAuthenticatedUrl;
        l.f("<this>", httpRequestBuilder);
        l.f("path", str);
        l.f("options", downloadOptionBuilder);
        ImageTransformation imageTransformation = new ImageTransformation();
        downloadOptionBuilder.getTransform().invoke(imageTransformation);
        String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        if (z7) {
            strAuthenticatedUrl = AbstractC2510o.g0(strQueryString$storage_kt_release) ? publicUrl(str) : publicRenderUrl(str, downloadOptionBuilder.getTransform());
        } else {
            if (z7) {
                throw new r();
            }
            strAuthenticatedUrl = AbstractC2510o.g0(strQueryString$storage_kt_release) ? authenticatedUrl(str) : authenticatedRenderUrl(str, downloadOptionBuilder.getTransform());
        }
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        HttpRequestKt.url(httpRequestBuilder, strAuthenticatedUrl);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public String publicRenderUrl(String str, k kVar) {
        l.f("path", str);
        l.f("transform", kVar);
        ImageTransformation imageTransformation = new ImageTransformation();
        kVar.invoke(imageTransformation);
        String strQueryString$storage_kt_release = imageTransformation.queryString$storage_kt_release();
        StorageImpl storageImpl = this.storage;
        StringBuilder sb = new StringBuilder("render/image/public/");
        sb.append(getBucketId());
        sb.append('/');
        sb.append(str);
        sb.append(!AbstractC2510o.g0(strQueryString$storage_kt_release) ? AbstractC0703b.i("?", strQueryString$storage_kt_release) : "");
        return storageImpl.resolveUrl(sb.toString());
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public String publicUrl(String path) {
        l.f("path", path);
        return this.storage.resolveUrl("object/public/" + getBucketId() + '/' + path);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public /* bridge */ Object update(String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return super.update(str, bArr, kVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public /* bridge */ Object upload(String str, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return super.upload(str, bArr, kVar, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(2:13|(2:29|(2:41|42)(2:33|(2:39|40)(2:37|38)))(2:43|44))(2:14|15))(1:16))(3:17|(1:20)|27)|21|45|22|25) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        if (r0 == r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod r22, java.lang.String r23, io.github.jan.supabase.storage.UploadData r24, e4.k r25, S3.c<? super io.github.jan.supabase.storage.FileUploadResponse> r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.uploadOrUpdate$storage_kt_release(io.ktor.http.HttpMethod, java.lang.String, io.github.jan.supabase.storage.UploadData, e4.k, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public /* bridge */ Object uploadToSignedUrl(String str, String str2, byte[] bArr, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return super.uploadToSignedUrl(str, str2, bArr, kVar, cVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(2:12|(4:27|(2:30|28)|36|31)(2:32|33))(2:13|14))(1:15))(3:16|(0)|25)|19|34|20|23) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x010f, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012f, code lost:
    
        if (r3 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // io.github.jan.supabase.storage.BucketApi
    /* renamed from: createSignedUrls-KLykuaI */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo38createSignedUrlsKLykuaI(long r17, java.util.Collection<java.lang.String> r19, S3.c<? super java.util.List<io.github.jan.supabase.storage.SignedUrl>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.github.jan.supabase.storage.BucketApiImpl.mo38createSignedUrlsKLykuaI(long, java.util.Collection, S3.c):java.lang.Object");
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object delete(Collection<String> collection, S3.c<? super C> cVar) {
        AuthenticatedSupabaseApi api$storage_kt_release = this.storage.getApi();
        String str = "object/" + getBucketId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a6.e eVar = new a6.e();
        delete$lambda$0$0(collection, eVar);
        final kotlinx.serialization.json.c cVar2 = new kotlinx.serialization.json.c(linkedHashMap);
        final ContentType json = ContentType.Application.INSTANCE.getJson();
        Object objRequest = api$storage_kt_release.request(str, new k() { // from class: io.github.jan.supabase.storage.BucketApiImpl$delete$$inlined$deleteJson$default$1
            @Override // e4.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((HttpRequestBuilder) obj);
                return C.a;
            }

            public final void invoke(HttpRequestBuilder httpRequestBuilder) {
                l.f("$this$request", httpRequestBuilder);
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getDelete());
                HttpMessagePropertiesKt.contentType(httpRequestBuilder, json);
                Object obj = cVar2;
                InterfaceC1444w interfaceC1444wA = null;
                if (obj == null) {
                    httpRequestBuilder.setBody(NullBody.INSTANCE);
                    InterfaceC1425d interfaceC1425dB = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused) {
                    }
                    AbstractC0703b.z(interfaceC1425dB, interfaceC1444wA, httpRequestBuilder);
                    return;
                }
                if (obj instanceof OutgoingContent) {
                    httpRequestBuilder.setBody(obj);
                    httpRequestBuilder.setBodyType(null);
                } else {
                    httpRequestBuilder.setBody(obj);
                    InterfaceC1425d interfaceC1425dB2 = y.a.b(kotlinx.serialization.json.c.class);
                    try {
                        interfaceC1444wA = y.a(kotlinx.serialization.json.c.class);
                    } catch (Throwable unused2) {
                    }
                    AbstractC0703b.z(interfaceC1425dB2, interfaceC1444wA, httpRequestBuilder);
                }
            }
        }, cVar);
        return objRequest == T3.a.f9048k ? objRequest : C.a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object downloadAuthenticated(String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C> cVar) throws Throwable {
        Object objChannelDownloadRequest$storage_kt_release = channelDownloadRequest$storage_kt_release(str, byteWriteChannel, false, kVar, cVar);
        return objChannelDownloadRequest$storage_kt_release == T3.a.f9048k ? objChannelDownloadRequest$storage_kt_release : C.a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object downloadPublic(String str, ByteWriteChannel byteWriteChannel, k kVar, S3.c<? super C> cVar) throws Throwable {
        Object objChannelDownloadRequest$storage_kt_release = channelDownloadRequest$storage_kt_release(str, byteWriteChannel, true, kVar, cVar);
        return objChannelDownloadRequest$storage_kt_release == T3.a.f9048k ? objChannelDownloadRequest$storage_kt_release : C.a;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public ResumableClientImpl getResumable() {
        return this.resumable;
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object update(String str, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return uploadOrUpdate$storage_kt_release(HttpMethod.INSTANCE.getPut(), defaultUploadUrl(str), uploadData, kVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object upload(String str, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return uploadOrUpdate$storage_kt_release(HttpMethod.INSTANCE.getPost(), defaultUploadUrl(str), uploadData, kVar, cVar);
    }

    @Override // io.github.jan.supabase.storage.BucketApi
    public Object uploadToSignedUrl(String str, String str2, UploadData uploadData, k kVar, S3.c<? super FileUploadResponse> cVar) {
        return uploadOrUpdate$storage_kt_release(HttpMethod.INSTANCE.getPut(), uploadToSignedUrlUrl(str, str2), uploadData, kVar, cVar);
    }
}
