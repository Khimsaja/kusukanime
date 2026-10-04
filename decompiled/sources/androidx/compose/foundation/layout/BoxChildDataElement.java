package androidx.compose.foundation.layout;

import a0.i;
import a0.p;
import kotlin.Metadata;
import v.C2132k;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/BoxChildDataElement;", "Ly0/S;", "Lv/k;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BoxChildDataElement extends S {
    public final i a;

    public BoxChildDataElement(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && this.a.equals(boxChildDataElement.a);
    }

    @Override // y0.S
    public final p h() {
        C2132k c2132k = new C2132k();
        c2132k.f16455x = this.a;
        return c2132k;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2132k) pVar).f16455x = this.a;
    }
}
