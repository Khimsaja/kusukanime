package X4;

import java.util.Map;

/* loaded from: classes.dex */
public final class G implements Comparable, Map.Entry {

    /* renamed from: k, reason: collision with root package name */
    public final Comparable f9845k;

    /* renamed from: l, reason: collision with root package name */
    public Object f9846l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C f9847m;

    public G(C c2, Comparable comparable, Object obj) {
        this.f9847m = c2;
        this.f9845k = comparable;
        this.f9846l = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9845k.compareTo(((G) obj).f9845k);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9845k;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9846l;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f9845k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9846l;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9845k;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9846l;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9847m.b();
        Object obj2 = this.f9846l;
        this.f9846l = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f9845k);
        String strValueOf2 = String.valueOf(this.f9846l);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 1);
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        return sb.toString();
    }
}
