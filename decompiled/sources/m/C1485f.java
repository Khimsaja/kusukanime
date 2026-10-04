package m;

import f4.InterfaceC0882b;
import f4.InterfaceC0886f;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import n.AbstractC1529a;

/* renamed from: m.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485f implements Collection, Set, InterfaceC0882b, InterfaceC0886f {

    /* renamed from: k, reason: collision with root package name */
    public int[] f12891k = AbstractC1529a.a;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f12892l = AbstractC1529a.f13115c;

    /* renamed from: m, reason: collision with root package name */
    public int f12893m;

    public final Object a(int i7) {
        int i8 = this.f12893m;
        Object[] objArr = this.f12892l;
        Object obj = objArr[i7];
        if (i8 <= 1) {
            clear();
            return obj;
        }
        int i9 = i8 - 1;
        int[] iArr = this.f12891k;
        if (iArr.length <= 8 || i8 >= iArr.length / 3) {
            if (i7 < i9) {
                int i10 = i7 + 1;
                P3.m.V(i7, i10, i8, iArr, iArr);
                Object[] objArr2 = this.f12892l;
                P3.m.W(i7, i10, i8, objArr2, objArr2);
            }
            this.f12892l[i9] = null;
        } else {
            AbstractC1493n.b(this, i8 > 8 ? i8 + (i8 >> 1) : 8);
            if (i7 > 0) {
                P3.m.Y(0, i7, 6, iArr, this.f12891k);
                P3.m.Z(0, i7, 6, objArr, this.f12892l);
            }
            if (i7 < i9) {
                int i11 = i7 + 1;
                P3.m.V(i7, i11, i8, iArr, this.f12891k);
                P3.m.W(i7, i11, i8, objArr, this.f12892l);
            }
        }
        if (i8 != this.f12893m) {
            throw new ConcurrentModificationException();
        }
        this.f12893m = i9;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i7;
        int iC;
        int i8 = this.f12893m;
        if (obj == null) {
            iC = AbstractC1493n.c(this, null, 0);
            i7 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i7 = iHashCode;
            iC = AbstractC1493n.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i9 = ~iC;
        int[] iArr = this.f12891k;
        if (i8 >= iArr.length) {
            int i10 = 8;
            if (i8 >= 8) {
                i10 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i10 = 4;
            }
            Object[] objArr = this.f12892l;
            AbstractC1493n.b(this, i10);
            if (i8 != this.f12893m) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f12891k;
            if (iArr2.length != 0) {
                P3.m.Y(0, iArr.length, 6, iArr, iArr2);
                P3.m.Z(0, objArr.length, 6, objArr, this.f12892l);
            }
        }
        if (i9 < i8) {
            int[] iArr3 = this.f12891k;
            int i11 = i9 + 1;
            P3.m.V(i11, i9, i8, iArr3, iArr3);
            Object[] objArr2 = this.f12892l;
            P3.m.W(i11, i9, i8, objArr2, objArr2);
        }
        int i12 = this.f12893m;
        if (i8 == i12) {
            int[] iArr4 = this.f12891k;
            if (i9 < iArr4.length) {
                iArr4[i9] = i7;
                this.f12892l[i9] = obj;
                this.f12893m = i12 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        int size = collection.size() + this.f12893m;
        int i7 = this.f12893m;
        int[] iArr = this.f12891k;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f12892l;
            AbstractC1493n.b(this, size);
            int i8 = this.f12893m;
            if (i8 > 0) {
                P3.m.Y(0, i8, 6, iArr, this.f12891k);
                P3.m.Z(0, this.f12893m, 6, objArr, this.f12892l);
            }
        }
        if (this.f12893m != i7) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f12893m != 0) {
            this.f12891k = AbstractC1529a.a;
            this.f12892l = AbstractC1529a.f13115c;
            this.f12893m = 0;
        }
        if (this.f12893m != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC1493n.c(this, null, 0) : AbstractC1493n.c(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f12893m != ((Set) obj).size()) {
            return false;
        }
        try {
            int i7 = this.f12893m;
            for (int i8 = 0; i8 < i7; i8++) {
                if (!((Set) obj).contains(this.f12892l[i8])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f12891k;
        int i7 = this.f12893m;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            i8 += iArr[i9];
        }
        return i8;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f12893m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C1480a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC = obj == null ? AbstractC1493n.c(this, null, 0) : AbstractC1493n.c(this, obj, obj.hashCode());
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z7 = false;
        for (int i7 = this.f12893m - 1; -1 < i7; i7--) {
            if (!P3.q.m0(collection, this.f12892l[i7])) {
                a(i7);
                z7 = true;
            }
        }
        return z7;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f12893m;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return P3.m.b0(this.f12892l, 0, this.f12893m);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12893m * 14);
        sb.append('{');
        int i7 = this.f12893m;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            Object obj = this.f12892l[i8];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        int i7 = this.f12893m;
        if (objArr.length < i7) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i7);
        } else if (objArr.length > i7) {
            objArr[i7] = null;
        }
        P3.m.W(0, 0, this.f12893m, this.f12892l, objArr);
        return objArr;
    }
}
