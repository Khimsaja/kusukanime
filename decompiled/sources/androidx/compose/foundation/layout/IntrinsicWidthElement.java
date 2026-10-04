package androidx.compose.foundation.layout;

import a0.p;
import kotlin.Metadata;
import p.AbstractC1755i;
import v.U;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Ly0/S;", "Lv/U;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntrinsicWidthElement extends S {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    @Override // y0.S
    public final p h() {
        U u5 = new U();
        u5.f16413x = 2;
        u5.f16414y = true;
        return u5;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (AbstractC1755i.b(2) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        U u5 = (U) pVar;
        u5.f16413x = 2;
        u5.f16414y = true;
    }
}
