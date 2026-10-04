package H1;

import B1.AbstractC0015b;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.HandlerThread;
import h0.AbstractC0968M;
import h0.AbstractC0986i;
import h0.C0977W;
import h0.C0990m;

/* loaded from: classes.dex */
public final class e0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3452b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3453c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3454d;

    public e0(Paint paint) {
        this.f3452b = paint;
        this.a = 3;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.f3452b).getStrokeCap();
        int i7 = strokeCap == null ? -1 : AbstractC0986i.a[strokeCap.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.f3452b).getStrokeJoin();
        int i7 = strokeJoin == null ? -1 : AbstractC0986i.f11822b[strokeJoin.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 != 2) {
            return i7 != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c() {
        HandlerThread handlerThread;
        synchronized (this.f3452b) {
            try {
                AbstractC0015b.h(this.a > 0);
                int i7 = this.a - 1;
                this.a = i7;
                if (i7 == 0 && (handlerThread = (HandlerThread) this.f3454d) != null) {
                    handlerThread.quit();
                    this.f3454d = null;
                    this.f3453c = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(float f5) {
        ((Paint) this.f3452b).setAlpha((int) Math.rint(f5 * 255.0f));
    }

    public void e(int i7) {
        if (this.a == i7) {
            return;
        }
        this.a = i7;
        int i8 = Build.VERSION.SDK_INT;
        Paint paint = (Paint) this.f3452b;
        if (i8 >= 29) {
            C0977W.a.a(paint, i7);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC0968M.z(i7)));
        }
    }

    public void f(long j7) {
        ((Paint) this.f3452b).setColor(AbstractC0968M.w(j7));
    }

    public void g(C0990m c0990m) {
        this.f3454d = c0990m;
        ((Paint) this.f3452b).setColorFilter(c0990m != null ? c0990m.a : null);
    }

    public void h(int i7) {
        ((Paint) this.f3452b).setFilterBitmap(!(i7 == 0));
    }

    public void i(Shader shader) {
        this.f3453c = shader;
        ((Paint) this.f3452b).setShader(shader);
    }

    public void j(int i7) {
        ((Paint) this.f3452b).setStrokeCap(i7 == 2 ? Paint.Cap.SQUARE : i7 == 1 ? Paint.Cap.ROUND : i7 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void k(int i7) {
        ((Paint) this.f3452b).setStrokeJoin(i7 == 0 ? Paint.Join.MITER : i7 == 2 ? Paint.Join.BEVEL : i7 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void l(float f5) {
        ((Paint) this.f3452b).setStrokeWidth(f5);
    }

    public void m(int i7) {
        ((Paint) this.f3452b).setStyle(i7 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public e0() {
        this.f3452b = new Object();
        this.f3453c = null;
        this.f3454d = null;
        this.a = 0;
    }
}
