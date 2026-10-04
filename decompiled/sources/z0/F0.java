package z0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import h0.C0981d;
import h0.C0996s;
import h0.InterfaceC0967L;
import o.C1622t;

/* loaded from: classes.dex */
public final class F0 implements InterfaceC2459n0 {
    public final RenderNode a = n6.k.v();

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
        return this.a.getRight();
    }

    @Override // z0.InterfaceC2459n0
    public final boolean D() {
        return this.a.getClipToOutline();
    }

    @Override // z0.InterfaceC2459n0
    public final void E(int i7) {
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
        this.a.setSpotShadowColor(i7);
    }

    @Override // z0.InterfaceC2459n0
    public final boolean I() {
        return this.a.setHasOverlappingRendering(true);
    }

    @Override // z0.InterfaceC2459n0
    public final void J(C0996s c0996s, InterfaceC0967L interfaceC0967L, C1622t c1622t) {
        RecordingCanvas recordingCanvasBeginRecording = this.a.beginRecording();
        C0981d c0981d = c0996s.a;
        Canvas canvas = c0981d.a;
        c0981d.a = recordingCanvasBeginRecording;
        if (interfaceC0967L != null) {
            c0981d.l();
            c0981d.s(interfaceC0967L);
        }
        c1622t.invoke(c0981d);
        if (interfaceC0967L != null) {
            c0981d.i();
        }
        c0996s.a.a = canvas;
        this.a.endRecording();
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
        return this.a.getHeight();
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
        this.a.discardDisplayList();
    }

    @Override // z0.InterfaceC2459n0
    public final void i() {
        this.a.setTranslationX(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void j() {
        this.a.setRotationZ(0.0f);
    }

    @Override // z0.InterfaceC2459n0
    public final void k(float f5) {
        this.a.setScaleY(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final int l() {
        return this.a.getWidth();
    }

    @Override // z0.InterfaceC2459n0
    public final void m(float f5) {
        this.a.setCameraDistance(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final boolean n() {
        return this.a.hasDisplayList();
    }

    @Override // z0.InterfaceC2459n0
    public final void o(int i7) {
        this.a.offsetLeftAndRight(i7);
    }

    @Override // z0.InterfaceC2459n0
    public final int p() {
        return this.a.getBottom();
    }

    @Override // z0.InterfaceC2459n0
    public final boolean q() {
        return this.a.getClipToBounds();
    }

    @Override // z0.InterfaceC2459n0
    public final void r() {
        if (Build.VERSION.SDK_INT >= 31) {
            G0.a.a(this.a, null);
        }
    }

    @Override // z0.InterfaceC2459n0
    public final void s(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // z0.InterfaceC2459n0
    public final int t() {
        return this.a.getTop();
    }

    @Override // z0.InterfaceC2459n0
    public final int u() {
        return this.a.getLeft();
    }

    @Override // z0.InterfaceC2459n0
    public final void v(float f5) {
        this.a.setPivotX(f5);
    }

    @Override // z0.InterfaceC2459n0
    public final void w(boolean z7) {
        this.a.setClipToBounds(z7);
    }

    @Override // z0.InterfaceC2459n0
    public final boolean x(int i7, int i8, int i9, int i10) {
        return this.a.setPosition(i7, i8, i9, i10);
    }

    @Override // z0.InterfaceC2459n0
    public final void y() {
        RenderNode renderNode = this.a;
        renderNode.setUseCompositingLayer(false, null);
        renderNode.setHasOverlappingRendering(true);
    }

    @Override // z0.InterfaceC2459n0
    public final void z(int i7) {
        this.a.setAmbientShadowColor(i7);
    }
}
