package io.github.jan.supabase.collections;

import A3.e;
import D5.c;
import F5.d;
import F5.f;
import F5.o;
import F5.p;
import O3.l;
import P3.AbstractC0565f;
import P3.E;
import f4.InterfaceC0885e;
import io.github.jan.supabase.annotations.SupabaseInternal;
import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B3\u0012*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0015\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\"J\b\u0010%\u001a\u00020&H\u0016J\u001e\u0010'\u001a\u00020&2\u0014\u0010(\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010)H\u0016J\u001f\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010+J\u0017\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 R\"\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lio/github/jan/supabase/collections/AtomicMutableMap;", "K", "V", "", "pairs", "", "Lkotlin/Pair;", "<init>", "([Lkotlin/Pair;)V", "ref", "Lkotlin/concurrent/atomics/AtomicReference;", "Lkotlinx/collections/immutable/PersistentMap;", "Ljava/util/concurrent/atomic/AtomicReference;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "values", "", "getValues", "()Ljava/util/Collection;", ContentDisposition.Parameters.Size, "", "getSize", "()I", "isEmpty", "", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "value", "clear", "", "putAll", "from", "", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "supabase-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SupabaseInternal
/* loaded from: classes.dex */
public final class AtomicMutableMap<K, V> implements Map<K, V>, InterfaceC0885e {
    private final AtomicReference<c> ref;

    public AtomicMutableMap(l... lVarArr) {
        kotlin.jvm.internal.l.f("pairs", lVarArr);
        l[] lVarArr2 = (l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        kotlin.jvm.internal.l.f("pairs", lVarArr2);
        d dVar = d.f2513m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", dVar);
        f fVar = new f(dVar);
        E.p0(fVar, lVarArr2);
        this.ref = new AtomicReference<>(fVar.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final c clear$lambda$0(c cVar) {
        kotlin.jvm.internal.l.f("it", cVar);
        if (((AbstractC0565f) cVar).isEmpty()) {
            return cVar;
        }
        d dVar = d.f2513m;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>", dVar);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c putAll$lambda$0(Map map, c cVar) {
        kotlin.jvm.internal.l.f("it", cVar);
        d dVar = (d) cVar;
        kotlin.jvm.internal.l.f("m", map);
        if (map.isEmpty()) {
            return dVar;
        }
        f fVar = new f(dVar);
        fVar.putAll(map);
        return fVar.h();
    }

    @Override // java.util.Map
    public void clear() {
        AtomicUtilsKt.updateIfChanged(this.ref, new e(12));
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return ((d) this.ref.get()).containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return ((AbstractC0565f) ((c) this.ref.get())).containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object key) {
        return (V) ((d) this.ref.get()).get(key);
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return E.t0(this.ref.get()).entrySet();
    }

    public Set<K> getKeys() {
        return E.t0(this.ref.get()).keySet();
    }

    public int getSize() {
        return ((AbstractC0565f) ((c) this.ref.get())).c();
    }

    public Collection<V> getValues() {
        return E.t0(this.ref.get()).values();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return ((AbstractC0565f) ((c) this.ref.get())).isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        V v5;
        loop0: while (true) {
            d dVar = (d) this.ref.get();
            v5 = (V) dVar.get(key);
            o oVarU = dVar.f2514k.u(key != null ? key.hashCode() : 0, 0, key, value);
            d dVar2 = oVarU == null ? dVar : new d((p) oVarU.f2542m, dVar.f2515l + oVarU.f2541l);
            if (dVar2 != dVar) {
                AtomicReference<c> atomicReference = this.ref;
                while (!atomicReference.compareAndSet(dVar, dVar2)) {
                    if (atomicReference.get() != dVar) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        return v5;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.l.f("from", from);
        if (from.isEmpty()) {
            return;
        }
        AtomicUtilsKt.updateIfChanged(this.ref, new K3.c(from, 0));
    }

    @Override // java.util.Map
    public V remove(Object key) {
        while (true) {
            d dVar = (d) this.ref.get();
            V v5 = (V) dVar.get(key);
            if (v5 != null) {
                d dVarH = dVar.h(key);
                AtomicReference<c> atomicReference = this.ref;
                while (!atomicReference.compareAndSet(dVar, dVarH)) {
                    if (atomicReference.get() != dVar) {
                        break;
                    }
                }
                return v5;
            }
            d dVarH2 = dVar.h(key);
            if (dVarH2 == dVar) {
                return null;
            }
            AtomicReference<c> atomicReference2 = this.ref;
            while (!atomicReference2.compareAndSet(dVar, dVarH2)) {
                if (atomicReference2.get() != dVar) {
                    break;
                }
            }
            return null;
        }
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
