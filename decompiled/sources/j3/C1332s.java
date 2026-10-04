package j3;

import f6.AbstractC0905c;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: j3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332s extends AbstractSet {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f12378k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1334u f12379l;

    public /* synthetic */ C1332s(C1334u c1334u, int i7) {
        this.f12378k = i7;
        this.f12379l = c1334u;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f12378k) {
            case 0:
                this.f12379l.clear();
                break;
            default:
                this.f12379l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f12378k) {
            case 0:
                C1334u c1334u = this.f12379l;
                Map mapB = c1334u.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = c1334u.d(entry.getKey());
                    if (iD != -1 && AbstractC0905c.l(c1334u.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f12379l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12378k) {
            case 0:
                C1334u c1334u = this.f12379l;
                Map mapB = c1334u.b();
                return mapB != null ? mapB.entrySet().iterator() : new r(c1334u, 1);
            default:
                C1334u c1334u2 = this.f12379l;
                Map mapB2 = c1334u2.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new r(c1334u2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f12378k) {
            case 0:
                C1334u c1334u = this.f12379l;
                Map mapB = c1334u.b();
                if (mapB != null) {
                    return mapB.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c1334u.f()) {
                        int iC = c1334u.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c1334u.f12384k;
                        Objects.requireNonNull(obj2);
                        int iL = AbstractC1331q.l(key, value, iC, obj2, c1334u.h(), c1334u.i(), c1334u.j());
                        if (iL != -1) {
                            c1334u.e(iL, iC);
                            c1334u.f12389p--;
                            c1334u.f12388o += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C1334u c1334u2 = this.f12379l;
                Map mapB2 = c1334u2.b();
                return mapB2 != null ? mapB2.keySet().remove(obj) : c1334u2.g(obj) != C1334u.f12383t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f12378k) {
        }
        return this.f12379l.size();
    }
}
