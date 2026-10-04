package j3;

import f6.AbstractC0915m;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class F extends G {

    /* renamed from: m, reason: collision with root package name */
    public final transient int f12274m;

    /* renamed from: n, reason: collision with root package name */
    public final transient int f12275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ G f12276o;

    public F(G g4, int i7, int i8) {
        this.f12276o = g4;
        this.f12274m = i7;
        this.f12275n = i8;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        AbstractC0915m.h(i7, this.f12275n);
        return this.f12276o.get(i7 + this.f12274m);
    }

    @Override // j3.G, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // j3.B
    public final Object[] j() {
        return this.f12276o.j();
    }

    @Override // j3.G, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // j3.B
    public final int m() {
        return this.f12276o.o() + this.f12274m + this.f12275n;
    }

    @Override // j3.B
    public final int o() {
        return this.f12276o.o() + this.f12274m;
    }

    @Override // j3.B
    public final boolean p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12275n;
    }

    @Override // j3.G, java.util.List
    /* renamed from: z */
    public final G subList(int i7, int i8) {
        AbstractC0915m.j(i7, i8, this.f12275n);
        int i9 = this.f12274m;
        return this.f12276o.subList(i7 + i9, i8 + i9);
    }

    @Override // j3.G, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
