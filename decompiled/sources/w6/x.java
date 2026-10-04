package w6;

import P3.AbstractC0564e;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class x extends AbstractC0564e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public final l[] f17188k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f17189l;

    public x(l[] lVarArr, int[] iArr) {
        this.f17188k = lVarArr;
        this.f17189l = iArr;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f17188k.length;
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof l) {
            return super.contains((l) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return this.f17188k[i7];
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof l) {
            return super.indexOf((l) obj);
        }
        return -1;
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof l) {
            return super.lastIndexOf((l) obj);
        }
        return -1;
    }
}
