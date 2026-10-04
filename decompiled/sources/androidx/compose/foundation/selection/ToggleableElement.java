package androidx.compose.foundation.selection;

import F0.f;
import a0.p;
import b1.AbstractC0703b;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import p.AbstractC1755i;
import u.k;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/ToggleableElement;", "Ly0/S;", "LB/f;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ToggleableElement extends S {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10616b;

    /* renamed from: c, reason: collision with root package name */
    public final q.S f10617c;

    /* renamed from: d, reason: collision with root package name */
    public final f f10618d;

    /* renamed from: e, reason: collision with root package name */
    public final e4.k f10619e;

    public ToggleableElement(boolean z7, k kVar, q.S s7, f fVar, e4.k kVar2) {
        this.a = z7;
        this.f10616b = kVar;
        this.f10617c = s7;
        this.f10618d = fVar;
        this.f10619e = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.a == toggleableElement.a && l.a(this.f10616b, toggleableElement.f10616b) && l.a(this.f10617c, toggleableElement.f10617c) && this.f10618d.equals(toggleableElement.f10618d) && this.f10619e == toggleableElement.f10619e;
    }

    @Override // y0.S
    public final p h() {
        f fVar = this.f10618d;
        return new B.f(this.a, this.f10616b, this.f10617c, fVar, this.f10619e);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        k kVar = this.f10616b;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        q.S s7 = this.f10617c;
        return this.f10619e.hashCode() + AbstractC1755i.a(this.f10618d.a, AbstractC0703b.d((iHashCode2 + (s7 != null ? s7.hashCode() : 0)) * 31, 31, true), 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        B.f fVar = (B.f) pVar;
        boolean z7 = fVar.f272R;
        boolean z8 = this.a;
        if (z7 != z8) {
            fVar.f272R = z8;
            AbstractC2359f.p(fVar);
        }
        fVar.f273S = this.f10619e;
        f fVar2 = this.f10618d;
        fVar.M0(this.f10616b, this.f10617c, true, null, fVar2, fVar.f274T);
    }
}
