package O1;

import B1.AbstractC0015b;
import C2.C0034g;
import java.io.IOException;
import y1.C2393o;

/* loaded from: classes.dex */
public final class P implements a0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f7306k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f7307l;

    public P(S s7, int i7) {
        this.f7307l = s7;
        this.f7306k = i7;
    }

    @Override // O1.a0
    public final int d(F.w wVar, G1.f fVar, int i7) {
        int i8;
        S s7 = this.f7307l;
        int i9 = this.f7306k;
        if (s7.E()) {
            return -3;
        }
        s7.z(i9);
        Z z7 = s7.f7314D[i9];
        boolean z8 = s7.f7332X;
        z7.getClass();
        boolean z9 = (i7 & 2) != 0;
        L1.g gVar = z7.f7379b;
        synchronized (z7) {
            try {
                fVar.f2610p = false;
                int i10 = z7.f7396s;
                if (i10 != z7.f7393p) {
                    C2393o c2393o = ((Y) z7.f7380c.f(z7.f7394q + i10)).a;
                    if (!z9 && c2393o == z7.f7384g) {
                        int iH = z7.h(z7.f7396s);
                        if (z7.j(iH)) {
                            fVar.f575l = z7.f7390m[iH];
                            if (z7.f7396s == z7.f7393p - 1 && (z8 || z7.f7400w)) {
                                fVar.a(536870912);
                            }
                            fVar.f2611q = z7.f7391n[iH];
                            gVar.a = z7.f7389l[iH];
                            gVar.f6022b = z7.f7388k[iH];
                            gVar.f6023c = z7.f7392o[iH];
                            i8 = -4;
                        } else {
                            fVar.f2610p = true;
                            i8 = -3;
                        }
                    }
                    z7.k(c2393o, wVar);
                    i8 = -5;
                } else {
                    if (!z8 && !z7.f7400w) {
                        C2393o c2393o2 = z7.f7403z;
                        if (c2393o2 == null || (!z9 && c2393o2 == z7.f7384g)) {
                            i8 = -3;
                        }
                        z7.k(c2393o2, wVar);
                        i8 = -5;
                    }
                    fVar.f575l = 4;
                    fVar.f2611q = Long.MIN_VALUE;
                    i8 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i8 == -4 && !fVar.c(4)) {
            boolean z10 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                if (z10) {
                    X x7 = z7.a;
                    X.e(x7.f7373e, fVar, z7.f7379b, x7.f7371c);
                } else {
                    X x8 = z7.a;
                    x8.f7373e = X.e(x8.f7373e, fVar, z7.f7379b, x8.f7371c);
                }
            }
            if (!z10) {
                z7.f7396s++;
            }
        }
        if (i8 == -3) {
            s7.A(i9);
        }
        return i8;
    }

    @Override // O1.a0
    public final boolean f() {
        S s7 = this.f7307l;
        return !s7.E() && s7.f7314D[this.f7306k].i(s7.f7332X);
    }

    @Override // O1.a0
    public final void h() throws IOException {
        S s7 = this.f7307l;
        Z z7 = s7.f7314D[this.f7306k];
        C0034g c0034g = z7.f7385h;
        if (c0034g != null && c0034g.n() == 1) {
            K1.c cVarK = z7.f7385h.k();
            cVarK.getClass();
            throw cVarK;
        }
        int iQ = s7.f7337n.q(s7.f7322N);
        R1.m mVar = s7.f7345v;
        IOException iOException = mVar.f8077c;
        if (iOException != null) {
            throw iOException;
        }
        R1.k kVar = mVar.f8076b;
        if (kVar != null) {
            if (iQ == Integer.MIN_VALUE) {
                iQ = kVar.f8065k;
            }
            IOException iOException2 = kVar.f8068n;
            if (iOException2 != null && kVar.f8069o > iQ) {
                throw iOException2;
            }
        }
    }

    @Override // O1.a0
    public final int j(long j7) {
        int iG;
        S s7 = this.f7307l;
        int i7 = this.f7306k;
        boolean z7 = false;
        if (s7.E()) {
            return 0;
        }
        s7.z(i7);
        Z z8 = s7.f7314D[i7];
        boolean z9 = s7.f7332X;
        synchronized (z8) {
            int iH = z8.h(z8.f7396s);
            int i8 = z8.f7396s;
            int i9 = z8.f7393p;
            if ((i8 != i9) && j7 >= z8.f7391n[iH]) {
                if (j7 <= z8.f7399v || !z9) {
                    iG = z8.g(iH, i9 - i8, j7, true);
                    if (iG == -1) {
                    }
                } else {
                    iG = i9 - i8;
                }
            }
            iG = 0;
        }
        synchronized (z8) {
            if (iG >= 0) {
                try {
                    if (z8.f7396s + iG <= z8.f7393p) {
                        z7 = true;
                    }
                } finally {
                }
            }
            AbstractC0015b.c(z7);
            z8.f7396s += iG;
        }
        if (iG == 0) {
            s7.A(i7);
        }
        return iG;
    }
}
