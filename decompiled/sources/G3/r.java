package G3;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class r implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public t f2831k;

    /* renamed from: l, reason: collision with root package name */
    public t f2832l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f2833m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u f2834n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2835o;

    public r(u uVar, int i7) {
        this.f2835o = i7;
        this.f2834n = uVar;
        this.f2831k = uVar.f2850m.f2841n;
        this.f2833m = uVar.f2852o;
    }

    public final Object a() {
        return b();
    }

    public final t b() {
        t tVar = this.f2831k;
        u uVar = this.f2834n;
        if (tVar == uVar.f2850m) {
            throw new NoSuchElementException();
        }
        if (uVar.f2852o != this.f2833m) {
            throw new ConcurrentModificationException();
        }
        this.f2831k = tVar.f2841n;
        this.f2832l = tVar;
        return tVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2831k != this.f2834n.f2850m;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.f2835o) {
            case 1:
                return b().f2843p;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        t tVar = this.f2832l;
        if (tVar == null) {
            throw new IllegalStateException();
        }
        u uVar = this.f2834n;
        uVar.c(tVar, true);
        this.f2832l = null;
        this.f2833m = uVar.f2852o;
    }
}
