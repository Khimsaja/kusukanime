package I0;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;

/* loaded from: classes.dex */
public final class g {
    public static final g a = new g();

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int i7, BlendMode blendMode) {
        canvas.drawColor(i7, blendMode);
    }

    public final void c(Canvas canvas, long j7) {
        canvas.drawColor(j7);
    }

    public final void d(Canvas canvas, long j7, BlendMode blendMode) {
        canvas.drawColor(j7, blendMode);
    }

    public final void e(Canvas canvas, RectF rectF, float f5, float f7, RectF rectF2, float f8, float f9, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, f5, f7, rectF2, f8, f9, paint);
    }

    public final void f(Canvas canvas, RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        canvas.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText measuredText, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        canvas.drawTextRun(measuredText, i7, i8, i9, i10, f5, f7, z7, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
