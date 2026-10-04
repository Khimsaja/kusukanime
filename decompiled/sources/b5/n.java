package b5;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import n5.AbstractC1566c;
import n5.I;
import n5.M;
import r4.AbstractC1880i;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public final class n implements M {
    public final Set a;

    /* renamed from: b, reason: collision with root package name */
    public final O3.q f10954b;

    public n(Set set) {
        I.f13362l.getClass();
        I i7 = I.f13363m;
        kotlin.jvm.internal.l.f("attributes", i7);
        AbstractC1566c.v(p5.l.a(p5.h.f14410m, true, "unknown integer literal type"), P3.y.f7779k, i7, this, false);
        this.f10954b = z1.c.C(new H4.u(6, this));
        this.a = set;
    }

    @Override // n5.M
    public final AbstractC1880i d() {
        throw null;
    }

    @Override // n5.M
    public final boolean e() {
        return false;
    }

    @Override // n5.M
    public final InterfaceC2102h f() {
        return null;
    }

    @Override // n5.M
    public final Collection g() {
        return (List) this.f10954b.getValue();
    }

    @Override // n5.M
    public final List getParameters() {
        return P3.y.f7779k;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + P3.q.y0(this.a, ",", null, null, l.f10952k, 30) + ']');
        return sb.toString();
    }
}
