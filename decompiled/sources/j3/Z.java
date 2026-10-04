package j3;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z extends J {

    /* renamed from: n, reason: collision with root package name */
    public final transient c0 f12308n;

    /* renamed from: o, reason: collision with root package name */
    public final transient Object[] f12309o;

    /* renamed from: p, reason: collision with root package name */
    public final transient int f12310p;

    public Z(c0 c0Var, Object[] objArr, int i7) {
        this.f12308n = c0Var;
        this.f12309o = objArr;
        this.f12310p = i7;
    }

    @Override // j3.B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f12308n.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // j3.B
    public final int h(int i7, Object[] objArr) {
        return a().h(i7, objArr);
    }

    @Override // j3.B
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12310p;
    }

    @Override // j3.J
    public final G t() {
        return new Y(this);
    }

    @Override // j3.J
    /* renamed from: u */
    public final l0 iterator() {
        return a().listIterator(0);
    }
}
