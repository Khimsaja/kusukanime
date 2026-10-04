package Y;

import f4.InterfaceC0881a;
import f6.AbstractC0915m;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m implements Iterable, InterfaceC0881a {

    /* renamed from: o, reason: collision with root package name */
    public static final m f9994o = new m(0, 0, 0, null);

    /* renamed from: k, reason: collision with root package name */
    public final long f9995k;

    /* renamed from: l, reason: collision with root package name */
    public final long f9996l;

    /* renamed from: m, reason: collision with root package name */
    public final int f9997m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f9998n;

    public m(long j7, long j8, int i7, int[] iArr) {
        this.f9995k = j7;
        this.f9996l = j8;
        this.f9997m = i7;
        this.f9998n = iArr;
    }

    public final m a(m mVar) {
        m mVarH;
        int[] iArr;
        m mVar2 = f9994o;
        if (mVar == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVar2;
        }
        int i7 = mVar.f9997m;
        int[] iArr2 = mVar.f9998n;
        long j7 = mVar.f9996l;
        long j8 = mVar.f9995k;
        int i8 = this.f9997m;
        if (i7 == i8 && iArr2 == (iArr = this.f9998n)) {
            return new m(this.f9995k & (~j8), this.f9996l & (~j7), i8, iArr);
        }
        if (iArr2 != null) {
            mVarH = this;
            for (int i9 : iArr2) {
                mVarH = mVarH.h(i9);
            }
        } else {
            mVarH = this;
        }
        int i10 = mVar.f9997m;
        if (j7 != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j7) != 0) {
                    mVarH = mVarH.h(i11 + i10);
                }
            }
        }
        if (j8 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j8) != 0) {
                    mVarH = mVarH.h(i12 + 64 + i10);
                }
            }
        }
        return mVarH;
    }

    public final m h(int i7) {
        int[] iArr;
        int iB;
        int i8 = this.f9997m;
        int i9 = i7 - i8;
        if (i9 >= 0 && i9 < 64) {
            long j7 = 1 << i9;
            long j8 = this.f9996l;
            if ((j8 & j7) != 0) {
                return new m(this.f9995k, j8 & (~j7), i8, this.f9998n);
            }
        } else if (i9 >= 64 && i9 < 128) {
            long j9 = 1 << (i9 - 64);
            long j10 = this.f9995k;
            if ((j10 & j9) != 0) {
                return new m((~j9) & j10, this.f9996l, i8, this.f9998n);
            }
        } else if (i9 < 0 && (iArr = this.f9998n) != null && (iB = s.b(iArr, i7)) >= 0) {
            int length = iArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                return new m(this.f9995k, this.f9996l, this.f9997m, null);
            }
            int[] iArr2 = new int[i10];
            if (iB > 0) {
                P3.m.V(0, 0, iB, iArr, iArr2);
            }
            if (iB < i10) {
                P3.m.V(iB, iB + 1, length, iArr, iArr2);
            }
            return new m(this.f9995k, this.f9996l, this.f9997m, iArr2);
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC0915m.C(new l(this, null));
    }

    public final boolean j(int i7) {
        int[] iArr;
        int i8 = i7 - this.f9997m;
        return (i8 < 0 || i8 >= 64) ? (i8 < 64 || i8 >= 128) ? i8 <= 0 && (iArr = this.f9998n) != null && s.b(iArr, i7) >= 0 : ((1 << (i8 - 64)) & this.f9995k) != 0 : ((1 << i8) & this.f9996l) != 0;
    }

    public final m m(m mVar) {
        m mVarO;
        int[] iArr;
        m mVarO2 = mVar;
        m mVar2 = f9994o;
        if (mVarO2 == mVar2) {
            return this;
        }
        if (this == mVar2) {
            return mVarO2;
        }
        int i7 = mVarO2.f9997m;
        long j7 = this.f9996l;
        long j8 = this.f9995k;
        int[] iArr2 = mVarO2.f9998n;
        long j9 = mVarO2.f9996l;
        long j10 = mVarO2.f9995k;
        int i8 = this.f9997m;
        if (i7 == i8 && iArr2 == (iArr = this.f9998n)) {
            return new m(j8 | j10, j7 | j9, i8, iArr);
        }
        int i9 = 0;
        int[] iArr3 = this.f9998n;
        if (iArr3 == null) {
            if (iArr3 != null) {
                for (int i10 : iArr3) {
                    mVarO2 = mVarO2.o(i10);
                }
            }
            int i11 = this.f9997m;
            if (j7 != 0) {
                for (int i12 = 0; i12 < 64; i12++) {
                    if (((1 << i12) & j7) != 0) {
                        mVarO2 = mVarO2.o(i12 + i11);
                    }
                }
            }
            if (j8 != 0) {
                while (i9 < 64) {
                    if (((1 << i9) & j8) != 0) {
                        mVarO2 = mVarO2.o(i9 + 64 + i11);
                    }
                    i9++;
                }
            }
            return mVarO2;
        }
        if (iArr2 != null) {
            mVarO = this;
            for (int i13 : iArr2) {
                mVarO = mVarO.o(i13);
            }
        } else {
            mVarO = this;
        }
        int i14 = mVarO2.f9997m;
        if (j9 != 0) {
            for (int i15 = 0; i15 < 64; i15++) {
                if (((1 << i15) & j9) != 0) {
                    mVarO = mVarO.o(i15 + i14);
                }
            }
        }
        if (j10 != 0) {
            while (i9 < 64) {
                if (((1 << i9) & j10) != 0) {
                    mVarO = mVarO.o(i9 + 64 + i14);
                }
                i9++;
            }
        }
        return mVarO;
    }

    public final m o(int i7) {
        long j7;
        int i8;
        long j8;
        int i9 = this.f9997m;
        int i10 = i7 - i9;
        long j9 = this.f9996l;
        long j10 = 1;
        if (i10 < 0 || i10 >= 64) {
            long j11 = this.f9995k;
            if (i10 < 64 || i10 >= 128) {
                int[] iArrR0 = this.f9998n;
                if (i10 < 128) {
                    if (iArrR0 == null) {
                        return new m(j11, j9, i9, new int[]{i7});
                    }
                    int iB = s.b(iArrR0, i7);
                    if (iB < 0) {
                        int i11 = -(iB + 1);
                        int length = iArrR0.length;
                        int[] iArr = new int[length + 1];
                        P3.m.V(0, 0, i11, iArrR0, iArr);
                        P3.m.V(i11 + 1, i11, length, iArrR0, iArr);
                        iArr[i11] = i7;
                        return new m(this.f9995k, this.f9996l, this.f9997m, iArr);
                    }
                } else if (!j(i7)) {
                    int i12 = ((i7 + 1) / 64) * 64;
                    int i13 = this.f9997m;
                    ArrayList arrayList = null;
                    long j12 = j11;
                    while (true) {
                        if (i13 >= i12) {
                            j7 = j9;
                            i8 = i13;
                            break;
                        }
                        if (j9 != 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                if (iArrR0 != null) {
                                    int length2 = iArrR0.length;
                                    int i14 = 0;
                                    while (i14 < length2) {
                                        arrayList.add(Integer.valueOf(iArrR0[i14]));
                                        i14++;
                                        j10 = j10;
                                    }
                                }
                            }
                            j8 = j10;
                            for (int i15 = 0; i15 < 64; i15++) {
                                if (((j8 << i15) & j9) != 0) {
                                    arrayList.add(Integer.valueOf(i15 + i13));
                                }
                            }
                        } else {
                            j8 = j10;
                        }
                        if (j12 == 0) {
                            i8 = i12;
                            j7 = 0;
                            break;
                        }
                        i13 += 64;
                        j9 = j12;
                        j10 = j8;
                        j12 = 0;
                    }
                    if (arrayList != null) {
                        iArrR0 = P3.q.R0(arrayList);
                    }
                    return new m(j12, j7, i8, iArrR0).o(i7);
                }
            } else {
                long j13 = 1 << (i10 - 64);
                if ((j11 & j13) == 0) {
                    return new m(j13 | j11, j9, i9, this.f9998n);
                }
            }
        } else {
            long j14 = 1 << i10;
            if ((j9 & j14) == 0) {
                return new m(this.f9995k, j9 | j14, i9, this.f9998n);
            }
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(P3.r.p(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = arrayList.get(i8);
            i7++;
            if (i7 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
