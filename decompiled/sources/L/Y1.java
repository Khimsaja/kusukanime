package L;

import O.C0502l;
import O.C0509o0;
import O.C0510p;
import io.ktor.utils.io.ByteChannelKt;
import java.util.WeakHashMap;
import v.C2122a;
import x0.C2248h;

/* loaded from: classes.dex */
public abstract class Y1 {
    public static final float a = 16;

    public static final void a(a0.q qVar, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, int i7, long j7, long j8, C2122a c2122a, W.a aVar5, C0510p c0510p, int i8) {
        W.a aVar6;
        W.a aVar7;
        W.a aVar8;
        long j9;
        long jB;
        int i9;
        a0.q qVar2;
        C2122a c2122a2;
        long j10;
        long j11;
        C2122a c2122a3;
        W.a aVar9;
        W.a aVar10;
        int i10;
        a0.q qVar3;
        W.a aVar11;
        c0510p.T(-1219521777);
        if (((i8 | 38497334) & 306783379) == 306783378 && c0510p.y()) {
            c0510p.M();
            qVar3 = qVar;
            aVar11 = aVar;
            aVar9 = aVar3;
            aVar10 = aVar4;
            i10 = i7;
            j10 = j7;
            j11 = j8;
            c2122a3 = c2122a;
        } else {
            c0510p.O();
            if ((i8 & 1) == 0 || c0510p.x()) {
                a0.n nVar = a0.n.a;
                aVar6 = W.a;
                aVar7 = W.f5395b;
                aVar8 = W.f5396c;
                j9 = ((N) c0510p.k(P.a)).f5255n;
                jB = P.b(j9, c0510p);
                WeakHashMap weakHashMap = v.n0.f16470v;
                i9 = 2;
                qVar2 = nVar;
                c2122a2 = v.M.e(c0510p).f16476g;
            } else {
                c0510p.M();
                qVar2 = qVar;
                aVar6 = aVar;
                aVar7 = aVar3;
                aVar8 = aVar4;
                i9 = i7;
                j9 = j7;
                jB = j8;
                c2122a2 = c2122a;
            }
            c0510p.q();
            boolean zF = c0510p.f(c2122a2);
            Object objH = c0510p.H();
            Object obj = C0502l.a;
            if (zF || objH == obj) {
                objH = new M.G(c2122a2);
                c0510p.b0(objH);
            }
            M.G g4 = (M.G) objH;
            boolean zF2 = c0510p.f(g4) | c0510p.f(c2122a2);
            Object objH2 = c0510p.H();
            if (zF2 || objH2 == obj) {
                objH2 = new A3.t(14, g4, c2122a2);
                c0510p.b0(objH2);
            }
            C2248h c2248h = v.p0.a;
            W.a aVar12 = aVar6;
            W.a aVar13 = aVar7;
            W.a aVar14 = aVar8;
            int i11 = i9;
            long j12 = j9;
            long j13 = jB;
            q2.a(a0.a.a(qVar2, new D.M0(6, (e4.k) objH2)), null, j12, j13, 0.0f, 0.0f, W.f.b(-1979205334, new U1(i11, aVar12, aVar5, aVar13, aVar14, g4, aVar2), c0510p), c0510p, 12582912, 114);
            j10 = j12;
            j11 = j13;
            c2122a3 = c2122a2;
            aVar9 = aVar13;
            aVar10 = aVar14;
            i10 = i11;
            qVar3 = qVar2;
            aVar11 = aVar12;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new V1(qVar3, aVar11, aVar2, aVar9, aVar10, i10, j10, j11, c2122a3, aVar5, i8);
        }
    }

    public static final void b(int i7, W.a aVar, W.a aVar2, W.a aVar3, W.a aVar4, v.m0 m0Var, W.a aVar5, C0510p c0510p, int i8) {
        int i9;
        W.a aVar6;
        v.m0 m0Var2;
        W.a aVar7;
        c0510p.T(-975511942);
        if ((i8 & 6) == 0) {
            i9 = (c0510p.d(i7) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 48) == 0) {
            i9 |= c0510p.h(aVar) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            aVar6 = aVar2;
            i9 |= c0510p.h(aVar6) ? 256 : 128;
        } else {
            aVar6 = aVar2;
        }
        if ((i8 & 3072) == 0) {
            i9 |= c0510p.h(aVar3) ? 2048 : 1024;
        }
        if ((i8 & 24576) == 0) {
            i9 |= c0510p.h(aVar4) ? 16384 : 8192;
        }
        if ((196608 & i8) == 0) {
            m0Var2 = m0Var;
            i9 |= c0510p.f(m0Var2) ? 131072 : 65536;
        } else {
            m0Var2 = m0Var;
        }
        if ((1572864 & i8) == 0) {
            aVar7 = aVar5;
            i9 |= c0510p.h(aVar7) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        } else {
            aVar7 = aVar5;
        }
        if ((i9 & 599187) == 599186 && c0510p.y()) {
            c0510p.M();
        } else {
            boolean z7 = ((i9 & 112) == 32) | ((i9 & 7168) == 2048) | ((458752 & i9) == 131072) | ((57344 & i9) == 16384) | ((i9 & 14) == 4) | ((3670016 & i9) == 1048576) | ((i9 & 896) == 256);
            Object objH = c0510p.H();
            if (z7 || objH == C0502l.a) {
                U1 u12 = new U1(aVar, aVar3, aVar4, i7, m0Var2, aVar7, aVar6);
                c0510p.b0(u12);
                objH = u12;
            }
            w0.X.b(null, (e4.n) objH, c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new X1(i7, aVar, aVar2, aVar3, aVar4, m0Var, aVar5, i8);
        }
    }
}
