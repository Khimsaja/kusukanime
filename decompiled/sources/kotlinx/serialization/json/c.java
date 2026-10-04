package kotlinx.serialization.json;

import A3.e;
import P3.q;
import V5.i;
import a6.x;
import f4.InterfaceC0881a;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.l;

@i(with = x.class)
/* loaded from: classes.dex */
public final class c extends b implements Map<String, b>, InterfaceC0881a {
    public static final JsonObject$Companion Companion = new JsonObject$Companion();

    /* renamed from: k, reason: collision with root package name */
    public final Map f12722k;

    public c(Map map) {
        l.f("content", map);
        this.f12722k = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b compute(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfAbsent(String str, Function<? super String, ? extends b> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b computeIfPresent(String str, BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        l.f("key", str);
        return this.f12722k.containsKey(str);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        l.f("value", bVar);
        return this.f12722k.containsValue(bVar);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, b>> entrySet() {
        return this.f12722k.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return l.a(this.f12722k, obj);
    }

    @Override // java.util.Map
    public final b get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        l.f("key", str);
        return (b) this.f12722k.get(str);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f12722k.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12722k.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f12722k.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b merge(String str, b bVar, BiFunction<? super b, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b put(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends b> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b putIfAbsent(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final b remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ b replace(String str, b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super b, ? extends b> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12722k.size();
    }

    public final String toString() {
        return q.y0(this.f12722k.entrySet(), ",", "{", "}", new e(17), 24);
    }

    @Override // java.util.Map
    public final Collection<b> values() {
        return this.f12722k.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, b bVar, b bVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
