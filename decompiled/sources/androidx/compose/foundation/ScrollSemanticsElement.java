package androidx.compose.foundation;

import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.l0;
import q.o0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "Ly0/S;", "Lq/l0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class ScrollSemanticsElement extends S {
    public final o0 a;

    public ScrollSemanticsElement(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScrollSemanticsElement) {
            return l.a(this.a, ((ScrollSemanticsElement) obj).a);
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        l0 l0Var = new l0();
        l0Var.f14576x = this.a;
        l0Var.f14577y = true;
        return l0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0703b.d(AbstractC0703b.d(this.a.hashCode() * 31, 961, false), 31, true);
    }

    @Override // y0.S
    public final void m(p pVar) {
        l0 l0Var = (l0) pVar;
        l0Var.f14576x = this.a;
        l0Var.f14577y = true;
    }

    public final String toString() {
        return "ScrollSemanticsElement(state=" + this.a + ", reverseScrolling=false, flingBehavior=null, isScrollable=true, isVertical=true)";
    }
}
