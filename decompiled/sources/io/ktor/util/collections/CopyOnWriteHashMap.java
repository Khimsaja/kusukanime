package io.ktor.util.collections;

import P3.z;
import e4.k;
import io.ktor.utils.io.InternalAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@InternalAPI
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u000bJ)\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/util/collections/CopyOnWriteHashMap;", "", "K", "V", "<init>", "()V", "key", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "LO3/C;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "Lkotlin/Function1;", "producer", "computeIfAbsent", "(Ljava/lang/Object;Le4/k;)Ljava/lang/Object;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CopyOnWriteHashMap<K, V> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater current$FU = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");
    private volatile /* synthetic */ Object current = z.f7780k;

    public final V computeIfAbsent(K key, k producer) {
        l.f("key", key);
        l.f("producer", producer);
        while (true) {
            Map map = (Map) this.current;
            V v5 = (V) map.get(key);
            if (v5 != null) {
                return v5;
            }
            HashMap map2 = new HashMap(map);
            V v7 = (V) producer.invoke(key);
            map2.put(key, v7);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v7;
        }
    }

    public final V get(K key) {
        l.f("key", key);
        return (V) ((Map) this.current).get(key);
    }

    public final V put(K key, V value) {
        l.f("key", key);
        l.f("value", value);
        while (true) {
            Map map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            HashMap map2 = new HashMap(map);
            V v5 = (V) map2.put(key, value);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v5;
        }
    }

    public final V remove(K key) {
        l.f("key", key);
        while (true) {
            Map map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            HashMap map2 = new HashMap(map);
            V v5 = (V) map2.remove(key);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = current$FU;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, map, map2)) {
                if (atomicReferenceFieldUpdater.get(this) != map) {
                    break;
                }
            }
            return v5;
        }
    }

    public final void set(K key, V value) {
        l.f("key", key);
        l.f("value", value);
        put(key, value);
    }
}
