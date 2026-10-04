package androidx.compose.foundation.layout;

import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.Y;
import v.a0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Ly0/S;", "Lv/a0;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesElement extends S {
    public final Y a;

    public PaddingValuesElement(Y y7) {
        this.a = y7;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return l.a(this.a, paddingValuesElement.a);
    }

    @Override // y0.S
    public final p h() {
        a0 a0Var = new a0();
        a0Var.f16429x = this.a;
        return a0Var;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((a0) pVar).f16429x = this.a;
    }
}
