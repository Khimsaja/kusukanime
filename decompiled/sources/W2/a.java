package W2;

import P3.F;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import b1.AbstractC0703b;
import e3.c;
import e3.g;
import java.util.ArrayList;
import n6.m;

/* loaded from: classes.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: k, reason: collision with root package name */
    public final g f9604k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9605l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9606m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f9607n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final int f9608o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9609p;

    /* renamed from: q, reason: collision with root package name */
    public long f9610q;

    /* renamed from: r, reason: collision with root package name */
    public int f9611r;

    /* renamed from: s, reason: collision with root package name */
    public int f9612s;

    /* renamed from: t, reason: collision with root package name */
    public Drawable f9613t;

    /* renamed from: u, reason: collision with root package name */
    public final Drawable f9614u;

    public a(Drawable drawable, g gVar, int i7, boolean z7) {
        this.f9604k = gVar;
        this.f9605l = i7;
        this.f9606m = z7;
        this.f9608o = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null);
        this.f9609p = a(null, drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null);
        this.f9611r = 255;
        this.f9613t = null;
        Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
        this.f9614u = drawableMutate;
        if (i7 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable2 = this.f9613t;
        if (drawable2 != null) {
            drawable2.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dT = m.t(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f9604k);
        double d4 = 2;
        int iV = F.V((iWidth - (intrinsicWidth * dT)) / d4);
        int iV2 = F.V((iHeight - (dT * intrinsicHeight)) / d4);
        drawable.setBounds(rect.left + iV, rect.top + iV2, rect.right - iV, rect.bottom - iV2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i7 = this.f9612s;
        if (i7 == 0) {
            Drawable drawable2 = this.f9613t;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f9611r);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f9614u;
        if (i7 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f9611r);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f9610q) / this.f9605l;
        double dI = c.i(dUptimeMillis, 0.0d, 1.0d);
        int i8 = this.f9611r;
        int i9 = (int) (dI * i8);
        if (this.f9606m) {
            i8 -= i9;
        }
        boolean z7 = dUptimeMillis >= 1.0d;
        if (!z7 && (drawable = this.f9613t) != null) {
            drawable.setAlpha(i8);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i9);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (!z7) {
            invalidateSelf();
            return;
        }
        this.f9612s = 2;
        this.f9613t = null;
        ArrayList arrayList = this.f9607n;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9611r;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i7 = this.f9612s;
        if (i7 == 0) {
            Drawable drawable = this.f9613t;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f9614u;
        if (i7 != 1) {
            if (i7 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f9613t;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9609p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9608o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9613t;
        int i7 = this.f9612s;
        if (i7 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f9614u;
        if (i7 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9612s == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f9613t;
        boolean level = drawable != null ? drawable.setLevel(i7) : false;
        Drawable drawable2 = this.f9614u;
        return level || (drawable2 != null ? drawable2.setLevel(i7) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9613t;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f9614u;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        scheduleSelf(runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        if (i7 < 0 || i7 >= 256) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Invalid alpha: ").toString());
        }
        this.f9611r = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            drawable.setTint(i7);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 != null) {
            drawable2.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9613t;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f9614u;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f9613t;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f9614u;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f9612s != 0) {
            return;
        }
        this.f9612s = 1;
        this.f9610q = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f9607n;
        if (arrayList.size() <= 0) {
            invalidateSelf();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f9613t;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f9614u;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f9612s != 2) {
            this.f9612s = 2;
            this.f9613t = null;
            ArrayList arrayList = this.f9607n;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
