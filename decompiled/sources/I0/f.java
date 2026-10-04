package I0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    public final boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(Canvas canvas, float f5, float f7, float f8, float f9) {
        return canvas.clipOutRect(f5, f7, f8, f9);
    }

    public final boolean c(Canvas canvas, int i7, int i8, int i9, int i10) {
        return canvas.clipOutRect(i7, i8, i9, i10);
    }

    public final boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(Canvas canvas, RectF rectF) {
        return canvas.clipOutRect(rectF);
    }
}
