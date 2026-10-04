package I0;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class c {
    public static final BoringLayout a(CharSequence charSequence, TextPaint textPaint, int i7, Layout.Alignment alignment, float f5, float f7, BoringLayout.Metrics metrics, boolean z7, boolean z8, TextUtils.TruncateAt truncateAt, int i8) {
        return F.j.f(charSequence, textPaint, i7, alignment, f5, f7, metrics, z7, z8, truncateAt, i8);
    }

    public static final BoringLayout.Metrics b(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean c(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }
}
