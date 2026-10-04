package j3;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class M extends l0 {

    /* renamed from: k, reason: collision with root package name */
    public final Object f12289k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12290l;

    public M(Object obj) {
        this.f12289k = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f12290l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12290l) {
            throw new NoSuchElementException();
        }
        this.f12290l = true;
        return this.f12289k;
    }
}
