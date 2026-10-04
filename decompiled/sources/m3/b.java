package m3;

import f6.AbstractC0915m;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final int[] f12971k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12972l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12973m;

    public b(int i7, int i8, int[] iArr) {
        this.f12971k = iArr;
        this.f12972l = i7;
        this.f12973m = i8;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f12972l;
        while (true) {
            if (i7 >= this.f12973m) {
                i7 = -1;
                break;
            }
            if (this.f12971k[i7] == iIntValue) {
                break;
            }
            i7++;
        }
        return i7 != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return super.equals(obj);
        }
        b bVar = (b) obj;
        int size = size();
        if (bVar.size() != size) {
            return false;
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (this.f12971k[this.f12972l + i7] != bVar.f12971k[bVar.f12972l + i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        AbstractC0915m.h(i7, size());
        return Integer.valueOf(this.f12971k[this.f12972l + i7]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i8 = this.f12972l; i8 < this.f12973m; i8++) {
            i7 = (i7 * 31) + this.f12971k[i8];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i7 = this.f12972l;
            int i8 = i7;
            while (true) {
                if (i8 >= this.f12973m) {
                    i8 = -1;
                    break;
                }
                if (this.f12971k[i8] == iIntValue) {
                    break;
                }
                i8++;
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i7;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i8 = this.f12973m;
            while (true) {
                i8--;
                i7 = this.f12972l;
                if (i8 < i7) {
                    i8 = -1;
                    break;
                }
                if (this.f12971k[i8] == iIntValue) {
                    break;
                }
            }
            if (i8 >= 0) {
                return i8 - i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Integer num = (Integer) obj;
        AbstractC0915m.h(i7, size());
        int i8 = this.f12972l + i7;
        int[] iArr = this.f12971k;
        int i9 = iArr[i8];
        num.getClass();
        iArr[i8] = num.intValue();
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12973m - this.f12972l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i8) {
        AbstractC0915m.j(i7, i8, size());
        if (i7 == i8) {
            return Collections.EMPTY_LIST;
        }
        int i9 = this.f12972l;
        return new b(i7 + i9, i9 + i8, this.f12971k);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f12971k;
        int i7 = this.f12972l;
        sb.append(iArr[i7]);
        while (true) {
            i7++;
            if (i7 >= this.f12973m) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i7]);
        }
    }
}
