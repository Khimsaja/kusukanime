package androidx.compose.ui.input.rotary;

import a0.p;
import kotlin.Metadata;
import u0.C2065a;
import y0.S;
import z0.C2458n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Ly0/S;", "Lu0/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class RotaryInputElement extends S {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        ((RotaryInputElement) obj).getClass();
        Object obj2 = C2458n.f18811o;
        return obj2.equals(obj2);
    }

    @Override // y0.S
    public final p h() {
        C2065a c2065a = new C2065a();
        c2065a.f16215x = C2458n.f18811o;
        return c2065a;
    }

    public final int hashCode() {
        return C2458n.f18811o.hashCode() * 31;
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2065a) pVar).f16215x = C2458n.f18811o;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + C2458n.f18811o + ", onPreRotaryScrollEvent=null)";
    }
}
