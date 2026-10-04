package o;

import p.InterfaceC1715B;

/* renamed from: o.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1595G {
    public final InterfaceC1715B a;

    public C1595G(InterfaceC1715B interfaceC1715B) {
        this.a = interfaceC1715B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595G)) {
            return false;
        }
        C1595G c1595g = (C1595G) obj;
        c1595g.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && kotlin.jvm.internal.l.a(this.a, c1595g.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
