package F5;

import f4.InterfaceC0881a;
import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2503k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2504l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2505m;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f2503k = i7;
        this.f2504l = obj;
        this.f2505m = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.f2503k) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                if (entry == null || !kotlin.jvm.internal.l.a(entry.getKey(), this.f2504l) || !kotlin.jvm.internal.l.a(entry.getValue(), getValue())) {
                }
                break;
            default:
                Map.Entry entry2 = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                if (entry2 == null || !kotlin.jvm.internal.l.a(entry2.getKey(), this.f2504l) || !kotlin.jvm.internal.l.a(entry2.getValue(), getValue())) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f2503k) {
        }
        return this.f2504l;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f2503k) {
        }
        return this.f2505m;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.f2503k) {
            case 0:
                Object obj = this.f2504l;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                Object obj2 = this.f2504l;
                int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
                Object value2 = getValue();
                return (value2 != null ? value2.hashCode() : 0) ^ iHashCode2;
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f2503k) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public final String toString() {
        switch (this.f2503k) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.f2504l);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f2504l);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
        }
    }
}
