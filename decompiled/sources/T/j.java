package T;

import F5.q;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: o, reason: collision with root package name */
    public final F5.i f8833o;

    public j(F5.i iVar) {
        super(1);
        this.f8833o = iVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f2550n;
        this.f2550n = i7 + 2;
        Object[] objArr = this.f2548l;
        return new a(this.f8833o, objArr[i7], objArr[i7 + 1]);
    }
}
