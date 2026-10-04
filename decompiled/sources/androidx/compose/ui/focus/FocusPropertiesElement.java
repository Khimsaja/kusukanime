package androidx.compose.ui.focus;

import a0.p;
import f0.C0855h;
import f0.C0859l;
import f0.C0861n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "Ly0/S;", "Lf0/n;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusPropertiesElement extends S {
    public final C0859l a;

    public FocusPropertiesElement(C0859l c0859l) {
        this.a = c0859l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && l.a(this.a, ((FocusPropertiesElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C0861n c0861n = new C0861n();
        c0861n.f11416x = this.a;
        return c0861n;
    }

    public final int hashCode() {
        return C0855h.f11398m.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C0861n) pVar).f11416x = this.a;
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.a + ')';
    }
}
