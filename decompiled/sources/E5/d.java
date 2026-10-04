package E5;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1953n = 1;

    /* renamed from: o, reason: collision with root package name */
    public final Object f1954o;

    public d(Object[] objArr, int i7, int i8) {
        super(i7, i8, 0);
        this.f1954o = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f1953n) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f1949l;
                this.f1949l = i7 + 1;
                return ((Object[]) this.f1954o)[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f1949l++;
                return this.f1954o;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f1953n) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f1949l - 1;
                this.f1949l = i7;
                return ((Object[]) this.f1954o)[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f1949l--;
                return this.f1954o;
        }
    }

    public d(int i7, Object obj) {
        super(i7, 1, 0);
        this.f1954o = obj;
    }
}
