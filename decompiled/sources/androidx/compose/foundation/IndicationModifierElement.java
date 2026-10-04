package androidx.compose.foundation;

import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import q.Q;
import u.j;
import y0.InterfaceC2366m;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Ly0/S;", "Lq/Q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationModifierElement extends S {
    public final j a;

    /* renamed from: b, reason: collision with root package name */
    public final q.S f10556b;

    public IndicationModifierElement(j jVar, q.S s7) {
        this.a = jVar;
        this.f10556b = s7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return l.a(this.a, indicationModifierElement.a) && l.a(this.f10556b, indicationModifierElement.f10556b);
    }

    @Override // y0.S
    public final p h() {
        InterfaceC2366m interfaceC2366mB = this.f10556b.b(this.a);
        Q q6 = new Q();
        q6.f14497z = interfaceC2366mB;
        q6.G0(interfaceC2366mB);
        return q6;
    }

    public final int hashCode() {
        return this.f10556b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        Q q6 = (Q) pVar;
        InterfaceC2366m interfaceC2366mB = this.f10556b.b(this.a);
        q6.H0(q6.f14497z);
        q6.f14497z = interfaceC2366mB;
        q6.G0(interfaceC2366mB);
    }
}
