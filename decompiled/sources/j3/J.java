package j3;

import b1.AbstractC0703b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class J extends B implements Set {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f12280m = 0;

    /* renamed from: l, reason: collision with root package name */
    public transient G f12281l;

    public static int q(int i7) {
        int iMax = Math.max(i7, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static J r(int i7, Object... objArr) {
        if (i7 == 0) {
            return d0.f12338t;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new j0(obj);
        }
        int iQ = q(i7);
        Object[] objArr2 = new Object[iQ];
        int i8 = iQ - 1;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC0703b.g(i11, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iN = AbstractC1331q.n(iHashCode);
            while (true) {
                int i12 = iN & i8;
                Object obj3 = objArr2[i12];
                if (obj3 == null) {
                    objArr[i10] = obj2;
                    objArr2[i12] = obj2;
                    i9 += iHashCode;
                    i10++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iN++;
            }
        }
        Arrays.fill(objArr, i10, i7, (Object) null);
        if (i10 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new j0(obj4);
        }
        if (q(i10) < iQ / 2) {
            return r(i10, objArr);
        }
        int length = objArr.length;
        if (i10 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i10);
        }
        return new d0(i9, i8, i10, objArr, objArr2);
    }

    public static J s(Collection collection) {
        if ((collection instanceof J) && !(collection instanceof SortedSet)) {
            J j7 = (J) collection;
            if (!j7.p()) {
                return j7;
            }
        }
        Object[] array = collection.toArray();
        return r(array.length, array);
    }

    @Override // j3.B
    public G a() {
        G g4 = this.f12281l;
        if (g4 != null) {
            return g4;
        }
        G gT = t();
        this.f12281l = gT;
        return gT;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof J) && (this instanceof d0)) {
            J j7 = (J) obj;
            j7.getClass();
            if ((j7 instanceof d0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return AbstractC1331q.e(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return AbstractC1331q.h(this);
    }

    public G t() {
        Object[] array = toArray(B.f12268k);
        E e7 = G.f12277l;
        return G.q(array.length, array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public abstract l0 iterator();
}
