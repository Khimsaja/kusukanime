package androidx.compose.ui.layout;

import a0.p;
import e4.k;
import kotlin.Metadata;
import l4.AbstractC1420H;
import w0.C2180O;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Ly0/S;", "Lw0/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OnSizeChangedModifier extends S {
    public final k a;

    public OnSizeChangedModifier(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.a == ((OnSizeChangedModifier) obj).a;
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        C2180O c2180o = new C2180O();
        c2180o.f16838x = this.a;
        c2180o.f16839y = AbstractC1420H.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
        return c2180o;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        C2180O c2180o = (C2180O) pVar;
        c2180o.f16838x = this.a;
        c2180o.f16839y = AbstractC1420H.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
