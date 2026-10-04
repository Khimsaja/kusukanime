package I0;

import B1.C0017d;
import B1.G;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class y {
    public final TextPaint a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3922c;

    /* renamed from: d, reason: collision with root package name */
    public G f3923d;

    /* renamed from: e, reason: collision with root package name */
    public final Layout f3924e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3926g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3927h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3928i;

    /* renamed from: j, reason: collision with root package name */
    public final float f3929j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3930k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint.FontMetricsInt f3931l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3932m;

    /* renamed from: n, reason: collision with root package name */
    public final K0.h[] f3933n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f3934o = new Rect();

    /* renamed from: p, reason: collision with root package name */
    public C0017d f3935p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x025b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137 A[PHI: r11
      0x0137: PHI (r11v7 int) = (r11v6 int), (r11v9 int) binds: [B:67:0x0149, B:60:0x0130] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.CharSequence r32, float r33, android.text.TextPaint r34, int r35, android.text.TextUtils.TruncateAt r36, int r37, boolean r38, int r39, int r40, int r41, int r42, int r43, int r44, I0.m r45) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.y.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, I0.m):void");
    }

    public final int a() {
        boolean z7 = this.f3922c;
        Layout layout = this.f3924e;
        return (z7 ? layout.getLineBottom(this.f3925f - 1) : layout.getHeight()) + this.f3926g + this.f3927h + this.f3932m;
    }

    public final float b(int i7) {
        if (i7 == this.f3925f - 1) {
            return this.f3928i + this.f3929j;
        }
        return 0.0f;
    }

    public final C0017d c() {
        C0017d c0017d = this.f3935p;
        if (c0017d != null) {
            return c0017d;
        }
        C0017d c0017d2 = new C0017d(this.f3924e);
        this.f3935p = c0017d2;
        return c0017d2;
    }

    public final float d(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f3926g + ((i7 != this.f3925f + (-1) || (fontMetricsInt = this.f3931l) == null) ? this.f3924e.getLineBaseline(i7) : g(i7) - fontMetricsInt.ascent);
    }

    public final float e(int i7) {
        Paint.FontMetricsInt fontMetricsInt;
        int i8 = this.f3925f;
        int i9 = i8 - 1;
        Layout layout = this.f3924e;
        if (i7 != i9 || (fontMetricsInt = this.f3931l) == null) {
            return this.f3926g + layout.getLineBottom(i7) + (i7 == i8 + (-1) ? this.f3927h : 0);
        }
        return layout.getLineBottom(i7 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i7) {
        Layout layout = this.f3924e;
        return layout.getEllipsisStart(i7) == 0 ? layout.getLineEnd(i7) : layout.getText().length();
    }

    public final float g(int i7) {
        return this.f3924e.getLineTop(i7) + (i7 == 0 ? 0 : this.f3926g);
    }

    public final float h(int i7, boolean z7) {
        return b(this.f3924e.getLineForOffset(i7)) + c().x(i7, true, z7);
    }

    public final float i(int i7, boolean z7) {
        return b(this.f3924e.getLineForOffset(i7)) + c().x(i7, false, z7);
    }

    public final G j() {
        G g4 = this.f3923d;
        if (g4 != null) {
            return g4;
        }
        Layout layout = this.f3924e;
        G g7 = new G(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.f3923d = g7;
        return g7;
    }
}
