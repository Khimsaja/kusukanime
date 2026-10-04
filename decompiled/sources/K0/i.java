package K0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt a;

    /* renamed from: b, reason: collision with root package name */
    public int f4451b;

    /* renamed from: c, reason: collision with root package name */
    public int f4452c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4453d;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.a;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.l("fontMetrics");
        throw null;
    }

    public final int b() {
        if (this.f4453d) {
            return this.f4452c;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
        this.f4453d = true;
        paint.getTextSize();
        this.a = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f4451b = (int) Math.ceil(0.0f);
        this.f4452c = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (this.f4453d) {
            return this.f4451b;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i8, float f5, int i9, int i10, int i11, Paint paint) {
    }
}
