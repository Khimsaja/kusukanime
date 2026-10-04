package L;

import O.C0502l;
import O.C0509o0;
import O.C0510p;
import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import f.AbstractC0841b;
import f1.AbstractC0870c;
import io.ktor.utils.io.ByteChannelKt;
import j0.InterfaceC1298d;
import k4.C1395d;
import p.C1770v;

/* loaded from: classes.dex */
public abstract class Q1 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final a0.q f5308b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5309c = 240;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5310d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5311e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1770v f5312f;

    static {
        float f5 = 10;
        a = f5;
        f5308b = androidx.compose.foundation.layout.a.j(F0.k.a(androidx.compose.ui.layout.a.b(a0.n.a, M1.f5209l), true, C0429x.f5919u), 0.0f, f5, 1);
        float f7 = N.o.f6742c;
        f5310d = f7;
        f5311e = N.o.f6743d - (f7 * 2);
        new C1770v(0.2f, 0.0f, 0.8f);
        new C1770v(0.4f, 0.0f, 1.0f);
        new C1770v(0.0f, 0.0f, 0.65f);
        new C1770v(0.1f, 0.0f, 0.45f);
        f5312f = new C1770v(0.4f, 0.0f, 0.2f);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f7 A[PHI: r10
      0x01f7: PHI (r10v6 long) = (r10v4 long), (r10v7 long) binds: [B:74:0x01f5, B:70:0x01ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(a0.q r35, long r36, float r38, long r39, int r41, O.C0510p r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.Q1.a(a0.q, long, float, long, int, O.p, int, int):void");
    }

    public static final void b(InterfaceC0821a interfaceC0821a, a0.q qVar, long j7, long j8, int i7, float f5, e4.k kVar, C0510p c0510p, int i8, int i9) {
        int i10;
        int i11;
        float f7;
        e4.k kVar2;
        float f8;
        int i12;
        e4.k kVar3;
        long j9;
        long j10;
        int i13;
        float f9;
        long j11;
        long j12;
        e4.k kVar4;
        c0510p.T(-339970038);
        int i14 = i8 | (c0510p.h(interfaceC0821a) ? 4 : 2);
        if ((i8 & 48) == 0) {
            i14 |= c0510p.f(qVar) ? 32 : 16;
        }
        long jD = j7;
        long jD2 = j8;
        int i15 = i14 | (((i9 & 4) == 0 && c0510p.e(jD)) ? 256 : 128) | (((i9 & 8) == 0 && c0510p.e(jD2)) ? 2048 : 1024);
        int i16 = i9 & 16;
        if (i16 != 0) {
            i11 = i15 | 24576;
            i10 = i7;
        } else {
            i10 = i7;
            i11 = i15 | (c0510p.d(i10) ? 16384 : 8192);
        }
        int i17 = i9 & 32;
        if (i17 != 0) {
            i11 |= 196608;
            f7 = f5;
        } else {
            f7 = f5;
            if ((i8 & 196608) == 0) {
                i11 |= c0510p.c(f7) ? 131072 : 65536;
            }
        }
        if ((i8 & 1572864) == 0) {
            kVar2 = kVar;
            i11 |= ((i9 & 64) == 0 && c0510p.h(kVar2)) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        } else {
            kVar2 = kVar;
        }
        if ((i11 & 599187) == 599186 && c0510p.y()) {
            c0510p.M();
            f9 = f7;
            kVar4 = kVar2;
            j12 = jD;
            i13 = i10;
            j11 = jD2;
        } else {
            c0510p.O();
            int i18 = i8 & 1;
            Object obj = C0502l.a;
            if (i18 == 0 || c0510p.x()) {
                if ((i9 & 4) != 0) {
                    float f10 = I1.a;
                    float f11 = N.o.a;
                    jD = P.d(26, c0510p);
                    i11 &= -897;
                }
                if ((i9 & 8) != 0) {
                    float f12 = I1.a;
                    float f13 = N.o.a;
                    jD2 = P.d(32, c0510p);
                    i11 &= -7169;
                }
                int i19 = i16 != 0 ? I1.f5122b : i10;
                if (i17 != 0) {
                    f7 = I1.f5125e;
                }
                if ((i9 & 64) != 0) {
                    boolean z7 = ((((i11 & 896) ^ 384) > 256 && c0510p.e(jD)) || (i11 & 384) == 256) | ((i11 & 57344) == 16384);
                    Object objH = c0510p.H();
                    if (z7 || objH == obj) {
                        objH = new N1(jD, i19);
                        c0510p.b0(objH);
                    }
                    i11 &= -3670017;
                    f8 = f7;
                    i12 = i19;
                    kVar2 = (e4.k) objH;
                } else {
                    f8 = f7;
                    i12 = i19;
                }
            } else {
                c0510p.M();
                if ((i9 & 4) != 0) {
                    i11 &= -897;
                }
                if ((i9 & 8) != 0) {
                    i11 &= -7169;
                }
                if ((i9 & 64) != 0) {
                    i11 &= -3670017;
                }
                f8 = f7;
                i12 = i10;
            }
            c0510p.q();
            boolean z8 = (i11 & 14) == 4;
            Object objH2 = c0510p.H();
            if (z8 || objH2 == obj) {
                objH2 = new C0349a1(interfaceC0821a, 2);
                c0510p.b0(objH2);
            }
            InterfaceC0821a interfaceC0821a2 = (InterfaceC0821a) objH2;
            a0.q qVarK = qVar.k(f5308b);
            boolean zF = c0510p.f(interfaceC0821a2);
            Object objH3 = c0510p.H();
            if (zF || objH3 == obj) {
                objH3 = new H.X(interfaceC0821a2, 3);
                c0510p.b0(objH3);
            }
            a0.q qVarK2 = androidx.compose.foundation.layout.c.k(F0.k.a(qVarK, true, (e4.k) objH3), f5309c, f5310d);
            boolean zF2 = ((458752 & i11) == 131072) | ((i11 & 57344) == 16384) | c0510p.f(interfaceC0821a2) | ((((i11 & 7168) ^ 3072) > 2048 && c0510p.e(jD2)) || (i11 & 3072) == 2048) | ((((i11 & 896) ^ 384) > 256 && c0510p.e(jD)) || (i11 & 384) == 256) | ((((3670016 & i11) ^ 1572864) > 1048576 && c0510p.f(kVar2)) || (i11 & 1572864) == 1048576);
            Object objH4 = c0510p.H();
            if (zF2 || objH4 == obj) {
                kVar3 = kVar2;
                j9 = jD;
                j10 = jD2;
                objH4 = new O1(i12, f8, interfaceC0821a2, j10, j9, kVar3);
                c0510p.b0(objH4);
            } else {
                kVar3 = kVar2;
                j9 = jD;
                j10 = jD2;
            }
            AbstractC0841b.a(qVarK2, (e4.k) objH4, c0510p, 0);
            i13 = i12;
            f9 = f8;
            j11 = j10;
            j12 = j9;
            kVar4 = kVar3;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new P1(interfaceC0821a, qVar, j12, j11, i13, f9, kVar4, i8, i9);
        }
    }

    public static final void c(InterfaceC1298d interfaceC1298d, float f5, float f7, long j7, float f8, int i7) {
        float fD = g0.f.d(interfaceC1298d.d());
        float fB = g0.f.b(interfaceC1298d.d());
        float f9 = 2;
        float f10 = fB / f9;
        boolean z7 = interfaceC1298d.getLayoutDirection() == T0.k.f8844k;
        float f11 = (z7 ? f5 : 1.0f - f7) * fD;
        float f12 = (z7 ? f7 : 1.0f - f5) * fD;
        if (i7 == 0 || fB > fD) {
            interfaceC1298d.U(j7, AbstractC0832b.e(f11, f10), AbstractC0832b.e(f12, f10), f8, (480 & 16) != 0 ? 0 : 0);
            return;
        }
        float f13 = f8 / f9;
        C1395d c1395d = new C1395d(f13, fD - f13);
        float fFloatValue = ((Number) e3.c.n(Float.valueOf(f11), c1395d)).floatValue();
        float fFloatValue2 = ((Number) e3.c.n(Float.valueOf(f12), c1395d)).floatValue();
        if (Math.abs(f7 - f5) > 0.0f) {
            interfaceC1298d.U(j7, AbstractC0832b.e(fFloatValue, f10), AbstractC0832b.e(fFloatValue2, f10), f8, (480 & 16) != 0 ? 0 : i7);
        }
    }

    public static final void d(InterfaceC1298d interfaceC1298d, float f5, float f7, long j7, j0.h hVar) {
        float f8 = 2;
        float f9 = hVar.a / f8;
        float fD = g0.f.d(interfaceC1298d.d()) - (f8 * f9);
        interfaceC1298d.G(j7, f5, f7, AbstractC0832b.e(f9, f9), AbstractC0870c.F(fD, fD), hVar);
    }
}
