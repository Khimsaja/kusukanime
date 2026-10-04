package j3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public int f12372k;

    /* renamed from: l, reason: collision with root package name */
    public int f12373l;

    /* renamed from: m, reason: collision with root package name */
    public int f12374m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1334u f12375n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12376o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1334u f12377p;

    public r(C1334u c1334u, int i7) {
        this.f12376o = i7;
        this.f12377p = c1334u;
        this.f12375n = c1334u;
        this.f12372k = c1334u.f12388o;
        this.f12373l = c1334u.isEmpty() ? -1 : 0;
        this.f12374m = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12373l >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object c1333t;
        C1334u c1334u = this.f12375n;
        if (c1334u.f12388o != this.f12372k) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f12373l;
        this.f12374m = i7;
        switch (this.f12376o) {
            case 0:
                c1333t = this.f12377p.i()[i7];
                break;
            case 1:
                c1333t = new C1333t(this.f12377p, i7);
                break;
            default:
                c1333t = this.f12377p.j()[i7];
                break;
        }
        int i8 = this.f12373l + 1;
        if (i8 >= c1334u.f12389p) {
            i8 = -1;
        }
        this.f12373l = i8;
        return c1333t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        C1334u c1334u = this.f12375n;
        int i7 = c1334u.f12388o;
        int i8 = this.f12372k;
        if (i7 != i8) {
            throw new ConcurrentModificationException();
        }
        int i9 = this.f12374m;
        if (i9 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f12372k = i8 + 32;
        c1334u.remove(c1334u.i()[i9]);
        this.f12373l--;
        this.f12374m = -1;
    }
}
