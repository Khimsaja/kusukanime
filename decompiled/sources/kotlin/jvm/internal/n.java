package kotlin.jvm.internal;

import l4.InterfaceC1424c;
import l4.InterfaceC1432k;
import l4.InterfaceC1433l;
import l4.InterfaceC1441t;

/* loaded from: classes.dex */
public abstract class n extends p implements InterfaceC1433l {
    @Override // kotlin.jvm.internal.AbstractC1403c
    public InterfaceC1424c computeReflected() {
        return y.a.f(this);
    }

    @Override // l4.InterfaceC1442u
    public Object getDelegate(Object obj) {
        return ((InterfaceC1433l) getReflected()).getDelegate(obj);
    }

    @Override // e4.k
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // l4.InterfaceC1443v
    public InterfaceC1441t getGetter() {
        return ((InterfaceC1433l) getReflected()).getGetter();
    }

    @Override // l4.InterfaceC1434m
    public InterfaceC1432k getSetter() {
        return ((InterfaceC1433l) getReflected()).getSetter();
    }
}
