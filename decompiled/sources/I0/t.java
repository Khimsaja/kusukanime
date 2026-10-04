package I0;

import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public abstract class t {
    public static final o a = new o();

    public static final Rect a(TextPaint textPaint, CharSequence charSequence, int i7, int i8) {
        int i9 = i7;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i9 - 1, i8, MetricAffectingSpan.class) != i8) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i9 < i8) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i9, i8, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i9, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        n.a(textPaint2, charSequence, i9, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i9, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i9 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            n.a(textPaint, charSequence, i9, i8, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i9, i8, rect3);
        return rect3;
    }

    public static final float b(int i7, int i8, float[] fArr) {
        return fArr[((i7 - i8) * 2) + 1];
    }

    public static final int c(Layout layout, int i7, boolean z7) {
        if (i7 <= 0) {
            return 0;
        }
        if (i7 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i7);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i7 || lineEnd == i7) {
            if (lineStart == i7) {
                if (z7) {
                    return lineForOffset - 1;
                }
            } else if (!z7) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0262 A[EDGE_INSN: B:204:0x0262->B:143:0x0262 BREAK  A[LOOP:5: B:153:0x027e->B:207:0x027e], EDGE_INSN: B:205:0x0262->B:143:0x0262 BREAK  A[LOOP:5: B:153:0x027e->B:207:0x027e]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int d(I0.y r19, android.text.Layout r20, B1.C0017d r21, int r22, android.graphics.RectF r23, J0.e r24, D.S r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.t.d(I0.y, android.text.Layout, B1.d, int, android.graphics.RectF, J0.e, D.S, boolean):int");
    }
}
