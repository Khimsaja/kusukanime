package X4;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import m.C1482c;
import m.C1484e;

/* loaded from: classes.dex */
public final class I extends AbstractSet {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f9852k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Map f9853l;

    public /* synthetic */ I(Map map, int i7) {
        this.f9852k = i7;
        this.f9853l = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.f9852k) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((C) this.f9853l).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.f9852k) {
            case 0:
                ((C) this.f9853l).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.f9852k) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((C) this.f9853l).get(entry.getKey());
                Object value = entry.getValue();
                return obj2 == value || (obj2 != null && obj2.equals(value));
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f9852k) {
            case 0:
                return new H((C) this.f9853l);
            default:
                return new C1482c((C1484e) this.f9853l);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.f9852k) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((C) this.f9853l).remove(entry.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f9852k) {
            case 0:
                return ((C) this.f9853l).size();
            default:
                return ((C1484e) this.f9853l).f12870m;
        }
    }
}
