package h0;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import i0.AbstractC1019c;
import i0.C1020d;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0989l {
    public static final AbstractC1019c a(Bitmap bitmap) {
        AbstractC1019c abstractC1019cB;
        ColorSpace colorSpace = bitmap.getColorSpace();
        return (colorSpace == null || (abstractC1019cB = AbstractC0956A.b(colorSpace)) == null) ? C1020d.f11869c : abstractC1019cB;
    }

    public static final Bitmap b(int i7, int i8, int i9, boolean z7, AbstractC1019c abstractC1019c) {
        return Bitmap.createBitmap((DisplayMetrics) null, i7, i8, AbstractC0968M.x(i9), z7, AbstractC0956A.a(abstractC1019c));
    }
}
