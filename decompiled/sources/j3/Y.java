package j3;

import f6.AbstractC0915m;
import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y extends G {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f12307m;

    public Y(Z z7) {
        this.f12307m = z7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Z z7 = this.f12307m;
        AbstractC0915m.h(i7, z7.f12310p);
        int i8 = i7 * 2;
        Object[] objArr = z7.f12309o;
        Object obj = objArr[i8];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i8 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // j3.B
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12307m.f12310p;
    }
}
