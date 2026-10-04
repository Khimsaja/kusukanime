package L;

import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0379i {
    public static final float a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5598b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5599c = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5600d = 12;

    /* renamed from: e, reason: collision with root package name */
    public static final v.Z f5601e;

    /* renamed from: f, reason: collision with root package name */
    public static final v.Z f5602f;

    /* renamed from: g, reason: collision with root package name */
    public static final v.Z f5603g;

    static {
        float f5 = 24;
        f5601e = new v.Z(f5, f5, f5, f5);
        float f7 = 16;
        androidx.compose.foundation.layout.a.c(f7);
        f5602f = androidx.compose.foundation.layout.a.c(f7);
        f5603g = androidx.compose.foundation.layout.a.c(f5);
    }

    public static final void a(W.a aVar, a0.n nVar, e4.n nVar2, W.a aVar2, InterfaceC0973S interfaceC0973S, long j7, float f5, long j8, long j9, long j10, long j11, C0510p c0510p, int i7) {
        a0.n nVar3;
        c0510p.T(1522575799);
        int i8 = i7 | 48 | (c0510p.h(null) ? 256 : 128) | (c0510p.h(nVar2) ? 2048 : 1024) | (c0510p.h(aVar2) ? 16384 : 8192) | (c0510p.f(interfaceC0973S) ? 131072 : 65536) | (c0510p.e(j7) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | (c0510p.c(f5) ? 8388608 : 4194304) | (c0510p.e(j8) ? 67108864 : 33554432) | (c0510p.e(j9) ? 536870912 : 268435456);
        int i9 = (c0510p.e(j10) ? (char) 4 : (char) 2) | (c0510p.e(j11) ? ' ' : (char) 16);
        if ((i8 & 306783379) == 306783378 && (i9 & 19) == 18 && c0510p.y()) {
            c0510p.M();
            nVar3 = nVar;
        } else {
            a0.n nVar4 = a0.n.a;
            int i10 = i8 >> 12;
            q2.a(nVar4, interfaceC0973S, j7, 0L, f5, 0.0f, W.f.b(-2126308228, new C0355c(nVar2, aVar2, j9, j10, j11, j8, aVar), c0510p), c0510p, (i10 & 896) | (i10 & 112) | 12582918 | ((i8 >> 9) & 57344), 104);
            nVar3 = nVar4;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0359d(aVar, nVar3, nVar2, aVar2, interfaceC0973S, j7, f5, j8, j9, j10, j11, i7);
        }
    }

    public static final void b(W.a aVar, C0510p c0510p, int i7) {
        c0510p.T(586821353);
        if ((i7 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else {
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                objH = new G(1);
                c0510p.b0(objH);
            }
            InterfaceC2173H interfaceC2173H = (InterfaceC2173H) objH;
            a0.n nVar = a0.n.a;
            int i8 = c0510p.f7128P;
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
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i8))) {
                AbstractC0703b.u(i8, c0510p, i8, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            AbstractC0703b.v(6, aVar, c0510p, true);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0351b(aVar, i7, 1);
        }
    }

    public static final void c(InterfaceC0821a interfaceC0821a, W.a aVar, a0.n nVar, W.a aVar2, e4.n nVar2, W.a aVar3, InterfaceC0973S interfaceC0973S, long j7, long j8, long j9, long j10, float f5, X0.q qVar, C0510p c0510p, int i7, int i8) {
        int i9;
        W.a aVar4;
        W.a aVar5;
        int i10;
        c0510p.T(-919826268);
        if ((i7 & 6) == 0) {
            i9 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7;
        } else {
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            aVar4 = aVar;
            i9 |= c0510p.h(aVar4) ? 32 : 16;
        } else {
            aVar4 = aVar;
        }
        if ((i7 & 384) == 0) {
            i9 |= c0510p.f(nVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            aVar5 = aVar2;
            i9 |= c0510p.h(aVar5) ? 2048 : 1024;
        } else {
            aVar5 = aVar2;
        }
        if ((i7 & 24576) == 0) {
            i9 |= c0510p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i7) == 0) {
            i9 |= c0510p.h(nVar2) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i9 |= c0510p.h(aVar3) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i9 |= c0510p.f(interfaceC0973S) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i9 |= c0510p.e(j7) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i9 |= c0510p.e(j8) ? 536870912 : 268435456;
        }
        if ((i8 & 6) == 0) {
            i10 = i8 | (c0510p.e(j9) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c0510p.e(j10) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= c0510p.c(f5) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= c0510p.f(qVar) ? 2048 : 1024;
        }
        int i11 = i10;
        if ((i9 & 306783379) == 306783378 && (i11 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            d(interfaceC0821a, nVar, qVar, W.f.b(-1852840226, new C0367f(nVar2, aVar3, interfaceC0973S, j7, f5, j8, j9, j10, aVar5, aVar4), c0510p), c0510p, (i9 & 14) | 3072 | ((i9 >> 3) & 112) | ((i11 >> 3) & 896));
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0371g(interfaceC0821a, aVar, nVar, aVar2, nVar2, aVar3, interfaceC0973S, j7, j8, j9, j10, f5, qVar, i7, i8, 0);
        }
    }

    public static final void d(InterfaceC0821a interfaceC0821a, a0.n nVar, X0.q qVar, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        c0510p.T(-1922902937);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.h(interfaceC0821a) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.f(nVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(qVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.h(aVar) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            android.support.v4.media.session.b.a(interfaceC0821a, qVar, W.f.b(905289008, new H.M(5, nVar, aVar), c0510p), c0510p, ((i8 >> 3) & 112) | (i8 & 14) | 384);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0375h(interfaceC0821a, nVar, qVar, aVar, i7, 0);
        }
    }
}
