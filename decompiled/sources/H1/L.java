package H1;

import B1.AbstractC0015b;
import B1.RunnableC0016c;
import O1.InterfaceC0550y;
import O1.InterfaceC0551z;
import android.content.Context;
import android.media.Spatializer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import io.ktor.util.GzipHeaderFlags;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.C2381c;
import y1.C2393o;
import y1.C2397t;
import y1.C2401x;

/* loaded from: classes.dex */
public final class L implements Handler.Callback, InterfaceC0550y, f0 {

    /* renamed from: k0, reason: collision with root package name */
    public static final long f3286k0 = B1.K.P(10000);

    /* renamed from: A, reason: collision with root package name */
    public final C0242x f3287A;

    /* renamed from: B, reason: collision with root package name */
    public final T f3288B;

    /* renamed from: C, reason: collision with root package name */
    public final c0 f3289C;

    /* renamed from: D, reason: collision with root package name */
    public final C0228i f3290D;

    /* renamed from: E, reason: collision with root package name */
    public final long f3291E;

    /* renamed from: F, reason: collision with root package name */
    public final I1.l f3292F;

    /* renamed from: G, reason: collision with root package name */
    public final I1.f f3293G;

    /* renamed from: H, reason: collision with root package name */
    public final B1.F f3294H;
    public final boolean I;
    public final C0224e J;

    /* renamed from: K, reason: collision with root package name */
    public m0 f3295K;

    /* renamed from: L, reason: collision with root package name */
    public d0 f3296L;

    /* renamed from: M, reason: collision with root package name */
    public C2.y f3297M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3298N;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3300P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3301Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3303S;

    /* renamed from: T, reason: collision with root package name */
    public int f3304T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3305U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3306V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3307W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3308X;

    /* renamed from: Y, reason: collision with root package name */
    public int f3309Y;

    /* renamed from: Z, reason: collision with root package name */
    public K f3310Z;

    /* renamed from: a0, reason: collision with root package name */
    public long f3311a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f3312b0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3313c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3314d0;

    /* renamed from: e0, reason: collision with root package name */
    public C0234o f3315e0;

    /* renamed from: g0, reason: collision with root package name */
    public C0237s f3317g0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3319i0;

    /* renamed from: k, reason: collision with root package name */
    public final l0[] f3321k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC0225f[] f3322l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f3323m;

    /* renamed from: n, reason: collision with root package name */
    public final Q1.t f3324n;

    /* renamed from: o, reason: collision with root package name */
    public final Q1.u f3325o;

    /* renamed from: p, reason: collision with root package name */
    public final C0230k f3326p;

    /* renamed from: q, reason: collision with root package name */
    public final R1.e f3327q;

    /* renamed from: r, reason: collision with root package name */
    public final B1.F f3328r;

    /* renamed from: s, reason: collision with root package name */
    public final e0 f3329s;

    /* renamed from: t, reason: collision with root package name */
    public final Looper f3330t;

    /* renamed from: u, reason: collision with root package name */
    public final y1.O f3331u;

    /* renamed from: v, reason: collision with root package name */
    public final y1.N f3332v;

    /* renamed from: w, reason: collision with root package name */
    public final long f3333w;

    /* renamed from: x, reason: collision with root package name */
    public final C0231l f3334x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f3335y;

    /* renamed from: z, reason: collision with root package name */
    public final B1.D f3336z;

    /* renamed from: h0, reason: collision with root package name */
    public long f3318h0 = -9223372036854775807L;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3299O = false;

    /* renamed from: j0, reason: collision with root package name */
    public float f3320j0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public long f3316f0 = -9223372036854775807L;

    /* renamed from: R, reason: collision with root package name */
    public long f3302R = -9223372036854775807L;

    public L(Context context, AbstractC0225f[] abstractC0225fArr, AbstractC0225f[] abstractC0225fArr2, Q1.t tVar, Q1.u uVar, C0230k c0230k, R1.e eVar, int i7, boolean z7, I1.f fVar, m0 m0Var, C0228i c0228i, long j7, Looper looper, B1.D d4, C0242x c0242x, I1.l lVar, C0237s c0237s) {
        Looper looper2;
        this.f3287A = c0242x;
        this.f3324n = tVar;
        this.f3325o = uVar;
        this.f3326p = c0230k;
        this.f3327q = eVar;
        this.f3304T = i7;
        this.f3305U = z7;
        this.f3295K = m0Var;
        this.f3290D = c0228i;
        this.f3291E = j7;
        boolean z8 = false;
        this.f3336z = d4;
        this.f3292F = lVar;
        this.f3317g0 = c0237s;
        this.f3293G = fVar;
        this.f3333w = c0230k.f3524h;
        y1.M m7 = y1.P.a;
        d0 d0VarJ = d0.j(uVar);
        this.f3296L = d0VarJ;
        this.f3297M = new C2.y(d0VarJ);
        this.f3322l = new AbstractC0225f[abstractC0225fArr.length];
        this.f3323m = new boolean[abstractC0225fArr.length];
        Q1.q qVar = (Q1.q) tVar;
        qVar.getClass();
        this.f3321k = new l0[abstractC0225fArr.length];
        boolean z9 = false;
        for (int i8 = 0; i8 < abstractC0225fArr.length; i8++) {
            AbstractC0225f abstractC0225f = abstractC0225fArr[i8];
            abstractC0225f.f3460o = i8;
            abstractC0225f.f3461p = lVar;
            abstractC0225f.f3462q = d4;
            this.f3322l[i8] = abstractC0225f;
            AbstractC0225f abstractC0225f2 = this.f3322l[i8];
            synchronized (abstractC0225f2.f3456k) {
                abstractC0225f2.f3455A = qVar;
            }
            AbstractC0225f abstractC0225f3 = abstractC0225fArr2[i8];
            if (abstractC0225f3 != null) {
                abstractC0225f3.f3460o = abstractC0225fArr.length + i8;
                abstractC0225f3.f3461p = lVar;
                abstractC0225f3.f3462q = d4;
                z9 = true;
            }
            this.f3321k[i8] = new l0(abstractC0225fArr[i8], abstractC0225f3, i8);
        }
        this.I = z9;
        this.f3334x = new C0231l(this, d4);
        this.f3335y = new ArrayList();
        this.f3331u = new y1.O();
        this.f3332v = new y1.N();
        tVar.a = this;
        tVar.f7939b = eVar;
        this.f3314d0 = true;
        B1.F fA = d4.a(looper, null);
        this.f3294H = fA;
        this.f3288B = new T(fVar, fA, new C2.G(7, this), c0237s);
        this.f3289C = new c0(this, fVar, fA, lVar);
        e0 e0Var = new e0();
        this.f3329s = e0Var;
        synchronized (e0Var.f3452b) {
            try {
                if (((Looper) e0Var.f3453c) == null) {
                    if (e0Var.a == 0 && ((HandlerThread) e0Var.f3454d) == null) {
                        z8 = true;
                    }
                    AbstractC0015b.h(z8);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    e0Var.f3454d = handlerThread;
                    handlerThread.start();
                    e0Var.f3453c = ((HandlerThread) e0Var.f3454d).getLooper();
                }
                e0Var.a++;
                looper2 = (Looper) e0Var.f3453c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3330t = looper2;
        this.f3328r = d4.a(looper2, this);
        this.J = new C0224e(context, looper2, this);
    }

    public static Pair N(y1.P p7, K k7, boolean z7, int i7, boolean z8, y1.O o7, y1.N n7) {
        int iO;
        y1.P p8 = k7.a;
        if (p7.p()) {
            return null;
        }
        y1.P p9 = p8.p() ? p7 : p8;
        try {
            Pair pairI = p9.i(o7, n7, k7.f3284b, k7.f3285c);
            if (!p7.equals(p9)) {
                if (p7.b(pairI.first) == -1) {
                    if (!z7 || (iO = O(o7, n7, i7, z8, pairI.first, p9, p7)) == -1) {
                        return null;
                    }
                    return p7.i(o7, n7, iO, -9223372036854775807L);
                }
                if (p9.g(pairI.first, n7).f17951f && p9.m(n7.f17948c, o7, 0L).f17966m == p9.b(pairI.first)) {
                    return p7.i(o7, n7, p7.g(pairI.first, n7).f17948c, k7.f3285c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int O(y1.O o7, y1.N n7, int i7, boolean z7, Object obj, y1.P p7, y1.P p8) {
        y1.O o8 = o7;
        y1.P p9 = p7;
        Object obj2 = p9.m(p9.g(obj, n7).f17948c, o7, 0L).a;
        for (int i8 = 0; i8 < p8.o(); i8++) {
            if (p8.m(i8, o7, 0L).a.equals(obj2)) {
                return i8;
            }
        }
        int iB = p9.b(obj);
        int iH = p9.h();
        int iB2 = -1;
        int i9 = 0;
        while (i9 < iH && iB2 == -1) {
            y1.P p10 = p9;
            int iD = p10.d(iB, n7, o8, i7, z7);
            if (iD == -1) {
                break;
            }
            iB2 = p8.b(p10.l(iD));
            i9++;
            p9 = p10;
            iB = iD;
            o8 = o7;
        }
        if (iB2 == -1) {
            return -1;
        }
        return p8.f(iB2, n7, false).f17948c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O1.b0, O1.z, java.lang.Object] */
    public static boolean v(Q q6) {
        if (q6 != null) {
            try {
                ?? r12 = q6.a;
                if (q6.f3346e) {
                    for (O1.a0 a0Var : q6.f3344c) {
                        if (a0Var != null) {
                            a0Var.h();
                        }
                    }
                } else {
                    r12.o();
                }
                if ((!q6.f3346e ? 0L : r12.f()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final void A(int i7) {
        l0 l0Var = this.f3321k[i7];
        try {
            Q q6 = this.f3288B.f3374i;
            q6.getClass();
            AbstractC0225f abstractC0225fD = l0Var.d(q6);
            abstractC0225fD.getClass();
            O1.a0 a0Var = abstractC0225fD.f3464s;
            a0Var.getClass();
            a0Var.h();
        } catch (IOException | RuntimeException e7) {
            int i8 = l0Var.a.f3457l;
            if (i8 != 3 && i8 != 5) {
                throw e7;
            }
            Q1.u uVar = this.f3288B.f3374i.f3356o;
            AbstractC0015b.n("ExoPlayerImplInternal", "Disabling track due to error: " + C2393o.c(uVar.f7941c[i7].h()), e7);
            Q1.u uVar2 = new Q1.u((k0[]) uVar.f7940b.clone(), (Q1.s[]) uVar.f7941c.clone(), uVar.f7942d, uVar.f7943e);
            uVar2.f7940b[i7] = null;
            uVar2.f7941c[i7] = null;
            f(i7);
            Q q7 = this.f3288B.f3374i;
            q7.a(uVar2, this.f3296L.f3443s, false, new boolean[q7.f3351j.length]);
        }
    }

    public final void B(int i7, boolean z7) {
        boolean[] zArr = this.f3323m;
        if (zArr[i7] != z7) {
            zArr[i7] = z7;
            this.f3294H.c(new F.h(this, i7, z7));
        }
    }

    public final void C() throws Throwable {
        r(this.f3289C.b(), true);
    }

    public final void D() {
        this.f3297M.f(1);
        throw null;
    }

    public final void E() {
        this.f3297M.f(1);
        int i7 = 0;
        J(false, false, false, true);
        C0230k c0230k = this.f3326p;
        c0230k.getClass();
        long id = Thread.currentThread().getId();
        long j7 = c0230k.f3526j;
        AbstractC0015b.g("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j7 == -1 || j7 == id);
        c0230k.f3526j = id;
        HashMap map = c0230k.f3525i;
        I1.l lVar = this.f3292F;
        if (!map.containsKey(lVar)) {
            map.put(lVar, new C0229j());
        }
        C0229j c0229j = (C0229j) map.get(lVar);
        c0229j.getClass();
        int i8 = c0230k.f3522f;
        if (i8 == -1) {
            i8 = 13107200;
        }
        c0229j.f3507b = i8;
        c0229j.a = false;
        e0(this.f3296L.a.p() ? 4 : 2);
        d0 d0Var = this.f3296L;
        boolean z7 = d0Var.f3436l;
        p0(this.J.d(d0Var.f3429e, z7), d0Var.f3438n, d0Var.f3437m, z7);
        R1.h hVar = (R1.h) this.f3327q;
        hVar.getClass();
        c0 c0Var = this.f3289C;
        AbstractC0015b.h(!c0Var.f3421k);
        c0Var.f3422l = hVar;
        while (true) {
            ArrayList arrayList = c0Var.f3412b;
            if (i7 >= arrayList.size()) {
                c0Var.f3421k = true;
                this.f3328r.e(2);
                return;
            } else {
                b0 b0Var = (b0) arrayList.get(i7);
                c0Var.e(b0Var);
                c0Var.f3417g.add(b0Var);
                i7++;
            }
        }
    }

    public final void F() {
        C0221b c0221b;
        Spatializer spatializer;
        Q1.l lVar;
        Handler handler;
        try {
            J(true, false, true, false);
            G();
            C0230k c0230k = this.f3326p;
            if (c0230k.f3525i.remove(this.f3292F) != null) {
                c0230k.d();
            }
            if (c0230k.f3525i.isEmpty()) {
                c0230k.f3526j = -1L;
            }
            C0224e c0224e = this.J;
            c0224e.f3446c = null;
            c0224e.a();
            c0224e.c(0);
            Q1.q qVar = (Q1.q) this.f3324n;
            qVar.getClass();
            if (B1.K.a >= 32 && (c0221b = qVar.f7936g) != null && (spatializer = (Spatializer) c0221b.f3405l) != null && (lVar = (Q1.l) c0221b.f3407n) != null && (handler = (Handler) c0221b.f3406m) != null) {
                spatializer.removeOnSpatializerStateChangedListener(lVar);
                handler.removeCallbacksAndMessages(null);
            }
            qVar.a = null;
            qVar.f7939b = null;
            e0(1);
            this.f3329s.c();
            synchronized (this) {
                this.f3298N = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.f3329s.c();
            synchronized (this) {
                this.f3298N = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void G() {
        for (int i7 = 0; i7 < this.f3321k.length; i7++) {
            AbstractC0225f abstractC0225f = this.f3322l[i7];
            synchronized (abstractC0225f.f3456k) {
                abstractC0225f.f3455A = null;
            }
            l0 l0Var = this.f3321k[i7];
            AbstractC0225f abstractC0225f2 = l0Var.a;
            AbstractC0015b.h(abstractC0225f2.f3463r == 0);
            abstractC0225f2.r();
            l0Var.f3538e = false;
            AbstractC0225f abstractC0225f3 = l0Var.f3536c;
            if (abstractC0225f3 != null) {
                AbstractC0015b.h(abstractC0225f3.f3463r == 0);
                abstractC0225f3.r();
                l0Var.f3539f = false;
            }
        }
    }

    public final void H(int i7, int i8, O1.c0 c0Var) throws Throwable {
        this.f3297M.f(1);
        c0 c0Var2 = this.f3289C;
        c0Var2.getClass();
        AbstractC0015b.c(i7 >= 0 && i7 <= i8 && i8 <= c0Var2.f3412b.size());
        c0Var2.f3420j = c0Var;
        c0Var2.g(i7, i8);
        r(c0Var2.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I() throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.I():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(boolean r37, boolean r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.J(boolean, boolean, boolean, boolean):void");
    }

    public final void K() {
        Q q6 = this.f3288B.f3374i;
        this.f3300P = q6 != null && q6.f3348g.f3365i && this.f3299O;
    }

    public final void L(long j7) {
        Q q6 = this.f3288B.f3374i;
        long j8 = j7 + (q6 == null ? 1000000000000L : q6.f3357p);
        this.f3311a0 = j8;
        ((n0) this.f3334x.f3531m).c(j8);
        for (l0 l0Var : this.f3321k) {
            long j9 = this.f3311a0;
            AbstractC0225f abstractC0225fD = l0Var.d(q6);
            if (abstractC0225fD != null) {
                abstractC0225fD.f3469x = false;
                abstractC0225fD.f3467v = j9;
                abstractC0225fD.f3468w = j9;
                abstractC0225fD.q(j9, false);
            }
        }
        for (Q q7 = r0.f3374i; q7 != null; q7 = q7.f3354m) {
            for (Q1.s sVar : q7.f3356o.f7941c) {
                if (sVar != null) {
                    sVar.j();
                }
            }
        }
    }

    public final void M(y1.P p7, y1.P p8) {
        if (p7.p() && p8.p()) {
            return;
        }
        ArrayList arrayList = this.f3335y;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            v.c0.e(arrayList.get(size));
            throw null;
        }
    }

    public final void P(long j7) {
        this.f3328r.a.sendEmptyMessageAtTime(2, j7 + ((this.f3296L.f3429e != 3 || h0()) ? f3286k0 : 1000L));
    }

    public final void Q(boolean z7) throws C0234o {
        O1.B b4 = this.f3288B.f3374i.f3348g.a;
        long jS = S(b4, this.f3296L.f3443s, true, false);
        if (jS != this.f3296L.f3443s) {
            d0 d0Var = this.f3296L;
            this.f3296L = u(b4, jS, d0Var.f3427c, d0Var.f3428d, z7, 5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v17, types: [O1.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(H1.K r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.R(H1.K):void");
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [O1.z, java.lang.Object] */
    public final long S(O1.B b4, long j7, boolean z7, boolean z8) throws C0234o {
        l0[] l0VarArr;
        l0();
        s0(false, true);
        if (z8 || this.f3296L.f3429e == 3) {
            e0(2);
        }
        T t7 = this.f3288B;
        Q q6 = t7.f3374i;
        Q q7 = q6;
        while (q7 != null && !b4.equals(q7.f3348g.a)) {
            q7 = q7.f3354m;
        }
        if (z7 || q6 != q7 || (q7 != null && q7.f3357p + j7 < 0)) {
            int i7 = 0;
            while (true) {
                l0VarArr = this.f3321k;
                if (i7 >= l0VarArr.length) {
                    break;
                }
                f(i7);
                i7++;
            }
            this.f3318h0 = -9223372036854775807L;
            if (q7 != null) {
                while (t7.f3374i != q7) {
                    t7.a();
                }
                t7.m(q7);
                q7.f3357p = 1000000000000L;
                i(new boolean[l0VarArr.length], t7.f3375j.e());
                q7.f3349h = true;
            }
        }
        e();
        if (q7 != null) {
            t7.m(q7);
            if (!q7.f3346e) {
                q7.f3348g = q7.f3348g.b(j7);
            } else if (q7.f3347f) {
                ?? r10 = q7.a;
                j7 = r10.q(j7);
                r10.r(j7 - this.f3333w);
            }
            L(j7);
            x();
        } else {
            t7.b();
            L(j7);
        }
        q(false);
        this.f3328r.e(2);
        return j7;
    }

    public final void T(h0 h0Var) {
        h0Var.getClass();
        Looper looper = h0Var.f3490e;
        Looper looper2 = this.f3330t;
        B1.F f5 = this.f3328r;
        if (looper != looper2) {
            f5.a(15, h0Var).b();
            return;
        }
        synchronized (h0Var) {
        }
        try {
            h0Var.a.c(h0Var.f3488c, h0Var.f3489d);
            h0Var.a(true);
            int i7 = this.f3296L.f3429e;
            if (i7 == 3 || i7 == 2) {
                f5.e(2);
            }
        } catch (Throwable th) {
            h0Var.a(true);
            throw th;
        }
    }

    public final void U(h0 h0Var) {
        Looper looper = h0Var.f3490e;
        if (looper.getThread().isAlive()) {
            this.f3336z.a(looper, null).c(new RunnableC0016c(5, this, h0Var));
        } else {
            AbstractC0015b.v("TAG", "Trying to send message on a dead thread.");
            h0Var.a(false);
        }
    }

    public final void V(C2381c c2381c, boolean z7) {
        Q1.q qVar = (Q1.q) this.f3324n;
        if (!qVar.f7937h.equals(c2381c)) {
            qVar.f7937h = c2381c;
            qVar.d();
        }
        if (!z7) {
            c2381c = null;
        }
        C0224e c0224e = this.J;
        if (!Objects.equals(c0224e.f3447d, c2381c)) {
            c0224e.f3447d = c2381c;
            int i7 = c2381c == null ? 0 : 1;
            c0224e.f3449f = i7;
            AbstractC0015b.b("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i7 == 1 || i7 == 0);
        }
        d0 d0Var = this.f3296L;
        boolean z8 = d0Var.f3436l;
        p0(c0224e.d(d0Var.f3429e, z8), d0Var.f3438n, d0Var.f3437m, z8);
    }

    public final void W(boolean z7, AtomicBoolean atomicBoolean) {
        if (this.f3306V != z7) {
            this.f3306V = z7;
            if (!z7) {
                for (l0 l0Var : this.f3321k) {
                    l0Var.l();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void X(I i7) throws Throwable {
        this.f3297M.f(1);
        int i8 = i7.f3277c;
        ArrayList arrayList = i7.a;
        O1.c0 c0Var = i7.f3276b;
        if (i8 != -1) {
            this.f3310Z = new K(new j0(arrayList, c0Var), i7.f3277c, i7.f3278d);
        }
        c0 c0Var2 = this.f3289C;
        ArrayList arrayList2 = c0Var2.f3412b;
        c0Var2.g(0, arrayList2.size());
        r(c0Var2.a(arrayList2.size(), arrayList, c0Var), false);
    }

    public final void Y(boolean z7) throws C0234o {
        this.f3299O = z7;
        K();
        if (this.f3300P) {
            T t7 = this.f3288B;
            if (t7.f3375j != t7.f3374i) {
                Q(true);
                q(false);
            }
        }
    }

    public final void Z(y1.G g4) {
        this.f3328r.d(16);
        C0231l c0231l = this.f3334x;
        c0231l.a(g4);
        y1.G gD = c0231l.d();
        t(gD, gD.a, true, true);
    }

    public final void a(I i7, int i8) throws Throwable {
        this.f3297M.f(1);
        c0 c0Var = this.f3289C;
        if (i8 == -1) {
            i8 = c0Var.f3412b.size();
        }
        r(c0Var.a(i8, i7.a, i7.f3276b), false);
    }

    public final void a0(C0237s c0237s) {
        this.f3317g0 = c0237s;
        y1.P p7 = this.f3296L.a;
        T t7 = this.f3288B;
        t7.getClass();
        c0237s.getClass();
        if (t7.f3382q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < t7.f3382q.size(); i7++) {
            ((Q) t7.f3382q.get(i7)).i();
        }
        t7.f3382q = arrayList;
        t7.f3378m = null;
        t7.j();
    }

    @Override // O1.InterfaceC0550y
    public final void b(InterfaceC0551z interfaceC0551z) {
        this.f3328r.a(8, interfaceC0551z).b();
    }

    public final void b0(int i7) throws C0234o {
        this.f3304T = i7;
        y1.P p7 = this.f3296L.a;
        T t7 = this.f3288B;
        t7.f3372g = i7;
        int iQ = t7.q(p7);
        if ((iQ & 1) != 0) {
            Q(true);
        } else if ((iQ & 2) != 0) {
            e();
        }
        q(false);
    }

    @Override // O1.InterfaceC0550y
    public final void c(O1.b0 b0Var) {
        this.f3328r.a(9, (InterfaceC0551z) b0Var).b();
    }

    public final void c0(boolean z7) throws C0234o {
        this.f3305U = z7;
        y1.P p7 = this.f3296L.a;
        T t7 = this.f3288B;
        t7.f3373h = z7;
        int iQ = t7.q(p7);
        if ((iQ & 1) != 0) {
            Q(true);
        } else if ((iQ & 2) != 0) {
            e();
        }
        q(false);
    }

    public final boolean d() {
        if (!this.I) {
            return false;
        }
        for (l0 l0Var : this.f3321k) {
            if (l0Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(O1.c0 c0Var) throws Throwable {
        this.f3297M.f(1);
        c0 c0Var2 = this.f3289C;
        int size = c0Var2.f3412b.size();
        if (c0Var.f7420b.length != size) {
            c0Var = new O1.c0(new Random(c0Var.a.nextLong())).a(size);
        }
        c0Var2.f3420j = c0Var;
        r(c0Var2.b(), false);
    }

    public final void e() {
        AbstractC0225f abstractC0225f;
        if (this.I && d()) {
            for (l0 l0Var : this.f3321k) {
                int iC = l0Var.c();
                if (l0Var.f()) {
                    int i7 = l0Var.f3537d;
                    boolean z7 = i7 == 4 || i7 == 2;
                    int i8 = i7 != 4 ? 0 : 1;
                    if (z7) {
                        abstractC0225f = l0Var.a;
                    } else {
                        abstractC0225f = l0Var.f3536c;
                        abstractC0225f.getClass();
                    }
                    l0Var.a(abstractC0225f, this.f3334x);
                    l0Var.j(z7);
                    l0Var.f3537d = i8;
                }
                this.f3309Y -= iC - l0Var.c();
            }
            this.f3318h0 = -9223372036854775807L;
        }
    }

    public final void e0(int i7) {
        d0 d0Var = this.f3296L;
        if (d0Var.f3429e != i7) {
            if (i7 != 2) {
                this.f3316f0 = -9223372036854775807L;
            }
            this.f3296L = d0Var.h(i7);
        }
    }

    public final void f(int i7) {
        l0[] l0VarArr = this.f3321k;
        int iC = l0VarArr[i7].c();
        l0 l0Var = l0VarArr[i7];
        AbstractC0225f abstractC0225f = l0Var.a;
        C0231l c0231l = this.f3334x;
        l0Var.a(abstractC0225f, c0231l);
        AbstractC0225f abstractC0225f2 = l0Var.f3536c;
        if (abstractC0225f2 != null) {
            boolean z7 = (abstractC0225f2.f3463r != 0) && l0Var.f3537d != 3;
            l0Var.a(abstractC0225f2, c0231l);
            l0Var.j(false);
            if (z7) {
                abstractC0225f2.getClass();
                abstractC0225f2.c(17, l0Var.a);
            }
        }
        l0Var.f3537d = 0;
        B(i7, false);
        this.f3309Y -= iC;
    }

    public final void f0(Object obj, AtomicBoolean atomicBoolean) {
        for (l0 l0Var : this.f3321k) {
            AbstractC0225f abstractC0225f = l0Var.a;
            if (abstractC0225f.f3457l == 2) {
                int i7 = l0Var.f3537d;
                if (i7 == 4 || i7 == 1) {
                    AbstractC0225f abstractC0225f2 = l0Var.f3536c;
                    abstractC0225f2.getClass();
                    abstractC0225f2.c(1, obj);
                } else {
                    abstractC0225f.c(1, obj);
                }
            }
        }
        int i8 = this.f3296L.f3429e;
        if (i8 == 3 || i8 == 2) {
            this.f3328r.e(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0903  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018c  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r2v3, types: [O1.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [O1.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v65, types: [O1.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v103, types: [O1.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v127, types: [O1.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() throws H1.C0234o {
        /*
            Method dump skipped, instructions count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.g():void");
    }

    public final void g0(float f5) {
        this.f3320j0 = f5;
        float f7 = f5 * this.J.f3450g;
        for (l0 l0Var : this.f3321k) {
            AbstractC0225f abstractC0225f = l0Var.a;
            if (abstractC0225f.f3457l == 1) {
                abstractC0225f.c(2, Float.valueOf(f7));
                AbstractC0225f abstractC0225f2 = l0Var.f3536c;
                if (abstractC0225f2 != null) {
                    abstractC0225f2.c(2, Float.valueOf(f7));
                }
            }
        }
    }

    public final void h(Q q6, int i7, boolean z7, long j7) throws C0234o {
        l0 l0Var = this.f3321k[i7];
        if (l0Var.g()) {
            return;
        }
        boolean z8 = q6 == this.f3288B.f3374i;
        Q1.u uVar = q6.f3356o;
        k0 k0Var = uVar.f7940b[i7];
        Q1.s sVar = uVar.f7941c[i7];
        boolean z9 = h0() && this.f3296L.f3429e == 3;
        boolean z10 = !z7 && z9;
        this.f3309Y++;
        O1.a0 a0Var = q6.f3344c[i7];
        long j8 = q6.f3357p;
        S s7 = q6.f3348g;
        int length = sVar != null ? sVar.length() : 0;
        C2393o[] c2393oArr = new C2393o[length];
        for (int i8 = 0; i8 < length; i8++) {
            sVar.getClass();
            c2393oArr[i8] = sVar.b(i8);
        }
        int i9 = l0Var.f3537d;
        O1.B b4 = s7.a;
        C0231l c0231l = this.f3334x;
        if (i9 == 0 || i9 == 2 || i9 == 4) {
            l0Var.f3538e = true;
            AbstractC0225f abstractC0225f = l0Var.a;
            AbstractC0015b.h(abstractC0225f.f3463r == 0);
            abstractC0225f.f3459n = k0Var;
            abstractC0225f.f3463r = 1;
            abstractC0225f.p(z10, z8);
            abstractC0225f.y(c2393oArr, a0Var, j7, j8, b4);
            abstractC0225f.f3469x = false;
            abstractC0225f.f3467v = j7;
            abstractC0225f.f3468w = j7;
            abstractC0225f.q(j7, z10);
            c0231l.h(abstractC0225f);
        } else {
            l0Var.f3539f = true;
            AbstractC0225f abstractC0225f2 = l0Var.f3536c;
            abstractC0225f2.getClass();
            AbstractC0015b.h(abstractC0225f2.f3463r == 0);
            abstractC0225f2.f3459n = k0Var;
            abstractC0225f2.f3463r = 1;
            abstractC0225f2.p(z10, z8);
            abstractC0225f2.y(c2393oArr, a0Var, j7, j8, b4);
            abstractC0225f2.f3469x = false;
            abstractC0225f2.f3467v = j7;
            abstractC0225f2.f3468w = j7;
            abstractC0225f2.q(j7, z10);
            c0231l.h(abstractC0225f2);
        }
        H h7 = new H(this);
        AbstractC0225f abstractC0225fD = l0Var.d(q6);
        abstractC0225fD.getClass();
        abstractC0225fD.c(11, h7);
        if (z9 && z8) {
            l0Var.n();
        }
    }

    public final boolean h0() {
        d0 d0Var = this.f3296L;
        return d0Var.f3436l && d0Var.f3438n == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0223  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.handleMessage(android.os.Message):boolean");
    }

    public final void i(boolean[] zArr, long j7) throws C0234o {
        l0[] l0VarArr;
        long j8;
        Q q6 = this.f3288B.f3375j;
        Q1.u uVar = q6.f3356o;
        int i7 = 0;
        while (true) {
            l0VarArr = this.f3321k;
            if (i7 >= l0VarArr.length) {
                break;
            }
            if (!uVar.b(i7)) {
                l0VarArr[i7].l();
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < l0VarArr.length) {
            if (uVar.b(i8) && l0VarArr[i8].d(q6) == null) {
                j8 = j7;
                h(q6, i8, zArr[i8], j8);
            } else {
                j8 = j7;
            }
            i8++;
            j7 = j8;
        }
    }

    public final boolean i0(y1.P p7, O1.B b4) {
        if (b4.b() || p7.p()) {
            return false;
        }
        int i7 = p7.g(b4.a, this.f3332v).f17948c;
        y1.O o7 = this.f3331u;
        p7.n(i7, o7);
        return o7.a() && o7.f17961h && o7.f17958e != -9223372036854775807L;
    }

    public final long j(y1.P p7, Object obj, long j7) {
        y1.N n7 = this.f3332v;
        int i7 = p7.g(obj, n7).f17948c;
        y1.O o7 = this.f3331u;
        p7.n(i7, o7);
        if (o7.f17958e == -9223372036854775807L || !o7.a() || !o7.f17961h) {
            return -9223372036854775807L;
        }
        long j8 = o7.f17959f;
        return B1.K.F((j8 == -9223372036854775807L ? System.currentTimeMillis() : j8 + SystemClock.elapsedRealtime()) - o7.f17958e) - (j7 + n7.f17950e);
    }

    public final void j0() {
        Q q6 = this.f3288B.f3374i;
        if (q6 == null) {
            return;
        }
        Q1.u uVar = q6.f3356o;
        int i7 = 0;
        while (true) {
            l0[] l0VarArr = this.f3321k;
            if (i7 >= l0VarArr.length) {
                return;
            }
            if (uVar.b(i7)) {
                l0VarArr[i7].n();
            }
            i7++;
        }
    }

    public final long k(Q q6) {
        if (q6 == null) {
            return 0L;
        }
        long jMax = q6.f3357p;
        if (!q6.f3346e) {
            return jMax;
        }
        int i7 = 0;
        while (true) {
            l0[] l0VarArr = this.f3321k;
            if (i7 >= l0VarArr.length) {
                return jMax;
            }
            if (l0VarArr[i7].d(q6) != null) {
                AbstractC0225f abstractC0225fD = l0VarArr[i7].d(q6);
                Objects.requireNonNull(abstractC0225fD);
                long j7 = abstractC0225fD.f3468w;
                if (j7 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j7, jMax);
            }
            i7++;
        }
    }

    public final void k0(boolean z7, boolean z8) {
        J(z7 || !this.f3306V, false, true, false);
        this.f3297M.f(z8 ? 1 : 0);
        C0230k c0230k = this.f3326p;
        if (c0230k.f3525i.remove(this.f3292F) != null) {
            c0230k.d();
        }
        this.J.d(1, this.f3296L.f3436l);
        e0(1);
    }

    public final Pair l(y1.P p7) {
        long j7 = 0;
        if (p7.p()) {
            return Pair.create(d0.f3425u, 0L);
        }
        Pair pairI = p7.i(this.f3331u, this.f3332v, p7.a(this.f3305U), -9223372036854775807L);
        O1.B bO = this.f3288B.o(p7, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bO.b()) {
            Object obj = bO.a;
            y1.N n7 = this.f3332v;
            p7.g(obj, n7);
            if (bO.f7253c == n7.e(bO.f7252b)) {
                n7.f17952g.getClass();
            }
        } else {
            j7 = jLongValue;
        }
        return Pair.create(bO, Long.valueOf(j7));
    }

    public final void l0() {
        C0231l c0231l = this.f3334x;
        c0231l.f3530l = false;
        n0 n0Var = (n0) c0231l.f3531m;
        if (n0Var.f3544l) {
            n0Var.c(n0Var.e());
            n0Var.f3544l = false;
        }
        for (l0 l0Var : this.f3321k) {
            AbstractC0225f abstractC0225f = l0Var.a;
            if (l0.h(abstractC0225f)) {
                l0.b(abstractC0225f);
            }
            AbstractC0225f abstractC0225f2 = l0Var.f3536c;
            if (abstractC0225f2 != null && abstractC0225f2.f3463r != 0) {
                l0.b(abstractC0225f2);
            }
        }
    }

    public final long m(long j7) {
        Q q6 = this.f3288B.f3377l;
        if (q6 == null) {
            return 0L;
        }
        return Math.max(0L, j7 - (this.f3311a0 - q6.f3357p));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [O1.b0, java.lang.Object] */
    public final void m0() {
        Q q6 = this.f3288B.f3377l;
        boolean z7 = this.f3303S || (q6 != null && q6.a.a());
        d0 d0Var = this.f3296L;
        if (z7 != d0Var.f3431g) {
            this.f3296L = d0Var.b(z7);
        }
    }

    public final void n(int i7) {
        d0 d0Var = this.f3296L;
        p0(i7, d0Var.f3438n, d0Var.f3437m, d0Var.f3436l);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void n0(Q1.u uVar) {
        Q q6 = this.f3288B.f3377l;
        q6.getClass();
        m(q6.d());
        if (i0(this.f3296L.a, q6.f3348g.a)) {
            long j7 = this.f3290D.f3498h;
        }
        y1.P p7 = this.f3296L.a;
        float f5 = this.f3334x.d().a;
        boolean z7 = this.f3296L.f3436l;
        Q1.s[] sVarArr = uVar.f7941c;
        C0230k c0230k = this.f3326p;
        C0229j c0229j = (C0229j) c0230k.f3525i.get(this.f3292F);
        c0229j.getClass();
        int iMax = c0230k.f3522f;
        if (iMax == -1) {
            int length = sVarArr.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int i9 = 13107200;
                if (i7 < length) {
                    Q1.s sVar = sVarArr[i7];
                    if (sVar != null) {
                        switch (sVar.g().f17970c) {
                            case -2:
                                i9 = 0;
                                i8 += i9;
                                break;
                            case -1:
                            case 1:
                                i8 += i9;
                                break;
                            case 0:
                                i9 = 144310272;
                                i8 += i9;
                                break;
                            case 2:
                                i9 = 131072000;
                                i8 += i9;
                                break;
                            case 3:
                            case GzipHeaderFlags.EXTRA /* 4 */:
                            case 5:
                            case 6:
                                i9 = 131072;
                                i8 += i9;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i7++;
                } else {
                    iMax = Math.max(13107200, i8);
                }
            }
        }
        c0229j.f3507b = iMax;
        c0230k.d();
    }

    public final void o(InterfaceC0551z interfaceC0551z) {
        T t7 = this.f3288B;
        Q q6 = t7.f3377l;
        if (q6 != null && q6.a == interfaceC0551z) {
            t7.l(this.f3311a0);
            x();
            return;
        }
        Q q7 = t7.f3378m;
        if (q7 == null || q7.a != interfaceC0551z) {
            return;
        }
        y();
    }

    public final void o0(int i7, int i8, List list) throws Throwable {
        this.f3297M.f(1);
        c0 c0Var = this.f3289C;
        c0Var.getClass();
        ArrayList arrayList = c0Var.f3412b;
        AbstractC0015b.c(i7 >= 0 && i7 <= i8 && i8 <= arrayList.size());
        AbstractC0015b.c(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((b0) arrayList.get(i9)).a.r((C2401x) list.get(i9 - i7));
        }
        r(c0Var.b(), false);
    }

    public final void p(int i7, IOException iOException) {
        C0234o c0234o = new C0234o(0, iOException, i7);
        Q q6 = this.f3288B.f3374i;
        if (q6 != null) {
            c0234o = c0234o.a(q6.f3348g.a);
        }
        AbstractC0015b.n("ExoPlayerImplInternal", "Playback error", c0234o);
        k0(false, false);
        this.f3296L = this.f3296L.f(c0234o);
    }

    public final void p0(int i7, int i8, int i9, boolean z7) {
        boolean z8 = z7 && i7 != -1;
        if (i7 == -1) {
            i9 = 2;
        } else if (i9 == 2) {
            i9 = 1;
        }
        if (i7 == 0) {
            i8 = 1;
        } else if (i8 == 1) {
            i8 = 0;
        }
        d0 d0Var = this.f3296L;
        if (d0Var.f3436l == z8 && d0Var.f3438n == i8 && d0Var.f3437m == i9) {
            return;
        }
        this.f3296L = d0Var.e(i9, i8, z8);
        s0(false, false);
        T t7 = this.f3288B;
        for (Q q6 = t7.f3374i; q6 != null; q6 = q6.f3354m) {
            for (Q1.s sVar : q6.f3356o.f7941c) {
                if (sVar != null) {
                    sVar.a(z8);
                }
            }
        }
        if (!h0()) {
            l0();
            q0();
            t7.l(this.f3311a0);
            return;
        }
        int i10 = this.f3296L.f3429e;
        B1.F f5 = this.f3328r;
        if (i10 != 3) {
            if (i10 == 2) {
                f5.e(2);
            }
        } else {
            C0231l c0231l = this.f3334x;
            c0231l.f3530l = true;
            ((n0) c0231l.f3531m).f();
            j0();
            f5.e(2);
        }
    }

    public final void q(boolean z7) {
        Q q6 = this.f3288B.f3377l;
        O1.B b4 = q6 == null ? this.f3296L.f3426b : q6.f3348g.a;
        boolean zEquals = this.f3296L.f3435k.equals(b4);
        if (!zEquals) {
            this.f3296L = this.f3296L.c(b4);
        }
        d0 d0Var = this.f3296L;
        d0Var.f3441q = q6 == null ? d0Var.f3443s : q6.d();
        d0 d0Var2 = this.f3296L;
        d0Var2.f3442r = m(d0Var2.f3441q);
        if ((!zEquals || z7) && q6 != null && q6.f3346e) {
            n0(q6.f3356o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Type inference failed for: r2v28, types: [O1.z, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q0() {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.q0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0465  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v4, types: [long] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v31, types: [y1.P] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(y1.P r36, boolean r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.L.r(y1.P, boolean):void");
    }

    public final void r0(y1.P p7, O1.B b4, y1.P p8, O1.B b7, long j7, boolean z7) {
        if (!i0(p7, b4)) {
            y1.G g4 = b4.b() ? y1.G.f17936d : this.f3296L.f3439o;
            C0231l c0231l = this.f3334x;
            if (c0231l.d().equals(g4)) {
                return;
            }
            this.f3328r.d(16);
            c0231l.a(g4);
            t(this.f3296L.f3439o, g4.a, false, false);
            return;
        }
        Object obj = b4.a;
        y1.N n7 = this.f3332v;
        int i7 = p7.g(obj, n7).f17948c;
        y1.O o7 = this.f3331u;
        p7.n(i7, o7);
        C2397t c2397t = o7.f17962i;
        C0228i c0228i = this.f3290D;
        c0228i.getClass();
        c0228i.f3493c = B1.K.F(c2397t.a);
        c0228i.f3496f = B1.K.F(c2397t.f18130b);
        c0228i.f3497g = B1.K.F(c2397t.f18131c);
        float f5 = c2397t.f18132d;
        if (f5 == -3.4028235E38f) {
            f5 = 0.97f;
        }
        c0228i.f3500j = f5;
        float f7 = c2397t.f18133e;
        if (f7 == -3.4028235E38f) {
            f7 = 1.03f;
        }
        c0228i.f3499i = f7;
        if (f5 == 1.0f && f7 == 1.0f) {
            c0228i.f3493c = -9223372036854775807L;
        }
        c0228i.a();
        if (j7 != -9223372036854775807L) {
            c0228i.f3494d = j(p7, obj, j7);
            c0228i.a();
            return;
        }
        if (!Objects.equals(!p8.p() ? p8.m(p8.g(b7.a, n7).f17948c, o7, 0L).a : null, o7.a) || z7) {
            c0228i.f3494d = -9223372036854775807L;
            c0228i.a();
        }
    }

    public final void s(InterfaceC0551z interfaceC0551z) throws C0234o {
        Q q6;
        T t7 = this.f3288B;
        Q q7 = t7.f3377l;
        int i7 = 0;
        boolean z7 = q7 != null && q7.a == interfaceC0551z;
        C0231l c0231l = this.f3334x;
        if (z7) {
            q7.getClass();
            if (!q7.f3346e) {
                float f5 = c0231l.d().a;
                d0 d0Var = this.f3296L;
                q7.f(f5, d0Var.a, d0Var.f3436l);
            }
            n0(q7.f3356o);
            if (q7 == t7.f3374i) {
                L(q7.f3348g.f3358b);
                i(new boolean[this.f3321k.length], t7.f3375j.e());
                q7.f3349h = true;
                d0 d0Var2 = this.f3296L;
                O1.B b4 = d0Var2.f3426b;
                S s7 = q7.f3348g;
                long j7 = d0Var2.f3427c;
                long j8 = s7.f3358b;
                this.f3296L = u(b4, j8, j7, j8, false, 5);
            }
            x();
            return;
        }
        while (true) {
            if (i7 >= t7.f3382q.size()) {
                q6 = null;
                break;
            }
            q6 = (Q) t7.f3382q.get(i7);
            if (q6.a == interfaceC0551z) {
                break;
            } else {
                i7++;
            }
        }
        if (q6 != null) {
            AbstractC0015b.h(!q6.f3346e);
            float f7 = c0231l.d().a;
            d0 d0Var3 = this.f3296L;
            q6.f(f7, d0Var3.a, d0Var3.f3436l);
            Q q8 = t7.f3378m;
            if (q8 == null || q8.a != interfaceC0551z) {
                return;
            }
            y();
        }
    }

    public final void s0(boolean z7, boolean z8) {
        long jElapsedRealtime;
        this.f3301Q = z7;
        if (!z7 || z8) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.f3336z.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.f3302R = jElapsedRealtime;
    }

    public final void t(y1.G g4, float f5, boolean z7, boolean z8) {
        int i7;
        if (z7) {
            if (z8) {
                this.f3297M.f(1);
            }
            this.f3296L = this.f3296L.g(g4);
        }
        float f7 = g4.a;
        Q q6 = this.f3288B.f3374i;
        while (true) {
            i7 = 0;
            if (q6 == null) {
                break;
            }
            Q1.s[] sVarArr = q6.f3356o.f7941c;
            int length = sVarArr.length;
            while (i7 < length) {
                Q1.s sVar = sVarArr[i7];
                if (sVar != null) {
                    sVar.i(f7);
                }
                i7++;
            }
            q6 = q6.f3354m;
        }
        l0[] l0VarArr = this.f3321k;
        int length2 = l0VarArr.length;
        while (i7 < length2) {
            l0 l0Var = l0VarArr[i7];
            AbstractC0225f abstractC0225f = l0Var.a;
            float f8 = g4.a;
            abstractC0225f.z(f5, f8);
            AbstractC0225f abstractC0225f2 = l0Var.f3536c;
            if (abstractC0225f2 != null) {
                abstractC0225f2.z(f5, f8);
            }
            i7++;
        }
    }

    public final synchronized void t0(i3.h hVar, long j7) {
        this.f3336z.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j7;
        boolean z7 = false;
        while (!((Boolean) hVar.get()).booleanValue() && j7 > 0) {
            try {
                this.f3336z.getClass();
                wait(j7);
            } catch (InterruptedException unused) {
                z7 = true;
            }
            this.f3336z.getClass();
            j7 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public final d0 u(O1.B b4, long j7, long j8, long j9, boolean z7, int i7) {
        j3.X xF;
        boolean z8;
        int i8;
        this.f3314d0 = (!this.f3314d0 && j7 == this.f3296L.f3443s && b4.equals(this.f3296L.f3426b)) ? false : true;
        K();
        d0 d0Var = this.f3296L;
        O1.g0 g0Var = d0Var.f3432h;
        Q1.u uVar = d0Var.f3433i;
        List list = d0Var.f3434j;
        if (this.f3289C.f3421k) {
            Q q6 = this.f3288B.f3374i;
            g0Var = q6 == null ? O1.g0.f7448d : q6.f3355n;
            uVar = q6 == null ? this.f3325o : q6.f3356o;
            Q1.s[] sVarArr = uVar.f7941c;
            j3.D d4 = new j3.D(4);
            boolean z9 = false;
            for (Q1.s sVar : sVarArr) {
                if (sVar != null) {
                    y1.C c2 = sVar.b(0).f18110l;
                    if (c2 == null) {
                        d4.a(new y1.C(new y1.B[0]));
                    } else {
                        d4.a(c2);
                        z9 = true;
                    }
                }
            }
            int i9 = 1;
            if (z9) {
                xF = d4.f();
            } else {
                j3.E e7 = j3.G.f12277l;
                xF = j3.X.f12304o;
            }
            list = xF;
            if (q6 != null) {
                S s7 = q6.f3348g;
                if (s7.f3359c != j8) {
                    q6.f3348g = s7.a(j8);
                }
            }
            T t7 = this.f3288B;
            Q q7 = t7.f3374i;
            if (q7 == t7.f3375j && q7 != null) {
                Q1.u uVar2 = q7.f3356o;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    l0[] l0VarArr = this.f3321k;
                    if (i10 >= l0VarArr.length) {
                        z8 = true;
                        break;
                    }
                    if (uVar2.b(i10)) {
                        i8 = i9;
                        if (l0VarArr[i10].a.f3457l != i8) {
                            z8 = false;
                            break;
                        }
                        if (uVar2.f7940b[i10].a != 0) {
                            i11 = i8;
                        }
                    } else {
                        i8 = i9;
                    }
                    i10 += i8;
                    i9 = i8;
                }
                boolean z10 = i11 != 0 && z8;
                if (z10 != this.f3308X) {
                    this.f3308X = z10;
                    if (!z10 && this.f3296L.f3440p) {
                        this.f3328r.e(2);
                    }
                }
            }
        } else if (!b4.equals(d0Var.f3426b)) {
            g0Var = O1.g0.f7448d;
            uVar = this.f3325o;
            list = j3.X.f12304o;
        }
        O1.g0 g0Var2 = g0Var;
        Q1.u uVar3 = uVar;
        List list2 = list;
        if (z7) {
            C2.y yVar = this.f3297M;
            if (!yVar.f938d || yVar.f939e == 5) {
                yVar.f936b = true;
                yVar.f938d = true;
                yVar.f939e = i7;
            } else {
                AbstractC0015b.c(i7 == 5);
            }
        }
        d0 d0Var2 = this.f3296L;
        return d0Var2.d(b4, j7, j8, j9, m(d0Var2.f3441q), g0Var2, uVar3, list2);
    }

    public final boolean w() {
        Q q6 = this.f3288B.f3374i;
        long j7 = q6.f3348g.f3361e;
        if (q6.f3346e) {
            return j7 == -9223372036854775807L || this.f3296L.f3443s < j7 || !h0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [O1.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [O1.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [O1.b0, java.lang.Object] */
    public final void x() {
        boolean zC;
        if (v(this.f3288B.f3377l)) {
            Q q6 = this.f3288B.f3377l;
            long jM = m(!q6.f3346e ? 0L : q6.a.f());
            Q q7 = this.f3288B.f3374i;
            long j7 = i0(this.f3296L.a, q6.f3348g.a) ? this.f3290D.f3498h : -9223372036854775807L;
            I1.l lVar = this.f3292F;
            y1.P p7 = this.f3296L.a;
            float f5 = this.f3334x.d().a;
            boolean z7 = this.f3296L.f3436l;
            M m7 = new M(lVar, jM, f5, this.f3301Q, j7);
            zC = this.f3326p.c(m7);
            Q q8 = this.f3288B.f3374i;
            if (!zC && q8.f3346e && jM < 500000 && this.f3333w > 0) {
                q8.a.r(this.f3296L.f3443s);
                zC = this.f3326p.c(m7);
            }
        } else {
            zC = false;
        }
        this.f3303S = zC;
        if (zC) {
            Q q9 = this.f3288B.f3377l;
            q9.getClass();
            N n7 = new N();
            n7.a = this.f3311a0 - q9.f3357p;
            float f7 = this.f3334x.d().a;
            AbstractC0015b.c(f7 > 0.0f || f7 == -3.4028235E38f);
            n7.f3339b = f7;
            long j8 = this.f3302R;
            AbstractC0015b.c(j8 >= 0 || j8 == -9223372036854775807L);
            n7.f3340c = j8;
            O o7 = new O(n7);
            AbstractC0015b.h(q9.f3354m == null);
            q9.a.e(o7);
        }
        m0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [O1.b0, O1.z, java.lang.Object] */
    public final void y() {
        T t7 = this.f3288B;
        t7.j();
        Q q6 = t7.f3378m;
        if (q6 != null) {
            if (!q6.f3345d || q6.f3346e) {
                ?? r12 = q6.a;
                if (r12.a()) {
                    return;
                }
                y1.P p7 = this.f3296L.a;
                if (q6.f3346e) {
                    r12.n();
                }
                Iterator it = this.f3326p.f3525i.values().iterator();
                while (it.hasNext()) {
                    if (((C0229j) it.next()).a) {
                        return;
                    }
                }
                if (!q6.f3345d) {
                    S s7 = q6.f3348g;
                    q6.f3345d = true;
                    r12.i(this, s7.f3358b);
                    return;
                }
                N n7 = new N();
                n7.a = this.f3311a0 - q6.f3357p;
                float f5 = this.f3334x.d().a;
                AbstractC0015b.c(f5 > 0.0f || f5 == -3.4028235E38f);
                n7.f3339b = f5;
                long j7 = this.f3302R;
                AbstractC0015b.c(j7 >= 0 || j7 == -9223372036854775807L);
                n7.f3340c = j7;
                O o7 = new O(n7);
                AbstractC0015b.h(q6.f3354m == null);
                r12.e(o7);
            }
        }
    }

    public final void z() {
        C2.y yVar = this.f3297M;
        d0 d0Var = this.f3296L;
        boolean z7 = yVar.f936b | (((d0) yVar.f940f) != d0Var);
        yVar.f936b = z7;
        yVar.f940f = d0Var;
        if (z7) {
            G g4 = this.f3287A.f3589k;
            g4.f3269t.c(new RunnableC0016c(4, g4, yVar));
            this.f3297M = new C2.y(this.f3296L);
        }
    }
}
