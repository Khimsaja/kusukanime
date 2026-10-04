package I0;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class v {
    public final CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3906b;

    /* renamed from: c, reason: collision with root package name */
    public final TextPaint f3907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3908d;

    /* renamed from: e, reason: collision with root package name */
    public final TextDirectionHeuristic f3909e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout.Alignment f3910f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3911g;

    /* renamed from: h, reason: collision with root package name */
    public final TextUtils.TruncateAt f3912h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3913i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3914j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3915k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3916l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3917m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3918n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3919o;

    public v(CharSequence charSequence, int i7, TextPaint textPaint, int i8, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, boolean z7, int i12, int i13, int i14, int i15) {
        this.a = charSequence;
        this.f3906b = i7;
        this.f3907c = textPaint;
        this.f3908d = i8;
        this.f3909e = textDirectionHeuristic;
        this.f3910f = alignment;
        this.f3911g = i9;
        this.f3912h = truncateAt;
        this.f3913i = i10;
        this.f3914j = i11;
        this.f3915k = z7;
        this.f3916l = i12;
        this.f3917m = i13;
        this.f3918n = i14;
        this.f3919o = i15;
        if (i7 < 0) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i7 < 0 || i7 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i9 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }
}
