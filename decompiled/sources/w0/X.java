package w0;

import H.C0184a;
import O.C0486d;
import O.C0502l;
import O.C0506n;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f1.AbstractC0870c;
import f6.AbstractC0905c;
import r0.C1861b;
import y0.C2349D;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public abstract class X {
    public static final C2178M a = new C2178M(4);

    public static final long a(float f5, float f7) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
        int i7 = W.f16850b;
        return jFloatToRawIntBits;
    }

    public static final void b(a0.n nVar, e4.n nVar2, C0510p c0510p, int i7) {
        c0510p.T(-1298353104);
        int i8 = i7 | 6 | (c0510p.h(nVar2) ? 32 : 16);
        if ((i8 & 19) == 18 && c0510p.y()) {
            c0510p.M();
        } else {
            nVar = a0.n.a;
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                objH = new a0(C2178M.f16835l);
                c0510p.b0(objH);
            }
            c((a0) objH, nVar, nVar2, c0510p, (i8 << 3) & 1008);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new H.M(i7, 18, nVar, nVar2);
        }
    }

    public static final void c(a0 a0Var, a0.q qVar, e4.n nVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-511989831);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(a0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(qVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(nVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            int i9 = c0510p.f7128P;
            C0506n c0506nM = C0486d.M(c0510p);
            a0.q qVarC = a0.a.c(c0510p, qVar);
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            C2362i c2362i = C2362i.f17867o;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, a0Var.f16855c, a0Var);
            C0486d.R(c0510p, a0Var.f16856d, c0506nM);
            C0486d.R(c0510p, a0Var.f16857e, nVar);
            InterfaceC2364k.f17877j.getClass();
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            c0510p.p(true);
            if (c0510p.y()) {
                c0510p.R(-26502501);
                c0510p.p(false);
            } else {
                c0510p.R(-26580342);
                boolean zH = c0510p.h(a0Var);
                Object objH = c0510p.H();
                if (zH || objH == C0502l.a) {
                    objH = new C1861b(3, a0Var);
                    c0510p.b0(objH);
                }
                C0486d.g((InterfaceC0821a) objH, c0510p);
                c0510p.p(false);
            }
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0184a(a0Var, qVar, nVar, i7, 8);
        }
    }

    public static final g0.d d(r rVar) {
        r rVarI = rVar.i();
        return rVarI != null ? rVarI.K(rVar, true) : new g0.d(0.0f, 0.0f, (int) (rVar.Q() >> 32), (int) (rVar.Q() & 4294967295L));
    }

    public static final g0.d e(r rVar) {
        r rVarF = f(rVar);
        float fQ = (int) (rVarF.Q() >> 32);
        float fQ2 = (int) (rVarF.Q() & 4294967295L);
        g0.d dVarK = f(rVar).K(rVar, true);
        float f5 = dVarK.a;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > fQ) {
            f5 = fQ;
        }
        float f7 = dVarK.f11659b;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 > fQ2) {
            f7 = fQ2;
        }
        float f8 = dVarK.f11660c;
        if (f8 < 0.0f) {
            f8 = 0.0f;
        }
        if (f8 <= fQ) {
            fQ = f8;
        }
        float f9 = dVarK.f11661d;
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        if (f10 <= fQ2) {
            fQ2 = f10;
        }
        if (f5 == fQ || f7 == fQ2) {
            return g0.d.f11658e;
        }
        long jG = rVarF.g(AbstractC0832b.e(f5, f7));
        long jG2 = rVarF.g(AbstractC0832b.e(fQ, f7));
        long jG3 = rVarF.g(AbstractC0832b.e(fQ, fQ2));
        long jG4 = rVarF.g(AbstractC0832b.e(f5, fQ2));
        float fD = g0.c.d(jG);
        float fD2 = g0.c.d(jG2);
        float fD3 = g0.c.d(jG4);
        float fD4 = g0.c.d(jG3);
        float fMin = Math.min(fD, Math.min(fD2, Math.min(fD3, fD4)));
        float fMax = Math.max(fD, Math.max(fD2, Math.max(fD3, fD4)));
        float fE = g0.c.e(jG);
        float fE2 = g0.c.e(jG2);
        float fE3 = g0.c.e(jG4);
        float fE4 = g0.c.e(jG3);
        return new g0.d(fMin, Math.min(fE, Math.min(fE2, Math.min(fE3, fE4))), fMax, Math.max(fE, Math.max(fE2, Math.max(fE3, fE4))));
    }

    public static final r f(r rVar) {
        r rVar2;
        r rVarI = rVar.i();
        while (true) {
            r rVar3 = rVarI;
            rVar2 = rVar;
            rVar = rVar3;
            if (rVar == null) {
                break;
            }
            rVarI = rVar.i();
        }
        y0.Y y7 = rVar2 instanceof y0.Y ? (y0.Y) rVar2 : null;
        if (y7 == null) {
            return rVar2;
        }
        y0.Y y8 = y7.f17827x;
        while (true) {
            y0.Y y9 = y8;
            y0.Y y10 = y7;
            y7 = y9;
            if (y7 == null) {
                return y10;
            }
            y8 = y7.f17827x;
        }
    }

    public static final y0.O g(y0.O o7) {
        C2349D c2349d = o7.f17777v.f17825v;
        while (true) {
            C2349D c2349dS = c2349d.s();
            C2349D c2349d2 = null;
            if ((c2349dS != null ? c2349dS.f17673m : null) == null) {
                y0.O oN0 = ((y0.Y) c2349d.f17660G.f7174d).N0();
                kotlin.jvm.internal.l.c(oN0);
                return oN0;
            }
            C2349D c2349dS2 = c2349d.s();
            if (c2349dS2 != null) {
                c2349d2 = c2349dS2.f17673m;
            }
            kotlin.jvm.internal.l.c(c2349d2);
            C2349D c2349dS3 = c2349d.s();
            kotlin.jvm.internal.l.c(c2349dS3);
            c2349d = c2349dS3.f17673m;
            kotlin.jvm.internal.l.c(c2349d);
        }
    }

    public static final long h(long j7, long j8) {
        float fD = g0.f.d(j7);
        long j9 = W.a;
        if (j8 == j9) {
            AbstractC0905c.C("ScaleFactor is unspecified");
            throw null;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * fD;
        float fB = g0.f.b(j7);
        if (j8 != j9) {
            return AbstractC0870c.F(fIntBitsToFloat, Float.intBitsToFloat((int) (j8 & 4294967295L)) * fB);
        }
        AbstractC0905c.C("ScaleFactor is unspecified");
        throw null;
    }
}
