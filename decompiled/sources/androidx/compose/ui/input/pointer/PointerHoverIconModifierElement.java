package androidx.compose.ui.input.pointer;

import D.AbstractC0047d0;
import a0.p;
import kotlin.Metadata;
import s0.C1956a;
import s0.C1967l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Ly0/S;", "Ls0/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PointerHoverIconModifierElement extends S {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        ((PointerHoverIconModifierElement) obj).getClass();
        C1956a c1956a = AbstractC0047d0.f1136b;
        return c1956a.equals(c1956a);
    }

    @Override // y0.S
    public final p h() {
        return new C1967l();
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (1008 * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C1967l c1967l = (C1967l) pVar;
        c1967l.getClass();
        C1956a c1956a = AbstractC0047d0.f1136b;
        if (c1956a.equals(c1956a) || !c1967l.f15467x) {
            return;
        }
        c1967l.H0();
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + AbstractC0047d0.f1136b + ", overrideDescendants=false)";
    }
}
