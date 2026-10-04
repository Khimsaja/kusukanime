package androidx.compose.ui.input.pointer;

import D.InterfaceC0071p0;
import a0.p;
import e4.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import s0.C1955C;
import y0.S;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendPointerInputElement;", "Ly0/S;", "Ls0/C;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendPointerInputElement extends S {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10667b;

    /* renamed from: c, reason: collision with root package name */
    public final n f10668c;

    public SuspendPointerInputElement(Object obj, InterfaceC0071p0 interfaceC0071p0, n nVar, int i7) {
        interfaceC0071p0 = (i7 & 2) != 0 ? null : interfaceC0071p0;
        this.a = obj;
        this.f10667b = interfaceC0071p0;
        this.f10668c = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        return l.a(this.a, suspendPointerInputElement.a) && l.a(this.f10667b, suspendPointerInputElement.f10667b) && this.f10668c == suspendPointerInputElement.f10668c;
    }

    @Override // y0.S
    public final p h() {
        return new C1955C(this.a, this.f10667b, this.f10668c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f10667b;
        return this.f10668c.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }

    @Override // y0.S
    public final void m(p pVar) {
        C1955C c1955c = (C1955C) pVar;
        Object obj = c1955c.f15437x;
        Object obj2 = this.a;
        boolean z7 = !l.a(obj, obj2);
        c1955c.f15437x = obj2;
        Object obj3 = c1955c.f15438y;
        Object obj4 = this.f10667b;
        boolean z8 = l.a(obj3, obj4) ? z7 : true;
        c1955c.f15438y = obj4;
        if (z8) {
            c1955c.I0();
        }
        c1955c.f15439z = this.f10668c;
    }
}
