package L;

import O.C0486d;
import O.C0502l;
import O.C0507n0;
import O.C0509o0;
import O.C0510p;
import O.C0525y;
import e4.InterfaceC0821a;
import h0.C0998u;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import p.C1743c;
import p.C1761m;
import q.C1837t;
import u.C2063b;

/* loaded from: classes.dex */
public abstract class M {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final v.Z f5200b;

    static {
        float f5 = 8;
        a = f5;
        androidx.compose.foundation.layout.a.a(f5, 2);
        f5200b = androidx.compose.foundation.layout.a.a(f5, 2);
        androidx.compose.foundation.layout.a.a(f5, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r23, e4.InterfaceC0821a r24, W.a r25, a0.n r26, boolean r27, W.a r28, h0.InterfaceC0973S r29, L.C0350a2 r30, L.C0362d2 r31, q.C1837t r32, O.C0510p r33, int r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.M.a(boolean, e4.a, W.a, a0.n, boolean, W.a, h0.S, L.a2, L.d2, q.t, O.p, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v49 */
    public static final void b(boolean z7, a0.n nVar, InterfaceC0821a interfaceC0821a, boolean z8, W.a aVar, H0.I i7, W.a aVar2, InterfaceC0973S interfaceC0973S, C0350a2 c0350a2, C0362d2 c0362d2, C1837t c1837t, float f5, v.Z z9, C0510p c0510p, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        u.k kVar;
        O.Z z10;
        C1743c c1743c;
        long j7;
        boolean z11;
        C1761m c1761m;
        ?? r02;
        c0510p.T(402951308);
        if ((i8 & 6) == 0) {
            i10 = (c0510p.g(z7) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= c0510p.f(nVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= c0510p.h(interfaceC0821a) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            i10 |= c0510p.g(z8) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i10 |= c0510p.h(aVar) ? 16384 : 8192;
        }
        if ((i8 & 196608) == 0) {
            i10 |= c0510p.f(i7) ? 131072 : 65536;
        }
        if ((i8 & 1572864) == 0) {
            i10 |= c0510p.h(aVar2) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((i8 & 12582912) == 0) {
            i10 |= c0510p.h(null) ? 8388608 : 4194304;
        }
        if ((i8 & 100663296) == 0) {
            i10 |= c0510p.h(null) ? 67108864 : 33554432;
        }
        if ((i8 & 805306368) == 0) {
            i10 |= c0510p.f(interfaceC0973S) ? 536870912 : 268435456;
        }
        if ((i9 & 6) == 0) {
            i11 = i9 | (c0510p.f(c0350a2) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c0510p.f(c0362d2) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c0510p.f(c1837t) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c0510p.c(f5) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c0510p.f(z9) ? 16384 : 8192;
        }
        if ((i9 & 196608) == 0) {
            i12 = i10;
            i11 |= c0510p.f(null) ? 131072 : 65536;
        } else {
            i12 = i10;
        }
        if ((i12 & 306783379) == 306783378 && (i11 & 74899) == 74898 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.R(2072749057);
            Object obj = C0502l.a;
            Object objH = c0510p.H();
            if (objH == obj) {
                objH = new u.k();
                c0510p.b0(objH);
            }
            u.k kVar2 = (u.k) objH;
            c0510p.p(false);
            a0.q qVarA = F0.k.a(nVar, false, C0429x.f5912n);
            long j8 = !z8 ? z7 ? c0350a2.f5454j : c0350a2.f5449e : !z7 ? c0350a2.a : c0350a2.f5453i;
            c0510p.R(2072762384);
            if (c0362d2 == null) {
                kVar = kVar2;
                j7 = j8;
                r02 = 0;
                c1761m = null;
            } else {
                long j9 = j8;
                int i14 = ((i11 << 3) & 896) | ((i12 >> 9) & 14);
                Object objH2 = c0510p.H();
                if (objH2 == obj) {
                    objH2 = new Y.r();
                    c0510p.b0(objH2);
                }
                Y.r rVar = (Y.r) objH2;
                Object objH3 = c0510p.H();
                if (objH3 == obj) {
                    i13 = i14;
                    objH3 = C0486d.K(null, O.T.f7049p);
                    c0510p.b0(objH3);
                } else {
                    i13 = i14;
                }
                O.Z z12 = (O.Z) objH3;
                boolean zF = c0510p.f(kVar2);
                Object objH4 = c0510p.H();
                if (zF || objH4 == obj) {
                    objH4 = new C0354b2(kVar2, rVar, null);
                    c0510p.b0(objH4);
                }
                C0486d.e(c0510p, (e4.n) objH4, kVar2);
                u.i iVar = (u.i) P3.q.B0(rVar);
                float f7 = !z8 ? c0362d2.f5508f : iVar instanceof u.m ? c0362d2.f5504b : iVar instanceof u.g ? c0362d2.f5506d : iVar instanceof u.d ? c0362d2.f5505c : iVar instanceof C2063b ? c0362d2.f5507e : c0362d2.a;
                Object objH5 = c0510p.H();
                if (objH5 == obj) {
                    kVar = kVar2;
                    z10 = z12;
                    objH5 = new C1743c(new T0.e(f7), p.C0.f13840c, null, 12);
                    c0510p.b0(objH5);
                } else {
                    kVar = kVar2;
                    z10 = z12;
                }
                C1743c c1743c2 = (C1743c) objH5;
                T0.e eVar = new T0.e(f7);
                boolean zH = c0510p.h(c1743c2) | c0510p.c(f7) | ((((i13 & 14) ^ 6) > 4 && c0510p.g(z8)) || (i13 & 6) == 4) | c0510p.h(iVar);
                Object objH6 = c0510p.H();
                if (zH || objH6 == obj) {
                    c1743c = c1743c2;
                    j7 = j9;
                    z11 = false;
                    C0358c2 c0358c2 = new C0358c2(c1743c, f7, z8, iVar, z10, null);
                    c0510p.b0(c0358c2);
                    objH6 = c0358c2;
                } else {
                    c1743c = c1743c2;
                    j7 = j9;
                    z11 = false;
                }
                C0486d.e(c0510p, (e4.n) objH6, eVar);
                c1761m = c1743c.f13958c;
                r02 = z11;
            }
            c0510p.p(r02);
            int i15 = r02;
            float f8 = c1761m != null ? ((T0.e) c1761m.f14048l.getValue()).f8839k : (float) r02;
            W.a aVarB = W.f.b(-577614814, new K(c0350a2, z8, z7, aVar, i7, aVar2, f5, z9), c0510p);
            C0525y c0525y = q2.a;
            long j10 = j7;
            long jB = P.b(j10, c0510p);
            C0525y c0525y2 = q2.a;
            float f9 = ((T0.e) c0510p.k(c0525y2)).f8839k + i15;
            C0486d.b(new C0507n0[]{X.a.a(new C0998u(jB)), c0525y2.a(new T0.e(f9))}, W.f.b(-1164547968, new p2(qVarA, interfaceC0973S, j10, f9, c1837t, z7, kVar, z8, interfaceC0821a, f8, aVarB), c0510p), c0510p, 56);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new L(z7, nVar, interfaceC0821a, z8, aVar, i7, aVar2, interfaceC0973S, c0350a2, c0362d2, c1837t, f5, z9, i8, i9);
        }
    }

    public static final void c(W.a aVar, H0.I i7, long j7, W.a aVar2, long j8, long j9, float f5, v.Z z7, C0510p c0510p, int i8) {
        W.a aVar3;
        int i9;
        W.a aVar4;
        long j10;
        long j11;
        v.Z z8;
        c0510p.T(-782878228);
        if ((i8 & 6) == 0) {
            aVar3 = aVar;
            i9 = (c0510p.h(aVar3) ? 4 : 2) | i8;
        } else {
            aVar3 = aVar;
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0510p.f(i7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i9 |= c0510p.e(j7) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            aVar4 = aVar2;
            i9 |= c0510p.h(aVar4) ? 2048 : 1024;
        } else {
            aVar4 = aVar2;
        }
        if ((i8 & 24576) == 0) {
            i9 |= c0510p.h(null) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            i9 |= c0510p.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i8) == 0) {
            j10 = j8;
            i9 |= c0510p.e(j10) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        } else {
            j10 = j8;
        }
        if ((12582912 & i8) == 0) {
            j11 = j9;
            i9 |= c0510p.e(j11) ? 8388608 : 4194304;
        } else {
            j11 = j9;
        }
        if ((100663296 & i8) == 0) {
            i9 |= c0510p.c(f5) ? 67108864 : 33554432;
        }
        if ((805306368 & i8) == 0) {
            z8 = z7;
            i9 |= c0510p.f(z8) ? 536870912 : 268435456;
        } else {
            z8 = z7;
        }
        if ((i9 & 306783379) == 306783378 && c0510p.y()) {
            c0510p.M();
        } else {
            C0486d.b(new C0507n0[]{X.a.a(new C0998u(j7)), H2.a.a(i7)}, W.f.b(1748799148, new H(f5, z8, aVar4, j10, aVar3, j11), c0510p), c0510p, 56);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new I(aVar, i7, j7, aVar2, j8, j9, f5, z7, i8);
        }
    }
}
