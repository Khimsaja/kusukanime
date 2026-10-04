package androidx.compose.material3;

import L.AbstractC0374g2;
import L.N;
import L.P;
import L.S1;
import L.r2;
import L.s2;
import N.r;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import a0.b;
import a0.n;
import a0.q;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import b1.AbstractC0703b;
import h0.AbstractC0968M;
import h0.C0975U;
import h0.C0998u;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import kotlin.jvm.internal.l;
import p.A0;
import p.C1748e0;
import p.InterfaceC1774z;
import u.k;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* loaded from: classes.dex */
public abstract class a {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10639b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10640c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f10641d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f10642e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1748e0 f10643f;

    /* renamed from: g, reason: collision with root package name */
    public static final A0 f10644g;

    static {
        float f5 = r.f6750b;
        a = f5;
        f10639b = r.f6755g;
        f10640c = r.f6754f;
        float f7 = r.f6752d;
        f10641d = f7;
        f10642e = (f7 - f5) / 2;
        f10643f = new C1748e0();
        f10644g = new A0(100, (InterfaceC1774z) null, 6);
    }

    public static final void a(boolean z7, q qVar, r2 r2Var, C0510p c0510p, int i7) {
        int i8;
        int i9;
        int i10;
        q qVar2;
        r2 r2Var2;
        boolean z8 = z7;
        c0510p.T(1580463220);
        int i11 = (c0510p.g(z8) ? 4 : 2) | i7 | 3456 | (c0510p.g(true) ? 16384 : 8192) | 1638400;
        if ((599187 & i11) == 599186 && c0510p.y()) {
            c0510p.M();
            qVar2 = qVar;
            r2Var2 = r2Var;
        } else {
            c0510p.O();
            int i12 = 1 & i7;
            n nVar = n.a;
            if (i12 == 0 || c0510p.x()) {
                N n7 = (N) c0510p.k(P.a);
                r2 r2Var3 = n7.f5240S;
                if (r2Var3 == null) {
                    float f5 = r.a;
                    long jC = P.c(n7, 10);
                    long jC2 = P.c(n7, 26);
                    long j7 = C0998u.f11833f;
                    long jC3 = P.c(n7, 11);
                    long jC4 = P.c(n7, 24);
                    i9 = -458753;
                    long jC5 = P.c(n7, 39);
                    long jC6 = P.c(n7, 24);
                    long jC7 = P.c(n7, 39);
                    long jB = C0998u.b(1.0f, P.c(n7, 35));
                    i8 = i11;
                    long j8 = n7.f5257p;
                    r2 r2Var4 = new r2(jC, jC2, j7, jC3, jC4, jC5, jC6, jC7, AbstractC0968M.l(jB, j8), AbstractC0968M.l(C0998u.b(0.12f, P.c(n7, 18)), j8), j7, AbstractC0968M.l(C0998u.b(0.38f, P.c(n7, 18)), j8), AbstractC0968M.l(C0998u.b(0.38f, P.c(n7, 18)), j8), AbstractC0968M.l(C0998u.b(0.12f, P.c(n7, 39)), j8), AbstractC0968M.l(C0998u.b(0.12f, P.c(n7, 18)), j8), AbstractC0968M.l(C0998u.b(0.38f, P.c(n7, 39)), j8));
                    n7.f5240S = r2Var4;
                    r2Var3 = r2Var4;
                } else {
                    i8 = i11;
                    i9 = -458753;
                }
                i10 = i8 & i9;
                qVar2 = nVar;
                r2Var2 = r2Var3;
            } else {
                c0510p.M();
                i10 = i11 & (-458753);
                qVar2 = qVar;
                r2Var2 = r2Var;
            }
            c0510p.q();
            c0510p.R(783532531);
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                objH = new k();
                c0510p.b0(objH);
            }
            c0510p.p(false);
            q qVarH = c.h(c.q(qVar2.k(nVar)), f10640c, f10641d);
            float f7 = r.a;
            z8 = z7;
            b(qVarH, z8, r2Var2, (k) objH, AbstractC0374g2.a(5, c0510p), c0510p, ((i10 >> 6) & 896) | ((i10 << 3) & 112) | 24576);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new L.A0(z8, qVar2, r2Var2, i7);
        }
    }

    public static final void b(q qVar, boolean z7, r2 r2Var, k kVar, InterfaceC0973S interfaceC0973S, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1594099146);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(qVar) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.g(z7) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.g(true) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.f(r2Var) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i8 |= c0510p.f(kVar) ? 131072 : 65536;
        }
        if ((1572864 & i7) == 0) {
            i8 |= c0510p.f(interfaceC0973S) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((i8 & 599187) == 599186 && c0510p.y()) {
            c0510p.M();
        } else {
            long j7 = z7 ? r2Var.f5763b : r2Var.f5767f;
            long j8 = z7 ? r2Var.a : r2Var.f5766e;
            float f5 = r.a;
            InterfaceC0973S interfaceC0973SA = AbstractC0374g2.a(5, c0510p);
            q qVarB = androidx.compose.foundation.a.b(qVar.k(new BorderModifierNodeElement(r.f6753e, new C0975U(z7 ? r2Var.f5764c : r2Var.f5768g), interfaceC0973SA)), j7, interfaceC0973SA);
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(b.f10381k, false);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            q qVarC = a0.a.c(c0510p, qVarB);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, interfaceC2173HE);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            q qVarB2 = androidx.compose.foundation.a.b(d.a(androidx.compose.foundation.layout.b.a.a(n.a, b.f10384n).k(new ThumbElement(kVar, z7)), kVar, S1.a(false, r.f6751c / 2, c0510p, 54, 4)), j8, interfaceC0973S);
            InterfaceC2173H interfaceC2173HE2 = AbstractC2136o.e(b.f10385o, false);
            int i10 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
            q qVarC2 = a0.a.c(c0510p, qVarB2);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, interfaceC2173HE2);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p, i10, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC2);
            c0510p.R(1163457794);
            c0510p.p(false);
            c0510p.p(true);
            c0510p.p(true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new s2(qVar, z7, r2Var, kVar, interfaceC0973S, i7);
        }
    }
}
