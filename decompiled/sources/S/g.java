package S;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends E5.a {

    /* renamed from: n, reason: collision with root package name */
    public final e f8697n;

    /* renamed from: o, reason: collision with root package name */
    public int f8698o;

    /* renamed from: p, reason: collision with root package name */
    public i f8699p;

    /* renamed from: q, reason: collision with root package name */
    public int f8700q;

    public g(e eVar, int i7) {
        super(i7, eVar.f8694r, 1);
        this.f8697n = eVar;
        this.f8698o = eVar.o();
        this.f8700q = -1;
        b();
    }

    public final void a() {
        if (this.f8698o != this.f8697n.o()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // E5.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i7 = this.f1949l;
        e eVar = this.f8697n;
        eVar.add(i7, obj);
        this.f1949l++;
        this.f1950m = eVar.a();
        this.f8698o = eVar.o();
        this.f8700q = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        e eVar = this.f8697n;
        Object[] objArr = eVar.f8692p;
        if (objArr == null) {
            this.f8699p = null;
            return;
        }
        int i7 = (eVar.f8694r - 1) & (-32);
        int i8 = this.f1949l;
        if (i8 > i7) {
            i8 = i7;
        }
        int i9 = (eVar.f8690n / 5) + 1;
        i iVar = this.f8699p;
        if (iVar == null) {
            this.f8699p = new i(objArr, i8, i7, i9);
            return;
        }
        iVar.f1949l = i8;
        iVar.f1950m = i7;
        iVar.f8703n = i9;
        if (iVar.f8704o.length < i9) {
            iVar.f8704o = new Object[i9];
        }
        iVar.f8704o[0] = objArr;
        ?? r62 = i8 == i7 ? 1 : 0;
        iVar.f8705p = r62;
        iVar.b(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        this.f8700q = i7;
        i iVar = this.f8699p;
        e eVar = this.f8697n;
        if (iVar == null) {
            Object[] objArr = eVar.f8693q;
            this.f1949l = i7 + 1;
            return objArr[i7];
        }
        if (iVar.hasNext()) {
            this.f1949l++;
            return iVar.next();
        }
        Object[] objArr2 = eVar.f8693q;
        int i8 = this.f1949l;
        this.f1949l = i8 + 1;
        return objArr2[i8 - iVar.f1950m];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        this.f8700q = i7 - 1;
        i iVar = this.f8699p;
        e eVar = this.f8697n;
        if (iVar == null) {
            Object[] objArr = eVar.f8693q;
            int i8 = i7 - 1;
            this.f1949l = i8;
            return objArr[i8];
        }
        int i9 = iVar.f1950m;
        if (i7 <= i9) {
            this.f1949l = i7 - 1;
            return iVar.previous();
        }
        Object[] objArr2 = eVar.f8693q;
        int i10 = i7 - 1;
        this.f1949l = i10;
        return objArr2[i10 - i9];
    }

    @Override // E5.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i7 = this.f8700q;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f8697n;
        eVar.h(i7);
        int i8 = this.f8700q;
        if (i8 < this.f1949l) {
            this.f1949l = i8;
        }
        this.f1950m = eVar.a();
        this.f8698o = eVar.o();
        this.f8700q = -1;
        b();
    }

    @Override // E5.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f8700q;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        e eVar = this.f8697n;
        eVar.set(i7, obj);
        this.f8698o = eVar.o();
        b();
    }
}
