package androidx.compose.ui.layout;

import a0.p;
import e4.o;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import w0.C2202u;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Ly0/S;", "Lw0/u;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class LayoutElement extends S {
    public final o a;

    public LayoutElement(o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && l.a(this.a, ((LayoutElement) obj).a);
    }

    @Override // y0.S
    public final p h() {
        C2202u c2202u = new C2202u();
        c2202u.f16878x = this.a;
        return c2202u;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((C2202u) pVar).f16878x = this.a;
    }

    public final String toString() {
        return "LayoutElement(measure=" + this.a + ')';
    }
}
