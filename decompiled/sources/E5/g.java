package E5;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g extends a {

    /* renamed from: n, reason: collision with root package name */
    public final Object[] f1965n;

    /* renamed from: o, reason: collision with root package name */
    public final j f1966o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i7, int i8, int i9, Object[] objArr, Object[] objArr2) {
        super(i7, i8, 0);
        l.f("root", objArr);
        l.f("tail", objArr2);
        this.f1965n = objArr2;
        int i10 = (i8 - 1) & (-32);
        this.f1966o = new j(objArr, i7 > i10 ? i10 : i7, i10, i9);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.f1966o;
        if (jVar.hasNext()) {
            this.f1949l++;
            return jVar.next();
        }
        int i7 = this.f1949l;
        this.f1949l = i7 + 1;
        return this.f1965n[i7 - jVar.f1950m];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f1949l;
        j jVar = this.f1966o;
        int i8 = jVar.f1950m;
        if (i7 <= i8) {
            this.f1949l = i7 - 1;
            return jVar.previous();
        }
        int i9 = i7 - 1;
        this.f1949l = i9;
        return this.f1965n[i9 - i8];
    }
}
