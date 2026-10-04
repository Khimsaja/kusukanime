package k;

import java.util.Iterator;

/* renamed from: k.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1370b extends AbstractC1373e implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public C1371c f12551k;

    /* renamed from: l, reason: collision with root package name */
    public C1371c f12552l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f12553m;

    public C1370b(C1371c c1371c, C1371c c1371c2, int i7) {
        this.f12553m = i7;
        this.f12551k = c1371c2;
        this.f12552l = c1371c;
    }

    @Override // k.AbstractC1373e
    public final void a(C1371c c1371c) {
        C1371c c1371c2;
        C1371c c1371cB = null;
        if (this.f12551k == c1371c && c1371c == this.f12552l) {
            this.f12552l = null;
            this.f12551k = null;
        }
        C1371c c1371c3 = this.f12551k;
        if (c1371c3 == c1371c) {
            switch (this.f12553m) {
                case 0:
                    c1371c2 = c1371c3.f12557n;
                    break;
                default:
                    c1371c2 = c1371c3.f12556m;
                    break;
            }
            this.f12551k = c1371c2;
        }
        C1371c c1371c4 = this.f12552l;
        if (c1371c4 == c1371c) {
            C1371c c1371c5 = this.f12551k;
            if (c1371c4 != c1371c5 && c1371c5 != null) {
                c1371cB = b(c1371c4);
            }
            this.f12552l = c1371cB;
        }
    }

    public final C1371c b(C1371c c1371c) {
        switch (this.f12553m) {
            case 0:
                return c1371c.f12556m;
            default:
                return c1371c.f12557n;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12552l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1371c c1371c = this.f12552l;
        C1371c c1371c2 = this.f12551k;
        this.f12552l = (c1371c == c1371c2 || c1371c2 == null) ? null : b(c1371c);
        return c1371c;
    }
}
