package j3;

import f6.AbstractC0915m;
import java.util.Objects;

/* loaded from: classes.dex */
public final class X extends G {

    /* renamed from: o, reason: collision with root package name */
    public static final X f12304o = new X(0, new Object[0]);

    /* renamed from: m, reason: collision with root package name */
    public final transient Object[] f12305m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f12306n;

    public X(int i7, Object[] objArr) {
        this.f12305m = objArr;
        this.f12306n = i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC0915m.h(i7, this.f12306n);
        Object obj = this.f12305m[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // j3.G, j3.B
    public final int h(int i7, Object[] objArr) {
        Object[] objArr2 = this.f12305m;
        int i8 = this.f12306n;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // j3.B
    public final Object[] j() {
        return this.f12305m;
    }

    @Override // j3.B
    public final int m() {
        return this.f12306n;
    }

    @Override // j3.B
    public final int o() {
        return 0;
    }

    @Override // j3.B
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12306n;
    }
}
