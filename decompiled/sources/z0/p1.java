package z0;

import android.view.ViewParent;

/* loaded from: classes.dex */
public final class p1 {
    public static final p1 a = new p1();

    public final void a(C2471u c2471u) {
        ViewParent parent = c2471u.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(c2471u, c2471u);
        }
    }
}
