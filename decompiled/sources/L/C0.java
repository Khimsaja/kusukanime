package L;

import O.C0486d;
import O.C0493g0;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import p.AbstractC1714A;
import p.AbstractC1745d;
import p.C1727N;
import p.InterfaceC1774z;
import v.AbstractC2130i;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z0.AbstractC2478x0;

/* loaded from: classes.dex */
public abstract class C0 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f4976b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f4977c = 12;

    /* renamed from: d, reason: collision with root package name */
    public static final float f4978d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f4979e = 112;

    /* renamed from: f, reason: collision with root package name */
    public static final float f4980f = 280;

    static {
        float f5 = 48;
        a = f5;
        f4976b = f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public static final void a(a0.n nVar, C1727N c1727n, O.Z z7, q.o0 o0Var, InterfaceC0973S interfaceC0973S, long j7, float f5, float f7, W.a aVar, C0510p c0510p, int i7) {
        Float f8;
        InterfaceC1774z interfaceC1774z;
        p.A0 a0Q;
        ?? r62;
        c0510p.T(-151448888);
        int i8 = i7 | (c0510p.f(nVar) ? 4 : 2) | (c0510p.f(c1727n) ? 32 : 16) | (c0510p.f(o0Var) ? 2048 : 1024) | (c0510p.f(interfaceC0973S) ? 16384 : 8192) | (c0510p.e(j7) ? 131072 : 65536) | (c0510p.c(f5) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | (c0510p.c(f7) ? 8388608 : 4194304) | (c0510p.f(null) ? 67108864 : 33554432) | (c0510p.h(aVar) ? 536870912 : 268435456);
        if ((i8 & 306783379) == 306783378 && c0510p.y()) {
            c0510p.M();
        } else {
            p.u0 u0VarC = p.z0.c(c1727n, "DropDownMenu", c0510p, (((i8 >> 3) & 14) | 48) & 126);
            p.B0 b02 = p.C0.a;
            boolean zBooleanValue = ((Boolean) u0VarC.a.v0()).booleanValue();
            c0510p.R(2139028452);
            float f9 = zBooleanValue ? 1.0f : 0.8f;
            c0510p.p(false);
            Float fValueOf = Float.valueOf(f9);
            C0493g0 c0493g0 = u0VarC.f14136d;
            boolean zBooleanValue2 = ((Boolean) c0493g0.getValue()).booleanValue();
            c0510p.R(2139028452);
            float f10 = zBooleanValue2 ? 1.0f : 0.8f;
            c0510p.p(false);
            Float fValueOf2 = Float.valueOf(f10);
            p.q0 q0VarF = u0VarC.f();
            c0510p.R(1033023423);
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = Boolean.TRUE;
            if (q0VarF.b(bool, bool2)) {
                f8 = fValueOf2;
                a0Q = AbstractC1745d.q(120, 0, AbstractC1714A.f13834b, 2);
                r62 = 0;
                interfaceC1774z = null;
            } else {
                f8 = fValueOf2;
                interfaceC1774z = null;
                a0Q = AbstractC1745d.q(1, 74, null, 4);
                r62 = 0;
            }
            c0510p.p(r62);
            InterfaceC1774z interfaceC1774z2 = interfaceC1774z;
            p.s0 s0VarB = p.z0.b(u0VarC, fValueOf, f8, a0Q, b02, c0510p, 0);
            boolean zBooleanValue3 = ((Boolean) u0VarC.a.v0()).booleanValue();
            c0510p.R(-249413128);
            float f11 = zBooleanValue3 ? 1.0f : 0.0f;
            c0510p.p(r62);
            Float fValueOf3 = Float.valueOf(f11);
            boolean zBooleanValue4 = ((Boolean) c0493g0.getValue()).booleanValue();
            c0510p.R(-249413128);
            float f12 = zBooleanValue4 ? 1.0f : 0.0f;
            c0510p.p(r62);
            Float fValueOf4 = Float.valueOf(f12);
            p.q0 q0VarF2 = u0VarC.f();
            c0510p.R(-1355418157);
            p.A0 a0Q2 = q0VarF2.b(bool, bool2) ? AbstractC1745d.q(30, r62, interfaceC1774z2, 6) : AbstractC1745d.q(75, r62, interfaceC1774z2, 6);
            c0510p.p(r62);
            p.s0 s0VarB2 = p.z0.b(u0VarC, fValueOf3, fValueOf4, a0Q2, b02, c0510p, 0);
            boolean zBooleanValue5 = ((Boolean) c0510p.k(AbstractC2478x0.a)).booleanValue();
            a0.n nVar2 = a0.n.a;
            boolean zG = c0510p.g(zBooleanValue5) | c0510p.f(s0VarB) | ((i8 & 112) != 32 ? r62 : true) | c0510p.f(s0VarB2);
            Object objH = c0510p.H();
            if (zG || objH == C0502l.a) {
                D.E e7 = new D.E(zBooleanValue5, c1727n, z7, s0VarB, s0VarB2);
                c0510p.b0(e7);
                objH = e7;
            }
            int i9 = i8 >> 9;
            int i10 = i8 >> 6;
            q2.a(androidx.compose.ui.graphics.a.a(nVar2, (e4.k) objH), interfaceC0973S, j7, 0L, f5, f7, W.f.b(1573559053, new D.K(nVar, o0Var, aVar, 3), c0510p), c0510p, (i9 & 896) | (i9 & 112) | 12582912 | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 8);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0383j(nVar, c1727n, z7, o0Var, interfaceC0973S, j7, f5, f7, aVar, i7);
        }
    }

    public static final void b(W.a aVar, InterfaceC0821a interfaceC0821a, a0.n nVar, boolean z7, C0436z0 c0436z0, v.Z z8, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1564716777);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(aVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(nVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(null) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0510p.g(z7) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0510p.f(c0436z0) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((12582912 & i7) == 0) {
            i8 |= c0510p.f(z8) ? 8388608 : 4194304;
        }
        if ((100663296 & i7) == 0) {
            i8 |= c0510p.f(null) ? 67108864 : 33554432;
        }
        if ((i8 & 38347923) == 38347922 && c0510p.y()) {
            c0510p.M();
        } else {
            a0.q qVarG = androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.c.m(androidx.compose.foundation.layout.c.d(androidx.compose.foundation.a.d(nVar, null, S1.a(true, 0.0f, c0510p, 6, 6), z7, null, interfaceC0821a, 24), 1.0f), f4979e, f4980f, 8), z8);
            v.f0 f0VarB = v.e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 48);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, qVarG);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, f0VarB);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            H2.a(((M2) c0510p.k(N2.a)).f5221m, W.f.b(1065051884, new A0(c0436z0, z7, aVar), c0510p), c0510p, 48);
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B0(aVar, interfaceC0821a, nVar, z7, c0436z0, z8, i7);
        }
    }
}
