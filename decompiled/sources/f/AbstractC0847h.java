package f;

import C2.H;
import L.C0435z;
import L.E0;
import L.H2;
import L.M2;
import L.N;
import L.N2;
import L.P;
import L.q2;
import O.C0486d;
import O.C0502l;
import O.C0509o0;
import O.C0510p;
import O.InterfaceC0501k0;
import O.S0;
import O.T;
import O3.C;
import P3.v;
import a0.n;
import a0.q;
import android.graphics.Path;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.compose.foundation.layout.LayoutWeightElement;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import e4.k;
import f1.AbstractC0870c;
import f6.EnumC0888B;
import g.C0928a;
import g.C0929b;
import g.C0930c;
import g0.AbstractC0932a;
import g5.C0954a;
import g5.o;
import h0.C0987j;
import io.ktor.http.LinkHeader;
import java.net.ProtocolException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;
import l4.C1447z;
import l4.EnumC1413A;
import l4.InterfaceC1444w;
import n0.AbstractC1531B;
import n0.C1533D;
import n0.C1535b;
import n0.C1540g;
import n0.C1559z;
import o.AbstractC1601M;
import p.C1772x;
import s.C1904b;
import s.C1928n;
import s.EnumC1903a0;
import u.j;
import v.AbstractC2123b;
import v.AbstractC2130i;
import v.C2140t;
import v.InterfaceC2126e;
import v.InterfaceC2128g;
import v.Z;
import v.e0;
import v.f0;
import v.r;
import w.u;
import w.x;
import y.C2330k;
import y.InterfaceC2331l;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* renamed from: f.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0847h {
    public static final void a(q qVar, u uVar, Z z7, InterfaceC2128g interfaceC2128g, a0.g gVar, C1928n c1928n, boolean z8, k kVar, C0510p c0510p, int i7, int i8) {
        q qVar2;
        int i9;
        InterfaceC2128g interfaceC2128g2;
        q qVar3;
        u uVarA;
        a0.g gVar2;
        int i10;
        boolean z9;
        InterfaceC2128g interfaceC2128g3;
        C1928n c1928n2;
        C1928n c1928n3;
        boolean z10;
        a0.g gVar3;
        u uVar2;
        c0510p.T(-740714857);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
            qVar2 = qVar;
        } else if ((i7 & 6) == 0) {
            qVar2 = qVar;
            i9 = (c0510p.f(qVar2) ? 4 : 2) | i7;
        } else {
            qVar2 = qVar;
            i9 = i7;
        }
        int i12 = i9 | 16;
        if ((i7 & 384) == 0) {
            i12 |= c0510p.f(z7) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if ((i7 & 24576) == 0) {
            if ((i8 & 16) == 0) {
                interfaceC2128g2 = interfaceC2128g;
                int i14 = c0510p.f(interfaceC2128g2) ? 16384 : 8192;
                i13 |= i14;
            } else {
                interfaceC2128g2 = interfaceC2128g;
            }
            i13 |= i14;
        } else {
            interfaceC2128g2 = interfaceC2128g;
        }
        int i15 = i13 | 13303808 | (c0510p.h(kVar) ? 67108864 : 33554432);
        if ((38347923 & i15) == 38347922 && c0510p.y()) {
            c0510p.M();
            uVar2 = uVar;
            gVar3 = gVar;
            c1928n3 = c1928n;
            z10 = z8;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                qVar3 = i11 != 0 ? n.a : qVar2;
                uVarA = x.a(c0510p);
                int i16 = i15 & (-113);
                if ((i8 & 16) != 0) {
                    interfaceC2128g2 = AbstractC2130i.f16445c;
                    i16 = i15 & (-57457);
                }
                a0.g gVar4 = a0.b.f10393w;
                C1772x c1772xA = AbstractC1601M.a(c0510p);
                boolean zF = c0510p.f(c1772xA);
                Object objH = c0510p.H();
                if (zF || objH == C0502l.a) {
                    objH = new C1928n(c1772xA);
                    c0510p.b0(objH);
                }
                gVar2 = gVar4;
                i10 = i16 & (-3670017);
                z9 = true;
                interfaceC2128g3 = interfaceC2128g2;
                c1928n2 = (C1928n) objH;
            } else {
                c0510p.M();
                int i17 = i15 & (-113);
                if ((i8 & 16) != 0) {
                    i17 = i15 & (-57457);
                }
                gVar2 = gVar;
                z9 = z8;
                i10 = i17 & (-3670017);
                qVar3 = qVar2;
                interfaceC2128g3 = interfaceC2128g2;
                uVarA = uVar;
                c1928n2 = c1928n;
            }
            c0510p.q();
            AbstractC0870c.E(qVar3, uVarA, z7, true, c1928n2, z9, gVar2, interfaceC2128g3, null, null, kVar, c0510p, (i10 & 14) | 24576 | (i10 & 896) | 102239232 | ((i10 << 15) & 1879048192), (i10 >> 18) & 896, 3200);
            a0.g gVar5 = gVar2;
            c1928n3 = c1928n2;
            interfaceC2128g2 = interfaceC2128g3;
            z10 = z9;
            gVar3 = gVar5;
            uVar2 = uVarA;
            qVar2 = qVar3;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0435z(qVar2, uVar2, z7, interfaceC2128g2, gVar3, c1928n3, z10, kVar, i7, i8, 1);
        }
    }

    public static final void b(q qVar, u uVar, Z z7, InterfaceC2126e interfaceC2126e, a0.h hVar, C1928n c1928n, boolean z8, k kVar, C0510p c0510p, int i7, int i8) {
        int i9;
        C1928n c1928n2;
        q qVar2;
        int i10;
        u uVar2;
        a0.h hVar2;
        boolean z9;
        q qVar3;
        boolean z10;
        a0.h hVar3;
        C1928n c1928n3;
        u uVar3;
        c0510p.T(-1724297413);
        int i11 = i8 & 1;
        if (i11 != 0) {
            i9 = i7 | 6;
        } else if ((i7 & 6) == 0) {
            i9 = i7 | (c0510p.f(qVar) ? 4 : 2);
        } else {
            i9 = i7;
        }
        int i12 = i9 | 13306896 | (c0510p.h(kVar) ? 67108864 : 33554432);
        if ((38347923 & i12) == 38347922 && c0510p.y()) {
            c0510p.M();
            qVar3 = qVar;
            uVar3 = uVar;
            hVar3 = hVar;
            c1928n3 = c1928n;
            z10 = z8;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                if (i11 != 0) {
                    qVar = n.a;
                }
                u uVarA = x.a(c0510p);
                a0.h hVar4 = a0.b.f10390t;
                C1772x c1772xA = AbstractC1601M.a(c0510p);
                boolean zF = c0510p.f(c1772xA);
                Object objH = c0510p.H();
                if (zF || objH == C0502l.a) {
                    objH = new C1928n(c1772xA);
                    c0510p.b0(objH);
                }
                c1928n2 = (C1928n) objH;
                qVar2 = qVar;
                i10 = i12 & (-3670129);
                uVar2 = uVarA;
                hVar2 = hVar4;
                z9 = true;
            } else {
                c0510p.M();
                qVar2 = qVar;
                i10 = i12 & (-3670129);
                uVar2 = uVar;
                hVar2 = hVar;
                c1928n2 = c1928n;
                z9 = z8;
            }
            c0510p.q();
            AbstractC0870c.E(qVar2, uVar2, z7, false, c1928n2, z9, null, null, hVar2, interfaceC2126e, kVar, c0510p, (i10 & 14) | 1600896, 54 | ((i10 >> 18) & 896), 896);
            qVar3 = qVar2;
            z10 = z9;
            hVar3 = hVar2;
            c1928n3 = c1928n2;
            uVar3 = uVar2;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new C0435z(qVar3, uVar3, z7, interfaceC2126e, hVar3, c1928n3, z10, kVar, i7, i8, 2);
        }
    }

    public static L2.e c() {
        C0930c c0930c = C0930c.a;
        C0929b c0929b = C0929b.a;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        C0928a c0928a = C0928a.a;
        if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        L2.e eVar = new L2.e(21, false);
        eVar.f6045l = c0929b;
        if (i7 >= 33 || (i7 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            MediaStore.getPickImagesMaxLimit();
        }
        eVar.f6045l = c0930c;
        eVar.f6046m = c0928a;
        return eVar;
    }

    public static final void d(String str, String str2, String str3, InterfaceC0821a interfaceC0821a, C0510p c0510p, int i7) {
        S0 s02;
        c0510p.T(-1546355232);
        int i8 = i7 | (c0510p.f(str) ? 4 : 2) | (c0510p.f(str2) ? 32 : 16) | (c0510p.f(str3) ? 256 : 128) | (c0510p.h(interfaceC0821a) ? 2048 : 1024);
        if ((i8 & 1171) == 1170 && c0510p.y()) {
            c0510p.M();
        } else {
            n nVar = n.a;
            q qVarJ = androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.c.d(nVar, 1.0f), false, null, interfaceC0821a, 7), 0.0f, 8, 1);
            f0 f0VarB = e0.b(AbstractC2130i.a, a0.b.f10391u, c0510p, 48);
            int i9 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            q qVarC = a0.a.c(c0510p, qVarJ);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C2361h c2361h = C2363j.f17875f;
            C0486d.R(c0510p, c2361h, f0VarB);
            C2361h c2361h2 = C2363j.f17874e;
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M);
            C2361h c2361h3 = C2363j.f17876g;
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i9))) {
                AbstractC0703b.u(i9, c0510p, i9, c2361h3);
            }
            C2361h c2361h4 = C2363j.f17873d;
            C0486d.R(c0510p, c2361h4, qVarC);
            float f5 = 12;
            C.d dVarB = C.e.b(f5);
            S0 s03 = P.a;
            q2.a(null, dVarB, ((N) c0510p.k(s03)).f5231H, 0L, 0.0f, 0.0f, W.f.b(93796191, new r3.e(str3, str), c0510p), c0510p, 12582912, 121);
            AbstractC2123b.a(c0510p, androidx.compose.foundation.layout.c.n(f5));
            if (1.0f <= 0.0d) {
                throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C2140t c2140tA = r.a(AbstractC2130i.f16445c, a0.b.f10393w, c0510p, 0);
            int i10 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M2 = c0510p.m();
            q qVarC2 = a0.a.c(c0510p, layoutWeightElement);
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, c2361h, c2140tA);
            C0486d.R(c0510p, c2361h2, interfaceC0501k0M2);
            if (c0510p.f7127O || !l.a(c0510p.H(), Integer.valueOf(i10))) {
                AbstractC0703b.u(i10, c0510p, i10, c2361h3);
            }
            C0486d.R(c0510p, c2361h4, qVarC2);
            S0 s04 = N2.a;
            H2.b(str, null, 0L, 0L, M0.u.f6417q, 0L, null, 0L, 2, false, 2, 0, ((M2) c0510p.k(s04)).f5219k, c0510p, (i8 & 14) | 196608, 3120, 55262);
            C0510p c0510p2 = c0510p;
            String str4 = (str2 == null || AbstractC2510o.g0(str2)) ? null : str2;
            if (str4 == null) {
                c0510p2.R(-846687450);
                c0510p2.p(false);
                s02 = s03;
            } else {
                c0510p2.R(-846687449);
                AbstractC2123b.a(c0510p2, androidx.compose.foundation.layout.c.e(nVar, 2));
                s02 = s03;
                H2.b(str4, null, ((N) c0510p2.k(s03)).f5260s, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((M2) c0510p2.k(s04)).f5223o, c0510p, 0, 3120, 55290);
                c0510p2 = c0510p;
                c0510p2.p(false);
            }
            c0510p2.p(true);
            c0510p2.p(true);
            E0.e(null, 0.0f, ((N) c0510p2.k(s02)).f5225B, c0510p2, 0, 3);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new B3.h(str, str2, str3, interfaceC0821a, i7, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(e4.k r35, e4.k r36, z3.C2488d r37, O.C0510p r38, int r39) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC0847h.e(e4.k, e4.k, z3.d, O.p, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int f(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f.AbstractC0847h.f(int, int, int, boolean):int");
    }

    public static void g(String str, StringBuilder sb) {
        sb.append('\"');
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = str.charAt(i7);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt == '\"') {
                sb.append("%22");
            } else {
                sb.append(cCharAt);
            }
        }
        sb.append('\"');
    }

    public static final void i(long j7, EnumC1903a0 enumC1903a0) {
        if (enumC1903a0 == EnumC1903a0.f15259k) {
            if (T0.a.g(j7) == Integer.MAX_VALUE) {
                throw new IllegalStateException("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else if (T0.a.h(j7) == Integer.MAX_VALUE) {
            throw new IllegalStateException("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final O.Z k(j jVar, C0510p c0510p, int i7) {
        Object objH = c0510p.H();
        T t7 = C0502l.a;
        if (objH == t7) {
            objH = C0486d.K(Boolean.FALSE, T.f7049p);
            c0510p.b0(objH);
        }
        O.Z z7 = (O.Z) objH;
        boolean z8 = (((i7 & 14) ^ 6) > 4 && c0510p.f(jVar)) || (i7 & 6) == 4;
        Object objH2 = c0510p.H();
        if (z8 || objH2 == t7) {
            objH2 = new u.f(jVar, z7, null);
            c0510p.b0(objH2);
        }
        C0486d.e(c0510p, (e4.n) objH2, jVar);
        return z7;
    }

    public static O.Z l() {
        return C0486d.K(C.a, T.f7046m);
    }

    public static o m(String str, List list) {
        g5.n nVar;
        l.f("debugName", str);
        w5.f fVar = new w5.f();
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            nVar = g5.n.f11759b;
            if (!zHasNext) {
                break;
            }
            o oVar = (o) it.next();
            if (oVar != nVar) {
                if (oVar instanceof C0954a) {
                    v.f0(fVar, ((C0954a) oVar).f11723c);
                } else {
                    fVar.add(oVar);
                }
            }
        }
        int i7 = fVar.f17101k;
        return i7 != 0 ? i7 != 1 ? new C0954a(str, (o[]) fVar.toArray(new o[0])) : (o) fVar.get(0) : nVar;
    }

    public static final void n(C1535b c1535b, C1559z c1559z) {
        int size = c1559z.f13225l.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1531B abstractC1531B = (AbstractC1531B) c1559z.f13225l.get(i7);
            if (abstractC1531B instanceof C1533D) {
                C1540g c1540g = new C1540g();
                C1533D c1533d = (C1533D) abstractC1531B;
                c1540g.f13168c = c1533d.f13123k;
                c1540g.f13170e = true;
                c1540g.c();
                C0987j c0987j = c1540g.f13173h;
                c0987j.getClass();
                c0987j.a.setFillType(Path.FillType.WINDING);
                c1540g.c();
                c1540g.c();
                c1540g.f13167b = c1533d.f13124l;
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.c();
                c1540g.f13171f = true;
                c1540g.c();
                c1540g.f13169d = 1.0f;
                c1540g.f13171f = true;
                c1540g.c();
                c1540g.f13171f = true;
                c1540g.c();
                c1535b.e(i7, c1540g);
            } else if (abstractC1531B instanceof C1559z) {
                C1535b c1535b2 = new C1535b();
                C1559z c1559z2 = (C1559z) abstractC1531B;
                c1559z2.getClass();
                c1535b2.f13138k = "";
                c1535b2.c();
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13139l = 1.0f;
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13140m = 1.0f;
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13141n = true;
                c1535b2.c();
                c1535b2.f13133f = c1559z2.f13224k;
                c1535b2.f13134g = true;
                c1535b2.c();
                n(c1535b2, c1559z2);
                c1535b.e(i7, c1535b2);
            }
        }
    }

    public static int o(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0703b.g(i7, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static final void p(O.Z z7) {
        z7.setValue(C.a);
    }

    public static C1447z q(InterfaceC1444w interfaceC1444w) {
        l.f(LinkHeader.Parameters.Type, interfaceC1444w);
        return new C1447z(EnumC1413A.f12731k, interfaceC1444w);
    }

    public static final boolean r(g0.e eVar) {
        float fB = AbstractC0932a.b(eVar.f11665e);
        long j7 = eVar.f11665e;
        if (fB != AbstractC0932a.c(j7)) {
            return false;
        }
        float fB2 = AbstractC0932a.b(j7);
        long j8 = eVar.f11666f;
        if (fB2 != AbstractC0932a.b(j8) || AbstractC0932a.b(j7) != AbstractC0932a.c(j8)) {
            return false;
        }
        float fB3 = AbstractC0932a.b(j7);
        long j9 = eVar.f11667g;
        if (fB3 != AbstractC0932a.b(j9) || AbstractC0932a.b(j7) != AbstractC0932a.c(j9)) {
            return false;
        }
        float fB4 = AbstractC0932a.b(j7);
        long j10 = eVar.f11668h;
        return fB4 == AbstractC0932a.b(j10) && AbstractC0932a.b(j7) == AbstractC0932a.c(j10);
    }

    public static final q s(q qVar, InterfaceC2331l interfaceC2331l, C1904b c1904b, T0.k kVar, EnumC1903a0 enumC1903a0, boolean z7, C0510p c0510p, int i7) {
        if (!z7) {
            c0510p.R(-1890658823);
            c0510p.p(false);
            return qVar;
        }
        c0510p.R(-1890632411);
        boolean z8 = true;
        boolean z9 = ((((i7 & 112) ^ 48) > 32 && c0510p.f(interfaceC2331l)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && c0510p.f(c1904b)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && c0510p.g(false)) || (i7 & 3072) == 2048) | ((((57344 & i7) ^ 24576) > 16384 && c0510p.f(kVar)) || (i7 & 24576) == 16384);
        if ((((458752 & i7) ^ 196608) <= 131072 || !c0510p.f(enumC1903a0)) && (i7 & 196608) != 131072) {
            z8 = false;
        }
        boolean z10 = z9 | z8;
        Object objH = c0510p.H();
        if (z10 || objH == C0502l.a) {
            objH = new C2330k(interfaceC2331l, c1904b, kVar, enumC1903a0);
            c0510p.b0(objH);
        }
        q qVarK = qVar.k((C2330k) objH);
        c0510p.p(false);
        return qVarK;
    }

    public static H v(String str) {
        int i7;
        String strSubstring;
        l.f("statusLine", str);
        boolean zT = AbstractC2517v.T(str, "HTTP/1.", false);
        EnumC0888B enumC0888B = EnumC0888B.HTTP_1_0;
        if (zT) {
            i7 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                enumC0888B = EnumC0888B.HTTP_1_1;
            }
        } else {
            if (!AbstractC2517v.T(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i7 = 4;
        }
        int i8 = i7 + 3;
        if (str.length() < i8) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i7, i8);
            l.e("this as java.lang.String…ing(startIndex, endIndex)", strSubstring2);
            int i9 = Integer.parseInt(strSubstring2);
            if (str.length() <= i8) {
                strSubstring = "";
            } else {
                if (str.charAt(i8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i7 + 4);
                l.e("this as java.lang.String).substring(startIndex)", strSubstring);
            }
            return new H(enumC0888B, i9, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public abstract String h();

    public abstract List j(String str, List list);

    public abstract void t(Throwable th);

    public abstract void u(A2.b bVar);
}
