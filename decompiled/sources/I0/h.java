package I0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class h {
    public static final h a = new h();

    public final boolean a(Canvas canvas, float f5, float f7, float f8, float f9) {
        return canvas.quickReject(f5, f7, f8, f9);
    }

    public final boolean b(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public final boolean c(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
