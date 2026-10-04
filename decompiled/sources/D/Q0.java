package D;

import e4.InterfaceC0821a;
import p.AbstractC1755i;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;

/* loaded from: classes.dex */
public final class Q0 implements InterfaceC2201t {
    public final J0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1098b;

    /* renamed from: c, reason: collision with root package name */
    public final N0.C f1099c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0821a f1100d;

    public Q0(J0 j02, int i7, N0.C c2, InterfaceC0821a interfaceC0821a) {
        this.a = j02;
        this.f1098b = i7;
        this.f1099c = c2;
        this.f1100d = interfaceC0821a;
    }

    @Override // w0.InterfaceC2201t
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        w0.S sB = interfaceC2172G.b(T0.a.a(j7, 0, 0, 0, Integer.MAX_VALUE, 7));
        int iMin = Math.min(sB.f16841l, T0.a.g(j7));
        return interfaceC2175J.T(sB.f16840k, iMin, P3.z.f7780k, new Y(interfaceC2175J, this, sB, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q0)) {
            return false;
        }
        Q0 q02 = (Q0) obj;
        return kotlin.jvm.internal.l.a(this.a, q02.a) && this.f1098b == q02.f1098b && kotlin.jvm.internal.l.a(this.f1099c, q02.f1099c) && kotlin.jvm.internal.l.a(this.f1100d, q02.f1100d);
    }

    public final int hashCode() {
        return this.f1100d.hashCode() + ((this.f1099c.hashCode() + AbstractC1755i.a(this.f1098b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.f1098b + ", transformedText=" + this.f1099c + ", textLayoutResultProvider=" + this.f1100d + ')';
    }
}
