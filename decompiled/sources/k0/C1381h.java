package k0;

import D.C0042b;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.AbstractC0982e;
import h0.C0981d;
import h0.C0996s;
import h0.C0998u;
import h0.InterfaceC0995r;
import j0.C1296b;
import l0.AbstractC1407a;

/* renamed from: k0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381h implements InterfaceC1377d {

    /* renamed from: v, reason: collision with root package name */
    public static final C1380g f12625v = new C1380g();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1407a f12626b;

    /* renamed from: c, reason: collision with root package name */
    public final C0996s f12627c;

    /* renamed from: d, reason: collision with root package name */
    public final m f12628d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f12629e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f12630f;

    /* renamed from: g, reason: collision with root package name */
    public int f12631g;

    /* renamed from: h, reason: collision with root package name */
    public int f12632h;

    /* renamed from: i, reason: collision with root package name */
    public long f12633i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f12634j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12635k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12636l;

    /* renamed from: m, reason: collision with root package name */
    public final int f12637m;

    /* renamed from: n, reason: collision with root package name */
    public int f12638n;

    /* renamed from: o, reason: collision with root package name */
    public float f12639o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12640p;

    /* renamed from: q, reason: collision with root package name */
    public float f12641q;

    /* renamed from: r, reason: collision with root package name */
    public float f12642r;

    /* renamed from: s, reason: collision with root package name */
    public float f12643s;

    /* renamed from: t, reason: collision with root package name */
    public long f12644t;

    /* renamed from: u, reason: collision with root package name */
    public long f12645u;

    public C1381h(AbstractC1407a abstractC1407a) {
        C0996s c0996s = new C0996s();
        C1296b c1296b = new C1296b();
        this.f12626b = abstractC1407a;
        this.f12627c = c0996s;
        m mVar = new m(abstractC1407a, c0996s, c1296b);
        this.f12628d = mVar;
        this.f12629e = abstractC1407a.getResources();
        this.f12630f = new Rect();
        abstractC1407a.addView(mVar);
        mVar.setClipBounds(null);
        this.f12633i = 0L;
        View.generateViewId();
        this.f12637m = 3;
        this.f12638n = 0;
        this.f12639o = 1.0f;
        this.f12641q = 1.0f;
        this.f12642r = 1.0f;
        long j7 = C0998u.f11829b;
        this.f12644t = j7;
        this.f12645u = j7;
    }

    @Override // k0.InterfaceC1377d
    public final void A(int i7) {
        this.f12638n = i7;
        m mVar = this.f12628d;
        boolean z7 = true;
        if (i7 == 1 || this.f12637m != 3) {
            mVar.setLayerType(2, null);
            mVar.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i7 == 1) {
            mVar.setLayerType(2, null);
        } else if (i7 == 2) {
            mVar.setLayerType(0, null);
            z7 = false;
        } else {
            mVar.setLayerType(0, null);
        }
        mVar.setCanUseCompositingLayer$ui_graphics_release(z7);
    }

    @Override // k0.InterfaceC1377d
    public final void B(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12645u = j7;
            this.f12628d.setOutlineSpotShadowColor(AbstractC0968M.w(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final Matrix C() {
        return this.f12628d.getMatrix();
    }

    @Override // k0.InterfaceC1377d
    public final void D(T0.b bVar, T0.k kVar, C1375b c1375b, C0042b c0042b) {
        m mVar = this.f12628d;
        ViewParent parent = mVar.getParent();
        AbstractC1407a abstractC1407a = this.f12626b;
        if (parent == null) {
            abstractC1407a.addView(mVar);
        }
        mVar.f12653q = bVar;
        mVar.f12654r = kVar;
        mVar.f12655s = c0042b;
        mVar.f12656t = c1375b;
        if (mVar.isAttachedToWindow()) {
            mVar.setVisibility(4);
            mVar.setVisibility(0);
            try {
                C0996s c0996s = this.f12627c;
                C1380g c1380g = f12625v;
                C0981d c0981d = c0996s.a;
                Canvas canvas = c0981d.a;
                c0981d.a = c1380g;
                abstractC1407a.a(c0981d, mVar, mVar.getDrawingTime());
                c0996s.a.a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // k0.InterfaceC1377d
    public final void E(int i7, int i8, long j7) {
        boolean zA = T0.j.a(this.f12633i, j7);
        m mVar = this.f12628d;
        if (zA) {
            int i9 = this.f12631g;
            if (i9 != i7) {
                mVar.offsetLeftAndRight(i7 - i9);
            }
            int i10 = this.f12632h;
            if (i10 != i8) {
                mVar.offsetTopAndBottom(i8 - i10);
            }
        } else {
            if (this.f12636l || mVar.getClipToOutline()) {
                this.f12634j = true;
            }
            int i11 = (int) (j7 >> 32);
            int i12 = (int) (4294967295L & j7);
            mVar.layout(i7, i8, i7 + i11, i8 + i12);
            this.f12633i = j7;
            if (this.f12640p) {
                mVar.setPivotX(i11 / 2.0f);
                mVar.setPivotY(i12 / 2.0f);
            }
        }
        this.f12631g = i7;
        this.f12632h = i8;
    }

    @Override // k0.InterfaceC1377d
    public final float F() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final float G() {
        return this.f12643s;
    }

    @Override // k0.InterfaceC1377d
    public final float H() {
        return this.f12642r;
    }

    @Override // k0.InterfaceC1377d
    public final float I() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final int J() {
        return this.f12637m;
    }

    @Override // k0.InterfaceC1377d
    public final void K(long j7) {
        boolean zY = AbstractC0832b.y(j7);
        m mVar = this.f12628d;
        if (!zY) {
            this.f12640p = false;
            mVar.setPivotX(g0.c.d(j7));
            mVar.setPivotY(g0.c.e(j7));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                mVar.resetPivot();
                return;
            }
            this.f12640p = true;
            mVar.setPivotX(((int) (this.f12633i >> 32)) / 2.0f);
            mVar.setPivotY(((int) (this.f12633i & 4294967295L)) / 2.0f);
        }
    }

    @Override // k0.InterfaceC1377d
    public final long L() {
        return this.f12644t;
    }

    @Override // k0.InterfaceC1377d
    public final float a() {
        return this.f12639o;
    }

    @Override // k0.InterfaceC1377d
    public final void b() {
        this.f12628d.setRotationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void c(float f5) {
        this.f12639o = f5;
        this.f12628d.setAlpha(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void d() {
        this.f12628d.setTranslationY(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void f() {
        this.f12628d.setRotationY(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void g(float f5) {
        this.f12641q = f5;
        this.f12628d.setScaleX(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void h() {
        this.f12626b.removeViewInLayout(this.f12628d);
    }

    @Override // k0.InterfaceC1377d
    public final void i() {
        this.f12628d.setTranslationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void j() {
        this.f12628d.setRotation(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void k(float f5) {
        this.f12642r = f5;
        this.f12628d.setScaleY(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void m(float f5) {
        this.f12628d.setCameraDistance(f5 * this.f12629e.getDisplayMetrics().densityDpi);
    }

    @Override // k0.InterfaceC1377d
    public final float o() {
        return this.f12641q;
    }

    @Override // k0.InterfaceC1377d
    public final void p(float f5) {
        this.f12643s = f5;
        this.f12628d.setElevation(f5);
    }

    @Override // k0.InterfaceC1377d
    public final float q() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void r(InterfaceC0995r interfaceC0995r) {
        Rect rect;
        boolean z7 = this.f12634j;
        m mVar = this.f12628d;
        if (z7) {
            if ((this.f12636l || mVar.getClipToOutline()) && !this.f12635k) {
                rect = this.f12630f;
                rect.left = 0;
                rect.top = 0;
                rect.right = mVar.getWidth();
                rect.bottom = mVar.getHeight();
            } else {
                rect = null;
            }
            mVar.setClipBounds(rect);
        }
        if (AbstractC0982e.a(interfaceC0995r).isHardwareAccelerated()) {
            this.f12626b.a(interfaceC0995r, mVar, mVar.getDrawingTime());
        }
    }

    @Override // k0.InterfaceC1377d
    public final long s() {
        return this.f12645u;
    }

    @Override // k0.InterfaceC1377d
    public final void t(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12644t = j7;
            this.f12628d.setOutlineAmbientShadowColor(AbstractC0968M.w(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final void u(Outline outline, long j7) {
        m mVar = this.f12628d;
        mVar.f12651o = outline;
        mVar.invalidateOutline();
        if ((this.f12636l || mVar.getClipToOutline()) && outline != null) {
            mVar.setClipToOutline(true);
            if (this.f12636l) {
                this.f12636l = false;
                this.f12634j = true;
            }
        }
        this.f12635k = outline != null;
    }

    @Override // k0.InterfaceC1377d
    public final float v() {
        return this.f12628d.getCameraDistance() / this.f12629e.getDisplayMetrics().densityDpi;
    }

    @Override // k0.InterfaceC1377d
    public final float w() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void x(boolean z7) {
        boolean z8 = false;
        this.f12636l = z7 && !this.f12635k;
        this.f12634j = true;
        if (z7 && this.f12635k) {
            z8 = true;
        }
        this.f12628d.setClipToOutline(z8);
    }

    @Override // k0.InterfaceC1377d
    public final int y() {
        return this.f12638n;
    }

    @Override // k0.InterfaceC1377d
    public final float z() {
        return 0.0f;
    }
}
