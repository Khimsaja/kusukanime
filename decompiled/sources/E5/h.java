package E5;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class h extends a {

    /* renamed from: n, reason: collision with root package name */
    public final f f1967n;

    /* renamed from: o, reason: collision with root package name */
    public int f1968o;

    /* renamed from: p, reason: collision with root package name */
    public j f1969p;

    /* renamed from: q, reason: collision with root package name */
    public int f1970q;

    public h(f fVar, int i7) {
        super(i7, fVar.f1964p, 0);
        this.f1967n = fVar;
        this.f1968o = fVar.o();
        this.f1970q = -1;
        b();
    }

    public final void a() {
        if (this.f1968o != this.f1967n.o()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // E5.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i7 = this.f1949l;
        f fVar = this.f1967n;
        fVar.add(i7, obj);
        this.f1949l++;
        this.f1950m = fVar.a();
        this.f1968o = fVar.o();
        this.f1970q = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.f1967n;
        Object[] objArr = fVar.f1962n;
        if (objArr == null) {
            this.f1969p = null;
            return;
        }
        int i7 = (fVar.f1964p - 1) & (-32);
        int i8 = this.f1949l;
        if (i8 > i7) {
            i8 = i7;
        }
        int i9 = (fVar.f1959k / 5) + 1;
        j jVar = this.f1969p;
        if (jVar == null) {
            this.f1969p = new j(objArr, i8, i7, i9);
            return;
        }
        jVar.f1949l = i8;
        jVar.f1950m = i7;
        jVar.f1973n = i9;
        if (jVar.f1974o.length < i9) {
            jVar.f1974o = new Object[i9];
        }
        jVar.f1974o[0] = objArr;
        ?? r62 = i8 == i7 ? 1 : 0;
        jVar.f1975p = r62;
        jVar.b(i8 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        this.f1970q = i7;
        j jVar = this.f1969p;
        f fVar = this.f1967n;
        if (jVar == null) {
            Object[] objArr = fVar.f1963o;
            this.f1949l = i7 + 1;
            return objArr[i7];
        }
        if (jVar.hasNext()) {
            this.f1949l++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.f1963o;
        int i8 = this.f1949l;
        this.f1949l = i8 + 1;
        return objArr2[i8 - jVar.f1950m];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        this.f1970q = i7 - 1;
        j jVar = this.f1969p;
        f fVar = this.f1967n;
        if (jVar == null) {
            Object[] objArr = fVar.f1963o;
            int i8 = i7 - 1;
            this.f1949l = i8;
            return objArr[i8];
        }
        int i9 = jVar.f1950m;
        if (i7 <= i9) {
            this.f1949l = i7 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.f1963o;
        int i10 = i7 - 1;
        this.f1949l = i10;
        return objArr2[i10 - i9];
    }

    @Override // E5.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i7 = this.f1970q;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f1967n;
        fVar.h(i7);
        int i8 = this.f1970q;
        if (i8 < this.f1949l) {
            this.f1949l = i8;
        }
        this.f1950m = fVar.a();
        this.f1968o = fVar.o();
        this.f1970q = -1;
        b();
    }

    @Override // E5.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i7 = this.f1970q;
        if (i7 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.f1967n;
        fVar.set(i7, obj);
        this.f1968o = fVar.o();
        b();
    }
}
