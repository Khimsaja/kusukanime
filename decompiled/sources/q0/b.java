package q0;

import android.view.KeyEvent;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.a, ((b) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
