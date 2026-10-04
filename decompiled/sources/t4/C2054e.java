package t4;

import l4.InterfaceC1443v;
import r4.AbstractC1880i;
import u4.InterfaceC2097c;
import u4.InterfaceC2099e;

/* renamed from: t4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2054e implements w5.a {
    public static final C2054e a = new C2054e();

    public static InterfaceC2099e a(InterfaceC2099e interfaceC2099e) {
        W4.d dVarG = Z4.e.g(interfaceC2099e);
        String str = C2053d.a;
        W4.c cVar = (W4.c) C2053d.f16047k.get(dVarG);
        if (cVar != null) {
            return d5.e.e(interfaceC2099e).j(cVar);
        }
        throw new IllegalArgumentException("Given class " + interfaceC2099e + " is not a read-only collection");
    }

    public static InterfaceC2099e b(W4.c cVar, AbstractC1880i abstractC1880i) {
        kotlin.jvm.internal.l.f("builtIns", abstractC1880i);
        String str = C2053d.a;
        W4.b bVar = (W4.b) C2053d.f16044h.get(cVar.a);
        if (bVar != null) {
            return abstractC1880i.j(bVar.a());
        }
        return null;
    }

    @Override // w5.a
    public Iterable c(Object obj) {
        InterfaceC1443v[] interfaceC1443vArr = o.f16074h;
        return ((InterfaceC2097c) obj).a().m();
    }
}
