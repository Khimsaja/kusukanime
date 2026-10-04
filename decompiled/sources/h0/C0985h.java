package h0;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0985h {
    public final Bitmap a;

    public C0985h(Bitmap bitmap) {
        this.a = bitmap;
    }

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i7 < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }
}
