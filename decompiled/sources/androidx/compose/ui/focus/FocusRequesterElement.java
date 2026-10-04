package androidx.compose.ui.focus;

import a0.p;
import f0.C0862o;
import f0.C0864q;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "Ly0/S;", "Lf0/q;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class FocusRequesterElement extends S {
    public final C0862o a;

    public FocusRequesterElement(C0862o c0862o) {
        this.a = c0862o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && l.a(this.a, ((FocusRequesterElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C0864q c0864q = new C0864q();
        c0864q.f11419x = this.a;
        return c0864q;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        C0864q c0864q = (C0864q) pVar;
        c0864q.f11419x.a.m(c0864q);
        C0862o c0862o = this.a;
        c0864q.f11419x = c0862o;
        c0862o.a.b(c0864q);
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
