package L;

import M.AbstractC0461t;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import io.ktor.utils.io.ByteChannelKt;
import java.util.List;
import w0.C2177L;
import w0.InterfaceC2173H;
import w0.InterfaceC2197o;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0412r0 {
    public static final float a = 8;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5756b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5757c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5758d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5759e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f5760f;

    static {
        float f5 = 16;
        f5757c = f5;
        f5758d = f5;
        f5759e = f5;
        f5760f = f5;
    }

    public static final void a(W.a aVar, a0.n nVar, W.a aVar2, W.a aVar3, C0392l0 c0392l0, float f5, float f7, C0510p c0510p, int i7) {
        float f8;
        float f9;
        a0.n nVar2;
        a0.n nVar3;
        float f10;
        float f11;
        int i8 = 0;
        int i9 = 1;
        c0510p.T(-1647707763);
        if (((i7 | 3504 | (c0510p.f(c0392l0) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | 113246208) & 38347923) == 38347922 && c0510p.y()) {
            c0510p.M();
            nVar3 = nVar;
            f10 = f5;
            f11 = f7;
        } else {
            c0510p.O();
            int i10 = i7 & 1;
            a0.n nVar4 = a0.n.a;
            if (i10 == 0 || c0510p.x()) {
                f8 = AbstractC0396m0.a;
                f9 = f8;
                nVar2 = nVar4;
            } else {
                c0510p.M();
                nVar2 = nVar;
                f8 = f5;
                f9 = f7;
            }
            c0510p.q();
            W.a aVarB = W.f.b(-403249643, new H.M(7, c0392l0, aVar), c0510p);
            c0510p.R(1640970492);
            c0510p.p(false);
            c0510p.R(1640980724);
            c0510p.p(false);
            c0510p.R(1640990750);
            Object obj = null;
            W.a aVarB2 = aVar2 == null ? null : W.f.b(1400509200, new C0404o0(c0392l0, aVar2, i8), c0510p);
            c0510p.p(false);
            c0510p.R(1641004177);
            W.a aVarB3 = aVar3 == null ? null : W.f.b(1512306332, new C0404o0(c0392l0, aVar3, i9), c0510p);
            c0510p.p(false);
            a0.q qVarK = F0.k.a(nVar4, true, C0429x.f5913o).k(nVar2);
            float f12 = AbstractC0396m0.a;
            q2.a(qVarK, AbstractC0374g2.a(N.j.f6692j, c0510p), c0392l0.a, c0392l0.f5640b, f8, f9, W.f.b(1502590376, new H2.l(aVarB2, aVarB3, aVarB, obj, obj, 2), c0510p), c0510p, 12804096, 64);
            nVar3 = nVar2;
            f10 = f8;
            f11 = f9;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0400n0(aVar, nVar3, aVar2, aVar3, c0392l0, f10, f11, i7);
        }
    }

    public static final void b(W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, W.a aVar5, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(2052297037);
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
            i8 |= c0510p.h(aVar4) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.h(aVar5) ? 16384 : 8192;
        }
        if ((i8 & 9363) == 9362 && c0510p.y()) {
            c0510p.M();
        } else {
            Object objH = c0510p.H();
            O.T t7 = C0502l.a;
            if (objH == t7) {
                objH = new C0427w0();
                c0510p.b0(objH);
            }
            C0427w0 c0427w0 = (C0427w0) objH;
            List listI = P3.r.I(aVar3, aVar4 == null ? T.a : aVar4, aVar5 == null ? T.f5342b : aVar5, aVar == null ? T.f5343c : aVar, aVar2 == null ? T.f5344d : aVar2);
            a0.n nVar = a0.n.a;
            W.a aVar6 = new W.a(true, -1953651383, new D.S(22, listI));
            Object objH2 = c0510p.H();
            if (objH2 == t7) {
                objH2 = new C2177L(c0427w0);
                c0510p.b0(objH2);
            }
            InterfaceC2173H interfaceC2173H = (InterfaceC2173H) objH2;
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, nVar);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173H);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            AbstractC0703b.v(0, aVar6, c0510p, true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0407p0(aVar, aVar2, aVar3, aVar4, aVar5, i7, 0);
        }
    }

    public static final void c(long j7, N.u uVar, e4.n nVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(1133967795);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.e(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(uVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.h(nVar) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            AbstractC0461t.a(j7, N2.a(uVar, c0510p), nVar, c0510p, i8 & 910);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new M.I(j7, uVar, nVar, i7, 2);
        }
    }

    public static final int d(InterfaceC2197o interfaceC2197o, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j7) {
        int iMax = Math.max(Math.max(T0.a.i(j7), interfaceC2197o.O(i12 == 1 ? N.j.f6688f : i12 == 2 ? N.j.f6691i : N.j.f6689g)), Math.max(i7, Math.max(i9 + i10 + i11, i8)) + i13);
        int iG = T0.a.g(j7);
        return iMax > iG ? iG : iMax;
    }
}
