package w5;

import b1.AbstractC0703b;
import io.ktor.util.GzipHeaderFlags;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class f extends AbstractList implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public int f17101k;

    /* renamed from: l, reason: collision with root package name */
    public Object f17102l;

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 2 || i7 == 3 || i7 == 5 || i7 == 6 || i7 == 7) ? 2 : 3];
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i7 == 2 || i7 == 3) {
            objArr[1] = "iterator";
        } else if (i7 == 5 || i7 == 6 || i7 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i7) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 2 && i7 != 3 && i7 != 5 && i7 != 6 && i7 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i7 = this.f17101k;
        if (i7 == 0) {
            this.f17102l = obj;
        } else if (i7 == 1) {
            this.f17102l = new Object[]{this.f17102l, obj};
        } else {
            Object[] objArr = (Object[]) this.f17102l;
            int length = objArr.length;
            if (i7 >= length) {
                int i8 = ((length * 3) / 2) + 1;
                int i9 = i7 + 1;
                if (i8 < i9) {
                    i8 = i9;
                }
                Object[] objArr2 = new Object[i8];
                this.f17102l = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f17101k] = obj;
        }
        this.f17101k++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f17102l = null;
        this.f17101k = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8;
        if (i7 >= 0 && i7 < (i8 = this.f17101k)) {
            return i8 == 1 ? this.f17102l : ((Object[]) this.f17102l)[i7];
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Index: ", ", Size: ");
        sbP.append(this.f17101k);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i7 = this.f17101k;
        if (i7 == 0) {
            return d.f17097k;
        }
        if (i7 == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8;
        Object obj;
        if (i7 < 0 || i7 >= (i8 = this.f17101k)) {
            StringBuilder sbP = AbstractC0703b.p(i7, "Index: ", ", Size: ");
            sbP.append(this.f17101k);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i8 == 1) {
            obj = this.f17102l;
            this.f17102l = null;
        } else {
            Object[] objArr = (Object[]) this.f17102l;
            Object obj2 = objArr[i7];
            if (i8 == 2) {
                this.f17102l = objArr[1 - i7];
            } else {
                int i9 = (i8 - i7) - 1;
                if (i9 > 0) {
                    System.arraycopy(objArr, i7 + 1, objArr, i7, i9);
                }
                objArr[this.f17101k - 1] = null;
            }
            obj = obj2;
        }
        this.f17101k--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i8;
        if (i7 < 0 || i7 >= (i8 = this.f17101k)) {
            StringBuilder sbP = AbstractC0703b.p(i7, "Index: ", ", Size: ");
            sbP.append(this.f17101k);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i8 == 1) {
            Object obj2 = this.f17102l;
            this.f17102l = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f17102l;
        Object obj3 = objArr[i7];
        objArr[i7] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17101k;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i7 = this.f17101k;
        if (i7 >= 2) {
            Arrays.sort((Object[]) this.f17102l, 0, i7, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            a(4);
            throw null;
        }
        int length = objArr.length;
        int i7 = this.f17101k;
        if (i7 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f17102l;
                return objArr2;
            }
            objArr[0] = this.f17102l;
        } else {
            if (length < i7) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f17102l, i7, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                a(6);
                throw null;
            }
            if (i7 != 0) {
                System.arraycopy(this.f17102l, 0, objArr, 0, i7);
            }
        }
        int i8 = this.f17101k;
        if (length > i8) {
            objArr[i8] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        if (i7 >= 0 && i7 <= (i8 = this.f17101k)) {
            if (i8 == 0) {
                this.f17102l = obj;
            } else if (i8 == 1 && i7 == 0) {
                this.f17102l = new Object[]{obj, this.f17102l};
            } else {
                Object[] objArr = new Object[i8 + 1];
                if (i8 == 1) {
                    objArr[0] = this.f17102l;
                } else {
                    Object[] objArr2 = (Object[]) this.f17102l;
                    System.arraycopy(objArr2, 0, objArr, 0, i7);
                    System.arraycopy(objArr2, i7, objArr, i7 + 1, this.f17101k - i7);
                }
                objArr[i7] = obj;
                this.f17102l = objArr;
            }
            this.f17101k++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbP = AbstractC0703b.p(i7, "Index: ", ", Size: ");
        sbP.append(this.f17101k);
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
