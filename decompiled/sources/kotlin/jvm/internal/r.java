package kotlin.jvm.internal;

import l4.InterfaceC1424c;
import l4.InterfaceC1441t;
import l4.InterfaceC1442u;
import o4.AbstractC1694t;

/* loaded from: classes.dex */
public class r extends s implements InterfaceC1442u {
    public r(Class cls, String str, String str2, int i7) {
        super(AbstractC1403c.NO_RECEIVER, cls, str, str2, i7);
    }

    @Override // kotlin.jvm.internal.AbstractC1403c
    public final InterfaceC1424c computeReflected() {
        return y.a.h(this);
    }

    public Object get(Object obj) {
        return ((AbstractC1694t) getGetter()).call(obj);
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // l4.InterfaceC1443v
    public final InterfaceC1441t getGetter() {
        return ((InterfaceC1442u) getReflected()).getGetter();
    }
}
