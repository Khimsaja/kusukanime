package k0;

import D.C0042b;
import H1.e0;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import f6.AbstractC0915m;
import g0.AbstractC0932a;
import h0.AbstractC0966K;
import h0.C0963H;
import h0.C0964I;
import h0.C0965J;
import h0.C0987j;
import j0.AbstractC1297c;
import l4.AbstractC1420H;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1375b {
    public final InterfaceC1377d a;

    /* renamed from: f, reason: collision with root package name */
    public Outline f12568f;

    /* renamed from: j, reason: collision with root package name */
    public float f12572j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC0966K f12573k;

    /* renamed from: l, reason: collision with root package name */
    public C0987j f12574l;

    /* renamed from: m, reason: collision with root package name */
    public C0987j f12575m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f12576n;

    /* renamed from: o, reason: collision with root package name */
    public e0 f12577o;

    /* renamed from: p, reason: collision with root package name */
    public int f12578p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12580r;

    /* renamed from: s, reason: collision with root package name */
    public long f12581s;

    /* renamed from: t, reason: collision with root package name */
    public long f12582t;

    /* renamed from: u, reason: collision with root package name */
    public long f12583u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f12584v;

    /* renamed from: w, reason: collision with root package name */
    public RectF f12585w;

    /* renamed from: b, reason: collision with root package name */
    public T0.b f12564b = AbstractC1297c.a;

    /* renamed from: c, reason: collision with root package name */
    public T0.k f12565c = T0.k.f8844k;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.m f12566d = C1374a.f12561m;

    /* renamed from: e, reason: collision with root package name */
    public final C0042b f12567e = new C0042b(27, this);

    /* renamed from: g, reason: collision with root package name */
    public boolean f12569g = true;

    /* renamed from: h, reason: collision with root package name */
    public long f12570h = 0;

    /* renamed from: i, reason: collision with root package name */
    public long f12571i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    public final F1.m f12579q = new F1.m();

    static {
        int i7 = AbstractC1382i.a;
        int i8 = AbstractC1382i.a;
    }

    public C1375b(InterfaceC1377d interfaceC1377d) {
        this.a = interfaceC1377d;
        interfaceC1377d.x(false);
        this.f12581s = 0L;
        this.f12582t = 0L;
        this.f12583u = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.f12569g) {
            boolean z7 = this.f12584v;
            InterfaceC1377d interfaceC1377d = this.a;
            Outline outline2 = null;
            if (z7 || interfaceC1377d.G() > 0.0f) {
                C0987j c0987j = this.f12574l;
                if (c0987j != null) {
                    RectF rectF = this.f12585w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f12585w = rectF;
                    }
                    Path path = c0987j.a;
                    path.computeBounds(rectF, false);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 > 28 || path.isConvex()) {
                        outline = this.f12568f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f12568f = outline;
                        }
                        if (i7 >= 30) {
                            C1383j.a.a(outline, c0987j);
                        } else {
                            outline.setConvexPath(path);
                        }
                        this.f12576n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f12568f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f12576n = true;
                        outline = null;
                    }
                    this.f12574l = c0987j;
                    if (outline != null) {
                        outline.setAlpha(interfaceC1377d.a());
                        outline2 = outline;
                    }
                    interfaceC1377d.u(outline2, AbstractC1420H.a(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f12576n && this.f12584v) {
                        interfaceC1377d.x(false);
                        interfaceC1377d.h();
                    } else {
                        interfaceC1377d.x(this.f12584v);
                    }
                } else {
                    interfaceC1377d.x(this.f12584v);
                    Outline outline4 = this.f12568f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f12568f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jO = AbstractC1420H.O(this.f12582t);
                    long j7 = this.f12570h;
                    long j8 = this.f12571i;
                    long j9 = j8 == 9205357640488583168L ? jO : j8;
                    outline5.setRoundRect(Math.round(g0.c.d(j7)), Math.round(g0.c.e(j7)), Math.round(g0.f.d(j9) + g0.c.d(j7)), Math.round(g0.f.b(j9) + g0.c.e(j7)), this.f12572j);
                    outline5.setAlpha(interfaceC1377d.a());
                    interfaceC1377d.u(outline5, (Math.round(g0.f.d(j9)) << 32) | (Math.round(g0.f.b(j9)) & 4294967295L));
                }
            } else {
                interfaceC1377d.x(false);
                interfaceC1377d.u(null, 0L);
            }
        }
        this.f12569g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.f12580r
            if (r0 == 0) goto L69
            int r0 = r15.f12578p
            if (r0 != 0) goto L69
            F1.m r0 = r15.f12579q
            java.lang.Object r1 = r0.f2205b
            k0.b r1 = (k0.C1375b) r1
            if (r1 == 0) goto L16
            r1.d()
            r1 = 0
            r0.f2205b = r1
        L16:
            java.lang.Object r0 = r0.f2207d
            m.B r0 = (m.C1472B) r0
            if (r0 == 0) goto L64
            java.lang.Object[] r1 = r0.f12864b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L61
            r4 = 0
            r5 = r4
        L27:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L5c
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L41:
            if (r10 >= r8) goto L5a
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L56
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            k0.b r11 = (k0.C1375b) r11
            r11.d()
        L56:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L41
        L5a:
            if (r8 != r9) goto L61
        L5c:
            if (r5 == r3) goto L61
            int r5 = r5 + 1
            goto L27
        L61:
            r0.b()
        L64:
            k0.d r0 = r15.a
            r0.h()
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1375b.b():void");
    }

    public final AbstractC0966K c() {
        AbstractC0966K c0964i;
        AbstractC0966K abstractC0966K = this.f12573k;
        C0987j c0987j = this.f12574l;
        if (abstractC0966K != null) {
            return abstractC0966K;
        }
        if (c0987j != null) {
            C0963H c0963h = new C0963H(c0987j);
            this.f12573k = c0963h;
            return c0963h;
        }
        long jO = AbstractC1420H.O(this.f12582t);
        long j7 = this.f12570h;
        long j8 = this.f12571i;
        if (j8 != 9205357640488583168L) {
            jO = j8;
        }
        float fD = g0.c.d(j7);
        float fE = g0.c.e(j7);
        float fD2 = g0.f.d(jO) + fD;
        float fB = g0.f.b(jO) + fE;
        float f5 = this.f12572j;
        if (f5 > 0.0f) {
            long jA = AbstractC0915m.a(f5, f5);
            long jA2 = AbstractC0915m.a(AbstractC0932a.b(jA), AbstractC0932a.c(jA));
            c0964i = new C0965J(new g0.e(fD, fE, fD2, fB, jA2, jA2, jA2, jA2));
        } else {
            c0964i = new C0964I(new g0.d(fD, fE, fD2, fB));
        }
        this.f12573k = c0964i;
        return c0964i;
    }

    public final void d() {
        this.f12578p--;
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            F1.m r2 = r0.f12579q
            java.lang.Object r3 = r2.f2205b
            k0.b r3 = (k0.C1375b) r3
            r2.f2206c = r3
            java.lang.Object r3 = r2.f2207d
            m.B r3 = (m.C1472B) r3
            if (r3 == 0) goto L2c
            boolean r4 = r3.h()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r2.f2208e
            m.B r4 = (m.C1472B) r4
            if (r4 != 0) goto L26
            int r4 = m.AbstractC1476F.a
            m.B r4 = new m.B
            r4.<init>()
            r2.f2208e = r4
        L26:
            r4.i(r3)
            r3.b()
        L2c:
            r2.a = r1
            T0.b r3 = r0.f12564b
            T0.k r4 = r0.f12565c
            D.b r5 = r0.f12567e
            k0.d r6 = r0.a
            r6.D(r3, r4, r0, r5)
            r3 = 0
            r2.a = r3
            java.lang.Object r4 = r2.f2206c
            k0.b r4 = (k0.C1375b) r4
            if (r4 == 0) goto L45
            r4.d()
        L45:
            java.lang.Object r2 = r2.f2208e
            m.B r2 = (m.C1472B) r2
            if (r2 == 0) goto L96
            boolean r4 = r2.h()
            if (r4 == 0) goto L96
            java.lang.Object[] r4 = r2.f12864b
            long[] r5 = r2.a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L93
            r7 = r3
        L5b:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8f
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L75:
            if (r12 >= r10) goto L8d
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            k0.b r13 = (k0.C1375b) r13
            r13.d()
        L8a:
            long r8 = r8 >> r11
            int r12 = r12 + r1
            goto L75
        L8d:
            if (r10 != r11) goto L93
        L8f:
            if (r7 == r6) goto L93
            int r7 = r7 + r1
            goto L5b
        L93:
            r2.b()
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C1375b.e():void");
    }

    public final void f(float f5, long j7, long j8) {
        if (g0.c.b(this.f12570h, j7) && g0.f.a(this.f12571i, j8) && this.f12572j == f5 && this.f12574l == null) {
            return;
        }
        this.f12573k = null;
        this.f12574l = null;
        this.f12569g = true;
        this.f12576n = false;
        this.f12570h = j7;
        this.f12571i = j8;
        this.f12572j = f5;
        a();
    }
}
