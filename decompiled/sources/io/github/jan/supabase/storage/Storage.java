package io.github.jan.supabase.storage;

import O3.C;
import b1.AbstractC0703b;
import e4.k;
import io.github.jan.supabase.SupabaseClient;
import io.github.jan.supabase.SupabaseClientBuilder;
import io.github.jan.supabase.SupabaseSerializer;
import io.github.jan.supabase.logging.LogLevel;
import io.github.jan.supabase.logging.SupabaseLogger;
import io.github.jan.supabase.plugins.CustomSerializationConfig;
import io.github.jan.supabase.plugins.CustomSerializationPlugin;
import io.github.jan.supabase.plugins.MainConfig;
import io.github.jan.supabase.plugins.MainPlugin;
import io.github.jan.supabase.plugins.SupabasePluginProvider;
import io.github.jan.supabase.storage.resumable.ResumableCache;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u001a\u001bJ1\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bH¦@¢\u0006\u0002\u0010\fJ1\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0002\b\u000bH¦@¢\u0006\u0002\u0010\fJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH¦@¢\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0014J\u0016\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0007H¦@¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0007H¦\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lio/github/jan/supabase/storage/Storage;", "Lio/github/jan/supabase/plugins/MainPlugin;", "Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/plugins/CustomSerializationPlugin;", "createBucket", "", "id", "", "builder", "Lkotlin/Function1;", "Lio/github/jan/supabase/storage/BucketBuilder;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBucket", "retrieveBuckets", "", "Lio/github/jan/supabase/storage/Bucket;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieveBucketById", "bucketId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emptyBucket", "deleteBucket", "get", "Lio/github/jan/supabase/storage/BucketApi;", "from", "Config", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Storage extends MainPlugin<Config>, CustomSerializationPlugin {
    public static final int API_VERSION = 1;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final long DEFAULT_CHUNK_SIZE = 6291456;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u0012\u001a\u00020\u00022\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0002\b\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/github/jan/supabase/storage/Storage$Companion;", "Lio/github/jan/supabase/plugins/SupabasePluginProvider;", "Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/storage/Storage;", "<init>", "()V", "key", "", "getKey", "()Ljava/lang/String;", "logger", "Lio/github/jan/supabase/logging/SupabaseLogger;", "getLogger", "()Lio/github/jan/supabase/logging/SupabaseLogger;", "API_VERSION", "", "DEFAULT_CHUNK_SIZE", "", "createConfig", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "create", "supabaseClient", "Lio/github/jan/supabase/SupabaseClient;", "config", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion implements SupabasePluginProvider<Config, Storage> {
        public static final int API_VERSION = 1;
        public static final long DEFAULT_CHUNK_SIZE = 6291456;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String key = "storage";
        private static final SupabaseLogger logger = SupabaseClient.Companion.createLogger$default(SupabaseClient.INSTANCE, "Supabase-Storage", null, 2, null);

        private Companion() {
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public String getKey() {
            return key;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public SupabaseLogger getLogger() {
            return logger;
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public /* bridge */ void setup(SupabaseClientBuilder supabaseClientBuilder, Config config) {
            super.setup(supabaseClientBuilder, (SupabaseClientBuilder) config);
        }

        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public Storage create(SupabaseClient supabaseClient, Config config) {
            l.f("supabaseClient", supabaseClient);
            l.f("config", config);
            return new StorageImpl(supabaseClient, config);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.github.jan.supabase.plugins.SupabasePluginProvider
        public Config createConfig(k kVar) {
            l.f("init", kVar);
            Config config = new Config(0L, null, null, 7, null);
            kVar.invoke(config);
            return config;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001.B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0005\u001a\u00020\u001a2\u0017\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001a0\u001c¢\u0006\u0002\b\u001dH\u0086\bø\u0001\u0000J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\fJ\u000e\u0010 \u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b!J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003J0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u001c\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Lio/github/jan/supabase/storage/Storage$Config;", "Lio/github/jan/supabase/plugins/MainConfig;", "Lio/github/jan/supabase/plugins/CustomSerializationConfig;", "transferTimeout", "Lkotlin/time/Duration;", "resumable", "Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "serializer", "Lio/github/jan/supabase/SupabaseSerializer;", "<init>", "(JLio/github/jan/supabase/storage/Storage$Config$Resumable;Lio/github/jan/supabase/SupabaseSerializer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getTransferTimeout-UwyO8pc", "()J", "setTransferTimeout-LRDsOJo", "(J)V", "J", "getResumable$annotations", "()V", "getResumable", "()Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "setResumable", "(Lio/github/jan/supabase/storage/Storage$Config$Resumable;)V", "getSerializer", "()Lio/github/jan/supabase/SupabaseSerializer;", "setSerializer", "(Lio/github/jan/supabase/SupabaseSerializer;)V", "", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "component1", "component1-UwyO8pc", "component2", "component2$storage_kt_release", "component3", "copy", "copy-KLykuaI", "(JLio/github/jan/supabase/storage/Storage$Config$Resumable;Lio/github/jan/supabase/SupabaseSerializer;)Lio/github/jan/supabase/storage/Storage$Config;", "equals", "", "other", "", "hashCode", "", "toString", "", "Resumable", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Config extends MainConfig implements CustomSerializationConfig {
        private Resumable resumable;
        private SupabaseSerializer serializer;
        private long transferTimeout;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J0\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011¨\u0006)"}, d2 = {"Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "", "cache", "Lio/github/jan/supabase/storage/resumable/ResumableCache;", "retryTimeout", "Lkotlin/time/Duration;", "onlyUpdateStateAfterChunk", "", "<init>", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getCache", "()Lio/github/jan/supabase/storage/resumable/ResumableCache;", "setCache", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;)V", "getRetryTimeout-UwyO8pc", "()J", "setRetryTimeout-LRDsOJo", "(J)V", "J", "getOnlyUpdateStateAfterChunk", "()Z", "setOnlyUpdateStateAfterChunk", "(Z)V", "value", "", "defaultChunkSize", "getDefaultChunkSize", "setDefaultChunkSize", "component1", "component2", "component2-UwyO8pc", "component3", "copy", "copy-8Mi8wO0", "(Lio/github/jan/supabase/storage/resumable/ResumableCache;JZ)Lio/github/jan/supabase/storage/Storage$Config$Resumable;", "equals", "other", "hashCode", "", "toString", "", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Resumable {
            private ResumableCache cache;
            private long defaultChunkSize;
            private boolean onlyUpdateStateAfterChunk;
            private long retryTimeout;

            public /* synthetic */ Resumable(ResumableCache resumableCache, long j7, boolean z7, kotlin.jvm.internal.f fVar) {
                this(resumableCache, j7, z7);
            }

            /* renamed from: copy-8Mi8wO0$default, reason: not valid java name */
            public static /* synthetic */ Resumable m71copy8Mi8wO0$default(Resumable resumable, ResumableCache resumableCache, long j7, boolean z7, int i7, Object obj) {
                if ((i7 & 1) != 0) {
                    resumableCache = resumable.cache;
                }
                if ((i7 & 2) != 0) {
                    j7 = resumable.retryTimeout;
                }
                if ((i7 & 4) != 0) {
                    z7 = resumable.onlyUpdateStateAfterChunk;
                }
                return resumable.m73copy8Mi8wO0(resumableCache, j7, z7);
            }

            /* renamed from: component1, reason: from getter */
            public final ResumableCache getCache() {
                return this.cache;
            }

            /* renamed from: component2-UwyO8pc, reason: not valid java name and from getter */
            public final long getRetryTimeout() {
                return this.retryTimeout;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getOnlyUpdateStateAfterChunk() {
                return this.onlyUpdateStateAfterChunk;
            }

            /* renamed from: copy-8Mi8wO0, reason: not valid java name */
            public final Resumable m73copy8Mi8wO0(ResumableCache cache, long retryTimeout, boolean onlyUpdateStateAfterChunk) {
                return new Resumable(cache, retryTimeout, onlyUpdateStateAfterChunk, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (other instanceof Resumable) {
                    Resumable resumable = (Resumable) other;
                    if (l.a(this.cache, resumable.cache)) {
                        long j7 = this.retryTimeout;
                        long j8 = resumable.retryTimeout;
                        int i7 = A5.a.f239n;
                        if (j7 == j8 && this.onlyUpdateStateAfterChunk == resumable.onlyUpdateStateAfterChunk) {
                            return true;
                        }
                    }
                }
                return false;
            }

            public final ResumableCache getCache() {
                return this.cache;
            }

            public final long getDefaultChunkSize() {
                return this.defaultChunkSize;
            }

            public final boolean getOnlyUpdateStateAfterChunk() {
                return this.onlyUpdateStateAfterChunk;
            }

            /* renamed from: getRetryTimeout-UwyO8pc, reason: not valid java name */
            public final long m74getRetryTimeoutUwyO8pc() {
                return this.retryTimeout;
            }

            public int hashCode() {
                ResumableCache resumableCache = this.cache;
                int iHashCode = resumableCache == null ? 0 : resumableCache.hashCode();
                long j7 = this.retryTimeout;
                int i7 = A5.a.f239n;
                return Boolean.hashCode(this.onlyUpdateStateAfterChunk) + AbstractC0703b.c(iHashCode * 31, 31, j7);
            }

            public final void setCache(ResumableCache resumableCache) {
                this.cache = resumableCache;
            }

            public final void setDefaultChunkSize(long j7) {
                if (j7 != 6291456) {
                    SupabaseLogger logger = Storage.INSTANCE.getLogger();
                    LogLevel logLevel = LogLevel.WARNING;
                    LogLevel level = logger.getLevel();
                    if (level == null) {
                        level = SupabaseClient.INSTANCE.getDEFAULT_LOG_LEVEL();
                    }
                    if (logLevel.compareTo(level) >= 0) {
                        logger.log(logLevel, (Throwable) null, "Supabase currently only supports a chunk size of 6MB");
                    }
                }
                this.defaultChunkSize = j7;
            }

            public final void setOnlyUpdateStateAfterChunk(boolean z7) {
                this.onlyUpdateStateAfterChunk = z7;
            }

            /* renamed from: setRetryTimeout-LRDsOJo, reason: not valid java name */
            public final void m75setRetryTimeoutLRDsOJo(long j7) {
                this.retryTimeout = j7;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("Resumable(cache=");
                sb.append(this.cache);
                sb.append(", retryTimeout=");
                sb.append((Object) A5.a.i(this.retryTimeout));
                sb.append(", onlyUpdateStateAfterChunk=");
                return AbstractC0703b.n(sb, this.onlyUpdateStateAfterChunk, ')');
            }

            private Resumable(ResumableCache resumableCache, long j7, boolean z7) {
                this.cache = resumableCache;
                this.retryTimeout = j7;
                this.onlyUpdateStateAfterChunk = z7;
                this.defaultChunkSize = 6291456L;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ Resumable(ResumableCache resumableCache, long j7, boolean z7, int i7, kotlin.jvm.internal.f fVar) {
                ResumableCache resumableCache2 = (i7 & 1) != 0 ? null : resumableCache;
                if ((i7 & 2) != 0) {
                    int i8 = A5.a.f239n;
                    j7 = A5.g.n(5, A5.c.f243n);
                }
                this(resumableCache2, j7, (i7 & 4) != 0 ? false : z7, null);
            }
        }

        public /* synthetic */ Config(long j7, Resumable resumable, SupabaseSerializer supabaseSerializer, kotlin.jvm.internal.f fVar) {
            this(j7, resumable, supabaseSerializer);
        }

        /* renamed from: copy-KLykuaI$default, reason: not valid java name */
        public static /* synthetic */ Config m66copyKLykuaI$default(Config config, long j7, Resumable resumable, SupabaseSerializer supabaseSerializer, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                j7 = config.transferTimeout;
            }
            if ((i7 & 2) != 0) {
                resumable = config.resumable;
            }
            if ((i7 & 4) != 0) {
                supabaseSerializer = config.serializer;
            }
            return config.m68copyKLykuaI(j7, resumable, supabaseSerializer);
        }

        public static /* synthetic */ void getResumable$annotations() {
        }

        /* renamed from: component1-UwyO8pc, reason: not valid java name and from getter */
        public final long getTransferTimeout() {
            return this.transferTimeout;
        }

        /* renamed from: component2$storage_kt_release, reason: from getter */
        public final Resumable getResumable() {
            return this.resumable;
        }

        /* renamed from: component3, reason: from getter */
        public final SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        /* renamed from: copy-KLykuaI, reason: not valid java name */
        public final Config m68copyKLykuaI(long transferTimeout, Resumable resumable, SupabaseSerializer serializer) {
            l.f("resumable", resumable);
            return new Config(transferTimeout, resumable, serializer, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other instanceof Config) {
                Config config = (Config) other;
                long j7 = this.transferTimeout;
                long j8 = config.transferTimeout;
                int i7 = A5.a.f239n;
                if (j7 == j8 && l.a(this.resumable, config.resumable) && l.a(this.serializer, config.serializer)) {
                    return true;
                }
            }
            return false;
        }

        public final Resumable getResumable() {
            return this.resumable;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public SupabaseSerializer getSerializer() {
            return this.serializer;
        }

        /* renamed from: getTransferTimeout-UwyO8pc, reason: not valid java name */
        public final long m69getTransferTimeoutUwyO8pc() {
            return this.transferTimeout;
        }

        public int hashCode() {
            long j7 = this.transferTimeout;
            int i7 = A5.a.f239n;
            int iHashCode = (this.resumable.hashCode() + (Long.hashCode(j7) * 31)) * 31;
            SupabaseSerializer supabaseSerializer = this.serializer;
            return iHashCode + (supabaseSerializer == null ? 0 : supabaseSerializer.hashCode());
        }

        public final void resumable(k kVar) {
            l.f("builder", kVar);
            Resumable resumable = new Resumable(null, 0L, false, 7, null);
            kVar.invoke(resumable);
            setResumable(resumable);
        }

        public final void setResumable(Resumable resumable) {
            l.f("<set-?>", resumable);
            this.resumable = resumable;
        }

        @Override // io.github.jan.supabase.plugins.CustomSerializationConfig
        public void setSerializer(SupabaseSerializer supabaseSerializer) {
            this.serializer = supabaseSerializer;
        }

        /* renamed from: setTransferTimeout-LRDsOJo, reason: not valid java name */
        public final void m70setTransferTimeoutLRDsOJo(long j7) {
            this.transferTimeout = j7;
        }

        public String toString() {
            return "Config(transferTimeout=" + ((Object) A5.a.i(this.transferTimeout)) + ", resumable=" + this.resumable + ", serializer=" + this.serializer + ')';
        }

        private Config(long j7, Resumable resumable, SupabaseSerializer supabaseSerializer) {
            l.f("resumable", resumable);
            this.transferTimeout = j7;
            this.resumable = resumable;
            this.serializer = supabaseSerializer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Config(long j7, Resumable resumable, SupabaseSerializer supabaseSerializer, int i7, kotlin.jvm.internal.f fVar) {
            if ((i7 & 1) != 0) {
                int i8 = A5.a.f239n;
                j7 = A5.g.n(120, A5.c.f243n);
            }
            this(j7, (i7 & 2) != 0 ? new Resumable(null, 0L, false, 7, null) : resumable, (i7 & 4) != 0 ? null : supabaseSerializer, null);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static Object close(Storage storage, S3.c<? super C> cVar) {
            return Storage.super.close(cVar);
        }

        @Deprecated
        public static BucketApi from(Storage storage, String str) {
            l.f("bucketId", str);
            return Storage.super.from(str);
        }

        @Deprecated
        public static void init(Storage storage) {
            Storage.super.init();
        }

        @Deprecated
        public static String resolveUrl(Storage storage, String str) {
            l.f("path", str);
            return Storage.super.resolveUrl(str);
        }
    }

    static /* synthetic */ Object createBucket$default(Storage storage, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBucket");
        }
        if ((i7 & 2) != 0) {
            kVar = new f(25);
        }
        return storage.createBucket(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C createBucket$lambda$0(BucketBuilder bucketBuilder) {
        l.f("<this>", bucketBuilder);
        return C.a;
    }

    static /* synthetic */ Object updateBucket$default(Storage storage, String str, k kVar, S3.c cVar, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBucket");
        }
        if ((i7 & 2) != 0) {
            kVar = new f(24);
        }
        return storage.updateBucket(str, kVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static C updateBucket$lambda$0(BucketBuilder bucketBuilder) {
        l.f("<this>", bucketBuilder);
        return C.a;
    }

    Object createBucket(String str, k kVar, S3.c<? super C> cVar);

    Object deleteBucket(String str, S3.c<? super C> cVar);

    Object emptyBucket(String str, S3.c<? super C> cVar);

    default BucketApi from(String bucketId) {
        l.f("bucketId", bucketId);
        return get(bucketId);
    }

    BucketApi get(String bucketId);

    Object retrieveBucketById(String str, S3.c<? super Bucket> cVar);

    Object retrieveBuckets(S3.c<? super List<Bucket>> cVar);

    Object updateBucket(String str, k kVar, S3.c<? super C> cVar);
}
