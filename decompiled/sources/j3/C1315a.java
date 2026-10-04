package j3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1315a implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final Iterator f12311k;

    /* renamed from: l, reason: collision with root package name */
    public Object f12312l = null;

    /* renamed from: m, reason: collision with root package name */
    public Collection f12313m = null;

    /* renamed from: n, reason: collision with root package name */
    public Iterator f12314n = L.f12287k;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ T f12315o;

    public C1315a(T t7) {
        this.f12315o = t7;
        this.f12311k = t7.f12298n.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12311k.hasNext() || this.f12314n.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12314n.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f12311k.next();
            this.f12312l = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f12313m = collection;
            this.f12314n = collection.iterator();
        }
        return this.f12314n.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12314n.remove();
        Collection collection = this.f12313m;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f12311k.remove();
        }
        T t7 = this.f12315o;
        t7.f12299o--;
    }
}
