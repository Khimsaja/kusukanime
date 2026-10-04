package j3;

import java.util.AbstractList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class N extends k0 implements ListIterator {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f12291l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractList f12292m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(AbstractList abstractList, ListIterator listIterator, int i7) {
        super(listIterator);
        this.f12291l = i7;
        this.f12292m = abstractList;
    }

    @Override // j3.k0
    public final Object a(Object obj) {
        switch (this.f12291l) {
            case 0:
                return ((O) this.f12292m).f12294l.apply(obj);
            default:
                return ((P) this.f12292m).f12296l.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.f12358k).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.f12358k).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.f12358k).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.f12358k).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
