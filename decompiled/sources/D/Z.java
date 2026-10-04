package D;

import e4.InterfaceC0821a;
import p.AbstractC1755i;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2201t;

/* loaded from: classes.dex */
public final class Z implements InterfaceC2201t {
    public final J0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1119b;

    /* renamed from: c, reason: collision with root package name */
    public final N0.C f1120c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0821a f1121d;

    public Z(J0 j02, int i7, N0.C c2, InterfaceC0821a interfaceC0821a) {
        this.a = j02;
        this.f1119b = i7;
        this.f1120c = c2;
        this.f1121d = interfaceC0821a;
    }

    @Override // w0.InterfaceC2201t
    public final InterfaceC2174I e(InterfaceC2175J interfaceC2175J, InterfaceC2172G interfaceC2172G, long j7) {
        long j8;
        if (interfaceC2172G.Y(T0.a.g(j7)) < T0.a.h(j7)) {
            j8 = j7;
        } else {
            j8 = j7;
            j7 = T0.a.a(j8, 0, Integer.MAX_VALUE, 0, 0, 13);
        }
        w0.S sB = interfaceC2172G.b(j7);
        int iMin = Math.min(sB.f16840k, T0.a.h(j8));
        return interfaceC2175J.T(iMin, sB.f16841l, P3.z.f7780k, new Y(interfaceC2175J, this, sB, iMin, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z7 = (Z) obj;
        return kotlin.jvm.internal.l.a(this.a, z7.a) && this.f1119b == z7.f1119b && kotlin.jvm.internal.l.a(this.f1120c, z7.f1120c) && kotlin.jvm.internal.l.a(this.f1121d, z7.f1121d);
    }

    public final int hashCode() {
        return this.f1121d.hashCode() + ((this.f1120c.hashCode() + AbstractC1755i.a(this.f1119b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.a + ", cursorOffset=" + this.f1119b + ", transformedText=" + this.f1120c + ", textLayoutResultProvider=" + this.f1121d + ')';
    }
}
