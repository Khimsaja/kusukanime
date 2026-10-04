package K0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4439b;

    public /* synthetic */ a(float f5, int i7) {
        this.a = i7;
        this.f4439b = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4439b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4439b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f4439b);
                break;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f4439b);
                break;
        }
    }
}
