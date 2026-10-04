package v;

import x0.InterfaceC2243c;
import x0.InterfaceC2247g;

/* renamed from: v.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2142v implements InterfaceC2243c {
    public final e4.k a;

    /* renamed from: b, reason: collision with root package name */
    public m0 f16514b;

    public C2142v(e4.k kVar) {
        this.a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2142v) && ((C2142v) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // x0.InterfaceC2243c
    public final void j(InterfaceC2247g interfaceC2247g) {
        m0 m0Var = (m0) interfaceC2247g.h(p0.a);
        if (kotlin.jvm.internal.l.a(m0Var, this.f16514b)) {
            return;
        }
        this.f16514b = m0Var;
        this.a.invoke(m0Var);
    }
}
