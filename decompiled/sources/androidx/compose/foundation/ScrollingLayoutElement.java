package androidx.compose.foundation;

import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.o0;
import q.p0;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Ly0/S;", "Lq/p0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLayoutElement extends S {
    public final o0 a;

    public ScrollingLayoutElement(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            return l.a(this.a, ((ScrollingLayoutElement) obj).a);
        }
        return false;
    }

    @Override // y0.S
    public final p h() {
        p0 p0Var = new p0();
        p0Var.f14608x = this.a;
        p0Var.f14609y = true;
        return p0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC0703b.d(this.a.hashCode() * 31, 31, false);
    }

    @Override // y0.S
    public final void m(p pVar) {
        p0 p0Var = (p0) pVar;
        p0Var.f14608x = this.a;
        p0Var.f14609y = true;
    }
}
