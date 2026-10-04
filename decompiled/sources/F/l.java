package F;

import android.view.inputmethod.CursorAnchorInfo;
import h0.AbstractC0968M;

/* loaded from: classes.dex */
public abstract class l {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, g0.d dVar) {
        return builder.setEditorBoundsInfo(j.i().setEditorBounds(AbstractC0968M.v(dVar)).setHandwritingBounds(AbstractC0968M.v(dVar)).build());
    }
}
