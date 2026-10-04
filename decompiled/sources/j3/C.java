package j3;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class C extends AbstractC1327m implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Object f12269k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f12270l;

    public C(Object obj, Object obj2) {
        this.f12269k = obj;
        this.f12270l = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12269k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12270l;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
