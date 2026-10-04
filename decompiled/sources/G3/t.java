package G3;

import java.util.Map;

/* loaded from: classes.dex */
public final class t implements Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public t f2838k;

    /* renamed from: l, reason: collision with root package name */
    public t f2839l;

    /* renamed from: m, reason: collision with root package name */
    public t f2840m;

    /* renamed from: n, reason: collision with root package name */
    public t f2841n;

    /* renamed from: o, reason: collision with root package name */
    public t f2842o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f2843p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2844q;

    /* renamed from: r, reason: collision with root package name */
    public Object f2845r;

    /* renamed from: s, reason: collision with root package name */
    public int f2846s;

    public t() {
        this.f2843p = null;
        this.f2844q = -1;
        this.f2842o = this;
        this.f2841n = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f2843p;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f2845r;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2843p;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2845r;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f2843p;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2845r;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f2845r;
        this.f2845r = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2843p + "=" + this.f2845r;
    }

    public t(t tVar, Object obj, int i7, t tVar2, t tVar3) {
        this.f2838k = tVar;
        this.f2843p = obj;
        this.f2844q = i7;
        this.f2846s = 1;
        this.f2841n = tVar2;
        this.f2842o = tVar3;
        tVar3.f2841n = this;
        tVar2.f2842o = this;
    }
}
