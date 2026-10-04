package F;

import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class r {
    public static final r a = new r();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(P3.r.I(m.m(), m.x(), m.t(), m.v(), m.z(), m.B(), m.D()));
        editorInfo.setSupportedHandwritingGesturePreviews(P3.m.v0(new Class[]{m.m(), m.x(), m.t(), m.v()}));
    }
}
