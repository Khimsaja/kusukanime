package K0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4440b;

    public /* synthetic */ b(int i7, Object obj) {
        this.a = i7;
        this.f4440b = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4440b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4440b);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.a) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f4440b);
                break;
            default:
                textPaint.setTypeface((Typeface) this.f4440b);
                break;
        }
    }
}
