package K0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class g implements LineHeightSpan {
    public final float a;

    public g(float f5) {
        this.a = f5;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.a));
    }
}
