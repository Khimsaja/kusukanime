package L4;

import java.util.Collection;
import u4.InterfaceC2099e;

/* loaded from: classes.dex */
public final class A implements w5.a {
    public static final A a = new A();

    @Override // w5.a
    public final Iterable c(Object obj) {
        int i7 = C.f6050p;
        Collection collectionG = ((InterfaceC2099e) obj).v().g();
        kotlin.jvm.internal.l.e("getSupertypes(...)", collectionG);
        return new P3.o(3, y5.k.V(P3.q.l0(collectionG), m.f6107p));
    }
}
