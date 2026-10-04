package S;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends E5.a {

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f8695n;

    /* renamed from: o, reason: collision with root package name */
    public final i f8696o;

    public f(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        super(i7, i8, 1);
        this.f8695n = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f8696o = new i(objArr, i7 > i10 ? i10 : i7, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        i iVar = this.f8696o;
        if (iVar.hasNext()) {
            this.f1949l++;
            return iVar.next();
        }
        int i7 = this.f1949l;
        this.f1949l = i7 + 1;
        return this.f8695n[i7 - iVar.f1950m];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        i iVar = this.f8696o;
        int i8 = iVar.f1950m;
        if (i7 <= i8) {
            this.f1949l = i7 - 1;
            return iVar.previous();
        }
        int i9 = i7 - 1;
        this.f1949l = i9;
        return this.f8695n[i9 - i8];
    }
}
