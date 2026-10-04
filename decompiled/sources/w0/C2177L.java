package w0;

import java.util.List;
import y0.AbstractC2359f;

/* renamed from: w0.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2177L implements InterfaceC2173H {
    public final InterfaceC2176K a;

    public C2177L(InterfaceC2176K interfaceC2176K) {
        this.a = interfaceC2176K;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return this.a.a(interfaceC2197o, AbstractC2359f.l(interfaceC2197o), i7);
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        return this.a.b(interfaceC2175J, AbstractC2359f.l(interfaceC2175J), j7);
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return this.a.c(interfaceC2197o, AbstractC2359f.l(interfaceC2197o), i7);
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return this.a.d(interfaceC2197o, AbstractC2359f.l(interfaceC2197o), i7);
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        return this.a.e(interfaceC2197o, AbstractC2359f.l(interfaceC2197o), i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2177L) && kotlin.jvm.internal.l.a(this.a, ((C2177L) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
