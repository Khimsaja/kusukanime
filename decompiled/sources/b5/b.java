package b5;

import java.util.List;
import n5.AbstractC1586x;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import u4.InterfaceC2102h;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f10946b;

    public b(e4.k kVar, List list) {
        super(list);
        this.f10946b = kVar;
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        InterfaceC2102h interfaceC2102hF;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        AbstractC1586x abstractC1586x = (AbstractC1586x) this.f10946b.invoke(interfaceC2118y);
        if (!AbstractC1880i.y(abstractC1586x) && (((interfaceC2102hF = abstractC1586x.t0().f()) == null || AbstractC1880i.r(interfaceC2102hF) == null) && !AbstractC1880i.B(abstractC1586x, AbstractC1886o.f14983W.a) && !AbstractC1880i.B(abstractC1586x, AbstractC1886o.f14984X.a) && !AbstractC1880i.B(abstractC1586x, AbstractC1886o.f14985Y.a))) {
            AbstractC1880i.B(abstractC1586x, AbstractC1886o.f14986Z.a);
        }
        return abstractC1586x;
    }
}
