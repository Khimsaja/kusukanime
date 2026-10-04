package j3;

/* loaded from: classes.dex */
public final class j0 extends J {

    /* renamed from: n, reason: collision with root package name */
    public final transient Object f12356n;

    public j0(Object obj) {
        obj.getClass();
        this.f12356n = obj;
    }

    @Override // j3.J, j3.B
    public final G a() {
        return G.w(this.f12356n);
    }

    @Override // j3.B, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12356n.equals(obj);
    }

    @Override // j3.B
    public final int h(int i7, Object[] objArr) {
        objArr[i7] = this.f12356n;
        return i7 + 1;
    }

    @Override // j3.J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12356n.hashCode();
    }

    @Override // j3.B
    public final boolean p() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f12356n.toString() + ']';
    }

    @Override // j3.J
    /* renamed from: u */
    public final l0 iterator() {
        return new M(this.f12356n);
    }
}
