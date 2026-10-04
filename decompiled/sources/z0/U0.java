package z0;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import h0.AbstractC0966K;
import h0.AbstractC0968M;
import h0.C0962G;
import h0.C0970O;
import h0.C0976V;
import h0.C0981d;
import h0.C0996s;
import h0.InterfaceC0967L;
import h0.InterfaceC0995r;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k0.C1375b;
import r0.C1861b;

/* loaded from: classes.dex */
public final class U0 extends View implements y0.d0 {

    /* renamed from: A, reason: collision with root package name */
    public static Method f18682A;

    /* renamed from: B, reason: collision with root package name */
    public static Field f18683B;

    /* renamed from: C, reason: collision with root package name */
    public static boolean f18684C;

    /* renamed from: D, reason: collision with root package name */
    public static boolean f18685D;

    /* renamed from: z, reason: collision with root package name */
    public static final L.N0 f18686z = new L.N0(4);

    /* renamed from: k, reason: collision with root package name */
    public final C2471u f18687k;

    /* renamed from: l, reason: collision with root package name */
    public final C2466r0 f18688l;

    /* renamed from: m, reason: collision with root package name */
    public D.S f18689m;

    /* renamed from: n, reason: collision with root package name */
    public C1861b f18690n;

    /* renamed from: o, reason: collision with root package name */
    public final A0 f18691o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f18692p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f18693q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18694r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f18695s;

    /* renamed from: t, reason: collision with root package name */
    public final C0996s f18696t;

    /* renamed from: u, reason: collision with root package name */
    public final M2.a f18697u;

    /* renamed from: v, reason: collision with root package name */
    public long f18698v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18699w;

    /* renamed from: x, reason: collision with root package name */
    public final long f18700x;

    /* renamed from: y, reason: collision with root package name */
    public int f18701y;

    public U0(C2471u c2471u, C2466r0 c2466r0, D.S s7, C1861b c1861b) {
        super(c2471u.getContext());
        this.f18687k = c2471u;
        this.f18688l = c2466r0;
        this.f18689m = s7;
        this.f18690n = c1861b;
        this.f18691o = new A0();
        this.f18696t = new C0996s();
        this.f18697u = new M2.a(C2449i0.f18770o);
        this.f18698v = C0976V.f11815b;
        this.f18699w = true;
        setWillNotDraw(false);
        c2466r0.addView(this);
        this.f18700x = View.generateViewId();
    }

    private final InterfaceC0967L getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        A0 a02 = this.f18691o;
        if (!a02.f18554g) {
            return null;
        }
        a02.d();
        return a02.f18552e;
    }

    private final void setInvalidated(boolean z7) {
        if (z7 != this.f18694r) {
            this.f18694r = z7;
            this.f18687k.r(this, z7);
        }
    }

    @Override // y0.d0
    public final void a(D.S s7, C1861b c1861b) {
        this.f18688l.addView(this);
        this.f18692p = false;
        this.f18695s = false;
        this.f18698v = C0976V.f11815b;
        this.f18689m = s7;
        this.f18690n = c1861b;
    }

    @Override // y0.d0
    public final long b(long j7, boolean z7) {
        M2.a aVar = this.f18697u;
        if (!z7) {
            return C0962G.b(j7, aVar.b(this));
        }
        float[] fArrA = aVar.a(this);
        if (fArrA != null) {
            return C0962G.b(j7, fArrA);
        }
        return 9187343241974906880L;
    }

    @Override // y0.d0
    public final void c(long j7) {
        int i7 = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        if (i7 == getWidth() && i8 == getHeight()) {
            return;
        }
        setPivotX(C0976V.b(this.f18698v) * i7);
        setPivotY(C0976V.c(this.f18698v) * i8);
        setOutlineProvider(this.f18691o.b() != null ? f18686z : null);
        layout(getLeft(), getTop(), getLeft() + i7, getTop() + i8);
        m();
        this.f18697u.c();
    }

    @Override // y0.d0
    public final void d(float[] fArr) {
        C0962G.g(fArr, this.f18697u.b(this));
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        boolean z7;
        C0996s c0996s = this.f18696t;
        C0981d c0981d = c0996s.a;
        Canvas canvas2 = c0981d.a;
        c0981d.a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z7 = false;
        } else {
            c0981d.l();
            this.f18691o.a(c0981d);
            z7 = true;
        }
        D.S s7 = this.f18689m;
        if (s7 != null) {
            s7.invoke(c0981d, null);
        }
        if (z7) {
            c0981d.i();
        }
        c0996s.a.a = canvas2;
        setInvalidated(false);
    }

    @Override // y0.d0
    public final void e(InterfaceC0995r interfaceC0995r, C1375b c1375b) {
        boolean z7 = getElevation() > 0.0f;
        this.f18695s = z7;
        if (z7) {
            interfaceC0995r.p();
        }
        this.f18688l.a(interfaceC0995r, this, getDrawingTime());
        if (this.f18695s) {
            interfaceC0995r.m();
        }
    }

    @Override // y0.d0
    public final void f(float[] fArr) {
        float[] fArrA = this.f18697u.a(this);
        if (fArrA != null) {
            C0962G.g(fArr, fArrA);
        }
    }

    @Override // y0.d0
    public final void g(g0.b bVar, boolean z7) {
        M2.a aVar = this.f18697u;
        if (!z7) {
            C0962G.c(aVar.b(this), bVar);
            return;
        }
        float[] fArrA = aVar.a(this);
        if (fArrA != null) {
            C0962G.c(fArrA, bVar);
            return;
        }
        bVar.a = 0.0f;
        bVar.f11655b = 0.0f;
        bVar.f11656c = 0.0f;
        bVar.f11657d = 0.0f;
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C2466r0 getContainer() {
        return this.f18688l;
    }

    public long getLayerId() {
        return this.f18700x;
    }

    public final C2471u getOwnerView() {
        return this.f18687k;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return T0.a(this.f18687k);
        }
        return -1L;
    }

    @Override // y0.d0
    public final void h() {
        setInvalidated(false);
        C2471u c2471u = this.f18687k;
        c2471u.J = true;
        this.f18689m = null;
        this.f18690n = null;
        c2471u.z(this);
        this.f18688l.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f18699w;
    }

    @Override // y0.d0
    public final void i(long j7) {
        int i7 = (int) (j7 >> 32);
        int left = getLeft();
        M2.a aVar = this.f18697u;
        if (i7 != left) {
            offsetLeftAndRight(i7 - getLeft());
            aVar.c();
        }
        int i8 = (int) (j7 & 4294967295L);
        if (i8 != getTop()) {
            offsetTopAndBottom(i8 - getTop());
            aVar.c();
        }
    }

    @Override // android.view.View, y0.d0
    public final void invalidate() {
        if (this.f18694r) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f18687k.invalidate();
    }

    @Override // y0.d0
    public final void j() {
        if (!this.f18694r || f18685D) {
            return;
        }
        O.D(this);
        setInvalidated(false);
    }

    @Override // y0.d0
    public final boolean k(long j7) {
        AbstractC0966K abstractC0966K;
        float fD = g0.c.d(j7);
        float fE = g0.c.e(j7);
        if (this.f18692p) {
            if (0.0f > fD || fD >= getWidth() || 0.0f > fE || fE >= getHeight()) {
                return false;
            }
        } else if (getClipToOutline()) {
            A0 a02 = this.f18691o;
            if (a02.f18560m && (abstractC0966K = a02.f18550c) != null) {
                return O.v(abstractC0966K, g0.c.d(j7), g0.c.e(j7));
            }
            return true;
        }
        return true;
    }

    @Override // y0.d0
    public final void l(C0970O c0970o) {
        C1861b c1861b;
        int i7 = c0970o.f11785k | this.f18701y;
        if ((i7 & 4096) != 0) {
            long j7 = c0970o.f11793s;
            this.f18698v = j7;
            setPivotX(C0976V.b(j7) * getWidth());
            setPivotY(C0976V.c(this.f18698v) * getHeight());
        }
        if ((i7 & 1) != 0) {
            setScaleX(c0970o.f11786l);
        }
        if ((i7 & 2) != 0) {
            setScaleY(c0970o.f11787m);
        }
        if ((i7 & 4) != 0) {
            setAlpha(c0970o.f11788n);
        }
        if ((i7 & 8) != 0) {
            setTranslationX(0.0f);
        }
        if ((i7 & 16) != 0) {
            setTranslationY(0.0f);
        }
        if ((i7 & 32) != 0) {
            setElevation(c0970o.f11789o);
        }
        if ((i7 & 1024) != 0) {
            setRotation(0.0f);
        }
        if ((i7 & 256) != 0) {
            setRotationX(0.0f);
        }
        if ((i7 & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i7 & 2048) != 0) {
            setCameraDistancePx(c0970o.f11792r);
        }
        boolean z7 = getManualClipPath() != null;
        boolean z8 = c0970o.f11795u;
        R1.i iVar = AbstractC0968M.a;
        boolean z9 = z8 && c0970o.f11794t != iVar;
        if ((i7 & 24576) != 0) {
            this.f18692p = z8 && c0970o.f11794t == iVar;
            m();
            setClipToOutline(z9);
        }
        boolean zC = this.f18691o.c(c0970o.f11799y, c0970o.f11788n, z9, c0970o.f11789o, c0970o.f11796v);
        A0 a02 = this.f18691o;
        if (a02.f18553f) {
            setOutlineProvider(a02.b() != null ? f18686z : null);
        }
        boolean z10 = getManualClipPath() != null;
        if (z7 != z10 || (z10 && zC)) {
            invalidate();
        }
        if (!this.f18695s && getElevation() > 0.0f && (c1861b = this.f18690n) != null) {
            c1861b.invoke();
        }
        if ((i7 & 7963) != 0) {
            this.f18697u.c();
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = i7 & 64;
            W0 w02 = W0.a;
            if (i9 != 0) {
                w02.a(this, AbstractC0968M.w(c0970o.f11790p));
            }
            if ((i7 & 128) != 0) {
                w02.b(this, AbstractC0968M.w(c0970o.f11791q));
            }
        }
        if (i8 >= 31 && (131072 & i7) != 0) {
            X0.a.a(this, null);
        }
        if ((i7 & 32768) != 0) {
            setLayerType(0, null);
            this.f18699w = true;
        }
        this.f18701y = c0970o.f11785k;
    }

    public final void m() {
        Rect rect;
        if (this.f18692p) {
            Rect rect2 = this.f18693q;
            if (rect2 == null) {
                this.f18693q = new Rect(0, 0, getWidth(), getHeight());
            } else {
                kotlin.jvm.internal.l.c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f18693q;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f5) {
        setCameraDistance(f5 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
    }
}
