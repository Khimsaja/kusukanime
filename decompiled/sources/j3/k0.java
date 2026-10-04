package j3;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class k0 implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final Iterator f12358k;

    public k0(Iterator it) {
        it.getClass();
        this.f12358k = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12358k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f12358k.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12358k.remove();
    }
}
