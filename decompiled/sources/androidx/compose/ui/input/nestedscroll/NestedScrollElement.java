package androidx.compose.ui.input.nestedscroll;

import a0.p;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import r0.C1861b;
import r0.InterfaceC1860a;
import r0.e;
import r0.h;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Ly0/S;", "Lr0/h;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class NestedScrollElement extends S {
    public final InterfaceC1860a a;

    /* renamed from: b, reason: collision with root package name */
    public final e f10666b;

    public NestedScrollElement(InterfaceC1860a interfaceC1860a, e eVar) {
        this.a = interfaceC1860a;
        this.f10666b = eVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        return l.a(nestedScrollElement.a, this.a) && l.a(nestedScrollElement.f10666b, this.f10666b);
    }

    @Override // y0.S
    public final p h() {
        return new h(this.a, this.f10666b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e eVar = this.f10666b;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    @Override // y0.S
    public final void m(p pVar) {
        h hVar = (h) pVar;
        hVar.f14804x = this.a;
        e eVar = hVar.f14805y;
        if (eVar.a == hVar) {
            eVar.a = null;
        }
        e eVar2 = this.f10666b;
        if (eVar2 == null) {
            hVar.f14805y = new e();
        } else if (!eVar2.equals(eVar)) {
            hVar.f14805y = eVar2;
        }
        if (hVar.f10414w) {
            e eVar3 = hVar.f14805y;
            eVar3.a = hVar;
            eVar3.f14791b = new C1861b(1, hVar);
            eVar3.f14792c = hVar.u0();
        }
    }
}
