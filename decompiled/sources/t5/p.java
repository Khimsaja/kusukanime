package t5;

import java.util.Iterator;
import n5.C1570g;

/* loaded from: classes.dex */
public final class p extends AbstractC2061a {

    /* renamed from: k, reason: collision with root package name */
    public final C1570g f16119k;

    /* renamed from: l, reason: collision with root package name */
    public final int f16120l;

    public p(int i7, C1570g c1570g) {
        this.f16119k = c1570g;
        this.f16120l = i7;
    }

    @Override // t5.AbstractC2061a
    public final int a() {
        return 1;
    }

    @Override // t5.AbstractC2061a
    public final Object get(int i7) {
        if (i7 == this.f16120l) {
            return this.f16119k;
        }
        return null;
    }

    @Override // t5.AbstractC2061a
    public final void h(int i7, C1570g c1570g) {
        throw new IllegalStateException();
    }

    @Override // t5.AbstractC2061a, java.lang.Iterable
    public final Iterator iterator() {
        return new w5.g(2, this);
    }
}
