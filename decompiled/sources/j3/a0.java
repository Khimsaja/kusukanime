package j3;

/* loaded from: classes.dex */
public final class a0 extends J {

    /* renamed from: n, reason: collision with root package name */
    public final transient c0 f12316n;

    /* renamed from: o, reason: collision with root package name */
    public final transient b0 f12317o;

    public a0(c0 c0Var, b0 b0Var) {
        this.f12316n = c0Var;
        this.f12317o = b0Var;
    }

    @Override // j3.J, j3.B
    public final G a() {
        return this.f12317o;
    }

    @Override // j3.B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12316n.get(obj) != null;
    }

    @Override // j3.B
    public final int h(int i7, Object[] objArr) {
        return this.f12317o.h(i7, objArr);
    }

    @Override // j3.B
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f12316n.f12332p;
    }

    @Override // j3.J
    /* renamed from: u */
    public final l0 iterator() {
        return this.f12317o.listIterator(0);
    }
}
