package C2;

import H1.C0221b;
import V1.C0599d;
import V1.C0600e;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import s2.InterfaceC1980h;

/* loaded from: classes.dex */
public final class I implements V1.n {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f669b;

    /* renamed from: c, reason: collision with root package name */
    public final B1.B f670c = new B1.B(new byte[9400], 0);

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f671d;

    /* renamed from: e, reason: collision with root package name */
    public final C0034g f672e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1980h f673f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f674g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f675h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f676i;

    /* renamed from: j, reason: collision with root package name */
    public final B f677j;

    /* renamed from: k, reason: collision with root package name */
    public A f678k;

    /* renamed from: l, reason: collision with root package name */
    public V1.p f679l;

    /* renamed from: m, reason: collision with root package name */
    public int f680m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f681n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f682o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f683p;

    /* renamed from: q, reason: collision with root package name */
    public int f684q;

    public I(int i7, InterfaceC1980h interfaceC1980h, B1.H h7, C0034g c0034g) {
        this.f672e = c0034g;
        this.a = i7;
        this.f673f = interfaceC1980h;
        this.f669b = Collections.singletonList(h7);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f675h = sparseBooleanArray;
        this.f676i = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f674g = sparseArray;
        this.f671d = new SparseIntArray();
        this.f677j = new B(1);
        this.f679l = V1.p.f9403f;
        this.f684q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), (L) sparseArray2.valueAt(i8));
        }
        sparseArray.put(0, new F(new F.w(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // V1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(V1.o r7) {
        /*
            r6 = this;
            B1.B r0 = r6.f670c
            byte[] r0 = r0.a
            V1.k r7 = (V1.k) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.h(r0, r1, r2, r1)
            r2 = r1
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = r1
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.f(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.I.b(V1.o):boolean");
    }

    @Override // V1.n
    public final void d(V1.p pVar) {
        if ((this.a & 1) == 0) {
            pVar = new C0221b(pVar, this.f673f);
        }
        this.f679l = pVar;
    }

    @Override // V1.n
    public final void e(long j7, long j8) {
        A a;
        long j9;
        List list = this.f669b;
        int size = list.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            B1.H h7 = (B1.H) list.get(i8);
            synchronized (h7) {
                j9 = h7.f297b;
            }
            boolean z7 = j9 == -9223372036854775807L;
            if (!z7) {
                long jD = h7.d();
                z7 = (jD == -9223372036854775807L || jD == 0 || jD == j8) ? false : true;
            }
            if (z7) {
                h7.e(j8);
            }
        }
        if (j8 != 0 && (a = this.f678k) != null) {
            a.B(j8);
        }
        this.f670c.C(0);
        this.f671d.clear();
        while (true) {
            SparseArray sparseArray = this.f674g;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((L) sparseArray.valueAt(i7)).a();
            i7++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean, int] */
    @Override // V1.n
    public final int i(V1.o oVar, V1.r rVar) throws EOFException, InterruptedIOException {
        ?? r2;
        ?? r15;
        boolean z7;
        long j7;
        long j8;
        long j9 = ((V1.k) oVar).f9391m;
        if (this.f681n) {
            B b4 = this.f677j;
            if (j9 != -1 && !b4.f636d) {
                int i7 = this.f684q;
                if (i7 <= 0) {
                    b4.a((V1.k) oVar);
                    return 0;
                }
                boolean z8 = b4.f638f;
                B1.B b7 = b4.f635c;
                if (z8) {
                    if (b4.f640h == -9223372036854775807L) {
                        b4.a((V1.k) oVar);
                        return 0;
                    }
                    if (b4.f637e) {
                        long j10 = b4.f639g;
                        if (j10 == -9223372036854775807L) {
                            b4.a((V1.k) oVar);
                            return 0;
                        }
                        B1.H h7 = b4.f634b;
                        b4.f641i = h7.c(b4.f640h) - h7.b(j10);
                        b4.a((V1.k) oVar);
                        return 0;
                    }
                    V1.k kVar = (V1.k) oVar;
                    int iMin = (int) Math.min(112800, kVar.f9391m);
                    long j11 = 0;
                    if (kVar.f9392n != j11) {
                        rVar.a = j11;
                        return 1;
                    }
                    b7.C(iMin);
                    kVar.f9394p = 0;
                    kVar.h(b7.a, 0, iMin, false);
                    int i8 = b7.f288b;
                    int i9 = b7.f289c;
                    while (true) {
                        if (i8 >= i9) {
                            j7 = -9223372036854775807L;
                            break;
                        }
                        if (b7.a[i8] == 71) {
                            long jE = android.support.v4.media.session.b.E(b7, i8, i7);
                            if (jE != -9223372036854775807L) {
                                j7 = jE;
                                break;
                            }
                        }
                        i8++;
                    }
                    b4.f639g = j7;
                    b4.f637e = true;
                    return 0;
                }
                V1.k kVar2 = (V1.k) oVar;
                long j12 = kVar2.f9391m;
                int iMin2 = (int) Math.min(112800, j12);
                long j13 = j12 - iMin2;
                if (kVar2.f9392n != j13) {
                    rVar.a = j13;
                    return 1;
                }
                b7.C(iMin2);
                kVar2.f9394p = 0;
                kVar2.h(b7.a, 0, iMin2, false);
                int i10 = b7.f288b;
                int i11 = b7.f289c;
                int i12 = i11 - 188;
                while (true) {
                    if (i12 < i10) {
                        j8 = -9223372036854775807L;
                        break;
                    }
                    byte[] bArr = b7.a;
                    int i13 = -4;
                    int i14 = 0;
                    while (true) {
                        if (i13 > 4) {
                            break;
                        }
                        int i15 = (i13 * 188) + i12;
                        if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                            i14 = 0;
                        } else {
                            i14++;
                            if (i14 == 5) {
                                long jE2 = android.support.v4.media.session.b.E(b7, i12, i7);
                                if (jE2 != -9223372036854775807L) {
                                    j8 = jE2;
                                    break;
                                }
                            }
                        }
                        i13++;
                    }
                    i12--;
                }
                b4.f640h = j8;
                b4.f638f = true;
                return 0;
            }
            if (this.f682o) {
                z7 = false;
            } else {
                this.f682o = true;
                long j14 = b4.f641i;
                if (j14 != -9223372036854775807L) {
                    z7 = false;
                    A a = new A(new R1.i(2), new H(this.f684q, b4.f634b), j14, 1 + j14, 0L, j9, 188L, 940);
                    this.f678k = a;
                    this.f679l.k((C0599d) a.f9381c);
                } else {
                    z7 = false;
                    this.f679l.k(new V1.s(j14));
                }
            }
            if (this.f683p) {
                this.f683p = z7;
                e(0L, 0L);
                if (((V1.k) oVar).f9392n != 0) {
                    rVar.a = 0L;
                    return 1;
                }
            }
            r15 = 1;
            r15 = 1;
            A a7 = this.f678k;
            r2 = z7;
            if (a7 != null) {
                r2 = z7;
                if (((C0600e) a7.f9383e) != null) {
                    return a7.u((V1.k) oVar, rVar);
                }
            }
        } else {
            r2 = 0;
            r15 = 1;
        }
        B1.B b8 = this.f670c;
        byte[] bArr2 = b8.a;
        if (9400 - b8.f288b < 188) {
            int iA = b8.a();
            if (iA > 0) {
                System.arraycopy(bArr2, b8.f288b, bArr2, r2, iA);
            }
            b8.D(bArr2, iA);
        }
        while (true) {
            int iA2 = b8.a();
            SparseArray sparseArray = this.f674g;
            if (iA2 >= 188) {
                int i16 = b8.f288b;
                int i17 = b8.f289c;
                byte[] bArr3 = b8.a;
                while (i16 < i17 && bArr3[i16] != 71) {
                    i16++;
                }
                b8.F(i16);
                int i18 = i16 + 188;
                int i19 = b8.f289c;
                if (i18 > i19) {
                    return r2;
                }
                int iG = b8.g();
                if ((8388608 & iG) != 0) {
                    b8.F(i18);
                    return r2;
                }
                int i20 = (4194304 & iG) != 0 ? r15 : r2;
                int i21 = (2096896 & iG) >> 8;
                boolean z9 = (iG & 32) != 0 ? r15 : r2;
                L l7 = (iG & 16) != 0 ? (L) sparseArray.get(i21) : null;
                if (l7 == null) {
                    b8.F(i18);
                    return r2;
                }
                int i22 = iG & 15;
                SparseIntArray sparseIntArray = this.f671d;
                int i23 = sparseIntArray.get(i21, i22 - 1);
                sparseIntArray.put(i21, i22);
                if (i23 == i22) {
                    b8.F(i18);
                    return r2;
                }
                if (i22 != ((i23 + r15) & 15)) {
                    l7.a();
                }
                if (z9) {
                    int iT = b8.t();
                    i20 |= (b8.t() & 64) != 0 ? 2 : r2;
                    b8.G(iT - r15);
                }
                boolean z10 = this.f681n;
                if (z10 || !this.f676i.get(i21, r2)) {
                    b8.E(i18);
                    l7.b(i20, b8);
                    b8.E(i19);
                }
                if (!z10 && this.f681n && j9 != -1) {
                    this.f683p = r15;
                }
                b8.F(i18);
                return r2;
            }
            int i24 = b8.f289c;
            int iO = ((V1.k) oVar).o(bArr2, i24, 9400 - i24);
            if (iO == -1) {
                for (int i25 = r2; i25 < sparseArray.size(); i25++) {
                    L l8 = (L) sparseArray.valueAt(i25);
                    if (l8 instanceof z) {
                        z zVar = (z) l8;
                        if (zVar.f942c == 3 && zVar.f949j == -1) {
                            zVar.b(r15, new B1.B());
                        }
                    }
                }
                return -1;
            }
            b8.E(i24 + iO);
        }
    }

    @Override // V1.n
    public final void a() {
    }
}
