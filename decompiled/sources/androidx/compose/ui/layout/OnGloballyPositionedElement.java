package androidx.compose.ui.layout;

import a0.p;
import e4.k;
import kotlin.Metadata;
import w0.C2179N;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Ly0/S;", "Lw0/N;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends S {
    public final k a;

    public OnGloballyPositionedElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnGloballyPositionedElement) {
            return this.a == ((OnGloballyPositionedElement) obj).a;
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        C2179N c2179n = new C2179N();
        c2179n.f16837x = this.a;
        return c2179n;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2179N) pVar).f16837x = this.a;
    }
}
