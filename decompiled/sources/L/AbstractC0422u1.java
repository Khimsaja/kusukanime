package L;

import D.C0042b;
import O.C0486d;
import O.C0487d0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import io.ktor.utils.io.ByteChannelKt;
import java.util.WeakHashMap;
import p.AbstractC1745d;
import p.AbstractC1751g;
import v.AbstractC2123b;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2455l0;

/* renamed from: L.u1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0422u1 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5859b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5860c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5861d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5862e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f5863f;

    static {
        float f5 = N.l.a;
        a = N.l.f6703c;
        f5859b = 8;
        f5860c = 4;
        float f7 = N.l.f6702b;
        float f8 = N.l.f6704d;
        float f9 = 2;
        f5861d = (f7 - f8) / f9;
        f5862e = (N.l.a - f8) / f9;
        f5863f = 12;
    }

    public static final void a(a0.n nVar, long j7, long j8, float f5, v.W w7, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        long j9;
        a0.n nVar2;
        v.W w8;
        W.a aVar2;
        v.W w9;
        a0.n nVar3;
        c0510p.T(1596802123);
        int i9 = i7 | 6 | (c0510p.e(j7) ? 32 : 16) | 8320;
        if ((74899 & i9) == 74898 && c0510p.y()) {
            c0510p.M();
            nVar3 = nVar;
            j9 = j8;
            w9 = w7;
            aVar2 = aVar;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                a0.n nVar4 = a0.n.a;
                long jA = P.a((N) c0510p.k(P.a), j7);
                int i10 = AbstractC0389k1.a;
                WeakHashMap weakHashMap = v.n0.f16470v;
                v.W w10 = new v.W(v.M.e(c0510p).f16476g, 32 | AbstractC2123b.f16435g);
                i8 = i9 & (-58241);
                j9 = jA;
                nVar2 = nVar4;
                w8 = w10;
            } else {
                c0510p.M();
                j9 = j8;
                i8 = i9 & (-58241);
                nVar2 = nVar;
                w8 = w7;
            }
            c0510p.q();
            aVar2 = aVar;
            q2.a(nVar2, null, j7, j9, f5, 0.0f, W.f.b(105663120, new H.M(8, w8, aVar2), c0510p), c0510p, ((i8 << 3) & 896) | 12607494, 98);
            w9 = w8;
            nVar3 = nVar2;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0397m1(nVar3, j7, j9, f5, w9, aVar2, i7);
        }
    }

    public static final void b(v.g0 g0Var, boolean z7, InterfaceC0821a interfaceC0821a, W.a aVar, a0.q qVar, boolean z8, W.a aVar2, boolean z9, C0393l1 c0393l1, C0510p c0510p, int i7) {
        int i8;
        a0.q qVar2;
        boolean z10;
        boolean z11;
        C0393l1 c0393l12;
        boolean z12;
        boolean z13;
        a0.q qVar3;
        c0510p.T(-663510974);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(g0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.g(z7) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(aVar) ? 2048 : 1024;
        }
        int i9 = i8 | 221184;
        if ((1572864 & i7) == 0) {
            i9 |= c0510p.h(aVar2) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        int i10 = i9 | 12582912;
        if ((100663296 & i7) == 0) {
            i10 |= c0510p.f(c0393l1) ? 67108864 : 33554432;
        }
        int i11 = i10 | 805306368;
        if ((306783379 & i11) == 306783378 && c0510p.y()) {
            c0510p.M();
            qVar3 = qVar;
            z13 = z8;
            z12 = z9;
            c0393l12 = c0393l1;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                qVar2 = a0.n.a;
                z10 = true;
                z11 = true;
            } else {
                c0510p.M();
                qVar2 = qVar;
                z10 = z8;
                z11 = z9;
            }
            c0510p.q();
            c0510p.R(-103235253);
            Object obj = C0502l.a;
            Object objH = c0510p.H();
            if (objH == obj) {
                objH = new u.k();
                c0510p.b0(objH);
            }
            u.k kVar = (u.k) objH;
            c0510p.p(false);
            boolean z14 = z11;
            W.a aVarB = W.f.b(-1419576100, new C0405o1(c0393l1, z7, z10, aVar2, z11, aVar), c0510p);
            c0510p.R(-103209106);
            W.a aVarB2 = aVar2 == null ? null : W.f.b(1644987592, new C0408p1(c0393l1, z7, z10, aVar2), c0510p);
            c0510p.p(false);
            Object objH2 = c0510p.H();
            if (objH2 == obj) {
                objH2 = C0486d.J(0);
                c0510p.b0(objH2);
            }
            C0487d0 c0487d0 = (C0487d0) objH2;
            boolean z15 = z10;
            a0.q qVar4 = qVar2;
            c0393l12 = c0393l1;
            a0.q qVarA = g0Var.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.selection.b.a(qVar4, z7, kVar, null, z15, new F0.f(4), interfaceC0821a), 0.0f, a, 1));
            Object objH3 = c0510p.H();
            if (objH3 == obj) {
                objH3 = new C0042b(11, c0487d0);
                c0510p.b0(objH3);
            }
            a0.q qVarE = androidx.compose.ui.layout.a.e(qVarA, (e4.k) objH3);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10385o, true);
            int i12 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarE);
            InterfaceC2364k.f17877j.getClass();
            InterfaceC0821a interfaceC0821a2 = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(interfaceC0821a2);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i12))) {
                AbstractC0703b.u(i12, c0510p, i12, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            O.R0 r0A = AbstractC1751g.a(z7 ? 1.0f : 0.0f, AbstractC1745d.q(100, 0, null, 6), c0510p);
            long jE = AbstractC0832b.e((c0487d0.f() - r3.O(N.l.f6702b)) / 2, ((T0.b) c0510p.k(AbstractC2455l0.f18787f)).x(f5863f));
            boolean zF = c0510p.f(kVar) | c0510p.e(jE);
            Object objH4 = c0510p.H();
            if (zF || objH4 == obj) {
                objH4 = new M.D(kVar, jE);
                c0510p.b0(objH4);
            }
            W.a aVarB3 = W.f.b(691730997, new D.S(8, (M.D) objH4), c0510p);
            W.a aVarB4 = W.f.b(-474426875, new H.M(9, r0A, c0393l12), c0510p);
            boolean zF2 = c0510p.f(r0A);
            Object objH5 = c0510p.H();
            if (zF2 || objH5 == obj) {
                objH5 = new H.D(r0A, 1);
                c0510p.b0(objH5);
            }
            c(aVarB3, aVarB4, aVarB, aVarB2, z14, (InterfaceC0821a) objH5, c0510p, ((i11 >> 9) & 57344) | 438);
            c0510p.p(true);
            z12 = z14;
            z13 = z15;
            qVar3 = qVar4;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0401n1(g0Var, z7, interfaceC0821a, aVar, qVar3, z13, aVar2, z12, c0393l12, i7);
        }
    }

    public static final void c(W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, boolean z7, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        int i8;
        boolean z8;
        InterfaceC0821a interfaceC0821a2;
        boolean z9;
        W.a aVar5 = aVar4;
        c0510p.T(-1427075886);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(aVar2) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(aVar3) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(aVar5) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.g(z7) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
            z8 = z7;
            interfaceC0821a2 = interfaceC0821a;
        } else {
            int i9 = 458752 & i8;
            int i10 = 57344 & i8;
            boolean z10 = (i9 == 131072) | ((i8 & 7168) == 2048) | (i10 == 16384);
            Object objH = c0510p.H();
            O.T t7 = C0502l.a;
            if (z10 || objH == t7) {
                objH = new C0413r1(interfaceC0821a, aVar5, z7);
                c0510p.b0(objH);
            }
            InterfaceC2173H interfaceC2173H = (InterfaceC2173H) objH;
            a0.n nVar = a0.n.a;
            int i11 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, nVar);
            InterfaceC2364k.f17877j.getClass();
            int i12 = i8;
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, interfaceC2173H);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i11))) {
                AbstractC0703b.u(i11, c0510p, i11, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            aVar.invoke(c0510p, Integer.valueOf(i12 & 14));
            aVar2.invoke(c0510p, Integer.valueOf((i12 >> 3) & 14));
            a0.q qVarC2 = androidx.compose.ui.layout.a.c(nVar, "icon");
            a0.i iVar = a0.b.f10381k;
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(iVar, false);
            int i13 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
            a0.q qVarC3 = a0.a.c(c0510p, qVarC2);
            c0510p.V();
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
            C0486d.R(c0510p, c2361h4, qVarC3);
            aVar3.invoke(c0510p, Integer.valueOf((i12 >> 6) & 14));
            c0510p.p(true);
            c0510p.R(1087198243);
            if (aVar4 != null) {
                a0.q qVarC4 = androidx.compose.ui.layout.a.c(nVar, "label");
                boolean z11 = (i10 == 16384) | (i9 == 131072);
                Object objH2 = c0510p.H();
                if (z11 || objH2 == t7) {
                    z8 = z7;
                    interfaceC0821a2 = interfaceC0821a;
                    objH2 = new C0411q1(z8, interfaceC0821a2, 0);
                    c0510p.b0(objH2);
                } else {
                    z8 = z7;
                    interfaceC0821a2 = interfaceC0821a;
                }
                a0.q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.ui.graphics.a.a(qVarC4, (e4.k) objH2), f5859b / 2, 0.0f, 2);
                InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(iVar, false);
                int i14 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M3 = c0510p.m();
                a0.q qVarC5 = a0.a.c(c0510p, qVarJ);
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
                C0486d.R(c0510p, c2361h4, qVarC5);
                aVar5 = aVar4;
                z9 = true;
                AbstractC0703b.v((i12 >> 9) & 14, aVar5, c0510p, true);
            } else {
                aVar5 = aVar4;
                z8 = z7;
                interfaceC0821a2 = interfaceC0821a;
                z9 = true;
            }
            c0510p.p(false);
            c0510p.p(z9);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B0(aVar, aVar2, aVar3, aVar5, z8, interfaceC0821a2, i7);
        }
    }
}
