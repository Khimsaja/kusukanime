package io.ktor.client.plugins.cache.storage;

import U3.c;
import U3.e;
import io.github.jan.supabase.auth.PKCEConstants;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0016R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00110\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/client/plugins/cache/storage/CachingCacheStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "delegate", "<init>", "(Lio/ktor/client/plugins/cache/storage/CacheStorage;)V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "LO3/C;", "store", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;LS3/c;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;LS3/c;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "remove", "removeAll", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "Lio/ktor/util/collections/ConcurrentMap;", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CachingCacheStorage implements CacheStorage {
    private final CacheStorage delegate;
    private final ConcurrentMap<Url, Set<CachedResponseData>> store;

    @e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {47}, m = "find")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1, reason: invalid class name */
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(S3.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.find(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {57}, m = "findAll")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11641 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C11641(S3.c<? super C11641> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.findAll(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {63, PKCEConstants.VERIFIER_LENGTH}, m = "remove")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11651 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11651(S3.c<? super C11651> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.remove(null, null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {68}, m = "removeAll")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11661 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C11661(S3.c<? super C11661> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.removeAll(null, this);
        }
    }

    @e(c = "io.ktor.client.plugins.cache.storage.CachingCacheStorage", f = "FileCacheStorage.kt", l = {41, 42}, m = "store")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1, reason: invalid class name and case insensitive filesystem */
    public static final class C11671 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C11671(S3.c<? super C11671> cVar) {
            super(cVar);
        }

        @Override // U3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CachingCacheStorage.this.store(null, null, this);
        }
    }

    public CachingCacheStorage(CacheStorage cacheStorage) {
        l.f("delegate", cacheStorage);
        this.delegate = cacheStorage;
        this.store = new ConcurrentMap<>(0, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object find(io.ktor.http.Url r6, java.util.Map<java.lang.String, java.lang.String> r7, S3.c<? super io.ktor.client.plugins.cache.storage.CachedResponseData> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$find$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r6 = r0.L$3
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r7 = r0.L$2
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r1 = r0.L$1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.http.Url r0 = (io.ktor.http.Url) r0
            P3.r.Y(r8)
            goto L63
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3f:
            P3.r.Y(r8)
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r5.store
            boolean r8 = r8.containsKey(r6)
            if (r8 != 0) goto L68
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r5.store
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r5.delegate
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.L$3 = r6
            r0.label = r3
            java.lang.Object r0 = r2.findAll(r6, r0)
            if (r0 != r1) goto L5f
            return r1
        L5f:
            r1 = r7
            r7 = r8
            r8 = r0
            r0 = r6
        L63:
            r7.put(r6, r8)
            r6 = r0
            r7 = r1
        L68:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r8 = r5.store
            java.lang.Object r6 = P3.E.m0(r6, r8)
            java.util.Set r6 = (java.util.Set) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lba
            java.lang.Object r8 = r6.next()
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachedResponseData r0 = (io.ktor.client.plugins.cache.storage.CachedResponseData) r0
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L8a
            return r8
        L8a:
            java.util.Set r1 = r7.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L92:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb9
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Map r4 = r0.getVaryKeys()
            java.lang.Object r3 = r4.get(r3)
            boolean r2 = kotlin.jvm.internal.l.a(r3, r2)
            if (r2 != 0) goto L92
            goto L76
        Lb9:
            return r8
        Lba:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.find(io.ktor.http.Url, java.util.Map, S3.c):java.lang.Object");
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
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11641
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11641) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$findAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.L$2
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            java.lang.Object r1 = r0.L$1
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r0 = r0.L$0
            io.ktor.http.Url r0 = (io.ktor.http.Url) r0
            P3.r.Y(r6)
            goto L5c
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            P3.r.Y(r6)
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L60
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            io.ktor.client.plugins.cache.storage.CacheStorage r2 = r4.delegate
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r0 = r2.findAll(r5, r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r1 = r6
            r6 = r0
            r0 = r5
        L5c:
            r1.put(r5, r6)
            r5 = r0
        L60:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            java.lang.Object r5 = P3.E.m0(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.findAll(io.ktor.http.Url, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object remove(io.ktor.http.Url r6, java.util.Map<java.lang.String, java.lang.String> r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11651
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11651) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$remove$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r7 = r0.L$0
            java.util.Map r7 = (java.util.Map) r7
            P3.r.Y(r8)
            goto L63
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            P3.r.Y(r8)
            goto L52
        L42:
            P3.r.Y(r8)
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r5.delegate
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.remove(r6, r7, r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r7 = r5.store
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r5.delegate
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r8.findAll(r6, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            r7.put(r6, r8)
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.remove(io.ktor.http.Url, java.util.Map, S3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object removeAll(io.ktor.http.Url r5, S3.c<? super O3.C> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11661
            if (r0 == 0) goto L13
            r0 = r6
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$removeAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.L$0
            io.ktor.http.Url r5 = (io.ktor.http.Url) r5
            P3.r.Y(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            P3.r.Y(r6)
            io.ktor.client.plugins.cache.storage.CacheStorage r6 = r4.delegate
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.removeAll(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r6 = r4.store
            r6.remove(r5)
            O3.C r5 = O3.C.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.removeAll(io.ktor.http.Url, S3.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object store(io.ktor.http.Url r6, io.ktor.client.plugins.cache.storage.CachedResponseData r7, S3.c<? super O3.C> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11671
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = (io.ktor.client.plugins.cache.storage.CachingCacheStorage.C11671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1 r0 = new io.ktor.client.plugins.cache.storage.CachingCacheStorage$store$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            T3.a r1 = T3.a.f9048k
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            java.lang.Object r7 = r0.L$0
            java.util.Map r7 = (java.util.Map) r7
            P3.r.Y(r8)
            goto L63
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            io.ktor.http.Url r6 = (io.ktor.http.Url) r6
            P3.r.Y(r8)
            goto L52
        L42:
            P3.r.Y(r8)
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r5.delegate
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r8.store(r6, r7, r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            io.ktor.util.collections.ConcurrentMap<io.ktor.http.Url, java.util.Set<io.ktor.client.plugins.cache.storage.CachedResponseData>> r7 = r5.store
            io.ktor.client.plugins.cache.storage.CacheStorage r8 = r5.delegate
            r0.L$0 = r7
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r8.findAll(r6, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            r7.put(r6, r8)
            O3.C r6 = O3.C.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.CachingCacheStorage.store(io.ktor.http.Url, io.ktor.client.plugins.cache.storage.CachedResponseData, S3.c):java.lang.Object");
    }
}
