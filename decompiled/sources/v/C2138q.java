package v;

import L.C0361d1;
import b1.AbstractC0703b;
import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* renamed from: v.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138q implements InterfaceC2173H {
    public final a0.i a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16500b;

    public C2138q(a0.i iVar, boolean z7) {
        this.a = iVar;
        this.f16500b = z7;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        boolean zIsEmpty = list.isEmpty();
        P3.z zVar = P3.z.f7780k;
        if (zIsEmpty) {
            return interfaceC2175J.T(T0.a.j(j7), T0.a.i(j7), zVar, C2134m.f16463n);
        }
        long jA = this.f16500b ? j7 : T0.a.a(j7, 0, 0, 0, 0, 10);
        if (list.size() == 1) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(0);
            boolean z7 = interfaceC2172G.h() instanceof C2132k;
            w0.S sB = interfaceC2172G.b(jA);
            int iMax = Math.max(T0.a.j(j7), sB.f16840k);
            int iMax2 = Math.max(T0.a.i(j7), sB.f16841l);
            return interfaceC2175J.T(iMax, iMax2, zVar, new C2137p(sB, interfaceC2172G, interfaceC2175J, iMax, iMax2, this));
        }
        w0.S[] sArr = new w0.S[list.size()];
        kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
        vVar.f12718k = T0.a.j(j7);
        kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
        vVar2.f12718k = T0.a.i(j7);
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i7);
            boolean z8 = interfaceC2172G2.h() instanceof C2132k;
            w0.S sB2 = interfaceC2172G2.b(jA);
            sArr[i7] = sB2;
            vVar.f12718k = Math.max(vVar.f12718k, sB2.f16840k);
            vVar2.f12718k = Math.max(vVar2.f12718k, sB2.f16841l);
        }
        return interfaceC2175J.T(vVar.f12718k, vVar2.f12718k, zVar, new C0361d1(sArr, list, interfaceC2175J, vVar, vVar2, this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2138q)) {
            return false;
        }
        C2138q c2138q = (C2138q) obj;
        return this.a.equals(c2138q.a) && this.f16500b == c2138q.f16500b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16500b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append(this.a);
        sb.append(", propagateMinConstraints=");
        return AbstractC0703b.n(sb, this.f16500b, ')');
    }
}
