package k4;

import f4.InterfaceC0881a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* renamed from: k4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1393b implements Iterator, InterfaceC0881a {

    /* renamed from: k, reason: collision with root package name */
    public final int f12667k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12668l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f12669m;

    /* renamed from: n, reason: collision with root package name */
    public int f12670n;

    public C1393b(char c2, char c4, int i7) {
        this.f12667k = i7;
        this.f12668l = c4;
        boolean z7 = false;
        if (i7 <= 0 ? l.g(c2, c4) >= 0 : l.g(c2, c4) <= 0) {
            z7 = true;
        }
        this.f12669m = z7;
        this.f12670n = z7 ? c2 : c4;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12669m;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f12670n;
        if (i7 != this.f12668l) {
            this.f12670n = this.f12667k + i7;
        } else {
            if (!this.f12669m) {
                throw new NoSuchElementException();
            }
            this.f12669m = false;
        }
        return Character.valueOf((char) i7);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
