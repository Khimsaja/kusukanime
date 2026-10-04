package t2;

import android.text.Layout;
import android.text.SpannableStringBuilder;

/* renamed from: t2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2038d {

    /* renamed from: c, reason: collision with root package name */
    public static final B2.e f15923c = new B2.e(17);
    public final A1.b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15924b;

    public C2038d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f5, int i7, float f7, int i8, boolean z7, int i9, int i10) {
        boolean z8;
        int i11;
        if (z7) {
            z8 = true;
            i11 = i9;
        } else {
            z8 = false;
            i11 = -16777216;
        }
        this.a = new A1.b(spannableStringBuilder, alignment, null, null, f5, 0, i7, f7, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z8, i11, Integer.MIN_VALUE, 0.0f);
        this.f15924b = i10;
    }
}
