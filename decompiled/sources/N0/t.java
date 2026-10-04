package N0;

import B1.G;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class t implements i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6893b;

    public t(int i7, int i8) {
        this.a = i7;
        this.f6893b = i8;
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        if (eVar.f1417n != -1) {
            eVar.f1417n = -1;
            eVar.f1418o = -1;
        }
        G g4 = (G) eVar.f1419p;
        int iK = e3.c.k(this.a, 0, g4.n());
        int iK2 = e3.c.k(this.f6893b, 0, g4.n());
        if (iK != iK2) {
            if (iK < iK2) {
                eVar.h(iK, iK2);
            } else {
                eVar.h(iK2, iK);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.f6893b == tVar.f6893b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f6893b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return AbstractC0703b.l(sb, this.f6893b, ')');
    }
}
