package v;

import java.io.Serializable;
import java.util.List;
import w0.InterfaceC2172G;
import w0.InterfaceC2173H;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.InterfaceC2197o;

/* loaded from: classes.dex */
public final class f0 implements InterfaceC2173H, b0 {
    public final InterfaceC2126e a;

    /* renamed from: b, reason: collision with root package name */
    public final a0.h f16442b;

    public f0(InterfaceC2126e interfaceC2126e, a0.h hVar) {
        this.a = interfaceC2126e;
        this.f16442b = hVar;
    }

    @Override // w0.InterfaceC2173H
    public final int a(InterfaceC2197o interfaceC2197o, List list, int i7) {
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
                int iMin2 = Math.min(interfaceC2172G.Y(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2172G.c(iMin2));
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
                iMax = Math.max(iMax, interfaceC2172G2.c(iRound != Integer.MAX_VALUE ? Math.round(iRound * f8) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // w0.InterfaceC2173H
    public final InterfaceC2174I b(InterfaceC2175J interfaceC2175J, List list, long j7) {
        return AbstractC2123b.g(this, T0.a.j(j7), T0.a.i(j7), T0.a.h(j7), T0.a.g(j7), interfaceC2175J.O(this.a.a()), interfaceC2175J, list, new w0.S[list.size()], 0, list.size(), null, 0);
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
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
            int iY = interfaceC2172G.Y(i7);
            if (f7 == 0.0f) {
                i8 += iY;
            } else if (f7 > 0.0f) {
                f5 += f7;
                iMax = Math.max(iMax, Math.round(iY / f7));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f5) + i8;
    }

    @Override // w0.InterfaceC2173H
    public final int d(InterfaceC2197o interfaceC2197o, List list, int i7) {
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
            int iW = interfaceC2172G.W(i7);
            if (f7 == 0.0f) {
                i8 += iW;
            } else if (f7 > 0.0f) {
                f5 += f7;
                iMax = Math.max(iMax, Math.round(iW / f7));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f5) + i8;
    }

    @Override // w0.InterfaceC2173H
    public final int e(InterfaceC2197o interfaceC2197o, List list, int i7) {
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
                int iMin2 = Math.min(interfaceC2172G.Y(Integer.MAX_VALUE), i7 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i7 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, interfaceC2172G.b0(iMin2));
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
                iMax = Math.max(iMax, interfaceC2172G2.b0(iRound != Integer.MAX_VALUE ? Math.round(iRound * f8) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return kotlin.jvm.internal.l.a(this.a, f0Var.a) && kotlin.jvm.internal.l.a(this.f16442b, f0Var.f16442b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v.b0
    public final InterfaceC2174I f(w0.S[] sArr, InterfaceC2175J interfaceC2175J, int[] iArr, int i7, int i8, int[] iArr2, int i9, int i10, int i11) {
        return interfaceC2175J.T(i7, i8, P3.z.f7780k, new D.Y((Object) sArr, (Object) this, i8, (Serializable) iArr, 6));
    }

    @Override // v.b0
    public final void g(int i7, int[] iArr, int[] iArr2, InterfaceC2175J interfaceC2175J) {
        this.a.b(interfaceC2175J, i7, iArr, interfaceC2175J.getLayoutDirection(), iArr2);
    }

    @Override // v.b0
    public final long h(int i7, int i8, int i9, boolean z7) {
        return e0.a(i7, i8, i9, z7);
    }

    public final int hashCode() {
        return Float.hashCode(this.f16442b.a) + (this.a.hashCode() * 31);
    }

    @Override // v.b0
    public final int i(w0.S s7) {
        return s7.f16841l;
    }

    @Override // v.b0
    public final int j(w0.S s7) {
        return s7.f16840k;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.f16442b + ')';
    }
}
