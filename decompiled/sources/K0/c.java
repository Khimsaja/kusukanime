package K0;

import I0.x;
import I0.z;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z7, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i12)) != layout.getLineCount() - 1) {
            return;
        }
        x xVar = z.a;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float fA = n6.d.A(layout, lineForOffset, paint) + n6.d.z(layout, lineForOffset, paint);
            if (fA == 0.0f) {
                return;
            }
            l.c(canvas);
            canvas.translate(fA, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z7) {
        return 0;
    }
}
