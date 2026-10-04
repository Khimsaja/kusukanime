package androidx.compose.ui.semantics;

import F0.c;
import F0.i;
import F0.j;
import L.C0429x;
import a0.p;
import kotlin.Metadata;
import y0.S;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Ly0/S;", "LF0/c;", "LF0/j;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClearAndSetSemanticsElement extends S implements j {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearAndSetSemanticsElement)) {
            return false;
        }
        Object obj2 = C0429x.f5917s;
        ((ClearAndSetSemanticsElement) obj).getClass();
        return obj2.equals(obj2);
    }

    @Override // y0.S
    public final p h() {
        return new c(false, true, C0429x.f5917s);
    }

    public final int hashCode() {
        return C0429x.f5917s.hashCode();
    }

    @Override // F0.j
    public final i l() {
        i iVar = new i();
        iVar.f2097l = false;
        iVar.f2098m = true;
        return iVar;
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((c) pVar).f2066z = C0429x.f5917s;
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + C0429x.f5917s + ')';
    }
}
