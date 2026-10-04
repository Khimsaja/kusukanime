package m;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1484e extends C1477G implements Map {

    /* renamed from: n, reason: collision with root package name */
    public X4.I f12888n;

    /* renamed from: o, reason: collision with root package name */
    public C1481b f12889o;

    /* renamed from: p, reason: collision with root package name */
    public C1483d f12890p;

    @Override // java.util.Map
    public final Set entrySet() {
        X4.I i7 = this.f12888n;
        if (i7 != null) {
            return i7;
        }
        X4.I i8 = new X4.I(this, 1);
        this.f12888n = i8;
        return i8;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i7 = this.f12870m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i7 != this.f12870m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1481b c1481b = this.f12889o;
        if (c1481b != null) {
            return c1481b;
        }
        C1481b c1481b2 = new C1481b(this);
        this.f12889o = c1481b2;
        return c1481b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f12870m;
        int i7 = this.f12870m;
        int[] iArr = this.f12868k;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f12868k = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12869l, size * 2);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f12869l = objArrCopyOf;
        }
        if (this.f12870m != i7) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C1483d c1483d = this.f12890p;
        if (c1483d != null) {
            return c1483d;
        }
        C1483d c1483d2 = new C1483d(this);
        this.f12890p = c1483d2;
        return c1483d2;
    }
}
