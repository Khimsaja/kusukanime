package io.ktor.client.plugins.cache.storage;

import O3.C;
import P3.A;
import S3.c;
import io.ktor.http.Url;
import io.ktor.util.collections.ConcurrentMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0014\u0010\u0012R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/ktor/client/plugins/cache/storage/UnlimitedStorage;", "Lio/ktor/client/plugins/cache/storage/CacheStorage;", "<init>", "()V", "Lio/ktor/http/Url;", "url", "Lio/ktor/client/plugins/cache/storage/CachedResponseData;", "data", "LO3/C;", "store", "(Lio/ktor/http/Url;Lio/ktor/client/plugins/cache/storage/CachedResponseData;LS3/c;)Ljava/lang/Object;", "", "", "varyKeys", "find", "(Lio/ktor/http/Url;Ljava/util/Map;LS3/c;)Ljava/lang/Object;", "", "findAll", "(Lio/ktor/http/Url;LS3/c;)Ljava/lang/Object;", "remove", "removeAll", "Lio/ktor/util/collections/ConcurrentMap;", "", "Lio/ktor/util/collections/ConcurrentMap;", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnlimitedStorage implements CacheStorage {
    private final ConcurrentMap<Url, Set<CachedResponseData>> store = new ConcurrentMap<>(0, 1, null);

    private static final boolean remove$lambda$5(Map map, CachedResponseData cachedResponseData) {
        l.f("entry", cachedResponseData);
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                if (!l.a(cachedResponseData.getVaryKeys().get((String) entry.getKey()), (String) entry.getValue())) {
                    return false;
                }
            }
        }
        return map.size() == cachedResponseData.getVaryKeys().size();
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object find(Url url, Map<String, String> map, c<? super CachedResponseData> cVar) {
        for (Object obj : this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, new a(6))) {
            CachedResponseData cachedResponseData = (CachedResponseData) obj;
            if (map.isEmpty()) {
                return obj;
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!l.a(cachedResponseData.getVaryKeys().get(key), entry.getValue())) {
                    break;
                }
            }
            return obj;
        }
        return null;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object findAll(Url url, c<? super Set<CachedResponseData>> cVar) {
        Set<CachedResponseData> set = this.store.get(url);
        return set == null ? A.f7737k : set;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object remove(Url url, Map<String, String> map, c<? super C> cVar) {
        Set<CachedResponseData> set = this.store.get(url);
        if (set != null) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (remove$lambda$5(map, (CachedResponseData) it.next())) {
                    it.remove();
                }
            }
        }
        return C.a;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object removeAll(Url url, c<? super C> cVar) {
        this.store.remove(url);
        return C.a;
    }

    @Override // io.ktor.client.plugins.cache.storage.CacheStorage
    public Object store(Url url, CachedResponseData cachedResponseData, c<? super C> cVar) {
        Set<CachedResponseData> setComputeIfAbsent = this.store.computeIfAbsent((ConcurrentMap<Url, Set<CachedResponseData>>) url, new a(7));
        if (!setComputeIfAbsent.add(cachedResponseData)) {
            setComputeIfAbsent.remove(cachedResponseData);
            setComputeIfAbsent.add(cachedResponseData);
        }
        return C.a;
    }
}
