package N0;

import B1.G;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class v implements i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6895b;

    public v(int i7, int i8) {
        this.a = i7;
        this.f6895b = i8;
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        int iK = e3.c.k(this.a, 0, ((G) eVar.f1419p).n());
        int iK2 = e3.c.k(this.f6895b, 0, ((G) eVar.f1419p).n());
        if (iK < iK2) {
            eVar.i(iK, iK2);
        } else {
            eVar.i(iK2, iK);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.f6895b == vVar.f6895b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f6895b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return AbstractC0703b.l(sb, this.f6895b, ')');
    }
}
