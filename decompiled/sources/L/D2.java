package L;

import D.C0049e0;
import D.C0051f0;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import f.AbstractC0847h;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;

/* loaded from: classes.dex */
public abstract class D2 {
    public static final /* synthetic */ int a = 0;

    public static final void a(String str, e4.k kVar, a0.q qVar, boolean z7, H0.I i7, W.a aVar, W.a aVar2, W.a aVar3, I1.e eVar, C0051f0 c0051f0, C0049e0 c0049e0, boolean z8, int i8, int i9, InterfaceC0973S interfaceC0973S, t2 t2Var, C0510p c0510p, int i10) {
        H0.I i11;
        I1.e eVar2;
        boolean z9;
        int i12;
        int i13;
        C0049e0 c0049e02;
        C0051f0 c0051f02;
        C0051f0 c0051f03;
        long j7;
        C0510p c0510p2;
        boolean z10;
        int i14;
        int i15;
        I1.e eVar3;
        H0.I i16;
        C0051f0 c0051f04;
        C0049e0 c0049e03;
        c0510p.T(-676242365);
        int i17 = i10 | (c0510p.f(str) ? 4 : 2) | (c0510p.h(kVar) ? 32 : 16) | 1666048;
        int i18 = 6 | (c0510p.f(interfaceC0973S) ? ' ' : (char) 16) | (c0510p.f(t2Var) ? 256 : 128);
        if ((i17 & 306783379) == 306783378 && (i18 & 147) == 146 && c0510p.y()) {
            c0510p.M();
            z10 = z7;
            i16 = i7;
            eVar3 = eVar;
            c0051f04 = c0051f0;
            c0049e03 = c0049e0;
            i14 = i8;
            i15 = i9;
            c0510p2 = c0510p;
        } else {
            c0510p.O();
            if ((i10 & 1) == 0 || c0510p.x()) {
                i11 = (H0.I) c0510p.k(H2.a);
                I1.e eVar4 = N0.D.a;
                C0051f0 c0051f05 = C0051f0.f1141b;
                C0049e0 c0049e04 = C0049e0.a;
                eVar2 = eVar4;
                z9 = true;
                i12 = 1;
                i13 = z8 ? 1 : Integer.MAX_VALUE;
                c0049e02 = c0049e04;
                c0051f02 = c0051f05;
            } else {
                c0510p.M();
                z9 = z7;
                i11 = i7;
                eVar2 = eVar;
                c0051f02 = c0051f0;
                c0049e02 = c0049e0;
                i13 = i8;
                i12 = i9;
            }
            c0510p.q();
            c0510p.R(-508515290);
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                objH = new u.k();
                c0510p.b0(objH);
            }
            u.k kVar2 = (u.k) objH;
            boolean z11 = false;
            c0510p.p(false);
            c0510p.R(-508509180);
            long jB = i11.b();
            if (jB != 16) {
                c0051f03 = c0051f02;
            } else {
                boolean zBooleanValue = ((Boolean) AbstractC0847h.k(kVar2, c0510p, 0).getValue()).booleanValue();
                if (z9) {
                    c0051f03 = c0051f02;
                    j7 = zBooleanValue ? t2Var.a : t2Var.f5830b;
                } else {
                    c0051f03 = c0051f02;
                    j7 = t2Var.f5831c;
                }
                jB = j7;
                z11 = false;
            }
            long j8 = jB;
            c0510p.p(z11);
            C0051f0 c0051f06 = c0051f03;
            c0510p2 = c0510p;
            C0486d.a(H.b0.a.a(t2Var.f5839k), W.f.b(1859145987, new A2(qVar, t2Var, str, kVar, z9, i11.d(new H0.I(j8, 0L, null, null, 0L, 0, 0L, 16777214)), c0051f06, c0049e02, z8, i13, i12, eVar2, kVar2, aVar, aVar2, aVar3, interfaceC0973S), c0510p2), c0510p2, 56);
            z10 = z9;
            i14 = i13;
            i15 = i12;
            eVar3 = eVar2;
            i16 = i11;
            c0051f04 = c0051f06;
            c0049e03 = c0049e02;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B2(str, kVar, qVar, z10, i16, aVar, aVar2, aVar3, eVar3, c0051f04, c0049e03, z8, i14, i15, interfaceC0973S, t2Var, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v38 */
    public static final void b(e4.n nVar, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, W.a aVar5, W.a aVar6, boolean z7, float f5, W.a aVar7, W.a aVar8, v.Z z8, C0510p c0510p, int i7, int i8) {
        int i9;
        int i10;
        v.Z z9;
        T0.k kVar;
        W.a aVar9;
        float f7;
        float f8;
        W.a aVar10;
        e4.n nVar2;
        W.a aVar11;
        boolean z10;
        a0.n nVar3 = a0.n.a;
        c0510p.T(-1830307184);
        if ((i7 & 6) == 0) {
            i9 = i7 | (c0510p.f(nVar3) ? 4 : 2);
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0510p.h(nVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0510p.h(aVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i9 |= c0510p.h(aVar2) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0510p.h(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= c0510p.h(aVar4) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i9 |= c0510p.h(aVar5) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((12582912 & i7) == 0) {
            i9 |= c0510p.h(aVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i9 |= c0510p.g(z7) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= c0510p.c(f5) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (c0510p.h(aVar7) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c0510p.h(aVar8) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            z9 = z8;
            i10 |= c0510p.f(z9) ? 256 : 128;
        } else {
            z9 = z8;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (i11 & 147) == 146 && c0510p.y()) {
            c0510p.M();
            aVar11 = aVar8;
            nVar2 = nVar;
            aVar10 = aVar2;
            f8 = f5;
        } else {
            boolean z11 = ((i9 & 234881024) == 67108864) | ((i9 & 1879048192) == 536870912) | ((i11 & 896) == 256);
            Object objH = c0510p.H();
            if (z11 || objH == C0502l.a) {
                objH = new F2(z7, f5, z9);
                c0510p.b0(objH);
            }
            F2 f22 = (F2) objH;
            T0.k kVar2 = (T0.k) c0510p.k(AbstractC2455l0.f18793l);
            int i12 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, nVar3);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, f22);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p, i12, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            aVar7.invoke(c0510p, Integer.valueOf(i11 & 14));
            c0510p.R(1341517187);
            a0.i iVar = a0.b.f10385o;
            if (aVar3 != null) {
                a0.q qVarK = androidx.compose.ui.layout.a.c(nVar3, "Leading").k(M.W.f6274i);
                InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
                int i13 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
                a0.q qVarC2 = a0.a.c(c0510p, qVarK);
                c0510p.V();
                kVar = kVar2;
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i13))) {
                    AbstractC0703b.u(i13, c0510p, i13, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC2);
                AbstractC0703b.v((i9 >> 12) & 14, aVar3, c0510p, true);
            } else {
                kVar = kVar2;
            }
            ?? r9 = 0;
            c0510p.p(false);
            c0510p.R(1341526310);
            if (aVar4 != null) {
                a0.q qVarK2 = androidx.compose.ui.layout.a.c(nVar3, "Trailing").k(M.W.f6274i);
                InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
                int i14 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
                a0.q qVarC3 = a0.a.c(c0510p, qVarK2);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE2);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M3);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i14))) {
                    AbstractC0703b.u(i14, c0510p, i14, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC3);
                AbstractC0703b.v((i9 >> 15) & 14, aVar4, c0510p, true);
                r9 = 0;
            }
            c0510p.p(r9);
            T0.k kVar3 = kVar;
            float f9 = androidx.compose.foundation.layout.a.f(z9, kVar3);
            float fE = androidx.compose.foundation.layout.a.e(z9, kVar3);
            if (aVar3 != null) {
                f9 -= M.W.f6268c;
                float f10 = (float) r9;
                if (f9 < f10) {
                    f9 = f10;
                }
            }
            float f11 = f9;
            if (aVar4 != null) {
                fE -= M.W.f6268c;
                float f12 = 0;
                if (fE < f12) {
                    fE = f12;
                }
            }
            c0510p.R(1341556924);
            a0.i iVar2 = a0.b.f10381k;
            if (aVar5 != null) {
                a0.q qVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.g(androidx.compose.ui.layout.a.c(nVar3, "Prefix"), M.W.f6271f, 0.0f, 2)), f11, 0.0f, M.W.f6270e, 0.0f, 10);
                InterfaceC2173H interfaceC2173HE3 = AbstractC2136o.e(iVar2, false);
                int i15 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M4 = c0510p.m();
                a0.q qVarC4 = a0.a.c(c0510p, qVarL);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE3);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M4);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i15))) {
                    AbstractC0703b.u(i15, c0510p, i15, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC4);
                aVar9 = aVar5;
                AbstractC0703b.v((i9 >> 18) & 14, aVar9, c0510p, true);
            } else {
                aVar9 = aVar5;
            }
            c0510p.p(false);
            c0510p.R(1341568890);
            if (aVar6 != null) {
                float f13 = fE;
                a0.q qVarL2 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.g(androidx.compose.ui.layout.a.c(nVar3, "Suffix"), M.W.f6271f, 0.0f, 2)), M.W.f6270e, 0.0f, f13, 0.0f, 10);
                f7 = f13;
                InterfaceC2173H interfaceC2173HE4 = AbstractC2136o.e(iVar2, false);
                int i16 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M5 = c0510p.m();
                a0.q qVarC5 = a0.a.c(c0510p, qVarL2);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE4);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M5);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i16))) {
                    AbstractC0703b.u(i16, c0510p, i16, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC5);
                AbstractC0703b.v((i9 >> 21) & 14, aVar6, c0510p, true);
            } else {
                f7 = fE;
            }
            c0510p.p(false);
            c0510p.R(1341581092);
            if (aVar != null) {
                f8 = f5;
                a0.q qVarL3 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.g(androidx.compose.ui.layout.a.c(nVar3, "Label"), P3.F.G(M.W.f6271f, M.W.f6272g, f8), 0.0f, 2)), f11, 0.0f, f7, 0.0f, 10);
                InterfaceC2173H interfaceC2173HE5 = AbstractC2136o.e(iVar2, false);
                int i17 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M6 = c0510p.m();
                a0.q qVarC6 = a0.a.c(c0510p, qVarL3);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE5);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M6);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i17))) {
                    AbstractC0703b.u(i17, c0510p, i17, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC6);
                AbstractC0703b.v((i9 >> 6) & 14, aVar, c0510p, true);
            } else {
                f8 = f5;
            }
            c0510p.p(false);
            a0.q qVarL4 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.g(nVar3, M.W.f6271f, 0.0f, 2)), aVar9 == null ? f11 : 0, 0.0f, aVar6 == null ? f7 : 0, 0.0f, 10);
            c0510p.R(1341611627);
            if (aVar2 != null) {
                aVar10 = aVar2;
                aVar10.invoke(androidx.compose.ui.layout.a.c(nVar3, "Hint").k(qVarL4), c0510p, Integer.valueOf((i9 >> 6) & 112));
            } else {
                aVar10 = aVar2;
            }
            c0510p.p(false);
            a0.q qVarK3 = androidx.compose.ui.layout.a.c(nVar3, "TextField").k(qVarL4);
            InterfaceC2173H interfaceC2173HE6 = AbstractC2136o.e(iVar2, true);
            int i18 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M7 = c0510p.m();
            a0.q qVarC7 = a0.a.c(c0510p, qVarK3);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, interfaceC2173HE6);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M7);
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i18))) {
                AbstractC0703b.u(i18, c0510p, i18, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC7);
            nVar2 = nVar;
            nVar2.invoke(c0510p, Integer.valueOf((i9 >> 3) & 14));
            c0510p.p(true);
            c0510p.R(1341622624);
            if (aVar8 != null) {
                a0.q qVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.p(androidx.compose.foundation.layout.c.g(androidx.compose.ui.layout.a.c(nVar3, "Supporting"), M.W.f6273h, 0.0f, 2)), y2.c());
                InterfaceC2173H interfaceC2173HE7 = AbstractC2136o.e(iVar2, false);
                int i19 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M8 = c0510p.m();
                a0.q qVarC8 = a0.a.c(c0510p, qVarG);
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, c2361h, interfaceC2173HE7);
                C0486d.R(c0510p, c2361h2, interfaceC0501k0M8);
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i19))) {
                    AbstractC0703b.u(i19, c0510p, i19, c2361h3);
                }
                C0486d.R(c0510p, c2361h4, qVarC8);
                aVar11 = aVar8;
                z10 = true;
                AbstractC0703b.v((i11 >> 3) & 14, aVar11, c0510p, true);
            } else {
                aVar11 = aVar8;
                z10 = true;
            }
            c0510p.p(false);
            c0510p.p(z10);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C2(nVar2, aVar, aVar10, aVar3, aVar4, aVar5, aVar6, z7, f8, aVar7, aVar11, z9, i7, i8);
        }
    }

    public static final int c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f5, long j7, float f7, v.Z z7) {
        boolean z8 = i8 > 0;
        float fG = (z7.f16425d + z7.f16423b) * f7;
        if (z8) {
            fG = P3.F.G(M.W.f6267b * 2 * f7, fG, f5);
        }
        int[] iArr = {i13, i11, i12, P3.F.H(f5, i8, 0)};
        for (int i15 = 0; i15 < 4; i15++) {
            i7 = Math.max(i7, iArr[i15]);
        }
        return Math.max(T0.a.i(j7), Math.max(i9, Math.max(i10, P3.F.W(fG + P3.F.H(f5, 0, i8) + i7))) + i14);
    }

    public static final int d(boolean z7, int i7, int i8, w0.S s7) {
        if (!z7) {
            return i8;
        }
        return AbstractC0703b.a(1, 0.0f, (i7 - s7.f16841l) / 2.0f);
    }
}
