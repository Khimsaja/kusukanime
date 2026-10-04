package F4;

import kotlin.jvm.internal.l;
import l4.InterfaceC1425d;
import n6.m;

/* loaded from: classes.dex */
public final class d {
    public final InterfaceC1425d a;

    public d(InterfaceC1425d interfaceC1425d) {
        l.f("klass", interfaceC1425d);
        this.a = interfaceC1425d;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return l.a(this.a, ((d) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return m.F(this.a).getName();
    }
}
