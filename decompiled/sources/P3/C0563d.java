package P3;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: P3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563d extends AbstractC0564e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0564e f7759k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7760l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7761m;

    public C0563d(AbstractC0564e abstractC0564e, int i7, int i8) {
        this.f7759k = abstractC0564e;
        this.f7760l = i7;
        q0.c.m(i7, i8, abstractC0564e.a());
        this.f7761m = i8 - i7;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f7761m;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i8 = this.f7761m;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, i8, "index: ", ", size: "));
        }
        return this.f7759k.get(this.f7760l + i7);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final List subList(int i7, int i8) {
        q0.c.m(i7, i8, this.f7761m);
        int i9 = this.f7760l;
        return new C0563d(this.f7759k, i7 + i9, i9 + i8);
    }
}
