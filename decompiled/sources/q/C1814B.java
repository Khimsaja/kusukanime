package q;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import e0.InterfaceC0813e;
import e5.AbstractC0832b;
import h0.AbstractC0982e;
import h0.C0981d;
import h0.InterfaceC0995r;
import j0.C1295a;
import j0.C1296b;
import k0.C1375b;
import y0.C2351F;

/* renamed from: q.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1814B extends z0.O implements InterfaceC0813e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14460c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final C1831m f14461d;

    /* renamed from: e, reason: collision with root package name */
    public final C1815C f14462e;

    /* renamed from: f, reason: collision with root package name */
    public Object f14463f;

    public C1814B(C1831m c1831m, C1815C c1815c) {
        this.f14461d = c1831m;
        this.f14462e = c1815c;
    }

    public static boolean E(float f5, EdgeEffect edgeEffect, Canvas canvas) {
        if (f5 == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f5);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean F(float f5, long j7, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f5);
        canvas.translate(g0.c.d(j7), g0.c.e(j7));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode G() {
        RenderNode renderNode = (RenderNode) this.f14463f;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeE = n6.k.e();
        this.f14463f = renderNodeE;
        return renderNodeE;
    }

    @Override // e0.InterfaceC0813e
    public final void f(C2351F c2351f) {
        float f5;
        boolean zE;
        float f7;
        float f8;
        float f9;
        switch (this.f14460c) {
            case 0:
                C1296b c1296b = c2351f.f17696k;
                long jD = c1296b.d();
                C1831m c1831m = this.f14461d;
                c1831m.l(jD);
                if (g0.f.e(c1296b.d())) {
                    c2351f.b();
                    return;
                }
                c2351f.b();
                c1831m.f14580m.getValue();
                Canvas canvasA = AbstractC0982e.a(c1296b.f12205l.t());
                C1815C c1815c = this.f14462e;
                boolean zF = C1815C.f(c1815c.f14468f);
                v.Z z7 = ((c0) this.f14463f).f14542b;
                boolean zF2 = zF ? F(270.0f, AbstractC0832b.e(-g0.f.b(c1296b.d()), c2351f.x(z7.b(c2351f.getLayoutDirection()))), c1815c.c(), canvasA) : false;
                if (C1815C.f(c1815c.f14466d)) {
                    zF2 = F(0.0f, AbstractC0832b.e(0.0f, c2351f.x(z7.f16423b)), c1815c.e(), canvasA) || zF2;
                }
                if (C1815C.f(c1815c.f14469g)) {
                    zF2 = F(90.0f, AbstractC0832b.e(0.0f, c2351f.x(z7.d(c2351f.getLayoutDirection())) + (-((float) P3.F.W(g0.f.d(c1296b.d()))))), c1815c.d(), canvasA) || zF2;
                }
                if (C1815C.f(c1815c.f14467e)) {
                    zF2 = F(180.0f, AbstractC0832b.e(-g0.f.d(c1296b.d()), (-g0.f.b(c1296b.d())) + c2351f.x(z7.f16425d)), c1815c.b(), canvasA) || zF2;
                }
                if (zF2) {
                    c1831m.g();
                    return;
                }
                return;
            default:
                C1296b c1296b2 = c2351f.f17696k;
                long jD2 = c1296b2.d();
                C1831m c1831m2 = this.f14461d;
                c1831m2.l(jD2);
                if (g0.f.e(c1296b2.d())) {
                    c2351f.b();
                    return;
                }
                c1831m2.f14580m.getValue();
                float fX = c2351f.x(AbstractC1841x.a);
                Canvas canvasA2 = AbstractC0982e.a(c1296b2.f12205l.t());
                C1815C c1815c2 = this.f14462e;
                boolean z8 = C1815C.f(c1815c2.f14466d) || C1815C.g(c1815c2.f14470h) || C1815C.f(c1815c2.f14467e) || C1815C.g(c1815c2.f14471i);
                boolean z9 = C1815C.f(c1815c2.f14468f) || C1815C.g(c1815c2.f14472j) || C1815C.f(c1815c2.f14469g) || C1815C.g(c1815c2.f14473k);
                if (z8 && z9) {
                    G().setPosition(0, 0, canvasA2.getWidth(), canvasA2.getHeight());
                } else if (z8) {
                    G().setPosition(0, 0, (P3.F.W(fX) * 2) + canvasA2.getWidth(), canvasA2.getHeight());
                } else {
                    if (!z9) {
                        c2351f.b();
                        return;
                    }
                    G().setPosition(0, 0, canvasA2.getWidth(), (P3.F.W(fX) * 2) + canvasA2.getHeight());
                }
                RecordingCanvas recordingCanvasBeginRecording = G().beginRecording();
                if (C1815C.g(c1815c2.f14472j)) {
                    EdgeEffect edgeEffectA = c1815c2.f14472j;
                    if (edgeEffectA == null) {
                        edgeEffectA = c1815c2.a();
                        c1815c2.f14472j = edgeEffectA;
                    }
                    E(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                boolean zF3 = C1815C.f(c1815c2.f14468f);
                C1832n c1832n = C1832n.a;
                if (zF3) {
                    EdgeEffect edgeEffectC = c1815c2.c();
                    zE = E(270.0f, edgeEffectC, recordingCanvasBeginRecording);
                    if (C1815C.g(c1815c2.f14468f)) {
                        float fE = g0.c.e(c1831m2.d());
                        EdgeEffect edgeEffectA2 = c1815c2.f14472j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = c1815c2.a();
                            c1815c2.f14472j = edgeEffectA2;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        float fB = i7 >= 31 ? c1832n.b(edgeEffectC) : 0.0f;
                        f5 = fX;
                        float f10 = 1 - fE;
                        if (i7 >= 31) {
                            c1832n.c(edgeEffectA2, fB, f10);
                        } else {
                            edgeEffectA2.onPull(fB, f10);
                        }
                    } else {
                        f5 = fX;
                    }
                } else {
                    f5 = fX;
                    zE = false;
                }
                if (C1815C.g(c1815c2.f14470h)) {
                    EdgeEffect edgeEffectA3 = c1815c2.f14470h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = c1815c2.a();
                        c1815c2.f14470h = edgeEffectA3;
                    }
                    E(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (C1815C.f(c1815c2.f14466d)) {
                    EdgeEffect edgeEffectE = c1815c2.e();
                    boolean z10 = E(0.0f, edgeEffectE, recordingCanvasBeginRecording) || zE;
                    if (C1815C.g(c1815c2.f14466d)) {
                        float fD = g0.c.d(c1831m2.d());
                        EdgeEffect edgeEffectA4 = c1815c2.f14470h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = c1815c2.a();
                            c1815c2.f14470h = edgeEffectA4;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float fB2 = i8 >= 31 ? c1832n.b(edgeEffectE) : 0.0f;
                        if (i8 >= 31) {
                            c1832n.c(edgeEffectA4, fB2, fD);
                        } else {
                            edgeEffectA4.onPull(fB2, fD);
                        }
                    }
                    zE = z10;
                }
                if (C1815C.g(c1815c2.f14473k)) {
                    EdgeEffect edgeEffectA5 = c1815c2.f14473k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = c1815c2.a();
                        c1815c2.f14473k = edgeEffectA5;
                    }
                    E(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (C1815C.f(c1815c2.f14469g)) {
                    EdgeEffect edgeEffectD = c1815c2.d();
                    boolean z11 = E(90.0f, edgeEffectD, recordingCanvasBeginRecording) || zE;
                    if (C1815C.g(c1815c2.f14469g)) {
                        float fE2 = g0.c.e(c1831m2.d());
                        EdgeEffect edgeEffectA6 = c1815c2.f14473k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = c1815c2.a();
                            c1815c2.f14473k = edgeEffectA6;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float fB3 = i9 >= 31 ? c1832n.b(edgeEffectD) : 0.0f;
                        if (i9 >= 31) {
                            c1832n.c(edgeEffectA6, fB3, fE2);
                        } else {
                            edgeEffectA6.onPull(fB3, fE2);
                        }
                    }
                    zE = z11;
                }
                if (C1815C.g(c1815c2.f14471i)) {
                    EdgeEffect edgeEffectA7 = c1815c2.f14471i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = c1815c2.a();
                        c1815c2.f14471i = edgeEffectA7;
                    }
                    f7 = 0.0f;
                    E(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                } else {
                    f7 = 0.0f;
                }
                if (C1815C.f(c1815c2.f14467e)) {
                    EdgeEffect edgeEffectB = c1815c2.b();
                    boolean z12 = E(180.0f, edgeEffectB, recordingCanvasBeginRecording) || zE;
                    if (C1815C.g(c1815c2.f14467e)) {
                        float fD2 = g0.c.d(c1831m2.d());
                        EdgeEffect edgeEffectA8 = c1815c2.f14471i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = c1815c2.a();
                            c1815c2.f14471i = edgeEffectA8;
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        float fB4 = i10 >= 31 ? c1832n.b(edgeEffectB) : f7;
                        float f11 = 1 - fD2;
                        if (i10 >= 31) {
                            c1832n.c(edgeEffectA8, fB4, f11);
                        } else {
                            edgeEffectA8.onPull(fB4, f11);
                        }
                    }
                    zE = z12;
                }
                if (zE) {
                    c1831m2.g();
                }
                float f12 = z9 ? f7 : f5;
                if (!z8) {
                    f7 = f5;
                }
                T0.k layoutDirection = c2351f.getLayoutDirection();
                C0981d c0981d = new C0981d();
                c0981d.a = recordingCanvasBeginRecording;
                long jD3 = c1296b2.d();
                B2.l lVar = c1296b2.f12205l;
                C1295a c1295a = ((C1296b) lVar.f418n).f12204k;
                T0.b bVar = c1295a.a;
                T0.k kVar = c1295a.f12201b;
                InterfaceC0995r interfaceC0995rT = lVar.t();
                long jA = c1296b2.f12205l.A();
                B2.l lVar2 = c1296b2.f12205l;
                C1375b c1375b = (C1375b) lVar2.f417m;
                lVar2.N(c2351f);
                lVar2.O(layoutDirection);
                lVar2.M(c0981d);
                lVar2.P(jD3);
                lVar2.f417m = null;
                c0981d.l();
                try {
                    ((X4.y) c1296b2.f12205l.f416l).G(f12, f7);
                    try {
                        c2351f.b();
                        c0981d.i();
                        B2.l lVar3 = c1296b2.f12205l;
                        lVar3.N(bVar);
                        lVar3.O(kVar);
                        lVar3.M(interfaceC0995rT);
                        lVar3.P(jA);
                        lVar3.f417m = c1375b;
                        G().endRecording();
                        int iSave = canvasA2.save();
                        canvasA2.translate(f8, f9);
                        canvasA2.drawRenderNode(G());
                        canvasA2.restoreToCount(iSave);
                        return;
                    } finally {
                        ((X4.y) c1296b2.f12205l.f416l).G(-f12, -f7);
                    }
                } catch (Throwable th) {
                    c0981d.i();
                    B2.l lVar4 = c1296b2.f12205l;
                    lVar4.N(bVar);
                    lVar4.O(kVar);
                    lVar4.M(interfaceC0995rT);
                    lVar4.P(jA);
                    lVar4.f417m = c1375b;
                    throw th;
                }
        }
    }

    public C1814B(C1831m c1831m, C1815C c1815c, c0 c0Var) {
        this.f14461d = c1831m;
        this.f14462e = c1815c;
        this.f14463f = c0Var;
    }
}
