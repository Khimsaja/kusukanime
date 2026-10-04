package i1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: i1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1050c {
    public final DisplayCutout a;

    public C1050c(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1050c.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((C1050c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
