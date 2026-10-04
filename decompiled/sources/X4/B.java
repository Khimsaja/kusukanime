package X4;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B extends AbstractC0608e {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f9831r;

    /* renamed from: l, reason: collision with root package name */
    public final int f9832l;

    /* renamed from: m, reason: collision with root package name */
    public final AbstractC0608e f9833m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC0608e f9834n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9835o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9836p;

    /* renamed from: q, reason: collision with root package name */
    public int f9837q = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        int i8 = 1;
        while (i7 > 0) {
            arrayList.add(Integer.valueOf(i7));
            int i9 = i8 + i7;
            i8 = i7;
            i7 = i9;
        }
        arrayList.add(Integer.MAX_VALUE);
        f9831r = new int[arrayList.size()];
        int i10 = 0;
        while (true) {
            int[] iArr = f9831r;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
            i10++;
        }
    }

    public B(AbstractC0608e abstractC0608e, AbstractC0608e abstractC0608e2) {
        this.f9833m = abstractC0608e;
        this.f9834n = abstractC0608e2;
        int size = abstractC0608e.size();
        this.f9835o = size;
        this.f9832l = abstractC0608e2.size() + size;
        this.f9836p = Math.max(abstractC0608e.o(), abstractC0608e2.o()) + 1;
    }

    public final boolean equals(Object obj) {
        int iU;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0608e) {
            AbstractC0608e abstractC0608e = (AbstractC0608e) obj;
            int size = abstractC0608e.size();
            int i7 = this.f9832l;
            if (i7 == size) {
                if (i7 == 0) {
                    return true;
                }
                if (this.f9837q == 0 || (iU = abstractC0608e.u()) == 0 || this.f9837q == iU) {
                    z zVar = new z(this);
                    v vVarA = zVar.next();
                    z zVar2 = new z(abstractC0608e);
                    v vVarA2 = zVar2.next();
                    int i8 = 0;
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        int length = vVarA.f9913l.length - i8;
                        int length2 = vVarA2.f9913l.length - i9;
                        int iMin = Math.min(length, length2);
                        if (!(i8 == 0 ? vVarA.y(vVarA2, i9, iMin) : vVarA2.y(vVarA, i8, iMin))) {
                            break;
                        }
                        i10 += iMin;
                        if (i10 >= i7) {
                            if (i10 == i7) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == length) {
                            vVarA = zVar.next();
                            i8 = 0;
                        } else {
                            i8 += iMin;
                        }
                        if (iMin == length2) {
                            vVarA2 = zVar2.next();
                            i9 = 0;
                        } else {
                            i9 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iS = this.f9837q;
        if (iS == 0) {
            int i7 = this.f9832l;
            iS = s(i7, 0, i7);
            if (iS == 0) {
                iS = 1;
            }
            this.f9837q = iS;
        }
        return iS;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new A(this);
    }

    @Override // X4.AbstractC0608e
    public final void m(int i7, int i8, int i9, byte[] bArr) {
        int i10 = i7 + i9;
        AbstractC0608e abstractC0608e = this.f9833m;
        int i11 = this.f9835o;
        if (i10 <= i11) {
            abstractC0608e.m(i7, i8, i9, bArr);
            return;
        }
        AbstractC0608e abstractC0608e2 = this.f9834n;
        if (i7 >= i11) {
            abstractC0608e2.m(i7 - i11, i8, i9, bArr);
            return;
        }
        int i12 = i11 - i7;
        abstractC0608e.m(i7, i8, i12, bArr);
        abstractC0608e2.m(0, i8 + i12, i9 - i12, bArr);
    }

    @Override // X4.AbstractC0608e
    public final int o() {
        return this.f9836p;
    }

    @Override // X4.AbstractC0608e
    public final boolean p() {
        return this.f9832l >= f9831r[this.f9836p];
    }

    @Override // X4.AbstractC0608e
    public final boolean q() {
        int iT = this.f9833m.t(0, 0, this.f9835o);
        AbstractC0608e abstractC0608e = this.f9834n;
        return abstractC0608e.t(iT, 0, abstractC0608e.size()) == 0;
    }

    @Override // X4.AbstractC0608e
    public final int s(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0608e abstractC0608e = this.f9833m;
        int i11 = this.f9835o;
        if (i10 <= i11) {
            return abstractC0608e.s(i7, i8, i9);
        }
        AbstractC0608e abstractC0608e2 = this.f9834n;
        if (i8 >= i11) {
            return abstractC0608e2.s(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0608e2.s(abstractC0608e.s(i7, i8, i12), 0, i9 - i12);
    }

    @Override // X4.AbstractC0608e
    public final int size() {
        return this.f9832l;
    }

    @Override // X4.AbstractC0608e
    public final int t(int i7, int i8, int i9) {
        int i10 = i8 + i9;
        AbstractC0608e abstractC0608e = this.f9833m;
        int i11 = this.f9835o;
        if (i10 <= i11) {
            return abstractC0608e.t(i7, i8, i9);
        }
        AbstractC0608e abstractC0608e2 = this.f9834n;
        if (i8 >= i11) {
            return abstractC0608e2.t(i7, i8 - i11, i9);
        }
        int i12 = i11 - i8;
        return abstractC0608e2.t(abstractC0608e.t(i7, i8, i12), 0, i9 - i12);
    }

    @Override // X4.AbstractC0608e
    public final int u() {
        return this.f9837q;
    }

    @Override // X4.AbstractC0608e
    public final String v() {
        byte[] bArr;
        int i7 = this.f9832l;
        if (i7 == 0) {
            bArr = AbstractC0620q.a;
        } else {
            byte[] bArr2 = new byte[i7];
            m(0, 0, i7, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // X4.AbstractC0608e
    public final void x(OutputStream outputStream, int i7, int i8) {
        int i9 = i7 + i8;
        AbstractC0608e abstractC0608e = this.f9833m;
        int i10 = this.f9835o;
        if (i9 <= i10) {
            abstractC0608e.x(outputStream, i7, i8);
            return;
        }
        AbstractC0608e abstractC0608e2 = this.f9834n;
        if (i7 >= i10) {
            abstractC0608e2.x(outputStream, i7 - i10, i8);
            return;
        }
        int i11 = i10 - i7;
        abstractC0608e.x(outputStream, i7, i11);
        abstractC0608e2.x(outputStream, 0, i8 - i11);
    }
}
