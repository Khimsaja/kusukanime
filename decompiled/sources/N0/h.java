package N0;

import B1.G;
import b1.AbstractC0703b;

/* loaded from: classes.dex */
public final class h implements i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6878b;

    public h(int i7, int i8) {
        this.a = i7;
        this.f6878b = i8;
        if (i7 < 0 || i8 < 0) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i7 + " and " + i8 + " respectively.").toString());
        }
    }

    @Override // N0.i
    public final void a(D2.e eVar) {
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i8 < this.a) {
                int i10 = i9 + 1;
                int i11 = eVar.f1415l;
                if (i11 <= i10) {
                    i9 = i11;
                    break;
                } else {
                    i9 = (Character.isHighSurrogate(eVar.b((i11 - i10) + (-1))) && Character.isLowSurrogate(eVar.b(eVar.f1415l - i10))) ? i9 + 2 : i10;
                    i8++;
                }
            } else {
                break;
            }
        }
        int iN = 0;
        while (true) {
            if (i7 >= this.f6878b) {
                break;
            }
            int i12 = iN + 1;
            int i13 = eVar.f1416m + i12;
            G g4 = (G) eVar.f1419p;
            if (i13 >= g4.n()) {
                iN = g4.n() - eVar.f1416m;
                break;
            } else {
                iN = (Character.isHighSurrogate(eVar.b((eVar.f1416m + i12) + (-1))) && Character.isLowSurrogate(eVar.b(eVar.f1416m + i12))) ? iN + 2 : i12;
                i7++;
            }
        }
        int i14 = eVar.f1416m;
        eVar.a(i14, iN + i14);
        int i15 = eVar.f1415l;
        eVar.a(i15 - i9, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.f6878b == hVar.f6878b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f6878b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return AbstractC0703b.l(sb, this.f6878b, ')');
    }
}
