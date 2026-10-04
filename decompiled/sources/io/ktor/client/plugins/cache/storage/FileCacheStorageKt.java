package io.ktor.client.plugins.cache.storage;

import H5.AbstractC0281w;
import H5.M;
import O5.d;
import O5.e;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljava/io/File;", "directory", "LH5/w;", "dispatcher", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "FileStorage", "(Ljava/io/File;LH5/w;)Lio/ktor/client/plugins/cache/storage/CacheStorage;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileCacheStorageKt {
    public static final CacheStorage FileStorage(File file, AbstractC0281w abstractC0281w) {
        l.f("directory", file);
        l.f("dispatcher", abstractC0281w);
        return new CachingCacheStorage(new FileCacheStorage(file, abstractC0281w));
    }

    public static CacheStorage FileStorage$default(File file, AbstractC0281w abstractC0281w, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            e eVar = M.a;
            abstractC0281w = d.f7623l;
        }
        return FileStorage(file, abstractC0281w);
    }
}
