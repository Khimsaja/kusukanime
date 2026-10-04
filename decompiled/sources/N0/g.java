package N0;

import B1.G;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class g implements i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6877b;

    public g(int i7, int i8) {
        this.a = i7;
        this.f6877b = i8;
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.").toString());
        }
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        int i7 = eVar.f1416m;
        int i8 = this.f6877b;
        int iN = i7 + i8;
        int i9 = (i7 ^ iN) & (i8 ^ iN);
        G g4 = (G) eVar.f1419p;
        if (i9 < 0) {
            iN = g4.n();
        }
        eVar.a(eVar.f1416m, Math.min(iN, g4.n()));
        int i10 = eVar.f1415l;
        int i11 = this.a;
        int i12 = i10 - i11;
        if (((i10 ^ i12) & (i11 ^ i10)) < 0) {
            i12 = 0;
        }
        eVar.a(Math.max(0, i12), eVar.f1415l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f6877b == gVar.f6877b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f6877b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0703b.l(sb, this.f6877b, ')');
    }
}
