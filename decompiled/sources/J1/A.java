package J1;

import B1.AbstractC0015b;
import B1.J;
import B1.K;
import C2.C0034g;
import H1.W;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import j3.AbstractC1331q;
import j3.X;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import y1.C2381c;
import y1.C2382d;
import y1.C2393o;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: j0, reason: collision with root package name */
    public static final Object f4079j0 = new Object();

    /* renamed from: k0, reason: collision with root package name */
    public static ScheduledExecutorService f4080k0;

    /* renamed from: l0, reason: collision with root package name */
    public static int f4081l0;

    /* renamed from: A, reason: collision with root package name */
    public v f4082A;

    /* renamed from: B, reason: collision with root package name */
    public v f4083B;

    /* renamed from: C, reason: collision with root package name */
    public y1.G f4084C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4085D;

    /* renamed from: E, reason: collision with root package name */
    public ByteBuffer f4086E;

    /* renamed from: F, reason: collision with root package name */
    public int f4087F;

    /* renamed from: G, reason: collision with root package name */
    public long f4088G;

    /* renamed from: H, reason: collision with root package name */
    public long f4089H;
    public long I;
    public long J;

    /* renamed from: K, reason: collision with root package name */
    public int f4090K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4091L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f4092M;

    /* renamed from: N, reason: collision with root package name */
    public long f4093N;

    /* renamed from: O, reason: collision with root package name */
    public float f4094O;

    /* renamed from: P, reason: collision with root package name */
    public ByteBuffer f4095P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4096Q;

    /* renamed from: R, reason: collision with root package name */
    public ByteBuffer f4097R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f4098S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f4099T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f4100U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f4101V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f4102W;

    /* renamed from: X, reason: collision with root package name */
    public int f4103X;

    /* renamed from: Y, reason: collision with root package name */
    public C2382d f4104Y;

    /* renamed from: Z, reason: collision with root package name */
    public C0034g f4105Z;
    public final Context a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f4106a0;

    /* renamed from: b, reason: collision with root package name */
    public final B2.l f4107b;

    /* renamed from: b0, reason: collision with root package name */
    public long f4108b0;

    /* renamed from: c, reason: collision with root package name */
    public final s f4109c;

    /* renamed from: c0, reason: collision with root package name */
    public long f4110c0;

    /* renamed from: d, reason: collision with root package name */
    public final G f4111d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f4112d0;

    /* renamed from: e, reason: collision with root package name */
    public final X f4113e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f4114e0;

    /* renamed from: f, reason: collision with root package name */
    public final X f4115f;

    /* renamed from: f0, reason: collision with root package name */
    public Looper f4116f0;

    /* renamed from: g, reason: collision with root package name */
    public final r f4117g;

    /* renamed from: g0, reason: collision with root package name */
    public long f4118g0;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f4119h;

    /* renamed from: h0, reason: collision with root package name */
    public long f4120h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4121i;

    /* renamed from: i0, reason: collision with root package name */
    public Handler f4122i0;

    /* renamed from: j, reason: collision with root package name */
    public int f4123j;

    /* renamed from: k, reason: collision with root package name */
    public B2.l f4124k;

    /* renamed from: l, reason: collision with root package name */
    public final x f4125l;

    /* renamed from: m, reason: collision with root package name */
    public final x f4126m;

    /* renamed from: n, reason: collision with root package name */
    public final B f4127n;

    /* renamed from: o, reason: collision with root package name */
    public final F.w f4128o;

    /* renamed from: p, reason: collision with root package name */
    public final B f4129p;

    /* renamed from: q, reason: collision with root package name */
    public I1.l f4130q;

    /* renamed from: r, reason: collision with root package name */
    public C0034g f4131r;

    /* renamed from: s, reason: collision with root package name */
    public u f4132s;

    /* renamed from: t, reason: collision with root package name */
    public u f4133t;

    /* renamed from: u, reason: collision with root package name */
    public z1.d f4134u;

    /* renamed from: v, reason: collision with root package name */
    public AudioTrack f4135v;

    /* renamed from: w, reason: collision with root package name */
    public C0286b f4136w;

    /* renamed from: x, reason: collision with root package name */
    public C0289e f4137x;

    /* renamed from: y, reason: collision with root package name */
    public B2.l f4138y;

    /* renamed from: z, reason: collision with root package name */
    public C2381c f4139z;

    public A(t tVar) {
        Context context = tVar.a;
        this.a = context;
        this.f4139z = C2381c.f18030b;
        this.f4136w = context != null ? null : tVar.f4265b;
        this.f4107b = tVar.f4266c;
        int i7 = K.a;
        this.f4121i = false;
        this.f4123j = 0;
        this.f4127n = tVar.f4268e;
        F.w wVar = tVar.f4270g;
        wVar.getClass();
        this.f4128o = wVar;
        this.f4117g = new r(new C0034g(12, this));
        s sVar = new s();
        this.f4109c = sVar;
        G g4 = new G();
        g4.f4177m = K.f302c;
        this.f4111d = g4;
        z1.k kVar = new z1.k();
        j3.E e7 = j3.G.f12277l;
        Object[] objArr = {kVar, sVar, g4};
        AbstractC1331q.a(3, objArr);
        this.f4113e = j3.G.q(3, objArr);
        Object[] objArr2 = {new F(), sVar, g4};
        AbstractC1331q.a(3, objArr2);
        this.f4115f = j3.G.q(3, objArr2);
        this.f4094O = 1.0f;
        this.f4103X = 0;
        this.f4104Y = new C2382d();
        y1.G g7 = y1.G.f17936d;
        this.f4083B = new v(g7, 0L, 0L);
        this.f4084C = g7;
        this.f4085D = false;
        this.f4119h = new ArrayDeque();
        this.f4125l = new x();
        this.f4126m = new x();
        this.f4129p = tVar.f4269f;
    }

    public static boolean p(AudioTrack audioTrack) {
        return K.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.x()
            r1 = 0
            B2.l r2 = r9.f4107b
            if (r0 != 0) goto L58
            boolean r0 = r9.f4106a0
            if (r0 != 0) goto L52
            J1.u r0 = r9.f4133t
            int r3 = r0.f4272c
            if (r3 != 0) goto L52
            y1.o r0 = r0.a
            int r0 = r0.f18093F
            y1.G r0 = r9.f4084C
            r2.getClass()
            float r3 = r0.a
            java.lang.Object r4 = r2.f418n
            z1.j r4 = (z1.j) r4
            r4.getClass()
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1
            if (r6 <= 0) goto L2d
            r6 = r7
            goto L2e
        L2d:
            r6 = r1
        L2e:
            B1.AbstractC0015b.c(r6)
            float r6 = r4.f18993c
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 == 0) goto L3b
            r4.f18993c = r3
            r4.f18999i = r7
        L3b:
            float r3 = r0.f17937b
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L43
            r5 = r7
            goto L44
        L43:
            r5 = r1
        L44:
            B1.AbstractC0015b.c(r5)
            float r5 = r4.f18994d
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L54
            r4.f18994d = r3
            r4.f18999i = r7
            goto L54
        L52:
            y1.G r0 = y1.G.f17936d
        L54:
            r9.f4084C = r0
        L56:
            r4 = r0
            goto L5b
        L58:
            y1.G r0 = y1.G.f17936d
            goto L56
        L5b:
            boolean r0 = r9.f4106a0
            if (r0 != 0) goto L71
            J1.u r0 = r9.f4133t
            int r3 = r0.f4272c
            if (r3 != 0) goto L71
            y1.o r0 = r0.a
            int r0 = r0.f18093F
            boolean r1 = r9.f4085D
            java.lang.Object r0 = r2.f417m
            J1.E r0 = (J1.E) r0
            r0.f4164o = r1
        L71:
            r9.f4085D = r1
            java.util.ArrayDeque r0 = r9.f4119h
            J1.v r3 = new J1.v
            r1 = 0
            long r5 = java.lang.Math.max(r1, r10)
            J1.u r10 = r9.f4133t
            long r1 = r9.k()
            int r10 = r10.f4274e
            long r7 = B1.K.J(r10, r1)
            r3.<init>(r4, r5, r7)
            r0.add(r3)
            J1.u r10 = r9.f4133t
            z1.d r10 = r10.f4278i
            r9.f4134u = r10
            r10.b()
            C2.g r10 = r9.f4131r
            if (r10 == 0) goto Lb0
            boolean r11 = r9.f4085D
            java.lang.Object r10 = r10.f741l
            J1.C r10 = (J1.C) r10
            J1.j r10 = r10.f4142N0
            android.os.Handler r0 = r10.a
            if (r0 == 0) goto Lb0
            J1.i r1 = new J1.i
            r1.<init>()
            r0.post(r1)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.a(long):void");
    }

    public final AudioTrack b(k kVar, C2381c c2381c, int i7, C2393o c2393o) throws m {
        try {
            try {
                AudioTrack audioTrackA = this.f4129p.a(kVar, c2381c, i7);
                int state = audioTrackA.getState();
                if (state == 1) {
                    return audioTrackA;
                }
                try {
                    audioTrackA.release();
                } catch (Exception unused) {
                }
                throw new m(state, kVar.f4209c, kVar.f4211e, kVar.f4208b, c2393o, kVar.f4210d, null);
            } catch (IllegalArgumentException e7) {
                e = e7;
                RuntimeException runtimeException = e;
                throw new m(0, kVar.f4209c, kVar.f4211e, kVar.f4208b, c2393o, kVar.f4210d, runtimeException);
            } catch (UnsupportedOperationException e8) {
                e = e8;
                RuntimeException runtimeException2 = e;
                throw new m(0, kVar.f4209c, kVar.f4211e, kVar.f4208b, c2393o, kVar.f4210d, runtimeException2);
            }
        } catch (IllegalArgumentException e9) {
            e = e9;
        } catch (UnsupportedOperationException e10) {
            e = e10;
        }
    }

    public final AudioTrack c(u uVar) throws m {
        try {
            return b(uVar.a(), this.f4139z, this.f4103X, uVar.a);
        } catch (m e7) {
            C0034g c0034g = this.f4131r;
            if (c0034g != null) {
                c0034g.q(e7);
            }
            throw e7;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(y1.C2393o r28, int[] r29) throws J1.l {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.d(y1.o, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r13) throws J1.o {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.e(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() throws J1.o {
        /*
            r6 = this;
            z1.d r0 = r6.f4134u
            boolean r0 = r0.e()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L14
            r6.e(r1)
            java.nio.ByteBuffer r0 = r6.f4097R
            if (r0 != 0) goto L44
            goto L43
        L14:
            z1.d r0 = r6.f4134u
            boolean r5 = r0.e()
            if (r5 == 0) goto L2e
            boolean r5 = r0.f18958d
            if (r5 == 0) goto L21
            goto L2e
        L21:
            r0.f18958d = r4
            java.util.ArrayList r0 = r0.f18956b
            java.lang.Object r0 = r0.get(r3)
            z1.g r0 = (z1.g) r0
            r0.c()
        L2e:
            r6.t(r1)
            z1.d r0 = r6.f4134u
            boolean r0 = r0.d()
            if (r0 == 0) goto L44
            java.nio.ByteBuffer r0 = r6.f4097R
            if (r0 == 0) goto L43
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L44
        L43:
            return r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.f():boolean");
    }

    public final void g() throws IllegalStateException {
        B2.l lVar;
        if (o()) {
            this.f4088G = 0L;
            this.f4089H = 0L;
            this.I = 0L;
            this.J = 0L;
            this.f4114e0 = false;
            this.f4090K = 0;
            this.f4083B = new v(this.f4084C, 0L, 0L);
            this.f4093N = 0L;
            this.f4082A = null;
            this.f4119h.clear();
            this.f4095P = null;
            this.f4096Q = 0;
            this.f4097R = null;
            this.f4099T = false;
            this.f4098S = false;
            this.f4100U = false;
            this.f4086E = null;
            this.f4087F = 0;
            this.f4111d.f4179o = 0L;
            z1.d dVar = this.f4133t.f4278i;
            this.f4134u = dVar;
            dVar.b();
            AudioTrack audioTrack = this.f4117g.f4239c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f4135v.pause();
            }
            if (p(this.f4135v)) {
                B2.l lVar2 = this.f4124k;
                lVar2.getClass();
                this.f4135v.unregisterStreamEventCallback((z) lVar2.f417m);
                ((Handler) lVar2.f416l).removeCallbacksAndMessages(null);
            }
            k kVarA = this.f4133t.a();
            u uVar = this.f4132s;
            if (uVar != null) {
                this.f4133t = uVar;
                this.f4132s = null;
            }
            r rVar = this.f4117g;
            rVar.e();
            rVar.f4239c = null;
            rVar.f4241e = null;
            if (K.a >= 24 && (lVar = this.f4138y) != null) {
                w wVar = (w) lVar.f418n;
                wVar.getClass();
                ((AudioTrack) lVar.f416l).removeOnRoutingChangedListener(wVar);
                lVar.f418n = null;
                this.f4138y = null;
            }
            AudioTrack audioTrack2 = this.f4135v;
            C0034g c0034g = this.f4131r;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f4079j0) {
                try {
                    if (f4080k0 == null) {
                        f4080k0 = Executors.newSingleThreadScheduledExecutor(new J());
                    }
                    f4081l0++;
                    f4080k0.schedule(new W(audioTrack2, c0034g, handler, kVarA, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f4135v = null;
        }
        x xVar = this.f4126m;
        xVar.f4287m = null;
        xVar.f4285k = -9223372036854775807L;
        xVar.f4286l = -9223372036854775807L;
        x xVar2 = this.f4125l;
        xVar2.f4287m = null;
        xVar2.f4285k = -9223372036854775807L;
        xVar2.f4286l = -9223372036854775807L;
        this.f4118g0 = 0L;
        this.f4120h0 = 0L;
        Handler handler2 = this.f4122i0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final C0291g h(C2393o c2393o) {
        int i7;
        boolean zBooleanValue;
        if (this.f4112d0) {
            return C0291g.f4200d;
        }
        C2381c c2381c = this.f4139z;
        F.w wVar = this.f4128o;
        wVar.getClass();
        c2393o.getClass();
        c2381c.getClass();
        int i8 = K.a;
        if (i8 < 29 || (i7 = c2393o.f18092E) == -1) {
            return C0291g.f4200d;
        }
        Boolean bool = (Boolean) wVar.f2038m;
        boolean z7 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = (Context) wVar.f2037l;
            if (context != null) {
                String parameters = z1.c.s(context).getParameters("offloadVariableRateSupported");
                wVar.f2038m = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                wVar.f2038m = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) wVar.f2038m).booleanValue();
        }
        String str = c2393o.f18112n;
        str.getClass();
        int iC = y1.D.c(str, c2393o.f18109k);
        if (iC == 0 || i8 < K.n(iC)) {
            return C0291g.f4200d;
        }
        int iP = K.p(c2393o.f18091D);
        if (iP == 0) {
            return C0291g.f4200d;
        }
        try {
            AudioFormat audioFormatO = K.o(i7, iP, iC);
            if (i8 < 31) {
                if (!AudioManager.isOffloadedPlaybackSupported(audioFormatO, (AudioAttributes) c2381c.a().f14298b)) {
                    return C0291g.f4200d;
                }
                C0290f c0290f = new C0290f();
                c0290f.a = true;
                c0290f.f4199c = zBooleanValue;
                return c0290f.a();
            }
            int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatO, (AudioAttributes) c2381c.a().f14298b);
            if (playbackOffloadSupport == 0) {
                return C0291g.f4200d;
            }
            C0290f c0290f2 = new C0290f();
            if (i8 > 32 && playbackOffloadSupport == 2) {
                z7 = true;
            }
            c0290f2.a = true;
            c0290f2.f4198b = z7;
            c0290f2.f4199c = zBooleanValue;
            return c0290f2.a();
        } catch (IllegalArgumentException unused) {
            return C0291g.f4200d;
        }
    }

    public final int i(C2393o c2393o) {
        q();
        if ("audio/raw".equals(c2393o.f18112n)) {
            int i7 = c2393o.f18093F;
            if (!K.C(i7)) {
                A6.b.n(i7, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i7 != 2) {
                return 1;
            }
        } else if (this.f4136w.d(c2393o, this.f4139z) == null) {
            return 0;
        }
        return 2;
    }

    public final long j() {
        return this.f4133t.f4272c == 0 ? this.f4088G / r0.f4271b : this.f4089H;
    }

    public final long k() {
        u uVar = this.f4133t;
        if (uVar.f4272c != 0) {
            return this.J;
        }
        long j7 = this.I;
        long j8 = uVar.f4273d;
        int i7 = K.a;
        return ((j7 + j8) - 1) / j8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0399, code lost:
    
        if (r5 == 0) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0113, code lost:
    
        if (r10.b() == 0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.nio.ByteBuffer r28, long r29, int r31) throws java.lang.IllegalStateException, J1.m, J1.o {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.l(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean m() {
        if (o()) {
            return !(K.a >= 29 && this.f4135v.isOffloadedPlayback() && this.f4100U) && this.f4117g.d(k());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() throws J1.m {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.n():boolean");
    }

    public final boolean o() {
        return this.f4135v != null;
    }

    public final void q() {
        Context context;
        C0286b c0286bB;
        C0287c c0287c;
        if (this.f4137x == null && (context = this.a) != null) {
            this.f4116f0 = Looper.myLooper();
            C0289e c0289e = new C0289e(context, new C2.G(11, this), this.f4139z, this.f4105Z);
            this.f4137x = c0289e;
            if (c0289e.f4197j) {
                c0286bB = c0289e.f4194g;
                c0286bB.getClass();
            } else {
                c0289e.f4197j = true;
                C0288d c0288d = c0289e.f4193f;
                if (c0288d != null) {
                    c0288d.a.registerContentObserver(c0288d.f4187b, false, c0288d);
                }
                int i7 = K.a;
                Handler handler = c0289e.f4190c;
                Context context2 = c0289e.a;
                if (i7 >= 23 && (c0287c = c0289e.f4191d) != null) {
                    z1.c.s(context2).registerAudioDeviceCallback(c0287c, handler);
                }
                c0286bB = C0286b.b(context2, context2.registerReceiver(c0289e.f4192e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), c0289e.f4196i, c0289e.f4195h);
                c0289e.f4194g = c0286bB;
            }
            this.f4136w = c0286bB;
        }
        this.f4136w.getClass();
    }

    public final void r() throws IllegalStateException {
        this.f4101V = true;
        if (o()) {
            r rVar = this.f4117g;
            if (rVar.f4260x != -9223372036854775807L) {
                rVar.I.getClass();
                rVar.f4260x = K.F(SystemClock.elapsedRealtime());
            }
            q qVar = rVar.f4241e;
            qVar.getClass();
            qVar.a();
            this.f4135v.play();
        }
    }

    public final void s() throws IllegalStateException {
        if (this.f4099T) {
            return;
        }
        this.f4099T = true;
        long jK = k();
        r rVar = this.f4117g;
        rVar.f4262z = rVar.b();
        rVar.I.getClass();
        rVar.f4260x = K.F(SystemClock.elapsedRealtime());
        rVar.f4230A = jK;
        if (p(this.f4135v)) {
            this.f4100U = false;
        }
        this.f4135v.stop();
        this.f4087F = 0;
    }

    public final void t(long j7) throws o {
        ByteBuffer byteBuffer;
        e(j7);
        if (this.f4097R != null) {
            return;
        }
        if (!this.f4134u.e()) {
            ByteBuffer byteBuffer2 = this.f4095P;
            if (byteBuffer2 != null) {
                w(byteBuffer2);
                e(j7);
                return;
            }
            return;
        }
        while (!this.f4134u.d()) {
            do {
                z1.d dVar = this.f4134u;
                if (dVar.e()) {
                    ByteBuffer byteBuffer3 = dVar.f18957c[dVar.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        dVar.f(z1.g.a);
                        byteBuffer = dVar.f18957c[dVar.c()];
                    }
                } else {
                    byteBuffer = z1.g.a;
                }
                if (byteBuffer.hasRemaining()) {
                    w(byteBuffer);
                    e(j7);
                } else {
                    ByteBuffer byteBuffer4 = this.f4095P;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    z1.d dVar2 = this.f4134u;
                    ByteBuffer byteBuffer5 = this.f4095P;
                    if (dVar2.e() && !dVar2.f18958d) {
                        dVar2.f(byteBuffer5);
                    }
                }
            } while (this.f4097R == null);
            return;
        }
    }

    public final void u() throws IllegalStateException {
        g();
        j3.E eListIterator = this.f4113e.listIterator(0);
        while (eListIterator.hasNext()) {
            ((z1.g) eListIterator.next()).reset();
        }
        j3.E eListIterator2 = this.f4115f.listIterator(0);
        while (eListIterator2.hasNext()) {
            ((z1.g) eListIterator2.next()).reset();
        }
        z1.d dVar = this.f4134u;
        if (dVar != null) {
            int i7 = 0;
            while (true) {
                X x7 = dVar.a;
                if (i7 >= x7.f12306n) {
                    break;
                }
                z1.g gVar = (z1.g) x7.get(i7);
                gVar.flush();
                gVar.reset();
                i7++;
            }
            dVar.f18957c = new ByteBuffer[0];
            z1.e eVar = z1.e.f18959e;
            dVar.f18958d = false;
        }
        this.f4101V = false;
        this.f4112d0 = false;
    }

    public final void v() {
        if (o()) {
            try {
                this.f4135v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f4084C.a).setPitch(this.f4084C.f17937b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                AbstractC0015b.w("DefaultAudioSink", "Failed to set playback params", e7);
            }
            y1.G g4 = new y1.G(this.f4135v.getPlaybackParams().getSpeed(), this.f4135v.getPlaybackParams().getPitch());
            this.f4084C = g4;
            r rVar = this.f4117g;
            rVar.f4245i = g4.a;
            q qVar = rVar.f4241e;
            if (qVar != null) {
                qVar.a();
            }
            rVar.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.nio.ByteBuffer r19) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.A.w(java.nio.ByteBuffer):void");
    }

    public final boolean x() {
        u uVar = this.f4133t;
        return uVar != null && uVar.f4279j && K.a >= 23;
    }
}
