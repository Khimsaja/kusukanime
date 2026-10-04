package io.ktor.client.plugins.cache.storage;

import H5.A;
import H5.AbstractC0281w;
import H5.D;
import H5.M;
import O3.C;
import O5.d;
import P3.r;
import U3.c;
import U3.e;
import U3.j;
import e4.InterfaceC0821a;
import e4.k;
import e4.n;
import io.ktor.client.plugins.cache.HttpCacheKt;
import io.ktor.http.Url;
import io.ktor.util.CryptoKt;
import io.ktor.util.collections.ConcurrentMap;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;
import z6.b;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\n2\u001e\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0012H\u0082H¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0018\u0010\u0011J&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u001d\u0010\u0011J \u0010!\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020#H\u0082@¢\u0006\u0004\b\u0010\u0010$J \u0010&\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b(\u0010)J.\u0010,\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0*H\u0096@¢\u0006\u0004\b,\u0010-J,\u0010.\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0*H\u0096@¢\u0006\u0004\b.\u0010-J\u0018\u0010/\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b/\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lio/ktor/client/plugins/cache/storage/FileCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Ljava/io/File;", "directory", "LH5/w;", "dispatcher", "<init>", "(Ljava/io/File;LH5/w;)V", "Lio/ktor/http/Url;", "url", "", "key", "(Lio/ktor/http/Url;)Ljava/lang/String;", "urlHex", "", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "readCache", "(Ljava/lang/String;LS3/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "transform", "LO3/C;", "updateCache", "(Ljava/lang/String;Le4/k;LS3/c;)Ljava/lang/Object;", "deleteCache", "caches", "", "writeCacheUnsafe", "(Ljava/lang/String;Ljava/util/List;LS3/c;)Ljava/lang/Object;", "readCacheUnsafe", "Lio/ktor/utils/io/ByteChannel;", "channel", "cache", "writeCache", "(Lio/ktor/utils/io/ByteChannel;Lio/ktor/client/plugins/cache/storage/CachedResponseData;LS3/c;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteReadChannel;", "(Lio/ktor/utils/io/ByteReadChannel;LS3/c;)Ljava/lang/Object;", "data", "store", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;LS3/c;)Ljava/lang/Object;", "findAll", "(Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;LS3/c;)Ljava/lang/Object;", "remove", "removeAll", "Ljava/io/File;", "LH5/w;", "Lio/ktor/util/collections/ConcurrentMap;", "LR5/a;", "mutexes", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FileCacheStorage implements CacheStorage {
    private final File directory;
    private final AbstractC0281w dispatcher;
    private final ConcurrentMap<String, R5.a> mutexes;

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {252}, m = "deleteCache")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.deleteCache(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {96}, m = "find")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11681 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11681(S3.c<? super C11681> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.find(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {92}, m = "findAll")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11691 extends c {
        int label;
        /* synthetic */ Object result;

        public C11691(S3.c<? super C11691> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.findAll(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {252, 118}, m = "readCache")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11701 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11701(S3.c<? super C11701> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((String) null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {209, 210, 210, 211, 212, 215, 216, 219, 220, 221, 222, 225, 226, 230, 232}, m = "readCache")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3, reason: invalid class name */
    public static final class AnonymousClass3 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(S3.c<? super AnonymousClass3> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCache((ByteReadChannel) null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {171, 174, 176}, m = "readCacheUnsafe")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$readCacheUnsafe$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11711 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11711(S3.c<? super C11711> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.readCacheUnsafe(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {254, 257, 258}, m = "remove")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$remove$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11721 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11721(S3.c<? super C11721> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.remove(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2", f = "FileCacheStorage.kt", l = {254, 257, 258}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$store$2, reason: invalid class name */
    public static final class AnonymousClass2 extends j implements n {
        final /* synthetic */ CachedResponseData $data;
        final /* synthetic */ Url $url;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Url url, CachedResponseData cachedResponseData, S3.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$url = url;
            this.$data = cachedResponseData;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            return FileCacheStorage.this.new AnonymousClass2(this.$url, this.$data, cVar);
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<? super C> cVar) {
            return ((AnonymousClass2) create(a, cVar)).invokeSuspend(C.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:15:0x0034, B:28:0x0099, B:29:0x00a6, B:31:0x00ac, B:33:0x00c1, B:34:0x00c5, B:24:0x0083), top: B:42:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage", f = "FileCacheStorage.kt", l = {186, 187, 188, 189, 191, 193, 194, 196, 197, 198, 199, 201, 202, 204, 205}, m = "writeCache")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11731 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C11731(S3.c<? super C11731> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileCacheStorage.this.writeCache(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "", "<anonymous>", "(LH5/A;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2", f = "FileCacheStorage.kt", l = {157}, m = "invokeSuspend")
    /* renamed from: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCacheUnsafe$2, reason: invalid class name and case insensitive filesystem */
    public static final class C11742 extends j implements n {
        final /* synthetic */ List<CachedResponseData> $caches;
        final /* synthetic */ String $urlHex;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11742(String str, List<CachedResponseData> list, S3.c<? super C11742> cVar) {
            super(2, cVar);
            this.$urlHex = str;
            this.$caches = list;
        }

        @Override // U3.a
        public final S3.c<C> create(Object obj, S3.c<?> cVar) {
            C11742 c11742 = FileCacheStorage.this.new C11742(this.$urlHex, this.$caches, cVar);
            c11742.L$0 = obj;
            return c11742;
        }

        @Override // e4.n
        public final Object invoke(A a, S3.c<Object> cVar) {
            return ((C11742) create(a, cVar)).invokeSuspend(C.a);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            Closeable closeable;
            T3.a aVar = T3.a.f9048k;
            int i7 = this.label;
            f fVar = null;
            int i8 = 1;
            if (i7 == 0) {
                r.Y(obj);
                A a = (A) this.L$0;
                ByteChannel byteChannel = new ByteChannel(false, i8, fVar);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(FileCacheStorage.this.directory, this.$urlHex)), 8192);
                    try {
                        D.x(a, null, new FileCacheStorage$writeCacheUnsafe$2$1$1(byteChannel, this.$caches, FileCacheStorage.this, null), 3);
                        this.L$0 = bufferedOutputStream;
                        this.label = 1;
                        obj = WritingKt.copyTo$default(byteChannel, bufferedOutputStream, 0L, this, 2, null);
                        if (obj == aVar) {
                            return aVar;
                        }
                        closeable = bufferedOutputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = bufferedOutputStream;
                        throw th;
                    }
                } catch (Exception e7) {
                    b logger = HttpCacheKt.getLOGGER();
                    if (LoggerJvmKt.isTraceEnabled(logger)) {
                        logger.e("Exception during saving a cache to a file: ".concat(q0.c.R(e7)));
                    }
                    return C.a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (Closeable) this.L$0;
                try {
                    r.Y(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (Throwable th4) {
                        r.o(closeable, th);
                        throw th4;
                    }
                }
            }
            Long l7 = new Long(((Number) obj).longValue());
            r.o(closeable, null);
            return l7;
        }
    }

    public FileCacheStorage(File file, AbstractC0281w abstractC0281w) {
        l.f("directory", file);
        l.f("dispatcher", abstractC0281w);
        this.directory = file;
        this.dispatcher = abstractC0281w;
        this.mutexes = new ConcurrentMap<>(0, 1, null);
        file.mkdirs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r7v10, types: [R5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deleteCache(java.lang.String r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "Exception during cache deletion in a file: "
            boolean r1 = r8 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1 r1 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1 r1 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$deleteCache$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            T3.a r2 = T3.a.f9048k
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L3b
            if (r3 != r4) goto L33
            java.lang.Object r7 = r1.L$1
            R5.a r7 = (R5.a) r7
            java.lang.Object r1 = r1.L$0
            java.lang.String r1 = (java.lang.String) r1
            P3.r.Y(r8)
            r8 = r7
            r7 = r1
            goto L5b
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            P3.r.Y(r8)
            io.ktor.util.collections.ConcurrentMap<java.lang.String, R5.a> r8 = r6.mutexes
            io.ktor.client.plugins.cache.storage.a r3 = new io.ktor.client.plugins.cache.storage.a
            r5 = 1
            r3.<init>(r5)
            java.lang.Object r8 = r8.computeIfAbsent(r7, r3)
            R5.a r8 = (R5.a) r8
            r1.L$0 = r7
            r1.L$1 = r8
            r1.label = r4
            R5.c r8 = (R5.c) r8
            java.lang.Object r1 = r8.c(r1)
            if (r1 != r2) goto L5b
            return r2
        L5b:
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L6d
            java.io.File r3 = r6.directory     // Catch: java.lang.Throwable -> L6d
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> L6d
            boolean r7 = r2.exists()     // Catch: java.lang.Throwable -> L6d
            if (r7 == 0) goto L85
            r2.delete()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L6f
            goto L85
        L6d:
            r7 = move-exception
            goto L8d
        L6f:
            r7 = move-exception
            z6.b r2 = io.ktor.client.plugins.cache.HttpCacheKt.getLOGGER()     // Catch: java.lang.Throwable -> L6d
            boolean r3 = io.ktor.util.logging.LoggerJvmKt.isTraceEnabled(r2)     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L85
            java.lang.String r7 = q0.c.R(r7)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r7 = r0.concat(r7)     // Catch: java.lang.Throwable -> L6d
            r2.e(r7)     // Catch: java.lang.Throwable -> L6d
        L85:
            R5.c r8 = (R5.c) r8
            r8.e(r1)
            O3.C r7 = O3.C.a
            return r7
        L8d:
            R5.c r8 = (R5.c) r8
            r8.e(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.deleteCache(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final R5.a deleteCache$lambda$7() {
        return new R5.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String key(Url url) {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(AbstractC2517v.K(url.getUrlString()));
        l.e("digest(...)", bArrDigest);
        return CryptoKt.hex(bArrDigest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.client.plugins.cache.storage.FileCacheStorage] */
    /* JADX WARN: Type inference failed for: r9v12, types: [R5.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readCache(java.lang.String r9, S3.c<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C11701
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C11701) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.L$0
            R5.a r9 = (R5.a) r9
            P3.r.Y(r10)     // Catch: java.lang.Throwable -> L2f
            goto L77
        L2f:
            r10 = move-exception
            goto L83
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.L$1
            R5.a r9 = (R5.a) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            P3.r.Y(r10)
            r10 = r9
            r9 = r2
            goto L67
        L47:
            P3.r.Y(r10)
            io.ktor.util.collections.ConcurrentMap<java.lang.String, R5.a> r10 = r8.mutexes
            io.ktor.client.plugins.cache.storage.a r2 = new io.ktor.client.plugins.cache.storage.a
            r6 = 0
            r2.<init>(r6)
            java.lang.Object r10 = r10.computeIfAbsent(r9, r2)
            R5.a r10 = (R5.a) r10
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r4
            R5.c r10 = (R5.c) r10
            java.lang.Object r2 = r10.c(r0)
            if (r2 != r1) goto L67
            goto L73
        L67:
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L7f
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L7f
            r0.label = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r9 = r8.readCacheUnsafe(r9, r0)     // Catch: java.lang.Throwable -> L7f
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            r7 = r10
            r10 = r9
            r9 = r7
        L77:
            java.util.Set r10 = (java.util.Set) r10     // Catch: java.lang.Throwable -> L2f
            R5.c r9 = (R5.c) r9
            r9.e(r5)
            return r10
        L7f:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L83:
            R5.c r9 = (R5.c) r9
            r9.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(java.lang.String, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final R5.a readCache$lambda$4() {
        return new R5.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:40:0x00b7, B:46:0x00d8, B:27:0x0070, B:38:0x00a7, B:35:0x0096), top: B:64:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:40:0x00b7, B:46:0x00d8, B:27:0x0070, B:38:0x00a7, B:35:0x0096), top: B:64:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cc -> B:44:0x00d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readCacheUnsafe(java.lang.String r20, S3.c<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCacheUnsafe(java.lang.String, S3.c):java.lang.Object");
    }

    private final Object updateCache(String str, k kVar, S3.c<? super C> cVar) {
        R5.c cVar2 = (R5.c) ((R5.a) this.mutexes.computeIfAbsent((ConcurrentMap) str, (InterfaceC0821a) FileCacheStorage$updateCache$mutex$1.INSTANCE));
        cVar2.c(cVar);
        try {
            writeCacheUnsafe(str, (List) kVar.invoke((Set) readCacheUnsafe(str, null)), null);
            cVar2.e(null);
            return C.a;
        } catch (Throwable th) {
            cVar2.e(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a9, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r2, r15, r0) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x026f, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeInt(r14, r15, r0) != r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x030e, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeFully$default(r4, r5, 0, 0, r8, 6, null) != r1) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[PHI: r13 r14
      0x00df: PHI (r13v12 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v9 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v16 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:40:0x018c, B:24:0x00d4] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r14v11 io.ktor.utils.io.ByteChannel) = (r14v8 io.ktor.utils.io.ByteChannel), (r14v14 io.ktor.utils.io.ByteChannel) binds: [B:40:0x018c, B:24:0x00d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016e A[PHI: r13 r14
      0x016e: PHI (r13v9 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v6 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v11 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:37:0x016a, B:26:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x016e: PHI (r14v8 io.ktor.utils.io.ByteChannel) = (r14v5 io.ktor.utils.io.ByteChannel), (r14v10 io.ktor.utils.io.ByteChannel) binds: [B:37:0x016a, B:26:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0245 A[PHI: r13 r14
      0x0245: PHI (r13v38 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v35 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v40 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:61:0x0241, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0245: PHI (r14v30 io.ktor.utils.io.ByteChannel) = (r14v27 io.ktor.utils.io.ByteChannel), (r14v32 io.ktor.utils.io.ByteChannel) binds: [B:61:0x0241, B:19:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x025b A[PHI: r13 r14
      0x025b: PHI (r13v41 io.ktor.client.plugins.cache.storage.CachedResponseData) = 
      (r13v38 io.ktor.client.plugins.cache.storage.CachedResponseData)
      (r13v43 io.ktor.client.plugins.cache.storage.CachedResponseData)
     binds: [B:64:0x0257, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x025b: PHI (r14v33 io.ktor.utils.io.ByteChannel) = (r14v30 io.ktor.utils.io.ByteChannel), (r14v35 io.ktor.utils.io.ByteChannel) binds: [B:64:0x0257, B:18:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x020d -> B:46:0x01b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x02e0 -> B:70:0x027f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeCache(io.ktor.utils.io.ByteChannel r13, io.ktor.client.plugins.cache.storage.CachedResponseData r14, S3.c<? super O3.C> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.writeCache(io.ktor.utils.io.ByteChannel, io.ktor.client.plugins.cache.storage.CachedResponseData, S3.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeCacheUnsafe(String str, List<CachedResponseData> list, S3.c<Object> cVar) {
        return D.j(new C11742(str, list, null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object find(io.ktor.http.Url r6, java.util.Map<java.lang.String, java.lang.String> r7, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C11681
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C11681) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.L$0
            r7 = r6
            java.util.Map r7 = (java.util.Map) r7
            P3.r.Y(r8)
            goto L46
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            P3.r.Y(r8)
            java.lang.String r6 = r5.key(r6)
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r5.readCache(r6, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            java.util.Set r8 = (java.util.Set) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L4e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L92
            java.lang.Object r8 = r6.next()
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r0 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L62
            return r8
        L62:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L6a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L91
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.getVaryKeys()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.l.a(r3, r2)
            if (r2 != 0) goto L6a
            goto L4e
        L91:
            return r8
        L92:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.find(io.ktor.http.Url, java.util.Map, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object findAll(io.ktor.http.Url r5, S3.c<? super java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.FileCacheStorage.C11691
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.FileCacheStorage.C11691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.FileCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            P3.r.Y(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            P3.r.Y(r6)
            java.lang.String r5 = r4.key(r5)
            r0.label = r3
            java.lang.Object r6 = r4.readCache(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r5 = P3.q.X0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.findAll(io.ktor.http.Url, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r11.writeCacheUnsafe(r2, r5, r0) != r1) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002e, B:21:0x004e, B:32:0x00a2, B:33:0x00af, B:35:0x00b5, B:37:0x00c6, B:38:0x00ca, B:28:0x0090), top: B:45:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove(io.ktor.http.Url r10, java.util.Map<java.lang.String, java.lang.String> r11, S3.c<? super O3.C> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.remove(io.ktor.http.Url, java.util.Map, S3.c):java.lang.Object");
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object removeAll(Url url, S3.c<? super C> cVar) throws Throwable {
        Object objDeleteCache = deleteCache(key(url), cVar);
        return objDeleteCache == T3.a.f9048k ? objDeleteCache : C.a;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, S3.c<? super C> cVar) {
        Object objG = D.G(this.dispatcher, new AnonymousClass2(url, cachedResponseData, null), cVar);
        return objG == T3.a.f9048k ? objG : C.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileCacheStorage(File file, AbstractC0281w abstractC0281w, int i7, f fVar) {
        if ((i7 & 2) != 0) {
            O5.e eVar = M.a;
            abstractC0281w = d.f7623l;
        }
        this(file, abstractC0281w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02c6, code lost:
    
        if (r1 != r4) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03c6, code lost:
    
        if (r1 != r4) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0380 A[PHI: r0 r1 r2 r5 r6 r7 r8 r9
      0x0380: PHI (r0v29 io.ktor.util.date.GMTDate) = (r0v26 io.ktor.util.date.GMTDate), (r0v31 io.ktor.util.date.GMTDate) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r1v42 java.lang.Object) = (r1v41 java.lang.Object), (r1v1 java.lang.Object) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r2v12 io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3) = 
      (r2v11 io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3)
      (r2v2 io.ktor.client.plugins.cache.storage.FileCacheStorage$readCache$3)
     binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r5v33 io.ktor.http.HeadersBuilder) = (r5v29 io.ktor.http.HeadersBuilder), (r5v36 io.ktor.http.HeadersBuilder) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r6v30 io.ktor.http.HttpProtocolVersion) = (r6v26 io.ktor.http.HttpProtocolVersion), (r6v33 io.ktor.http.HttpProtocolVersion) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r7v27 io.ktor.http.HttpStatusCode) = (r7v23 io.ktor.http.HttpStatusCode), (r7v30 io.ktor.http.HttpStatusCode) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r8v19 java.lang.String) = (r8v15 java.lang.String), (r8v22 java.lang.String) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]
      0x0380: PHI (r9v17 io.ktor.utils.io.ByteReadChannel) = (r9v15 io.ktor.utils.io.ByteReadChannel), (r9v20 io.ktor.utils.io.ByteReadChannel) binds: [B:63:0x037c, B:19:0x016e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04df  */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v43, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x032c -> B:57:0x0333). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0450 -> B:82:0x045f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readCache(io.ktor.utils.io.ByteReadChannel r28, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage.readCache(io.ktor.utils.io.ByteReadChannel, S3.c):java.lang.Object");
    }
}
