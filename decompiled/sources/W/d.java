package W;

import O.AbstractC0505m0;
import O.InterfaceC0501k0;
import O.U0;
import T.h;

/* loaded from: classes.dex */
public final class d extends T.b implements InterfaceC0501k0 {

    /* renamed from: n, reason: collision with root package name */
    public static final d f9511n = new d(h.f8828e, 0);

    @Override // T.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC0505m0) {
            return super.containsKey((AbstractC0505m0) obj);
        }
        return false;
    }

    @Override // P3.AbstractC0565f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof U0) {
            return super.containsValue((U0) obj);
        }
        return false;
    }

    @Override // T.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof AbstractC0505m0) {
            return (U0) super.get((AbstractC0505m0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC0505m0) ? obj2 : (U0) super.getOrDefault((AbstractC0505m0) obj, (U0) obj2);
    }
}
