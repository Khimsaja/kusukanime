package S;

import P3.r;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends E5.a {

    /* renamed from: n, reason: collision with root package name */
    public int f8703n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f8704o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8705p;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public i(Object[] objArr, int i7, int i8, int i9) {
        super(i7, i8, 1);
        this.f8703n = i9;
        Object[] objArr2 = new Object[i9];
        this.f8704o = objArr2;
        ?? r52 = i7 == i8 ? 1 : 0;
        this.f8705p = r52;
        objArr2[0] = objArr;
        b(i7 - r52, 1);
    }

    public final Object a() {
        int i7 = this.f1949l & 31;
        Object obj = this.f8704o[this.f8703n - 1];
        l.d("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>", obj);
        return ((Object[]) obj)[i7];
    }

    public final void b(int i7, int i8) {
        int i9 = (this.f8703n - i8) * 5;
        while (i8 < this.f8703n) {
            Object[] objArr = this.f8704o;
            Object obj = objArr[i8 - 1];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr[i8] = ((Object[]) obj)[r.D(i7, i9)];
            i9 -= 5;
            i8++;
        }
    }

    public final void c(int i7) {
        int i8 = 0;
        while (r.D(this.f1949l, i8) == i7) {
            i8 += 5;
        }
        if (i8 > 0) {
            b(this.f1949l, ((this.f8703n - 1) - (i8 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i7 = this.f1949l + 1;
        this.f1949l = i7;
        if (i7 == this.f1950m) {
            this.f8705p = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f1949l--;
        if (this.f8705p) {
            this.f8705p = false;
            return a();
        }
        c(31);
        return a();
    }
}
