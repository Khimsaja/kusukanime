package T1;

import B1.AbstractC0015b;
import B1.C;
import B1.F;
import B1.K;
import B1.RunnableC0016c;
import C2.C0034g;
import C2.G;
import H1.AbstractC0225f;
import H1.C0226g;
import H1.C0227h;
import H1.C0234o;
import H1.H;
import H1.k0;
import O1.B;
import O1.a0;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import j3.D;
import j3.E;
import j3.X;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import y1.C2384f;
import y1.C2392n;
import y1.C2393o;
import y1.N;
import y1.P;
import y1.b0;

/* loaded from: classes.dex */
public final class i extends M1.s {

    /* renamed from: A1, reason: collision with root package name */
    public static final int[] f8879A1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: B1, reason: collision with root package name */
    public static boolean f8880B1;

    /* renamed from: C1, reason: collision with root package name */
    public static boolean f8881C1;

    /* renamed from: M0, reason: collision with root package name */
    public final Context f8882M0;

    /* renamed from: N0, reason: collision with root package name */
    public final boolean f8883N0;

    /* renamed from: O0, reason: collision with root package name */
    public final J1.j f8884O0;

    /* renamed from: P0, reason: collision with root package name */
    public final int f8885P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final boolean f8886Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final s f8887R0;

    /* renamed from: S0, reason: collision with root package name */
    public final r f8888S0;

    /* renamed from: T0, reason: collision with root package name */
    public final long f8889T0;

    /* renamed from: U0, reason: collision with root package name */
    public final PriorityQueue f8890U0;
    public C1.i V0;

    /* renamed from: W0, reason: collision with root package name */
    public boolean f8891W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f8892X0;

    /* renamed from: Y0, reason: collision with root package name */
    public l f8893Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f8894Z0;

    /* renamed from: a1, reason: collision with root package name */
    public List f8895a1;

    /* renamed from: b1, reason: collision with root package name */
    public Surface f8896b1;

    /* renamed from: c1, reason: collision with root package name */
    public k f8897c1;

    /* renamed from: d1, reason: collision with root package name */
    public C f8898d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f8899e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f8900f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f8901g1;
    public long h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f8902i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f8903j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f8904k1;
    public long l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f8905m1;

    /* renamed from: n1, reason: collision with root package name */
    public long f8906n1;

    /* renamed from: o1, reason: collision with root package name */
    public b0 f8907o1;

    /* renamed from: p1, reason: collision with root package name */
    public b0 f8908p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f8909q1;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f8910r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f8911s1;

    /* renamed from: t1, reason: collision with root package name */
    public h f8912t1;

    /* renamed from: u1, reason: collision with root package name */
    public q f8913u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f8914v1;

    /* renamed from: w1, reason: collision with root package name */
    public long f8915w1;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f8916x1;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f8917y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f8918z1;

    public i(g gVar) {
        super(2, gVar.f8872c, 30.0f);
        Context applicationContext = gVar.a.getApplicationContext();
        this.f8882M0 = applicationContext;
        this.f8885P0 = gVar.f8876g;
        this.f8893Y0 = null;
        this.f8884O0 = new J1.j(gVar.f8874e, gVar.f8875f, 1);
        this.f8883N0 = this.f8893Y0 == null;
        this.f8887R0 = new s(applicationContext, this, gVar.f8873d);
        this.f8888S0 = new r();
        this.f8886Q0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.f8898d1 = C.f290c;
        this.f8900f1 = 1;
        this.f8901g1 = 0;
        this.f8907o1 = b0.f18027d;
        this.f8911s1 = 0;
        this.f8908p1 = null;
        this.f8909q1 = -1000;
        this.f8914v1 = -9223372036854775807L;
        this.f8915w1 = -9223372036854775807L;
        this.f8890U0 = new PriorityQueue();
        this.f8889T0 = -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean w0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.i.w0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int x0(M1.p r12, y1.C2393o r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.i.x0(M1.p, y1.o):int");
    }

    public static List y0(Context context, M1.k kVar, C2393o c2393o, boolean z7, boolean z8) {
        List listE;
        String str = c2393o.f18112n;
        if (str == null) {
            return X.f12304o;
        }
        if (K.a >= 26 && "video/dolby-vision".equals(str) && !z1.c.p(context)) {
            String strB = M1.z.b(c2393o);
            if (strB == null) {
                listE = X.f12304o;
            } else {
                kVar.getClass();
                listE = M1.z.e(strB, z7, z8);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return M1.z.g(kVar, c2393o, z7, z8);
    }

    public static int z0(M1.p pVar, C2393o c2393o) {
        if (c2393o.f18113o == -1) {
            return x0(pVar, c2393o);
        }
        List list = c2393o.f18115q;
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += ((byte[]) list.get(i7)).length;
        }
        return c2393o.f18113o + length;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface A0(M1.p r6) {
        /*
            r5 = this;
            T1.l r0 = r5.f8893Y0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto La9
            android.view.Surface r0 = r5.f8896b1
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = B1.K.a
            r3 = 35
            if (r0 < r3) goto L16
            boolean r0 = r6.f6468h
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = r5.H0(r6)
            B1.AbstractC0015b.h(r0)
            T1.k r0 = r5.f8897c1
            if (r0 == 0) goto L2e
            boolean r3 = r0.f8926k
            boolean r4 = r6.f6466f
            if (r3 == r4) goto L2e
            if (r0 == 0) goto L2e
            r0.release()
            r5.f8897c1 = r2
        L2e:
            T1.k r0 = r5.f8897c1
            if (r0 != 0) goto La6
            android.content.Context r0 = r5.f8882M0
            boolean r6 = r6.f6466f
            r2 = 1
            if (r6 == 0) goto L42
            boolean r0 = T1.k.a(r0)
            if (r0 == 0) goto L40
            goto L44
        L40:
            r0 = r1
            goto L45
        L42:
            int r0 = T1.k.f8924n
        L44:
            r0 = r2
        L45:
            B1.AbstractC0015b.h(r0)
            T1.j r0 = new T1.j
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L54
            int r6 = T1.k.f8924n
            goto L55
        L54:
            r6 = r1
        L55:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f8920l = r3
            B1.i r4 = new B1.i
            r4.<init>(r3)
            r0.f8919k = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f8920l     // Catch: java.lang.Throwable -> L84
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch: java.lang.Throwable -> L84
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L84
        L74:
            T1.k r6 = r0.f8923o     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.RuntimeException r6 = r0.f8922n     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            java.lang.Error r6 = r0.f8921m     // Catch: java.lang.Throwable -> L84
            if (r6 != 0) goto L88
            r0.wait()     // Catch: java.lang.Throwable -> L84 java.lang.InterruptedException -> L86
            goto L74
        L84:
            r6 = move-exception
            goto La4
        L86:
            r1 = r2
            goto L74
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L92
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L92:
            java.lang.RuntimeException r6 = r0.f8922n
            if (r6 != 0) goto La3
            java.lang.Error r6 = r0.f8921m
            if (r6 != 0) goto La2
            T1.k r6 = r0.f8923o
            r6.getClass()
            r5.f8897c1 = r6
            goto La6
        La2:
            throw r6
        La3:
            throw r6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r6
        La6:
            T1.k r6 = r5.f8897c1
            return r6
        La9:
            B1.AbstractC0015b.h(r1)
            B1.AbstractC0015b.i(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.i.A0(M1.p):android.view.Surface");
    }

    public final boolean B0(M1.p pVar) {
        if (this.f8893Y0 != null) {
            return true;
        }
        Surface surface = this.f8896b1;
        if (surface == null || !surface.isValid()) {
            return (K.a >= 35 && pVar.f6468h) || H0(pVar);
        }
        return true;
    }

    public final void C0() {
        if (this.f8902i1 > 0) {
            this.f3462q.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j7 = jElapsedRealtime - this.h1;
            int i7 = this.f8902i1;
            J1.j jVar = this.f8884O0;
            Handler handler = jVar.a;
            if (handler != null) {
                handler.post(new x(jVar, i7, j7));
            }
            this.f8902i1 = 0;
            this.h1 = jElapsedRealtime;
        }
    }

    @Override // M1.s
    public final C0227h D(M1.p pVar, C2393o c2393o, C2393o c2393o2) {
        C0227h c0227hB = pVar.b(c2393o, c2393o2);
        C1.i iVar = this.V0;
        iVar.getClass();
        int i7 = c2393o2.f18119u;
        int i8 = iVar.a;
        int i9 = c0227hB.f3486e;
        if (i7 > i8 || c2393o2.f18120v > iVar.f580b) {
            i9 |= 256;
        }
        if (z0(pVar, c2393o2) > iVar.f581c) {
            i9 |= 64;
        }
        int i10 = i9;
        return new C0227h(pVar.a, c2393o, c2393o2, i10 != 0 ? 0 : c0227hB.f3485d, i10);
    }

    public final void D0() {
        int i7;
        M1.m mVar;
        if (!this.f8910r1 || (i7 = K.a) < 23 || (mVar = this.f6506U) == null) {
            return;
        }
        this.f8912t1 = new h(this, mVar);
        if (i7 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            mVar.e(bundle);
        }
    }

    @Override // M1.s
    public final M1.o E(IllegalStateException illegalStateException, M1.p pVar) {
        Surface surface = this.f8896b1;
        f fVar = new f(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return fVar;
    }

    public final void E0(M1.m mVar, int i7, long j7) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mVar.K0(i7, j7);
        Trace.endSection();
        this.f6492H0.f3475e++;
        this.f8903j1 = 0;
        if (this.f8893Y0 == null) {
            b0 b0Var = this.f8907o1;
            boolean zEquals = b0Var.equals(b0.f18027d);
            J1.j jVar = this.f8884O0;
            if (!zEquals && !b0Var.equals(this.f8908p1)) {
                this.f8908p1 = b0Var;
                jVar.b(b0Var);
            }
            s sVar = this.f8887R0;
            boolean z7 = sVar.f8949e != 3;
            sVar.f8949e = 3;
            sVar.f8956l.getClass();
            sVar.f8951g = K.F(SystemClock.elapsedRealtime());
            if (!z7 || (surface = this.f8896b1) == null) {
                return;
            }
            Handler handler = jVar.a;
            if (handler != null) {
                handler.post(new y(jVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f8899e1 = true;
        }
    }

    public final void F0(Object obj) throws C0234o {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f8896b1;
        J1.j jVar = this.f8884O0;
        if (surface2 == surface) {
            if (surface != null) {
                b0 b0Var = this.f8908p1;
                if (b0Var != null) {
                    jVar.b(b0Var);
                }
                Surface surface3 = this.f8896b1;
                if (surface3 == null || !this.f8899e1 || (handler = jVar.a) == null) {
                    return;
                }
                handler.post(new y(jVar, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.f8896b1 = surface;
        l lVar = this.f8893Y0;
        s sVar = this.f8887R0;
        if (lVar == null) {
            sVar.getClass();
            sVar.f8957m = surface != null;
            sVar.f8958n = false;
            v vVar = sVar.f8946b;
            if (vVar.f8968e != surface) {
                vVar.b();
                vVar.f8968e = surface;
                vVar.d(true);
            }
            sVar.d(1);
        }
        this.f8899e1 = false;
        int i7 = this.f3463r;
        M1.m mVar = this.f6506U;
        if (mVar != null && this.f8893Y0 == null) {
            M1.p pVar = this.f6513b0;
            pVar.getClass();
            boolean zB0 = B0(pVar);
            int i8 = K.a;
            if (i8 < 23 || !zB0 || this.f8891W0) {
                j0();
                U();
            } else {
                Surface surfaceA0 = A0(pVar);
                if (i8 >= 23 && surfaceA0 != null) {
                    mVar.r0(surfaceA0);
                } else {
                    if (i8 < 35) {
                        throw new IllegalStateException();
                    }
                    mVar.n0();
                }
            }
        }
        if (surface != null) {
            b0 b0Var2 = this.f8908p1;
            if (b0Var2 != null) {
                jVar.b(b0Var2);
            }
        } else {
            this.f8908p1 = null;
            l lVar2 = this.f8893Y0;
            if (lVar2 != null) {
                o oVar = (o) lVar2.f8931d;
                int i9 = C.f290c.a;
                oVar.f8940j = null;
            }
        }
        if (i7 == 2) {
            l lVar3 = this.f8893Y0;
            if (lVar3 != null) {
                ((o) lVar3.f8931d).f8936f.a.c(true);
            } else {
                sVar.c(true);
            }
        }
        D0();
    }

    public final boolean G0(long j7, long j8, boolean z7, boolean z8) throws C0234o {
        long j9 = this.f8889T0;
        if (j9 != -9223372036854775807L) {
            this.f8917y1 = j8 > this.f3467v + 200000 && j7 < j9;
        }
        if (j7 < -500000 && !z7) {
            a0 a0Var = this.f3464s;
            a0Var.getClass();
            int iJ = a0Var.j(j8 - this.f3466u);
            if (iJ != 0) {
                PriorityQueue priorityQueue = this.f8890U0;
                if (z8) {
                    C0226g c0226g = this.f6492H0;
                    int i7 = c0226g.f3474d + iJ;
                    c0226g.f3474d = i7;
                    c0226g.f3476f += this.f8904k1;
                    c0226g.f3474d = priorityQueue.size() + i7;
                } else {
                    this.f6492H0.f3480j++;
                    J0(priorityQueue.size() + iJ, this.f8904k1);
                }
                if (K()) {
                    U();
                }
                l lVar = this.f8893Y0;
                if (lVar != null) {
                    lVar.b(false);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean H0(M1.p pVar) {
        if (K.a < 23 || this.f8910r1 || w0(pVar.a)) {
            return false;
        }
        return !pVar.f6466f || k.a(this.f8882M0);
    }

    public final void I0(M1.m mVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        mVar.o(i7);
        Trace.endSection();
        this.f6492H0.f3476f++;
    }

    public final void J0(int i7, int i8) {
        C0226g c0226g = this.f6492H0;
        c0226g.f3478h += i7;
        int i9 = i7 + i8;
        c0226g.f3477g += i9;
        this.f8902i1 += i9;
        int i10 = this.f8903j1 + i9;
        this.f8903j1 = i10;
        c0226g.f3479i = Math.max(i10, c0226g.f3479i);
        int i11 = this.f8885P0;
        if (i11 <= 0 || this.f8902i1 < i11) {
            return;
        }
        C0();
    }

    public final void K0(long j7) {
        C0226g c0226g = this.f6492H0;
        c0226g.f3481k += j7;
        c0226g.f3482l++;
        this.l1 += j7;
        this.f8905m1++;
    }

    @Override // M1.s
    public final int M(G1.f fVar) {
        return (K.a < 34 || !this.f8910r1 || fVar.f2611q >= this.f3467v) ? 0 : 32;
    }

    @Override // M1.s
    public final boolean N() {
        return this.f8910r1 && K.a < 23;
    }

    @Override // M1.s
    public final float O(float f5, C2393o[] c2393oArr) {
        float fMax = -1.0f;
        for (C2393o c2393o : c2393oArr) {
            float f7 = c2393o.f18121w;
            if (f7 != -1.0f) {
                fMax = Math.max(fMax, f7);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f5;
    }

    @Override // M1.s
    public final ArrayList P(M1.k kVar, C2393o c2393o, boolean z7) {
        List listY0 = y0(this.f8882M0, kVar, c2393o, z7, this.f8910r1);
        HashMap map = M1.z.a;
        ArrayList arrayList = new ArrayList(listY0);
        Collections.sort(arrayList, new M1.u(0, new G(12, c2393o)));
        return arrayList;
    }

    @Override // M1.s
    public final B0.b Q(M1.p pVar, C2393o c2393o, MediaCrypto mediaCrypto, float f5) {
        C2384f c2384f;
        int i7;
        C1.i iVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i8;
        int i9;
        int i10;
        char c2;
        boolean z7;
        Pair pairD;
        int iX0;
        String str = pVar.f6463c;
        C2393o[] c2393oArr = this.f3465t;
        c2393oArr.getClass();
        int iMax = c2393o.f18119u;
        int iZ0 = z0(pVar, c2393o);
        int length = c2393oArr.length;
        float f7 = c2393o.f18121w;
        int i11 = c2393o.f18119u;
        C2384f c2384f2 = c2393o.f18089B;
        int i12 = c2393o.f18120v;
        if (length == 1) {
            if (iZ0 != -1 && (iX0 = x0(pVar, c2393o)) != -1) {
                iZ0 = Math.min((int) (iZ0 * 1.5f), iX0);
            }
            iVar = new C1.i(iMax, i12, iZ0);
            c2384f = c2384f2;
            i7 = i12;
        } else {
            int length2 = c2393oArr.length;
            int iMax2 = i12;
            int i13 = 0;
            boolean z8 = false;
            while (i13 < length2) {
                C2393o c2393o2 = c2393oArr[i13];
                C2393o[] c2393oArr2 = c2393oArr;
                if (c2384f2 != null && c2393o2.f18089B == null) {
                    C2392n c2392nA = c2393o2.a();
                    c2392nA.f18053A = c2384f2;
                    c2393o2 = new C2393o(c2392nA);
                }
                if (pVar.b(c2393o, c2393o2).f3485d != 0) {
                    int i14 = c2393o2.f18120v;
                    i9 = length2;
                    int i15 = c2393o2.f18119u;
                    i10 = i13;
                    c2 = 65535;
                    z8 |= i15 == -1 || i14 == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, i14);
                    iZ0 = Math.max(iZ0, z0(pVar, c2393o2));
                } else {
                    i9 = length2;
                    i10 = i13;
                    c2 = 65535;
                }
                length2 = i9;
                i13 = i10 + 1;
                c2393oArr = c2393oArr2;
            }
            if (z8) {
                AbstractC0015b.v("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z9 = i12 > i11;
                int i16 = z9 ? i12 : i11;
                boolean z10 = z9;
                int i17 = z9 ? i11 : i12;
                float f8 = i17 / i16;
                int[] iArr = f8879A1;
                c2384f = c2384f2;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int i20 = i18;
                    int i21 = (int) (i19 * f8);
                    if (i19 <= i16 || i21 <= i17) {
                        break;
                    }
                    if (!z10) {
                        i21 = i19;
                    }
                    if (!z10) {
                        i19 = i21;
                    }
                    int i22 = i17;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f6464d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i8 = i16;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i8 = i16;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(K.e(i21, widthAlignment) * widthAlignment, K.e(i19, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i7 = i12;
                        if (pVar.g(point.x, point.y, f7)) {
                            break;
                        }
                    } else {
                        i7 = i12;
                    }
                    i18 = i20 + 1;
                    i12 = i7;
                    i17 = i22;
                    i16 = i8;
                }
                i7 = i12;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C2392n c2392nA2 = c2393o.a();
                    c2392nA2.f18081t = iMax;
                    c2392nA2.f18082u = iMax2;
                    iZ0 = Math.max(iZ0, x0(pVar, new C2393o(c2392nA2)));
                    AbstractC0015b.v("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                c2384f = c2384f2;
                i7 = i12;
            }
            iVar = new C1.i(iMax, iMax2, iZ0);
        }
        this.V0 = iVar;
        int i23 = this.f8910r1 ? this.f8911s1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i7);
        AbstractC0015b.u(mediaFormat, c2393o.f18115q);
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        AbstractC0015b.t(mediaFormat, "rotation-degrees", c2393o.f18122x);
        if (c2384f != null) {
            C2384f c2384f3 = c2384f;
            AbstractC0015b.t(mediaFormat, "color-transfer", c2384f3.f18037c);
            AbstractC0015b.t(mediaFormat, "color-standard", c2384f3.a);
            AbstractC0015b.t(mediaFormat, "color-range", c2384f3.f18036b);
            byte[] bArr = c2384f3.f18038d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c2393o.f18112n) && (pairD = M1.z.d(c2393o)) != null) {
            AbstractC0015b.t(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", iVar.a);
        mediaFormat.setInteger("max-height", iVar.f580b);
        AbstractC0015b.t(mediaFormat, "max-input-size", iVar.f581c);
        int i24 = K.a;
        if (i24 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f5 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f5);
            }
        }
        if (this.f8886Q0) {
            z7 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z7 = true;
        }
        if (i23 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z7);
            mediaFormat.setInteger("audio-session-id", i23);
        }
        if (i24 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f8909q1));
        }
        Surface surfaceA0 = A0(pVar);
        if (this.f8893Y0 != null && !K.D(this.f8882M0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return new B0.b(pVar, mediaFormat, c2393o, surfaceA0, mediaCrypto, null);
    }

    @Override // M1.s
    public final void R(G1.f fVar) {
        if (this.f8892X0) {
            ByteBuffer byteBuffer = fVar.f2612r;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b4 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b7 = byteBuffer.get();
                byte b8 = byteBuffer.get();
                byteBuffer.position(0);
                if (b4 == -75 && s7 == 60 && s8 == 1 && b7 == 4) {
                    if (b8 == 0 || b8 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        M1.m mVar = this.f6506U;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.e(bundle);
                    }
                }
            }
        }
    }

    @Override // M1.s
    public final boolean W(C2393o c2393o) throws C0234o {
        l lVar = this.f8893Y0;
        if (lVar == null) {
            return true;
        }
        try {
            lVar.c(c2393o);
            throw null;
        } catch (A e7) {
            throw g(e7, c2393o, false, 7000);
        }
    }

    @Override // M1.s
    public final void X(Exception exc) {
        AbstractC0015b.n("MediaCodecVideoRenderer", "Video codec error", exc);
        J1.j jVar = this.f8884O0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new x(jVar, exc, 5));
        }
    }

    @Override // M1.s
    public final void Y(long j7, long j8, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        J1.j jVar = this.f8884O0;
        Handler handler = jVar.a;
        if (handler != null) {
            str2 = str;
            handler.post(new x(jVar, str2, j7, j8));
        } else {
            str2 = str;
        }
        this.f8891W0 = w0(str2);
        M1.p pVar = this.f6513b0;
        pVar.getClass();
        boolean z7 = false;
        if (K.a >= 29 && "video/x-vnd.on2.vp9".equals(pVar.f6462b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f6464d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i7].profile == 16384) {
                    z7 = true;
                    break;
                }
                i7++;
            }
        }
        this.f8892X0 = z7;
        D0();
    }

    @Override // M1.s
    public final void Z(String str) {
        J1.j jVar = this.f8884O0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new x(jVar, str, 6));
        }
    }

    @Override // M1.s
    public final C0227h a0(F.w wVar) throws C0234o {
        C0227h c0227hA0 = super.a0(wVar);
        C2393o c2393o = (C2393o) wVar.f2038m;
        c2393o.getClass();
        J1.j jVar = this.f8884O0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new x(jVar, c2393o, c0227hA0));
        }
        return c0227hA0;
    }

    @Override // M1.s
    public final void b0(C2393o c2393o, MediaFormat mediaFormat) {
        int integer;
        int i7;
        M1.m mVar = this.f6506U;
        if (mVar != null) {
            mVar.I(this.f8900f1);
        }
        if (this.f8910r1) {
            i7 = c2393o.f18119u;
            integer = c2393o.f18120v;
        } else {
            mediaFormat.getClass();
            boolean z7 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z7 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z7 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i7 = integer2;
        }
        float f5 = c2393o.f18123y;
        int i8 = c2393o.f18122x;
        if (i8 == 90 || i8 == 270) {
            f5 = 1.0f / f5;
            int i9 = integer;
            integer = i7;
            i7 = i9;
        }
        this.f8907o1 = new b0(f5, i7, integer);
        l lVar = this.f8893Y0;
        if (lVar == null || !this.f8916x1) {
            v vVar = this.f8887R0.f8946b;
            vVar.f8969f = c2393o.f18121w;
            e eVar = vVar.a;
            eVar.a.c();
            eVar.f8867b.c();
            eVar.f8868c = false;
            eVar.f8869d = -9223372036854775807L;
            eVar.f8870e = 0;
            vVar.c();
            this.f8916x1 = false;
            return;
        }
        C2392n c2392nA = c2393o.a();
        c2392nA.f18081t = i7;
        c2392nA.f18082u = integer;
        c2392nA.f18085x = f5;
        C2393o c2393o2 = new C2393o(c2392nA);
        List list = this.f8895a1;
        if (list == null) {
            E e7 = j3.G.f12277l;
            list = X.f12304o;
        }
        AbstractC0015b.h(false);
        o oVar = (o) lVar.f8931d;
        oVar.f8933c.getClass();
        D d4 = new D(4);
        d4.c(list);
        d4.c(oVar.f8935e);
        lVar.f8929b = d4.f();
        lVar.f8930c = c2393o2;
        C2392n c2392nA2 = c2393o2.a();
        C2384f c2384f = c2393o2.f18089B;
        if (c2384f == null || !c2384f.d()) {
            c2384f = C2384f.f18035h;
        }
        c2392nA2.f18053A = c2384f;
        c2392nA2.a();
        AbstractC0015b.i(null);
        throw null;
    }

    @Override // H1.AbstractC0225f, H1.g0
    public final void c(int i7, Object obj) throws C0234o {
        if (i7 == 1) {
            F0(obj);
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            q qVar = (q) obj;
            this.f8913u1 = qVar;
            l lVar = this.f8893Y0;
            if (lVar != null) {
                lVar.j(qVar);
                return;
            }
            return;
        }
        if (i7 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.f8911s1 != iIntValue) {
                this.f8911s1 = iIntValue;
                if (this.f8910r1) {
                    j0();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.f8900f1 = iIntValue2;
            M1.m mVar = this.f6506U;
            if (mVar != null) {
                mVar.I(iIntValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.f8901g1 = iIntValue3;
            l lVar2 = this.f8893Y0;
            if (lVar2 != null) {
                lVar2.e(iIntValue3);
                return;
            }
            v vVar = this.f8887R0.f8946b;
            if (vVar.f8973j == iIntValue3) {
                return;
            }
            vVar.f8973j = iIntValue3;
            vVar.d(true);
            return;
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f8895a1 = list;
            l lVar3 = this.f8893Y0;
            if (lVar3 != null) {
                lVar3.i(list);
                return;
            }
            return;
        }
        if (i7 == 14) {
            obj.getClass();
            C c2 = (C) obj;
            if (c2.a == 0 || c2.f291b == 0) {
                return;
            }
            this.f8898d1 = c2;
            l lVar4 = this.f8893Y0;
            if (lVar4 != null) {
                Surface surface = this.f8896b1;
                AbstractC0015b.i(surface);
                lVar4.f(surface, c2);
                return;
            }
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.f8909q1 = ((Integer) obj).intValue();
            M1.m mVar2 = this.f6506U;
            if (mVar2 != null && K.a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f8909q1));
                mVar2.e(bundle);
                return;
            }
            return;
        }
        if (i7 == 17) {
            Surface surface2 = this.f8896b1;
            F0(null);
            obj.getClass();
            ((i) obj).c(1, surface2);
            return;
        }
        if (i7 == 11) {
            H h7 = (H) obj;
            h7.getClass();
            this.f6501P = h7;
        }
    }

    @Override // M1.s
    public final void d0(long j7) {
        super.d0(j7);
        if (this.f8910r1) {
            return;
        }
        this.f8904k1--;
    }

    @Override // M1.s
    public final void e0() {
        l lVar = this.f8893Y0;
        if (lVar != null) {
            lVar.k();
            this.f8893Y0.h(this.f6493I0.f6475b, -this.f8914v1);
        } else {
            this.f8887R0.d(2);
        }
        this.f8916x1 = true;
        D0();
    }

    @Override // M1.s
    public final void f0(G1.f fVar) {
        Surface surface;
        this.f8918z1 = 0;
        boolean z7 = this.f8910r1;
        if (!z7) {
            this.f8904k1++;
        }
        if (K.a >= 23 || !z7) {
            return;
        }
        long j7 = fVar.f2611q;
        v0(j7);
        b0 b0Var = this.f8907o1;
        boolean zEquals = b0Var.equals(b0.f18027d);
        J1.j jVar = this.f8884O0;
        if (!zEquals && !b0Var.equals(this.f8908p1)) {
            this.f8908p1 = b0Var;
            jVar.b(b0Var);
        }
        this.f6492H0.f3475e++;
        s sVar = this.f8887R0;
        boolean z8 = sVar.f8949e != 3;
        sVar.f8949e = 3;
        sVar.f8956l.getClass();
        sVar.f8951g = K.F(SystemClock.elapsedRealtime());
        if (z8 && (surface = this.f8896b1) != null) {
            Handler handler = jVar.a;
            if (handler != null) {
                handler.post(new y(jVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f8899e1 = true;
        }
        d0(j7);
    }

    @Override // H1.AbstractC0225f
    public final void h() {
        l lVar = this.f8893Y0;
        if (lVar != null) {
            s sVar = ((o) lVar.f8931d).f8936f.a;
            if (sVar.f8949e == 0) {
                sVar.f8949e = 1;
                return;
            }
            return;
        }
        s sVar2 = this.f8887R0;
        if (sVar2.f8949e == 0) {
            sVar2.f8949e = 1;
        }
    }

    @Override // M1.s
    public final boolean h0(long j7, long j8, M1.m mVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j9, boolean z7, boolean z8, C2393o c2393o) {
        mVar.getClass();
        long j10 = j9 - this.f6493I0.f6476c;
        int i10 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f8890U0;
            Long l7 = (Long) priorityQueue.peek();
            if (l7 == null || l7.longValue() >= j9) {
                break;
            }
            i10++;
            priorityQueue.poll();
        }
        J0(i10, 0);
        l lVar = this.f8893Y0;
        if (lVar == null) {
            int iA = this.f8887R0.a(j9, j7, j8, this.f6493I0.f6475b, z7, z8, this.f8888S0);
            r rVar = this.f8888S0;
            if (iA == 0) {
                this.f3462q.getClass();
                long jNanoTime = System.nanoTime();
                q qVar = this.f8913u1;
                if (qVar != null) {
                    qVar.a(j10, jNanoTime, c2393o, this.f6508W);
                }
                E0(mVar, i7, jNanoTime);
                K0(rVar.a);
                return true;
            }
            if (iA == 1) {
                long j11 = rVar.f8945b;
                long j12 = rVar.a;
                if (j11 == this.f8906n1) {
                    I0(mVar, i7);
                } else {
                    q qVar2 = this.f8913u1;
                    if (qVar2 != null) {
                        qVar2.a(j10, j11, c2393o, this.f6508W);
                    }
                    E0(mVar, i7, j11);
                }
                K0(j12);
                this.f8906n1 = j11;
                return true;
            }
            if (iA == 2) {
                Trace.beginSection("dropVideoBuffer");
                mVar.o(i7);
                Trace.endSection();
                J0(0, 1);
                K0(rVar.a);
                return true;
            }
            if (iA == 3) {
                I0(mVar, i7);
                K0(rVar.a);
                return true;
            }
            if (iA != 4 && iA != 5) {
                throw new IllegalStateException(String.valueOf(iA));
            }
        } else {
            if (z7 && !z8) {
                I0(mVar, i7);
                return true;
            }
            AbstractC0015b.h(false);
            int i11 = ((o) lVar.f8931d).f8944n;
            if (i11 != -1 && i11 == 0) {
                AbstractC0015b.i(null);
                throw null;
            }
        }
        return false;
    }

    @Override // H1.AbstractC0225f
    public final String j() {
        return "MediaCodecVideoRenderer";
    }

    @Override // M1.s
    public final void k0() {
        l lVar = this.f8893Y0;
        if (lVar != null) {
            lVar.k();
        }
    }

    @Override // H1.AbstractC0225f
    public final boolean l() {
        return this.f6484D0 && this.f8893Y0 == null;
    }

    @Override // M1.s
    public final void l0() {
        super.l0();
        this.f8890U0.clear();
        this.f8917y1 = false;
        this.f8904k1 = 0;
        this.f8918z1 = 0;
    }

    @Override // M1.s, H1.AbstractC0225f
    public final boolean n() {
        boolean zN = super.n();
        l lVar = this.f8893Y0;
        if (lVar != null) {
            return ((o) lVar.f8931d).f8936f.a.b(false);
        }
        if (zN && (this.f6506U == null || this.f8910r1)) {
            return true;
        }
        return this.f8887R0.b(zN);
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void o() {
        J1.j jVar = this.f8884O0;
        this.f8908p1 = null;
        this.f8915w1 = -9223372036854775807L;
        l lVar = this.f8893Y0;
        if (lVar != null) {
            ((o) lVar.f8931d).f8936f.a.d(0);
        } else {
            this.f8887R0.d(0);
        }
        D0();
        this.f8899e1 = false;
        this.f8912t1 = null;
        try {
            super.o();
            C0226g c0226g = this.f6492H0;
            jVar.getClass();
            synchronized (c0226g) {
            }
            Handler handler = jVar.a;
            if (handler != null) {
                handler.post(new RunnableC0016c(17, jVar, c0226g));
            }
            jVar.b(b0.f18027d);
        } catch (Throwable th) {
            C0226g c0226g2 = this.f6492H0;
            jVar.getClass();
            synchronized (c0226g2) {
                Handler handler2 = jVar.a;
                if (handler2 != null) {
                    handler2.post(new RunnableC0016c(17, jVar, c0226g2));
                }
                jVar.b(b0.f18027d);
                throw th;
            }
        }
    }

    @Override // H1.AbstractC0225f
    public final void p(boolean z7, boolean z8) {
        this.f6492H0 = new C0226g();
        k0 k0Var = this.f3459n;
        k0Var.getClass();
        boolean z9 = k0Var.f3528b;
        AbstractC0015b.h((z9 && this.f8911s1 == 0) ? false : true);
        if (this.f8910r1 != z9) {
            this.f8910r1 = z9;
            j0();
        }
        C0226g c0226g = this.f6492H0;
        J1.j jVar = this.f8884O0;
        Handler handler = jVar.a;
        if (handler != null) {
            handler.post(new x(jVar, c0226g, 2));
        }
        boolean z10 = this.f8894Z0;
        s sVar = this.f8887R0;
        if (!z10) {
            if (this.f8895a1 != null && this.f8893Y0 == null) {
                I2.a aVar = new I2.a(this.f8882M0, sVar);
                B1.D d4 = this.f3462q;
                d4.getClass();
                aVar.f4010h = d4;
                AbstractC0015b.h(!aVar.a);
                if (((n) aVar.f4007e) == null) {
                    if (((m) aVar.f4006d) == null) {
                        aVar.f4006d = new m();
                    }
                    aVar.f4007e = new n((m) aVar.f4006d);
                }
                o oVar = new o(aVar);
                aVar.a = true;
                oVar.f8944n = 1;
                SparseArray sparseArray = oVar.f8934d;
                AbstractC0015b.h(!K.j(sparseArray, 0));
                l lVar = new l(oVar, oVar.a);
                oVar.f8938h.add(lVar);
                sparseArray.put(0, lVar);
                this.f8893Y0 = lVar;
            }
            this.f8894Z0 = true;
        }
        l lVar2 = this.f8893Y0;
        if (lVar2 == null) {
            B1.D d6 = this.f3462q;
            d6.getClass();
            sVar.f8956l = d6;
            sVar.f8949e = z8 ? 1 : 0;
            return;
        }
        q qVar = this.f8913u1;
        if (qVar != null) {
            lVar2.j(qVar);
        }
        if (this.f8896b1 != null && !this.f8898d1.equals(C.f290c)) {
            this.f8893Y0.f(this.f8896b1, this.f8898d1);
        }
        this.f8893Y0.e(this.f8901g1);
        this.f8893Y0.g(this.f6504S);
        List list = this.f8895a1;
        if (list != null) {
            this.f8893Y0.i(list);
        }
        l lVar3 = this.f8893Y0;
        ((o) lVar3.f8931d).f8936f.a.f8949e = z8 ? 1 : 0;
        if (this.f6501P != null) {
            lVar3.getClass();
        }
    }

    @Override // M1.s
    public final boolean p0(G1.f fVar) {
        if (!k() && !fVar.c(536870912)) {
            long j7 = this.f8915w1;
            if (j7 != -9223372036854775807L && j7 - (fVar.f2611q - this.f6493I0.f6476c) > 100000 && !fVar.c(1073741824)) {
                boolean z7 = fVar.f2611q < this.f3467v;
                if ((z7 || this.f8917y1) && !fVar.c(268435456)) {
                    boolean zC = fVar.c(67108864);
                    PriorityQueue priorityQueue = this.f8890U0;
                    if (zC) {
                        fVar.f();
                        if (z7) {
                            this.f6492H0.f3474d++;
                            return true;
                        }
                        if (this.f8917y1) {
                            priorityQueue.add(Long.valueOf(fVar.f2611q));
                            this.f8918z1++;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void q(long j7, boolean z7) throws C0234o {
        l lVar = this.f8893Y0;
        if (lVar != null) {
            if (!z7) {
                lVar.b(true);
            }
            this.f8893Y0.h(this.f6493I0.f6475b, -this.f8914v1);
            this.f8916x1 = true;
        }
        super.q(j7, z7);
        l lVar2 = this.f8893Y0;
        s sVar = this.f8887R0;
        if (lVar2 == null) {
            v vVar = sVar.f8946b;
            vVar.f8976m = 0L;
            vVar.f8979p = -1L;
            vVar.f8977n = -1L;
            sVar.f8952h = -9223372036854775807L;
            sVar.f8950f = -9223372036854775807L;
            sVar.d(1);
            sVar.f8953i = -9223372036854775807L;
        }
        if (z7) {
            l lVar3 = this.f8893Y0;
            if (lVar3 != null) {
                ((o) lVar3.f8931d).f8936f.a.c(false);
            } else {
                sVar.c(false);
            }
        }
        D0();
        this.f8903j1 = 0;
    }

    @Override // M1.s
    public final boolean q0(M1.p pVar) {
        return B0(pVar);
    }

    @Override // H1.AbstractC0225f
    public final void r() {
        l lVar = this.f8893Y0;
        if (lVar == null || !this.f8883N0) {
            return;
        }
        o oVar = (o) lVar.f8931d;
        if (oVar.f8941k == 2) {
            return;
        }
        F f5 = oVar.f8939i;
        if (f5 != null) {
            f5.a.removeCallbacksAndMessages(null);
        }
        oVar.f8940j = null;
        oVar.f8941k = 2;
    }

    @Override // H1.AbstractC0225f
    public final void s() {
        try {
            try {
                F();
                j0();
                C0034g c0034g = this.f6500O;
                if (c0034g != null) {
                    c0034g.s(null);
                }
                this.f6500O = null;
            } catch (Throwable th) {
                C0034g c0034g2 = this.f6500O;
                if (c0034g2 != null) {
                    c0034g2.s(null);
                }
                this.f6500O = null;
                throw th;
            }
        } finally {
            this.f8894Z0 = false;
            this.f8914v1 = -9223372036854775807L;
            k kVar = this.f8897c1;
            if (kVar != null) {
                kVar.release();
                this.f8897c1 = null;
            }
        }
    }

    @Override // M1.s
    public final int s0(M1.k kVar, C2393o c2393o) {
        boolean z7;
        int i7 = 0;
        if (!y1.D.l(c2393o.f18112n)) {
            return AbstractC0225f.f(0, 0, 0, 0);
        }
        boolean z8 = c2393o.f18116r != null;
        Context context = this.f8882M0;
        List listY0 = y0(context, kVar, c2393o, z8, false);
        if (z8 && listY0.isEmpty()) {
            listY0 = y0(context, kVar, c2393o, false, false);
        }
        if (listY0.isEmpty()) {
            return AbstractC0225f.f(1, 0, 0, 0);
        }
        int i8 = c2393o.f18098M;
        if (i8 != 0 && i8 != 2) {
            return AbstractC0225f.f(2, 0, 0, 0);
        }
        M1.p pVar = (M1.p) listY0.get(0);
        boolean zE = pVar.e(c2393o);
        if (zE) {
            z7 = true;
        } else {
            for (int i9 = 1; i9 < listY0.size(); i9++) {
                M1.p pVar2 = (M1.p) listY0.get(i9);
                if (pVar2.e(c2393o)) {
                    zE = true;
                    z7 = false;
                    pVar = pVar2;
                    break;
                }
            }
            z7 = true;
        }
        int i10 = zE ? 4 : 3;
        int i11 = pVar.f(c2393o) ? 16 : 8;
        int i12 = pVar.f6467g ? 64 : 0;
        int i13 = z7 ? 128 : 0;
        if (K.a >= 26 && "video/dolby-vision".equals(c2393o.f18112n) && !z1.c.p(context)) {
            i13 = 256;
        }
        if (zE) {
            List listY02 = y0(context, kVar, c2393o, z8, true);
            if (!listY02.isEmpty()) {
                HashMap map = M1.z.a;
                ArrayList arrayList = new ArrayList(listY02);
                Collections.sort(arrayList, new M1.u(i7, new G(12, c2393o)));
                M1.p pVar3 = (M1.p) arrayList.get(0);
                if (pVar3.e(c2393o) && pVar3.f(c2393o)) {
                    i7 = 32;
                }
            }
        }
        return i10 | i11 | i7 | i12 | i13;
    }

    @Override // H1.AbstractC0225f
    public final void t() {
        this.f8902i1 = 0;
        this.f3462q.getClass();
        this.h1 = SystemClock.elapsedRealtime();
        this.l1 = 0L;
        this.f8905m1 = 0;
        l lVar = this.f8893Y0;
        if (lVar != null) {
            ((o) lVar.f8931d).f8936f.a.e();
        } else {
            this.f8887R0.e();
        }
    }

    @Override // H1.AbstractC0225f
    public final void u() {
        C0();
        int i7 = this.f8905m1;
        if (i7 != 0) {
            long j7 = this.l1;
            J1.j jVar = this.f8884O0;
            Handler handler = jVar.a;
            if (handler != null) {
                handler.post(new x(jVar, j7, i7));
            }
            this.l1 = 0L;
            this.f8905m1 = 0;
        }
        l lVar = this.f8893Y0;
        if (lVar != null) {
            ((o) lVar.f8931d).f8936f.a.f();
        } else {
            this.f8887R0.f();
        }
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void v(C2393o[] c2393oArr, long j7, long j8, B b4) {
        super.v(c2393oArr, j7, j8, b4);
        if (this.f8914v1 == -9223372036854775807L) {
            this.f8914v1 = j7;
        }
        P p7 = this.f3471z;
        if (p7.p()) {
            this.f8915w1 = -9223372036854775807L;
            return;
        }
        b4.getClass();
        this.f8915w1 = p7.g(b4.a, new N()).f17949d;
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void x(long j7, long j8) throws MediaCryptoException, A, C0234o {
        l lVar = this.f8893Y0;
        if (lVar != null) {
            try {
                c cVar = ((o) lVar.f8931d).f8936f;
                cVar.getClass();
                try {
                    cVar.f8853c.a(j7, j8);
                } catch (C0234o e7) {
                    throw new A(e7, cVar.f8855e);
                }
            } catch (A e8) {
                throw g(e8, e8.f8849k, false, 7001);
            }
        }
        super.x(j7, j8);
    }

    @Override // M1.s, H1.AbstractC0225f
    public final void z(float f5, float f7) throws C0234o {
        super.z(f5, f7);
        l lVar = this.f8893Y0;
        if (lVar != null) {
            lVar.g(f5);
        } else {
            this.f8887R0.g(f5);
        }
    }
}
