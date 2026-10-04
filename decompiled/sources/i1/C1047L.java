package i1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: i1.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1047L extends C1046K {
    public C1047L(S s7, WindowInsets windowInsets) {
        super(s7, windowInsets);
    }

    @Override // i1.P
    public S a() {
        return S.b(null, this.f11953c.consumeDisplayCutout());
    }

    @Override // i1.P
    public C1050c e() {
        DisplayCutout displayCutout = this.f11953c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1050c(displayCutout);
    }

    @Override // i1.AbstractC1045J, i1.P
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1047L)) {
            return false;
        }
        C1047L c1047l = (C1047L) obj;
        return Objects.equals(this.f11953c, c1047l.f11953c) && Objects.equals(this.f11957g, c1047l.f11957g);
    }

    @Override // i1.P
    public int hashCode() {
        return this.f11953c.hashCode();
    }
}
