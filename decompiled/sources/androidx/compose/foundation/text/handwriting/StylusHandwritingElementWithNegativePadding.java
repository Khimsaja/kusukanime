package androidx.compose.foundation.text.handwriting;

import E.d;
import a0.p;
import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElementWithNegativePadding;", "Ly0/S;", "LE/d;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class StylusHandwritingElementWithNegativePadding extends S {
    public final InterfaceC0821a a;

    public StylusHandwritingElementWithNegativePadding(InterfaceC0821a interfaceC0821a) {
        this.a = interfaceC0821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && l.a(this.a, ((StylusHandwritingElementWithNegativePadding) obj).a);
    }

    @Override // y0.S
    public final p h() {
        return new d(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // y0.S
    public final void m(p pVar) {
        ((d) pVar).f1790z = this.a;
    }

    public final String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.a + ')';
    }
}
