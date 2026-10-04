package o4;

import l4.InterfaceC1428g;
import l4.InterfaceC1437p;
import p4.InterfaceC1801g;
import u4.InterfaceC2094J;
import x4.AbstractC2261G;

/* loaded from: classes.dex */
public abstract class l0 extends AbstractC1694t implements InterfaceC1428g, InterfaceC1437p {
    @Override // o4.AbstractC1694t
    public final AbstractC1654H g() {
        return u().f13737r;
    }

    @Override // o4.AbstractC1694t
    public final InterfaceC1801g h() {
        return null;
    }

    @Override // l4.InterfaceC1428g
    public final boolean isExternal() {
        return ((AbstractC2261G) t()).f17359p;
    }

    @Override // l4.InterfaceC1428g
    public final boolean isInfix() {
        t();
        return false;
    }

    @Override // l4.InterfaceC1428g
    public final boolean isInline() {
        return ((AbstractC2261G) t()).f17362s;
    }

    @Override // l4.InterfaceC1428g
    public final boolean isOperator() {
        t();
        return false;
    }

    @Override // l4.InterfaceC1424c
    public final boolean isSuspend() {
        t();
        return false;
    }

    @Override // o4.AbstractC1694t
    public final boolean s() {
        return u().s();
    }

    public abstract InterfaceC2094J t();

    public abstract q0 u();
}
