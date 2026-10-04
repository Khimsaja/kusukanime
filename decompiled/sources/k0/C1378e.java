package k0;

import D.C0042b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.AbstractC0982e;
import h0.C0981d;
import h0.C0996s;
import h0.C0998u;
import h0.InterfaceC0995r;
import j0.C1295a;
import j0.C1296b;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.AbstractC1420H;
import z0.C2471u;

/* renamed from: k0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1378e implements InterfaceC1377d {

    /* renamed from: v, reason: collision with root package name */
    public static final AtomicBoolean f12586v = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final C0996s f12587b;

    /* renamed from: c, reason: collision with root package name */
    public final C1296b f12588c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f12589d;

    /* renamed from: e, reason: collision with root package name */
    public long f12590e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f12591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12592g;

    /* renamed from: h, reason: collision with root package name */
    public long f12593h;

    /* renamed from: i, reason: collision with root package name */
    public int f12594i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12595j;

    /* renamed from: k, reason: collision with root package name */
    public float f12596k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f12597l;

    /* renamed from: m, reason: collision with root package name */
    public float f12598m;

    /* renamed from: n, reason: collision with root package name */
    public float f12599n;

    /* renamed from: o, reason: collision with root package name */
    public float f12600o;

    /* renamed from: p, reason: collision with root package name */
    public long f12601p;

    /* renamed from: q, reason: collision with root package name */
    public long f12602q;

    /* renamed from: r, reason: collision with root package name */
    public float f12603r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f12604s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12605t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12606u;

    public C1378e(C2471u c2471u, C0996s c0996s, C1296b c1296b) {
        this.f12587b = c0996s;
        this.f12588c = c1296b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", c2471u);
        this.f12589d = renderNodeCreate;
        this.f12590e = 0L;
        this.f12593h = 0L;
        if (f12586v.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                l lVar = l.a;
                lVar.c(renderNodeCreate, lVar.a(renderNodeCreate));
                lVar.d(renderNodeCreate, lVar.b(renderNodeCreate));
            }
            C1384k.a.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        l(0);
        this.f12594i = 0;
        this.f12595j = 3;
        this.f12596k = 1.0f;
        this.f12598m = 1.0f;
        this.f12599n = 1.0f;
        long j7 = C0998u.f11829b;
        this.f12601p = j7;
        this.f12602q = j7;
        this.f12603r = 8.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void A(int i7) {
        this.f12594i = i7;
        if (i7 != 1 && this.f12595j == 3) {
            l(i7);
        } else {
            l(1);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void B(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12602q = j7;
            l.a.d(this.f12589d, AbstractC0968M.w(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final Matrix C() {
        Matrix matrix = this.f12591f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f12591f = matrix;
        }
        this.f12589d.getMatrix(matrix);
        return matrix;
    }

    @Override // k0.InterfaceC1377d
    public final void D(T0.b bVar, T0.k kVar, C1375b c1375b, C0042b c0042b) {
        Canvas canvasStart = this.f12589d.start(Math.max((int) (this.f12590e >> 32), (int) (this.f12593h >> 32)), Math.max((int) (this.f12590e & 4294967295L), (int) (this.f12593h & 4294967295L)));
        try {
            C0981d c0981d = this.f12587b.a;
            Canvas canvas = c0981d.a;
            c0981d.a = canvasStart;
            C1296b c1296b = this.f12588c;
            B2.l lVar = c1296b.f12205l;
            long jO = AbstractC1420H.O(this.f12590e);
            C1295a c1295a = ((C1296b) lVar.f418n).f12204k;
            T0.b bVar2 = c1295a.a;
            T0.k kVar2 = c1295a.f12201b;
            InterfaceC0995r interfaceC0995rT = lVar.t();
            long jA = lVar.A();
            C1375b c1375b2 = (C1375b) lVar.f417m;
            lVar.N(bVar);
            lVar.O(kVar);
            lVar.M(c0981d);
            lVar.P(jO);
            lVar.f417m = c1375b;
            c0981d.l();
            try {
                c0042b.invoke(c1296b);
                c0981d.i();
                lVar.N(bVar2);
                lVar.O(kVar2);
                lVar.M(interfaceC0995rT);
                lVar.P(jA);
                lVar.f417m = c1375b2;
                c0981d.a = canvas;
                this.f12589d.end(canvasStart);
            } catch (Throwable th) {
                c0981d.i();
                lVar.N(bVar2);
                lVar.O(kVar2);
                lVar.M(interfaceC0995rT);
                lVar.P(jA);
                lVar.f417m = c1375b2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f12589d.end(canvasStart);
            throw th2;
        }
    }

    @Override // k0.InterfaceC1377d
    public final void E(int i7, int i8, long j7) {
        int i9 = (int) (j7 >> 32);
        int i10 = (int) (4294967295L & j7);
        this.f12589d.setLeftTopRightBottom(i7, i8, i7 + i9, i8 + i10);
        if (T0.j.a(this.f12590e, j7)) {
            return;
        }
        if (this.f12597l) {
            this.f12589d.setPivotX(i9 / 2.0f);
            this.f12589d.setPivotY(i10 / 2.0f);
        }
        this.f12590e = j7;
    }

    @Override // k0.InterfaceC1377d
    public final float F() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final float G() {
        return this.f12600o;
    }

    @Override // k0.InterfaceC1377d
    public final float H() {
        return this.f12599n;
    }

    @Override // k0.InterfaceC1377d
    public final float I() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final int J() {
        return this.f12595j;
    }

    @Override // k0.InterfaceC1377d
    public final void K(long j7) {
        if (AbstractC0832b.y(j7)) {
            this.f12597l = true;
            this.f12589d.setPivotX(((int) (this.f12590e >> 32)) / 2.0f);
            this.f12589d.setPivotY(((int) (this.f12590e & 4294967295L)) / 2.0f);
        } else {
            this.f12597l = false;
            this.f12589d.setPivotX(g0.c.d(j7));
            this.f12589d.setPivotY(g0.c.e(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final long L() {
        return this.f12601p;
    }

    @Override // k0.InterfaceC1377d
    public final float a() {
        return this.f12596k;
    }

    @Override // k0.InterfaceC1377d
    public final void b() {
        this.f12589d.setRotationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void c(float f5) {
        this.f12596k = f5;
        this.f12589d.setAlpha(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void d() {
        this.f12589d.setTranslationY(0.0f);
    }

    public final void e() {
        boolean z7 = this.f12604s;
        boolean z8 = false;
        boolean z9 = z7 && !this.f12592g;
        if (z7 && this.f12592g) {
            z8 = true;
        }
        if (z9 != this.f12605t) {
            this.f12605t = z9;
            this.f12589d.setClipToBounds(z9);
        }
        if (z8 != this.f12606u) {
            this.f12606u = z8;
            this.f12589d.setClipToOutline(z8);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void f() {
        this.f12589d.setRotationY(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void g(float f5) {
        this.f12598m = f5;
        this.f12589d.setScaleX(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void h() {
        C1384k.a.a(this.f12589d);
    }

    @Override // k0.InterfaceC1377d
    public final void i() {
        this.f12589d.setTranslationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void j() {
        this.f12589d.setRotation(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void k(float f5) {
        this.f12599n = f5;
        this.f12589d.setScaleY(f5);
    }

    public final void l(int i7) {
        RenderNode renderNode = this.f12589d;
        if (i7 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void m(float f5) {
        this.f12603r = f5;
        this.f12589d.setCameraDistance(-f5);
    }

    @Override // k0.InterfaceC1377d
    public final boolean n() {
        return this.f12589d.isValid();
    }

    @Override // k0.InterfaceC1377d
    public final float o() {
        return this.f12598m;
    }

    @Override // k0.InterfaceC1377d
    public final void p(float f5) {
        this.f12600o = f5;
        this.f12589d.setElevation(f5);
    }

    @Override // k0.InterfaceC1377d
    public final float q() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void r(InterfaceC0995r interfaceC0995r) {
        DisplayListCanvas displayListCanvasA = AbstractC0982e.a(interfaceC0995r);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.view.DisplayListCanvas", displayListCanvasA);
        displayListCanvasA.drawRenderNode(this.f12589d);
    }

    @Override // k0.InterfaceC1377d
    public final long s() {
        return this.f12602q;
    }

    @Override // k0.InterfaceC1377d
    public final void t(long j7) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f12601p = j7;
            l.a.c(this.f12589d, AbstractC0968M.w(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final void u(Outline outline, long j7) {
        this.f12593h = j7;
        this.f12589d.setOutline(outline);
        this.f12592g = outline != null;
        e();
    }

    @Override // k0.InterfaceC1377d
    public final float v() {
        return this.f12603r;
    }

    @Override // k0.InterfaceC1377d
    public final float w() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void x(boolean z7) {
        this.f12604s = z7;
        e();
    }

    @Override // k0.InterfaceC1377d
    public final int y() {
        return this.f12594i;
    }

    @Override // k0.InterfaceC1377d
    public final float z() {
        return 0.0f;
    }
}
