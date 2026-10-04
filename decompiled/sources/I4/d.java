package I4;

import e4.k;
import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import r4.AbstractC1886o;
import u4.InterfaceC2118y;
import x4.C2272S;

/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: k, reason: collision with root package name */
    public static final d f4056k = new d();

    @Override // e4.k
    public final Object invoke(Object obj) {
        AbstractC1586x type;
        InterfaceC2118y interfaceC2118y = (InterfaceC2118y) obj;
        Object obj2 = e.a;
        l.f("module", interfaceC2118y);
        C2272S c2272sY = n6.d.y(c.f4053b, interfaceC2118y.d().j(AbstractC1886o.f15012t));
        return (c2272sY == null || (type = c2272sY.getType()) == null) ? p5.l.c(p5.k.f14435M, new String[0]) : type;
    }
}
