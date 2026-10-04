package h0;

import H1.e0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* renamed from: h0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0981d implements InterfaceC0995r {
    public Canvas a = AbstractC0982e.a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f11817b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f11818c;

    @Override // h0.InterfaceC0995r
    public final void a(float f5, float f7) {
        this.a.scale(f5, f7);
    }

    @Override // h0.InterfaceC0995r
    public final void b(g0.d dVar, e0 e0Var) {
        Canvas canvas = this.a;
        Paint paint = (Paint) e0Var.f3452b;
        canvas.saveLayer(dVar.a, dVar.f11659b, dVar.f11660c, dVar.f11661d, paint, 31);
    }

    @Override // h0.InterfaceC0995r
    public final void c(InterfaceC0967L interfaceC0967L, e0 e0Var) {
        Canvas canvas = this.a;
        if (!(interfaceC0967L instanceof C0987j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C0987j) interfaceC0967L).a, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void d(float f5, float f7, float f8, float f9, e0 e0Var) {
        this.a.drawRect(f5, f7, f8, f9, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void e(float f5, float f7, float f8, float f9, int i7) {
        this.a.clipRect(f5, f7, f8, f9, i7 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // h0.InterfaceC0995r
    public final void f(float f5, float f7) {
        this.a.translate(f5, f7);
    }

    @Override // h0.InterfaceC0995r
    public final void g() {
        this.a.rotate(45.0f);
    }

    @Override // h0.InterfaceC0995r
    public final void h(float f5, long j7, e0 e0Var) {
        this.a.drawCircle(g0.c.d(j7), g0.c.e(j7), f5, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void i() {
        this.a.restore();
    }

    @Override // h0.InterfaceC0995r
    public final void j(float f5, float f7, float f8, float f9, float f10, float f11, e0 e0Var) {
        this.a.drawRoundRect(f5, f7, f8, f9, f10, f11, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void k(C0985h c0985h, long j7, long j8, long j9, e0 e0Var) {
        if (this.f11817b == null) {
            this.f11817b = new Rect();
            this.f11818c = new Rect();
        }
        Canvas canvas = this.a;
        if (c0985h == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Rect rect = this.f11817b;
        kotlin.jvm.internal.l.c(rect);
        int i7 = (int) (j7 >> 32);
        rect.left = i7;
        int i8 = (int) (j7 & 4294967295L);
        rect.top = i8;
        rect.right = i7 + ((int) (j8 >> 32));
        rect.bottom = i8 + ((int) (j8 & 4294967295L));
        Rect rect2 = this.f11818c;
        kotlin.jvm.internal.l.c(rect2);
        int i9 = (int) 0;
        rect2.left = i9;
        int i10 = (int) 0;
        rect2.top = i10;
        rect2.right = i9 + ((int) (j9 >> 32));
        rect2.bottom = i10 + ((int) (4294967295L & j9));
        canvas.drawBitmap(c0985h.a, rect, rect2, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void l() {
        this.a.save();
    }

    @Override // h0.InterfaceC0995r
    public final void m() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0968M.n(this.a, false);
    }

    @Override // h0.InterfaceC0995r
    public final void n(float f5, float f7, float f8, float f9, float f10, float f11, e0 e0Var) {
        this.a.drawArc(f5, f7, f8, f9, f10, f11, false, (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void o(float[] fArr) {
        int i7 = 0;
        while (i7 < 4) {
            int i8 = 0;
            while (i8 < 4) {
                if (fArr[(i7 * 4) + i8] != (i7 == i8 ? 1.0f : 0.0f)) {
                    Matrix matrix = new Matrix();
                    AbstractC0968M.q(matrix, fArr);
                    this.a.concat(matrix);
                    return;
                }
                i8++;
            }
            i7++;
        }
    }

    @Override // h0.InterfaceC0995r
    public final void p() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        AbstractC0968M.n(this.a, true);
    }

    @Override // h0.InterfaceC0995r
    public final void q(long j7, long j8, e0 e0Var) {
        this.a.drawLine(g0.c.d(j7), g0.c.e(j7), g0.c.d(j8), g0.c.e(j8), (Paint) e0Var.f3452b);
    }

    @Override // h0.InterfaceC0995r
    public final void s(InterfaceC0967L interfaceC0967L) {
        Canvas canvas = this.a;
        if (!(interfaceC0967L instanceof C0987j)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C0987j) interfaceC0967L).a, Region.Op.INTERSECT);
    }

    @Override // h0.InterfaceC0995r
    public final void t(C0985h c0985h, e0 e0Var) {
        this.a.drawBitmap(c0985h.a, g0.c.d(0L), g0.c.e(0L), (Paint) e0Var.f3452b);
    }
}
