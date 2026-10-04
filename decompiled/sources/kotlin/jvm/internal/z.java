package kotlin.jvm.internal;

import L.C0425v1;
import M.K;
import java.util.List;
import l4.EnumC1413A;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1427f;
import l4.InterfaceC1428g;
import l4.InterfaceC1431j;
import l4.InterfaceC1433l;
import l4.InterfaceC1440s;
import l4.InterfaceC1442u;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;

/* loaded from: classes.dex */
public class z {
    public InterfaceC1425d b(Class cls) {
        return new e(cls);
    }

    public InterfaceC1427f c(Class cls) {
        return new q(cls);
    }

    public InterfaceC1444w d(InterfaceC1444w interfaceC1444w) {
        D d4 = (D) interfaceC1444w;
        InterfaceC1426e interfaceC1426eC = interfaceC1444w.c();
        List listA = interfaceC1444w.a();
        d4.getClass();
        return new D(interfaceC1426eC, listA, d4.f12710m | 2);
    }

    public String i(h hVar) {
        String string = hVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(m mVar) {
        return i(mVar);
    }

    public void k(InterfaceC1445x interfaceC1445x, List list) {
        C c2 = (C) interfaceC1445x;
        c2.getClass();
        l.f("upperBounds", list);
        if (c2.f12707l == null) {
            c2.f12707l = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + c2 + "' have already been initialized.").toString());
    }

    public InterfaceC1444w l(InterfaceC1426e interfaceC1426e, List list, boolean z7) {
        l.f("classifier", interfaceC1426e);
        l.f("arguments", list);
        return new D(interfaceC1426e, list, z7 ? 1 : 0);
    }

    public InterfaceC1445x m(InterfaceC1425d interfaceC1425d) {
        EnumC1413A enumC1413A = EnumC1413A.f12731k;
        return new C(interfaceC1425d);
    }

    public InterfaceC1428g a(i iVar) {
        return iVar;
    }

    public InterfaceC1431j e(K k7) {
        return k7;
    }

    public InterfaceC1433l f(n nVar) {
        return nVar;
    }

    public InterfaceC1440s g(C0425v1 c0425v1) {
        return c0425v1;
    }

    public InterfaceC1442u h(r rVar) {
        return rVar;
    }
}
