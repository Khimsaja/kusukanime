package X4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class A implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final z f9828k;

    /* renamed from: l, reason: collision with root package name */
    public u f9829l;

    /* renamed from: m, reason: collision with root package name */
    public int f9830m;

    public A(B b4) {
        z zVar = new z(b4);
        this.f9828k = zVar;
        this.f9829l = new u(zVar.next());
        this.f9830m = b4.f9832l;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9830m > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9829l.hasNext()) {
            this.f9829l = new u(this.f9828k.next());
        }
        this.f9830m--;
        return Byte.valueOf(this.f9829l.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
