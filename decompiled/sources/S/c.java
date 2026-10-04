package S;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends E5.a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f8681n = 1;

    /* renamed from: o, reason: collision with root package name */
    public final Object f8682o;

    public c(Object[] objArr, int i7, int i8) {
        super(i7, i8, 1);
        this.f8682o = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f8681n) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f1949l;
                this.f1949l = i7 + 1;
                return ((Object[]) this.f8682o)[i7];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f1949l++;
                return this.f8682o;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f8681n) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                int i7 = this.f1949l - 1;
                this.f1949l = i7;
                return ((Object[]) this.f8682o)[i7];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f1949l--;
                return this.f8682o;
        }
    }

    public c(int i7, Object obj) {
        super(i7, 1, 1);
        this.f8682o = obj;
    }
}
