package T;

import F5.q;
import P3.AbstractC0568i;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class d extends AbstractC0568i {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8824k;

    /* renamed from: l, reason: collision with root package name */
    public final W.c f8825l;

    public /* synthetic */ d(int i7, W.c cVar) {
        this.f8824k = i7;
        this.f8825l = cVar;
    }

    @Override // P3.AbstractC0568i
    public final int a() {
        switch (this.f8824k) {
        }
        return this.f8825l.c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f8824k) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8824k) {
            case 0:
                this.f8825l.clear();
                break;
            default:
                this.f8825l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8824k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                Object key = entry.getKey();
                W.c cVar = this.f8825l;
                Object obj2 = cVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && cVar.containsKey(entry.getKey());
            default:
                return this.f8825l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8824k) {
            case 0:
                return new F5.i(this.f8825l);
            default:
                q[] qVarArr = new q[8];
                for (int i7 = 0; i7 < 8; i7++) {
                    qVarArr[i7] = new i(1);
                }
                return new e(this.f8825l, qVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8824k) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if ((entry != null ? entry : null) == null) {
                    return false;
                }
                return this.f8825l.remove(entry.getKey(), entry.getValue());
            default:
                W.c cVar = this.f8825l;
                if (!cVar.containsKey(obj)) {
                    return false;
                }
                cVar.remove(obj);
                return true;
        }
    }
}
