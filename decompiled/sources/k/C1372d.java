package k;

import java.util.Iterator;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372d extends AbstractC1373e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C1371c f12558k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12559l = true;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1369a f12560m;

    public C1372d(C1369a c1369a) {
        this.f12560m = c1369a;
    }

    @Override // k.AbstractC1373e
    public final void a(C1371c c1371c) {
        C1371c c1371c2 = this.f12558k;
        if (c1371c == c1371c2) {
            C1371c c1371c3 = c1371c2.f12557n;
            this.f12558k = c1371c3;
            this.f12559l = c1371c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12559l) {
            return this.f12560m.f12546k != null;
        }
        C1371c c1371c = this.f12558k;
        return (c1371c == null || c1371c.f12556m == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12559l) {
            this.f12559l = false;
            this.f12558k = this.f12560m.f12546k;
        } else {
            C1371c c1371c = this.f12558k;
            this.f12558k = c1371c != null ? c1371c.f12556m : null;
        }
        return this.f12558k;
    }
}
