package androidx.compose.animation;

import D.M0;
import L.B0;
import L.C0407p0;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.T;
import O.Z;
import Q4.c;
import a0.n;
import a0.q;
import e4.k;
import e4.o;
import o.C1593E;
import o.C1594F;
import o.C1606d;
import o.C1618p;
import o.EnumC1624v;
import p.u0;
import p.z0;

/* loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(p.u0 r30, e4.k r31, a0.q r32, o.C1593E r33, o.C1594F r34, e4.n r35, W.a r36, O.C0510p r37, int r38) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(p.u0, e4.k, a0.q, o.E, o.F, e4.n, W.a, O.p, int):void");
    }

    public static final void b(boolean z7, q qVar, C1593E c1593e, C1594F c1594f, String str, W.a aVar, C0510p c0510p, int i7, int i8) {
        int i9;
        q qVar2;
        String str2;
        c0510p.T(2088733774);
        int i10 = i7 | (c0510p.g(z7) ? 4 : 2);
        int i11 = i8 & 2;
        if (i11 != 0) {
            i9 = i10 | 48;
        } else {
            i9 = i10 | (c0510p.f(qVar) ? 32 : 16);
        }
        int i12 = i9 | 24576;
        if ((74899 & i12) == 74898 && c0510p.y()) {
            c0510p.M();
            qVar2 = qVar;
            str2 = str;
        } else {
            q qVar3 = i11 != 0 ? n.a : qVar;
            c(z0.d(Boolean.valueOf(z7), "AnimatedVisibility", c0510p, (i12 & 14) | 48), qVar3, c1593e, c1594f, aVar, c0510p, ((i12 << 3) & 896) | 224304);
            qVar2 = qVar3;
            str2 = "AnimatedVisibility";
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B0(z7, qVar2, c1593e, c1594f, str2, aVar, i7, i8);
        }
    }

    public static final void c(u0 u0Var, q qVar, C1593E c1593e, C1594F c1594f, W.a aVar, C0510p c0510p, int i7) {
        int i8;
        u0 u0Var2;
        C0510p c0510p2;
        C1593E c1593e2;
        C1594F c1594f2;
        W.a aVar2;
        C1618p c1618p = C1618p.f13526m;
        c0510p.T(429978603);
        if ((i7 & 6) == 0) {
            i8 = (c0510p.f(u0Var) ? 4 : 2) | i7;
        } else {
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(c1618p) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.f(qVar) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            i8 |= c0510p.f(c1593e) ? 2048 : 1024;
        }
        if ((i7 & 24576) == 0) {
            i8 |= c0510p.f(c1594f) ? 16384 : 8192;
        }
        if ((i7 & 196608) == 0) {
            i8 |= c0510p.h(aVar) ? 131072 : 65536;
        }
        if ((74899 & i8) == 74898 && c0510p.y()) {
            c0510p.M();
            u0Var2 = u0Var;
            c0510p2 = c0510p;
            aVar2 = aVar;
            c1594f2 = c1594f;
            c1593e2 = c1593e;
        } else {
            int i9 = i8 & 112;
            int i10 = i8 & 14;
            boolean z7 = (i9 == 32) | (i10 == 4);
            Object objH = c0510p.H();
            if (z7 || objH == C0502l.a) {
                objH = new M0(4, u0Var);
                c0510p.b0(objH);
            }
            int i11 = 196608 | i10 | i9 | (i8 & 7168) | (57344 & i8) | ((i8 << 6) & 29360128);
            u0Var2 = u0Var;
            c0510p2 = c0510p;
            a(u0Var2, c1618p, androidx.compose.ui.layout.a.b(qVar, (o) objH), c1593e, c1594f, C1606d.f13497n, aVar, c0510p2, i11);
            c1593e2 = c1593e;
            c1594f2 = c1594f;
            aVar2 = aVar;
        }
        C0509o0 c0509o0S = c0510p2.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0407p0(u0Var2, qVar, c1593e2, c1594f2, aVar2, i7);
        }
    }

    public static final EnumC1624v d(u0 u0Var, k kVar, Object obj, C0510p c0510p) {
        c0510p.N(-902048200, 0, u0Var, null);
        boolean zG = u0Var.g();
        EnumC1624v enumC1624v = EnumC1624v.f13538k;
        EnumC1624v enumC1624v2 = EnumC1624v.f13540m;
        EnumC1624v enumC1624v3 = EnumC1624v.f13539l;
        c cVar = u0Var.a;
        if (zG) {
            c0510p.R(2101296683);
            c0510p.p(false);
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                enumC1624v = enumC1624v3;
            } else if (((Boolean) kVar.invoke(cVar.v0())).booleanValue()) {
                enumC1624v = enumC1624v2;
            }
        } else {
            c0510p.R(2101530516);
            Object objH = c0510p.H();
            if (objH == C0502l.a) {
                objH = C0486d.K(Boolean.FALSE, T.f7049p);
                c0510p.b0(objH);
            }
            Z z7 = (Z) objH;
            if (((Boolean) kVar.invoke(cVar.v0())).booleanValue()) {
                z7.setValue(Boolean.TRUE);
            }
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                enumC1624v = enumC1624v3;
            } else if (((Boolean) z7.getValue()).booleanValue()) {
                enumC1624v = enumC1624v2;
            }
            c0510p.p(false);
        }
        c0510p.p(false);
        return enumC1624v;
    }
}
