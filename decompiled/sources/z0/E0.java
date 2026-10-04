package z0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import h0.C0981d;
import h0.C0996s;
import h0.InterfaceC0967L;
import o.C1622t;

/* loaded from: classes.dex */
public final class E0 implements InterfaceC2459n0 {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f18582g = true;
    public final RenderNode a;

    /* renamed from: b, reason: collision with root package name */
    public int f18583b;

    /* renamed from: c, reason: collision with root package name */
    public int f18584c;

    /* renamed from: d, reason: collision with root package name */
    public int f18585d;

    /* renamed from: e, reason: collision with root package name */
    public int f18586e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18587f;

    public E0(C2471u c2471u) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", c2471u);
        this.a = renderNodeCreate;
        if (f18582g) {
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
                J0 j02 = J0.a;
                j02.c(renderNodeCreate, j02.a(renderNodeCreate));
                j02.d(renderNodeCreate, j02.b(renderNodeCreate));
            }
            I0.a.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f18582g = false;
        }
    }

    @Override // z0.InterfaceC2459n0
    public final void A(float f5) {
        this.a.setPivotY(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final void B(float f5) {
        this.a.setElevation(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final int C() {
        return this.f18585d;
    }

    @Override // z0.InterfaceC2459n0
    public final boolean D() {
        return this.a.getClipToOutline();
    }

    @Override // z0.InterfaceC2459n0
    public final void E(int i7) {
        this.f18584c += i7;
        this.f18586e += i7;
        this.a.offsetTopAndBottom(i7);
    }

    @Override // z0.InterfaceC2459n0
    public final void F(boolean z7) {
        this.a.setClipToOutline(z7);
    }

    @Override // z0.InterfaceC2459n0
    public final void G(Outline outline) {
        this.a.setOutline(outline);
    }

    @Override // z0.InterfaceC2459n0
    public final void H(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            J0.a.d(this.a, i7);
        }
    }

    @Override // z0.InterfaceC2459n0
    public final boolean I() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // z0.InterfaceC2459n0
    public final void J(C0996s c0996s, InterfaceC0967L interfaceC0967L, C1622t c1622t) {
        Canvas canvasStart = this.a.start(l(), e());
        C0981d c0981d = c0996s.a;
        Canvas canvas = c0981d.a;
        c0981d.a = canvasStart;
        if (interfaceC0967L != null) {
            c0981d.l();
            c0981d.s(interfaceC0967L);
        }
        c1622t.invoke(c0981d);
        if (interfaceC0967L != null) {
            c0981d.i();
        }
        c0996s.a.a = canvas;
        this.a.end(canvasStart);
    }

    @Override // z0.InterfaceC2459n0
    public final void K(Matrix matrix) {
        this.a.getMatrix(matrix);
    }

    @Override // z0.InterfaceC2459n0
    public final float L() {
        return this.a.getElevation();
    }

    @Override // z0.InterfaceC2459n0
    public final float a() {
        return this.a.getAlpha();
    }

    @Override // z0.InterfaceC2459n0
    public final void b() {
        this.a.setRotationX(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void c(float f5) {
        this.a.setAlpha(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final void d() {
        this.a.setTranslationY(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final int e() {
        return this.f18586e - this.f18584c;
    }

    @Override // z0.InterfaceC2459n0
    public final void f() {
        this.a.setRotationY(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void g(float f5) {
        this.a.setScaleX(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final void h() {
        I0.a.a(this.a);
    }

    @Override // z0.InterfaceC2459n0
    public final void i() {
        this.a.setTranslationX(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void j() {
        this.a.setRotation(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void k(float f5) {
        this.a.setScaleY(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final int l() {
        return this.f18585d - this.f18583b;
    }

    @Override // z0.InterfaceC2459n0
    public final void m(float f5) {
        this.a.setCameraDistance(-f5);
    }

    @Override // z0.InterfaceC2459n0
    public final boolean n() {
        return this.a.isValid();
    }

    @Override // z0.InterfaceC2459n0
    public final void o(int i7) {
        this.f18583b += i7;
        this.f18585d += i7;
        this.a.offsetLeftAndRight(i7);
    }

    @Override // z0.InterfaceC2459n0
    public final int p() {
        return this.f18586e;
    }

    @Override // z0.InterfaceC2459n0
    public final boolean q() {
        return this.f18587f;
    }

    @Override // z0.InterfaceC2459n0
    public final void s(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.a);
    }

    @Override // z0.InterfaceC2459n0
    public final int t() {
        return this.f18584c;
    }

    @Override // z0.InterfaceC2459n0
    public final int u() {
        return this.f18583b;
    }

    @Override // z0.InterfaceC2459n0
    public final void v(float f5) {
        this.a.setPivotX(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final void w(boolean z7) {
        this.f18587f = z7;
        this.a.setClipToBounds(z7);
    }

    @Override // z0.InterfaceC2459n0
    public final boolean x(int i7, int i8, int i9, int i10) {
        this.f18583b = i7;
        this.f18584c = i8;
        this.f18585d = i9;
        this.f18586e = i10;
        return this.a.setLeftTopRightBottom(i7, i8, i9, i10);
    }

    @Override // z0.InterfaceC2459n0
    public final void y() {
        this.a.setLayerType(0);
        this.a.setHasOverlappingRendering(true);
    }

    @Override // z0.InterfaceC2459n0
    public final void z(int i7) {
        if (Build.VERSION.SDK_INT >= 28) {
            J0.a.c(this.a, i7);
        }
    }

    @Override // z0.InterfaceC2459n0
    public final void r() {
    }
}
