package H1;

import B1.AbstractC0015b;
import B1.C0017d;
import B1.C0020g;
import B1.RunnableC0016c;
import C2.C0028a;
import C2.C0034g;
import android.content.Context;
import android.graphics.Rect;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import y1.AbstractC2402y;
import y1.C2381c;
import y1.C2386h;
import y1.C2391m;
import y1.C2401x;
import y1.C2403z;

/* loaded from: classes.dex */
public final class G extends Q4.c implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    public final boolean f3218A;

    /* renamed from: B, reason: collision with root package name */
    public final I1.f f3219B;

    /* renamed from: C, reason: collision with root package name */
    public final Looper f3220C;

    /* renamed from: D, reason: collision with root package name */
    public final R1.e f3221D;

    /* renamed from: E, reason: collision with root package name */
    public final long f3222E;

    /* renamed from: F, reason: collision with root package name */
    public final long f3223F;

    /* renamed from: G, reason: collision with root package name */
    public final long f3224G;

    /* renamed from: H, reason: collision with root package name */
    public final B1.D f3225H;
    public final D I;
    public final E J;

    /* renamed from: K, reason: collision with root package name */
    public final C0221b f3226K;

    /* renamed from: L, reason: collision with root package name */
    public final C0020g f3227L;

    /* renamed from: M, reason: collision with root package name */
    public final C0020g f3228M;

    /* renamed from: N, reason: collision with root package name */
    public final long f3229N;

    /* renamed from: O, reason: collision with root package name */
    public final C0017d f3230O;

    /* renamed from: P, reason: collision with root package name */
    public int f3231P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3232Q;

    /* renamed from: R, reason: collision with root package name */
    public int f3233R;

    /* renamed from: S, reason: collision with root package name */
    public int f3234S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3235T;

    /* renamed from: U, reason: collision with root package name */
    public final m0 f3236U;

    /* renamed from: V, reason: collision with root package name */
    public O1.c0 f3237V;

    /* renamed from: W, reason: collision with root package name */
    public final C0237s f3238W;

    /* renamed from: X, reason: collision with root package name */
    public y1.H f3239X;

    /* renamed from: Y, reason: collision with root package name */
    public y1.A f3240Y;

    /* renamed from: Z, reason: collision with root package name */
    public Object f3241Z;

    /* renamed from: a0, reason: collision with root package name */
    public Surface f3242a0;

    /* renamed from: b0, reason: collision with root package name */
    public SurfaceHolder f3243b0;

    /* renamed from: c0, reason: collision with root package name */
    public U1.k f3244c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f3245d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextureView f3246e0;

    /* renamed from: f0, reason: collision with root package name */
    public final int f3247f0;

    /* renamed from: g0, reason: collision with root package name */
    public B1.C f3248g0;

    /* renamed from: h0, reason: collision with root package name */
    public final C2381c f3249h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f3250i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f3251j0;

    /* renamed from: k0, reason: collision with root package name */
    public A1.c f3252k0;

    /* renamed from: l, reason: collision with root package name */
    public final Q1.u f3253l;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f3254l0;

    /* renamed from: m, reason: collision with root package name */
    public final y1.H f3255m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f3256m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0020g f3257n;

    /* renamed from: n0, reason: collision with root package name */
    public final int f3258n0;

    /* renamed from: o, reason: collision with root package name */
    public final Context f3259o;

    /* renamed from: o0, reason: collision with root package name */
    public y1.b0 f3260o0;

    /* renamed from: p, reason: collision with root package name */
    public final G f3261p;

    /* renamed from: p0, reason: collision with root package name */
    public y1.A f3262p0;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC0225f[] f3263q;

    /* renamed from: q0, reason: collision with root package name */
    public d0 f3264q0;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC0225f[] f3265r;

    /* renamed from: r0, reason: collision with root package name */
    public int f3266r0;

    /* renamed from: s, reason: collision with root package name */
    public final Q1.t f3267s;

    /* renamed from: s0, reason: collision with root package name */
    public long f3268s0;

    /* renamed from: t, reason: collision with root package name */
    public final B1.F f3269t;

    /* renamed from: u, reason: collision with root package name */
    public final C0242x f3270u;

    /* renamed from: v, reason: collision with root package name */
    public final L f3271v;

    /* renamed from: w, reason: collision with root package name */
    public final B1.q f3272w;

    /* renamed from: x, reason: collision with root package name */
    public final CopyOnWriteArraySet f3273x;

    /* renamed from: y, reason: collision with root package name */
    public final y1.N f3274y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f3275z;

    static {
        AbstractC2402y.a("media3.exoplayer");
    }

    public G(r rVar) {
        super(7);
        this.f3257n = new C0020g();
        try {
            AbstractC0015b.q("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.1] [" + B1.K.f301b + "]");
            Context context = rVar.a;
            Looper looper = rVar.f3564h;
            this.f3259o = context.getApplicationContext();
            B1.D d4 = rVar.f3558b;
            this.f3219B = new I1.f(d4);
            this.f3258n0 = rVar.f3565i;
            this.f3249h0 = rVar.f3566j;
            this.f3247f0 = rVar.f3567k;
            this.f3251j0 = false;
            this.f3229N = rVar.f3575s;
            D d6 = new D(this);
            this.I = d6;
            this.J = new E();
            AbstractC0225f[] abstractC0225fArrA = ((C0232m) rVar.f3559c.get()).a(new Handler(looper), d6, d6, d6, d6);
            this.f3263q = abstractC0225fArrA;
            AbstractC0015b.h(abstractC0225fArrA.length > 0);
            this.f3265r = new AbstractC0225f[abstractC0225fArrA.length];
            int i7 = 0;
            while (true) {
                AbstractC0225f[] abstractC0225fArr = this.f3265r;
                if (i7 >= abstractC0225fArr.length) {
                    break;
                }
                int i8 = this.f3263q[i7].f3457l;
                abstractC0225fArr[i7] = null;
                i7++;
            }
            this.f3267s = (Q1.t) rVar.f3561e.get();
            rVar.f3560d.get();
            this.f3221D = (R1.e) rVar.f3563g.get();
            this.f3218A = rVar.f3568l;
            this.f3236U = rVar.f3569m;
            this.f3222E = rVar.f3570n;
            this.f3223F = rVar.f3571o;
            this.f3224G = rVar.f3572p;
            this.f3220C = looper;
            this.f3225H = d4;
            this.f3261p = this;
            this.f3272w = new B1.q(looper, d4, new C0242x(this));
            this.f3273x = new CopyOnWriteArraySet();
            this.f3275z = new ArrayList();
            this.f3237V = new O1.c0();
            this.f3238W = C0237s.a;
            AbstractC0225f[] abstractC0225fArr2 = this.f3263q;
            this.f3253l = new Q1.u(new k0[abstractC0225fArr2.length], new Q1.s[abstractC0225fArr2.length], y1.X.f18016b, null);
            this.f3274y = new y1.N();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i9 = 0; i9 < 20; i9++) {
                int i10 = iArr[i9];
                AbstractC0015b.h(!false);
                sparseBooleanArray.append(i10, true);
            }
            this.f3267s.getClass();
            AbstractC0015b.h(!false);
            sparseBooleanArray.append(29, true);
            AbstractC0015b.h(!false);
            C2391m c2391m = new C2391m(sparseBooleanArray);
            this.f3255m = new y1.H(c2391m);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i11 = 0; i11 < c2391m.a.size(); i11++) {
                int iA = c2391m.a(i11);
                AbstractC0015b.h(!false);
                sparseBooleanArray2.append(iA, true);
            }
            AbstractC0015b.h(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC0015b.h(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC0015b.h(!false);
            this.f3239X = new y1.H(new C2391m(sparseBooleanArray2));
            this.f3269t = this.f3225H.a(this.f3220C, null);
            C0242x c0242x = new C0242x(this);
            this.f3270u = c0242x;
            this.f3264q0 = d0.j(this.f3253l);
            this.f3219B.N(this.f3261p, this.f3220C);
            final I1.l lVar = new I1.l(rVar.f3578v);
            L l7 = new L(this.f3259o, this.f3263q, this.f3265r, this.f3267s, this.f3253l, (C0230k) rVar.f3562f.get(), this.f3221D, this.f3231P, this.f3232Q, this.f3219B, this.f3236U, rVar.f3573q, rVar.f3574r, this.f3220C, this.f3225H, c0242x, lVar, this.f3238W);
            this.f3271v = l7;
            Looper looper2 = l7.f3330t;
            this.f3250i0 = 1.0f;
            this.f3231P = 0;
            y1.A a = y1.A.f17903B;
            this.f3240Y = a;
            this.f3262p0 = a;
            this.f3266r0 = -1;
            this.f3252k0 = A1.c.f87b;
            this.f3254l0 = true;
            I1.f fVar = this.f3219B;
            fVar.getClass();
            this.f3272w.a(fVar);
            R1.e eVar = this.f3221D;
            Handler handler = new Handler(this.f3220C);
            I1.f fVar2 = this.f3219B;
            R1.h hVar = (R1.h) eVar;
            hVar.getClass();
            fVar2.getClass();
            R1.d dVar = hVar.f8051c;
            dVar.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = dVar.a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                R1.c cVar = (R1.c) it.next();
                if (cVar.f8036b == fVar2) {
                    cVar.f8037c = true;
                    copyOnWriteArrayList.remove(cVar);
                }
            }
            copyOnWriteArrayList.add(new R1.c(handler, fVar2));
            this.f3273x.add(this.I);
            if (B1.K.a >= 31) {
                final Context context2 = this.f3259o;
                final boolean z7 = rVar.f3576t;
                this.f3225H.a(l7.f3330t, null).c(new Runnable() { // from class: H1.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        boolean z8 = z7;
                        G g4 = this;
                        I1.l lVar2 = lVar;
                        MediaMetricsManager mediaMetricsManagerB = B1.t.b(context3.getSystemService("media_metrics"));
                        I1.k kVar = mediaMetricsManagerB == null ? null : new I1.k(context3, mediaMetricsManagerB.createPlaybackSession());
                        if (kVar == null) {
                            AbstractC0015b.v("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z8) {
                            g4.getClass();
                            I1.f fVar3 = g4.f3219B;
                            fVar3.getClass();
                            fVar3.f3957f.a(kVar);
                        }
                        LogSessionId sessionId = kVar.f3979d.getSessionId();
                        synchronized (lVar2) {
                            C0034g c0034g = lVar2.f4002b;
                            c0034g.getClass();
                            LogSessionId logSessionId = (LogSessionId) c0034g.f741l;
                            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                            AbstractC0015b.h(logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE));
                            c0034g.f741l = sessionId;
                        }
                    }
                });
            }
            C0017d c0017d = new C0017d((Object) 0, looper2, this.f3220C, this.f3225H, new C0242x(this));
            this.f3230O = c0017d;
            ((B1.F) c0017d.f318l).c(new B1.w(6, this));
            C0221b c0221b = new C0221b(rVar.a, looper2, rVar.f3564h, this.I, this.f3225H);
            this.f3226K = c0221b;
            c0221b.e();
            this.f3227L = new C0020g(context, looper2, this.f3225H, 2);
            this.f3228M = new C0020g(context, looper2, this.f3225H, 3);
            int i12 = C2386h.f18042c;
            this.f3260o0 = y1.b0.f18027d;
            this.f3248g0 = B1.C.f290c;
            C2381c c2381c = this.f3249h0;
            B1.F f5 = l7.f3328r;
            f5.getClass();
            B1.E eB = B1.F.b();
            eB.a = f5.a.obtainMessage(31, 0, 0, c2381c);
            eB.b();
            k1(1, 3, this.f3249h0);
            k1(2, 4, Integer.valueOf(this.f3247f0));
            k1(2, 5, 0);
            k1(1, 9, Boolean.valueOf(this.f3251j0));
            k1(2, 7, this.J);
            k1(6, 8, this.J);
            k1(-1, 16, Integer.valueOf(this.f3258n0));
            this.f3257n.d();
        } catch (Throwable th) {
            this.f3257n.d();
            throw th;
        }
    }

    public static long a1(d0 d0Var) {
        y1.O o7 = new y1.O();
        y1.N n7 = new y1.N();
        d0Var.a.g(d0Var.f3426b.a, n7);
        long j7 = d0Var.f3427c;
        if (j7 != -9223372036854775807L) {
            return n7.f17950e + j7;
        }
        return d0Var.a.m(n7.f17948c, o7, 0L).f17964k;
    }

    public static d0 d1(d0 d0Var, int i7) {
        d0 d0VarH = d0Var.h(i7);
        return (i7 == 1 || i7 == 4) ? d0VarH.b(false) : d0VarH;
    }

    @Override // Q4.c
    public final void C0(int i7, long j7, boolean z7) {
        u1();
        if (i7 == -1) {
            return;
        }
        AbstractC0015b.c(i7 >= 0);
        y1.P p7 = this.f3264q0.a;
        if (p7.p() || i7 < p7.o()) {
            I1.f fVar = this.f3219B;
            if (!fVar.f3960i) {
                I1.a aVarH = fVar.H();
                fVar.f3960i = true;
                fVar.M(aVarH, -1, new C0028a(29));
            }
            this.f3233R++;
            if (c1()) {
                AbstractC0015b.v("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C2.y yVar = new C2.y(this.f3264q0);
                yVar.f(1);
                G g4 = this.f3270u.f3589k;
                g4.f3269t.c(new RunnableC0016c(4, g4, yVar));
                return;
            }
            d0 d0VarH = this.f3264q0;
            int i8 = d0VarH.f3429e;
            if (i8 == 3 || (i8 == 4 && !p7.p())) {
                d0VarH = this.f3264q0.h(2);
            }
            int iR0 = R0();
            d0 d0VarE1 = e1(d0VarH, p7, f1(p7, i7, j7));
            this.f3271v.f3328r.a(3, new K(p7, i7, B1.K.F(j7))).b();
            s1(d0VarE1, 0, true, 1, T0(d0VarE1), iR0, z7);
        }
    }

    public final y1.A L0() {
        y1.P pU0 = U0();
        if (pU0.p()) {
            return this.f3262p0;
        }
        C2401x c2401x = pU0.m(R0(), (y1.O) this.f8011k, 0L).f17956c;
        C2403z c2403zA = this.f3262p0.a();
        y1.A a = c2401x.f18140d;
        if (a != null) {
            CharSequence charSequence = a.a;
            if (charSequence != null) {
                c2403zA.a = charSequence;
            }
            CharSequence charSequence2 = a.f17905b;
            if (charSequence2 != null) {
                c2403zA.f18144b = charSequence2;
            }
            CharSequence charSequence3 = a.f17906c;
            if (charSequence3 != null) {
                c2403zA.f18145c = charSequence3;
            }
            CharSequence charSequence4 = a.f17907d;
            if (charSequence4 != null) {
                c2403zA.f18146d = charSequence4;
            }
            CharSequence charSequence5 = a.f17908e;
            if (charSequence5 != null) {
                c2403zA.f18147e = charSequence5;
            }
            byte[] bArr = a.f17909f;
            if (bArr != null) {
                c2403zA.f18148f = bArr == null ? null : (byte[]) bArr.clone();
                c2403zA.f18149g = a.f17910g;
            }
            Integer num = a.f17911h;
            if (num != null) {
                c2403zA.f18150h = num;
            }
            Integer num2 = a.f17912i;
            if (num2 != null) {
                c2403zA.f18151i = num2;
            }
            Integer num3 = a.f17913j;
            if (num3 != null) {
                c2403zA.f18152j = num3;
            }
            Boolean bool = a.f17914k;
            if (bool != null) {
                c2403zA.f18153k = bool;
            }
            Integer num4 = a.f17915l;
            if (num4 != null) {
                c2403zA.f18154l = num4;
            }
            Integer num5 = a.f17916m;
            if (num5 != null) {
                c2403zA.f18154l = num5;
            }
            Integer num6 = a.f17917n;
            if (num6 != null) {
                c2403zA.f18155m = num6;
            }
            Integer num7 = a.f17918o;
            if (num7 != null) {
                c2403zA.f18156n = num7;
            }
            Integer num8 = a.f17919p;
            if (num8 != null) {
                c2403zA.f18157o = num8;
            }
            Integer num9 = a.f17920q;
            if (num9 != null) {
                c2403zA.f18158p = num9;
            }
            Integer num10 = a.f17921r;
            if (num10 != null) {
                c2403zA.f18159q = num10;
            }
            CharSequence charSequence6 = a.f17922s;
            if (charSequence6 != null) {
                c2403zA.f18160r = charSequence6;
            }
            CharSequence charSequence7 = a.f17923t;
            if (charSequence7 != null) {
                c2403zA.f18161s = charSequence7;
            }
            CharSequence charSequence8 = a.f17924u;
            if (charSequence8 != null) {
                c2403zA.f18162t = charSequence8;
            }
            Integer num11 = a.f17925v;
            if (num11 != null) {
                c2403zA.f18163u = num11;
            }
            Integer num12 = a.f17926w;
            if (num12 != null) {
                c2403zA.f18164v = num12;
            }
            CharSequence charSequence9 = a.f17927x;
            if (charSequence9 != null) {
                c2403zA.f18165w = charSequence9;
            }
            CharSequence charSequence10 = a.f17928y;
            if (charSequence10 != null) {
                c2403zA.f18166x = charSequence10;
            }
            Integer num13 = a.f17929z;
            if (num13 != null) {
                c2403zA.f18167y = num13;
            }
            j3.G g4 = a.f17904A;
            if (!g4.isEmpty()) {
                c2403zA.f18168z = j3.G.s(g4);
            }
        }
        return new y1.A(c2403zA);
    }

    public final void M0() {
        u1();
        j1();
        p1(null);
        g1(0, 0);
    }

    public final h0 N0(g0 g0Var) {
        int iW0 = W0(this.f3264q0);
        y1.P p7 = this.f3264q0.a;
        if (iW0 == -1) {
            iW0 = 0;
        }
        L l7 = this.f3271v;
        return new h0(l7, g0Var, p7, iW0, l7.f3330t);
    }

    public final long O0(d0 d0Var) {
        if (!d0Var.f3426b.b()) {
            return B1.K.P(T0(d0Var));
        }
        Object obj = d0Var.f3426b.a;
        y1.P p7 = d0Var.a;
        y1.N n7 = this.f3274y;
        p7.g(obj, n7);
        long j7 = d0Var.f3427c;
        if (j7 == -9223372036854775807L) {
            return B1.K.P(p7.m(W0(d0Var), (y1.O) this.f8011k, 0L).f17964k);
        }
        return B1.K.P(j7) + B1.K.P(n7.f17950e);
    }

    public final int P0() {
        u1();
        if (c1()) {
            return this.f3264q0.f3426b.f7252b;
        }
        return -1;
    }

    public final int Q0() {
        u1();
        if (c1()) {
            return this.f3264q0.f3426b.f7253c;
        }
        return -1;
    }

    public final int R0() {
        u1();
        int iW0 = W0(this.f3264q0);
        if (iW0 == -1) {
            return 0;
        }
        return iW0;
    }

    public final long S0() {
        u1();
        return B1.K.P(T0(this.f3264q0));
    }

    public final long T0(d0 d0Var) {
        if (d0Var.a.p()) {
            return B1.K.F(this.f3268s0);
        }
        long jK = d0Var.f3440p ? d0Var.k() : d0Var.f3443s;
        if (d0Var.f3426b.b()) {
            return jK;
        }
        y1.P p7 = d0Var.a;
        Object obj = d0Var.f3426b.a;
        y1.N n7 = this.f3274y;
        p7.g(obj, n7);
        return jK + n7.f17950e;
    }

    public final y1.P U0() {
        u1();
        return this.f3264q0.a;
    }

    public final y1.X V0() {
        u1();
        return this.f3264q0.f3433i.f7942d;
    }

    public final int W0(d0 d0Var) {
        if (d0Var.a.p()) {
            return this.f3266r0;
        }
        return d0Var.a.g(d0Var.f3426b.a, this.f3274y).f17948c;
    }

    public final long X0() {
        u1();
        if (!c1()) {
            return u0();
        }
        d0 d0Var = this.f3264q0;
        O1.B b4 = d0Var.f3426b;
        y1.P p7 = d0Var.a;
        Object obj = b4.a;
        y1.N n7 = this.f3274y;
        p7.g(obj, n7);
        return B1.K.P(n7.a(b4.f7252b, b4.f7253c));
    }

    public final boolean Y0() {
        u1();
        return this.f3264q0.f3436l;
    }

    public final int Z0() {
        u1();
        return this.f3264q0.f3429e;
    }

    public final Q1.j b1() {
        u1();
        return ((Q1.q) this.f3267s).c();
    }

    public final boolean c1() {
        u1();
        return this.f3264q0.f3426b.b();
    }

    public final d0 e1(d0 d0Var, y1.P p7, Pair pair) {
        List list;
        AbstractC0015b.c(p7.p() || pair != null);
        y1.P p8 = d0Var.a;
        long jO0 = O0(d0Var);
        d0 d0VarI = d0Var.i(p7);
        if (p7.p()) {
            O1.B b4 = d0.f3425u;
            long jF = B1.K.F(this.f3268s0);
            d0 d0VarC = d0VarI.d(b4, jF, jF, jF, 0L, O1.g0.f7448d, this.f3253l, j3.X.f12304o).c(b4);
            d0VarC.f3441q = d0VarC.f3443s;
            return d0VarC;
        }
        Object obj = d0VarI.f3426b.a;
        boolean zEquals = obj.equals(pair.first);
        O1.B b7 = !zEquals ? new O1.B(pair.first) : d0VarI.f3426b;
        long jLongValue = ((Long) pair.second).longValue();
        long jF2 = B1.K.F(jO0);
        if (!p8.p()) {
            jF2 -= p8.g(obj, this.f3274y).f17950e;
        }
        if (!zEquals || jLongValue < jF2) {
            O1.B b8 = b7;
            AbstractC0015b.h(!b8.b());
            O1.g0 g0Var = !zEquals ? O1.g0.f7448d : d0VarI.f3432h;
            Q1.u uVar = !zEquals ? this.f3253l : d0VarI.f3433i;
            if (zEquals) {
                list = d0VarI.f3434j;
            } else {
                j3.E e7 = j3.G.f12277l;
                list = j3.X.f12304o;
            }
            d0 d0VarC2 = d0VarI.d(b8, jLongValue, jLongValue, jLongValue, 0L, g0Var, uVar, list).c(b8);
            d0VarC2.f3441q = jLongValue;
            return d0VarC2;
        }
        if (jLongValue != jF2) {
            O1.B b9 = b7;
            AbstractC0015b.h(!b9.b());
            long jMax = Math.max(0L, d0VarI.f3442r - (jLongValue - jF2));
            long j7 = d0VarI.f3441q;
            if (d0VarI.f3435k.equals(d0VarI.f3426b)) {
                j7 = jLongValue + jMax;
            }
            d0 d0VarD = d0VarI.d(b9, jLongValue, jLongValue, jLongValue, jMax, d0VarI.f3432h, d0VarI.f3433i, d0VarI.f3434j);
            d0VarD.f3441q = j7;
            return d0VarD;
        }
        int iB = p7.b(d0VarI.f3435k.a);
        if (iB != -1 && p7.f(iB, this.f3274y, false).f17948c == p7.g(b7.a, this.f3274y).f17948c) {
            return d0VarI;
        }
        p7.g(b7.a, this.f3274y);
        long jA = b7.b() ? this.f3274y.a(b7.f7252b, b7.f7253c) : this.f3274y.f17949d;
        O1.B b10 = b7;
        d0 d0VarC3 = d0VarI.d(b10, d0VarI.f3443s, d0VarI.f3443s, d0VarI.f3428d, jA - d0VarI.f3443s, d0VarI.f3432h, d0VarI.f3433i, d0VarI.f3434j).c(b10);
        d0VarC3.f3441q = jA;
        return d0VarC3;
    }

    public final Pair f1(y1.P p7, int i7, long j7) {
        if (p7.p()) {
            this.f3266r0 = i7;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f3268s0 = j7;
            return null;
        }
        if (i7 == -1 || i7 >= p7.o()) {
            i7 = p7.a(this.f3232Q);
            j7 = B1.K.P(p7.m(i7, (y1.O) this.f8011k, 0L).f17964k);
        }
        return p7.i((y1.O) this.f8011k, this.f3274y, i7, B1.K.F(j7));
    }

    public final void g1(final int i7, final int i8) {
        B1.C c2 = this.f3248g0;
        if (i7 == c2.a && i8 == c2.f291b) {
            return;
        }
        this.f3248g0 = new B1.C(i7, i8);
        this.f3272w.e(24, new B1.n() { // from class: H1.y
            @Override // B1.n
            public final void invoke(Object obj) {
                ((y1.J) obj).D(i7, i8);
            }
        });
        k1(2, 14, new B1.C(i7, i8));
    }

    public final void h1() {
        u1();
        d0 d0Var = this.f3264q0;
        if (d0Var.f3429e != 1) {
            return;
        }
        d0 d0VarF = d0Var.f(null);
        d0 d0VarD1 = d1(d0VarF, d0VarF.a.p() ? 4 : 2);
        this.f3233R++;
        B1.F f5 = this.f3271v.f3328r;
        f5.getClass();
        B1.E eB = B1.F.b();
        eB.a = f5.a.obtainMessage(29);
        eB.b();
        s1(d0VarD1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void i1(y1.J j7) {
        u1();
        j7.getClass();
        B1.q qVar = this.f3272w;
        qVar.f();
        CopyOnWriteArraySet copyOnWriteArraySet = qVar.f351d;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            B1.p pVar = (B1.p) it.next();
            if (pVar.a.equals(j7)) {
                pVar.f348d = true;
                if (pVar.f347c) {
                    pVar.f347c = false;
                    C2391m c2391mB = pVar.f346b.b();
                    qVar.f350c.b(pVar.a, c2391mB);
                }
                copyOnWriteArraySet.remove(pVar);
            }
        }
    }

    public final void j1() {
        U1.k kVar = this.f3244c0;
        D d4 = this.I;
        if (kVar != null) {
            h0 h0VarN0 = N0(this.J);
            AbstractC0015b.h(!h0VarN0.f3491f);
            h0VarN0.f3488c = 10000;
            AbstractC0015b.h(!h0VarN0.f3491f);
            h0VarN0.f3489d = null;
            h0VarN0.b();
            this.f3244c0.f9179k.remove(d4);
            this.f3244c0 = null;
        }
        TextureView textureView = this.f3246e0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != d4) {
                AbstractC0015b.v("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f3246e0.setSurfaceTextureListener(null);
            }
            this.f3246e0 = null;
        }
        SurfaceHolder surfaceHolder = this.f3243b0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(d4);
            this.f3243b0 = null;
        }
    }

    public final void k1(int i7, int i8, Object obj) {
        for (AbstractC0225f abstractC0225f : this.f3263q) {
            if (i7 == -1 || abstractC0225f.f3457l == i7) {
                h0 h0VarN0 = N0(abstractC0225f);
                AbstractC0015b.h(!h0VarN0.f3491f);
                h0VarN0.f3488c = i8;
                AbstractC0015b.h(!h0VarN0.f3491f);
                h0VarN0.f3489d = obj;
                h0VarN0.b();
            }
        }
        for (AbstractC0225f abstractC0225f2 : this.f3265r) {
            if (abstractC0225f2 != null && (i7 == -1 || abstractC0225f2.f3457l == i7)) {
                h0 h0VarN02 = N0(abstractC0225f2);
                AbstractC0015b.h(!h0VarN02.f3491f);
                h0VarN02.f3488c = i8;
                AbstractC0015b.h(!h0VarN02.f3491f);
                h0VarN02.f3489d = obj;
                h0VarN02.b();
            }
        }
    }

    public final void l1(SurfaceHolder surfaceHolder) {
        this.f3245d0 = false;
        this.f3243b0 = surfaceHolder;
        surfaceHolder.addCallback(this.I);
        Surface surface = this.f3243b0.getSurface();
        if (surface == null || !surface.isValid()) {
            g1(0, 0);
        } else {
            Rect surfaceFrame = this.f3243b0.getSurfaceFrame();
            g1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void m1(y1.G g4) {
        u1();
        if (this.f3264q0.f3439o.equals(g4)) {
            return;
        }
        d0 d0VarG = this.f3264q0.g(g4);
        this.f3233R++;
        this.f3271v.f3328r.a(4, g4).b();
        s1(d0VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void n1(int i7) {
        u1();
        if (this.f3231P != i7) {
            this.f3231P = i7;
            B1.F f5 = this.f3271v.f3328r;
            f5.getClass();
            B1.E eB = B1.F.b();
            eB.a = f5.a.obtainMessage(11, i7, 0);
            eB.b();
            C0238t c0238t = new C0238t(i7, 1);
            B1.q qVar = this.f3272w;
            qVar.c(8, c0238t);
            q1();
            qVar.b();
        }
    }

    public final void o1(y1.V v5) {
        u1();
        Q1.t tVar = this.f3267s;
        tVar.getClass();
        Q1.q qVar = (Q1.q) tVar;
        if (v5.equals(qVar.c())) {
            return;
        }
        if (v5 instanceof Q1.j) {
            qVar.g((Q1.j) v5);
        }
        Q1.i iVar = new Q1.i(qVar.c());
        iVar.b(v5);
        qVar.g(new Q1.j(iVar));
        this.f3272w.e(19, new C2.G(2, v5));
    }

    public final void p1(Object obj) {
        boolean z7;
        Object obj2 = this.f3241Z;
        boolean z8 = (obj2 == null || obj2 == obj) ? false : true;
        long j7 = z8 ? this.f3229N : -9223372036854775807L;
        L l7 = this.f3271v;
        synchronized (l7) {
            if (!l7.f3298N && l7.f3330t.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                l7.f3328r.a(30, new Pair(obj, atomicBoolean)).b();
                if (j7 != -9223372036854775807L) {
                    l7.t0(new C0235p(2, atomicBoolean), j7);
                    z7 = atomicBoolean.get();
                }
            }
            z7 = true;
        }
        if (z8) {
            Object obj3 = this.f3241Z;
            Surface surface = this.f3242a0;
            if (obj3 == surface) {
                surface.release();
                this.f3242a0 = null;
            }
        }
        this.f3241Z = obj;
        if (z7) {
            return;
        }
        C0234o c0234o = new C0234o(2, new D6.r("Detaching surface timed out."), 1003);
        d0 d0Var = this.f3264q0;
        d0 d0VarC = d0Var.c(d0Var.f3426b);
        d0VarC.f3441q = d0VarC.f3443s;
        d0VarC.f3442r = 0L;
        d0 d0VarF = d1(d0VarC, 1).f(c0234o);
        this.f3233R++;
        B1.F f5 = this.f3271v.f3328r;
        f5.getClass();
        B1.E eB = B1.F.b();
        eB.a = f5.a.obtainMessage(6);
        eB.b();
        s1(d0VarF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void q1() {
        int iK;
        int iE;
        y1.H h7 = this.f3239X;
        int i7 = B1.K.a;
        G g4 = this.f3261p;
        boolean zC1 = g4.c1();
        boolean zB0 = g4.B0();
        y1.P pU0 = g4.U0();
        if (pU0.p()) {
            iK = -1;
        } else {
            int iR0 = g4.R0();
            g4.u1();
            int i8 = g4.f3231P;
            if (i8 == 1) {
                i8 = 0;
            }
            g4.u1();
            iK = pU0.k(iR0, i8, g4.f3232Q);
        }
        boolean z7 = iK != -1;
        y1.P pU02 = g4.U0();
        if (pU02.p()) {
            iE = -1;
        } else {
            int iR02 = g4.R0();
            g4.u1();
            int i9 = g4.f3231P;
            if (i9 == 1) {
                i9 = 0;
            }
            g4.u1();
            iE = pU02.e(iR02, i9, g4.f3232Q);
        }
        boolean z8 = iE != -1;
        boolean zA0 = g4.A0();
        boolean zZ0 = g4.z0();
        boolean zP = g4.U0().p();
        p2.l lVar = new p2.l(10);
        C2391m c2391m = this.f3255m.a;
        E3.b bVar = (E3.b) lVar.f14298b;
        bVar.getClass();
        for (int i10 = 0; i10 < c2391m.a.size(); i10++) {
            bVar.a(c2391m.a(i10));
        }
        boolean z9 = !zC1;
        lVar.r(4, z9);
        lVar.r(5, zB0 && !zC1);
        lVar.r(6, z7 && !zC1);
        lVar.r(7, !zP && (z7 || !zA0 || zB0) && !zC1);
        lVar.r(8, z8 && !zC1);
        lVar.r(9, !zP && (z8 || (zA0 && zZ0)) && !zC1);
        lVar.r(10, z9);
        lVar.r(11, zB0 && !zC1);
        lVar.r(12, zB0 && !zC1);
        y1.H h8 = new y1.H(bVar.b());
        this.f3239X = h8;
        if (h8.equals(h7)) {
            return;
        }
        this.f3272w.c(13, new C0242x(this));
    }

    public final void r1(int i7, boolean z7) {
        d0 d0VarA = this.f3264q0;
        int i8 = d0VarA.f3438n;
        int i9 = (i8 != 1 || z7) ? 0 : 1;
        if (d0VarA.f3436l == z7 && i8 == i9 && d0VarA.f3437m == i7) {
            return;
        }
        this.f3233R++;
        if (d0VarA.f3440p) {
            d0VarA = d0VarA.a();
        }
        d0 d0VarE = d0VarA.e(i7, i9, z7);
        B1.F f5 = this.f3271v.f3328r;
        f5.getClass();
        B1.E eB = B1.F.b();
        eB.a = f5.a.obtainMessage(1, z7 ? 1 : 0, i7 | (i9 << 4));
        eB.b();
        s1(d0VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(final H1.d0 r34, final int r35, boolean r36, final int r37, long r38, int r40, boolean r41) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.G.s1(H1.d0, int, boolean, int, long, int, boolean):void");
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        u1();
        k1(4, 15, imageOutput);
    }

    public final void t1() {
        int iZ0 = Z0();
        C0020g c0020g = this.f3228M;
        C0020g c0020g2 = this.f3227L;
        if (iZ0 != 1) {
            if (iZ0 == 2 || iZ0 == 3) {
                u1();
                c0020g2.e(Y0() && !this.f3264q0.f3440p);
                c0020g.e(Y0());
                return;
            } else if (iZ0 != 4) {
                throw new IllegalStateException();
            }
        }
        c0020g2.e(false);
        c0020g.e(false);
    }

    public final void u1() {
        this.f3257n.c();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f3220C;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i7 = B1.K.a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f3254l0) {
                throw new IllegalStateException(str);
            }
            AbstractC0015b.w("ExoPlayerImpl", str, this.f3256m0 ? null : new IllegalStateException());
            this.f3256m0 = true;
        }
    }
}
