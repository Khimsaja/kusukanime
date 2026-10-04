package p1;

/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: k, reason: collision with root package name */
    public final int f14180k;

    /* renamed from: l, reason: collision with root package name */
    public int f14181l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f14182m = -1;

    public m(int i7) {
        this.f14180k = i7;
    }

    @Override // p1.l
    public final boolean c(CharSequence charSequence, int i7, int i8, q qVar) {
        int i9 = this.f14180k;
        if (i7 > i9 || i9 >= i8) {
            return i8 <= i9;
        }
        this.f14181l = i7;
        this.f14182m = i8;
        return false;
    }

    @Override // p1.l
    public final Object a() {
        return this;
    }
}
