package androidx.compose.ui.focus;

import a0.p;
import e4.k;
import f0.C0848a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "Ly0/S;", "Lf0/a;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusChangedElement extends S {
    public final k a;

    public FocusChangedElement(k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && l.a(this.a, ((FocusChangedElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C0848a c0848a = new C0848a();
        c0848a.f11388x = this.a;
        return c0848a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C0848a) pVar).f11388x = this.a;
    }

    public final String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.a + ')';
    }
}
