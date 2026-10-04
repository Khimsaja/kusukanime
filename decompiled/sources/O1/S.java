package O1;

import B1.AbstractC0015b;
import B1.C0020g;
import B1.RunnableC0016c;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import i2.C1070b;
import io.ktor.client.utils.CIOKt;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import y1.C2392n;
import y1.C2393o;

/* loaded from: classes.dex */
public final class S implements InterfaceC0551z, V1.p, R1.j {

    /* renamed from: Z, reason: collision with root package name */
    public static final Map f7309Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final C2393o f7310a0;

    /* renamed from: A, reason: collision with root package name */
    public final Handler f7311A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC0550y f7312B;

    /* renamed from: C, reason: collision with root package name */
    public C1070b f7313C;

    /* renamed from: D, reason: collision with root package name */
    public Z[] f7314D;

    /* renamed from: E, reason: collision with root package name */
    public Q[] f7315E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f7316F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f7317G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f7318H;
    public boolean I;
    public A2.b J;

    /* renamed from: K, reason: collision with root package name */
    public V1.A f7319K;

    /* renamed from: L, reason: collision with root package name */
    public long f7320L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f7321M;

    /* renamed from: N, reason: collision with root package name */
    public int f7322N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f7323O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f7324P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f7325Q;

    /* renamed from: R, reason: collision with root package name */
    public int f7326R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f7327S;

    /* renamed from: T, reason: collision with root package name */
    public long f7328T;

    /* renamed from: U, reason: collision with root package name */
    public long f7329U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f7330V;

    /* renamed from: W, reason: collision with root package name */
    public int f7331W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f7332X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f7333Y;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f7334k;

    /* renamed from: l, reason: collision with root package name */
    public final E1.h f7335l;

    /* renamed from: m, reason: collision with root package name */
    public final K1.i f7336m;

    /* renamed from: n, reason: collision with root package name */
    public final R1.i f7337n;

    /* renamed from: o, reason: collision with root package name */
    public final K1.e f7338o;

    /* renamed from: p, reason: collision with root package name */
    public final K1.e f7339p;

    /* renamed from: q, reason: collision with root package name */
    public final V f7340q;

    /* renamed from: r, reason: collision with root package name */
    public final R1.f f7341r;

    /* renamed from: s, reason: collision with root package name */
    public final long f7342s;

    /* renamed from: t, reason: collision with root package name */
    public final C2393o f7343t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7344u;

    /* renamed from: v, reason: collision with root package name */
    public final R1.m f7345v;

    /* renamed from: w, reason: collision with root package name */
    public final B2.l f7346w;

    /* renamed from: x, reason: collision with root package name */
    public final C0020g f7347x;

    /* renamed from: y, reason: collision with root package name */
    public final M f7348y;

    /* renamed from: z, reason: collision with root package name */
    public final M f7349z;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f7309Z = Collections.unmodifiableMap(map);
        C2392n c2392n = new C2392n();
        c2392n.a = "icy";
        c2392n.f18074m = y1.D.m("application/x-icy");
        f7310a0 = new C2393o(c2392n);
    }

    public S(Uri uri, E1.h hVar, B2.l lVar, K1.i iVar, K1.e eVar, R1.i iVar2, K1.e eVar2, V v5, R1.f fVar, int i7, C2393o c2393o, long j7, S1.a aVar) {
        R1.m mVar;
        this.f7334k = uri;
        this.f7335l = hVar;
        this.f7336m = iVar;
        this.f7339p = eVar;
        this.f7337n = iVar2;
        this.f7338o = eVar2;
        this.f7340q = v5;
        this.f7341r = fVar;
        this.f7342s = i7;
        this.f7343t = c2393o;
        if (aVar != null) {
            mVar = new R1.m(aVar);
        } else {
            String strConcat = "ExoPlayer:Loader:".concat("ProgressiveMediaPeriod");
            int i8 = B1.K.a;
            mVar = new R1.m(new S1.a(Executors.newSingleThreadExecutor(new B1.I(strConcat, 0)), new I1.e(12)));
        }
        this.f7345v = mVar;
        this.f7346w = lVar;
        this.f7344u = j7;
        this.f7347x = new C0020g();
        this.f7348y = new M(this, 1);
        this.f7349z = new M(this, 2);
        this.f7311A = B1.K.l(null);
        this.f7315E = new Q[0];
        this.f7314D = new Z[0];
        this.f7329U = -9223372036854775807L;
        this.f7322N = 1;
    }

    public final void A(int i7) {
        u();
        if (this.f7330V) {
            if ((!this.f7318H || ((boolean[]) this.J.f111m)[i7]) && !this.f7314D[i7].i(false)) {
                this.f7329U = 0L;
                this.f7330V = false;
                this.f7324P = true;
                this.f7328T = 0L;
                this.f7331W = 0;
                for (Z z7 : this.f7314D) {
                    z7.l(false);
                }
                InterfaceC0550y interfaceC0550y = this.f7312B;
                interfaceC0550y.getClass();
                interfaceC0550y.c(this);
            }
        }
    }

    public final V1.G B(Q q6) {
        int length = this.f7314D.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (q6.equals(this.f7315E[i7])) {
                return this.f7314D[i7];
            }
        }
        if (this.f7316F) {
            AbstractC0015b.v("ProgressiveMediaPeriod", "Extractor added new track (id=" + q6.a + ") after finishing tracks.");
            return new V1.m();
        }
        K1.i iVar = this.f7336m;
        iVar.getClass();
        Z z7 = new Z(this.f7341r, iVar, this.f7339p);
        z7.f7383f = this;
        int i8 = length + 1;
        Q[] qArr = (Q[]) Arrays.copyOf(this.f7315E, i8);
        qArr[length] = q6;
        int i9 = B1.K.a;
        this.f7315E = qArr;
        Z[] zArr = (Z[]) Arrays.copyOf(this.f7314D, i8);
        zArr[length] = z7;
        this.f7314D = zArr;
        return z7;
    }

    public final void C(V1.A a) {
        this.f7319K = this.f7313C == null ? a : new V1.s(-9223372036854775807L);
        this.f7320L = a.l();
        boolean z7 = !this.f7327S && a.l() == -9223372036854775807L;
        this.f7321M = z7;
        this.f7322N = z7 ? 7 : 1;
        if (this.f7317G) {
            this.f7340q.t(this.f7320L, a, z7);
        } else {
            y();
        }
    }

    public final void D() {
        O o7 = new O(this, this.f7334k, this.f7335l, this.f7346w, this, this.f7347x);
        if (this.f7317G) {
            AbstractC0015b.h(x());
            long j7 = this.f7320L;
            if (j7 != -9223372036854775807L && this.f7329U > j7) {
                this.f7332X = true;
                this.f7329U = -9223372036854775807L;
                return;
            }
            V1.A a = this.f7319K;
            a.getClass();
            long j8 = a.j(this.f7329U).a.f9312b;
            long j9 = this.f7329U;
            o7.f7298f.a = j8;
            o7.f7301i = j9;
            o7.f7300h = true;
            o7.f7304l = false;
            for (Z z7 : this.f7314D) {
                z7.f7397t = this.f7329U;
            }
            this.f7329U = -9223372036854775807L;
        }
        this.f7331W = v();
        int iQ = this.f7337n.q(this.f7322N);
        R1.m mVar = this.f7345v;
        mVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0015b.i(looperMyLooper);
        mVar.f8077c = null;
        R1.k kVar = new R1.k(mVar, looperMyLooper, o7, this, iQ, SystemClock.elapsedRealtime());
        AbstractC0015b.h(mVar.f8076b == null);
        mVar.f8076b = kVar;
        kVar.b();
    }

    public final boolean E() {
        return this.f7324P || x();
    }

    @Override // O1.b0
    public final boolean a() {
        boolean z7;
        if (!this.f7345v.a()) {
            return false;
        }
        C0020g c0020g = this.f7347x;
        synchronized (c0020g) {
            z7 = c0020g.f328b;
        }
        return z7;
    }

    @Override // V1.p
    public final void b() {
        this.f7316F = true;
        this.f7311A.post(this.f7348y);
    }

    @Override // R1.j
    public final void c(O o7, boolean z7) {
        Uri uri = o7.f7294b.f1838m;
        C0544s c0544s = new C0544s();
        this.f7337n.getClass();
        long j7 = o7.f7301i;
        long j8 = this.f7320L;
        K1.e eVar = this.f7338o;
        eVar.a(new E(eVar, c0544s, new C0549x(-1, null, B1.K.P(j7), B1.K.P(j8)), 1));
        if (z7) {
            return;
        }
        for (Z z8 : this.f7314D) {
            z8.l(false);
        }
        if (this.f7326R > 0) {
            InterfaceC0550y interfaceC0550y = this.f7312B;
            interfaceC0550y.getClass();
            interfaceC0550y.c(this);
        }
    }

    @Override // O1.InterfaceC0551z
    public final long d(Q1.s[] sVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j7) {
        Q1.s sVar;
        u();
        A2.b bVar = this.J;
        g0 g0Var = (g0) bVar.f110l;
        boolean[] zArr3 = (boolean[]) bVar.f112n;
        int i7 = this.f7326R;
        for (int i8 = 0; i8 < sVarArr.length; i8++) {
            a0 a0Var = a0VarArr[i8];
            if (a0Var != null && (sVarArr[i8] == null || !zArr[i8])) {
                int i9 = ((P) a0Var).f7306k;
                AbstractC0015b.h(zArr3[i9]);
                this.f7326R--;
                zArr3[i9] = false;
                a0VarArr[i8] = null;
            }
        }
        boolean z7 = !this.f7323O ? j7 == 0 || this.I : i7 != 0;
        for (int i10 = 0; i10 < sVarArr.length; i10++) {
            if (a0VarArr[i10] == null && (sVar = sVarArr[i10]) != null) {
                AbstractC0015b.h(sVar.length() == 1);
                AbstractC0015b.h(sVar.d(0) == 0);
                int iIndexOf = g0Var.f7449b.indexOf(sVar.g());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                AbstractC0015b.h(!zArr3[iIndexOf]);
                this.f7326R++;
                zArr3[iIndexOf] = true;
                this.f7325Q = sVar.h().f18118t | this.f7325Q;
                a0VarArr[i10] = new P(this, iIndexOf);
                zArr2[i10] = true;
                if (!z7) {
                    Z z8 = this.f7314D[iIndexOf];
                    z7 = (z8.f7394q + z8.f7396s == 0 || z8.m(j7, true)) ? false : true;
                }
            }
        }
        if (this.f7326R == 0) {
            this.f7330V = false;
            this.f7324P = false;
            this.f7325Q = false;
            R1.m mVar = this.f7345v;
            if (mVar.a()) {
                for (Z z9 : this.f7314D) {
                    z9.f();
                }
                R1.k kVar = mVar.f8076b;
                AbstractC0015b.i(kVar);
                kVar.a(false);
            } else {
                this.f7332X = false;
                for (Z z10 : this.f7314D) {
                    z10.l(false);
                }
            }
        } else if (z7) {
            j7 = q(j7);
            for (int i11 = 0; i11 < a0VarArr.length; i11++) {
                if (a0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
            }
        }
        this.f7323O = true;
        return j7;
    }

    @Override // O1.b0
    public final boolean e(H1.O o7) {
        if (this.f7332X) {
            return false;
        }
        R1.m mVar = this.f7345v;
        if (mVar.f8077c != null || this.f7330V) {
            return false;
        }
        if ((this.f7317G || this.f7343t != null) && this.f7326R == 0) {
            return false;
        }
        boolean zD = this.f7347x.d();
        if (mVar.a()) {
            return zD;
        }
        D();
        return true;
    }

    @Override // O1.b0
    public final long f() {
        return n();
    }

    @Override // O1.InterfaceC0551z
    public final long g() {
        if (this.f7325Q) {
            this.f7325Q = false;
            return this.f7328T;
        }
        if (!this.f7324P) {
            return -9223372036854775807L;
        }
        if (!this.f7332X && v() <= this.f7331W) {
            return -9223372036854775807L;
        }
        this.f7324P = false;
        return this.f7328T;
    }

    @Override // R1.j
    public final A5.h h(O o7, IOException iOException, int i7) {
        long jMin;
        A5.h hVar;
        V1.A a;
        Uri uri = o7.f7294b.f1838m;
        C0544s c0544s = new C0544s();
        int i8 = B1.K.a;
        this.f7337n.getClass();
        if ((iOException instanceof y1.E) || (iOException instanceof FileNotFoundException) || (iOException instanceof E1.t) || (iOException instanceof R1.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i9 = E1.i.f1871l;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof E1.i) && ((E1.i) cause).f1872k == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i7 - 1) * CIOKt.DEFAULT_HTTP_POOL_SIZE, 5000);
        if (jMin == -9223372036854775807L) {
            hVar = R1.m.f8075e;
        } else {
            int iV = v();
            int i10 = iV > this.f7331W ? 1 : 0;
            if (this.f7327S || !((a = this.f7319K) == null || a.l() == -9223372036854775807L)) {
                this.f7331W = iV;
            } else if (!this.f7317G || E()) {
                this.f7324P = this.f7317G;
                this.f7328T = 0L;
                this.f7331W = 0;
                for (Z z7 : this.f7314D) {
                    z7.l(false);
                }
                o7.f7298f.a = 0L;
                o7.f7301i = 0L;
                o7.f7300h = true;
                o7.f7304l = false;
            } else {
                this.f7330V = true;
                hVar = R1.m.f8074d;
            }
            hVar = new A5.h(i10, jMin);
        }
        A5.h hVar2 = hVar;
        int i11 = hVar2.f256k;
        boolean z8 = i11 == 0 || i11 == 1;
        long j7 = o7.f7301i;
        long j8 = this.f7320L;
        K1.e eVar = this.f7338o;
        eVar.a(new F(eVar, c0544s, new C0549x(-1, null, B1.K.P(j7), B1.K.P(j8)), iOException, !z8));
        return hVar2;
    }

    @Override // O1.InterfaceC0551z
    public final void i(InterfaceC0550y interfaceC0550y, long j7) {
        this.f7312B = interfaceC0550y;
        C2393o c2393o = this.f7343t;
        if (c2393o == null) {
            this.f7347x.d();
            D();
        } else {
            m(0, 3).a(c2393o);
            C(new V1.x(-9223372036854775807L, new long[]{0}, new long[]{0}));
            b();
            this.f7329U = j7;
        }
    }

    @Override // O1.InterfaceC0551z
    public final g0 j() {
        u();
        return (g0) this.J.f110l;
    }

    @Override // V1.p
    public final void k(V1.A a) {
        this.f7311A.post(new RunnableC0016c(15, this, a));
    }

    @Override // R1.j
    public final void l(O o7) {
        if (this.f7320L == -9223372036854775807L && this.f7319K != null) {
            long jW = w(true);
            long j7 = jW == Long.MIN_VALUE ? 0L : jW + 10000;
            this.f7320L = j7;
            this.f7340q.t(j7, this.f7319K, this.f7321M);
        }
        Uri uri = o7.f7294b.f1838m;
        C0544s c0544s = new C0544s();
        this.f7337n.getClass();
        long j8 = o7.f7301i;
        long j9 = this.f7320L;
        K1.e eVar = this.f7338o;
        eVar.a(new E(eVar, c0544s, new C0549x(-1, null, B1.K.P(j8), B1.K.P(j9)), 0));
        this.f7332X = true;
        InterfaceC0550y interfaceC0550y = this.f7312B;
        interfaceC0550y.getClass();
        interfaceC0550y.c(this);
    }

    @Override // V1.p
    public final V1.G m(int i7, int i8) {
        return B(new Q(i7, false));
    }

    @Override // O1.b0
    public final long n() {
        long jW;
        boolean z7;
        long j7;
        u();
        if (this.f7332X || this.f7326R == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f7329U;
        }
        if (this.f7318H) {
            int length = this.f7314D.length;
            jW = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                A2.b bVar = this.J;
                if (((boolean[]) bVar.f111m)[i7] && ((boolean[]) bVar.f112n)[i7]) {
                    Z z8 = this.f7314D[i7];
                    synchronized (z8) {
                        z7 = z8.f7400w;
                    }
                    if (z7) {
                        continue;
                    } else {
                        Z z9 = this.f7314D[i7];
                        synchronized (z9) {
                            j7 = z9.f7399v;
                        }
                        jW = Math.min(jW, j7);
                    }
                }
            }
        } else {
            jW = Long.MAX_VALUE;
        }
        if (jW == Long.MAX_VALUE) {
            jW = w(false);
        }
        return jW == Long.MIN_VALUE ? this.f7328T : jW;
    }

    @Override // O1.InterfaceC0551z
    public final void o() throws IOException {
        int iQ = this.f7337n.q(this.f7322N);
        R1.m mVar = this.f7345v;
        IOException iOException = mVar.f8077c;
        if (iOException != null) {
            throw iOException;
        }
        R1.k kVar = mVar.f8076b;
        if (kVar != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = kVar.f8065k;
            }
            IOException iOException2 = kVar.f8068n;
            if (iOException2 != null && kVar.f8069o > iQ) {
                throw iOException2;
            }
        }
        if (this.f7332X && !this.f7317G) {
            throw y1.E.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // R1.j
    public final void p(O o7, long j7, int i7) {
        C0544s c0544s;
        E1.B b4 = o7.f7294b;
        if (i7 == 0) {
            Uri uri = o7.f7302j.a;
            Map map = Collections.EMPTY_MAP;
            c0544s = new C0544s();
        } else {
            Uri uri2 = b4.f1838m;
            c0544s = new C0544s();
        }
        long j8 = o7.f7301i;
        long j9 = this.f7320L;
        K1.e eVar = this.f7338o;
        eVar.a(new D(eVar, c0544s, new C0549x(-1, null, B1.K.P(j8), B1.K.P(j9)), i7));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0094  */
    @Override // O1.InterfaceC0551z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long q(long r12) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.S.q(long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // O1.InterfaceC0551z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(long r14) {
        /*
            r13 = this;
            boolean r0 = r13.I
            if (r0 == 0) goto L6
            goto L61
        L6:
            r13.u()
            boolean r0 = r13.x()
            if (r0 == 0) goto L10
            goto L61
        L10:
            A2.b r0 = r13.J
            java.lang.Object r0 = r0.f112n
            boolean[] r0 = (boolean[]) r0
            O1.Z[] r1 = r13.f7314D
            int r1 = r1.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L61
            O1.Z[] r3 = r13.f7314D
            r4 = r3[r2]
            boolean r3 = r0[r2]
            O1.X r10 = r4.a
            monitor-enter(r4)
            int r5 = r4.f7393p     // Catch: java.lang.Throwable -> L42
            r11 = -1
            if (r5 == 0) goto L36
            long[] r6 = r4.f7391n     // Catch: java.lang.Throwable -> L42
            r7 = r5
            int r5 = r4.f7395r     // Catch: java.lang.Throwable -> L42
            r8 = r6[r5]     // Catch: java.lang.Throwable -> L42
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L38
        L36:
            r7 = r14
            goto L57
        L38:
            if (r3 == 0) goto L45
            int r3 = r4.f7396s     // Catch: java.lang.Throwable -> L42
            if (r3 == r7) goto L45
            int r3 = r3 + 1
            r6 = r3
            goto L46
        L42:
            r0 = move-exception
            r14 = r0
            goto L5f
        L45:
            r6 = r7
        L46:
            r9 = 0
            r7 = r14
            int r14 = r4.g(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L42
            r15 = -1
            if (r14 != r15) goto L51
            monitor-exit(r4)
            goto L58
        L51:
            long r11 = r4.e(r14)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r4)
            goto L58
        L57:
            monitor-exit(r4)
        L58:
            r10.a(r11)
            int r2 = r2 + 1
            r14 = r7
            goto L1a
        L5f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r14
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.S.r(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[RETURN] */
    @Override // O1.InterfaceC0551z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long s(long r18, H1.m0 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r3 = r20
            r0.u()
            V1.A r4 = r0.f7319K
            boolean r4 = r4.g()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            V1.A r4 = r0.f7319K
            V1.z r4 = r4.j(r1)
            V1.B r7 = r4.a
            long r7 = r7.a
            V1.B r4 = r4.f9439b
            long r9 = r4.a
            long r11 = r3.a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            long r13 = r3.f3542b
            if (r4 != 0) goto L2f
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r3 != 0) goto L2f
            return r1
        L2f:
            int r3 = B1.K.a
            long r3 = r1 - r11
            long r11 = r11 ^ r1
            long r15 = r1 ^ r3
            long r11 = r11 & r15
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r3 = -9223372036854775808
        L3d:
            long r11 = r1 + r13
            long r15 = r1 ^ r11
            long r13 = r13 ^ r11
            long r13 = r13 & r15
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4c
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L4c:
            int r5 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r6 = 0
            r13 = 1
            if (r5 > 0) goto L58
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L58
            r5 = r13
            goto L59
        L58:
            r5 = r6
        L59:
            int r14 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r14 > 0) goto L62
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 > 0) goto L62
            r6 = r13
        L62:
            if (r5 == 0) goto L77
            if (r6 == 0) goto L77
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L7c
            goto L79
        L77:
            if (r5 == 0) goto L7a
        L79:
            return r7
        L7a:
            if (r6 == 0) goto L7d
        L7c:
            return r9
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.S.s(long, H1.m0):long");
    }

    public final void u() {
        AbstractC0015b.h(this.f7317G);
        this.J.getClass();
        this.f7319K.getClass();
    }

    public final int v() {
        int i7 = 0;
        for (Z z7 : this.f7314D) {
            i7 += z7.f7394q + z7.f7393p;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long w(boolean r7) {
        /*
            r6 = this;
            r0 = -9223372036854775808
            r2 = 0
        L3:
            O1.Z[] r3 = r6.f7314D
            int r3 = r3.length
            if (r2 >= r3) goto L29
            if (r7 != 0) goto L17
            A2.b r3 = r6.J
            r3.getClass()
            java.lang.Object r3 = r3.f112n
            boolean[] r3 = (boolean[]) r3
            boolean r3 = r3[r2]
            if (r3 == 0) goto L23
        L17:
            O1.Z[] r3 = r6.f7314D
            r3 = r3[r2]
            monitor-enter(r3)
            long r4 = r3.f7399v     // Catch: java.lang.Throwable -> L26
            monitor-exit(r3)
            long r0 = java.lang.Math.max(r0, r4)
        L23:
            int r2 = r2 + 1
            goto L3
        L26:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r7
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.S.w(boolean):long");
    }

    public final boolean x() {
        return this.f7329U != -9223372036854775807L;
    }

    public final void y() {
        long j7;
        C2393o c2393o;
        y1.C cA;
        int i7;
        boolean z7 = false;
        if (this.f7333Y || this.f7317G || !this.f7316F || this.f7319K == null) {
            return;
        }
        Z[] zArr = this.f7314D;
        int length = zArr.length;
        int i8 = 0;
        while (true) {
            C2393o c2393o2 = null;
            if (i8 >= length) {
                C0020g c0020g = this.f7347x;
                synchronized (c0020g) {
                    c0020g.f328b = false;
                }
                int length2 = this.f7314D.length;
                y1.Q[] qArr = new y1.Q[length2];
                boolean[] zArr2 = new boolean[length2];
                int i9 = 0;
                while (true) {
                    j7 = this.f7344u;
                    if (i9 >= length2) {
                        break;
                    }
                    Z z8 = this.f7314D[i9];
                    synchronized (z8) {
                        c2393o = z8.f7402y ? null : z8.f7403z;
                    }
                    c2393o.getClass();
                    String str = c2393o.f18112n;
                    boolean zI = y1.D.i(str);
                    boolean z9 = (zI || y1.D.l(str)) ? true : z7;
                    zArr2[i9] = z9;
                    boolean z10 = z7;
                    this.f7318H |= z9;
                    this.I = (j7 != -9223372036854775807L && length2 == 1 && y1.D.j(str)) ? true : z10 ? 1 : 0;
                    C1070b c1070b = this.f7313C;
                    if (c1070b != null) {
                        if (zI || this.f7315E[i9].f7308b) {
                            y1.C c2 = c2393o.f18110l;
                            if (c2 == null) {
                                y1.B[] bArr = new y1.B[1];
                                bArr[z10 ? 1 : 0] = c1070b;
                                cA = new y1.C(bArr);
                            } else {
                                y1.B[] bArr2 = new y1.B[1];
                                bArr2[z10 ? 1 : 0] = c1070b;
                                cA = c2.a(bArr2);
                            }
                            C2392n c2392nA = c2393o.a();
                            c2392nA.f18072k = cA;
                            c2393o = new C2393o(c2392nA);
                        }
                        if (zI && c2393o.f18106h == -1 && c2393o.f18107i == -1 && (i7 = c1070b.a) != -1) {
                            C2392n c2392nA2 = c2393o.a();
                            c2392nA2.f18069h = i7;
                            c2393o = new C2393o(c2392nA2);
                        }
                    }
                    int iE = this.f7336m.e(c2393o);
                    C2392n c2392nA3 = c2393o.a();
                    c2392nA3.f18062L = iE;
                    C2393o c2393o3 = new C2393o(c2392nA3);
                    qArr[i9] = new y1.Q(Integer.toString(i9), c2393o3);
                    this.f7325Q = c2393o3.f18118t | this.f7325Q;
                    i9++;
                    z7 = z10 ? 1 : 0;
                }
                this.J = new A2.b(new g0(qArr), zArr2);
                if (this.I && this.f7320L == -9223372036854775807L) {
                    this.f7320L = j7;
                    this.f7319K = new N(this, this.f7319K);
                }
                this.f7340q.t(this.f7320L, this.f7319K, this.f7321M);
                this.f7317G = true;
                InterfaceC0550y interfaceC0550y = this.f7312B;
                interfaceC0550y.getClass();
                interfaceC0550y.b(this);
                return;
            }
            Z z11 = zArr[i8];
            synchronized (z11) {
                if (!z11.f7402y) {
                    c2393o2 = z11.f7403z;
                }
            }
            if (c2393o2 == null) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final void z(int i7) {
        u();
        A2.b bVar = this.J;
        boolean[] zArr = (boolean[]) bVar.f113o;
        if (zArr[i7]) {
            return;
        }
        C2393o c2393o = ((g0) bVar.f110l).a(i7).f17971d[0];
        int iH = y1.D.h(c2393o.f18112n);
        long j7 = this.f7328T;
        K1.e eVar = this.f7338o;
        eVar.a(new I1.c(eVar, new C0549x(iH, c2393o, B1.K.P(j7), -9223372036854775807L)));
        zArr[i7] = true;
    }

    @Override // O1.b0
    public final void t(long j7) {
    }
}
