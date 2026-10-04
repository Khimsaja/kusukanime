package I0;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;

/* loaded from: classes.dex */
public final class i {
    public static final i a = new i();

    public final void a(Canvas canvas, int[] iArr, int i7, float[] fArr, int i8, int i9, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i7, fArr, i8, i9, font, paint);
    }

    public final void b(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public final void c(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }
}
