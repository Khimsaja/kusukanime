package androidx.compose.foundation.layout;

import a0.g;
import a0.p;
import kotlin.Metadata;
import v.O;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Ly0/S;", "Lv/O;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends S {
    public final g a;

    public HorizontalAlignElement(g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return this.a.equals(horizontalAlignElement.a);
    }

    @Override // y0.S
    public final p h() {
        O o7 = new O();
        o7.f16400x = this.a;
        return o7;
    }

    public final int hashCode() {
        return Float.hashCode(this.a.a);
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((O) pVar).f16400x = this.a;
    }
}
