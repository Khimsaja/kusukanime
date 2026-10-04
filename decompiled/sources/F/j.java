package F;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ LineBreakConfig.Builder b() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout f(CharSequence charSequence, TextPaint textPaint, int i7, Layout.Alignment alignment, float f5, float f7, BoringLayout.Metrics metrics, boolean z7, boolean z8, TextUtils.TruncateAt truncateAt, int i8) {
        return new BoringLayout(charSequence, textPaint, i7, alignment, f5, f7, metrics, z7, truncateAt, i8, z8);
    }

    public static /* synthetic */ EditorBoundsInfo.Builder i() {
        return new EditorBoundsInfo.Builder();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback l(Object obj) {
        return (OnBackInvokedCallback) obj;
    }
}
