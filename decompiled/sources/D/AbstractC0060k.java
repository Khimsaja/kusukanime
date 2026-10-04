package D;

import H0.C0214f;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import e4.InterfaceC0821a;
import h0.C0975U;
import io.ktor.utils.io.ByteChannelKt;

/* renamed from: D.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0060k {
    static {
        float f5 = 40;
        P3.r.b(f5, f5);
    }

    public static final void a(String str, e4.k kVar, a0.q qVar, boolean z7, H0.I i7, C0051f0 c0051f0, C0049e0 c0049e0, boolean z8, int i8, int i9, I1.e eVar, C0054h c0054h, u.k kVar2, C0975U c0975u, W.a aVar, C0510p c0510p, int i10) {
        C0054h c0054h2;
        C0054h c0054h3;
        c0510p.T(945255183);
        int i11 = i10 | (c0510p.f(str) ? 4 : 2) | (c0510p.h(kVar) ? 32 : 16) | (c0510p.f(qVar) ? 256 : 128) | (c0510p.g(z7) ? 2048 : 1024) | (c0510p.g(false) ? 16384 : 8192) | (c0510p.f(i7) ? 131072 : 65536) | (c0510p.f(c0051f0) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288) | (c0510p.f(c0049e0) ? 8388608 : 4194304) | (c0510p.g(z8) ? 67108864 : 33554432) | (c0510p.d(i8) ? 536870912 : 268435456);
        int i12 = 196608 | (c0510p.d(i9) ? 4 : 2) | (c0510p.f(eVar) ? 32 : 16) | 384 | (c0510p.f(kVar2) ? 2048 : 1024) | (c0510p.f(c0975u) ? 16384 : 8192);
        if ((306783379 & i11) == 306783378 && (i12 & 74899) == 74898 && c0510p.y()) {
            c0510p.M();
            c0054h3 = c0054h;
        } else {
            c0510p.O();
            if ((i10 & 1) == 0 || c0510p.x()) {
                c0054h2 = C0054h.f1167m;
            } else {
                c0510p.M();
                c0054h2 = c0054h;
            }
            c0510p.q();
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            O.T t7 = O.T.f7049p;
            if (objH == obj) {
                objH = C0486d.K(new N0.w(str, 0L, 6), t7);
                c0510p.b0(objH);
            }
            O.Z z9 = (O.Z) objH;
            N0.w wVar = (N0.w) z9.getValue();
            N0.w wVar2 = new N0.w(new C0214f(str, null, 6), wVar.f6896b, wVar.f6897c);
            boolean zF = c0510p.f(wVar2);
            Object objH2 = c0510p.H();
            if (zF || objH2 == obj) {
                objH2 = new A.m(1, wVar2, z9);
                c0510p.b0(objH2);
            }
            C0486d.g((InterfaceC0821a) objH2, c0510p);
            boolean z10 = (i11 & 14) == 4;
            Object objH3 = c0510p.H();
            if (z10 || objH3 == obj) {
                objH3 = C0486d.K(str, t7);
                c0510p.b0(objH3);
            }
            Object obj2 = (O.Z) objH3;
            c0051f0.getClass();
            int i13 = c0051f0.a;
            N0.k kVar3 = new N0.k(i13);
            if (i13 == -1) {
                kVar3 = null;
            }
            N0.l lVar = new N0.l(z8, 0, true, 1, kVar3 != null ? kVar3.a : 1, O0.b.f7249m);
            boolean z11 = !z8;
            c0054h3 = c0054h2;
            int i14 = z8 ? 1 : i9;
            int i15 = z8 ? 1 : i8;
            boolean zF2 = ((i11 & 112) == 32) | c0510p.f(obj2);
            Object objH4 = c0510p.H();
            if (zF2 || objH4 == obj) {
                objH4 = new C0056i(kVar, z9, obj2, 0);
                c0510p.b0(objH4);
            }
            int i16 = i12 << 9;
            AbstractC0047d0.c(wVar2, (e4.k) objH4, qVar, i7, eVar, c0054h3, kVar2, c0975u, z11, i15, i14, lVar, c0049e0, z7, aVar, c0510p, (i11 & 896) | ((i11 >> 6) & 7168) | (i16 & 57344) | 196608 | (3670016 & i16) | (i16 & 29360128), (i11 & 57344) | ((i11 >> 15) & 896) | (i11 & 7168) | 196608);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0058j(str, kVar, qVar, z7, i7, c0051f0, c0049e0, z8, i8, i9, eVar, c0054h3, kVar2, c0975u, aVar, i10);
        }
    }
}
