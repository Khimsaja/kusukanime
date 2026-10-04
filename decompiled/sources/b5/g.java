package b5;

import n5.AbstractC1586x;
import u4.InterfaceC2118y;

/* loaded from: classes.dex */
public abstract class g {
    public final Object a;

    public g(Object obj) {
        this.a = obj;
    }

    public abstract AbstractC1586x a(InterfaceC2118y interfaceC2118y);

    public Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        g gVar = obj instanceof g ? (g) obj : null;
        return kotlin.jvm.internal.l.a(objB, gVar != null ? gVar.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
