package y0;

import O.C0517t;
import f6.AbstractC0905c;
import m.C1501v;

/* renamed from: y0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2367n extends a0.p {

    /* renamed from: x, reason: collision with root package name */
    public final int f17879x = Z.f(this);

    /* renamed from: y, reason: collision with root package name */
    public a0.p f17880y;

    @Override // a0.p
    public final void B0() {
        super.B0();
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.B0();
        }
    }

    @Override // a0.p
    public final void C0() {
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.C0();
        }
        super.C0();
    }

    @Override // a0.p
    public final void D0() {
        super.D0();
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.D0();
        }
    }

    @Override // a0.p
    public final void E0(a0.p pVar) {
        this.f10402k = pVar;
        for (a0.p pVar2 = this.f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
            pVar2.E0(pVar);
        }
    }

    @Override // a0.p
    public final void F0(Y y7) {
        this.f10409r = y7;
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.F0(y7);
        }
    }

    public final void G0(InterfaceC2366m interfaceC2366m) {
        a0.p pVar = ((a0.p) interfaceC2366m).f10402k;
        if (pVar != interfaceC2366m) {
            a0.p pVar2 = interfaceC2366m instanceof a0.p ? (a0.p) interfaceC2366m : null;
            a0.p pVar3 = pVar2 != null ? pVar2.f10406o : null;
            if (pVar != this.f10402k || !kotlin.jvm.internal.l.a(pVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (pVar.f10414w) {
            AbstractC0905c.C("Cannot delegate to an already attached node");
            throw null;
        }
        pVar.E0(this.f10402k);
        int i7 = this.f10404m;
        int iG = Z.g(pVar);
        pVar.f10404m = iG;
        int i8 = this.f10404m;
        int i9 = iG & 2;
        if (i9 != 0 && (i8 & 2) != 0 && !(this instanceof InterfaceC2375w)) {
            AbstractC0905c.C("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + pVar);
            throw null;
        }
        pVar.f10407p = this.f17880y;
        this.f17880y = pVar;
        pVar.f10406o = this;
        I0(iG | i8, false);
        if (this.f10414w) {
            if (i9 == 0 || (i7 & 2) != 0) {
                F0(this.f10409r);
            } else {
                C0517t c0517t = AbstractC2359f.v(this).f17660G;
                this.f10402k.F0(null);
                c0517t.k();
            }
            pVar.w0();
            pVar.C0();
            Z.a(pVar);
        }
    }

    public final void H0(InterfaceC2366m interfaceC2366m) {
        a0.p pVar = null;
        for (a0.p pVar2 = this.f17880y; pVar2 != null; pVar2 = pVar2.f10407p) {
            if (pVar2 == interfaceC2366m) {
                boolean z7 = pVar2.f10414w;
                if (z7) {
                    C1501v c1501v = Z.a;
                    if (!z7) {
                        AbstractC0905c.C("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                    Z.b(pVar2, -1, 2);
                    pVar2.D0();
                    pVar2.x0();
                }
                pVar2.E0(pVar2);
                pVar2.f10405n = 0;
                if (pVar == null) {
                    this.f17880y = pVar2.f10407p;
                } else {
                    pVar.f10407p = pVar2.f10407p;
                }
                pVar2.f10407p = null;
                pVar2.f10406o = null;
                int i7 = this.f10404m;
                int iG = Z.g(this);
                I0(iG, true);
                if (this.f10414w && (i7 & 2) != 0 && (iG & 2) == 0) {
                    C0517t c0517t = AbstractC2359f.v(this).f17660G;
                    this.f10402k.F0(null);
                    c0517t.k();
                    return;
                }
                return;
            }
            pVar = pVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2366m).toString());
    }

    public final void I0(int i7, boolean z7) {
        a0.p pVar;
        int i8 = this.f10404m;
        this.f10404m = i7;
        if (i8 != i7) {
            a0.p pVar2 = this.f10402k;
            if (pVar2 == this) {
                this.f10405n = i7;
            }
            if (this.f10414w) {
                a0.p pVar3 = this;
                while (pVar3 != null) {
                    i7 |= pVar3.f10404m;
                    pVar3.f10404m = i7;
                    if (pVar3 == pVar2) {
                        break;
                    } else {
                        pVar3 = pVar3.f10406o;
                    }
                }
                if (z7 && pVar3 == pVar2) {
                    i7 = Z.g(pVar2);
                    pVar2.f10404m = i7;
                }
                int i9 = i7 | ((pVar3 == null || (pVar = pVar3.f10407p) == null) ? 0 : pVar.f10405n);
                while (pVar3 != null) {
                    i9 |= pVar3.f10404m;
                    pVar3.f10405n = i9;
                    pVar3 = pVar3.f10406o;
                }
            }
        }
    }

    @Override // a0.p
    public final void w0() {
        super.w0();
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.F0(this.f10409r);
            if (!pVar.f10414w) {
                pVar.w0();
            }
        }
    }

    @Override // a0.p
    public final void x0() {
        for (a0.p pVar = this.f17880y; pVar != null; pVar = pVar.f10407p) {
            pVar.x0();
        }
        super.x0();
    }
}
