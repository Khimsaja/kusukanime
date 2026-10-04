package P3;

import f4.InterfaceC0881a;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class D implements Iterator, InterfaceC0881a {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
