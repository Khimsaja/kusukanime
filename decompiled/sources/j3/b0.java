package j3;

import f6.AbstractC0915m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b0 extends G {

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f12319m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f12320n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f12321o;

    public b0(Object[] objArr, int i7, int i8) {
        this.f12319m = objArr;
        this.f12320n = i7;
        this.f12321o = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC0915m.h(i7, this.f12321o);
        Object obj = this.f12319m[(i7 * 2) + this.f12320n];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // j3.B
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12321o;
    }
}
