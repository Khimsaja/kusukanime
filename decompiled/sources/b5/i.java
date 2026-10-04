package b5;

import n5.AbstractC1586x;
import n5.B;
import u4.AbstractC2115v;
import u4.EnumC2100f;
import u4.InterfaceC2099e;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: b, reason: collision with root package name */
    public final W4.b f10949b;

    /* renamed from: c, reason: collision with root package name */
    public final W4.e f10950c;

    public i(W4.b bVar, W4.e eVar) {
        super(new O3.l(bVar, eVar));
        this.f10949b = bVar;
        this.f10950c = eVar;
    }

    @Override // b5.g
    public final AbstractC1586x a(InterfaceC2118y interfaceC2118y) {
        B bG;
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        W4.b bVar = this.f10949b;
        InterfaceC2099e interfaceC2099eD = AbstractC2115v.d(interfaceC2118y, bVar);
        if (interfaceC2099eD != null) {
            int i7 = Z4.e.a;
            if (!Z4.e.m(interfaceC2099eD, EnumC2100f.f16313m)) {
                interfaceC2099eD = null;
            }
            if (interfaceC2099eD != null && (bG = interfaceC2099eD.g()) != null) {
                return bG;
            }
        }
        p5.k kVar = p5.k.f14433K;
        String string = bVar.toString();
        String str = this.f10950c.f9624k;
        kotlin.jvm.internal.l.e("toString(...)", str);
        return p5.l.c(kVar, string, str);
    }

    @Override // b5.g
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10949b.f());
        sb.append('.');
        sb.append(this.f10950c);
        return sb.toString();
    }
}
