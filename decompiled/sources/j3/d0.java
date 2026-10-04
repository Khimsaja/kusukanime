package j3;

/* loaded from: classes.dex */
public final class d0 extends J {

    /* renamed from: s, reason: collision with root package name */
    public static final Object[] f12337s;

    /* renamed from: t, reason: collision with root package name */
    public static final d0 f12338t;

    /* renamed from: n, reason: collision with root package name */
    public final transient Object[] f12339n;

    /* renamed from: o, reason: collision with root package name */
    public final transient int f12340o;

    /* renamed from: p, reason: collision with root package name */
    public final transient Object[] f12341p;

    /* renamed from: q, reason: collision with root package name */
    public final transient int f12342q;

    /* renamed from: r, reason: collision with root package name */
    public final transient int f12343r;

    static {
        Object[] objArr = new Object[0];
        f12337s = objArr;
        f12338t = new d0(0, 0, 0, objArr, objArr);
    }

    public d0(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        this.f12339n = objArr;
        this.f12340o = i7;
        this.f12341p = objArr2;
        this.f12342q = i8;
        this.f12343r = i9;
    }

    @Override // j3.B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f12341p;
            if (objArr.length != 0) {
                int iO = AbstractC1331q.o(obj);
                while (true) {
                    int i7 = iO & this.f12342q;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iO = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // j3.B
    public final int h(int i7, Object[] objArr) {
        Object[] objArr2 = this.f12339n;
        int i8 = this.f12343r;
        System.arraycopy(objArr2, 0, objArr, i7, i8);
        return i7 + i8;
    }

    @Override // j3.J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12340o;
    }

    @Override // j3.B
    public final Object[] j() {
        return this.f12339n;
    }

    @Override // j3.B
    public final int m() {
        return this.f12343r;
    }

    @Override // j3.B
    public final int o() {
        return 0;
    }

    @Override // j3.B
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12343r;
    }

    @Override // j3.J
    public final G t() {
        return G.q(this.f12343r, this.f12339n);
    }

    @Override // j3.J
    /* renamed from: u */
    public final l0 iterator() {
        return a().listIterator(0);
    }
}
