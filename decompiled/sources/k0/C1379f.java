package k0;

import D.C0042b;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import e5.AbstractC0832b;
import h0.AbstractC0968M;
import h0.AbstractC0982e;
import h0.C0981d;
import h0.C0996s;
import h0.C0998u;
import h0.InterfaceC0995r;
import j0.C1296b;
import j1.AbstractC1301b;
import l4.AbstractC1420H;

/* renamed from: k0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379f implements InterfaceC1377d {

    /* renamed from: b, reason: collision with root package name */
    public final C0996s f12607b;

    /* renamed from: c, reason: collision with root package name */
    public final C1296b f12608c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f12609d;

    /* renamed from: e, reason: collision with root package name */
    public long f12610e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f12611f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12612g;

    /* renamed from: h, reason: collision with root package name */
    public float f12613h;

    /* renamed from: i, reason: collision with root package name */
    public final int f12614i;

    /* renamed from: j, reason: collision with root package name */
    public float f12615j;

    /* renamed from: k, reason: collision with root package name */
    public float f12616k;

    /* renamed from: l, reason: collision with root package name */
    public float f12617l;

    /* renamed from: m, reason: collision with root package name */
    public long f12618m;

    /* renamed from: n, reason: collision with root package name */
    public long f12619n;

    /* renamed from: o, reason: collision with root package name */
    public float f12620o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12621p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f12622q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f12623r;

    /* renamed from: s, reason: collision with root package name */
    public int f12624s;

    public C1379f() {
        C0996s c0996s = new C0996s();
        C1296b c1296b = new C1296b();
        this.f12607b = c0996s;
        this.f12608c = c1296b;
        RenderNode renderNodeA = AbstractC1301b.a();
        this.f12609d = renderNodeA;
        this.f12610e = 0L;
        renderNodeA.setClipToBounds(false);
        l(renderNodeA, 0);
        this.f12613h = 1.0f;
        this.f12614i = 3;
        this.f12615j = 1.0f;
        this.f12616k = 1.0f;
        long j7 = C0998u.f11829b;
        this.f12618m = j7;
        this.f12619n = j7;
        this.f12620o = 8.0f;
        this.f12624s = 0;
    }

    public static void l(RenderNode renderNode, int i7) {
        if (i7 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i7 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void A(int i7) {
        this.f12624s = i7;
        if (i7 != 1 && this.f12614i == 3) {
            l(this.f12609d, i7);
        } else {
            l(this.f12609d, 1);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void B(long j7) {
        this.f12619n = j7;
        this.f12609d.setSpotShadowColor(AbstractC0968M.w(j7));
    }

    @Override // k0.InterfaceC1377d
    public final Matrix C() {
        Matrix matrix = this.f12611f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f12611f = matrix;
        }
        this.f12609d.getMatrix(matrix);
        return matrix;
    }

    @Override // k0.InterfaceC1377d
    public final void D(T0.b bVar, T0.k kVar, C1375b c1375b, C0042b c0042b) {
        C1296b c1296b = this.f12608c;
        RecordingCanvas recordingCanvasBeginRecording = this.f12609d.beginRecording();
        try {
            C0996s c0996s = this.f12607b;
            C0981d c0981d = c0996s.a;
            Canvas canvas = c0981d.a;
            c0981d.a = recordingCanvasBeginRecording;
            B2.l lVar = c1296b.f12205l;
            lVar.N(bVar);
            lVar.O(kVar);
            lVar.f417m = c1375b;
            lVar.P(this.f12610e);
            lVar.M(c0981d);
            c0042b.invoke(c1296b);
            c0996s.a.a = canvas;
        } finally {
            this.f12609d.endRecording();
        }
    }

    @Override // k0.InterfaceC1377d
    public final void E(int i7, int i8, long j7) {
        this.f12609d.setPosition(i7, i8, ((int) (j7 >> 32)) + i7, ((int) (4294967295L & j7)) + i8);
        this.f12610e = AbstractC1420H.O(j7);
    }

    @Override // k0.InterfaceC1377d
    public final float F() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final float G() {
        return this.f12617l;
    }

    @Override // k0.InterfaceC1377d
    public final float H() {
        return this.f12616k;
    }

    @Override // k0.InterfaceC1377d
    public final float I() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final int J() {
        return this.f12614i;
    }

    @Override // k0.InterfaceC1377d
    public final void K(long j7) {
        if (AbstractC0832b.y(j7)) {
            this.f12609d.resetPivot();
        } else {
            this.f12609d.setPivotX(g0.c.d(j7));
            this.f12609d.setPivotY(g0.c.e(j7));
        }
    }

    @Override // k0.InterfaceC1377d
    public final long L() {
        return this.f12618m;
    }

    @Override // k0.InterfaceC1377d
    public final float a() {
        return this.f12613h;
    }

    @Override // k0.InterfaceC1377d
    public final void b() {
        this.f12609d.setRotationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void c(float f5) {
        this.f12613h = f5;
        this.f12609d.setAlpha(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void d() {
        this.f12609d.setTranslationY(0.0f);
    }

    public final void e() {
        boolean z7 = this.f12621p;
        boolean z8 = false;
        boolean z9 = z7 && !this.f12612g;
        if (z7 && this.f12612g) {
            z8 = true;
        }
        if (z9 != this.f12622q) {
            this.f12622q = z9;
            this.f12609d.setClipToBounds(z9);
        }
        if (z8 != this.f12623r) {
            this.f12623r = z8;
            this.f12609d.setClipToOutline(z8);
        }
    }

    @Override // k0.InterfaceC1377d
    public final void f() {
        this.f12609d.setRotationY(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void g(float f5) {
        this.f12615j = f5;
        this.f12609d.setScaleX(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void h() {
        this.f12609d.discardDisplayList();
    }

    @Override // k0.InterfaceC1377d
    public final void i() {
        this.f12609d.setTranslationX(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void j() {
        this.f12609d.setRotationZ(0.0f);
    }

    @Override // k0.InterfaceC1377d
    public final void k(float f5) {
        this.f12616k = f5;
        this.f12609d.setScaleY(f5);
    }

    @Override // k0.InterfaceC1377d
    public final void m(float f5) {
        this.f12620o = f5;
        this.f12609d.setCameraDistance(f5);
    }

    @Override // k0.InterfaceC1377d
    public final boolean n() {
        return this.f12609d.hasDisplayList();
    }

    @Override // k0.InterfaceC1377d
    public final float o() {
        return this.f12615j;
    }

    @Override // k0.InterfaceC1377d
    public final void p(float f5) {
        this.f12617l = f5;
        this.f12609d.setElevation(f5);
    }

    @Override // k0.InterfaceC1377d
    public final float q() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void r(InterfaceC0995r interfaceC0995r) {
        AbstractC0982e.a(interfaceC0995r).drawRenderNode(this.f12609d);
    }

    @Override // k0.InterfaceC1377d
    public final long s() {
        return this.f12619n;
    }

    @Override // k0.InterfaceC1377d
    public final void t(long j7) {
        this.f12618m = j7;
        this.f12609d.setAmbientShadowColor(AbstractC0968M.w(j7));
    }

    @Override // k0.InterfaceC1377d
    public final void u(Outline outline, long j7) {
        this.f12609d.setOutline(outline);
        this.f12612g = outline != null;
        e();
    }

    @Override // k0.InterfaceC1377d
    public final float v() {
        return this.f12620o;
    }

    @Override // k0.InterfaceC1377d
    public final float w() {
        return 0.0f;
    }

    @Override // k0.InterfaceC1377d
    public final void x(boolean z7) {
        this.f12621p = z7;
        e();
    }

    @Override // k0.InterfaceC1377d
    public final int y() {
        return this.f12624s;
    }

    @Override // k0.InterfaceC1377d
    public final float z() {
        return 0.0f;
    }
}
