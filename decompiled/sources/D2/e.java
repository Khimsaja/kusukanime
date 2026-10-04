package D2;

import B1.B;
import B1.G;
import B1.s;
import H0.C0214f;
import H0.H;
import b1.AbstractC0703b;
import l4.AbstractC1420H;

/* loaded from: classes.dex */
public final class e implements p2.b {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1414k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f1415l;

    /* renamed from: m, reason: collision with root package name */
    public int f1416m;

    /* renamed from: n, reason: collision with root package name */
    public int f1417n;

    /* renamed from: o, reason: collision with root package name */
    public int f1418o;

    /* renamed from: p, reason: collision with root package name */
    public final Object f1419p;

    public e(C0214f c0214f, long j7) {
        String str = c0214f.a;
        G g4 = new G(2, (byte) 0);
        g4.f295d = str;
        g4.f293b = -1;
        g4.f294c = -1;
        this.f1419p = g4;
        this.f1415l = H.e(j7);
        this.f1416m = H.d(j7);
        this.f1417n = -1;
        this.f1418o = -1;
        int iE = H.e(j7);
        int iD = H.d(j7);
        String str2 = c0214f.a;
        if (iE < 0 || iE > str2.length()) {
            StringBuilder sbP = AbstractC0703b.p(iE, "start (", ") offset is outside of text region ");
            sbP.append(str2.length());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (iD < 0 || iD > str2.length()) {
            StringBuilder sbP2 = AbstractC0703b.p(iD, "end (", ") offset is outside of text region ");
            sbP2.append(str2.length());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (iE > iD) {
            throw new IllegalArgumentException(A6.b.e(iE, iD, "Do not set reversed range: ", " > "));
        }
    }

    public void a(int i7, int i8) {
        long jC = AbstractC1420H.c(i7, i8);
        ((G) this.f1419p).y("", i7, i8);
        long jS = q0.c.S(AbstractC1420H.c(this.f1415l, this.f1416m), jC);
        k(H.e(jS));
        j(H.d(jS));
        int i9 = this.f1417n;
        if (i9 != -1) {
            long jS2 = q0.c.S(AbstractC1420H.c(i9, this.f1418o), jC);
            if (H.b(jS2)) {
                this.f1417n = -1;
                this.f1418o = -1;
            } else {
                this.f1417n = H.e(jS2);
                this.f1418o = H.d(jS2);
            }
        }
    }

    public char b(int i7) {
        G g4 = (G) this.f1419p;
        s sVar = (s) g4.f296e;
        if (sVar == null) {
            return ((String) g4.f295d).charAt(i7);
        }
        if (i7 < g4.f293b) {
            return ((String) g4.f295d).charAt(i7);
        }
        int iC = sVar.f358b - sVar.c();
        int i8 = g4.f293b;
        if (i7 >= iC + i8) {
            return ((String) g4.f295d).charAt(i7 - ((iC - g4.f294c) + i8));
        }
        int i9 = i7 - i8;
        int i10 = sVar.f359c;
        return i9 < i10 ? ((char[]) sVar.f361e)[i9] : ((char[]) sVar.f361e)[(i9 - i10) + sVar.f360d];
    }

    @Override // p2.b
    public int c() {
        return -1;
    }

    public H d() {
        int i7 = this.f1417n;
        if (i7 != -1) {
            return new H(AbstractC1420H.c(i7, this.f1418o));
        }
        return null;
    }

    public void e(String str, int i7, int i8) {
        G g4 = (G) this.f1419p;
        if (i7 < 0 || i7 > g4.n()) {
            StringBuilder sbP = AbstractC0703b.p(i7, "start (", ") offset is outside of text region ");
            sbP.append(g4.n());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i8 < 0 || i8 > g4.n()) {
            StringBuilder sbP2 = AbstractC0703b.p(i8, "end (", ") offset is outside of text region ");
            sbP2.append(g4.n());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "Do not set reversed range: ", " > "));
        }
        g4.y(str, i7, i8);
        k(str.length() + i7);
        j(str.length() + i7);
        this.f1417n = -1;
        this.f1418o = -1;
    }

    @Override // p2.b
    public int f() {
        return this.f1415l;
    }

    @Override // p2.b
    public int g() {
        B b4 = (B) this.f1419p;
        int i7 = this.f1416m;
        if (i7 == 8) {
            return b4.t();
        }
        if (i7 == 16) {
            return b4.z();
        }
        int i8 = this.f1417n;
        this.f1417n = i8 + 1;
        if (i8 % 2 != 0) {
            return this.f1418o & 15;
        }
        int iT = b4.t();
        this.f1418o = iT;
        return (iT & 240) >> 4;
    }

    public void h(int i7, int i8) {
        G g4 = (G) this.f1419p;
        if (i7 < 0 || i7 > g4.n()) {
            StringBuilder sbP = AbstractC0703b.p(i7, "start (", ") offset is outside of text region ");
            sbP.append(g4.n());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i8 < 0 || i8 > g4.n()) {
            StringBuilder sbP2 = AbstractC0703b.p(i8, "end (", ") offset is outside of text region ");
            sbP2.append(g4.n());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i7 >= i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "Do not set reversed or empty range: ", " > "));
        }
        this.f1417n = i7;
        this.f1418o = i8;
    }

    public void i(int i7, int i8) {
        G g4 = (G) this.f1419p;
        if (i7 < 0 || i7 > g4.n()) {
            StringBuilder sbP = AbstractC0703b.p(i7, "start (", ") offset is outside of text region ");
            sbP.append(g4.n());
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i8 < 0 || i8 > g4.n()) {
            StringBuilder sbP2 = AbstractC0703b.p(i8, "end (", ") offset is outside of text region ");
            sbP2.append(g4.n());
            throw new IndexOutOfBoundsException(sbP2.toString());
        }
        if (i7 > i8) {
            throw new IllegalArgumentException(A6.b.e(i7, i8, "Do not set reversed range: ", " > "));
        }
        k(i7);
        j(i8);
    }

    public void j(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Cannot set selectionEnd to a negative value: ").toString());
        }
        this.f1416m = i7;
    }

    public void k(int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Cannot set selectionStart to a negative value: ").toString());
        }
        this.f1415l = i7;
    }

    public String toString() {
        switch (this.f1414k) {
            case 1:
                return ((G) this.f1419p).toString();
            default:
                return super.toString();
        }
    }

    public e(int i7, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.f1415l = i8;
        this.f1416m = i9;
        this.f1417n = i10;
        this.f1418o = i11;
        this.f1419p = bArr;
    }

    public e(C1.d dVar) {
        B b4 = dVar.f573m;
        this.f1419p = b4;
        b4.F(12);
        this.f1416m = b4.x() & 255;
        this.f1415l = b4.x();
    }
}
