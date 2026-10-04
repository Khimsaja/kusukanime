package Z5;

import f4.InterfaceC0881a;
import java.util.Map;

/* loaded from: classes.dex */
public final class V implements Map.Entry, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f10310k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f10311l;

    public V(Object obj, Object obj2) {
        this.f10310k = obj;
        this.f10311l = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v5 = (V) obj;
        return kotlin.jvm.internal.l.a(this.f10310k, v5.f10310k) && kotlin.jvm.internal.l.a(this.f10311l, v5.f10311l);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10310k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10311l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f10310k;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f10311l;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MapEntry(key=");
        sb.append(this.f10310k);
        sb.append(", value=");
        return A6.b.i(sb, this.f10311l, ')');
    }
}
