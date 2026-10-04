package T1;

import B1.AbstractC0015b;
import B1.K;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class v {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final t f8965b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8966c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8967d;

    /* renamed from: e, reason: collision with root package name */
    public Surface f8968e;

    /* renamed from: f, reason: collision with root package name */
    public float f8969f;

    /* renamed from: g, reason: collision with root package name */
    public float f8970g;

    /* renamed from: h, reason: collision with root package name */
    public float f8971h;

    /* renamed from: i, reason: collision with root package name */
    public float f8972i;

    /* renamed from: j, reason: collision with root package name */
    public int f8973j;

    /* renamed from: k, reason: collision with root package name */
    public long f8974k;

    /* renamed from: l, reason: collision with root package name */
    public long f8975l;

    /* renamed from: m, reason: collision with root package name */
    public long f8976m;

    /* renamed from: n, reason: collision with root package name */
    public long f8977n;

    /* renamed from: o, reason: collision with root package name */
    public long f8978o;

    /* renamed from: p, reason: collision with root package name */
    public long f8979p;

    /* renamed from: q, reason: collision with root package name */
    public long f8980q;

    public v(Context context) {
        DisplayManager displayManager;
        e eVar = new e();
        eVar.a = new d();
        eVar.f8867b = new d();
        eVar.f8869d = -9223372036854775807L;
        this.a = eVar;
        t tVar = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new t(this, displayManager);
        this.f8965b = tVar;
        this.f8966c = tVar != null ? u.f8960o : null;
        this.f8974k = -9223372036854775807L;
        this.f8975l = -9223372036854775807L;
        this.f8969f = -1.0f;
        this.f8972i = 1.0f;
        this.f8973j = 0;
    }

    public static void a(v vVar, Display display) {
        vVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            vVar.f8974k = refreshRate;
            vVar.f8975l = (refreshRate * 80) / 100;
        } else {
            AbstractC0015b.v("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            vVar.f8974k = -9223372036854775807L;
            vVar.f8975l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (K.a < 30 || (surface = this.f8968e) == null || this.f8973j == Integer.MIN_VALUE || this.f8971h == 0.0f) {
            return;
        }
        this.f8971h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e7) {
            AbstractC0015b.n("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = B1.K.a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f8968e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            T1.e r0 = r9.a
            T1.d r2 = r0.a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            T1.d r2 = r0.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            T1.d r2 = r0.a
            long r4 = r2.f8863e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f8864f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f8969f
        L3b:
            float r4 = r9.f8970g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            goto L8d
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            T1.d r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            T1.d r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            T1.d r0 = r0.a
            long r0 = r0.f8864f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f8970g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f8870e
            if (r0 < r1) goto L8d
        L87:
            r9.f8970g = r2
            r0 = 0
            r9.d(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.v.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r5) {
        /*
            r4 = this;
            int r0 = B1.K.a
            r1 = 30
            if (r0 < r1) goto L41
            android.view.Surface r0 = r4.f8968e
            if (r0 == 0) goto L41
            int r1 = r4.f8973j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L41
        L11:
            boolean r1 = r4.f8967d
            r2 = 0
            if (r1 == 0) goto L22
            float r1 = r4.f8970g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L22
            float r3 = r4.f8972i
            float r1 = r1 * r3
            goto L23
        L22:
            r1 = r2
        L23:
            if (r5 != 0) goto L2c
            float r5 = r4.f8971h
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2c
            goto L41
        L2c:
            r4.f8971h = r1
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L34
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            B1.u.o(r0, r1, r5)     // Catch: java.lang.IllegalStateException -> L39
            return
        L39:
            r5 = move-exception
            java.lang.String r0 = "VideoFrameReleaseHelper"
            java.lang.String r1 = "Failed to call Surface.setFrameRate"
            B1.AbstractC0015b.n(r0, r1, r5)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.v.d(boolean):void");
    }
}
