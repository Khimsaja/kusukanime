package Q3;

import f4.InterfaceC0884d;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e implements Map.Entry, InterfaceC0884d {

    /* renamed from: k, reason: collision with root package name */
    public final g f7969k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7970l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7971m;

    public e(g gVar, int i7) {
        l.f("map", gVar);
        this.f7969k = gVar;
        this.f7970l = i7;
        this.f7971m = gVar.f7984r;
    }

    public final void a() {
        if (this.f7969k.f7984r != this.f7971m) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f7969k.f7977k[this.f7970l];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f7969k.f7978l;
        l.c(objArr);
        return objArr[this.f7970l];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        g gVar = this.f7969k;
        gVar.c();
        Object[] objArr = gVar.f7978l;
        if (objArr == null) {
            int length = gVar.f7977k.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            gVar.f7978l = objArr;
        }
        int i7 = this.f7970l;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
