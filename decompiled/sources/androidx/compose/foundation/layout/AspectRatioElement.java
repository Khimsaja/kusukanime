package androidx.compose.foundation.layout;

import a0.p;
import kotlin.Metadata;
import v.C2131j;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Ly0/S;", "Lv/j;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AspectRatioElement extends S {
    public final float a;

    public AspectRatioElement(float f5) {
        this.a = f5;
        if (f5 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f5 + " must be > 0").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        if (aspectRatioElement == null || this.a != aspectRatioElement.a) {
            return false;
        }
        ((AspectRatioElement) obj).getClass();
        return true;
    }

    @Override // y0.S
    public final p h() {
        C2131j c2131j = new C2131j();
        c2131j.f16453x = this.a;
        return c2131j;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2131j) pVar).f16453x = this.a;
    }
}
