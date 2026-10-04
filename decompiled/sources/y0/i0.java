package y0;

import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public final class i0 implements f0 {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2174I f17869k;

    /* renamed from: l, reason: collision with root package name */
    public final N f17870l;

    public i0(InterfaceC2174I interfaceC2174I, N n7) {
        this.f17869k = interfaceC2174I;
        this.f17870l = n7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.l.a(this.f17869k, i0Var.f17869k) && kotlin.jvm.internal.l.a(this.f17870l, i0Var.f17870l);
    }

    public final int hashCode() {
        return this.f17870l.hashCode() + (this.f17869k.hashCode() * 31);
    }

    public final String toString() {
        return "PlaceableResult(result=" + this.f17869k + ", placeable=" + this.f17870l + ')';
    }

    @Override // y0.f0
    public final boolean z() {
        return this.f17870l.v0().B();
    }
}
