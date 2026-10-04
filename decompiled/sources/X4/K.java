package X4;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class K implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public Iterator f9855k;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9855k.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f9855k.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
