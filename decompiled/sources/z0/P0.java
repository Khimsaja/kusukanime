package z0;

import android.view.ActionMode;
import android.view.View;

/* loaded from: classes.dex */
public final class P0 {
    public static final P0 a = new P0();

    public final void a(ActionMode actionMode) {
        actionMode.invalidateContentRect();
    }

    public final ActionMode b(View view, ActionMode.Callback callback, int i7) {
        return view.startActionMode(callback, i7);
    }
}
