package s0;

import D.AbstractC0047d0;
import y0.AbstractC2359f;
import y0.InterfaceC2365l;
import y0.j0;
import y0.o0;
import z0.AbstractC2455l0;
import z0.L;

/* renamed from: s0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967l extends a0.p implements o0, j0, InterfaceC2365l {

    /* renamed from: x, reason: collision with root package name */
    public boolean f15467x;

    public final void G0() {
        C1956a c1956a = AbstractC0047d0.f1136b;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        AbstractC2359f.y(this, new M0.B(2, xVar));
        InterfaceC1970o interfaceC1970o = (InterfaceC1970o) AbstractC2359f.i(this, AbstractC2455l0.f18800s);
        if (interfaceC1970o != null) {
            L.a.a(((z0.r) interfaceC1970o).a, c1956a);
        }
    }

    public final void H0() {
        kotlin.jvm.internal.t tVar = new kotlin.jvm.internal.t();
        tVar.f12716k = true;
        AbstractC2359f.z(this, new d0.d(tVar));
        if (tVar.f12716k) {
            G0();
        }
    }

    public final void I0() {
        O3.C c2;
        InterfaceC1970o interfaceC1970o;
        if (this.f15467x) {
            this.f15467x = false;
            if (this.f10414w) {
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                AbstractC2359f.y(this, new C1966k(xVar, 0));
                C1967l c1967l = (C1967l) xVar.f12720k;
                if (c1967l != null) {
                    c1967l.G0();
                    c2 = O3.C.a;
                } else {
                    c2 = null;
                }
                if (c2 != null || (interfaceC1970o = (InterfaceC1970o) AbstractC2359f.i(this, AbstractC2455l0.f18800s)) == null) {
                    return;
                }
                InterfaceC1969n.a.getClass();
                L.a.a(((z0.r) interfaceC1970o).a, AbstractC1971p.a);
            }
        }
    }

    @Override // y0.j0
    public final void W(C1963h c1963h, EnumC1964i enumC1964i, long j7) {
        if (enumC1964i == EnumC1964i.f15462l) {
            int i7 = c1963h.f15460d;
            if (i7 == 4) {
                this.f15467x = true;
                H0();
            } else if (i7 == 5) {
                I0();
            }
        }
    }

    @Override // y0.j0
    public final void f0() {
        I0();
    }

    @Override // y0.o0
    public final /* bridge */ /* synthetic */ Object p() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // a0.p
    public final void z0() {
        I0();
    }
}
