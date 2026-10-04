package O1;

import B1.AbstractC0015b;
import C2.C0034g;
import android.util.SparseArray;
import io.ktor.client.utils.CIOKt;
import java.io.EOFException;
import java.util.Objects;
import y1.C2389k;
import y1.C2392n;
import y1.C2393o;
import y1.InterfaceC2385g;

/* loaded from: classes.dex */
public final class Z implements V1.G {

    /* renamed from: B, reason: collision with root package name */
    public boolean f7378B;
    public final X a;

    /* renamed from: d, reason: collision with root package name */
    public final K1.i f7381d;

    /* renamed from: e, reason: collision with root package name */
    public final K1.e f7382e;

    /* renamed from: f, reason: collision with root package name */
    public S f7383f;

    /* renamed from: g, reason: collision with root package name */
    public C2393o f7384g;

    /* renamed from: h, reason: collision with root package name */
    public C0034g f7385h;

    /* renamed from: p, reason: collision with root package name */
    public int f7393p;

    /* renamed from: q, reason: collision with root package name */
    public int f7394q;

    /* renamed from: r, reason: collision with root package name */
    public int f7395r;

    /* renamed from: s, reason: collision with root package name */
    public int f7396s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7400w;

    /* renamed from: z, reason: collision with root package name */
    public C2393o f7403z;

    /* renamed from: b, reason: collision with root package name */
    public final L1.g f7379b = new L1.g();

    /* renamed from: i, reason: collision with root package name */
    public int f7386i = CIOKt.DEFAULT_HTTP_POOL_SIZE;

    /* renamed from: j, reason: collision with root package name */
    public long[] f7387j = new long[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: k, reason: collision with root package name */
    public long[] f7388k = new long[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: n, reason: collision with root package name */
    public long[] f7391n = new long[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: m, reason: collision with root package name */
    public int[] f7390m = new int[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: l, reason: collision with root package name */
    public int[] f7389l = new int[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: o, reason: collision with root package name */
    public V1.F[] f7392o = new V1.F[CIOKt.DEFAULT_HTTP_POOL_SIZE];

    /* renamed from: c, reason: collision with root package name */
    public final C2.H f7380c = new C2.H(new I1.e(8));

    /* renamed from: t, reason: collision with root package name */
    public long f7397t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f7398u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f7399v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7402y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7401x = true;

    /* renamed from: A, reason: collision with root package name */
    public boolean f7377A = true;

    public Z(R1.f fVar, K1.i iVar, K1.e eVar) {
        this.f7381d = iVar;
        this.f7382e = eVar;
        this.a = new X(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0002, B:8:0x000e, B:13:0x0020, B:15:0x0039, B:19:0x0053, B:18:0x0051), top: B:29:0x0002 }] */
    @Override // V1.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(y1.C2393o r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.f7402y = r0     // Catch: java.lang.Throwable -> L4f
            y1.o r1 = r4.f7403z     // Catch: java.lang.Throwable -> L4f
            boolean r1 = java.util.Objects.equals(r5, r1)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto Le
            monitor-exit(r4)
            goto L66
        Le:
            C2.H r1 = r4.f7380c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.f667m     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L4f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L4f
            r2 = 1
            if (r1 != 0) goto L1d
            r1 = r2
            goto L1e
        L1d:
            r1 = r0
        L1e:
            if (r1 != 0) goto L51
            C2.H r1 = r4.f7380c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r1 = r1.f667m     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L4f
            int r3 = r1.size()     // Catch: java.lang.Throwable -> L4f
            int r3 = r3 - r2
            java.lang.Object r1 = r1.valueAt(r3)     // Catch: java.lang.Throwable -> L4f
            O1.Y r1 = (O1.Y) r1     // Catch: java.lang.Throwable -> L4f
            y1.o r1 = r1.a     // Catch: java.lang.Throwable -> L4f
            boolean r1 = r1.equals(r5)     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L51
            C2.H r5 = r4.f7380c     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = r5.f667m     // Catch: java.lang.Throwable -> L4f
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L4f
            int r1 = r5.size()     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 - r2
            java.lang.Object r5 = r5.valueAt(r1)     // Catch: java.lang.Throwable -> L4f
            O1.Y r5 = (O1.Y) r5     // Catch: java.lang.Throwable -> L4f
            y1.o r5 = r5.a     // Catch: java.lang.Throwable -> L4f
            r4.f7403z = r5     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r5 = move-exception
            goto L74
        L51:
            r4.f7403z = r5     // Catch: java.lang.Throwable -> L4f
        L53:
            boolean r5 = r4.f7377A     // Catch: java.lang.Throwable -> L4f
            y1.o r1 = r4.f7403z     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r1.f18112n     // Catch: java.lang.Throwable -> L4f
            java.lang.String r1 = r1.f18109k     // Catch: java.lang.Throwable -> L4f
            boolean r1 = y1.D.a(r3, r1)     // Catch: java.lang.Throwable -> L4f
            r5 = r5 & r1
            r4.f7377A = r5     // Catch: java.lang.Throwable -> L4f
            r4.f7378B = r0     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)
            r0 = r2
        L66:
            O1.S r5 = r4.f7383f
            if (r5 == 0) goto L73
            if (r0 == 0) goto L73
            android.os.Handler r0 = r5.f7311A
            O1.M r5 = r5.f7348y
            r0.post(r5)
        L73:
            return
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.Z.a(y1.o):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:23:0x0045, B:25:0x0049, B:29:0x005f, B:32:0x0066, B:36:0x006e, B:41:0x00a9, B:64:0x0124, B:66:0x012d, B:43:0x00c4, B:45:0x00cd, B:47:0x00d5, B:49:0x00ea, B:53:0x00f3, B:54:0x00f8, B:56:0x00fe, B:60:0x010c, B:62:0x0111, B:63:0x0121, B:46:0x00d3), top: B:71:0x0045 }] */
    @Override // V1.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(long r10, int r12, int r13, int r14, V1.F r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.Z.b(long, int, int, int, V1.F):void");
    }

    @Override // V1.G
    public final void c(B1.B b4, int i7, int i8) {
        while (true) {
            X x7 = this.a;
            if (i7 <= 0) {
                x7.getClass();
                return;
            }
            int iB = x7.b(i7);
            W w7 = x7.f7374f;
            R1.a aVar = (R1.a) w7.f7368m;
            b4.e(aVar.a, ((int) (x7.f7375g - w7.f7366k)) + aVar.f8031b, iB);
            i7 -= iB;
            long j7 = x7.f7375g + iB;
            x7.f7375g = j7;
            W w8 = x7.f7374f;
            if (j7 == w8.f7367l) {
                x7.f7374f = (W) w8.f7369n;
            }
        }
    }

    @Override // V1.G
    public final int d(InterfaceC2385g interfaceC2385g, int i7, boolean z7) throws EOFException {
        X x7 = this.a;
        int iB = x7.b(i7);
        W w7 = x7.f7374f;
        R1.a aVar = (R1.a) w7.f7368m;
        int iO = interfaceC2385g.o(aVar.a, ((int) (x7.f7375g - w7.f7366k)) + aVar.f8031b, iB);
        if (iO == -1) {
            if (z7) {
                return -1;
            }
            throw new EOFException();
        }
        long j7 = x7.f7375g + iO;
        x7.f7375g = j7;
        W w8 = x7.f7374f;
        if (j7 == w8.f7367l) {
            x7.f7374f = (W) w8.f7369n;
        }
        return iO;
    }

    public final long e(int i7) {
        long j7 = this.f7398u;
        long jMax = Long.MIN_VALUE;
        if (i7 != 0) {
            int iH = h(i7 - 1);
            for (int i8 = 0; i8 < i7; i8++) {
                jMax = Math.max(jMax, this.f7391n[iH]);
                if ((this.f7390m[iH] & 1) != 0) {
                    break;
                }
                iH--;
                if (iH == -1) {
                    iH = this.f7386i - 1;
                }
            }
        }
        this.f7398u = Math.max(j7, jMax);
        this.f7393p -= i7;
        int i9 = this.f7394q + i7;
        this.f7394q = i9;
        int i10 = this.f7395r + i7;
        this.f7395r = i10;
        int i11 = this.f7386i;
        if (i10 >= i11) {
            this.f7395r = i10 - i11;
        }
        int i12 = this.f7396s - i7;
        this.f7396s = i12;
        int i13 = 0;
        if (i12 < 0) {
            this.f7396s = 0;
        }
        while (true) {
            C2.H h7 = this.f7380c;
            SparseArray sparseArray = (SparseArray) h7.f667m;
            if (i13 >= sparseArray.size() - 1) {
                break;
            }
            int i14 = i13 + 1;
            if (i9 < sparseArray.keyAt(i14)) {
                break;
            }
            ((I1.e) h7.f668n).c(sparseArray.valueAt(i13));
            sparseArray.removeAt(i13);
            int i15 = h7.f666l;
            if (i15 > 0) {
                h7.f666l = i15 - 1;
            }
            i13 = i14;
        }
        if (this.f7393p != 0) {
            return this.f7388k[this.f7395r];
        }
        int i16 = this.f7395r;
        if (i16 == 0) {
            i16 = this.f7386i;
        }
        return this.f7388k[i16 - 1] + this.f7389l[r10];
    }

    public final void f() {
        long jE;
        X x7 = this.a;
        synchronized (this) {
            int i7 = this.f7393p;
            jE = i7 == 0 ? -1L : e(i7);
        }
        x7.a(jE);
    }

    public final int g(int i7, int i8, long j7, boolean z7) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long j8 = this.f7391n[i7];
            if (j8 > j7) {
                break;
            }
            if (!z7 || (this.f7390m[i7] & 1) != 0) {
                if (j8 == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f7386i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public final int h(int i7) {
        int i8 = this.f7395r + i7;
        int i9 = this.f7386i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    public final synchronized boolean i(boolean z7) {
        C2393o c2393o;
        int i7 = this.f7396s;
        boolean z8 = false;
        if (i7 != this.f7393p) {
            if (((Y) this.f7380c.f(this.f7394q + i7)).a != this.f7384g) {
                return true;
            }
            return j(h(this.f7396s));
        }
        if (z7 || this.f7400w || ((c2393o = this.f7403z) != null && c2393o != this.f7384g)) {
            z8 = true;
        }
        return z8;
    }

    public final boolean j(int i7) {
        C0034g c0034g = this.f7385h;
        if (c0034g == null || c0034g.n() == 4) {
            return true;
        }
        if ((this.f7390m[i7] & 1073741824) != 0) {
            return false;
        }
        this.f7385h.getClass();
        return false;
    }

    public final void k(C2393o c2393o, F.w wVar) {
        C2393o c2393o2;
        C2393o c2393o3 = this.f7384g;
        boolean z7 = c2393o3 == null;
        C2389k c2389k = c2393o3 == null ? null : c2393o3.f18116r;
        this.f7384g = c2393o;
        C2389k c2389k2 = c2393o.f18116r;
        K1.i iVar = this.f7381d;
        if (iVar != null) {
            int iE = iVar.e(c2393o);
            C2392n c2392nA = c2393o.a();
            c2392nA.f18062L = iE;
            c2393o2 = new C2393o(c2392nA);
        } else {
            c2393o2 = c2393o;
        }
        wVar.f2038m = c2393o2;
        wVar.f2037l = this.f7385h;
        if (iVar == null) {
            return;
        }
        if (z7 || !Objects.equals(c2389k, c2389k2)) {
            C0034g c0034g = this.f7385h;
            K1.e eVar = this.f7382e;
            C0034g c0034gD = iVar.d(eVar, c2393o);
            this.f7385h = c0034gD;
            wVar.f2037l = c0034gD;
            if (c0034g != null) {
                c0034g.s(eVar);
            }
        }
    }

    public final void l(boolean z7) {
        SparseArray sparseArray;
        X x7 = this.a;
        W w7 = x7.f7372d;
        if (((R1.a) w7.f7368m) != null) {
            R1.f fVar = x7.a;
            synchronized (fVar) {
                W w8 = w7;
                while (w8 != null) {
                    try {
                        R1.a[] aVarArr = fVar.f8042f;
                        int i7 = fVar.f8041e;
                        fVar.f8041e = i7 + 1;
                        R1.a aVar = (R1.a) w8.f7368m;
                        aVar.getClass();
                        aVarArr[i7] = aVar;
                        fVar.f8040d--;
                        w8 = (W) w8.f7369n;
                        if (w8 == null || ((R1.a) w8.f7368m) == null) {
                            w8 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fVar.notifyAll();
            }
            w7.f7368m = null;
            w7.f7369n = null;
        }
        W w9 = x7.f7372d;
        int i8 = x7.f7370b;
        int i9 = 0;
        AbstractC0015b.h(((R1.a) w9.f7368m) == null);
        w9.f7366k = 0L;
        w9.f7367l = i8;
        W w10 = x7.f7372d;
        x7.f7373e = w10;
        x7.f7374f = w10;
        x7.f7375g = 0L;
        x7.a.b();
        this.f7393p = 0;
        this.f7394q = 0;
        this.f7395r = 0;
        this.f7396s = 0;
        this.f7401x = true;
        this.f7397t = Long.MIN_VALUE;
        this.f7398u = Long.MIN_VALUE;
        this.f7399v = Long.MIN_VALUE;
        this.f7400w = false;
        C2.H h7 = this.f7380c;
        while (true) {
            sparseArray = (SparseArray) h7.f667m;
            if (i9 >= sparseArray.size()) {
                break;
            }
            ((I1.e) h7.f668n).c(sparseArray.valueAt(i9));
            i9++;
        }
        h7.f666l = -1;
        sparseArray.clear();
        if (z7) {
            this.f7403z = null;
            this.f7402y = true;
            this.f7377A = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean m(long j7, boolean z7) {
        Throwable th;
        Z z8;
        long j8;
        int iG;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f7396s = 0;
                        X x7 = this.a;
                        x7.f7373e = x7.f7372d;
                        int iH = h(0);
                        int i7 = this.f7396s;
                        int i8 = this.f7393p;
                        if (!(i7 != i8) || j7 < this.f7391n[iH] || (j7 > this.f7399v && !z7)) {
                            return false;
                        }
                        if (this.f7377A) {
                            iG = i8 - i7;
                            int i9 = 0;
                            while (true) {
                                if (i9 < iG) {
                                    try {
                                        if (this.f7391n[iH] >= j7) {
                                            iG = i9;
                                            break;
                                        }
                                        iH++;
                                        if (iH == this.f7386i) {
                                            iH = 0;
                                        }
                                        i9++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        throw th;
                                    }
                                } else if (!z7) {
                                    iG = -1;
                                }
                            }
                            z8 = this;
                            j8 = j7;
                        } else {
                            z8 = this;
                            j8 = j7;
                            iG = z8.g(iH, i8 - i7, j8, true);
                        }
                        if (iG == -1) {
                            return false;
                        }
                        z8.f7397t = j8;
                        z8.f7396s += iG;
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = th;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
