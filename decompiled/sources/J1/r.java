package J1;

import B1.K;
import C2.C0034g;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: A, reason: collision with root package name */
    public long f4230A;

    /* renamed from: B, reason: collision with root package name */
    public long f4231B;

    /* renamed from: C, reason: collision with root package name */
    public long f4232C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4233D;

    /* renamed from: E, reason: collision with root package name */
    public long f4234E;

    /* renamed from: F, reason: collision with root package name */
    public long f4235F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4236G;

    /* renamed from: H, reason: collision with root package name */
    public long f4237H;
    public B1.D I;
    public final C0034g a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f4238b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f4239c;

    /* renamed from: d, reason: collision with root package name */
    public int f4240d;

    /* renamed from: e, reason: collision with root package name */
    public q f4241e;

    /* renamed from: f, reason: collision with root package name */
    public int f4242f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4243g;

    /* renamed from: h, reason: collision with root package name */
    public long f4244h;

    /* renamed from: i, reason: collision with root package name */
    public float f4245i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4246j;

    /* renamed from: k, reason: collision with root package name */
    public long f4247k;

    /* renamed from: l, reason: collision with root package name */
    public long f4248l;

    /* renamed from: m, reason: collision with root package name */
    public Method f4249m;

    /* renamed from: n, reason: collision with root package name */
    public long f4250n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4251o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4252p;

    /* renamed from: q, reason: collision with root package name */
    public long f4253q;

    /* renamed from: r, reason: collision with root package name */
    public long f4254r;

    /* renamed from: s, reason: collision with root package name */
    public long f4255s;

    /* renamed from: t, reason: collision with root package name */
    public long f4256t;

    /* renamed from: u, reason: collision with root package name */
    public long f4257u;

    /* renamed from: v, reason: collision with root package name */
    public int f4258v;

    /* renamed from: w, reason: collision with root package name */
    public int f4259w;

    /* renamed from: x, reason: collision with root package name */
    public long f4260x;

    /* renamed from: y, reason: collision with root package name */
    public long f4261y;

    /* renamed from: z, reason: collision with root package name */
    public long f4262z;

    public r(C0034g c0034g) {
        this.a = c0034g;
        try {
            this.f4249m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f4238b = new long[10];
        this.I = B1.D.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0251 A[Catch: Exception -> 0x0267, TRY_LEAVE, TryCatch #0 {Exception -> 0x0267, blocks: (B:94:0x022a, B:96:0x0251), top: B:147:0x022a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.r.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = r12.f4260x
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.c()
            long r2 = r12.f4230A
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            B1.D r0 = r12.I
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.f4254r
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L91
            android.media.AudioTrack r4 = r12.f4239c
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L36
            goto L8f
        L36:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r4 = r12.f4243g
            r8 = 0
            if (r4 == 0) goto L55
            r4 = 2
            if (r5 != r4) goto L52
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L52
            long r10 = r12.f4255s
            r12.f4257u = r10
        L52:
            long r10 = r12.f4257u
            long r6 = r6 + r10
        L55:
            int r4 = B1.K.a
            r10 = 29
            if (r4 > r10) goto L73
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L71
            long r10 = r12.f4255s
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L71
            r4 = 3
            if (r5 != r4) goto L71
            long r4 = r12.f4261y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L8f
            r12.f4261y = r0
            goto L8f
        L71:
            r12.f4261y = r2
        L73:
            long r2 = r12.f4255s
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L8d
            boolean r4 = r12.f4236G
            if (r4 == 0) goto L86
            long r4 = r12.f4237H
            long r4 = r4 + r2
            r12.f4237H = r4
            r2 = 0
            r12.f4236G = r2
            goto L8d
        L86:
            long r2 = r12.f4256t
            r4 = 1
            long r2 = r2 + r4
            r12.f4256t = r2
        L8d:
            r12.f4255s = r6
        L8f:
            r12.f4254r = r0
        L91:
            long r0 = r12.f4255s
            long r2 = r12.f4237H
            long r0 = r0 + r2
            long r2 = r12.f4256t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.r.b():long");
    }

    public final long c() {
        AudioTrack audioTrack = this.f4239c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.f4262z;
        }
        this.I.getClass();
        return this.f4262z + K.L(K.t(this.f4245i, K.F(SystemClock.elapsedRealtime()) - this.f4260x), this.f4242f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j7) {
        long jA = a();
        int i7 = this.f4242f;
        int i8 = K.a;
        if (j7 > K.L(jA, i7, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.f4243g) {
            return false;
        }
        AudioTrack audioTrack = this.f4239c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && b() == 0;
    }

    public final void e() {
        this.f4247k = 0L;
        this.f4259w = 0;
        this.f4258v = 0;
        this.f4248l = 0L;
        this.f4232C = 0L;
        this.f4235F = 0L;
        this.f4246j = false;
    }
}
