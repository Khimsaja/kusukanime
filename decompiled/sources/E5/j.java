package E5;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class j extends a {

    /* renamed from: n, reason: collision with root package name */
    public int f1973n;

    /* renamed from: o, reason: collision with root package name */
    public Object[] f1974o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1975p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i7, int i8, int i9) {
        super(i7, i8, 0);
        l.f("root", objArr);
        this.f1973n = i9;
        Object[] objArr2 = new Object[i9];
        this.f1974o = objArr2;
        ?? r52 = i7 == i8 ? 1 : 0;
        this.f1975p = r52;
        objArr2[0] = objArr;
        b(i7 - r52, 1);
    }

    public final Object a() {
        int i7 = this.f1949l & 31;
        Object obj = this.f1974o[this.f1973n - 1];
        l.d("null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>", obj);
        return ((Object[]) obj)[i7];
    }

    public final void b(int i7, int i8) {
        int i9 = (this.f1973n - i8) * 5;
        while (i8 < this.f1973n) {
            Object[] objArr = this.f1974o;
            Object obj = objArr[i8 - 1];
            l.d("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>", obj);
            objArr[i8] = ((Object[]) obj)[AbstractC1420H.G(i7, i9)];
            i9 -= 5;
            i8++;
        }
    }

    public final void c(int i7) {
        int i8 = 0;
        while (AbstractC1420H.G(this.f1949l, i8) == i7) {
            i8 += 5;
        }
        if (i8 > 0) {
            b(this.f1949l, ((this.f1973n - 1) - (i8 / 5)) + 1);
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
            this.f1975p = true;
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
        if (this.f1975p) {
            this.f1975p = false;
            return a();
        }
        c(31);
        return a();
    }
}
