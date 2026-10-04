package v;

import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;

/* renamed from: v.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2140t implements InterfaceC2173H, b0 {
    public final InterfaceC2128g a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.g f16513b;

    public C2140t(InterfaceC2128g interfaceC2128g, a0.g gVar) {
        this.a = interfaceC2128g;
        this.f16513b = gVar;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iO = interfaceC2197o.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i8 = 0;
        float f5 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i9);
            float f7 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G));
            int iC = interfaceC2172G.c(i7);
            if (f7 == 0.0f) {
                i8 += iC;
            } else if (f7 > 0.0f) {
                f5 += f7;
                iMax = Math.max(iMax, Math.round(iC / f7));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f5) + i8;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        return AbstractC2123b.g(this, T0.a.i(j7), T0.a.j(j7), T0.a.g(j7), T0.a.h(j7), interfaceC2175J.O(this.a.a()), interfaceC2175J, list, new w0.S[list.size()], 0, list.size(), null, 0);
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iO = interfaceC2197o.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i7);
        int size = list.size();
        int iMax = 0;
        float f5 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i8);
            float f7 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G));
            if (f7 == 0.0f) {
                int iMin2 = Math.min(interfaceC2172G.c(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2172G.Y(iMin2));
            } else if (f7 > 0.0f) {
                f5 += f7;
            }
        }
        int iRound = f5 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f5);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i9);
            float f8 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G2));
            if (f8 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2172G2.Y(iRound != Integer.MAX_VALUE ? Math.round(iRound * f8) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iO = interfaceC2197o.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i7);
        int size = list.size();
        int iMax = 0;
        float f5 = 0.0f;
        for (int i8 = 0; i8 < size; i8++) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i8);
            float f7 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G));
            if (f7 == 0.0f) {
                int iMin2 = Math.min(interfaceC2172G.c(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2172G.W(iMin2));
            } else if (f7 > 0.0f) {
                f5 += f7;
            }
        }
        int iRound = f5 == 0.0f ? 0 : i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i7 - iMin, 0) / f5);
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            InterfaceC2172G interfaceC2172G2 = (InterfaceC2172G) list.get(i9);
            float f8 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G2));
            if (f8 > 0.0f) {
                iMax = Math.max(iMax, interfaceC2172G2.W(iRound != Integer.MAX_VALUE ? Math.round(iRound * f8) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
        int iO = interfaceC2197o.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i8 = 0;
        float f5 = 0.0f;
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC2172G interfaceC2172G = (InterfaceC2172G) list.get(i9);
            float f7 = AbstractC2123b.f(AbstractC2123b.e(interfaceC2172G));
            int iB0 = interfaceC2172G.b0(i7);
            if (f7 == 0.0f) {
                i8 += iB0;
            } else if (f7 > 0.0f) {
                f5 += f7;
                iMax = Math.max(iMax, Math.round(iB0 / f7));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f5) + i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2140t)) {
            return false;
        }
        C2140t c2140t = (C2140t) obj;
        return kotlin.jvm.internal.l.a(this.a, c2140t.a) && this.f16513b.equals(c2140t.f16513b);
    }

    @Override // v.b0
    public final InterfaceC2174I f(w0.S[] sArr, InterfaceC2175J interfaceC2175J, int[] iArr, int i7, int i8, int[] iArr2, int i9, int i10, int i11) {
        return interfaceC2175J.T(i8, i7, P3.z.f7780k, new C2139s(sArr, this, i8, interfaceC2175J, iArr));
    }

    @Override // v.b0
    public final void g(int i7, int[] iArr, int[] iArr2, InterfaceC2175J interfaceC2175J) {
        this.a.c(interfaceC2175J, i7, iArr, iArr2);
    }

    @Override // v.b0
    public final long h(int i7, int i8, int i9, boolean z7) {
        return r.b(i7, i8, i9, z7);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16513b.a) + (this.a.hashCode() * 31);
    }

    @Override // v.b0
    public final int i(w0.S s7) {
        return s7.f16840k;
    }

    @Override // v.b0
    public final int j(w0.S s7) {
        return s7.f16841l;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.f16513b + ')';
    }
}
