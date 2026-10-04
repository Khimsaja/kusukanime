package androidx.compose.foundation.selection;

import F0.f;
import a0.p;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import u.k;
import y0.AbstractC2359f;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/selection/SelectableElement;", "Ly0/S;", "LB/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectableElement extends S {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final k f10611b;

    /* renamed from: c, reason: collision with root package name */
    public final q.S f10612c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10613d;

    /* renamed from: e, reason: collision with root package name */
    public final f f10614e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0821a f10615f;

    public SelectableElement(boolean z7, k kVar, q.S s7, boolean z8, f fVar, InterfaceC0821a interfaceC0821a) {
        this.a = z7;
        this.f10611b = kVar;
        this.f10612c = s7;
        this.f10613d = z8;
        this.f10614e = fVar;
        this.f10615f = interfaceC0821a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.a == selectableElement.a && l.a(this.f10611b, selectableElement.f10611b) && l.a(this.f10612c, selectableElement.f10612c) && this.f10613d == selectableElement.f10613d && l.a(this.f10614e, selectableElement.f10614e) && this.f10615f == selectableElement.f10615f;
    }

    @Override // y0.S
    public final p h() {
        B.b bVar = new B.b(this.f10611b, this.f10612c, this.f10613d, null, this.f10614e, this.f10615f);
        bVar.f262R = this.a;
        return bVar;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        k kVar = this.f10611b;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        q.S s7 = this.f10612c;
        int iD = AbstractC0703b.d((iHashCode2 + (s7 != null ? s7.hashCode() : 0)) * 31, 31, this.f10613d);
        f fVar = this.f10614e;
        return this.f10615f.hashCode() + ((iD + (fVar != null ? Integer.hashCode(fVar.a) : 0)) * 31);
    }

    @Override // y0.S
    public final void m(p pVar) {
        B.b bVar = (B.b) pVar;
        boolean z7 = bVar.f262R;
        boolean z8 = this.a;
        if (z7 != z8) {
            bVar.f262R = z8;
            AbstractC2359f.p(bVar);
        }
        bVar.M0(this.f10611b, this.f10612c, this.f10613d, null, this.f10614e, this.f10615f);
    }
}
