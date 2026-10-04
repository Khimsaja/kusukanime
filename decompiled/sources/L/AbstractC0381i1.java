package L;

import M.AbstractC0461t;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import com.kusukanime.R;
import e4.InterfaceC0821a;
import f.AbstractC0841b;
import h0.AbstractC0968M;
import h0.C0970O;
import o.C1590B;
import p.AbstractC1751g;
import p.InterfaceC1774z;
import z0.AbstractC2455l0;

/* renamed from: L.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0381i1 {
    public static final float a = 48;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5609b = 24;

    /* renamed from: c, reason: collision with root package name */
    public static final long f5610c = AbstractC0968M.i(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0215  */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e4.InterfaceC0821a r29, a0.n r30, L.C0390k2 r31, float r32, h0.InterfaceC0973S r33, long r34, long r36, float r38, long r39, W.a r41, L.S r42, L.C0385j1 r43, W.a r44, O.C0510p r45, int r46) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.AbstractC0381i1.a(e4.a, a0.n, L.k2, float, h0.S, long, long, float, long, W.a, L.S, L.j1, W.a, O.p, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(p.C1743c r34, M5.c r35, e4.InterfaceC0821a r36, e4.k r37, a0.q r38, L.C0390k2 r39, float r40, h0.InterfaceC0973S r41, long r42, long r44, float r46, W.a r47, e4.n r48, W.a r49, O.C0510p r50, int r51) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L.AbstractC0381i1.b(p.c, M5.c, e4.a, e4.k, a0.q, L.k2, float, h0.S, long, long, float, W.a, e4.n, W.a, O.p, int):void");
    }

    public static final void c(long j7, InterfaceC0821a interfaceC0821a, boolean z7, C0510p c0510p, int i7) {
        int i8;
        boolean z8;
        c0510p.T(951870469);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.e(j7) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(interfaceC0821a) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.g(z7) ? 256 : 128;
        }
        if ((i8 & 147) == 146 && c0510p.y()) {
            c0510p.M();
        } else if (j7 != 16) {
            O.R0 r0A = AbstractC1751g.a(z7 ? 1.0f : 0.0f, new p.A0(0, (InterfaceC1774z) null, 7), c0510p);
            Object objB = AbstractC0461t.b(R.string.close_sheet, c0510p);
            c0510p.R(-1785653838);
            Object obj = C0502l.a;
            a0.q qVarA = a0.n.a;
            if (z7) {
                int i9 = i8 & 112;
                boolean z9 = i9 == 32;
                Object objH = c0510p.H();
                if (z9 || objH == obj) {
                    objH = new C0377h1(null, interfaceC0821a);
                    c0510p.b0(objH);
                }
                a0.q qVarA2 = s0.w.a(qVarA, interfaceC0821a, (e4.n) objH);
                boolean zF = (i9 == 32) | c0510p.f(objB);
                Object objH2 = c0510p.H();
                if (zF || objH2 == obj) {
                    objH2 = new A3.t(12, objB, interfaceC0821a);
                    c0510p.b0(objH2);
                }
                qVarA = F0.k.a(qVarA2, true, (e4.k) objH2);
                z8 = false;
            } else {
                z8 = false;
            }
            c0510p.p(z8);
            a0.q qVarK = androidx.compose.foundation.layout.c.f10591c.k(qVarA);
            boolean zF2 = c0510p.f(r0A) | ((i8 & 14) == 4);
            Object objH3 = c0510p.H();
            if (zF2 || objH3 == obj) {
                objH3 = new C1590B(j7, r0A);
                c0510p.b0(objH3);
            }
            AbstractC0841b.a(qVarK, (e4.k) objH3, c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0373g1(j7, interfaceC0821a, z7, i7);
        }
    }

    public static final float d(C0970O c0970o, float f5) {
        float fD = g0.f.d(c0970o.f11796v);
        if (Float.isNaN(fD) || fD == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (P3.F.G(0.0f, Math.min(c0970o.f11797w.a() * a, fD), f5) / fD);
    }

    public static final float e(C0970O c0970o, float f5) {
        float fB = g0.f.b(c0970o.f11796v);
        if (Float.isNaN(fB) || fB == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (P3.F.G(0.0f, Math.min(c0970o.f11797w.a() * f5609b, fB), f5) / fB);
    }

    public static final C0390k2 f(C0510p c0510p, int i7, int i8) {
        EnumC0394l2 enumC0394l2 = EnumC0394l2.f5649k;
        boolean z7 = true;
        boolean z8 = (i8 & 1) == 0;
        C0429x c0429x = C0429x.f5915q;
        int i9 = (i7 & 14) | 384;
        float f5 = AbstractC0386j2.a;
        T0.b bVar = (T0.b) c0510p.k(AbstractC2455l0.f18787f);
        Object[] objArr = {Boolean.valueOf(z8), c0429x, Boolean.FALSE};
        S s7 = S.f5317C;
        D.G g4 = new D.G(2, bVar, c0429x, z8);
        L2.e eVar = X.n.a;
        L2.e eVar2 = new L2.e(12, s7, g4);
        if ((((i9 & 14) ^ 6) <= 4 || !c0510p.g(z8)) && (i9 & 6) != 4) {
            z7 = false;
        }
        boolean zF = c0510p.f(bVar) | z7 | c0510p.f(c0429x) | c0510p.g(false);
        Object objH = c0510p.H();
        if (zF || objH == C0502l.a) {
            objH = new C0382i2(z8, bVar, enumC0394l2, c0429x);
            c0510p.b0(objH);
        }
        return (C0390k2) z1.c.F(objArr, eVar2, (InterfaceC0821a) objH, c0510p, 0, 4);
    }
}
