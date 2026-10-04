package I0;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class e {
    public static final e a = new e();

    public final void a(Canvas canvas, CharSequence charSequence, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        canvas.drawTextRun(charSequence, i7, i8, i9, i10, f5, f7, z7, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i7, int i8, int i9, int i10, float f5, float f7, boolean z7, Paint paint) {
        canvas.drawTextRun(cArr, i7, i8, i9, i10, f5, f7, z7, paint);
    }
}
