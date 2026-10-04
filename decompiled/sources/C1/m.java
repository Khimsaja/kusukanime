package C1;

import h4.InterfaceC1010b;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class m implements InterfaceC1010b {
    public final int a;

    public /* synthetic */ m(int i7) {
        this.a = i7;
    }

    @Override // h4.InterfaceC1010b
    public Object getValue(Object obj, InterfaceC1443v interfaceC1443v) {
        t5.d dVar = (t5.d) obj;
        kotlin.jvm.internal.l.f("thisRef", dVar);
        kotlin.jvm.internal.l.f("property", interfaceC1443v);
        return dVar.f16095k.get(this.a);
    }
}
