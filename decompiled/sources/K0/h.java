package K0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4441b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4442c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4443d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4444e;

    /* renamed from: f, reason: collision with root package name */
    public int f4445f = Integer.MIN_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public int f4446g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f4447h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f4448i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f4449j;

    /* renamed from: k, reason: collision with root package name */
    public int f4450k;

    public h(float f5, int i7, boolean z7, boolean z8, float f7) {
        this.a = f5;
        this.f4441b = i7;
        this.f4442c = z7;
        this.f4443d = z8;
        this.f4444e = f7;
        if ((0.0f > f7 || f7 > 1.0f) && f7 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i7, int i8, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        int i11 = fontMetricsInt.descent;
        int i12 = fontMetricsInt.ascent;
        if (i11 - i12 <= 0) {
            return;
        }
        boolean z7 = i7 == 0;
        boolean z8 = i8 == this.f4441b;
        boolean z9 = this.f4443d;
        boolean z10 = this.f4442c;
        if (z7 && z8 && z10 && z9) {
            return;
        }
        if (this.f4445f == Integer.MIN_VALUE) {
            int i13 = i11 - i12;
            int iCeil = (int) Math.ceil(this.a);
            int i14 = iCeil - i13;
            float fAbs = this.f4444e;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i14 <= 0 ? Math.ceil(i14 * fAbs) : Math.ceil((1.0f - fAbs) * i14));
            int i15 = fontMetricsInt.descent;
            int i16 = iCeil2 + i15;
            this.f4447h = i16;
            int i17 = i16 - iCeil;
            this.f4446g = i17;
            if (z10) {
                i17 = fontMetricsInt.ascent;
            }
            this.f4445f = i17;
            if (z9) {
                i16 = i15;
            }
            this.f4448i = i16;
            this.f4449j = fontMetricsInt.ascent - i17;
            this.f4450k = i16 - i15;
        }
        fontMetricsInt.ascent = z7 ? this.f4445f : this.f4446g;
        fontMetricsInt.descent = z8 ? this.f4448i : this.f4447h;
    }
}
